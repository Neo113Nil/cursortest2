package com.vk.video.ui.discovery.minimizable.related_videos.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRelatedVideosPagingType.kt */
/* loaded from: classes7.dex */
public final class VideoRelatedVideosPagingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoRelatedVideosPagingType[] $VALUES;
    public static final VideoRelatedVideosPagingType Playlist;
    public static final VideoRelatedVideosPagingType VideoQueue;

    static {
        VideoRelatedVideosPagingType videoRelatedVideosPagingType = new VideoRelatedVideosPagingType("VideoQueue", 0);
        VideoQueue = videoRelatedVideosPagingType;
        VideoRelatedVideosPagingType videoRelatedVideosPagingType2 = new VideoRelatedVideosPagingType("Playlist", 1);
        Playlist = videoRelatedVideosPagingType2;
        VideoRelatedVideosPagingType[] videoRelatedVideosPagingTypeArr = {videoRelatedVideosPagingType, videoRelatedVideosPagingType2};
        $VALUES = videoRelatedVideosPagingTypeArr;
        $ENTRIES = new asp(videoRelatedVideosPagingTypeArr);
    }

    public VideoRelatedVideosPagingType() {
        throw null;
    }

    public static VideoRelatedVideosPagingType valueOf(String str) {
        return (VideoRelatedVideosPagingType) Enum.valueOf(VideoRelatedVideosPagingType.class, str);
    }

    public static VideoRelatedVideosPagingType[] values() {
        return (VideoRelatedVideosPagingType[]) $VALUES.clone();
    }
}
