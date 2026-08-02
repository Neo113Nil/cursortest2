package ru.ozon.app.android.session.session.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionMapper_Factory implements e<SessionMapper> {

    private static final class InstanceHolder {
        private static final SessionMapper_Factory INSTANCE = new SessionMapper_Factory();
    }

    public static SessionMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionMapper newInstance() {
        return new SessionMapper();
    }

    @Override // Pc.a
    public SessionMapper get() {
        return newInstance();
    }
}
