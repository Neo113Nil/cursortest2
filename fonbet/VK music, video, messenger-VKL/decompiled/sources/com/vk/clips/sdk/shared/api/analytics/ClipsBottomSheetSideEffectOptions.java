package com.vk.clips.sdk.shared.api.analytics;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsBottomSheetOptions.kt */
/* loaded from: classes17.dex */
public final class ClipsBottomSheetSideEffectOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsBottomSheetSideEffectOptions[] $VALUES;
    public static final ClipsBottomSheetSideEffectOptions CANCEL;
    public static final ClipsBottomSheetSideEffectOptions CLIPS_AUTO_SUBTITLES;
    public static final ClipsBottomSheetSideEffectOptions CONFIGURE_INTERESTS;
    public static final ClipsBottomSheetSideEffectOptions DELAY_CLIP_PUBLISHED_NOW;
    public static final ClipsBottomSheetSideEffectOptions DO_NOT_SHOW_SIMILAR;
    public static final ClipsBottomSheetSideEffectOptions EDIT;
    public static final ClipsBottomSheetSideEffectOptions EDIT_DONE;
    public static final ClipsBottomSheetSideEffectOptions EDIT_PRIVACY_CLIP;
    public static final ClipsBottomSheetSideEffectOptions EDIT_PUBLICATION_DATE_ON_CHANGE;
    public static final ClipsBottomSheetSideEffectOptions HIDE_THIS_AUTHOR;
    public static final ClipsBottomSheetSideEffectOptions NOT_INTERESTED;
    public static final ClipsBottomSheetSideEffectOptions PIN;
    public static final ClipsBottomSheetSideEffectOptions REMOVE;
    public static final ClipsBottomSheetSideEffectOptions REMOVE_CLIP_COMMUNITY;
    public static final ClipsBottomSheetSideEffectOptions REMOVE_FROM_OWNER;
    public static final ClipsBottomSheetSideEffectOptions TRAFFIC_SAVING;
    public static final ClipsBottomSheetSideEffectOptions UNPIN;

    static {
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions = new ClipsBottomSheetSideEffectOptions("CLIPS_AUTO_SUBTITLES", 0);
        CLIPS_AUTO_SUBTITLES = clipsBottomSheetSideEffectOptions;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions2 = new ClipsBottomSheetSideEffectOptions("NOT_INTERESTED", 1);
        NOT_INTERESTED = clipsBottomSheetSideEffectOptions2;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions3 = new ClipsBottomSheetSideEffectOptions("TRAFFIC_SAVING", 2);
        TRAFFIC_SAVING = clipsBottomSheetSideEffectOptions3;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions4 = new ClipsBottomSheetSideEffectOptions("REMOVE_FROM_OWNER", 3);
        REMOVE_FROM_OWNER = clipsBottomSheetSideEffectOptions4;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions5 = new ClipsBottomSheetSideEffectOptions("DO_NOT_SHOW_SIMILAR", 4);
        DO_NOT_SHOW_SIMILAR = clipsBottomSheetSideEffectOptions5;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions6 = new ClipsBottomSheetSideEffectOptions("HIDE_THIS_AUTHOR", 5);
        HIDE_THIS_AUTHOR = clipsBottomSheetSideEffectOptions6;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions7 = new ClipsBottomSheetSideEffectOptions("CONFIGURE_INTERESTS", 6);
        CONFIGURE_INTERESTS = clipsBottomSheetSideEffectOptions7;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions8 = new ClipsBottomSheetSideEffectOptions("CANCEL", 7);
        CANCEL = clipsBottomSheetSideEffectOptions8;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions9 = new ClipsBottomSheetSideEffectOptions("EDIT", 8);
        EDIT = clipsBottomSheetSideEffectOptions9;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions10 = new ClipsBottomSheetSideEffectOptions("EDIT_PRIVACY_CLIP", 9);
        EDIT_PRIVACY_CLIP = clipsBottomSheetSideEffectOptions10;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions11 = new ClipsBottomSheetSideEffectOptions(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 10);
        REMOVE = clipsBottomSheetSideEffectOptions11;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions12 = new ClipsBottomSheetSideEffectOptions("REMOVE_CLIP_COMMUNITY", 11);
        REMOVE_CLIP_COMMUNITY = clipsBottomSheetSideEffectOptions12;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions13 = new ClipsBottomSheetSideEffectOptions("EDIT_PUBLICATION_DATE_ON_CHANGE", 12);
        EDIT_PUBLICATION_DATE_ON_CHANGE = clipsBottomSheetSideEffectOptions13;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions14 = new ClipsBottomSheetSideEffectOptions("PIN", 13);
        PIN = clipsBottomSheetSideEffectOptions14;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions15 = new ClipsBottomSheetSideEffectOptions("UNPIN", 14);
        UNPIN = clipsBottomSheetSideEffectOptions15;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions16 = new ClipsBottomSheetSideEffectOptions("DELAY_CLIP_PUBLISHED_NOW", 15);
        DELAY_CLIP_PUBLISHED_NOW = clipsBottomSheetSideEffectOptions16;
        ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions17 = new ClipsBottomSheetSideEffectOptions("EDIT_DONE", 16);
        EDIT_DONE = clipsBottomSheetSideEffectOptions17;
        ClipsBottomSheetSideEffectOptions[] clipsBottomSheetSideEffectOptionsArr = {clipsBottomSheetSideEffectOptions, clipsBottomSheetSideEffectOptions2, clipsBottomSheetSideEffectOptions3, clipsBottomSheetSideEffectOptions4, clipsBottomSheetSideEffectOptions5, clipsBottomSheetSideEffectOptions6, clipsBottomSheetSideEffectOptions7, clipsBottomSheetSideEffectOptions8, clipsBottomSheetSideEffectOptions9, clipsBottomSheetSideEffectOptions10, clipsBottomSheetSideEffectOptions11, clipsBottomSheetSideEffectOptions12, clipsBottomSheetSideEffectOptions13, clipsBottomSheetSideEffectOptions14, clipsBottomSheetSideEffectOptions15, clipsBottomSheetSideEffectOptions16, clipsBottomSheetSideEffectOptions17};
        $VALUES = clipsBottomSheetSideEffectOptionsArr;
        $ENTRIES = new asp(clipsBottomSheetSideEffectOptionsArr);
    }

    public ClipsBottomSheetSideEffectOptions() {
        throw null;
    }

    public static ClipsBottomSheetSideEffectOptions valueOf(String str) {
        return (ClipsBottomSheetSideEffectOptions) Enum.valueOf(ClipsBottomSheetSideEffectOptions.class, str);
    }

    public static ClipsBottomSheetSideEffectOptions[] values() {
        return (ClipsBottomSheetSideEffectOptions[]) $VALUES.clone();
    }
}
