package com.vk.libvideo.embedded_players.youtube;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerConstants.kt */
/* loaded from: classes14.dex */
public final class PlayerConstants$PlaybackRate {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerConstants$PlaybackRate[] $VALUES;
    public static final PlayerConstants$PlaybackRate RATE_0_25;
    public static final PlayerConstants$PlaybackRate RATE_0_5;
    public static final PlayerConstants$PlaybackRate RATE_1;
    public static final PlayerConstants$PlaybackRate RATE_1_5;
    public static final PlayerConstants$PlaybackRate RATE_2;
    public static final PlayerConstants$PlaybackRate UNKNOWN;
    private final float floatValue;

    static {
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate = new PlayerConstants$PlaybackRate(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 1.0f);
        UNKNOWN = playerConstants$PlaybackRate;
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate2 = new PlayerConstants$PlaybackRate("RATE_0_25", 1, 0.25f);
        RATE_0_25 = playerConstants$PlaybackRate2;
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate3 = new PlayerConstants$PlaybackRate("RATE_0_5", 2, 0.5f);
        RATE_0_5 = playerConstants$PlaybackRate3;
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate4 = new PlayerConstants$PlaybackRate("RATE_1", 3, 1.0f);
        RATE_1 = playerConstants$PlaybackRate4;
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate5 = new PlayerConstants$PlaybackRate("RATE_1_5", 4, 1.5f);
        RATE_1_5 = playerConstants$PlaybackRate5;
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate6 = new PlayerConstants$PlaybackRate("RATE_2", 5, 2.0f);
        RATE_2 = playerConstants$PlaybackRate6;
        PlayerConstants$PlaybackRate[] playerConstants$PlaybackRateArr = {playerConstants$PlaybackRate, playerConstants$PlaybackRate2, playerConstants$PlaybackRate3, playerConstants$PlaybackRate4, playerConstants$PlaybackRate5, playerConstants$PlaybackRate6};
        $VALUES = playerConstants$PlaybackRateArr;
        $ENTRIES = new asp(playerConstants$PlaybackRateArr);
    }

    public PlayerConstants$PlaybackRate(String str, int i, float f) {
        this.floatValue = f;
    }

    public static PlayerConstants$PlaybackRate valueOf(String str) {
        return (PlayerConstants$PlaybackRate) Enum.valueOf(PlayerConstants$PlaybackRate.class, str);
    }

    public static PlayerConstants$PlaybackRate[] values() {
        return (PlayerConstants$PlaybackRate[]) $VALUES.clone();
    }
}
