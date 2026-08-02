package com.vk.dto.video;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAlbumType.kt */
/* loaded from: classes18.dex */
public final class VideoAlbumType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAlbumType[] $VALUES;
    public static final a Companion;
    public static final VideoAlbumType Season;
    public static final VideoAlbumType Serial;
    public static final VideoAlbumType SimplePlaylist;
    private final int value;

    /* compiled from: VideoAlbumType.kt */
    public static final class a {
    }

    static {
        VideoAlbumType videoAlbumType = new VideoAlbumType("SimplePlaylist", 0, 0);
        SimplePlaylist = videoAlbumType;
        VideoAlbumType videoAlbumType2 = new VideoAlbumType("Serial", 1, 1);
        Serial = videoAlbumType2;
        VideoAlbumType videoAlbumType3 = new VideoAlbumType("Season", 2, 2);
        Season = videoAlbumType3;
        VideoAlbumType[] videoAlbumTypeArr = {videoAlbumType, videoAlbumType2, videoAlbumType3};
        $VALUES = videoAlbumTypeArr;
        $ENTRIES = new asp(videoAlbumTypeArr);
        Companion = new a();
    }

    public VideoAlbumType(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<VideoAlbumType> h() {
        return $ENTRIES;
    }

    public static VideoAlbumType valueOf(String str) {
        return (VideoAlbumType) Enum.valueOf(VideoAlbumType.class, str);
    }

    public static VideoAlbumType[] values() {
        return (VideoAlbumType[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
