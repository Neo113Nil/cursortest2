package com.vk.media.player;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPlayerType.kt */
/* loaded from: classes3.dex */
public final class VideoPlayerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPlayerType[] $VALUES;
    public static final VideoPlayerType FULLSCREEN;
    public static final VideoPlayerType INLINE_PLAYER;
    public static final VideoPlayerType UNKNOWN;
    private final String value;

    static {
        VideoPlayerType videoPlayerType = new VideoPlayerType("FULLSCREEN", 0, "fullscreen");
        FULLSCREEN = videoPlayerType;
        VideoPlayerType videoPlayerType2 = new VideoPlayerType("INLINE_PLAYER", 1, "inline_player");
        INLINE_PLAYER = videoPlayerType2;
        VideoPlayerType videoPlayerType3 = new VideoPlayerType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
        UNKNOWN = videoPlayerType3;
        VideoPlayerType[] videoPlayerTypeArr = {videoPlayerType, videoPlayerType2, videoPlayerType3};
        $VALUES = videoPlayerTypeArr;
        $ENTRIES = new asp(videoPlayerTypeArr);
    }

    public VideoPlayerType(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoPlayerType valueOf(String str) {
        return (VideoPlayerType) Enum.valueOf(VideoPlayerType.class, str);
    }

    public static VideoPlayerType[] values() {
        return (VideoPlayerType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
