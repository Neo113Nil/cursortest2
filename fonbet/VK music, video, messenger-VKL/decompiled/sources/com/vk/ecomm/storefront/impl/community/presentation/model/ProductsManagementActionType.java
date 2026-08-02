package com.vk.ecomm.storefront.impl.community.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductsManagementBannerState.kt */
/* loaded from: classes18.dex */
public final class ProductsManagementActionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductsManagementActionType[] $VALUES;
    public static final ProductsManagementActionType ALLOW_VK_PRODUCTS;
    public static final ProductsManagementActionType CANCEL;
    public static final ProductsManagementActionType CLOSE_BANNER_FINALLY;
    public static final ProductsManagementActionType DO_NOT_RESTORE_VK_PRODUCTS;
    public static final ProductsManagementActionType HIDE_LIMIT_BANNER;
    public static final ProductsManagementActionType HIDE_VK_PRODUCTS;
    public static final ProductsManagementActionType RESTORE_VK_PRODUCTS;

    static {
        ProductsManagementActionType productsManagementActionType = new ProductsManagementActionType("HIDE_VK_PRODUCTS", 0);
        HIDE_VK_PRODUCTS = productsManagementActionType;
        ProductsManagementActionType productsManagementActionType2 = new ProductsManagementActionType("ALLOW_VK_PRODUCTS", 1);
        ALLOW_VK_PRODUCTS = productsManagementActionType2;
        ProductsManagementActionType productsManagementActionType3 = new ProductsManagementActionType("RESTORE_VK_PRODUCTS", 2);
        RESTORE_VK_PRODUCTS = productsManagementActionType3;
        ProductsManagementActionType productsManagementActionType4 = new ProductsManagementActionType("DO_NOT_RESTORE_VK_PRODUCTS", 3);
        DO_NOT_RESTORE_VK_PRODUCTS = productsManagementActionType4;
        ProductsManagementActionType productsManagementActionType5 = new ProductsManagementActionType("CANCEL", 4);
        CANCEL = productsManagementActionType5;
        ProductsManagementActionType productsManagementActionType6 = new ProductsManagementActionType("HIDE_LIMIT_BANNER", 5);
        HIDE_LIMIT_BANNER = productsManagementActionType6;
        ProductsManagementActionType productsManagementActionType7 = new ProductsManagementActionType("CLOSE_BANNER_FINALLY", 6);
        CLOSE_BANNER_FINALLY = productsManagementActionType7;
        ProductsManagementActionType[] productsManagementActionTypeArr = {productsManagementActionType, productsManagementActionType2, productsManagementActionType3, productsManagementActionType4, productsManagementActionType5, productsManagementActionType6, productsManagementActionType7};
        $VALUES = productsManagementActionTypeArr;
        $ENTRIES = new asp(productsManagementActionTypeArr);
    }

    public ProductsManagementActionType() {
        throw null;
    }

    public static ProductsManagementActionType valueOf(String str) {
        return (ProductsManagementActionType) Enum.valueOf(ProductsManagementActionType.class, str);
    }

    public static ProductsManagementActionType[] values() {
        return (ProductsManagementActionType[]) $VALUES.clone();
    }
}
