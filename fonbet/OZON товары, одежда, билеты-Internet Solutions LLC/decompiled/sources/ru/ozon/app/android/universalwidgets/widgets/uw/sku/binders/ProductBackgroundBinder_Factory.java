package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class ProductBackgroundBinder_Factory implements e<ProductBackgroundBinder> {

    private static final class InstanceHolder {
        private static final ProductBackgroundBinder_Factory INSTANCE = new ProductBackgroundBinder_Factory();
    }

    public static ProductBackgroundBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductBackgroundBinder newInstance() {
        return new ProductBackgroundBinder();
    }

    @Override // Pc.a
    public ProductBackgroundBinder get() {
        return newInstance();
    }
}
