package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer;

import Jb.e;

/* loaded from: classes2.dex */
public final class FooterMapper_Factory implements e<FooterMapper> {

    private static final class InstanceHolder {
        private static final FooterMapper_Factory INSTANCE = new FooterMapper_Factory();
    }

    public static FooterMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FooterMapper newInstance() {
        return new FooterMapper();
    }

    @Override // Pc.a
    public FooterMapper get() {
        return newInstance();
    }
}
