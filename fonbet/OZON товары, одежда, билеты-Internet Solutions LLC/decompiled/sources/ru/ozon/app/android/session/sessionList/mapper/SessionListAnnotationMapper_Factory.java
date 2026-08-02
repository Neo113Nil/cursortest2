package ru.ozon.app.android.session.sessionList.mapper;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListAnnotationMapper_Factory implements e<SessionListAnnotationMapper> {

    private static final class InstanceHolder {
        private static final SessionListAnnotationMapper_Factory INSTANCE = new SessionListAnnotationMapper_Factory();
    }

    public static SessionListAnnotationMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListAnnotationMapper newInstance() {
        return new SessionListAnnotationMapper();
    }

    @Override // Pc.a
    public SessionListAnnotationMapper get() {
        return newInstance();
    }
}
