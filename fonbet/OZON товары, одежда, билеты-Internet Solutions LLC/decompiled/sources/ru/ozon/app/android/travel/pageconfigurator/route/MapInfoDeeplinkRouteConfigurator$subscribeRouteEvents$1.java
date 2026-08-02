package ru.ozon.app.android.travel.pageconfigurator.route;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class MapInfoDeeplinkRouteConfigurator$subscribeRouteEvents$1 extends C7719a implements Function2<DeeplinkRouteEvent, d<? super Unit>, Object> {
    MapInfoDeeplinkRouteConfigurator$subscribeRouteEvents$1(Object obj) {
        super(2, obj, MapInfoDeeplinkRouteConfigurator.class, "handleRouteEvent", "handleRouteEvent(Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeeplinkRouteEvent deeplinkRouteEvent, d<? super Unit> dVar) {
        Object subscribeRouteEvents$handleRouteEvent;
        subscribeRouteEvents$handleRouteEvent = MapInfoDeeplinkRouteConfigurator.subscribeRouteEvents$handleRouteEvent((MapInfoDeeplinkRouteConfigurator) this.receiver, deeplinkRouteEvent, dVar);
        return subscribeRouteEvents$handleRouteEvent;
    }
}
