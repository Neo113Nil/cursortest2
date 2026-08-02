package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListHeaderMapper_Factory implements e<SessionListHeaderMapper> {

    private static final class InstanceHolder {
        private static final SessionListHeaderMapper_Factory INSTANCE = new SessionListHeaderMapper_Factory();
    }

    public static SessionListHeaderMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListHeaderMapper newInstance() {
        return new SessionListHeaderMapper();
    }

    @Override // Pc.a
    public SessionListHeaderMapper get() {
        return newInstance();
    }
}
