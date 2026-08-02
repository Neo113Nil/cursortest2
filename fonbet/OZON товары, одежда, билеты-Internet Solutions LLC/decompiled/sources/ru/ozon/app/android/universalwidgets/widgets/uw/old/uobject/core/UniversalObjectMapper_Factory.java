package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core;

import Jb.e;

/* loaded from: classes2.dex */
public final class UniversalObjectMapper_Factory implements e<UniversalObjectMapper> {

    private static final class InstanceHolder {
        private static final UniversalObjectMapper_Factory INSTANCE = new UniversalObjectMapper_Factory();
    }

    public static UniversalObjectMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UniversalObjectMapper newInstance() {
        return new UniversalObjectMapper();
    }

    @Override // Pc.a
    public UniversalObjectMapper get() {
        return newInstance();
    }
}
