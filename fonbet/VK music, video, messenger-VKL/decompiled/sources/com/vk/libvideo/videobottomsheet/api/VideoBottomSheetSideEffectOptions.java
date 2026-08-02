package com.vk.libvideo.videobottomsheet.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoBottomSheetOptions.kt */
/* loaded from: classes3.dex */
public final class VideoBottomSheetSideEffectOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoBottomSheetSideEffectOptions[] $VALUES;
    public static final VideoBottomSheetSideEffectOptions ADD_AS_CLIP;
    public static final VideoBottomSheetSideEffectOptions CLIPS_AUTO_SUBTITLES;
    public static final VideoBottomSheetSideEffectOptions DELAY_CLIP_PUBLISHED_NOW;
    public static final VideoBottomSheetSideEffectOptions EDIT;
    public static final VideoBottomSheetSideEffectOptions EDIT_PRIVACY_CLIP;
    public static final VideoBottomSheetSideEffectOptions PIN;
    public static final VideoBottomSheetSideEffectOptions PIN_CLIP;
    public static final VideoBottomSheetSideEffectOptions PUBLICATION_DATE_CHANGED;
    public static final VideoBottomSheetSideEffectOptions REMOVE_FROM_ALBUM;
    public static final VideoBottomSheetSideEffectOptions REMOVE_FROM_DOWNLOADABLE;
    public static final VideoBottomSheetSideEffectOptions REMOVE_FROM_OWNER;
    public static final VideoBottomSheetSideEffectOptions SHARE;
    public static final VideoBottomSheetSideEffectOptions SHOW_STATISTIC;
    public static final VideoBottomSheetSideEffectOptions SUBSCRIBE;
    public static final VideoBottomSheetSideEffectOptions UNPIN;
    public static final VideoBottomSheetSideEffectOptions UNPIN_CLIP;
    public static final VideoBottomSheetSideEffectOptions UNSUBSCRIBE;

    static {
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions = new VideoBottomSheetSideEffectOptions("PIN", 0);
        PIN = videoBottomSheetSideEffectOptions;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions2 = new VideoBottomSheetSideEffectOptions("UNPIN", 1);
        UNPIN = videoBottomSheetSideEffectOptions2;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions3 = new VideoBottomSheetSideEffectOptions("PIN_CLIP", 2);
        PIN_CLIP = videoBottomSheetSideEffectOptions3;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions4 = new VideoBottomSheetSideEffectOptions("UNPIN_CLIP", 3);
        UNPIN_CLIP = videoBottomSheetSideEffectOptions4;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions5 = new VideoBottomSheetSideEffectOptions("REMOVE_FROM_OWNER", 4);
        REMOVE_FROM_OWNER = videoBottomSheetSideEffectOptions5;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions6 = new VideoBottomSheetSideEffectOptions("REMOVE_FROM_DOWNLOADABLE", 5);
        REMOVE_FROM_DOWNLOADABLE = videoBottomSheetSideEffectOptions6;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions7 = new VideoBottomSheetSideEffectOptions("REMOVE_FROM_ALBUM", 6);
        REMOVE_FROM_ALBUM = videoBottomSheetSideEffectOptions7;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions8 = new VideoBottomSheetSideEffectOptions("ADD_AS_CLIP", 7);
        ADD_AS_CLIP = videoBottomSheetSideEffectOptions8;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions9 = new VideoBottomSheetSideEffectOptions("EDIT", 8);
        EDIT = videoBottomSheetSideEffectOptions9;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions10 = new VideoBottomSheetSideEffectOptions("SHARE", 9);
        SHARE = videoBottomSheetSideEffectOptions10;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions11 = new VideoBottomSheetSideEffectOptions("SUBSCRIBE", 10);
        SUBSCRIBE = videoBottomSheetSideEffectOptions11;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions12 = new VideoBottomSheetSideEffectOptions("UNSUBSCRIBE", 11);
        UNSUBSCRIBE = videoBottomSheetSideEffectOptions12;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions13 = new VideoBottomSheetSideEffectOptions("DELAY_CLIP_PUBLISHED_NOW", 12);
        DELAY_CLIP_PUBLISHED_NOW = videoBottomSheetSideEffectOptions13;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions14 = new VideoBottomSheetSideEffectOptions("PUBLICATION_DATE_CHANGED", 13);
        PUBLICATION_DATE_CHANGED = videoBottomSheetSideEffectOptions14;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions15 = new VideoBottomSheetSideEffectOptions("SHOW_STATISTIC", 14);
        SHOW_STATISTIC = videoBottomSheetSideEffectOptions15;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions16 = new VideoBottomSheetSideEffectOptions("EDIT_PRIVACY_CLIP", 15);
        EDIT_PRIVACY_CLIP = videoBottomSheetSideEffectOptions16;
        VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions17 = new VideoBottomSheetSideEffectOptions("CLIPS_AUTO_SUBTITLES", 16);
        CLIPS_AUTO_SUBTITLES = videoBottomSheetSideEffectOptions17;
        VideoBottomSheetSideEffectOptions[] videoBottomSheetSideEffectOptionsArr = {videoBottomSheetSideEffectOptions, videoBottomSheetSideEffectOptions2, videoBottomSheetSideEffectOptions3, videoBottomSheetSideEffectOptions4, videoBottomSheetSideEffectOptions5, videoBottomSheetSideEffectOptions6, videoBottomSheetSideEffectOptions7, videoBottomSheetSideEffectOptions8, videoBottomSheetSideEffectOptions9, videoBottomSheetSideEffectOptions10, videoBottomSheetSideEffectOptions11, videoBottomSheetSideEffectOptions12, videoBottomSheetSideEffectOptions13, videoBottomSheetSideEffectOptions14, videoBottomSheetSideEffectOptions15, videoBottomSheetSideEffectOptions16, videoBottomSheetSideEffectOptions17};
        $VALUES = videoBottomSheetSideEffectOptionsArr;
        $ENTRIES = new asp(videoBottomSheetSideEffectOptionsArr);
    }

    public VideoBottomSheetSideEffectOptions() {
        throw null;
    }

    public static VideoBottomSheetSideEffectOptions valueOf(String str) {
        return (VideoBottomSheetSideEffectOptions) Enum.valueOf(VideoBottomSheetSideEffectOptions.class, str);
    }

    public static VideoBottomSheetSideEffectOptions[] values() {
        return (VideoBottomSheetSideEffectOptions[]) $VALUES.clone();
    }
}
