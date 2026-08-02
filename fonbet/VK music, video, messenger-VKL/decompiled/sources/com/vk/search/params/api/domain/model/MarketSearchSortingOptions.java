package com.vk.search.params.api.domain.model;

import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchSortingOptions.kt */
/* loaded from: classes5.dex */
public final class MarketSearchSortingOptions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchSortingOptions[] $VALUES;
    public static final MarketSearchSortingOptions COST_ASC;
    public static final MarketSearchSortingOptions COST_DESC;
    public static final a Companion;
    public static final MarketSearchSortingOptions DEFAULT;
    public static final MarketSearchSortingOptions NOVELTY;
    public static final MarketSearchSortingOptions RATING_DESC;
    private final String value;

    /* compiled from: MarketSearchSortingOptions.kt */
    public static final class a {
    }

    static {
        MarketSearchSortingOptions marketSearchSortingOptions = new MarketSearchSortingOptions("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = marketSearchSortingOptions;
        MarketSearchSortingOptions marketSearchSortingOptions2 = new MarketSearchSortingOptions("COST_ASC", 1, "market.price.asc");
        COST_ASC = marketSearchSortingOptions2;
        MarketSearchSortingOptions marketSearchSortingOptions3 = new MarketSearchSortingOptions("COST_DESC", 2, "market.price.desc");
        COST_DESC = marketSearchSortingOptions3;
        MarketSearchSortingOptions marketSearchSortingOptions4 = new MarketSearchSortingOptions("NOVELTY", 3, "market.date.desc");
        NOVELTY = marketSearchSortingOptions4;
        MarketSearchSortingOptions marketSearchSortingOptions5 = new MarketSearchSortingOptions("RATING_DESC", 4, "market.rating.desc");
        RATING_DESC = marketSearchSortingOptions5;
        MarketSearchSortingOptions[] marketSearchSortingOptionsArr = {marketSearchSortingOptions, marketSearchSortingOptions2, marketSearchSortingOptions3, marketSearchSortingOptions4, marketSearchSortingOptions5};
        $VALUES = marketSearchSortingOptionsArr;
        $ENTRIES = new asp(marketSearchSortingOptionsArr);
        Companion = new a();
    }

    public MarketSearchSortingOptions(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MarketSearchSortingOptions> h() {
        return $ENTRIES;
    }

    public static MarketSearchSortingOptions valueOf(String str) {
        return (MarketSearchSortingOptions) Enum.valueOf(MarketSearchSortingOptions.class, str);
    }

    public static MarketSearchSortingOptions[] values() {
        return (MarketSearchSortingOptions[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
