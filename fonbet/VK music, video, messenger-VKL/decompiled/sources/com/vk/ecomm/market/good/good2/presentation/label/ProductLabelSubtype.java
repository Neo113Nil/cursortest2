package com.vk.ecomm.market.good.good2.presentation.label;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class ProductLabelSubtype {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductLabelSubtype[] $VALUES;
    public static final ProductLabelSubtype CART_PRICE;
    public static final ProductLabelSubtype DEFAULT;
    public static final ProductLabelSubtype DELIVERY;
    public static final ProductLabelSubtype FOMO_BOOKMARKS;
    public static final ProductLabelSubtype FOMO_FRIENDS_PURCHASES;
    public static final ProductLabelSubtype FOMO_FRIENDS_VIEWS;
    public static final ProductLabelSubtype FOMO_GOOD_SELLER;
    public static final ProductLabelSubtype FOMO_POPULAR;
    public static final ProductLabelSubtype FOMO_POPULAR_SELLER;
    public static final ProductLabelSubtype FOMO_PURCHASES;
    public static final ProductLabelSubtype FOMO_VIEWS;
    public static final ProductLabelSubtype INTEGRATION_ONBOARDING;
    public static final ProductLabelSubtype OZON_ONBOARDING;
    public static final ProductLabelSubtype PAYMENT;
    public static final ProductLabelSubtype UNKNOWN;

    static {
        ProductLabelSubtype productLabelSubtype = new ProductLabelSubtype("DEFAULT", 0);
        DEFAULT = productLabelSubtype;
        ProductLabelSubtype productLabelSubtype2 = new ProductLabelSubtype("DELIVERY", 1);
        DELIVERY = productLabelSubtype2;
        ProductLabelSubtype productLabelSubtype3 = new ProductLabelSubtype("PAYMENT", 2);
        PAYMENT = productLabelSubtype3;
        ProductLabelSubtype productLabelSubtype4 = new ProductLabelSubtype("CART_PRICE", 3);
        CART_PRICE = productLabelSubtype4;
        ProductLabelSubtype productLabelSubtype5 = new ProductLabelSubtype("FOMO_VIEWS", 4);
        FOMO_VIEWS = productLabelSubtype5;
        ProductLabelSubtype productLabelSubtype6 = new ProductLabelSubtype("FOMO_BOOKMARKS", 5);
        FOMO_BOOKMARKS = productLabelSubtype6;
        ProductLabelSubtype productLabelSubtype7 = new ProductLabelSubtype("FOMO_PURCHASES", 6);
        FOMO_PURCHASES = productLabelSubtype7;
        ProductLabelSubtype productLabelSubtype8 = new ProductLabelSubtype("FOMO_FRIENDS_VIEWS", 7);
        FOMO_FRIENDS_VIEWS = productLabelSubtype8;
        ProductLabelSubtype productLabelSubtype9 = new ProductLabelSubtype("FOMO_FRIENDS_PURCHASES", 8);
        FOMO_FRIENDS_PURCHASES = productLabelSubtype9;
        ProductLabelSubtype productLabelSubtype10 = new ProductLabelSubtype("FOMO_POPULAR", 9);
        FOMO_POPULAR = productLabelSubtype10;
        ProductLabelSubtype productLabelSubtype11 = new ProductLabelSubtype("OZON_ONBOARDING", 10);
        OZON_ONBOARDING = productLabelSubtype11;
        ProductLabelSubtype productLabelSubtype12 = new ProductLabelSubtype("FOMO_POPULAR_SELLER", 11);
        FOMO_POPULAR_SELLER = productLabelSubtype12;
        ProductLabelSubtype productLabelSubtype13 = new ProductLabelSubtype("FOMO_GOOD_SELLER", 12);
        FOMO_GOOD_SELLER = productLabelSubtype13;
        ProductLabelSubtype productLabelSubtype14 = new ProductLabelSubtype("INTEGRATION_ONBOARDING", 13);
        INTEGRATION_ONBOARDING = productLabelSubtype14;
        ProductLabelSubtype productLabelSubtype15 = new ProductLabelSubtype(GrsBaseInfo.CountryCodeSource.UNKNOWN, 14);
        UNKNOWN = productLabelSubtype15;
        ProductLabelSubtype[] productLabelSubtypeArr = {productLabelSubtype, productLabelSubtype2, productLabelSubtype3, productLabelSubtype4, productLabelSubtype5, productLabelSubtype6, productLabelSubtype7, productLabelSubtype8, productLabelSubtype9, productLabelSubtype10, productLabelSubtype11, productLabelSubtype12, productLabelSubtype13, productLabelSubtype14, productLabelSubtype15};
        $VALUES = productLabelSubtypeArr;
        $ENTRIES = new asp(productLabelSubtypeArr);
    }

    public ProductLabelSubtype() {
        throw null;
    }

    public static ProductLabelSubtype valueOf(String str) {
        return (ProductLabelSubtype) Enum.valueOf(ProductLabelSubtype.class, str);
    }

    public static ProductLabelSubtype[] values() {
        return (ProductLabelSubtype[]) $VALUES.clone();
    }
}
