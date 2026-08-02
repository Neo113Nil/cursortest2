package com.vk.pushes.stat;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStateOnChange.kt */
/* loaded from: classes5.dex */
public final class AppStateOnChange {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStateOnChange[] $VALUES;
    public static final AppStateOnChange BACKGROUND;
    public static final AppStateOnChange FOREGROUND;
    public static final AppStateOnChange NOT_RUNNING;

    static {
        AppStateOnChange appStateOnChange = new AppStateOnChange("NOT_RUNNING", 0);
        NOT_RUNNING = appStateOnChange;
        AppStateOnChange appStateOnChange2 = new AppStateOnChange("BACKGROUND", 1);
        BACKGROUND = appStateOnChange2;
        AppStateOnChange appStateOnChange3 = new AppStateOnChange("FOREGROUND", 2);
        FOREGROUND = appStateOnChange3;
        AppStateOnChange[] appStateOnChangeArr = {appStateOnChange, appStateOnChange2, appStateOnChange3};
        $VALUES = appStateOnChangeArr;
        $ENTRIES = new asp(appStateOnChangeArr);
    }

    public AppStateOnChange() {
        throw null;
    }

    public static AppStateOnChange valueOf(String str) {
        return (AppStateOnChange) Enum.valueOf(AppStateOnChange.class, str);
    }

    public static AppStateOnChange[] values() {
        return (AppStateOnChange[]) $VALUES.clone();
    }
}
