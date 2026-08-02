package com.vk.catalog2.feature.music.holders.concert;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConcertCardType.kt */
/* loaded from: classes16.dex */
public final class ConcertCardType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConcertCardType[] $VALUES;
    public static final ConcertCardType ARTIST_CARD;
    public static final ConcertCardType FULL_PAGE;
    public static final ConcertCardType SEARCH_CARD;

    static {
        ConcertCardType concertCardType = new ConcertCardType("ARTIST_CARD", 0);
        ARTIST_CARD = concertCardType;
        ConcertCardType concertCardType2 = new ConcertCardType("SEARCH_CARD", 1);
        SEARCH_CARD = concertCardType2;
        ConcertCardType concertCardType3 = new ConcertCardType("FULL_PAGE", 2);
        FULL_PAGE = concertCardType3;
        ConcertCardType[] concertCardTypeArr = {concertCardType, concertCardType2, concertCardType3};
        $VALUES = concertCardTypeArr;
        $ENTRIES = new asp(concertCardTypeArr);
    }

    public ConcertCardType() {
        throw null;
    }

    public static ConcertCardType valueOf(String str) {
        return (ConcertCardType) Enum.valueOf(ConcertCardType.class, str);
    }

    public static ConcertCardType[] values() {
        return (ConcertCardType[]) $VALUES.clone();
    }
}
