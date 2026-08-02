package com.vk.reefton.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefVideoPlayerState.kt */
/* loaded from: classes5.dex */
public final class ReefVideoPlayerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefVideoPlayerState[] $VALUES;
    public static final ReefVideoPlayerState STATE_BUFFERING;
    public static final ReefVideoPlayerState STATE_ENDED;
    public static final ReefVideoPlayerState STATE_IDLE;
    public static final ReefVideoPlayerState STATE_READY;
    private final int number;

    static {
        ReefVideoPlayerState reefVideoPlayerState = new ReefVideoPlayerState("STATE_IDLE", 0, 1);
        STATE_IDLE = reefVideoPlayerState;
        ReefVideoPlayerState reefVideoPlayerState2 = new ReefVideoPlayerState("STATE_BUFFERING", 1, 2);
        STATE_BUFFERING = reefVideoPlayerState2;
        ReefVideoPlayerState reefVideoPlayerState3 = new ReefVideoPlayerState("STATE_READY", 2, 3);
        STATE_READY = reefVideoPlayerState3;
        ReefVideoPlayerState reefVideoPlayerState4 = new ReefVideoPlayerState("STATE_ENDED", 3, 4);
        STATE_ENDED = reefVideoPlayerState4;
        ReefVideoPlayerState[] reefVideoPlayerStateArr = {reefVideoPlayerState, reefVideoPlayerState2, reefVideoPlayerState3, reefVideoPlayerState4};
        $VALUES = reefVideoPlayerStateArr;
        $ENTRIES = new asp(reefVideoPlayerStateArr);
    }

    public ReefVideoPlayerState(String str, int i, int i2) {
        this.number = i2;
    }

    public static ReefVideoPlayerState valueOf(String str) {
        return (ReefVideoPlayerState) Enum.valueOf(ReefVideoPlayerState.class, str);
    }

    public static ReefVideoPlayerState[] values() {
        return (ReefVideoPlayerState[]) $VALUES.clone();
    }
}
