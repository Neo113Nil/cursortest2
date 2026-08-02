package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookTotalV3WidgetViewHolder$subscribeUiEvents$1 extends C7719a implements Function2<HotelsBookTotalV3UiEvent, d<? super Unit>, Object> {
    HotelsBookTotalV3WidgetViewHolder$subscribeUiEvents$1(Object obj) {
        super(2, obj, HotelsBookTotalV3WidgetViewHolder.class, "fetchWidget", "fetchWidget(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HotelsBookTotalV3UiEvent hotelsBookTotalV3UiEvent, d<? super Unit> dVar) {
        Object subscribeUiEvents$fetchWidget;
        subscribeUiEvents$fetchWidget = HotelsBookTotalV3WidgetViewHolder.subscribeUiEvents$fetchWidget((HotelsBookTotalV3WidgetViewHolder) this.receiver, hotelsBookTotalV3UiEvent, dVar);
        return subscribeUiEvents$fetchWidget;
    }
}
