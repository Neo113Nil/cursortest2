package com.vk.libvideo.api.seek.tracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSeekEventScreenMode.kt */
/* loaded from: classes2.dex */
public final class VideoSeekEventScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSeekEventScreenMode[] $VALUES;
    public static final VideoSeekEventScreenMode Discovery;
    public static final VideoSeekEventScreenMode Fullscreen;
    public static final VideoSeekEventScreenMode FullscreenLandscape;
    public static final VideoSeekEventScreenMode FullscreenPortrait;
    public static final VideoSeekEventScreenMode Invisible;
    public static final VideoSeekEventScreenMode Preview;

    static {
        VideoSeekEventScreenMode videoSeekEventScreenMode = new VideoSeekEventScreenMode("Preview", 0);
        Preview = videoSeekEventScreenMode;
        VideoSeekEventScreenMode videoSeekEventScreenMode2 = new VideoSeekEventScreenMode("Discovery", 1);
        Discovery = videoSeekEventScreenMode2;
        VideoSeekEventScreenMode videoSeekEventScreenMode3 = new VideoSeekEventScreenMode("Fullscreen", 2);
        Fullscreen = videoSeekEventScreenMode3;
        VideoSeekEventScreenMode videoSeekEventScreenMode4 = new VideoSeekEventScreenMode("FullscreenPortrait", 3);
        FullscreenPortrait = videoSeekEventScreenMode4;
        VideoSeekEventScreenMode videoSeekEventScreenMode5 = new VideoSeekEventScreenMode("FullscreenLandscape", 4);
        FullscreenLandscape = videoSeekEventScreenMode5;
        VideoSeekEventScreenMode videoSeekEventScreenMode6 = new VideoSeekEventScreenMode("Invisible", 5);
        Invisible = videoSeekEventScreenMode6;
        VideoSeekEventScreenMode[] videoSeekEventScreenModeArr = {videoSeekEventScreenMode, videoSeekEventScreenMode2, videoSeekEventScreenMode3, videoSeekEventScreenMode4, videoSeekEventScreenMode5, videoSeekEventScreenMode6};
        $VALUES = videoSeekEventScreenModeArr;
        $ENTRIES = new asp(videoSeekEventScreenModeArr);
    }

    public VideoSeekEventScreenMode() {
        throw null;
    }

    public static VideoSeekEventScreenMode valueOf(String str) {
        return (VideoSeekEventScreenMode) Enum.valueOf(VideoSeekEventScreenMode.class, str);
    }

    public static VideoSeekEventScreenMode[] values() {
        return (VideoSeekEventScreenMode[]) $VALUES.clone();
    }
}
