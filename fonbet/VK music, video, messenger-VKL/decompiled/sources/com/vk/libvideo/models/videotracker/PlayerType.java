package com.vk.libvideo.models.videotracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerType.kt */
/* loaded from: classes3.dex */
public final class PlayerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerType[] $VALUES;
    public static final PlayerType CAROUSEL;
    public static final PlayerType FULLSCREEN;
    public static final PlayerType INLINE;

    static {
        PlayerType playerType = new PlayerType("INLINE", 0);
        INLINE = playerType;
        PlayerType playerType2 = new PlayerType("CAROUSEL", 1);
        CAROUSEL = playerType2;
        PlayerType playerType3 = new PlayerType("FULLSCREEN", 2);
        FULLSCREEN = playerType3;
        PlayerType[] playerTypeArr = {playerType, playerType2, playerType3};
        $VALUES = playerTypeArr;
        $ENTRIES = new asp(playerTypeArr);
    }

    public PlayerType() {
        throw null;
    }

    public static PlayerType valueOf(String str) {
        return (PlayerType) Enum.valueOf(PlayerType.class, str);
    }

    public static PlayerType[] values() {
        return (PlayerType[]) $VALUES.clone();
    }
}
