package com.vk.ecomm.products_selection.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductsSelectionRefSource.kt */
/* loaded from: classes18.dex */
public final class ProductsSelectionRefSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductsSelectionRefSource[] $VALUES;
    public static final ProductsSelectionRefSource ClipsAttachedItems;
    public static final ProductsSelectionRefSource LivesAttachedItems;

    static {
        ProductsSelectionRefSource productsSelectionRefSource = new ProductsSelectionRefSource("LivesAttachedItems", 0);
        LivesAttachedItems = productsSelectionRefSource;
        ProductsSelectionRefSource productsSelectionRefSource2 = new ProductsSelectionRefSource("ClipsAttachedItems", 1);
        ClipsAttachedItems = productsSelectionRefSource2;
        ProductsSelectionRefSource[] productsSelectionRefSourceArr = {productsSelectionRefSource, productsSelectionRefSource2};
        $VALUES = productsSelectionRefSourceArr;
        $ENTRIES = new asp(productsSelectionRefSourceArr);
    }

    public ProductsSelectionRefSource() {
        throw null;
    }

    public static ProductsSelectionRefSource valueOf(String str) {
        return (ProductsSelectionRefSource) Enum.valueOf(ProductsSelectionRefSource.class, str);
    }

    public static ProductsSelectionRefSource[] values() {
        return (ProductsSelectionRefSource[]) $VALUES.clone();
    }
}
