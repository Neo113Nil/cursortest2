package com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.payload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRelatedVideoItemChangePayload.kt */
/* loaded from: classes7.dex */
public final class VideoRelatedVideoItemChangePayload {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoRelatedVideoItemChangePayload[] $VALUES;
    public static final VideoRelatedVideoItemChangePayload IsCurrent;

    static {
        VideoRelatedVideoItemChangePayload videoRelatedVideoItemChangePayload = new VideoRelatedVideoItemChangePayload("IsCurrent", 0);
        IsCurrent = videoRelatedVideoItemChangePayload;
        VideoRelatedVideoItemChangePayload[] videoRelatedVideoItemChangePayloadArr = {videoRelatedVideoItemChangePayload};
        $VALUES = videoRelatedVideoItemChangePayloadArr;
        $ENTRIES = new asp(videoRelatedVideoItemChangePayloadArr);
    }

    public VideoRelatedVideoItemChangePayload() {
        throw null;
    }

    public static VideoRelatedVideoItemChangePayload valueOf(String str) {
        return (VideoRelatedVideoItemChangePayload) Enum.valueOf(VideoRelatedVideoItemChangePayload.class, str);
    }

    public static VideoRelatedVideoItemChangePayload[] values() {
        return (VideoRelatedVideoItemChangePayload[]) $VALUES.clone();
    }
}
