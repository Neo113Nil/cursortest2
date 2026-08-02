package com.vk.libvideo.ui.video2;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class ScreenState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenState[] $VALUES;
    public static final ScreenState FULLSCREEN_HORIZONTAL;
    public static final ScreenState FULLSCREEN_VERTICAL;
    public static final ScreenState INLINE;
    public static final ScreenState MINI;
    public static final ScreenState PIP;

    static {
        ScreenState screenState = new ScreenState("INLINE", 0);
        INLINE = screenState;
        ScreenState screenState2 = new ScreenState("FULLSCREEN_VERTICAL", 1);
        FULLSCREEN_VERTICAL = screenState2;
        ScreenState screenState3 = new ScreenState("FULLSCREEN_HORIZONTAL", 2);
        FULLSCREEN_HORIZONTAL = screenState3;
        ScreenState screenState4 = new ScreenState("MINI", 3);
        MINI = screenState4;
        ScreenState screenState5 = new ScreenState("PIP", 4);
        PIP = screenState5;
        ScreenState[] screenStateArr = {screenState, screenState2, screenState3, screenState4, screenState5};
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
