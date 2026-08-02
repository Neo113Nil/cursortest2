package com.vk.catalog2.common.ui.mvp.holder.market.item;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCellBadge.kt */
/* loaded from: classes16.dex */
public final class ProductCellBadge$BadgeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductCellBadge$BadgeType[] $VALUES;
    public static final ProductCellBadge$BadgeType DEFAULT;
    public static final ProductCellBadge$BadgeType OZON;
    private final int type;

    static {
        ProductCellBadge$BadgeType productCellBadge$BadgeType = new ProductCellBadge$BadgeType("DEFAULT", 0, 0);
        DEFAULT = productCellBadge$BadgeType;
        ProductCellBadge$BadgeType productCellBadge$BadgeType2 = new ProductCellBadge$BadgeType("OZON", 1, 2);
        OZON = productCellBadge$BadgeType2;
        ProductCellBadge$BadgeType[] productCellBadge$BadgeTypeArr = {productCellBadge$BadgeType, productCellBadge$BadgeType2};
        $VALUES = productCellBadge$BadgeTypeArr;
        $ENTRIES = new asp(productCellBadge$BadgeTypeArr);
    }

    public ProductCellBadge$BadgeType(String str, int i, int i2) {
        this.type = i2;
    }

    public static ProductCellBadge$BadgeType valueOf(String str) {
        return (ProductCellBadge$BadgeType) Enum.valueOf(ProductCellBadge$BadgeType.class, str);
    }

    public static ProductCellBadge$BadgeType[] values() {
        return (ProductCellBadge$BadgeType[]) $VALUES.clone();
    }

    public final int h() {
        return this.type;
    }
}
