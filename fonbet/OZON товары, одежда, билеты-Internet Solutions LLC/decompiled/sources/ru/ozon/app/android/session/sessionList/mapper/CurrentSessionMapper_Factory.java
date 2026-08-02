package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class CurrentSessionMapper_Factory implements e<CurrentSessionMapper> {

    private static final class InstanceHolder {
        private static final CurrentSessionMapper_Factory INSTANCE = new CurrentSessionMapper_Factory();
    }

    public static CurrentSessionMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CurrentSessionMapper newInstance() {
        return new CurrentSessionMapper();
    }

    @Override // Pc.a
    public CurrentSessionMapper get() {
        return newInstance();
    }
}
