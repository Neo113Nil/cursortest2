package com.vk.ecomm.products_selection.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductsSelectionContextContent.kt */
/* loaded from: classes18.dex */
public final class ProductsSelectionContextContent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductsSelectionContextContent[] $VALUES;
    public static final ProductsSelectionContextContent Clip;
    public static final ProductsSelectionContextContent Live;

    static {
        ProductsSelectionContextContent productsSelectionContextContent = new ProductsSelectionContextContent("Live", 0);
        Live = productsSelectionContextContent;
        ProductsSelectionContextContent productsSelectionContextContent2 = new ProductsSelectionContextContent("Clip", 1);
        Clip = productsSelectionContextContent2;
        ProductsSelectionContextContent[] productsSelectionContextContentArr = {productsSelectionContextContent, productsSelectionContextContent2};
        $VALUES = productsSelectionContextContentArr;
        $ENTRIES = new asp(productsSelectionContextContentArr);
    }

    public ProductsSelectionContextContent() {
        throw null;
    }

    public static ProductsSelectionContextContent valueOf(String str) {
        return (ProductsSelectionContextContent) Enum.valueOf(ProductsSelectionContextContent.class, str);
    }

    public static ProductsSelectionContextContent[] values() {
        return (ProductsSelectionContextContent[]) $VALUES.clone();
    }
}
