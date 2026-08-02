package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListMapper_Factory implements e<SessionListMapper> {

    private static final class InstanceHolder {
        private static final SessionListMapper_Factory INSTANCE = new SessionListMapper_Factory();
    }

    public static SessionListMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListMapper newInstance() {
        return new SessionListMapper();
    }

    @Override // Pc.a
    public SessionListMapper get() {
        return newInstance();
    }
}
