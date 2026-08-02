package com.vk.libvideo.ui.video2;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class PlayerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerState[] $VALUES;
    public static final PlayerState AD_PAUSE;
    public static final PlayerState AD_PLAYING;
    public static final PlayerState BUFFERING;
    public static final PlayerState ENDED;
    public static final PlayerState ERROR;
    public static final PlayerState IDLE;
    public static final PlayerState PAUSE;
    public static final PlayerState PLAYING;

    static {
        PlayerState playerState = new PlayerState("IDLE", 0);
        IDLE = playerState;
        PlayerState playerState2 = new PlayerState("BUFFERING", 1);
        BUFFERING = playerState2;
        PlayerState playerState3 = new PlayerState("PLAYING", 2);
        PLAYING = playerState3;
        PlayerState playerState4 = new PlayerState("PAUSE", 3);
        PAUSE = playerState4;
        PlayerState playerState5 = new PlayerState("ERROR", 4);
        ERROR = playerState5;
        PlayerState playerState6 = new PlayerState(SignalingProtocol.STATE_ENDED, 5);
        ENDED = playerState6;
        PlayerState playerState7 = new PlayerState("AD_PLAYING", 6);
        AD_PLAYING = playerState7;
        PlayerState playerState8 = new PlayerState("AD_PAUSE", 7);
        AD_PAUSE = playerState8;
        PlayerState[] playerStateArr = {playerState, playerState2, playerState3, playerState4, playerState5, playerState6, playerState7, playerState8};
        $VALUES = playerStateArr;
        $ENTRIES = new asp(playerStateArr);
    }

    public PlayerState() {
        throw null;
    }

    public static PlayerState valueOf(String str) {
        return (PlayerState) Enum.valueOf(PlayerState.class, str);
    }

    public static PlayerState[] values() {
        return (PlayerState[]) $VALUES.clone();
    }
}
