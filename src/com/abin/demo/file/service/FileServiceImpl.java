package com.abin.demo.file.service;

import java.io.File;

import org.bng.core.file.FileProcessor;
import org.bng.core.util.ConfigUtils;

public class FileServiceImpl implements FileService {
	
	@Override
	public void uploadFile(File srcFile, String targetFileName) {
		String filePath = ConfigUtils.getString("file.dir");
		
		FileProcessor fp = new FileProcessor();
		fp.readFileForSize(srcFile, new File(filePath + File.separator + targetFileName));
		
	}

}
