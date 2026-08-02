package com.vk.ecomm.product_list.router;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductListContentType.kt */
/* loaded from: classes18.dex */
public final class ProductListContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductListContentType[] $VALUES;
    public static final ProductListContentType PRODUCTS;
    public static final ProductListContentType PRODUCTS_AND_SERVICES;
    public static final ProductListContentType SERVICES;

    static {
        ProductListContentType productListContentType = new ProductListContentType("PRODUCTS", 0);
        PRODUCTS = productListContentType;
        ProductListContentType productListContentType2 = new ProductListContentType("SERVICES", 1);
        SERVICES = productListContentType2;
        ProductListContentType productListContentType3 = new ProductListContentType("PRODUCTS_AND_SERVICES", 2);
        PRODUCTS_AND_SERVICES = productListContentType3;
        ProductListContentType[] productListContentTypeArr = {productListContentType, productListContentType2, productListContentType3};
        $VALUES = productListContentTypeArr;
        $ENTRIES = new asp(productListContentTypeArr);
    }

    public ProductListContentType() {
        throw null;
    }

    public static ProductListContentType valueOf(String str) {
        return (ProductListContentType) Enum.valueOf(ProductListContentType.class, str);
    }

    public static ProductListContentType[] values() {
        return (ProductListContentType[]) $VALUES.clone();
    }
}
