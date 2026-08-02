package com.vk.libvideo.embedded_players.youtube;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerConstants.kt */
/* loaded from: classes14.dex */
public final class PlayerConstants$PlayerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerConstants$PlayerState[] $VALUES;
    public static final PlayerConstants$PlayerState BUFFERING;
    public static final PlayerConstants$PlayerState ENDED;
    public static final PlayerConstants$PlayerState PAUSED;
    public static final PlayerConstants$PlayerState PLAYING;
    public static final PlayerConstants$PlayerState UNKNOWN;
    public static final PlayerConstants$PlayerState UNSTARTED;
    public static final PlayerConstants$PlayerState VIDEO_CUED;

    static {
        PlayerConstants$PlayerState playerConstants$PlayerState = new PlayerConstants$PlayerState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = playerConstants$PlayerState;
        PlayerConstants$PlayerState playerConstants$PlayerState2 = new PlayerConstants$PlayerState("UNSTARTED", 1);
        UNSTARTED = playerConstants$PlayerState2;
        PlayerConstants$PlayerState playerConstants$PlayerState3 = new PlayerConstants$PlayerState(SignalingProtocol.STATE_ENDED, 2);
        ENDED = playerConstants$PlayerState3;
        PlayerConstants$PlayerState playerConstants$PlayerState4 = new PlayerConstants$PlayerState("PLAYING", 3);
        PLAYING = playerConstants$PlayerState4;
        PlayerConstants$PlayerState playerConstants$PlayerState5 = new PlayerConstants$PlayerState("PAUSED", 4);
        PAUSED = playerConstants$PlayerState5;
        PlayerConstants$PlayerState playerConstants$PlayerState6 = new PlayerConstants$PlayerState("BUFFERING", 5);
        BUFFERING = playerConstants$PlayerState6;
        PlayerConstants$PlayerState playerConstants$PlayerState7 = new PlayerConstants$PlayerState("VIDEO_CUED", 6);
        VIDEO_CUED = playerConstants$PlayerState7;
        PlayerConstants$PlayerState[] playerConstants$PlayerStateArr = {playerConstants$PlayerState, playerConstants$PlayerState2, playerConstants$PlayerState3, playerConstants$PlayerState4, playerConstants$PlayerState5, playerConstants$PlayerState6, playerConstants$PlayerState7};
        $VALUES = playerConstants$PlayerStateArr;
        $ENTRIES = new asp(playerConstants$PlayerStateArr);
    }

    public PlayerConstants$PlayerState() {
        throw null;
    }

    public static PlayerConstants$PlayerState valueOf(String str) {
        return (PlayerConstants$PlayerState) Enum.valueOf(PlayerConstants$PlayerState.class, str);
    }

    public static PlayerConstants$PlayerState[] values() {
        return (PlayerConstants$PlayerState[]) $VALUES.clone();
    }
}
