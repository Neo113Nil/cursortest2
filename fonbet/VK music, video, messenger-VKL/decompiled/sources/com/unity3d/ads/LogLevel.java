package com.unity3d.ads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
/* loaded from: classes14.dex */
public final class LogLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final int level;
    public static final LogLevel DISABLED = new LogLevel("DISABLED", 0, 0);
    public static final LogLevel ERROR = new LogLevel("ERROR", 1, 1);
    public static final LogLevel INFO = new LogLevel("INFO", 2, 2);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 3, 3);
    public static final LogLevel TRACE = new LogLevel("TRACE", 4, 4);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{DISABLED, ERROR, INFO, DEBUG, TRACE};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private LogLevel(String str, int i, int i2) {
        this.level = i2;
    }

    public static zrp<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    public final int getLevel$unity_ads_defaultRelease() {
        return this.level;
    }
}
