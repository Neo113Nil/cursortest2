package com.vk.instantjobs.components.appstate;

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
    public static final AppState FOREGROUND_SERVICE;
    public static final AppState FOREGROUND_UI;
    public static final AppState IDLE;
    public static final AppState SUSPENDING;

    static {
        AppState appState = new AppState("FOREGROUND_UI", 0);
        FOREGROUND_UI = appState;
        AppState appState2 = new AppState("FOREGROUND_SERVICE", 1);
        FOREGROUND_SERVICE = appState2;
        AppState appState3 = new AppState("BACKGROUND", 2);
        BACKGROUND = appState3;
        AppState appState4 = new AppState("SUSPENDING", 3);
        SUSPENDING = appState4;
        AppState appState5 = new AppState("IDLE", 4);
        IDLE = appState5;
        AppState[] appStateArr = {appState, appState2, appState3, appState4, appState5};
        $VALUES = appStateArr;
        $ENTRIES = new asp(appStateArr);
    }

    public AppState() {
        throw null;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }
}
