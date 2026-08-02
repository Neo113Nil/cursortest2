package ru.ozon.app.android.session.session.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.session.session.di.SessionComponent;
import ru.ozon.app.android.session.session.mapper.SessionMapper;
import ru.ozon.app.android.session.session.mapper.SessionMapper_Factory;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionViewModel;

/* loaded from: classes2.dex */
public final class DaggerSessionComponent {

    private static final class Factory implements SessionComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.session.session.di.SessionComponent.Factory
        public SessionComponent create(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi) {
            actionComponentApi.getClass();
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            return new SessionComponentImpl(actionComponentApi, accountComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SessionComponentImpl implements SessionComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final SessionComponentImpl sessionComponentImpl;
        private a<SessionMapper> sessionMapperProvider;

        /* synthetic */ SessionComponentImpl(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(actionComponentApi, accountComponentApi, networkComponentApi);
        }

        private void initialize(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi) {
            this.sessionMapperProvider = d.b(SessionMapper_Factory.create());
        }

        @Override // ru.ozon.app.android.session.session.di.SessionComponent
        public SessionMapper getMapper() {
            return this.sessionMapperProvider.get();
        }

        @Override // ru.ozon.app.android.session.session.di.SessionComponent
        public SessionViewModel getViewModel() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            SessionListUpdatedEventBus sessionListUpdatedEventBus = this.accountComponentApi.getSessionListUpdatedEventBus();
            j.c(sessionListUpdatedEventBus);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SessionViewModel(actionRepository, sessionListUpdatedEventBus, jsonDeserializer);
        }

        private SessionComponentImpl(ActionComponentApi actionComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi) {
            this.sessionComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(actionComponentApi, accountComponentApi, networkComponentApi);
        }
    }

    public static SessionComponent.Factory factory() {
        return new Factory(0);
    }
}
