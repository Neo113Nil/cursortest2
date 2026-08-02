package com.vk.ecomm.market.good.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCardError.kt */
/* loaded from: classes18.dex */
public final class ProductCardError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductCardError[] $VALUES;
    public static final ProductCardError Internet;
    public static final ProductCardError Server;

    static {
        ProductCardError productCardError = new ProductCardError("Internet", 0);
        Internet = productCardError;
        ProductCardError productCardError2 = new ProductCardError("Server", 1);
        Server = productCardError2;
        ProductCardError[] productCardErrorArr = {productCardError, productCardError2};
        $VALUES = productCardErrorArr;
        $ENTRIES = new asp(productCardErrorArr);
    }

    public ProductCardError() {
        throw null;
    }

    public static ProductCardError valueOf(String str) {
        return (ProductCardError) Enum.valueOf(ProductCardError.class, str);
    }

    public static ProductCardError[] values() {
        return (ProductCardError[]) $VALUES.clone();
    }
}
