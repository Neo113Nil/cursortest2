package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class CurrentSessionTitleMapper_Factory implements e<CurrentSessionTitleMapper> {

    private static final class InstanceHolder {
        private static final CurrentSessionTitleMapper_Factory INSTANCE = new CurrentSessionTitleMapper_Factory();
    }

    public static CurrentSessionTitleMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CurrentSessionTitleMapper newInstance() {
        return new CurrentSessionTitleMapper();
    }

    @Override // Pc.a
    public CurrentSessionTitleMapper get() {
        return newInstance();
    }
}
