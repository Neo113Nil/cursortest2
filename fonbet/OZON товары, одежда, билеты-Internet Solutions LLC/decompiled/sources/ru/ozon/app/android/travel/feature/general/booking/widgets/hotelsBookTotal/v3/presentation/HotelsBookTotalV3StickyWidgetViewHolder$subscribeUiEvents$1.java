package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookTotalV3StickyWidgetViewHolder$subscribeUiEvents$1 extends C7735q implements Function2<HotelsBookTotalV3UiEvent, d<? super Unit>, Object> {
    HotelsBookTotalV3StickyWidgetViewHolder$subscribeUiEvents$1(Object obj) {
        super(2, obj, HotelsBookTotalV3StickyWidgetViewHolder.class, "performActionsList", "performActionsList(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HotelsBookTotalV3UiEvent hotelsBookTotalV3UiEvent, d<? super Unit> dVar) {
        Object performActionsList;
        performActionsList = ((HotelsBookTotalV3StickyWidgetViewHolder) this.receiver).performActionsList(hotelsBookTotalV3UiEvent, dVar);
        return performActionsList;
    }
}
