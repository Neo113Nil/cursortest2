package com.vk.ecomm.design.compose.property.config;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketProperty.kt */
/* loaded from: classes18.dex */
public final class MarketProperty$VariantState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketProperty$VariantState[] $VALUES;
    public static final MarketProperty$VariantState AVAILABLE;
    public static final MarketProperty$VariantState RUN_OUT;
    public static final MarketProperty$VariantState SELECTED;
    public static final MarketProperty$VariantState UNAVAILABLE;

    static {
        MarketProperty$VariantState marketProperty$VariantState = new MarketProperty$VariantState("AVAILABLE", 0);
        AVAILABLE = marketProperty$VariantState;
        MarketProperty$VariantState marketProperty$VariantState2 = new MarketProperty$VariantState("SELECTED", 1);
        SELECTED = marketProperty$VariantState2;
        MarketProperty$VariantState marketProperty$VariantState3 = new MarketProperty$VariantState("UNAVAILABLE", 2);
        UNAVAILABLE = marketProperty$VariantState3;
        MarketProperty$VariantState marketProperty$VariantState4 = new MarketProperty$VariantState("RUN_OUT", 3);
        RUN_OUT = marketProperty$VariantState4;
        MarketProperty$VariantState[] marketProperty$VariantStateArr = {marketProperty$VariantState, marketProperty$VariantState2, marketProperty$VariantState3, marketProperty$VariantState4};
        $VALUES = marketProperty$VariantStateArr;
        $ENTRIES = new asp(marketProperty$VariantStateArr);
    }

    public MarketProperty$VariantState() {
        throw null;
    }

    public static MarketProperty$VariantState valueOf(String str) {
        return (MarketProperty$VariantState) Enum.valueOf(MarketProperty$VariantState.class, str);
    }

    public static MarketProperty$VariantState[] values() {
        return (MarketProperty$VariantState[]) $VALUES.clone();
    }
}
