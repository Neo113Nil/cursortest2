package com.vk.ecomm.market.good.ui.topbar;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCardTopBarControlAction.kt */
/* loaded from: classes18.dex */
public final class ProductCardTopBarControlAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProductCardTopBarControlAction[] $VALUES;
    public static final ProductCardTopBarControlAction CopyLink;
    public static final ProductCardTopBarControlAction Edit;
    public static final ProductCardTopBarControlAction Promote;
    public static final ProductCardTopBarControlAction Remove;
    public static final ProductCardTopBarControlAction Statistics;

    static {
        ProductCardTopBarControlAction productCardTopBarControlAction = new ProductCardTopBarControlAction("Edit", 0);
        Edit = productCardTopBarControlAction;
        ProductCardTopBarControlAction productCardTopBarControlAction2 = new ProductCardTopBarControlAction("Promote", 1);
        Promote = productCardTopBarControlAction2;
        ProductCardTopBarControlAction productCardTopBarControlAction3 = new ProductCardTopBarControlAction("Statistics", 2);
        Statistics = productCardTopBarControlAction3;
        ProductCardTopBarControlAction productCardTopBarControlAction4 = new ProductCardTopBarControlAction("CopyLink", 3);
        CopyLink = productCardTopBarControlAction4;
        ProductCardTopBarControlAction productCardTopBarControlAction5 = new ProductCardTopBarControlAction("Remove", 4);
        Remove = productCardTopBarControlAction5;
        ProductCardTopBarControlAction[] productCardTopBarControlActionArr = {productCardTopBarControlAction, productCardTopBarControlAction2, productCardTopBarControlAction3, productCardTopBarControlAction4, productCardTopBarControlAction5};
        $VALUES = productCardTopBarControlActionArr;
        $ENTRIES = new asp(productCardTopBarControlActionArr);
    }

    public ProductCardTopBarControlAction() {
        throw null;
    }

    public static ProductCardTopBarControlAction valueOf(String str) {
        return (ProductCardTopBarControlAction) Enum.valueOf(ProductCardTopBarControlAction.class, str);
    }

    public static ProductCardTopBarControlAction[] values() {
        return (ProductCardTopBarControlAction[]) $VALUES.clone();
    }
}
