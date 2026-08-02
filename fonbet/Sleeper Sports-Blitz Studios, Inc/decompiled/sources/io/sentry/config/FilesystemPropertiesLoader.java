package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* loaded from: classes9.dex */
final class FilesystemPropertiesLoader implements PropertiesLoader {
    private final String filePath;
    private boolean logNonExisting;
    private final ILogger logger;

    public FilesystemPropertiesLoader(String str, ILogger iLogger) {
        this(str, iLogger, true);
    }

    public FilesystemPropertiesLoader(String str, ILogger iLogger, boolean z) {
        this.filePath = str;
        this.logger = iLogger;
        this.logNonExisting = z;
    }

    @Override // io.sentry.config.PropertiesLoader
    public Properties load() {
        try {
            File file = new File(this.filePath.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (!file.isFile()) {
                if (this.logNonExisting) {
                    this.logger.log(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.filePath);
                }
            } else if (!file.canRead()) {
                this.logger.log(SentryLevel.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.filePath);
            }
            return null;
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed to load Sentry configuration from file: %s", this.filePath);
            return null;
        }
    }
}
