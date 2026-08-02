package com.vk.music.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayState.kt */
/* loaded from: classes.dex */
public final class PlayState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayState[] $VALUES;
    public static final a Companion;
    public static final PlayState IDLE;
    public static final PlayState PAUSED;
    public static final PlayState PLAYING;
    public static final PlayState STOPPED;
    private final boolean isPlayState;
    private final boolean isStopState;

    /* compiled from: PlayState.kt */
    public static final class a {
    }

    static {
        PlayState playState = new PlayState("STOPPED", 0, false, true);
        STOPPED = playState;
        PlayState playState2 = new PlayState("PLAYING", 1, true, false);
        PLAYING = playState2;
        PlayState playState3 = new PlayState("PAUSED", 2, false, false);
        PAUSED = playState3;
        PlayState playState4 = new PlayState("IDLE", 3, false, true);
        IDLE = playState4;
        PlayState[] playStateArr = {playState, playState2, playState3, playState4};
        $VALUES = playStateArr;
        $ENTRIES = new asp(playStateArr);
        Companion = new a();
    }

    public PlayState(String str, int i, boolean z, boolean z2) {
        this.isPlayState = z;
        this.isStopState = z2;
    }

    public static PlayState valueOf(String str) {
        return (PlayState) Enum.valueOf(PlayState.class, str);
    }

    public static PlayState[] values() {
        return (PlayState[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.isPlayState;
    }

    public final boolean i() {
        return this.isStopState;
    }
}
