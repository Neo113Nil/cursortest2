package ru.ozon.app.android.session.sessionList.presentation.viewFactory;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListItemViewFactory_Factory implements e<SessionListItemViewFactory> {

    private static final class InstanceHolder {
        private static final SessionListItemViewFactory_Factory INSTANCE = new SessionListItemViewFactory_Factory();
    }

    public static SessionListItemViewFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListItemViewFactory newInstance() {
        return new SessionListItemViewFactory();
    }

    @Override // Pc.a
    public SessionListItemViewFactory get() {
        return newInstance();
    }
}
