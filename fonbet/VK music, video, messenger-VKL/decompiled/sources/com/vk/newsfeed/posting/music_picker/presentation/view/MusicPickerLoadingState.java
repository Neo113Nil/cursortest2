package com.vk.newsfeed.posting.music_picker.presentation.view;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicPickerLoadingState.kt */
/* loaded from: classes4.dex */
public final class MusicPickerLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicPickerLoadingState[] $VALUES;
    public static final MusicPickerLoadingState Error;
    public static final MusicPickerLoadingState Loaded;
    public static final MusicPickerLoadingState Loading;
    public static final MusicPickerLoadingState NextPageLoading;
    public static final MusicPickerLoadingState NextPageLoadingError;
    public static final MusicPickerLoadingState None;

    static {
        MusicPickerLoadingState musicPickerLoadingState = new MusicPickerLoadingState("NextPageLoading", 0);
        NextPageLoading = musicPickerLoadingState;
        MusicPickerLoadingState musicPickerLoadingState2 = new MusicPickerLoadingState("NextPageLoadingError", 1);
        NextPageLoadingError = musicPickerLoadingState2;
        MusicPickerLoadingState musicPickerLoadingState3 = new MusicPickerLoadingState("Loading", 2);
        Loading = musicPickerLoadingState3;
        MusicPickerLoadingState musicPickerLoadingState4 = new MusicPickerLoadingState("Loaded", 3);
        Loaded = musicPickerLoadingState4;
        MusicPickerLoadingState musicPickerLoadingState5 = new MusicPickerLoadingState("Error", 4);
        Error = musicPickerLoadingState5;
        MusicPickerLoadingState musicPickerLoadingState6 = new MusicPickerLoadingState("None", 5);
        None = musicPickerLoadingState6;
        MusicPickerLoadingState[] musicPickerLoadingStateArr = {musicPickerLoadingState, musicPickerLoadingState2, musicPickerLoadingState3, musicPickerLoadingState4, musicPickerLoadingState5, musicPickerLoadingState6};
        $VALUES = musicPickerLoadingStateArr;
        $ENTRIES = new asp(musicPickerLoadingStateArr);
    }

    public MusicPickerLoadingState() {
        throw null;
    }

    public static MusicPickerLoadingState valueOf(String str) {
        return (MusicPickerLoadingState) Enum.valueOf(MusicPickerLoadingState.class, str);
    }

    public static MusicPickerLoadingState[] values() {
        return (MusicPickerLoadingState[]) $VALUES.clone();
    }
}
