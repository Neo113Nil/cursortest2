package com.vk.catalog2.feature.music.ui.holder.market;

import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMusicItemSource.kt */
/* loaded from: classes16.dex */
public final class MarketMusicItemSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketMusicItemSource[] $VALUES;
    public static final MarketMusicItemSource ARTIST_CARD;
    public static final MarketMusicItemSource ARTIST_CARD_FULLPAGE;
    public static final MarketMusicItemSource SEARCH_CARD;
    public static final MarketMusicItemSource SEARCH_CARD_FULLPAGE;
    private final CommonMarketStat$TypeRefSource refSource;

    static {
        MarketMusicItemSource marketMusicItemSource = new MarketMusicItemSource("ARTIST_CARD", 0, CommonMarketStat$TypeRefSource.MUSICIAN_CARD_MERCH);
        ARTIST_CARD = marketMusicItemSource;
        MarketMusicItemSource marketMusicItemSource2 = new MarketMusicItemSource("ARTIST_CARD_FULLPAGE", 1, CommonMarketStat$TypeRefSource.MUSICIAN_CARD_MERCH_FULLPAGE);
        ARTIST_CARD_FULLPAGE = marketMusicItemSource2;
        MarketMusicItemSource marketMusicItemSource3 = new MarketMusicItemSource("SEARCH_CARD", 2, CommonMarketStat$TypeRefSource.SEARCH_MERCH_ARTIST);
        SEARCH_CARD = marketMusicItemSource3;
        MarketMusicItemSource marketMusicItemSource4 = new MarketMusicItemSource("SEARCH_CARD_FULLPAGE", 3, CommonMarketStat$TypeRefSource.SEARCH_MERCH_ARTIST_FULLPAGE);
        SEARCH_CARD_FULLPAGE = marketMusicItemSource4;
        MarketMusicItemSource[] marketMusicItemSourceArr = {marketMusicItemSource, marketMusicItemSource2, marketMusicItemSource3, marketMusicItemSource4};
        $VALUES = marketMusicItemSourceArr;
        $ENTRIES = new asp(marketMusicItemSourceArr);
    }

    public MarketMusicItemSource(String str, int i, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.refSource = commonMarketStat$TypeRefSource;
    }

    public static MarketMusicItemSource valueOf(String str) {
        return (MarketMusicItemSource) Enum.valueOf(MarketMusicItemSource.class, str);
    }

    public static MarketMusicItemSource[] values() {
        return (MarketMusicItemSource[]) $VALUES.clone();
    }

    public final CommonMarketStat$TypeRefSource h() {
        return this.refSource;
    }
}
