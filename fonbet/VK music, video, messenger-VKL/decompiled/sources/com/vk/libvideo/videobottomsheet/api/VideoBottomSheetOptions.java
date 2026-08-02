package com.vk.libvideo.videobottomsheet.api;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoBottomSheetOptions.kt */
/* loaded from: classes3.dex */
public final class VideoBottomSheetOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoBottomSheetOptions[] $VALUES;
    public static final VideoBottomSheetOptions ADD;
    public static final VideoBottomSheetOptions ADD_AS_CLIP;
    public static final VideoBottomSheetOptions ADD_TO_PLAYLIST;
    public static final VideoBottomSheetOptions ADVERTISER_INFO;
    public static final VideoBottomSheetOptions ATTACH;
    public static final VideoBottomSheetOptions ATTACH_CLIPS;
    public static final VideoBottomSheetOptions CANCEL_DOWNLOAD;
    public static final VideoBottomSheetOptions CLIPS_AUTO_SUBTITLES;
    public static final VideoBottomSheetOptions COPY_AD_MARKER;
    public static final VideoBottomSheetOptions COPY_LINK;
    public static final VideoBottomSheetOptions CREATE_CLIP_FROM_VIDEO;
    public static final VideoBottomSheetOptions DOWNLOAD;
    public static final VideoBottomSheetOptions EDIT;
    public static final VideoBottomSheetOptions EDIT_PRIVACY_CLIP;
    public static final VideoBottomSheetOptions EDIT_PUBLICATION_DATE;
    public static final VideoBottomSheetOptions FAVE;
    public static final VideoBottomSheetOptions FEEDBACK;
    public static final VideoBottomSheetOptions GO_TO_ARTIST;
    public static final VideoBottomSheetOptions HIDE_AUTHOR;
    public static final VideoBottomSheetOptions NOT_INTERESTED;
    public static final VideoBottomSheetOptions NOT_RECOMMEND_OWNER;
    public static final VideoBottomSheetOptions OPEN_AS_CLIP;
    public static final VideoBottomSheetOptions PAUSE_RESUME_DOWNLOAD;
    public static final VideoBottomSheetOptions PIN;
    public static final VideoBottomSheetOptions PIN_CLIP;
    public static final VideoBottomSheetOptions PUBLISH_NOW;
    public static final VideoBottomSheetOptions REMOVE;
    public static final VideoBottomSheetOptions REMOVE_DOWNLOAD;
    public static final VideoBottomSheetOptions REMOVE_FROM_COMMUNITY;
    public static final VideoBottomSheetOptions REMOVE_FROM_LIKED;
    public static final VideoBottomSheetOptions REMOVE_FROM_PLAYLIST;
    public static final VideoBottomSheetOptions REMOVE_FROM_PLAYLIST_COMMUNITY;
    public static final VideoBottomSheetOptions REMOVE_FROM_VIEW_HISTORY;
    public static final VideoBottomSheetOptions REPORT;
    public static final VideoBottomSheetOptions SAVE_TO_GALLERY;
    public static final VideoBottomSheetOptions SHARE;
    public static final VideoBottomSheetOptions SHOW_STATISTIC;
    public static final VideoBottomSheetOptions SUBSCRIBE;
    public static final VideoBottomSheetOptions UNFAVE;
    public static final VideoBottomSheetOptions UNPIN;
    public static final VideoBottomSheetOptions UNPIN_CLIP;
    public static final VideoBottomSheetOptions UNSUBSCRIBE;

    static {
        VideoBottomSheetOptions videoBottomSheetOptions = new VideoBottomSheetOptions("PIN", 0);
        PIN = videoBottomSheetOptions;
        VideoBottomSheetOptions videoBottomSheetOptions2 = new VideoBottomSheetOptions("UNPIN", 1);
        UNPIN = videoBottomSheetOptions2;
        VideoBottomSheetOptions videoBottomSheetOptions3 = new VideoBottomSheetOptions("SHOW_STATISTIC", 2);
        SHOW_STATISTIC = videoBottomSheetOptions3;
        VideoBottomSheetOptions videoBottomSheetOptions4 = new VideoBottomSheetOptions("PIN_CLIP", 3);
        PIN_CLIP = videoBottomSheetOptions4;
        VideoBottomSheetOptions videoBottomSheetOptions5 = new VideoBottomSheetOptions("UNPIN_CLIP", 4);
        UNPIN_CLIP = videoBottomSheetOptions5;
        VideoBottomSheetOptions videoBottomSheetOptions6 = new VideoBottomSheetOptions("ADD_AS_CLIP", 5);
        ADD_AS_CLIP = videoBottomSheetOptions6;
        VideoBottomSheetOptions videoBottomSheetOptions7 = new VideoBottomSheetOptions("OPEN_AS_CLIP", 6);
        OPEN_AS_CLIP = videoBottomSheetOptions7;
        VideoBottomSheetOptions videoBottomSheetOptions8 = new VideoBottomSheetOptions("FAVE", 7);
        FAVE = videoBottomSheetOptions8;
        VideoBottomSheetOptions videoBottomSheetOptions9 = new VideoBottomSheetOptions("UNFAVE", 8);
        UNFAVE = videoBottomSheetOptions9;
        VideoBottomSheetOptions videoBottomSheetOptions10 = new VideoBottomSheetOptions("DOWNLOAD", 9);
        DOWNLOAD = videoBottomSheetOptions10;
        VideoBottomSheetOptions videoBottomSheetOptions11 = new VideoBottomSheetOptions("SAVE_TO_GALLERY", 10);
        SAVE_TO_GALLERY = videoBottomSheetOptions11;
        VideoBottomSheetOptions videoBottomSheetOptions12 = new VideoBottomSheetOptions("GO_TO_ARTIST", 11);
        GO_TO_ARTIST = videoBottomSheetOptions12;
        VideoBottomSheetOptions videoBottomSheetOptions13 = new VideoBottomSheetOptions("ADD", 12);
        ADD = videoBottomSheetOptions13;
        VideoBottomSheetOptions videoBottomSheetOptions14 = new VideoBottomSheetOptions("ADD_TO_PLAYLIST", 13);
        ADD_TO_PLAYLIST = videoBottomSheetOptions14;
        VideoBottomSheetOptions videoBottomSheetOptions15 = new VideoBottomSheetOptions("PAUSE_RESUME_DOWNLOAD", 14);
        PAUSE_RESUME_DOWNLOAD = videoBottomSheetOptions15;
        VideoBottomSheetOptions videoBottomSheetOptions16 = new VideoBottomSheetOptions("CANCEL_DOWNLOAD", 15);
        CANCEL_DOWNLOAD = videoBottomSheetOptions16;
        VideoBottomSheetOptions videoBottomSheetOptions17 = new VideoBottomSheetOptions("ATTACH", 16);
        ATTACH = videoBottomSheetOptions17;
        VideoBottomSheetOptions videoBottomSheetOptions18 = new VideoBottomSheetOptions("COPY_LINK", 17);
        COPY_LINK = videoBottomSheetOptions18;
        VideoBottomSheetOptions videoBottomSheetOptions19 = new VideoBottomSheetOptions("CREATE_CLIP_FROM_VIDEO", 18);
        CREATE_CLIP_FROM_VIDEO = videoBottomSheetOptions19;
        VideoBottomSheetOptions videoBottomSheetOptions20 = new VideoBottomSheetOptions("ATTACH_CLIPS", 19);
        ATTACH_CLIPS = videoBottomSheetOptions20;
        VideoBottomSheetOptions videoBottomSheetOptions21 = new VideoBottomSheetOptions("EDIT", 20);
        EDIT = videoBottomSheetOptions21;
        VideoBottomSheetOptions videoBottomSheetOptions22 = new VideoBottomSheetOptions("PUBLISH_NOW", 21);
        PUBLISH_NOW = videoBottomSheetOptions22;
        VideoBottomSheetOptions videoBottomSheetOptions23 = new VideoBottomSheetOptions("EDIT_PUBLICATION_DATE", 22);
        EDIT_PUBLICATION_DATE = videoBottomSheetOptions23;
        VideoBottomSheetOptions videoBottomSheetOptions24 = new VideoBottomSheetOptions("SHARE", 23);
        SHARE = videoBottomSheetOptions24;
        VideoBottomSheetOptions videoBottomSheetOptions25 = new VideoBottomSheetOptions("NOT_INTERESTED", 24);
        NOT_INTERESTED = videoBottomSheetOptions25;
        VideoBottomSheetOptions videoBottomSheetOptions26 = new VideoBottomSheetOptions("NOT_RECOMMEND_OWNER", 25);
        NOT_RECOMMEND_OWNER = videoBottomSheetOptions26;
        VideoBottomSheetOptions videoBottomSheetOptions27 = new VideoBottomSheetOptions("HIDE_AUTHOR", 26);
        HIDE_AUTHOR = videoBottomSheetOptions27;
        VideoBottomSheetOptions videoBottomSheetOptions28 = new VideoBottomSheetOptions("ADVERTISER_INFO", 27);
        ADVERTISER_INFO = videoBottomSheetOptions28;
        VideoBottomSheetOptions videoBottomSheetOptions29 = new VideoBottomSheetOptions("COPY_AD_MARKER", 28);
        COPY_AD_MARKER = videoBottomSheetOptions29;
        VideoBottomSheetOptions videoBottomSheetOptions30 = new VideoBottomSheetOptions("FEEDBACK", 29);
        FEEDBACK = videoBottomSheetOptions30;
        VideoBottomSheetOptions videoBottomSheetOptions31 = new VideoBottomSheetOptions("REPORT", 30);
        REPORT = videoBottomSheetOptions31;
        VideoBottomSheetOptions videoBottomSheetOptions32 = new VideoBottomSheetOptions("EDIT_PRIVACY_CLIP", 31);
        EDIT_PRIVACY_CLIP = videoBottomSheetOptions32;
        VideoBottomSheetOptions videoBottomSheetOptions33 = new VideoBottomSheetOptions("CLIPS_AUTO_SUBTITLES", 32);
        CLIPS_AUTO_SUBTITLES = videoBottomSheetOptions33;
        VideoBottomSheetOptions videoBottomSheetOptions34 = new VideoBottomSheetOptions("REMOVE_DOWNLOAD", 33);
        REMOVE_DOWNLOAD = videoBottomSheetOptions34;
        VideoBottomSheetOptions videoBottomSheetOptions35 = new VideoBottomSheetOptions("REMOVE_FROM_PLAYLIST", 34);
        REMOVE_FROM_PLAYLIST = videoBottomSheetOptions35;
        VideoBottomSheetOptions videoBottomSheetOptions36 = new VideoBottomSheetOptions("REMOVE_FROM_PLAYLIST_COMMUNITY", 35);
        REMOVE_FROM_PLAYLIST_COMMUNITY = videoBottomSheetOptions36;
        VideoBottomSheetOptions videoBottomSheetOptions37 = new VideoBottomSheetOptions("REMOVE_FROM_COMMUNITY", 36);
        REMOVE_FROM_COMMUNITY = videoBottomSheetOptions37;
        VideoBottomSheetOptions videoBottomSheetOptions38 = new VideoBottomSheetOptions("REMOVE_FROM_VIEW_HISTORY", 37);
        REMOVE_FROM_VIEW_HISTORY = videoBottomSheetOptions38;
        VideoBottomSheetOptions videoBottomSheetOptions39 = new VideoBottomSheetOptions("REMOVE_FROM_LIKED", 38);
        REMOVE_FROM_LIKED = videoBottomSheetOptions39;
        VideoBottomSheetOptions videoBottomSheetOptions40 = new VideoBottomSheetOptions(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 39);
        REMOVE = videoBottomSheetOptions40;
        VideoBottomSheetOptions videoBottomSheetOptions41 = new VideoBottomSheetOptions("SUBSCRIBE", 40);
        SUBSCRIBE = videoBottomSheetOptions41;
        VideoBottomSheetOptions videoBottomSheetOptions42 = new VideoBottomSheetOptions("UNSUBSCRIBE", 41);
        UNSUBSCRIBE = videoBottomSheetOptions42;
        VideoBottomSheetOptions[] videoBottomSheetOptionsArr = {videoBottomSheetOptions, videoBottomSheetOptions2, videoBottomSheetOptions3, videoBottomSheetOptions4, videoBottomSheetOptions5, videoBottomSheetOptions6, videoBottomSheetOptions7, videoBottomSheetOptions8, videoBottomSheetOptions9, videoBottomSheetOptions10, videoBottomSheetOptions11, videoBottomSheetOptions12, videoBottomSheetOptions13, videoBottomSheetOptions14, videoBottomSheetOptions15, videoBottomSheetOptions16, videoBottomSheetOptions17, videoBottomSheetOptions18, videoBottomSheetOptions19, videoBottomSheetOptions20, videoBottomSheetOptions21, videoBottomSheetOptions22, videoBottomSheetOptions23, videoBottomSheetOptions24, videoBottomSheetOptions25, videoBottomSheetOptions26, videoBottomSheetOptions27, videoBottomSheetOptions28, videoBottomSheetOptions29, videoBottomSheetOptions30, videoBottomSheetOptions31, videoBottomSheetOptions32, videoBottomSheetOptions33, videoBottomSheetOptions34, videoBottomSheetOptions35, videoBottomSheetOptions36, videoBottomSheetOptions37, videoBottomSheetOptions38, videoBottomSheetOptions39, videoBottomSheetOptions40, videoBottomSheetOptions41, videoBottomSheetOptions42};
        $VALUES = videoBottomSheetOptionsArr;
        $ENTRIES = new asp(videoBottomSheetOptionsArr);
    }

    public VideoBottomSheetOptions() {
        throw null;
    }

    public static VideoBottomSheetOptions valueOf(String str) {
        return (VideoBottomSheetOptions) Enum.valueOf(VideoBottomSheetOptions.class, str);
    }

    public static VideoBottomSheetOptions[] values() {
        return (VideoBottomSheetOptions[]) $VALUES.clone();
    }
}
