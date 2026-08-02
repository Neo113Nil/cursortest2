package com.vk.ecomm.market.api.labels;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketItemModalApproveInfoModel.kt */
/* loaded from: classes18.dex */
public final class MarketModalContentItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketModalContentItem[] $VALUES;
    public static final MarketModalContentItem FULL_SIZE_APPLICATION;
    public static final MarketModalContentItem FULL_SIZE_DELIVERY;
    public static final MarketModalContentItem FULL_SIZE_PAYMENT;

    static {
        MarketModalContentItem marketModalContentItem = new MarketModalContentItem("FULL_SIZE_APPLICATION", 0);
        FULL_SIZE_APPLICATION = marketModalContentItem;
        MarketModalContentItem marketModalContentItem2 = new MarketModalContentItem("FULL_SIZE_PAYMENT", 1);
        FULL_SIZE_PAYMENT = marketModalContentItem2;
        MarketModalContentItem marketModalContentItem3 = new MarketModalContentItem("FULL_SIZE_DELIVERY", 2);
        FULL_SIZE_DELIVERY = marketModalContentItem3;
        MarketModalContentItem[] marketModalContentItemArr = {marketModalContentItem, marketModalContentItem2, marketModalContentItem3};
        $VALUES = marketModalContentItemArr;
        $ENTRIES = new asp(marketModalContentItemArr);
    }

    public MarketModalContentItem() {
        throw null;
    }

    public static MarketModalContentItem valueOf(String str) {
        return (MarketModalContentItem) Enum.valueOf(MarketModalContentItem.class, str);
    }

    public static MarketModalContentItem[] values() {
        return (MarketModalContentItem[]) $VALUES.clone();
    }
}
