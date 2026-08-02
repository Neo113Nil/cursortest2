package com.vk.clips.playlists.playlist_ui.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OverlayViewState.kt */
/* loaded from: classes16.dex */
public final class OverlayViewState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OverlayViewState[] $VALUES;
    public static final OverlayViewState DeletionDialog;
    public static final OverlayViewState Gone;

    static {
        OverlayViewState overlayViewState = new OverlayViewState("Gone", 0);
        Gone = overlayViewState;
        OverlayViewState overlayViewState2 = new OverlayViewState("DeletionDialog", 1);
        DeletionDialog = overlayViewState2;
        OverlayViewState[] overlayViewStateArr = {overlayViewState, overlayViewState2};
        $VALUES = overlayViewStateArr;
        $ENTRIES = new asp(overlayViewStateArr);
    }

    public OverlayViewState() {
        throw null;
    }

    public static OverlayViewState valueOf(String str) {
        return (OverlayViewState) Enum.valueOf(OverlayViewState.class, str);
    }

    public static OverlayViewState[] values() {
        return (OverlayViewState[]) $VALUES.clone();
    }
}
