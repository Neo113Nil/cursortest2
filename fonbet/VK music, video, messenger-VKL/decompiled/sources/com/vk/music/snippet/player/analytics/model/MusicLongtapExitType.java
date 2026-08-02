package com.vk.music.snippet.player.analytics.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicLongtapExitType.kt */
/* loaded from: classes3.dex */
public final class MusicLongtapExitType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicLongtapExitType[] $VALUES;
    public static final MusicLongtapExitType ADD_TRACK;
    public static final MusicLongtapExitType AUTO_FINISH;
    public static final MusicLongtapExitType CLICK_EXIT;
    public static final MusicLongtapExitType CLICK_OUTSIDE;
    public static final MusicLongtapExitType CLOSE_APP;

    static {
        MusicLongtapExitType musicLongtapExitType = new MusicLongtapExitType("CLICK_OUTSIDE", 0);
        CLICK_OUTSIDE = musicLongtapExitType;
        MusicLongtapExitType musicLongtapExitType2 = new MusicLongtapExitType("CLICK_EXIT", 1);
        CLICK_EXIT = musicLongtapExitType2;
        MusicLongtapExitType musicLongtapExitType3 = new MusicLongtapExitType("CLOSE_APP", 2);
        CLOSE_APP = musicLongtapExitType3;
        MusicLongtapExitType musicLongtapExitType4 = new MusicLongtapExitType("ADD_TRACK", 3);
        ADD_TRACK = musicLongtapExitType4;
        MusicLongtapExitType musicLongtapExitType5 = new MusicLongtapExitType("AUTO_FINISH", 4);
        AUTO_FINISH = musicLongtapExitType5;
        MusicLongtapExitType[] musicLongtapExitTypeArr = {musicLongtapExitType, musicLongtapExitType2, musicLongtapExitType3, musicLongtapExitType4, musicLongtapExitType5};
        $VALUES = musicLongtapExitTypeArr;
        $ENTRIES = new asp(musicLongtapExitTypeArr);
    }

    public MusicLongtapExitType() {
        throw null;
    }

    public static MusicLongtapExitType valueOf(String str) {
        return (MusicLongtapExitType) Enum.valueOf(MusicLongtapExitType.class, str);
    }

    public static MusicLongtapExitType[] values() {
        return (MusicLongtapExitType[]) $VALUES.clone();
    }
}
