package ru.ozon.app.android.session.flashcall.di;

import Jb.j;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessMapper;
import ru.ozon.app.android.session.flashcall.di.RequestPhoneAccessComponent;
import ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewModel;
import ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewModel_Factory;

/* loaded from: classes2.dex */
public final class DaggerRequestPhoneAccessComponent {

    private static final class Factory implements RequestPhoneAccessComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.session.flashcall.di.RequestPhoneAccessComponent.Factory
        public RequestPhoneAccessComponent create(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            networkComponentApi.getClass();
            actionComponentApi.getClass();
            return new RequestPhoneAccessComponentImpl(networkComponentApi, actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class RequestPhoneAccessComponentImpl implements RequestPhoneAccessComponent {
        private a<ActionV2Repository> getActionRepositoryProvider;
        private final RequestPhoneAccessComponentImpl requestPhoneAccessComponentImpl;
        private a<RequestPhoneAccessViewModel> requestPhoneAccessViewModelProvider;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        /* synthetic */ RequestPhoneAccessComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, int i11) {
            this(networkComponentApi, actionComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            GetActionRepositoryProvider getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getActionRepositoryProvider = getActionRepositoryProvider;
            this.requestPhoneAccessViewModelProvider = RequestPhoneAccessViewModel_Factory.create(getActionRepositoryProvider);
        }

        @Override // ru.ozon.app.android.session.flashcall.di.RequestPhoneAccessComponent
        public RequestPhoneAccessMapper getMapper() {
            return new RequestPhoneAccessMapper();
        }

        @Override // ru.ozon.app.android.session.flashcall.di.RequestPhoneAccessComponent
        public a<RequestPhoneAccessViewModel> getWidgetViewModelProvider() {
            return this.requestPhoneAccessViewModelProvider;
        }

        private RequestPhoneAccessComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            this.requestPhoneAccessComponentImpl = this;
            initialize(networkComponentApi, actionComponentApi);
        }
    }

    public static RequestPhoneAccessComponent.Factory factory() {
        return new Factory(0);
    }
}
