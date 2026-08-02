package com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipViewState.kt */
/* loaded from: classes7.dex */
public final class ClipSubtitleViewState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipSubtitleViewState[] $VALUES;
    public static final ClipSubtitleViewState ATTACHED_TO_ANOTHER_VIDEO;
    public static final ClipSubtitleViewState HAS_COAUTHORS;

    static {
        ClipSubtitleViewState clipSubtitleViewState = new ClipSubtitleViewState("ATTACHED_TO_ANOTHER_VIDEO", 0);
        ATTACHED_TO_ANOTHER_VIDEO = clipSubtitleViewState;
        ClipSubtitleViewState clipSubtitleViewState2 = new ClipSubtitleViewState("HAS_COAUTHORS", 1);
        HAS_COAUTHORS = clipSubtitleViewState2;
        ClipSubtitleViewState[] clipSubtitleViewStateArr = {clipSubtitleViewState, clipSubtitleViewState2};
        $VALUES = clipSubtitleViewStateArr;
        $ENTRIES = new asp(clipSubtitleViewStateArr);
    }

    public ClipSubtitleViewState() {
        throw null;
    }

    public static ClipSubtitleViewState valueOf(String str) {
        return (ClipSubtitleViewState) Enum.valueOf(ClipSubtitleViewState.class, str);
    }

    public static ClipSubtitleViewState[] values() {
        return (ClipSubtitleViewState[]) $VALUES.clone();
    }
}
