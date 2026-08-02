package com.vk.catalog.mvi.block.music.impl.entity;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayingState.kt */
/* loaded from: classes16.dex */
public final class PlayingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayingState[] $VALUES;
    public static final PlayingState BUFFERING;
    public static final PlayingState NONE;
    public static final PlayingState PAUSED;
    public static final PlayingState PLAYING;

    static {
        PlayingState playingState = new PlayingState("NONE", 0);
        NONE = playingState;
        PlayingState playingState2 = new PlayingState("PLAYING", 1);
        PLAYING = playingState2;
        PlayingState playingState3 = new PlayingState("PAUSED", 2);
        PAUSED = playingState3;
        PlayingState playingState4 = new PlayingState("BUFFERING", 3);
        BUFFERING = playingState4;
        PlayingState[] playingStateArr = {playingState, playingState2, playingState3, playingState4};
        $VALUES = playingStateArr;
        $ENTRIES = new asp(playingStateArr);
    }

    public PlayingState() {
        throw null;
    }

    public static PlayingState valueOf(String str) {
        return (PlayingState) Enum.valueOf(PlayingState.class, str);
    }

    public static PlayingState[] values() {
        return (PlayingState[]) $VALUES.clone();
    }
}
