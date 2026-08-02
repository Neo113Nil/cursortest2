package com.vk.ecomm.market.api.search.filters.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSortingOptions.kt */
/* loaded from: classes18.dex */
public final class MarketSortingOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSortingOptions[] $VALUES;
    public static final MarketSortingOptions COST_ASC;
    public static final MarketSortingOptions COST_DESC;
    public static final MarketSortingOptions DEFAULT;
    public static final MarketSortingOptions NOVELTY;
    public static final MarketSortingOptions RATING_DESC;

    static {
        MarketSortingOptions marketSortingOptions = new MarketSortingOptions("DEFAULT", 0);
        DEFAULT = marketSortingOptions;
        MarketSortingOptions marketSortingOptions2 = new MarketSortingOptions("COST_ASC", 1);
        COST_ASC = marketSortingOptions2;
        MarketSortingOptions marketSortingOptions3 = new MarketSortingOptions("COST_DESC", 2);
        COST_DESC = marketSortingOptions3;
        MarketSortingOptions marketSortingOptions4 = new MarketSortingOptions("NOVELTY", 3);
        NOVELTY = marketSortingOptions4;
        MarketSortingOptions marketSortingOptions5 = new MarketSortingOptions("RATING_DESC", 4);
        RATING_DESC = marketSortingOptions5;
        MarketSortingOptions[] marketSortingOptionsArr = {marketSortingOptions, marketSortingOptions2, marketSortingOptions3, marketSortingOptions4, marketSortingOptions5};
        $VALUES = marketSortingOptionsArr;
        $ENTRIES = new asp(marketSortingOptionsArr);
    }

    public MarketSortingOptions() {
        throw null;
    }

    public static zrp<MarketSortingOptions> h() {
        return $ENTRIES;
    }

    public static MarketSortingOptions valueOf(String str) {
        return (MarketSortingOptions) Enum.valueOf(MarketSortingOptions.class, str);
    }

    public static MarketSortingOptions[] values() {
        return (MarketSortingOptions[]) $VALUES.clone();
    }
}
