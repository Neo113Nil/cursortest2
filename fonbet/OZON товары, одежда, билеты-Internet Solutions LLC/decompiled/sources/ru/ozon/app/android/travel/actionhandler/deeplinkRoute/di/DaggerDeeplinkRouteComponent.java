package ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.DeeplinkRouteComponent;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventBusImpl;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventBusImpl_Factory;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventPublisher;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventReceiver;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes7.dex */
public final class DaggerDeeplinkRouteComponent {

    private static final class DeeplinkRouteComponentImpl implements DeeplinkRouteComponent {
        private final DeeplinkRouteComponentImpl deeplinkRouteComponentImpl;
        private a<DeeplinkRouteEventBusImpl> deeplinkRouteEventBusImplProvider;
        private a<CoroutineDispatcherProvider> getDispatcherProvider;

        private static final class GetDispatcherProviderProvider implements a<CoroutineDispatcherProvider> {
            private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

            GetDispatcherProviderProvider(CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
                this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            }

            @Override // Pc.a
            public CoroutineDispatcherProvider get() {
                CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
                j.c(dispatcherProvider);
                return dispatcherProvider;
            }
        }

        /* synthetic */ DeeplinkRouteComponentImpl(CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, int i11) {
            this(coroutineDispatchersComponentApi);
        }

        private void initialize(CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            GetDispatcherProviderProvider getDispatcherProviderProvider = new GetDispatcherProviderProvider(coroutineDispatchersComponentApi);
            this.getDispatcherProvider = getDispatcherProviderProvider;
            this.deeplinkRouteEventBusImplProvider = d.b(DeeplinkRouteEventBusImpl_Factory.create(getDispatcherProviderProvider));
        }

        @Override // ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.api.DeeplinkRouteComponentApi
        public DeeplinkRouteEventPublisher getDeeplinkRouteEventPublisher() {
            return this.deeplinkRouteEventBusImplProvider.get();
        }

        @Override // ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.api.DeeplinkRouteComponentApi
        public DeeplinkRouteEventReceiver getDeeplinkRouteEventReceiver() {
            return this.deeplinkRouteEventBusImplProvider.get();
        }

        private DeeplinkRouteComponentImpl(CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            this.deeplinkRouteComponentImpl = this;
            initialize(coroutineDispatchersComponentApi);
        }
    }

    private static final class Factory implements DeeplinkRouteComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.DeeplinkRouteComponent.Factory
        public DeeplinkRouteComponent create(CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
            coroutineDispatchersComponentApi.getClass();
            return new DeeplinkRouteComponentImpl(coroutineDispatchersComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DeeplinkRouteComponent.Factory factory() {
        return new Factory(0);
    }
}
