package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.session.sessionList.mapper.SessionListTitleMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListTitleMapper_Factory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListTitleViewFactory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListTitleViewFactory_Factory;

/* loaded from: classes2.dex */
public final class DaggerSessionListTitleComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public SessionListTitleComponent build() {
            return new SessionListTitleComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class SessionListTitleComponentImpl implements SessionListTitleComponent {
        private final SessionListTitleComponentImpl sessionListTitleComponentImpl;
        private a<SessionListTitleMapper> sessionListTitleMapperProvider;
        private a<SessionListTitleViewFactory> sessionListTitleViewFactoryProvider;

        /* synthetic */ SessionListTitleComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.sessionListTitleMapperProvider = d.b(SessionListTitleMapper_Factory.create());
            this.sessionListTitleViewFactoryProvider = d.b(SessionListTitleViewFactory_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListTitleComponent
        public SessionListTitleMapper getMapper() {
            return this.sessionListTitleMapperProvider.get();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListTitleComponent
        public SessionListTitleViewFactory getViewFactory() {
            return this.sessionListTitleViewFactoryProvider.get();
        }

        private SessionListTitleComponentImpl() {
            this.sessionListTitleComponentImpl = this;
            initialize();
        }
    }

    public static SessionListTitleComponent create() {
        return new Builder(0).build();
    }
}
