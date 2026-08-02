package com.vk.superapp.browser.ui.callback;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnScreenStateChangeCallback.kt */
/* loaded from: classes6.dex */
public final class ScreenState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenState[] $VALUES;
    public static final ScreenState BACKGROUND;
    public static final ScreenState CLOSED;
    public static final ScreenState FOREGROUND;

    static {
        ScreenState screenState = new ScreenState("BACKGROUND", 0);
        BACKGROUND = screenState;
        ScreenState screenState2 = new ScreenState("FOREGROUND", 1);
        FOREGROUND = screenState2;
        ScreenState screenState3 = new ScreenState("CLOSED", 2);
        CLOSED = screenState3;
        ScreenState[] screenStateArr = {screenState, screenState2, screenState3};
        $VALUES = screenStateArr;
        $ENTRIES = new asp(screenStateArr);
    }

    public ScreenState() {
        throw null;
    }

    public static ScreenState valueOf(String str) {
        return (ScreenState) Enum.valueOf(ScreenState.class, str);
    }

    public static ScreenState[] values() {
        return (ScreenState[]) $VALUES.clone();
    }
}
