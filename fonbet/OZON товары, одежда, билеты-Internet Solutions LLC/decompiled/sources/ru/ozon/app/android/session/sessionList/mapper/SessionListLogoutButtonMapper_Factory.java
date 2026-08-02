package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListLogoutButtonMapper_Factory implements e<SessionListLogoutButtonMapper> {

    private static final class InstanceHolder {
        private static final SessionListLogoutButtonMapper_Factory INSTANCE = new SessionListLogoutButtonMapper_Factory();
    }

    public static SessionListLogoutButtonMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListLogoutButtonMapper newInstance() {
        return new SessionListLogoutButtonMapper();
    }

    @Override // Pc.a
    public SessionListLogoutButtonMapper get() {
        return newInstance();
    }
}
