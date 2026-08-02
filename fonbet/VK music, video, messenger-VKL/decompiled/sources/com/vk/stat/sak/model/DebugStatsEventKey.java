package com.vk.stat.sak.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DebugStatsEventKey.kt */
/* loaded from: classes11.dex */
public final class DebugStatsEventKey {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DebugStatsEventKey[] $VALUES;
    public static final DebugStatsEventKey ESDK_EXCHANGE_SILENT_TOKEN;
    public static final DebugStatsEventKey SUPERAPPKIT_AUTOLOGIN_START;
    public static final DebugStatsEventKey SUPERAPPKIT_CRASHES;
    public static final DebugStatsEventKey SUPERAPPKIT_INIT_TIME;
    public static final DebugStatsEventKey SUPERAPPKIT_SILENT_AUTH;
    public static final DebugStatsEventKey SUPERAPPKIT_WIDGET_PERF;
    private final String eventName;

    static {
        DebugStatsEventKey debugStatsEventKey = new DebugStatsEventKey("SUPERAPPKIT_CRASHES", 0, "superappkit_crashes");
        SUPERAPPKIT_CRASHES = debugStatsEventKey;
        DebugStatsEventKey debugStatsEventKey2 = new DebugStatsEventKey("SUPERAPPKIT_INIT_TIME", 1, "superappkit_init_time");
        SUPERAPPKIT_INIT_TIME = debugStatsEventKey2;
        DebugStatsEventKey debugStatsEventKey3 = new DebugStatsEventKey("SUPERAPPKIT_WIDGET_PERF", 2, "superappkit_widget_perf");
        SUPERAPPKIT_WIDGET_PERF = debugStatsEventKey3;
        DebugStatsEventKey debugStatsEventKey4 = new DebugStatsEventKey("SUPERAPPKIT_SILENT_AUTH", 3, "superappkit_silent_auth");
        SUPERAPPKIT_SILENT_AUTH = debugStatsEventKey4;
        DebugStatsEventKey debugStatsEventKey5 = new DebugStatsEventKey("SUPERAPPKIT_AUTOLOGIN_START", 4, "superappkit_autologin_start");
        SUPERAPPKIT_AUTOLOGIN_START = debugStatsEventKey5;
        DebugStatsEventKey debugStatsEventKey6 = new DebugStatsEventKey("ESDK_EXCHANGE_SILENT_TOKEN", 5, "esdk_exchange_silent_token");
        ESDK_EXCHANGE_SILENT_TOKEN = debugStatsEventKey6;
        DebugStatsEventKey[] debugStatsEventKeyArr = {debugStatsEventKey, debugStatsEventKey2, debugStatsEventKey3, debugStatsEventKey4, debugStatsEventKey5, debugStatsEventKey6};
        $VALUES = debugStatsEventKeyArr;
        $ENTRIES = new asp(debugStatsEventKeyArr);
    }

    public DebugStatsEventKey(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static DebugStatsEventKey valueOf(String str) {
        return (DebugStatsEventKey) Enum.valueOf(DebugStatsEventKey.class, str);
    }

    public static DebugStatsEventKey[] values() {
        return (DebugStatsEventKey[]) $VALUES.clone();
    }

    public final String h() {
        return this.eventName;
    }
}
