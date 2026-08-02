package com.vk.libvideo.models.offline;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoScreenMode.kt */
/* loaded from: classes3.dex */
public final class VideoScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoScreenMode[] $VALUES;
    public static final VideoScreenMode DISCOVERY;
    public static final VideoScreenMode FULLSCREEN_LANDSCAPE;
    public static final VideoScreenMode FULLSCREEN_PORTRAIT;
    public static final VideoScreenMode INVISIBLE;
    public static final VideoScreenMode PREVIEW;

    static {
        VideoScreenMode videoScreenMode = new VideoScreenMode("DISCOVERY", 0);
        DISCOVERY = videoScreenMode;
        VideoScreenMode videoScreenMode2 = new VideoScreenMode("FULLSCREEN_LANDSCAPE", 1);
        FULLSCREEN_LANDSCAPE = videoScreenMode2;
        VideoScreenMode videoScreenMode3 = new VideoScreenMode("FULLSCREEN_PORTRAIT", 2);
        FULLSCREEN_PORTRAIT = videoScreenMode3;
        VideoScreenMode videoScreenMode4 = new VideoScreenMode("PREVIEW", 3);
        PREVIEW = videoScreenMode4;
        VideoScreenMode videoScreenMode5 = new VideoScreenMode("INVISIBLE", 4);
        INVISIBLE = videoScreenMode5;
        VideoScreenMode[] videoScreenModeArr = {videoScreenMode, videoScreenMode2, videoScreenMode3, videoScreenMode4, videoScreenMode5};
        $VALUES = videoScreenModeArr;
        $ENTRIES = new asp(videoScreenModeArr);
    }

    public VideoScreenMode() {
        throw null;
    }

    public static VideoScreenMode valueOf(String str) {
        return (VideoScreenMode) Enum.valueOf(VideoScreenMode.class, str);
    }

    public static VideoScreenMode[] values() {
        return (VideoScreenMode[]) $VALUES.clone();
    }
}
