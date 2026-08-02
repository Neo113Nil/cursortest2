package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListTitleMapper_Factory implements e<SessionListTitleMapper> {

    private static final class InstanceHolder {
        private static final SessionListTitleMapper_Factory INSTANCE = new SessionListTitleMapper_Factory();
    }

    public static SessionListTitleMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListTitleMapper newInstance() {
        return new SessionListTitleMapper();
    }

    @Override // Pc.a
    public SessionListTitleMapper get() {
        return newInstance();
    }
}
