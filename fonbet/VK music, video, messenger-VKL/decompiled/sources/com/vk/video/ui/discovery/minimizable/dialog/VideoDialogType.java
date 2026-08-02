package com.vk.video.ui.discovery.minimizable.dialog;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoDialogType.kt */
/* loaded from: classes7.dex */
public final class VideoDialogType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoDialogType[] $VALUES;
    public static final VideoDialogType About;
    public static final VideoDialogType Comments;
    public static final VideoDialogType CommentsThread;
    public static final VideoDialogType Episodes;
    public static final VideoDialogType RelatedVideos;
    private final String tag;

    static {
        VideoDialogType videoDialogType = new VideoDialogType("About", 0, "fragment_about");
        About = videoDialogType;
        VideoDialogType videoDialogType2 = new VideoDialogType("Episodes", 1, "fragment_episodes");
        Episodes = videoDialogType2;
        VideoDialogType videoDialogType3 = new VideoDialogType("Comments", 2, "fragment_comments");
        Comments = videoDialogType3;
        VideoDialogType videoDialogType4 = new VideoDialogType("CommentsThread", 3, "fragment_comments_thread");
        CommentsThread = videoDialogType4;
        VideoDialogType videoDialogType5 = new VideoDialogType("RelatedVideos", 4, "fragment_related_videos");
        RelatedVideos = videoDialogType5;
        VideoDialogType[] videoDialogTypeArr = {videoDialogType, videoDialogType2, videoDialogType3, videoDialogType4, videoDialogType5};
        $VALUES = videoDialogTypeArr;
        $ENTRIES = new asp(videoDialogTypeArr);
    }

    public VideoDialogType(String str, int i, String str2) {
        this.tag = str2;
    }

    public static zrp<VideoDialogType> h() {
        return $ENTRIES;
    }

    public static VideoDialogType valueOf(String str) {
        return (VideoDialogType) Enum.valueOf(VideoDialogType.class, str);
    }

    public static VideoDialogType[] values() {
        return (VideoDialogType[]) $VALUES.clone();
    }

    public final String i() {
        return this.tag;
    }
}
