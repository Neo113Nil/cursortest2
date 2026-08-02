package com.vk.api.sdk.utils.log;

import kotlin.Lazy;
import xsna.asp;
import xsna.zrp;

/* compiled from: Logger.kt */
/* loaded from: classes.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Logger.kt */
    public static final class LogLevel {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel DEBUG;
        public static final LogLevel ERROR;
        public static final LogLevel NONE;
        public static final LogLevel VERBOSE;
        public static final LogLevel WARNING;
        private final int level;

        static {
            LogLevel logLevel = new LogLevel("VERBOSE", 0, 4);
            VERBOSE = logLevel;
            LogLevel logLevel2 = new LogLevel("DEBUG", 1, 3);
            DEBUG = logLevel2;
            LogLevel logLevel3 = new LogLevel("WARNING", 2, 2);
            WARNING = logLevel3;
            LogLevel logLevel4 = new LogLevel("ERROR", 3, 1);
            ERROR = logLevel4;
            LogLevel logLevel5 = new LogLevel("NONE", 4, 0);
            NONE = logLevel5;
            LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5};
            $VALUES = logLevelArr;
            $ENTRIES = new asp(logLevelArr);
        }

        public LogLevel(String str, int i, int i2) {
            this.level = i2;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }

        public final int h() {
            return this.level;
        }
    }

    void a(LogLevel logLevel, String str, Throwable th);

    Lazy<LogLevel> getLogLevel();
}
