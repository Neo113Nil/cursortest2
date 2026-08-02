package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Jb.e;

/* loaded from: classes2.dex */
public final class SkuScrollButtonSubtitleBinder_Factory implements e<SkuScrollButtonSubtitleBinder> {

    private static final class InstanceHolder {
        private static final SkuScrollButtonSubtitleBinder_Factory INSTANCE = new SkuScrollButtonSubtitleBinder_Factory();
    }

    public static SkuScrollButtonSubtitleBinder_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SkuScrollButtonSubtitleBinder newInstance() {
        return new SkuScrollButtonSubtitleBinder();
    }

    @Override // Pc.a
    public SkuScrollButtonSubtitleBinder get() {
        return newInstance();
    }
}
