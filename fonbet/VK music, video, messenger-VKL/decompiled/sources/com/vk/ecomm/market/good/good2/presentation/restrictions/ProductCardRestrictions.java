package com.vk.ecomm.market.good.good2.presentation.restrictions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCardRestrictions.kt */
/* loaded from: classes18.dex */
public final class ProductCardRestrictions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductCardRestrictions[] $VALUES;
    public static final ProductCardRestrictions FULLY_RESTRICTIONS;
    public static final ProductCardRestrictions NO_RESTRICTIONS;
    public static final ProductCardRestrictions PARTIALLY_RESTRICTIONS;

    static {
        ProductCardRestrictions productCardRestrictions = new ProductCardRestrictions("NO_RESTRICTIONS", 0);
        NO_RESTRICTIONS = productCardRestrictions;
        ProductCardRestrictions productCardRestrictions2 = new ProductCardRestrictions("FULLY_RESTRICTIONS", 1);
        FULLY_RESTRICTIONS = productCardRestrictions2;
        ProductCardRestrictions productCardRestrictions3 = new ProductCardRestrictions("PARTIALLY_RESTRICTIONS", 2);
        PARTIALLY_RESTRICTIONS = productCardRestrictions3;
        ProductCardRestrictions[] productCardRestrictionsArr = {productCardRestrictions, productCardRestrictions2, productCardRestrictions3};
        $VALUES = productCardRestrictionsArr;
        $ENTRIES = new asp(productCardRestrictionsArr);
    }

    public ProductCardRestrictions() {
        throw null;
    }

    public static ProductCardRestrictions valueOf(String str) {
        return (ProductCardRestrictions) Enum.valueOf(ProductCardRestrictions.class, str);
    }

    public static ProductCardRestrictions[] values() {
        return (ProductCardRestrictions[]) $VALUES.clone();
    }
}
