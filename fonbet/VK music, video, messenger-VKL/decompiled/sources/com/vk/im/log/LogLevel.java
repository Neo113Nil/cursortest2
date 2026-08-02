package com.vk.im.log;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
/* loaded from: classes.dex */
public final class LogLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel DEBUG;
    public static final LogLevel ERROR;
    public static final LogLevel NONE;
    public static final LogLevel VERBOSE;
    public static final LogLevel WARNING;

    static {
        LogLevel logLevel = new LogLevel("VERBOSE", 0);
        VERBOSE = logLevel;
        LogLevel logLevel2 = new LogLevel("DEBUG", 1);
        DEBUG = logLevel2;
        LogLevel logLevel3 = new LogLevel("WARNING", 2);
        WARNING = logLevel3;
        LogLevel logLevel4 = new LogLevel("ERROR", 3);
        ERROR = logLevel4;
        LogLevel logLevel5 = new LogLevel("NONE", 4);
        NONE = logLevel5;
        LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5};
        $VALUES = logLevelArr;
        $ENTRIES = new asp(logLevelArr);
    }

    public LogLevel() {
        throw null;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
