package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StartupBackoffMode.kt */
/* loaded from: classes11.dex */
public final class StartupBackoffMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StartupBackoffMode[] $VALUES;
    public static final a Companion;
    public static final StartupBackoffMode DEFAULT;
    public static final StartupBackoffMode DO_NOT_WAIT;
    public static final StartupBackoffMode WAIT_REQUESTS;
    public static final StartupBackoffMode WAIT_RESPONSES;

    /* compiled from: StartupBackoffMode.kt */
    public static final class a {
    }

    static {
        StartupBackoffMode startupBackoffMode = new StartupBackoffMode("DEFAULT", 0);
        DEFAULT = startupBackoffMode;
        StartupBackoffMode startupBackoffMode2 = new StartupBackoffMode("DO_NOT_WAIT", 1);
        DO_NOT_WAIT = startupBackoffMode2;
        StartupBackoffMode startupBackoffMode3 = new StartupBackoffMode("WAIT_REQUESTS", 2);
        WAIT_REQUESTS = startupBackoffMode3;
        StartupBackoffMode startupBackoffMode4 = new StartupBackoffMode("WAIT_RESPONSES", 3);
        WAIT_RESPONSES = startupBackoffMode4;
        StartupBackoffMode[] startupBackoffModeArr = {startupBackoffMode, startupBackoffMode2, startupBackoffMode3, startupBackoffMode4};
        $VALUES = startupBackoffModeArr;
        $ENTRIES = new asp(startupBackoffModeArr);
        Companion = new a();
    }

    public StartupBackoffMode() {
        throw null;
    }

    public static StartupBackoffMode valueOf(String str) {
        return (StartupBackoffMode) Enum.valueOf(StartupBackoffMode.class, str);
    }

    public static StartupBackoffMode[] values() {
        return (StartupBackoffMode[]) $VALUES.clone();
    }
}
