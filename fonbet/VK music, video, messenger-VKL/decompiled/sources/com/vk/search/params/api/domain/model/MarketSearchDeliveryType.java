package com.vk.search.params.api.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchDeliveryType.kt */
/* loaded from: classes5.dex */
public final class MarketSearchDeliveryType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchDeliveryType[] $VALUES;
    public static final MarketSearchDeliveryType ANY;
    public static final MarketSearchDeliveryType COURIER;
    public static final MarketSearchDeliveryType PICKUP;

    static {
        MarketSearchDeliveryType marketSearchDeliveryType = new MarketSearchDeliveryType("ANY", 0);
        ANY = marketSearchDeliveryType;
        MarketSearchDeliveryType marketSearchDeliveryType2 = new MarketSearchDeliveryType("COURIER", 1);
        COURIER = marketSearchDeliveryType2;
        MarketSearchDeliveryType marketSearchDeliveryType3 = new MarketSearchDeliveryType("PICKUP", 2);
        PICKUP = marketSearchDeliveryType3;
        MarketSearchDeliveryType[] marketSearchDeliveryTypeArr = {marketSearchDeliveryType, marketSearchDeliveryType2, marketSearchDeliveryType3};
        $VALUES = marketSearchDeliveryTypeArr;
        $ENTRIES = new asp(marketSearchDeliveryTypeArr);
    }

    public MarketSearchDeliveryType() {
        throw null;
    }

    public static zrp<MarketSearchDeliveryType> h() {
        return $ENTRIES;
    }

    public static MarketSearchDeliveryType valueOf(String str) {
        return (MarketSearchDeliveryType) Enum.valueOf(MarketSearchDeliveryType.class, str);
    }

    public static MarketSearchDeliveryType[] values() {
        return (MarketSearchDeliveryType[]) $VALUES.clone();
    }
}
