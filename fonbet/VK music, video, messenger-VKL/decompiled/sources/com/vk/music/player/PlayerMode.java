package com.vk.music.player;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerMode.kt */
/* loaded from: classes.dex */
public final class PlayerMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerMode[] $VALUES;
    public static final PlayerMode ADVERTISEMENT;
    public static final PlayerMode AUDIO;
    public static final PlayerMode AUDIO_BOOK;
    public static final PlayerMode EXTERNAL_AUDIO;
    public static final PlayerMode LOADING;
    public static final PlayerMode NFT;
    public static final PlayerMode PODCAST;
    public static final PlayerMode RADIO;
    public static final PlayerMode STREAM;

    static {
        PlayerMode playerMode = new PlayerMode(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
        AUDIO = playerMode;
        PlayerMode playerMode2 = new PlayerMode("PODCAST", 1);
        PODCAST = playerMode2;
        PlayerMode playerMode3 = new PlayerMode("AUDIO_BOOK", 2);
        AUDIO_BOOK = playerMode3;
        PlayerMode playerMode4 = new PlayerMode("STREAM", 3);
        STREAM = playerMode4;
        PlayerMode playerMode5 = new PlayerMode("ADVERTISEMENT", 4);
        ADVERTISEMENT = playerMode5;
        PlayerMode playerMode6 = new PlayerMode("LOADING", 5);
        LOADING = playerMode6;
        PlayerMode playerMode7 = new PlayerMode("RADIO", 6);
        RADIO = playerMode7;
        PlayerMode playerMode8 = new PlayerMode("EXTERNAL_AUDIO", 7);
        EXTERNAL_AUDIO = playerMode8;
        PlayerMode playerMode9 = new PlayerMode("NFT", 8);
        NFT = playerMode9;
        PlayerMode[] playerModeArr = {playerMode, playerMode2, playerMode3, playerMode4, playerMode5, playerMode6, playerMode7, playerMode8, playerMode9};
        $VALUES = playerModeArr;
        $ENTRIES = new asp(playerModeArr);
    }

    public PlayerMode() {
        throw null;
    }

    public static PlayerMode valueOf(String str) {
        return (PlayerMode) Enum.valueOf(PlayerMode.class, str);
    }

    public static PlayerMode[] values() {
        return (PlayerMode[]) $VALUES.clone();
    }
}
