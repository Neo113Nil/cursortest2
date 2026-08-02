package com.vk.music.playlist.display.audiobook.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioBookLoadState.kt */
/* loaded from: classes3.dex */
public final class AudioBookLoadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioBookLoadState[] $VALUES;
    public static final AudioBookLoadState COMPLETED;
    public static final AudioBookLoadState ERROR;
    public static final AudioBookLoadState LOADING;
    public static final AudioBookLoadState REFRESHING;

    static {
        AudioBookLoadState audioBookLoadState = new AudioBookLoadState("LOADING", 0);
        LOADING = audioBookLoadState;
        AudioBookLoadState audioBookLoadState2 = new AudioBookLoadState("REFRESHING", 1);
        REFRESHING = audioBookLoadState2;
        AudioBookLoadState audioBookLoadState3 = new AudioBookLoadState("ERROR", 2);
        ERROR = audioBookLoadState3;
        AudioBookLoadState audioBookLoadState4 = new AudioBookLoadState("COMPLETED", 3);
        COMPLETED = audioBookLoadState4;
        AudioBookLoadState[] audioBookLoadStateArr = {audioBookLoadState, audioBookLoadState2, audioBookLoadState3, audioBookLoadState4};
        $VALUES = audioBookLoadStateArr;
        $ENTRIES = new asp(audioBookLoadStateArr);
    }

    public AudioBookLoadState() {
        throw null;
    }

    public static AudioBookLoadState valueOf(String str) {
        return (AudioBookLoadState) Enum.valueOf(AudioBookLoadState.class, str);
    }

    public static AudioBookLoadState[] values() {
        return (AudioBookLoadState[]) $VALUES.clone();
    }
}
