package com.vk.dto.common;

import io.appmetrica.analytics.impl.L2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppState.kt */
/* loaded from: classes.dex */
public final class AppState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppState[] $VALUES;
    public static final AppState BACKGROUND;
    public static final AppState FOREGROUND;
    public static final AppState NOT_RUNNNIG;
    private final String value;

    static {
        AppState appState = new AppState("BACKGROUND", 0, L2.g);
        BACKGROUND = appState;
        AppState appState2 = new AppState("FOREGROUND", 1, "foreground");
        FOREGROUND = appState2;
        AppState appState3 = new AppState("NOT_RUNNNIG", 2, "not_running");
        NOT_RUNNNIG = appState3;
        AppState[] appStateArr = {appState, appState2, appState3};
        $VALUES = appStateArr;
        $ENTRIES = new asp(appStateArr);
    }

    public AppState(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
