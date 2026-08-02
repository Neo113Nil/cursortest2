package com.vk.log;

import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggerOutputTarget.kt */
/* loaded from: classes.dex */
public final class LoggerOutputTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoggerOutputTarget[] $VALUES;
    public static final LoggerOutputTarget CONSOLE;
    public static final a Companion;
    public static final LoggerOutputTarget EXTERNAL;
    public static final LoggerOutputTarget LOGCAT;
    public static final LoggerOutputTarget NONE;
    public static final LoggerOutputTarget RING_FILE;

    /* compiled from: LoggerOutputTarget.kt */
    public static final class a {
        public static boolean a(List list, LoggerOutputTarget loggerOutputTarget) {
            Object obj;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((LoggerOutputTarget) obj) == loggerOutputTarget) {
                    break;
                }
            }
            return obj != null;
        }
    }

    static {
        LoggerOutputTarget loggerOutputTarget = new LoggerOutputTarget("NONE", 0);
        NONE = loggerOutputTarget;
        LoggerOutputTarget loggerOutputTarget2 = new LoggerOutputTarget("CONSOLE", 1);
        CONSOLE = loggerOutputTarget2;
        LoggerOutputTarget loggerOutputTarget3 = new LoggerOutputTarget("LOGCAT", 2);
        LOGCAT = loggerOutputTarget3;
        LoggerOutputTarget loggerOutputTarget4 = new LoggerOutputTarget("RING_FILE", 3);
        RING_FILE = loggerOutputTarget4;
        LoggerOutputTarget loggerOutputTarget5 = new LoggerOutputTarget("EXTERNAL", 4);
        EXTERNAL = loggerOutputTarget5;
        LoggerOutputTarget[] loggerOutputTargetArr = {loggerOutputTarget, loggerOutputTarget2, loggerOutputTarget3, loggerOutputTarget4, loggerOutputTarget5};
        $VALUES = loggerOutputTargetArr;
        $ENTRIES = new asp(loggerOutputTargetArr);
        Companion = new a();
    }

    public LoggerOutputTarget() {
        throw null;
    }

    public static LoggerOutputTarget valueOf(String str) {
        return (LoggerOutputTarget) Enum.valueOf(LoggerOutputTarget.class, str);
    }

    public static LoggerOutputTarget[] values() {
        return (LoggerOutputTarget[]) $VALUES.clone();
    }
}
