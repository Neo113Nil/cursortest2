package com.vk.ecomm.market.good.good2.presentation.label;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class ProductLabelType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductLabelType[] $VALUES;
    public static final ProductLabelType OZON;
    public static final ProductLabelType VK;

    static {
        ProductLabelType productLabelType = new ProductLabelType("VK", 0);
        VK = productLabelType;
        ProductLabelType productLabelType2 = new ProductLabelType("OZON", 1);
        OZON = productLabelType2;
        ProductLabelType[] productLabelTypeArr = {productLabelType, productLabelType2};
        $VALUES = productLabelTypeArr;
        $ENTRIES = new asp(productLabelTypeArr);
    }

    public ProductLabelType() {
        throw null;
    }

    public static ProductLabelType valueOf(String str) {
        return (ProductLabelType) Enum.valueOf(ProductLabelType.class, str);
    }

    public static ProductLabelType[] values() {
        return (ProductLabelType[]) $VALUES.clone();
    }
}
