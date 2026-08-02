package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header;

import Jb.e;

/* loaded from: classes2.dex */
public final class HeaderMapper_Factory implements e<HeaderMapper> {

    private static final class InstanceHolder {
        private static final HeaderMapper_Factory INSTANCE = new HeaderMapper_Factory();
    }

    public static HeaderMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HeaderMapper newInstance() {
        return new HeaderMapper();
    }

    @Override // Pc.a
    public HeaderMapper get() {
        return newInstance();
    }
}
