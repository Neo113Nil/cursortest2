package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.session.sessionList.di.SessionListComponent;
import ru.ozon.app.android.session.sessionList.mapper.SessionListMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListMapper_Factory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListItemViewFactory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListItemViewFactory_Factory;

/* loaded from: classes2.dex */
public final class DaggerSessionListComponent {

    private static final class Factory implements SessionListComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListComponent.Factory
        public SessionListComponent create(AccountComponentApi accountComponentApi) {
            accountComponentApi.getClass();
            return new SessionListComponentImpl(accountComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SessionListComponentImpl implements SessionListComponent {
        private final SessionListComponentImpl sessionListComponentImpl;
        private a<SessionListItemViewFactory> sessionListItemViewFactoryProvider;
        private a<SessionListMapper> sessionListMapperProvider;

        /* synthetic */ SessionListComponentImpl(AccountComponentApi accountComponentApi, int i11) {
            this(accountComponentApi);
        }

        private void initialize(AccountComponentApi accountComponentApi) {
            this.sessionListMapperProvider = d.b(SessionListMapper_Factory.create());
            this.sessionListItemViewFactoryProvider = d.b(SessionListItemViewFactory_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListComponent
        public SessionListMapper getMapper() {
            return this.sessionListMapperProvider.get();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListComponent
        public SessionListItemViewFactory getViewFactory() {
            return this.sessionListItemViewFactoryProvider.get();
        }

        private SessionListComponentImpl(AccountComponentApi accountComponentApi) {
            this.sessionListComponentImpl = this;
            initialize(accountComponentApi);
        }
    }

    public static SessionListComponent.Factory factory() {
        return new Factory(0);
    }
}
