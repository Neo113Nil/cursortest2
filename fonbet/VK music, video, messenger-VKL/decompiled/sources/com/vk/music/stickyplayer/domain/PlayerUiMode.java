package com.vk.music.stickyplayer.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerUiMode.kt */
/* loaded from: classes3.dex */
public final class PlayerUiMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerUiMode[] $VALUES;
    public static final PlayerUiMode ADVERTISEMENT;
    public static final PlayerUiMode AUDIOBOOK;
    public static final PlayerUiMode LOADING;
    public static final PlayerUiMode MUSIC;
    public static final PlayerUiMode PODCAST;
    public static final PlayerUiMode RADIO;
    public static final PlayerUiMode VK_MIX;

    static {
        PlayerUiMode playerUiMode = new PlayerUiMode("LOADING", 0);
        LOADING = playerUiMode;
        PlayerUiMode playerUiMode2 = new PlayerUiMode("MUSIC", 1);
        MUSIC = playerUiMode2;
        PlayerUiMode playerUiMode3 = new PlayerUiMode("ADVERTISEMENT", 2);
        ADVERTISEMENT = playerUiMode3;
        PlayerUiMode playerUiMode4 = new PlayerUiMode("VK_MIX", 3);
        VK_MIX = playerUiMode4;
        PlayerUiMode playerUiMode5 = new PlayerUiMode("RADIO", 4);
        RADIO = playerUiMode5;
        PlayerUiMode playerUiMode6 = new PlayerUiMode("PODCAST", 5);
        PODCAST = playerUiMode6;
        PlayerUiMode playerUiMode7 = new PlayerUiMode("AUDIOBOOK", 6);
        AUDIOBOOK = playerUiMode7;
        PlayerUiMode[] playerUiModeArr = {playerUiMode, playerUiMode2, playerUiMode3, playerUiMode4, playerUiMode5, playerUiMode6, playerUiMode7};
        $VALUES = playerUiModeArr;
        $ENTRIES = new asp(playerUiModeArr);
    }

    public PlayerUiMode() {
        throw null;
    }

    public static PlayerUiMode valueOf(String str) {
        return (PlayerUiMode) Enum.valueOf(PlayerUiMode.class, str);
    }

    public static PlayerUiMode[] values() {
        return (PlayerUiMode[]) $VALUES.clone();
    }
}
