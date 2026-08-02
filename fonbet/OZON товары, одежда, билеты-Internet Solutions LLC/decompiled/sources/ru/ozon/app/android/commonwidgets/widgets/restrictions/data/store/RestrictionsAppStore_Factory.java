package ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store;

import Jb.e;

/* loaded from: classes6.dex */
public final class RestrictionsAppStore_Factory implements e<RestrictionsAppStore> {

    private static final class InstanceHolder {
        private static final RestrictionsAppStore_Factory INSTANCE = new RestrictionsAppStore_Factory();
    }

    public static RestrictionsAppStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RestrictionsAppStore newInstance() {
        return new RestrictionsAppStore();
    }

    @Override // Pc.a
    public RestrictionsAppStore get() {
        return newInstance();
    }
}
