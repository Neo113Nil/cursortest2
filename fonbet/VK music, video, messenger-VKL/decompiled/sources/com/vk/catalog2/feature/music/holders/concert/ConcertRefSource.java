package com.vk.catalog2.feature.music.holders.concert;

import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConcertRefSource.kt */
/* loaded from: classes16.dex */
public final class ConcertRefSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConcertRefSource[] $VALUES;
    public static final ConcertRefSource ARTIST_CARD;
    public static final ConcertRefSource ARTIST_CARD_FULLPAGE;
    public static final ConcertRefSource SEARCH_ARTIST;
    public static final ConcertRefSource SEARCH_ARTIST_FULLPAGE;
    private final CommonAudioStat$TypeAudioArtistClickItem.RefSource value;

    static {
        ConcertRefSource concertRefSource = new ConcertRefSource("ARTIST_CARD", 0, CommonAudioStat$TypeAudioArtistClickItem.RefSource.AUDIO_ARTIST_CONCERT);
        ARTIST_CARD = concertRefSource;
        ConcertRefSource concertRefSource2 = new ConcertRefSource("ARTIST_CARD_FULLPAGE", 1, CommonAudioStat$TypeAudioArtistClickItem.RefSource.AUDIO_ARTIST_CONCERT_FULLPAGE);
        ARTIST_CARD_FULLPAGE = concertRefSource2;
        ConcertRefSource concertRefSource3 = new ConcertRefSource("SEARCH_ARTIST", 2, CommonAudioStat$TypeAudioArtistClickItem.RefSource.SEARCH_AUDIO_ARTIST_CONCERT);
        SEARCH_ARTIST = concertRefSource3;
        ConcertRefSource concertRefSource4 = new ConcertRefSource("SEARCH_ARTIST_FULLPAGE", 3, CommonAudioStat$TypeAudioArtistClickItem.RefSource.SEARCH_AUDIO_ARTIST_CONCERT_FULLPAGE);
        SEARCH_ARTIST_FULLPAGE = concertRefSource4;
        ConcertRefSource[] concertRefSourceArr = {concertRefSource, concertRefSource2, concertRefSource3, concertRefSource4};
        $VALUES = concertRefSourceArr;
        $ENTRIES = new asp(concertRefSourceArr);
    }

    public ConcertRefSource(String str, int i, CommonAudioStat$TypeAudioArtistClickItem.RefSource refSource) {
        this.value = refSource;
    }

    public static ConcertRefSource valueOf(String str) {
        return (ConcertRefSource) Enum.valueOf(ConcertRefSource.class, str);
    }

    public static ConcertRefSource[] values() {
        return (ConcertRefSource[]) $VALUES.clone();
    }

    public final CommonAudioStat$TypeAudioArtistClickItem.RefSource h() {
        return this.value;
    }
}
