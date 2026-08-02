package com.vk.libvideo.video.queue.api.model.related;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRelatedVideosLoopMode.kt */
/* loaded from: classes3.dex */
public final class VideoRelatedVideosLoopMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoRelatedVideosLoopMode[] $VALUES;
    public static final VideoRelatedVideosLoopMode ALL_VIDEOS;
    public static final VideoRelatedVideosLoopMode DISABLED;
    public static final VideoRelatedVideosLoopMode SINGLE_VIDEO;

    static {
        VideoRelatedVideosLoopMode videoRelatedVideosLoopMode = new VideoRelatedVideosLoopMode("DISABLED", 0);
        DISABLED = videoRelatedVideosLoopMode;
        VideoRelatedVideosLoopMode videoRelatedVideosLoopMode2 = new VideoRelatedVideosLoopMode("ALL_VIDEOS", 1);
        ALL_VIDEOS = videoRelatedVideosLoopMode2;
        VideoRelatedVideosLoopMode videoRelatedVideosLoopMode3 = new VideoRelatedVideosLoopMode("SINGLE_VIDEO", 2);
        SINGLE_VIDEO = videoRelatedVideosLoopMode3;
        VideoRelatedVideosLoopMode[] videoRelatedVideosLoopModeArr = {videoRelatedVideosLoopMode, videoRelatedVideosLoopMode2, videoRelatedVideosLoopMode3};
        $VALUES = videoRelatedVideosLoopModeArr;
        $ENTRIES = new asp(videoRelatedVideosLoopModeArr);
    }

    public VideoRelatedVideosLoopMode() {
        throw null;
    }

    public static zrp<VideoRelatedVideosLoopMode> h() {
        return $ENTRIES;
    }

    public static VideoRelatedVideosLoopMode valueOf(String str) {
        return (VideoRelatedVideosLoopMode) Enum.valueOf(VideoRelatedVideosLoopMode.class, str);
    }

    public static VideoRelatedVideosLoopMode[] values() {
        return (VideoRelatedVideosLoopMode[]) $VALUES.clone();
    }
}
