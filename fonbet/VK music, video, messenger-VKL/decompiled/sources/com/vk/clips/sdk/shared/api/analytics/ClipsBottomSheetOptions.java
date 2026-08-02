package com.vk.clips.sdk.shared.api.analytics;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsBottomSheetOptions.kt */
/* loaded from: classes17.dex */
public final class ClipsBottomSheetOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsBottomSheetOptions[] $VALUES;
    public static final ClipsBottomSheetOptions ADD_TO_FAVORITES;
    public static final ClipsBottomSheetOptions ADD_TO_PLAYLIST;
    public static final ClipsBottomSheetOptions ADVERTISER_INFO;
    public static final ClipsBottomSheetOptions ARCHIVE_RESTORE;
    public static final ClipsBottomSheetOptions BUGREPORT;
    public static final ClipsBottomSheetOptions CANCEL;
    public static final ClipsBottomSheetOptions CLIPS_AUTO_SCROLL;
    public static final ClipsBottomSheetOptions CLIPS_AUTO_SUBTITLES;
    public static final ClipsBottomSheetOptions CONFIGURE_INTERESTS;
    public static final ClipsBottomSheetOptions COPY_AD_MARKER;
    public static final ClipsBottomSheetOptions COPY_DISCLAIMER_INFO;
    public static final ClipsBottomSheetOptions DECLINE_COAUTHOR;
    public static final ClipsBottomSheetOptions DOWNLOAD;
    public static final ClipsBottomSheetOptions DO_NOT_SHOW_SIMILAR;
    public static final ClipsBottomSheetOptions EDIT;
    public static final ClipsBottomSheetOptions EDIT_PLAYLIST;
    public static final ClipsBottomSheetOptions EDIT_PRIVACY_CLIP;
    public static final ClipsBottomSheetOptions EDIT_PUBLICATION_DATE;
    public static final ClipsBottomSheetOptions HIDE_THIS_AUTHOR;
    public static final ClipsBottomSheetOptions MAIN_TAB;
    public static final ClipsBottomSheetOptions NOT_INTERESTED;
    public static final ClipsBottomSheetOptions OPEN_CLOSE_COMMENTS;
    public static final ClipsBottomSheetOptions PIN;
    public static final ClipsBottomSheetOptions PUBLISH_NOW;
    public static final ClipsBottomSheetOptions REMOVE;
    public static final ClipsBottomSheetOptions REMOVE_CLIP_COMMUNITY;
    public static final ClipsBottomSheetOptions REPORT;
    public static final ClipsBottomSheetOptions SHARE;
    public static final ClipsBottomSheetOptions SHOW_STATISTIC;
    public static final ClipsBottomSheetOptions TRAFFIC_SAVING;
    public static final ClipsBottomSheetOptions UNPIN;

    static {
        ClipsBottomSheetOptions clipsBottomSheetOptions = new ClipsBottomSheetOptions("PIN", 0);
        PIN = clipsBottomSheetOptions;
        ClipsBottomSheetOptions clipsBottomSheetOptions2 = new ClipsBottomSheetOptions("UNPIN", 1);
        UNPIN = clipsBottomSheetOptions2;
        ClipsBottomSheetOptions clipsBottomSheetOptions3 = new ClipsBottomSheetOptions("SHOW_STATISTIC", 2);
        SHOW_STATISTIC = clipsBottomSheetOptions3;
        ClipsBottomSheetOptions clipsBottomSheetOptions4 = new ClipsBottomSheetOptions("EDIT", 3);
        EDIT = clipsBottomSheetOptions4;
        ClipsBottomSheetOptions clipsBottomSheetOptions5 = new ClipsBottomSheetOptions("MAIN_TAB", 4);
        MAIN_TAB = clipsBottomSheetOptions5;
        ClipsBottomSheetOptions clipsBottomSheetOptions6 = new ClipsBottomSheetOptions("ADD_TO_PLAYLIST", 5);
        ADD_TO_PLAYLIST = clipsBottomSheetOptions6;
        ClipsBottomSheetOptions clipsBottomSheetOptions7 = new ClipsBottomSheetOptions("EDIT_PLAYLIST", 6);
        EDIT_PLAYLIST = clipsBottomSheetOptions7;
        ClipsBottomSheetOptions clipsBottomSheetOptions8 = new ClipsBottomSheetOptions("EDIT_PRIVACY_CLIP", 7);
        EDIT_PRIVACY_CLIP = clipsBottomSheetOptions8;
        ClipsBottomSheetOptions clipsBottomSheetOptions9 = new ClipsBottomSheetOptions("PUBLISH_NOW", 8);
        PUBLISH_NOW = clipsBottomSheetOptions9;
        ClipsBottomSheetOptions clipsBottomSheetOptions10 = new ClipsBottomSheetOptions("EDIT_PUBLICATION_DATE", 9);
        EDIT_PUBLICATION_DATE = clipsBottomSheetOptions10;
        ClipsBottomSheetOptions clipsBottomSheetOptions11 = new ClipsBottomSheetOptions("OPEN_CLOSE_COMMENTS", 10);
        OPEN_CLOSE_COMMENTS = clipsBottomSheetOptions11;
        ClipsBottomSheetOptions clipsBottomSheetOptions12 = new ClipsBottomSheetOptions("CLIPS_AUTO_SUBTITLES", 11);
        CLIPS_AUTO_SUBTITLES = clipsBottomSheetOptions12;
        ClipsBottomSheetOptions clipsBottomSheetOptions13 = new ClipsBottomSheetOptions("CLIPS_AUTO_SCROLL", 12);
        CLIPS_AUTO_SCROLL = clipsBottomSheetOptions13;
        ClipsBottomSheetOptions clipsBottomSheetOptions14 = new ClipsBottomSheetOptions("ADVERTISER_INFO", 13);
        ADVERTISER_INFO = clipsBottomSheetOptions14;
        ClipsBottomSheetOptions clipsBottomSheetOptions15 = new ClipsBottomSheetOptions("COPY_AD_MARKER", 14);
        COPY_AD_MARKER = clipsBottomSheetOptions15;
        ClipsBottomSheetOptions clipsBottomSheetOptions16 = new ClipsBottomSheetOptions("ADD_TO_FAVORITES", 15);
        ADD_TO_FAVORITES = clipsBottomSheetOptions16;
        ClipsBottomSheetOptions clipsBottomSheetOptions17 = new ClipsBottomSheetOptions("SHARE", 16);
        SHARE = clipsBottomSheetOptions17;
        ClipsBottomSheetOptions clipsBottomSheetOptions18 = new ClipsBottomSheetOptions("DOWNLOAD", 17);
        DOWNLOAD = clipsBottomSheetOptions18;
        ClipsBottomSheetOptions clipsBottomSheetOptions19 = new ClipsBottomSheetOptions("NOT_INTERESTED", 18);
        NOT_INTERESTED = clipsBottomSheetOptions19;
        ClipsBottomSheetOptions clipsBottomSheetOptions20 = new ClipsBottomSheetOptions("TRAFFIC_SAVING", 19);
        TRAFFIC_SAVING = clipsBottomSheetOptions20;
        ClipsBottomSheetOptions clipsBottomSheetOptions21 = new ClipsBottomSheetOptions("REPORT", 20);
        REPORT = clipsBottomSheetOptions21;
        ClipsBottomSheetOptions clipsBottomSheetOptions22 = new ClipsBottomSheetOptions("BUGREPORT", 21);
        BUGREPORT = clipsBottomSheetOptions22;
        ClipsBottomSheetOptions clipsBottomSheetOptions23 = new ClipsBottomSheetOptions("ARCHIVE_RESTORE", 22);
        ARCHIVE_RESTORE = clipsBottomSheetOptions23;
        ClipsBottomSheetOptions clipsBottomSheetOptions24 = new ClipsBottomSheetOptions("REMOVE_CLIP_COMMUNITY", 23);
        REMOVE_CLIP_COMMUNITY = clipsBottomSheetOptions24;
        ClipsBottomSheetOptions clipsBottomSheetOptions25 = new ClipsBottomSheetOptions(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 24);
        REMOVE = clipsBottomSheetOptions25;
        ClipsBottomSheetOptions clipsBottomSheetOptions26 = new ClipsBottomSheetOptions("DECLINE_COAUTHOR", 25);
        DECLINE_COAUTHOR = clipsBottomSheetOptions26;
        ClipsBottomSheetOptions clipsBottomSheetOptions27 = new ClipsBottomSheetOptions("DO_NOT_SHOW_SIMILAR", 26);
        DO_NOT_SHOW_SIMILAR = clipsBottomSheetOptions27;
        ClipsBottomSheetOptions clipsBottomSheetOptions28 = new ClipsBottomSheetOptions("HIDE_THIS_AUTHOR", 27);
        HIDE_THIS_AUTHOR = clipsBottomSheetOptions28;
        ClipsBottomSheetOptions clipsBottomSheetOptions29 = new ClipsBottomSheetOptions("CONFIGURE_INTERESTS", 28);
        CONFIGURE_INTERESTS = clipsBottomSheetOptions29;
        ClipsBottomSheetOptions clipsBottomSheetOptions30 = new ClipsBottomSheetOptions("CANCEL", 29);
        CANCEL = clipsBottomSheetOptions30;
        ClipsBottomSheetOptions clipsBottomSheetOptions31 = new ClipsBottomSheetOptions("COPY_DISCLAIMER_INFO", 30);
        COPY_DISCLAIMER_INFO = clipsBottomSheetOptions31;
        ClipsBottomSheetOptions[] clipsBottomSheetOptionsArr = {clipsBottomSheetOptions, clipsBottomSheetOptions2, clipsBottomSheetOptions3, clipsBottomSheetOptions4, clipsBottomSheetOptions5, clipsBottomSheetOptions6, clipsBottomSheetOptions7, clipsBottomSheetOptions8, clipsBottomSheetOptions9, clipsBottomSheetOptions10, clipsBottomSheetOptions11, clipsBottomSheetOptions12, clipsBottomSheetOptions13, clipsBottomSheetOptions14, clipsBottomSheetOptions15, clipsBottomSheetOptions16, clipsBottomSheetOptions17, clipsBottomSheetOptions18, clipsBottomSheetOptions19, clipsBottomSheetOptions20, clipsBottomSheetOptions21, clipsBottomSheetOptions22, clipsBottomSheetOptions23, clipsBottomSheetOptions24, clipsBottomSheetOptions25, clipsBottomSheetOptions26, clipsBottomSheetOptions27, clipsBottomSheetOptions28, clipsBottomSheetOptions29, clipsBottomSheetOptions30, clipsBottomSheetOptions31};
        $VALUES = clipsBottomSheetOptionsArr;
        $ENTRIES = new asp(clipsBottomSheetOptionsArr);
    }

    public ClipsBottomSheetOptions() {
        throw null;
    }

    public static ClipsBottomSheetOptions valueOf(String str) {
        return (ClipsBottomSheetOptions) Enum.valueOf(ClipsBottomSheetOptions.class, str);
    }

    public static ClipsBottomSheetOptions[] values() {
        return (ClipsBottomSheetOptions[]) $VALUES.clone();
    }
}
