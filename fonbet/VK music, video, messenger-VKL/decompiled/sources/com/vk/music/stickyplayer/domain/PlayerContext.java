package com.vk.music.stickyplayer.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerContext.kt */
/* loaded from: classes3.dex */
public final class PlayerContext {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerContext[] $VALUES;
    public static final PlayerContext FULL;
    public static final PlayerContext MINI;
    public static final PlayerContext MINI_STANDALONE;
    public static final PlayerContext TOP;

    static {
        PlayerContext playerContext = new PlayerContext("FULL", 0);
        FULL = playerContext;
        PlayerContext playerContext2 = new PlayerContext("TOP", 1);
        TOP = playerContext2;
        PlayerContext playerContext3 = new PlayerContext("MINI", 2);
        MINI = playerContext3;
        PlayerContext playerContext4 = new PlayerContext("MINI_STANDALONE", 3);
        MINI_STANDALONE = playerContext4;
        PlayerContext[] playerContextArr = {playerContext, playerContext2, playerContext3, playerContext4};
        $VALUES = playerContextArr;
        $ENTRIES = new asp(playerContextArr);
    }

    public PlayerContext() {
        throw null;
    }

    public static PlayerContext valueOf(String str) {
        return (PlayerContext) Enum.valueOf(PlayerContext.class, str);
    }

    public static PlayerContext[] values() {
        return (PlayerContext[]) $VALUES.clone();
    }

    public final boolean h() {
        return this == FULL || this == TOP;
    }
}
