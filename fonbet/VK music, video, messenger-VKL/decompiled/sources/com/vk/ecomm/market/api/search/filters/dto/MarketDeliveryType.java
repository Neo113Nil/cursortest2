package com.vk.ecomm.market.api.search.filters.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketDeliveryType.kt */
/* loaded from: classes18.dex */
public final class MarketDeliveryType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketDeliveryType[] $VALUES;
    public static final MarketDeliveryType ANY;
    public static final MarketDeliveryType COURIER;
    public static final MarketDeliveryType PICKUP;

    static {
        MarketDeliveryType marketDeliveryType = new MarketDeliveryType("ANY", 0);
        ANY = marketDeliveryType;
        MarketDeliveryType marketDeliveryType2 = new MarketDeliveryType("COURIER", 1);
        COURIER = marketDeliveryType2;
        MarketDeliveryType marketDeliveryType3 = new MarketDeliveryType("PICKUP", 2);
        PICKUP = marketDeliveryType3;
        MarketDeliveryType[] marketDeliveryTypeArr = {marketDeliveryType, marketDeliveryType2, marketDeliveryType3};
        $VALUES = marketDeliveryTypeArr;
        $ENTRIES = new asp(marketDeliveryTypeArr);
    }

    public MarketDeliveryType() {
        throw null;
    }

    public static zrp<MarketDeliveryType> h() {
        return $ENTRIES;
    }

    public static MarketDeliveryType valueOf(String str) {
        return (MarketDeliveryType) Enum.valueOf(MarketDeliveryType.class, str);
    }

    public static MarketDeliveryType[] values() {
        return (MarketDeliveryType[]) $VALUES.clone();
    }
}
