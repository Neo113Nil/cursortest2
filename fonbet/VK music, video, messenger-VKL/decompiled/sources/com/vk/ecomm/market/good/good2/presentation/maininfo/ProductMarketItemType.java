package com.vk.ecomm.market.good.good2.presentation.maininfo;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCardMainInfoState.kt */
/* loaded from: classes18.dex */
public final class ProductMarketItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductMarketItemType[] $VALUES;
    public static final ProductMarketItemType OZON;
    public static final ProductMarketItemType VK;

    static {
        ProductMarketItemType productMarketItemType = new ProductMarketItemType("VK", 0);
        VK = productMarketItemType;
        ProductMarketItemType productMarketItemType2 = new ProductMarketItemType("OZON", 1);
        OZON = productMarketItemType2;
        ProductMarketItemType[] productMarketItemTypeArr = {productMarketItemType, productMarketItemType2};
        $VALUES = productMarketItemTypeArr;
        $ENTRIES = new asp(productMarketItemTypeArr);
    }

    public ProductMarketItemType() {
        throw null;
    }

    public static ProductMarketItemType valueOf(String str) {
        return (ProductMarketItemType) Enum.valueOf(ProductMarketItemType.class, str);
    }

    public static ProductMarketItemType[] values() {
        return (ProductMarketItemType[]) $VALUES.clone();
    }
}
