package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class ProductBottomBadgesBinder_Factory implements e<ProductBottomBadgesBinder> {

    private static final class InstanceHolder {
        private static final ProductBottomBadgesBinder_Factory INSTANCE = new ProductBottomBadgesBinder_Factory();
    }

    public static ProductBottomBadgesBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductBottomBadgesBinder newInstance() {
        return new ProductBottomBadgesBinder();
    }

    @Override // Pc.a
    public ProductBottomBadgesBinder get() {
        return newInstance();
    }
}
