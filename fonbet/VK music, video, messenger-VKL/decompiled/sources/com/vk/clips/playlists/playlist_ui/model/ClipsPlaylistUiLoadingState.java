package com.vk.clips.playlists.playlist_ui.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsPlaylistUiLoadingState.kt */
/* loaded from: classes16.dex */
public final class ClipsPlaylistUiLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsPlaylistUiLoadingState[] $VALUES;
    public static final ClipsPlaylistUiLoadingState BothLoading;
    public static final ClipsPlaylistUiLoadingState BottomLoading;
    public static final ClipsPlaylistUiLoadingState None;
    public static final ClipsPlaylistUiLoadingState TopLoading;
    private final int num;

    static {
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState = new ClipsPlaylistUiLoadingState("TopLoading", 0, 2);
        TopLoading = clipsPlaylistUiLoadingState;
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState2 = new ClipsPlaylistUiLoadingState("BottomLoading", 1, 1);
        BottomLoading = clipsPlaylistUiLoadingState2;
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState3 = new ClipsPlaylistUiLoadingState("None", 2, 0);
        None = clipsPlaylistUiLoadingState3;
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState4 = new ClipsPlaylistUiLoadingState("BothLoading", 3, 3);
        BothLoading = clipsPlaylistUiLoadingState4;
        ClipsPlaylistUiLoadingState[] clipsPlaylistUiLoadingStateArr = {clipsPlaylistUiLoadingState, clipsPlaylistUiLoadingState2, clipsPlaylistUiLoadingState3, clipsPlaylistUiLoadingState4};
        $VALUES = clipsPlaylistUiLoadingStateArr;
        $ENTRIES = new asp(clipsPlaylistUiLoadingStateArr);
    }

    public ClipsPlaylistUiLoadingState(String str, int i, int i2) {
        this.num = i2;
    }

    public static ClipsPlaylistUiLoadingState valueOf(String str) {
        return (ClipsPlaylistUiLoadingState) Enum.valueOf(ClipsPlaylistUiLoadingState.class, str);
    }

    public static ClipsPlaylistUiLoadingState[] values() {
        return (ClipsPlaylistUiLoadingState[]) $VALUES.clone();
    }

    public final int h() {
        return this.num;
    }
}
