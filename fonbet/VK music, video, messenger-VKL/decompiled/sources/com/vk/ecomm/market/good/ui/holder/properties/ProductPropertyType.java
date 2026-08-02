package com.vk.ecomm.market.good.ui.holder.properties;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductPropertyItem.kt */
/* loaded from: classes18.dex */
public final class ProductPropertyType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductPropertyType[] $VALUES;
    public static final ProductPropertyType TYPE_COLOR;
    public static final ProductPropertyType TYPE_IMAGE;
    public static final ProductPropertyType TYPE_TEXT;

    static {
        ProductPropertyType productPropertyType = new ProductPropertyType("TYPE_TEXT", 0);
        TYPE_TEXT = productPropertyType;
        ProductPropertyType productPropertyType2 = new ProductPropertyType("TYPE_COLOR", 1);
        TYPE_COLOR = productPropertyType2;
        ProductPropertyType productPropertyType3 = new ProductPropertyType("TYPE_IMAGE", 2);
        TYPE_IMAGE = productPropertyType3;
        ProductPropertyType[] productPropertyTypeArr = {productPropertyType, productPropertyType2, productPropertyType3};
        $VALUES = productPropertyTypeArr;
        $ENTRIES = new asp(productPropertyTypeArr);
    }

    public ProductPropertyType() {
        throw null;
    }

    public static ProductPropertyType valueOf(String str) {
        return (ProductPropertyType) Enum.valueOf(ProductPropertyType.class, str);
    }

    public static ProductPropertyType[] values() {
        return (ProductPropertyType[]) $VALUES.clone();
    }
}
