package com.vk.libvideo.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoViewControlsVisibilityHandler.kt */
/* loaded from: classes3.dex */
public final class ScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenMode[] $VALUES;
    public static final ScreenMode DISCOVERY;
    public static final ScreenMode HORIZONTAL_FULLSCREEN;
    public static final ScreenMode VERTICAL_FULLSCREEN;

    static {
        ScreenMode screenMode = new ScreenMode("DISCOVERY", 0);
        DISCOVERY = screenMode;
        ScreenMode screenMode2 = new ScreenMode("HORIZONTAL_FULLSCREEN", 1);
        HORIZONTAL_FULLSCREEN = screenMode2;
        ScreenMode screenMode3 = new ScreenMode("VERTICAL_FULLSCREEN", 2);
        VERTICAL_FULLSCREEN = screenMode3;
        ScreenMode[] screenModeArr = {screenMode, screenMode2, screenMode3};
        $VALUES = screenModeArr;
        $ENTRIES = new asp(screenModeArr);
    }

    public ScreenMode() {
        throw null;
    }

    public static ScreenMode valueOf(String str) {
        return (ScreenMode) Enum.valueOf(ScreenMode.class, str);
    }

    public static ScreenMode[] values() {
        return (ScreenMode[]) $VALUES.clone();
    }
}
