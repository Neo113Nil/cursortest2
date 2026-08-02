package ru.ozon.app.android.tabbar.miniapp.fresh;

import Jb.e;

/* loaded from: classes7.dex */
public final class FreshTabIdMapper_Factory implements e<FreshTabIdMapper> {

    private static final class InstanceHolder {
        private static final FreshTabIdMapper_Factory INSTANCE = new FreshTabIdMapper_Factory();
    }

    public static FreshTabIdMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FreshTabIdMapper newInstance() {
        return new FreshTabIdMapper();
    }

    @Override // Pc.a
    public FreshTabIdMapper get() {
        return newInstance();
    }
}
