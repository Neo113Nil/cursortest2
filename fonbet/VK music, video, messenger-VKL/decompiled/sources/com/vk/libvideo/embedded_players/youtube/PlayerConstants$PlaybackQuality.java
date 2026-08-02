package com.vk.libvideo.embedded_players.youtube;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerConstants.kt */
/* loaded from: classes14.dex */
public final class PlayerConstants$PlaybackQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerConstants$PlaybackQuality[] $VALUES;
    public static final PlayerConstants$PlaybackQuality DEFAULT;
    public static final PlayerConstants$PlaybackQuality HD1080;
    public static final PlayerConstants$PlaybackQuality HD720;
    public static final PlayerConstants$PlaybackQuality HIGH_RES;
    public static final PlayerConstants$PlaybackQuality LARGE;
    public static final PlayerConstants$PlaybackQuality MEDIUM;
    public static final PlayerConstants$PlaybackQuality SMALL;
    public static final PlayerConstants$PlaybackQuality UNKNOWN;

    static {
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality = new PlayerConstants$PlaybackQuality(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = playerConstants$PlaybackQuality;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality2 = new PlayerConstants$PlaybackQuality("SMALL", 1);
        SMALL = playerConstants$PlaybackQuality2;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality3 = new PlayerConstants$PlaybackQuality("MEDIUM", 2);
        MEDIUM = playerConstants$PlaybackQuality3;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality4 = new PlayerConstants$PlaybackQuality("LARGE", 3);
        LARGE = playerConstants$PlaybackQuality4;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality5 = new PlayerConstants$PlaybackQuality("HD720", 4);
        HD720 = playerConstants$PlaybackQuality5;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality6 = new PlayerConstants$PlaybackQuality("HD1080", 5);
        HD1080 = playerConstants$PlaybackQuality6;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality7 = new PlayerConstants$PlaybackQuality("HIGH_RES", 6);
        HIGH_RES = playerConstants$PlaybackQuality7;
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality8 = new PlayerConstants$PlaybackQuality("DEFAULT", 7);
        DEFAULT = playerConstants$PlaybackQuality8;
        PlayerConstants$PlaybackQuality[] playerConstants$PlaybackQualityArr = {playerConstants$PlaybackQuality, playerConstants$PlaybackQuality2, playerConstants$PlaybackQuality3, playerConstants$PlaybackQuality4, playerConstants$PlaybackQuality5, playerConstants$PlaybackQuality6, playerConstants$PlaybackQuality7, playerConstants$PlaybackQuality8};
        $VALUES = playerConstants$PlaybackQualityArr;
        $ENTRIES = new asp(playerConstants$PlaybackQualityArr);
    }

    public PlayerConstants$PlaybackQuality() {
        throw null;
    }

    public static PlayerConstants$PlaybackQuality valueOf(String str) {
        return (PlayerConstants$PlaybackQuality) Enum.valueOf(PlayerConstants$PlaybackQuality.class, str);
    }

    public static PlayerConstants$PlaybackQuality[] values() {
        return (PlayerConstants$PlaybackQuality[]) $VALUES.clone();
    }
}
