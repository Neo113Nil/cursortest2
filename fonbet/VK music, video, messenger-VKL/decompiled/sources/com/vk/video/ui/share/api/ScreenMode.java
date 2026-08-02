package com.vk.video.ui.share.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoShareArguments.kt */
/* loaded from: classes7.dex */
public final class ScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenMode[] $VALUES;
    public static final ScreenMode DISCOVERY;
    public static final ScreenMode FULLSCREEN_LANDSCAPE;
    public static final ScreenMode FULLSCREEN_PORTRAIT;
    public static final ScreenMode PREVIEW;

    static {
        ScreenMode screenMode = new ScreenMode("DISCOVERY", 0);
        DISCOVERY = screenMode;
        ScreenMode screenMode2 = new ScreenMode("FULLSCREEN_PORTRAIT", 1);
        FULLSCREEN_PORTRAIT = screenMode2;
        ScreenMode screenMode3 = new ScreenMode("FULLSCREEN_LANDSCAPE", 2);
        FULLSCREEN_LANDSCAPE = screenMode3;
        ScreenMode screenMode4 = new ScreenMode("PREVIEW", 3);
        PREVIEW = screenMode4;
        ScreenMode[] screenModeArr = {screenMode, screenMode2, screenMode3, screenMode4};
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
