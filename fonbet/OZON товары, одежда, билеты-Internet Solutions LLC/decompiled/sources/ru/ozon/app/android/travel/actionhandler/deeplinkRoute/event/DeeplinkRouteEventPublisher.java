package ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEventPublisher;", "", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;", "action", "", "sendEvent", "(Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeeplinkRouteEventPublisher {
    Object sendEvent(@NotNull DeeplinkRouteEvent deeplinkRouteEvent, @NotNull d<? super Unit> dVar);
}
