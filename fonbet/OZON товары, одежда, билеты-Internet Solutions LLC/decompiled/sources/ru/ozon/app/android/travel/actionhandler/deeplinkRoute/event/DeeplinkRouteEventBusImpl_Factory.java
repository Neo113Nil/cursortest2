package ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

/* loaded from: classes7.dex */
public final class DeeplinkRouteEventBusImpl_Factory implements e<DeeplinkRouteEventBusImpl> {
    private final a<CoroutineDispatcherProvider> dispatchersProvider;

    public DeeplinkRouteEventBusImpl_Factory(a<CoroutineDispatcherProvider> aVar) {
        this.dispatchersProvider = aVar;
    }

    public static DeeplinkRouteEventBusImpl_Factory create(a<CoroutineDispatcherProvider> aVar) {
        return new DeeplinkRouteEventBusImpl_Factory(aVar);
    }

    public static DeeplinkRouteEventBusImpl newInstance(CoroutineDispatcherProvider coroutineDispatcherProvider) {
        return new DeeplinkRouteEventBusImpl(coroutineDispatcherProvider);
    }

    @Override // Pc.a
    public DeeplinkRouteEventBusImpl get() {
        return newInstance(this.dispatchersProvider.get());
    }
}
