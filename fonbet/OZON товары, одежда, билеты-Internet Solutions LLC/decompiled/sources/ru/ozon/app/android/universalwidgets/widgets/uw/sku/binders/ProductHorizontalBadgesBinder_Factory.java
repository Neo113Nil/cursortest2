package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class ProductHorizontalBadgesBinder_Factory implements e<ProductHorizontalBadgesBinder> {

    private static final class InstanceHolder {
        private static final ProductHorizontalBadgesBinder_Factory INSTANCE = new ProductHorizontalBadgesBinder_Factory();
    }

    public static ProductHorizontalBadgesBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductHorizontalBadgesBinder newInstance() {
        return new ProductHorizontalBadgesBinder();
    }

    @Override // Pc.a
    public ProductHorizontalBadgesBinder get() {
        return newInstance();
    }
}
