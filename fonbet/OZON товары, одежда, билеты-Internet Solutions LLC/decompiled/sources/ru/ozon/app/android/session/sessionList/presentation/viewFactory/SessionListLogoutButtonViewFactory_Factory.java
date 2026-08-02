package ru.ozon.app.android.session.sessionList.presentation.viewFactory;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListLogoutButtonViewFactory_Factory implements e<SessionListLogoutButtonViewFactory> {

    private static final class InstanceHolder {
        private static final SessionListLogoutButtonViewFactory_Factory INSTANCE = new SessionListLogoutButtonViewFactory_Factory();
    }

    public static SessionListLogoutButtonViewFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListLogoutButtonViewFactory newInstance() {
        return new SessionListLogoutButtonViewFactory();
    }

    @Override // Pc.a
    public SessionListLogoutButtonViewFactory get() {
        return newInstance();
    }
}
