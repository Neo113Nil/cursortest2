package com.vk.libvideo.embedded_players.youtube;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerConstants.kt */
/* loaded from: classes14.dex */
public final class PlayerConstants$PlayerError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerConstants$PlayerError[] $VALUES;
    public static final PlayerConstants$PlayerError HTML_5_PLAYER;
    public static final PlayerConstants$PlayerError INVALID_PARAMETER_IN_REQUEST;
    public static final PlayerConstants$PlayerError UNKNOWN;
    public static final PlayerConstants$PlayerError VIDEO_NOT_FOUND;
    public static final PlayerConstants$PlayerError VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;

    static {
        PlayerConstants$PlayerError playerConstants$PlayerError = new PlayerConstants$PlayerError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = playerConstants$PlayerError;
        PlayerConstants$PlayerError playerConstants$PlayerError2 = new PlayerConstants$PlayerError("INVALID_PARAMETER_IN_REQUEST", 1);
        INVALID_PARAMETER_IN_REQUEST = playerConstants$PlayerError2;
        PlayerConstants$PlayerError playerConstants$PlayerError3 = new PlayerConstants$PlayerError("HTML_5_PLAYER", 2);
        HTML_5_PLAYER = playerConstants$PlayerError3;
        PlayerConstants$PlayerError playerConstants$PlayerError4 = new PlayerConstants$PlayerError("VIDEO_NOT_FOUND", 3);
        VIDEO_NOT_FOUND = playerConstants$PlayerError4;
        PlayerConstants$PlayerError playerConstants$PlayerError5 = new PlayerConstants$PlayerError("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER = playerConstants$PlayerError5;
        PlayerConstants$PlayerError[] playerConstants$PlayerErrorArr = {playerConstants$PlayerError, playerConstants$PlayerError2, playerConstants$PlayerError3, playerConstants$PlayerError4, playerConstants$PlayerError5};
        $VALUES = playerConstants$PlayerErrorArr;
        $ENTRIES = new asp(playerConstants$PlayerErrorArr);
    }

    public PlayerConstants$PlayerError() {
        throw null;
    }

    public static PlayerConstants$PlayerError valueOf(String str) {
        return (PlayerConstants$PlayerError) Enum.valueOf(PlayerConstants$PlayerError.class, str);
    }

    public static PlayerConstants$PlayerError[] values() {
        return (PlayerConstants$PlayerError[]) $VALUES.clone();
    }
}
