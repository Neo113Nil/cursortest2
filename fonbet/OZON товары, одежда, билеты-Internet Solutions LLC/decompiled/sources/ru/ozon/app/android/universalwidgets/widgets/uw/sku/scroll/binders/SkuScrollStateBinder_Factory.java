package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class SkuScrollStateBinder_Factory implements e<SkuScrollStateBinder> {

    private static final class InstanceHolder {
        private static final SkuScrollStateBinder_Factory INSTANCE = new SkuScrollStateBinder_Factory();
    }

    public static SkuScrollStateBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SkuScrollStateBinder newInstance() {
        return new SkuScrollStateBinder();
    }

    @Override // Pc.a
    public SkuScrollStateBinder get() {
        return newInstance();
    }
}
