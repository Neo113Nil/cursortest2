package com.vk.ecomm.product_list.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductListRefSource.kt */
/* loaded from: classes18.dex */
public final class ProductListRefSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductListRefSource[] $VALUES;
    public static final ProductListRefSource IM_CHAT_CLIP;
    public static final ProductListRefSource IM_CHAT_PHOTO;
    public static final ProductListRefSource IM_CHAT_POST;

    static {
        ProductListRefSource productListRefSource = new ProductListRefSource("IM_CHAT_POST", 0);
        IM_CHAT_POST = productListRefSource;
        ProductListRefSource productListRefSource2 = new ProductListRefSource("IM_CHAT_CLIP", 1);
        IM_CHAT_CLIP = productListRefSource2;
        ProductListRefSource productListRefSource3 = new ProductListRefSource("IM_CHAT_PHOTO", 2);
        IM_CHAT_PHOTO = productListRefSource3;
        ProductListRefSource[] productListRefSourceArr = {productListRefSource, productListRefSource2, productListRefSource3};
        $VALUES = productListRefSourceArr;
        $ENTRIES = new asp(productListRefSourceArr);
    }

    public ProductListRefSource() {
        throw null;
    }

    public static ProductListRefSource valueOf(String str) {
        return (ProductListRefSource) Enum.valueOf(ProductListRefSource.class, str);
    }

    public static ProductListRefSource[] values() {
        return (ProductListRefSource[]) $VALUES.clone();
    }
}
