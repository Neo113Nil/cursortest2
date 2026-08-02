package com.vk.libvideo.video.queue.api.model.recommendations;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRecommendationVideosType.kt */
/* loaded from: classes3.dex */
public final class VideoRecommendationVideosType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoRecommendationVideosType[] $VALUES;
    public static final VideoRecommendationVideosType MUSIC_MIX;
    public static final VideoRecommendationVideosType OFFLINE;
    public static final VideoRecommendationVideosType SIMILAR_MUSIC;
    public static final VideoRecommendationVideosType SIMILAR_VIDEOS;

    static {
        VideoRecommendationVideosType videoRecommendationVideosType = new VideoRecommendationVideosType("SIMILAR_VIDEOS", 0);
        SIMILAR_VIDEOS = videoRecommendationVideosType;
        VideoRecommendationVideosType videoRecommendationVideosType2 = new VideoRecommendationVideosType("SIMILAR_MUSIC", 1);
        SIMILAR_MUSIC = videoRecommendationVideosType2;
        VideoRecommendationVideosType videoRecommendationVideosType3 = new VideoRecommendationVideosType("OFFLINE", 2);
        OFFLINE = videoRecommendationVideosType3;
        VideoRecommendationVideosType videoRecommendationVideosType4 = new VideoRecommendationVideosType("MUSIC_MIX", 3);
        MUSIC_MIX = videoRecommendationVideosType4;
        VideoRecommendationVideosType[] videoRecommendationVideosTypeArr = {videoRecommendationVideosType, videoRecommendationVideosType2, videoRecommendationVideosType3, videoRecommendationVideosType4};
        $VALUES = videoRecommendationVideosTypeArr;
        $ENTRIES = new asp(videoRecommendationVideosTypeArr);
    }

    public VideoRecommendationVideosType() {
        throw null;
    }

    public static VideoRecommendationVideosType valueOf(String str) {
        return (VideoRecommendationVideosType) Enum.valueOf(VideoRecommendationVideosType.class, str);
    }

    public static VideoRecommendationVideosType[] values() {
        return (VideoRecommendationVideosType[]) $VALUES.clone();
    }
}
