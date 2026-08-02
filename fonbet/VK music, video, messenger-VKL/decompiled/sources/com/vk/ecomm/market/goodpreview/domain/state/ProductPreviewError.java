package com.vk.ecomm.market.goodpreview.domain.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductPreviewError.kt */
/* loaded from: classes18.dex */
public final class ProductPreviewError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductPreviewError[] $VALUES;
    public static final ProductPreviewError Internet;
    public static final ProductPreviewError Server;

    static {
        ProductPreviewError productPreviewError = new ProductPreviewError("Internet", 0);
        Internet = productPreviewError;
        ProductPreviewError productPreviewError2 = new ProductPreviewError("Server", 1);
        Server = productPreviewError2;
        ProductPreviewError[] productPreviewErrorArr = {productPreviewError, productPreviewError2};
        $VALUES = productPreviewErrorArr;
        $ENTRIES = new asp(productPreviewErrorArr);
    }

    public ProductPreviewError() {
        throw null;
    }

    public static ProductPreviewError valueOf(String str) {
        return (ProductPreviewError) Enum.valueOf(ProductPreviewError.class, str);
    }

    public static ProductPreviewError[] values() {
        return (ProductPreviewError[]) $VALUES.clone();
    }
}
