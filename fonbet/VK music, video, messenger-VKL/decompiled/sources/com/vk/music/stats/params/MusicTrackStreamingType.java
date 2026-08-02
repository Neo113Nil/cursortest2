package com.vk.music.stats.params;

import xsna.asp;
import xsna.eok;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicTrackStreamingType.kt */
/* loaded from: classes3.dex */
public final class MusicTrackStreamingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicTrackStreamingType[] $VALUES;
    public static final MusicTrackStreamingType NONE;
    public static final MusicTrackStreamingType OFFLINE;
    public static final MusicTrackStreamingType ONLINE;
    public static final MusicTrackStreamingType ONLINE_CACHE;
    private final String value;

    static {
        MusicTrackStreamingType musicTrackStreamingType = new MusicTrackStreamingType("NONE", 0, "none");
        NONE = musicTrackStreamingType;
        MusicTrackStreamingType musicTrackStreamingType2 = new MusicTrackStreamingType("ONLINE", 1, eok.ONLINE_EXTRAS_KEY);
        ONLINE = musicTrackStreamingType2;
        MusicTrackStreamingType musicTrackStreamingType3 = new MusicTrackStreamingType("OFFLINE", 2, "offline");
        OFFLINE = musicTrackStreamingType3;
        MusicTrackStreamingType musicTrackStreamingType4 = new MusicTrackStreamingType("ONLINE_CACHE", 3, "online_cache");
        ONLINE_CACHE = musicTrackStreamingType4;
        MusicTrackStreamingType[] musicTrackStreamingTypeArr = {musicTrackStreamingType, musicTrackStreamingType2, musicTrackStreamingType3, musicTrackStreamingType4};
        $VALUES = musicTrackStreamingTypeArr;
        $ENTRIES = new asp(musicTrackStreamingTypeArr);
    }

    public MusicTrackStreamingType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MusicTrackStreamingType valueOf(String str) {
        return (MusicTrackStreamingType) Enum.valueOf(MusicTrackStreamingType.class, str);
    }

    public static MusicTrackStreamingType[] values() {
        return (MusicTrackStreamingType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
