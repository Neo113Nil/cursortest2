package com.vk.catalog2.feature.music.holders.analytics.taps;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicAnalyticTapsLinkName.kt */
/* loaded from: classes16.dex */
public final class MusicAnalyticTapsLinkName {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicAnalyticTapsLinkName[] $VALUES;
    public static final MusicAnalyticTapsLinkName COLLECTION;
    public static final a Companion;
    public static final MusicAnalyticTapsLinkName RECENT;
    public static final MusicAnalyticTapsLinkName RECENT_TRACKS;
    private final String value;

    /* compiled from: MusicAnalyticTapsLinkName.kt */
    public static final class a {
    }

    static {
        MusicAnalyticTapsLinkName musicAnalyticTapsLinkName = new MusicAnalyticTapsLinkName("COLLECTION", 0, "collection");
        COLLECTION = musicAnalyticTapsLinkName;
        MusicAnalyticTapsLinkName musicAnalyticTapsLinkName2 = new MusicAnalyticTapsLinkName("RECENT_TRACKS", 1, "recent_tracks");
        RECENT_TRACKS = musicAnalyticTapsLinkName2;
        MusicAnalyticTapsLinkName musicAnalyticTapsLinkName3 = new MusicAnalyticTapsLinkName("RECENT", 2, "recent");
        RECENT = musicAnalyticTapsLinkName3;
        MusicAnalyticTapsLinkName[] musicAnalyticTapsLinkNameArr = {musicAnalyticTapsLinkName, musicAnalyticTapsLinkName2, musicAnalyticTapsLinkName3};
        $VALUES = musicAnalyticTapsLinkNameArr;
        $ENTRIES = new asp(musicAnalyticTapsLinkNameArr);
        Companion = new a();
    }

    public MusicAnalyticTapsLinkName(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MusicAnalyticTapsLinkName> h() {
        return $ENTRIES;
    }

    public static MusicAnalyticTapsLinkName valueOf(String str) {
        return (MusicAnalyticTapsLinkName) Enum.valueOf(MusicAnalyticTapsLinkName.class, str);
    }

    public static MusicAnalyticTapsLinkName[] values() {
        return (MusicAnalyticTapsLinkName[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
