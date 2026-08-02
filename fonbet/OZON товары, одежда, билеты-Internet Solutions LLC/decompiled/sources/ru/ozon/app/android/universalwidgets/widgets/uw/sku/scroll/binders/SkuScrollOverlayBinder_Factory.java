package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class SkuScrollOverlayBinder_Factory implements e<SkuScrollOverlayBinder> {

    private static final class InstanceHolder {
        private static final SkuScrollOverlayBinder_Factory INSTANCE = new SkuScrollOverlayBinder_Factory();
    }

    public static SkuScrollOverlayBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SkuScrollOverlayBinder newInstance() {
        return new SkuScrollOverlayBinder();
    }

    @Override // Pc.a
    public SkuScrollOverlayBinder get() {
        return newInstance();
    }
}
