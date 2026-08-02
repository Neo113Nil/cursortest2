package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.session.sessionList.di.SessionListLogoutButtonComponent;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonMapper_Factory;
import ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListLogoutButtonViewFactory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListLogoutButtonViewFactory_Factory;

/* loaded from: classes2.dex */
public final class DaggerSessionListLogoutButtonComponent {

    private static final class Factory implements SessionListLogoutButtonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListLogoutButtonComponent.Factory
        public SessionListLogoutButtonComponent create(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi) {
            actionComponentApi.getClass();
            accountComponentApi.getClass();
            return new SessionListLogoutButtonComponentImpl(actionComponentApi, accountComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SessionListLogoutButtonComponentImpl implements SessionListLogoutButtonComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final SessionListLogoutButtonComponentImpl sessionListLogoutButtonComponentImpl;
        private a<SessionListLogoutButtonMapper> sessionListLogoutButtonMapperProvider;
        private a<SessionListLogoutButtonViewFactory> sessionListLogoutButtonViewFactoryProvider;

        /* synthetic */ SessionListLogoutButtonComponentImpl(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, int i11) {
            this(actionComponentApi, accountComponentApi);
        }

        private void initialize(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi) {
            this.sessionListLogoutButtonMapperProvider = d.b(SessionListLogoutButtonMapper_Factory.create());
            this.sessionListLogoutButtonViewFactoryProvider = d.b(SessionListLogoutButtonViewFactory_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListLogoutButtonComponent
        public SessionListLogoutButtonMapper getMapper() {
            return this.sessionListLogoutButtonMapperProvider.get();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListLogoutButtonComponent
        public SessionListLogoutButtonViewFactory getViewFactory() {
            return this.sessionListLogoutButtonViewFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListLogoutButtonComponent
        public SessionListViewModel getViewModel() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            SessionListUpdatedEventBus sessionListUpdatedEventBus = this.accountComponentApi.getSessionListUpdatedEventBus();
            j.c(sessionListUpdatedEventBus);
            return new SessionListViewModel(actionRepository, sessionListUpdatedEventBus);
        }

        private SessionListLogoutButtonComponentImpl(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi) {
            this.sessionListLogoutButtonComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.accountComponentApi = accountComponentApi;
            initialize(actionComponentApi, accountComponentApi);
        }
    }

    public static SessionListLogoutButtonComponent.Factory factory() {
        return new Factory(0);
    }
}
