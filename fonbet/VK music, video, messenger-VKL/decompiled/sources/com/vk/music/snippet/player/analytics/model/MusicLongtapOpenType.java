package com.vk.music.snippet.player.analytics.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicLongtapOpenType.kt */
/* loaded from: classes3.dex */
public final class MusicLongtapOpenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicLongtapOpenType[] $VALUES;
    public static final MusicLongtapOpenType OPEN_LONGTAP;
    public static final MusicLongtapOpenType REOPEN_LONGTAP;

    static {
        MusicLongtapOpenType musicLongtapOpenType = new MusicLongtapOpenType("OPEN_LONGTAP", 0);
        OPEN_LONGTAP = musicLongtapOpenType;
        MusicLongtapOpenType musicLongtapOpenType2 = new MusicLongtapOpenType("REOPEN_LONGTAP", 1);
        REOPEN_LONGTAP = musicLongtapOpenType2;
        MusicLongtapOpenType[] musicLongtapOpenTypeArr = {musicLongtapOpenType, musicLongtapOpenType2};
        $VALUES = musicLongtapOpenTypeArr;
        $ENTRIES = new asp(musicLongtapOpenTypeArr);
    }

    public MusicLongtapOpenType() {
        throw null;
    }

    public static MusicLongtapOpenType valueOf(String str) {
        return (MusicLongtapOpenType) Enum.valueOf(MusicLongtapOpenType.class, str);
    }

    public static MusicLongtapOpenType[] values() {
        return (MusicLongtapOpenType[]) $VALUES.clone();
    }
}
