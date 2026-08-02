package com.vk.audiomsg.player.trackplayer.oggtrackplayer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayState.kt */
/* loaded from: classes.dex */
public final class PlayState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayState[] $VALUES;
    public static final PlayState COMPLETE;
    public static final PlayState PAUSE;
    public static final PlayState PLAY;
    public static final PlayState STOP;

    static {
        PlayState playState = new PlayState("PLAY", 0);
        PLAY = playState;
        PlayState playState2 = new PlayState("PAUSE", 1);
        PAUSE = playState2;
        PlayState playState3 = new PlayState("STOP", 2);
        STOP = playState3;
        PlayState playState4 = new PlayState("COMPLETE", 3);
        COMPLETE = playState4;
        PlayState[] playStateArr = {playState, playState2, playState3, playState4};
        $VALUES = playStateArr;
        $ENTRIES = new asp(playStateArr);
    }

    public PlayState() {
        throw null;
    }

    public static PlayState valueOf(String str) {
        return (PlayState) Enum.valueOf(PlayState.class, str);
    }

    public static PlayState[] values() {
        return (PlayState[]) $VALUES.clone();
    }
}
