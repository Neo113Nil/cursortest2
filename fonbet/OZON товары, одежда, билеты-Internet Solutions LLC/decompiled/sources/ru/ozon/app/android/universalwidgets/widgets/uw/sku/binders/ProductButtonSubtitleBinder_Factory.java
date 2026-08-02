package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class ProductButtonSubtitleBinder_Factory implements e<ProductButtonSubtitleBinder> {

    private static final class InstanceHolder {
        private static final ProductButtonSubtitleBinder_Factory INSTANCE = new ProductButtonSubtitleBinder_Factory();
    }

    public static ProductButtonSubtitleBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProductButtonSubtitleBinder newInstance() {
        return new ProductButtonSubtitleBinder();
    }

    @Override // Pc.a
    public ProductButtonSubtitleBinder get() {
        return newInstance();
    }
}
