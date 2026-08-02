package com.vk.libvideo.tracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlayerMode.kt */
/* loaded from: classes3.dex */
public final class VideoPlayerMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPlayerMode[] $VALUES;
    public static final VideoPlayerMode CHROMECAST;
    public static final VideoPlayerMode DISCOVERY;
    public static final VideoPlayerMode DLNA;
    public static final VideoPlayerMode FULLSCREEN_LANDSCAPE;
    public static final VideoPlayerMode FULLSCREEN_PORTRAIT;
    public static final VideoPlayerMode INVISIBLE;
    public static final VideoPlayerMode MINIMIZED;
    public static final VideoPlayerMode PIP_EXTERNAL;
    public static final VideoPlayerMode PIP_INTERNAL;
    public static final VideoPlayerMode PREVIEW;

    static {
        VideoPlayerMode videoPlayerMode = new VideoPlayerMode("PREVIEW", 0);
        PREVIEW = videoPlayerMode;
        VideoPlayerMode videoPlayerMode2 = new VideoPlayerMode("DISCOVERY", 1);
        DISCOVERY = videoPlayerMode2;
        VideoPlayerMode videoPlayerMode3 = new VideoPlayerMode("FULLSCREEN_PORTRAIT", 2);
        FULLSCREEN_PORTRAIT = videoPlayerMode3;
        VideoPlayerMode videoPlayerMode4 = new VideoPlayerMode("FULLSCREEN_LANDSCAPE", 3);
        FULLSCREEN_LANDSCAPE = videoPlayerMode4;
        VideoPlayerMode videoPlayerMode5 = new VideoPlayerMode("MINIMIZED", 4);
        MINIMIZED = videoPlayerMode5;
        VideoPlayerMode videoPlayerMode6 = new VideoPlayerMode("PIP_EXTERNAL", 5);
        PIP_EXTERNAL = videoPlayerMode6;
        VideoPlayerMode videoPlayerMode7 = new VideoPlayerMode("PIP_INTERNAL", 6);
        PIP_INTERNAL = videoPlayerMode7;
        VideoPlayerMode videoPlayerMode8 = new VideoPlayerMode("INVISIBLE", 7);
        INVISIBLE = videoPlayerMode8;
        VideoPlayerMode videoPlayerMode9 = new VideoPlayerMode("CHROMECAST", 8);
        CHROMECAST = videoPlayerMode9;
        VideoPlayerMode videoPlayerMode10 = new VideoPlayerMode("DLNA", 9);
        DLNA = videoPlayerMode10;
        VideoPlayerMode[] videoPlayerModeArr = {videoPlayerMode, videoPlayerMode2, videoPlayerMode3, videoPlayerMode4, videoPlayerMode5, videoPlayerMode6, videoPlayerMode7, videoPlayerMode8, videoPlayerMode9, videoPlayerMode10};
        $VALUES = videoPlayerModeArr;
        $ENTRIES = new asp(videoPlayerModeArr);
    }

    public VideoPlayerMode() {
        throw null;
    }

    public static VideoPlayerMode valueOf(String str) {
        return (VideoPlayerMode) Enum.valueOf(VideoPlayerMode.class, str);
    }

    public static VideoPlayerMode[] values() {
        return (VideoPlayerMode[]) $VALUES.clone();
    }
}
