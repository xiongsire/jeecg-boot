package org.jeecg.config.oss;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration properties for OSS support.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "jeecg.oss")
public class OSSProperties {

	/**
	 * OSS type.
	 */
	private OSSType type;

	/**
	 * OSS Endpoint.
	 */
	private String endpoint;

	/**
	 * OSS Access key.
	 */
	private String accessKey;

	/**
	 * OSS Secret key.
	 */
	private String secretKey;

	/**
	 * OSS Bucket Name.
	 */
	private String bucketName;

	/**
	 * Additional OSS properties.
	 */
	private Map<String, String> properties = new HashMap<>();

}
