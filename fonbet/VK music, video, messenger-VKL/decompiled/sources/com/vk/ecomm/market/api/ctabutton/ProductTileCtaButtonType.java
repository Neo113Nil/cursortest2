package com.vk.ecomm.market.api.ctabutton;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductTileCtaButtonType.kt */
/* loaded from: classes18.dex */
public final class ProductTileCtaButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductTileCtaButtonType[] $VALUES;
    public static final ProductTileCtaButtonType ADD_TO_CART;
    public static final ProductTileCtaButtonType CALL;
    public static final a Companion;
    public static final ProductTileCtaButtonType DISABLED;
    public static final ProductTileCtaButtonType GO_TO_CART;
    public static final ProductTileCtaButtonType LINK;
    public static final ProductTileCtaButtonType PARTNER_LINK;
    public static final ProductTileCtaButtonType SIMILAR;
    public static final ProductTileCtaButtonType WRITE;
    private final int value;

    /* compiled from: ProductTileCtaButtonType.kt */
    public static final class a {
        public static ProductTileCtaButtonType a(int i) {
            ProductTileCtaButtonType productTileCtaButtonType;
            ProductTileCtaButtonType[] values = ProductTileCtaButtonType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    productTileCtaButtonType = null;
                    break;
                }
                productTileCtaButtonType = values[i2];
                if (productTileCtaButtonType.h() == i) {
                    break;
                }
                i2++;
            }
            return productTileCtaButtonType == null ? ProductTileCtaButtonType.DISABLED : productTileCtaButtonType;
        }
    }

    static {
        ProductTileCtaButtonType productTileCtaButtonType = new ProductTileCtaButtonType("DISABLED", 0, -1);
        DISABLED = productTileCtaButtonType;
        ProductTileCtaButtonType productTileCtaButtonType2 = new ProductTileCtaButtonType("WRITE", 1, 0);
        WRITE = productTileCtaButtonType2;
        ProductTileCtaButtonType productTileCtaButtonType3 = new ProductTileCtaButtonType("LINK", 2, 1);
        LINK = productTileCtaButtonType3;
        ProductTileCtaButtonType productTileCtaButtonType4 = new ProductTileCtaButtonType("CALL", 3, 2);
        CALL = productTileCtaButtonType4;
        ProductTileCtaButtonType productTileCtaButtonType5 = new ProductTileCtaButtonType("GO_TO_CART", 4, 3);
        GO_TO_CART = productTileCtaButtonType5;
        ProductTileCtaButtonType productTileCtaButtonType6 = new ProductTileCtaButtonType("ADD_TO_CART", 5, 4);
        ADD_TO_CART = productTileCtaButtonType6;
        ProductTileCtaButtonType productTileCtaButtonType7 = new ProductTileCtaButtonType("SIMILAR", 6, 5);
        SIMILAR = productTileCtaButtonType7;
        ProductTileCtaButtonType productTileCtaButtonType8 = new ProductTileCtaButtonType("PARTNER_LINK", 7, 6);
        PARTNER_LINK = productTileCtaButtonType8;
        ProductTileCtaButtonType[] productTileCtaButtonTypeArr = {productTileCtaButtonType, productTileCtaButtonType2, productTileCtaButtonType3, productTileCtaButtonType4, productTileCtaButtonType5, productTileCtaButtonType6, productTileCtaButtonType7, productTileCtaButtonType8};
        $VALUES = productTileCtaButtonTypeArr;
        $ENTRIES = new asp(productTileCtaButtonTypeArr);
        Companion = new a();
    }

    public ProductTileCtaButtonType(String str, int i, int i2) {
        this.value = i2;
    }

    public static ProductTileCtaButtonType valueOf(String str) {
        return (ProductTileCtaButtonType) Enum.valueOf(ProductTileCtaButtonType.class, str);
    }

    public static ProductTileCtaButtonType[] values() {
        return (ProductTileCtaButtonType[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
