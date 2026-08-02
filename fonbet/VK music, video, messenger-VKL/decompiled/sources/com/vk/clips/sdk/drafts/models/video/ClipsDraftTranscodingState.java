package com.vk.clips.sdk.drafts.models.video;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsDraftTranscodingState.kt */
/* loaded from: classes17.dex */
public final class ClipsDraftTranscodingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsDraftTranscodingState[] $VALUES;
    public static final ClipsDraftTranscodingState CAMERA_BACK;
    public static final ClipsDraftTranscodingState CAMERA_FRONT;
    public static final a Companion;
    public static final ClipsDraftTranscodingState GALLERY_NOT_TRANSCODED;
    public static final ClipsDraftTranscodingState GALLERY_TRANSCODED;

    /* compiled from: ClipsDraftTranscodingState.kt */
    public static final class a {
    }

    static {
        ClipsDraftTranscodingState clipsDraftTranscodingState = new ClipsDraftTranscodingState("GALLERY_TRANSCODED", 0);
        GALLERY_TRANSCODED = clipsDraftTranscodingState;
        ClipsDraftTranscodingState clipsDraftTranscodingState2 = new ClipsDraftTranscodingState("GALLERY_NOT_TRANSCODED", 1);
        GALLERY_NOT_TRANSCODED = clipsDraftTranscodingState2;
        ClipsDraftTranscodingState clipsDraftTranscodingState3 = new ClipsDraftTranscodingState("CAMERA_FRONT", 2);
        CAMERA_FRONT = clipsDraftTranscodingState3;
        ClipsDraftTranscodingState clipsDraftTranscodingState4 = new ClipsDraftTranscodingState("CAMERA_BACK", 3);
        CAMERA_BACK = clipsDraftTranscodingState4;
        ClipsDraftTranscodingState[] clipsDraftTranscodingStateArr = {clipsDraftTranscodingState, clipsDraftTranscodingState2, clipsDraftTranscodingState3, clipsDraftTranscodingState4};
        $VALUES = clipsDraftTranscodingStateArr;
        $ENTRIES = new asp(clipsDraftTranscodingStateArr);
        Companion = new a();
    }

    public ClipsDraftTranscodingState() {
        throw null;
    }

    public static zrp<ClipsDraftTranscodingState> h() {
        return $ENTRIES;
    }

    public static ClipsDraftTranscodingState valueOf(String str) {
        return (ClipsDraftTranscodingState) Enum.valueOf(ClipsDraftTranscodingState.class, str);
    }

    public static ClipsDraftTranscodingState[] values() {
        return (ClipsDraftTranscodingState[]) $VALUES.clone();
    }
}
