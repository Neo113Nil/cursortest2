package ru.ozon.app.android.favorites.ui.configurators;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class EventManagerConfigurator$onCreate$1 extends C7735q implements Function1<FavoriteEvent, Unit> {
    EventManagerConfigurator$onCreate$1(Object obj) {
        super(1, obj, EventManagerConfigurator.class, "onEventsReceived", "onEventsReceived(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteEvent favoriteEvent) {
        invoke2(favoriteEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteEvent p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((EventManagerConfigurator) this.receiver).onEventsReceived(p02);
    }
}
