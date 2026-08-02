package com.vk.ecomm.design.compose.pagintaiondots;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketPaginationDots.kt */
/* loaded from: classes18.dex */
public final class MarketPaginationDotsSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketPaginationDotsSize[] $VALUES;
    public static final MarketPaginationDotsSize Large;
    public static final MarketPaginationDotsSize Small;

    static {
        MarketPaginationDotsSize marketPaginationDotsSize = new MarketPaginationDotsSize("Small", 0);
        Small = marketPaginationDotsSize;
        MarketPaginationDotsSize marketPaginationDotsSize2 = new MarketPaginationDotsSize("Large", 1);
        Large = marketPaginationDotsSize2;
        MarketPaginationDotsSize[] marketPaginationDotsSizeArr = {marketPaginationDotsSize, marketPaginationDotsSize2};
        $VALUES = marketPaginationDotsSizeArr;
        $ENTRIES = new asp(marketPaginationDotsSizeArr);
    }

    public MarketPaginationDotsSize() {
        throw null;
    }

    public static MarketPaginationDotsSize valueOf(String str) {
        return (MarketPaginationDotsSize) Enum.valueOf(MarketPaginationDotsSize.class, str);
    }

    public static MarketPaginationDotsSize[] values() {
        return (MarketPaginationDotsSize[]) $VALUES.clone();
    }
}
