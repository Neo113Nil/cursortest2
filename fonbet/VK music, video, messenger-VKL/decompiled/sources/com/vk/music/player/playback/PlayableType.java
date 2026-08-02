package com.vk.music.player.playback;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayableType.kt */
/* loaded from: classes3.dex */
public final class PlayableType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayableType[] $VALUES;
    public static final a Companion;
    public static final PlayableType MUSIC_TRACK;
    public static final PlayableType SNIPPET;
    private final int orderValue;

    /* compiled from: PlayableType.kt */
    public static final class a {
    }

    static {
        PlayableType playableType = new PlayableType("MUSIC_TRACK", 0, 0);
        MUSIC_TRACK = playableType;
        PlayableType playableType2 = new PlayableType("SNIPPET", 1, 1);
        SNIPPET = playableType2;
        PlayableType[] playableTypeArr = {playableType, playableType2};
        $VALUES = playableTypeArr;
        $ENTRIES = new asp(playableTypeArr);
        Companion = new a();
    }

    public PlayableType(String str, int i, int i2) {
        this.orderValue = i2;
    }

    public static zrp<PlayableType> h() {
        return $ENTRIES;
    }

    public static PlayableType valueOf(String str) {
        return (PlayableType) Enum.valueOf(PlayableType.class, str);
    }

    public static PlayableType[] values() {
        return (PlayableType[]) $VALUES.clone();
    }

    public final int i() {
        return this.orderValue;
    }
}
