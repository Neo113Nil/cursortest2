package ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event;

import Ae.B0;
import Ae.C2399j;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventBusImpl;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventPublisher;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventReceiver;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchers", "<init>", "(Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;", "action", "", "sendEvent", "(Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "LAe/w0;", "mutableEventsFlow", "LAe/w0;", "LAe/B0;", "eventsFlow", "LAe/B0;", "getEventsFlow", "()LAe/B0;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeeplinkRouteEventBusImpl implements DeeplinkRouteEventPublisher, DeeplinkRouteEventReceiver {

    @NotNull
    private final CoroutineDispatcherProvider dispatchers;

    @NotNull
    private final B0<DeeplinkRouteEvent> eventsFlow;

    @NotNull
    private final w0<DeeplinkRouteEvent> mutableEventsFlow;

    public DeeplinkRouteEventBusImpl(@NotNull CoroutineDispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        w0<DeeplinkRouteEvent> SingleEventsFlow = FlowUtilsKt.SingleEventsFlow();
        this.mutableEventsFlow = SingleEventsFlow;
        this.eventsFlow = C2399j.a(SingleEventsFlow);
    }

    @Override // ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventReceiver
    @NotNull
    public B0<DeeplinkRouteEvent> getEventsFlow() {
        return this.eventsFlow;
    }

    @Override // ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventPublisher
    public Object sendEvent(@NotNull DeeplinkRouteEvent deeplinkRouteEvent, @NotNull d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.dispatchers.getDefault(), new DeeplinkRouteEventBusImpl$sendEvent$2(this, deeplinkRouteEvent, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
