package com.vk.ecomm.core.models.product;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductItemType.kt */
/* loaded from: classes18.dex */
public final class ProductItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductItemType[] $VALUES;
    public static final ProductItemType OZON;
    public static final ProductItemType VK;
    private final int value;

    static {
        ProductItemType productItemType = new ProductItemType("VK", 0, 0);
        VK = productItemType;
        ProductItemType productItemType2 = new ProductItemType("OZON", 1, 3);
        OZON = productItemType2;
        ProductItemType[] productItemTypeArr = {productItemType, productItemType2};
        $VALUES = productItemTypeArr;
        $ENTRIES = new asp(productItemTypeArr);
    }

    public ProductItemType(String str, int i, int i2) {
        this.value = i2;
    }

    public static ProductItemType valueOf(String str) {
        return (ProductItemType) Enum.valueOf(ProductItemType.class, str);
    }

    public static ProductItemType[] values() {
        return (ProductItemType[]) $VALUES.clone();
    }
}
