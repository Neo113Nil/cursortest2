package com.vk.media.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoMode.kt */
/* loaded from: classes3.dex */
public final class VideoMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoMode[] $VALUES;
    public static final VideoMode CHROMECAST;
    public static final VideoMode DLNA;
    public static final VideoMode EMPTY;
    public static final VideoMode FULLSCREEN;
    public static final VideoMode INVISIBLE;
    public static final VideoMode MINIMIZED;
    public static final VideoMode PIP;
    public static final VideoMode PREFETCH;
    public static final VideoMode SCREENCAST;
    private final String value;

    static {
        VideoMode videoMode = new VideoMode("PREFETCH", 0, "prefetch");
        PREFETCH = videoMode;
        VideoMode videoMode2 = new VideoMode("FULLSCREEN", 1, "fullscreen");
        FULLSCREEN = videoMode2;
        VideoMode videoMode3 = new VideoMode("PIP", 2, "pip");
        PIP = videoMode3;
        VideoMode videoMode4 = new VideoMode("CHROMECAST", 3, "chromecast");
        CHROMECAST = videoMode4;
        VideoMode videoMode5 = new VideoMode("DLNA", 4, "dlna");
        DLNA = videoMode5;
        VideoMode videoMode6 = new VideoMode("SCREENCAST", 5, "screencast");
        SCREENCAST = videoMode6;
        VideoMode videoMode7 = new VideoMode("INVISIBLE", 6, "invisible");
        INVISIBLE = videoMode7;
        VideoMode videoMode8 = new VideoMode("MINIMIZED", 7, "minimized");
        MINIMIZED = videoMode8;
        VideoMode videoMode9 = new VideoMode("EMPTY", 8, "");
        EMPTY = videoMode9;
        VideoMode[] videoModeArr = {videoMode, videoMode2, videoMode3, videoMode4, videoMode5, videoMode6, videoMode7, videoMode8, videoMode9};
        $VALUES = videoModeArr;
        $ENTRIES = new asp(videoModeArr);
    }

    public VideoMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoMode valueOf(String str) {
        return (VideoMode) Enum.valueOf(VideoMode.class, str);
    }

    public static VideoMode[] values() {
        return (VideoMode[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
