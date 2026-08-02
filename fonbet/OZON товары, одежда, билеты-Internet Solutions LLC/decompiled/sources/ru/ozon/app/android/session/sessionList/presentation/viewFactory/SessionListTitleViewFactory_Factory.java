package ru.ozon.app.android.session.sessionList.presentation.viewFactory;

import Jb.e;

/* loaded from: classes2.dex */
public final class SessionListTitleViewFactory_Factory implements e<SessionListTitleViewFactory> {

    private static final class InstanceHolder {
        private static final SessionListTitleViewFactory_Factory INSTANCE = new SessionListTitleViewFactory_Factory();
    }

    public static SessionListTitleViewFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionListTitleViewFactory newInstance() {
        return new SessionListTitleViewFactory();
    }

    @Override // Pc.a
    public SessionListTitleViewFactory get() {
        return newInstance();
    }
}
