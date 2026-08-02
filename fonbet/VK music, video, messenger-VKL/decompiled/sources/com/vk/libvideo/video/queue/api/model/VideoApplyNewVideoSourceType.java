package com.vk.libvideo.video.queue.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoApplyNewVideoSourceType.kt */
/* loaded from: classes3.dex */
public final class VideoApplyNewVideoSourceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoApplyNewVideoSourceType[] $VALUES;
    public static final VideoApplyNewVideoSourceType FromRecommendations;
    public static final VideoApplyNewVideoSourceType FromRelatedVideoDialog;
    public static final VideoApplyNewVideoSourceType Other;

    static {
        VideoApplyNewVideoSourceType videoApplyNewVideoSourceType = new VideoApplyNewVideoSourceType("FromRelatedVideoDialog", 0);
        FromRelatedVideoDialog = videoApplyNewVideoSourceType;
        VideoApplyNewVideoSourceType videoApplyNewVideoSourceType2 = new VideoApplyNewVideoSourceType("FromRecommendations", 1);
        FromRecommendations = videoApplyNewVideoSourceType2;
        VideoApplyNewVideoSourceType videoApplyNewVideoSourceType3 = new VideoApplyNewVideoSourceType("Other", 2);
        Other = videoApplyNewVideoSourceType3;
        VideoApplyNewVideoSourceType[] videoApplyNewVideoSourceTypeArr = {videoApplyNewVideoSourceType, videoApplyNewVideoSourceType2, videoApplyNewVideoSourceType3};
        $VALUES = videoApplyNewVideoSourceTypeArr;
        $ENTRIES = new asp(videoApplyNewVideoSourceTypeArr);
    }

    public VideoApplyNewVideoSourceType() {
        throw null;
    }

    public static VideoApplyNewVideoSourceType valueOf(String str) {
        return (VideoApplyNewVideoSourceType) Enum.valueOf(VideoApplyNewVideoSourceType.class, str);
    }

    public static VideoApplyNewVideoSourceType[] values() {
        return (VideoApplyNewVideoSourceType[]) $VALUES.clone();
    }
}
