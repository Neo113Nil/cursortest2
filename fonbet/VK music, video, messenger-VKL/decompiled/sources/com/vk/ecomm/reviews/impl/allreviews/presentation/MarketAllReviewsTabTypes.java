package com.vk.ecomm.reviews.impl.allreviews.presentation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketAllReviewsState.kt */
/* loaded from: classes18.dex */
public final class MarketAllReviewsTabTypes {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketAllReviewsTabTypes[] $VALUES;
    public static final MarketAllReviewsTabTypes COMMUNITY;
    public static final MarketAllReviewsTabTypes MARKET_ITEM;

    static {
        MarketAllReviewsTabTypes marketAllReviewsTabTypes = new MarketAllReviewsTabTypes("COMMUNITY", 0);
        COMMUNITY = marketAllReviewsTabTypes;
        MarketAllReviewsTabTypes marketAllReviewsTabTypes2 = new MarketAllReviewsTabTypes("MARKET_ITEM", 1);
        MARKET_ITEM = marketAllReviewsTabTypes2;
        MarketAllReviewsTabTypes[] marketAllReviewsTabTypesArr = {marketAllReviewsTabTypes, marketAllReviewsTabTypes2};
        $VALUES = marketAllReviewsTabTypesArr;
        $ENTRIES = new asp(marketAllReviewsTabTypesArr);
    }

    public MarketAllReviewsTabTypes() {
        throw null;
    }

    public static MarketAllReviewsTabTypes valueOf(String str) {
        return (MarketAllReviewsTabTypes) Enum.valueOf(MarketAllReviewsTabTypes.class, str);
    }

    public static MarketAllReviewsTabTypes[] values() {
        return (MarketAllReviewsTabTypes[]) $VALUES.clone();
    }
}
