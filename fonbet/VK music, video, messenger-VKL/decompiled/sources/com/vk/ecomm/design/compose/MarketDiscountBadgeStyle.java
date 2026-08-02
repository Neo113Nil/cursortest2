package com.vk.ecomm.design.compose;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketDiscountBadge.kt */
/* loaded from: classes18.dex */
public final class MarketDiscountBadgeStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketDiscountBadgeStyle[] $VALUES;
    public static final MarketDiscountBadgeStyle Accent;
    public static final MarketDiscountBadgeStyle Contrast;

    static {
        MarketDiscountBadgeStyle marketDiscountBadgeStyle = new MarketDiscountBadgeStyle("Accent", 0);
        Accent = marketDiscountBadgeStyle;
        MarketDiscountBadgeStyle marketDiscountBadgeStyle2 = new MarketDiscountBadgeStyle("Contrast", 1);
        Contrast = marketDiscountBadgeStyle2;
        MarketDiscountBadgeStyle[] marketDiscountBadgeStyleArr = {marketDiscountBadgeStyle, marketDiscountBadgeStyle2};
        $VALUES = marketDiscountBadgeStyleArr;
        $ENTRIES = new asp(marketDiscountBadgeStyleArr);
    }

    public MarketDiscountBadgeStyle() {
        throw null;
    }

    public static MarketDiscountBadgeStyle valueOf(String str) {
        return (MarketDiscountBadgeStyle) Enum.valueOf(MarketDiscountBadgeStyle.class, str);
    }

    public static MarketDiscountBadgeStyle[] values() {
        return (MarketDiscountBadgeStyle[]) $VALUES.clone();
    }
}
