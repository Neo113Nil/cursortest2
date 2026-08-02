package com.vk.music.player.core.helper.player.stat;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OneVideoMusicType.kt */
/* loaded from: classes3.dex */
public final class OneVideoMusicType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OneVideoMusicType[] $VALUES;
    public static final OneVideoMusicType ADS;
    public static final OneVideoMusicType AUDIOBOOK;
    public static final OneVideoMusicType PODCAST;
    public static final OneVideoMusicType RADIO;
    public static final OneVideoMusicType SNIPPET;
    public static final OneVideoMusicType TRACK;

    static {
        OneVideoMusicType oneVideoMusicType = new OneVideoMusicType("ADS", 0);
        ADS = oneVideoMusicType;
        OneVideoMusicType oneVideoMusicType2 = new OneVideoMusicType("TRACK", 1);
        TRACK = oneVideoMusicType2;
        OneVideoMusicType oneVideoMusicType3 = new OneVideoMusicType("SNIPPET", 2);
        SNIPPET = oneVideoMusicType3;
        OneVideoMusicType oneVideoMusicType4 = new OneVideoMusicType("RADIO", 3);
        RADIO = oneVideoMusicType4;
        OneVideoMusicType oneVideoMusicType5 = new OneVideoMusicType("PODCAST", 4);
        PODCAST = oneVideoMusicType5;
        OneVideoMusicType oneVideoMusicType6 = new OneVideoMusicType("AUDIOBOOK", 5);
        AUDIOBOOK = oneVideoMusicType6;
        OneVideoMusicType[] oneVideoMusicTypeArr = {oneVideoMusicType, oneVideoMusicType2, oneVideoMusicType3, oneVideoMusicType4, oneVideoMusicType5, oneVideoMusicType6};
        $VALUES = oneVideoMusicTypeArr;
        $ENTRIES = new asp(oneVideoMusicTypeArr);
    }

    public OneVideoMusicType() {
        throw null;
    }

    public static OneVideoMusicType valueOf(String str) {
        return (OneVideoMusicType) Enum.valueOf(OneVideoMusicType.class, str);
    }

    public static OneVideoMusicType[] values() {
        return (OneVideoMusicType[]) $VALUES.clone();
    }
}
