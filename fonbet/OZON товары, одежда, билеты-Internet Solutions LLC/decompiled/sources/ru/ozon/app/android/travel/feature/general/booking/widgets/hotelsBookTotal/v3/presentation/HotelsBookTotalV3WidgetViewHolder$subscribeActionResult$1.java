package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookTotalV3WidgetViewHolder$subscribeActionResult$1 extends C7719a implements Function2<HotelsBookTotalV3ViewModel.ActionResult, d<? super Unit>, Object> {
    HotelsBookTotalV3WidgetViewHolder$subscribeActionResult$1(Object obj) {
        super(2, obj, HotelsBookTotalV3WidgetViewHolder.class, "handleActionResult", "handleActionResult(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HotelsBookTotalV3ViewModel.ActionResult actionResult, d<? super Unit> dVar) {
        Object subscribeActionResult$handleActionResult;
        subscribeActionResult$handleActionResult = HotelsBookTotalV3WidgetViewHolder.subscribeActionResult$handleActionResult((HotelsBookTotalV3WidgetViewHolder) this.receiver, actionResult, dVar);
        return subscribeActionResult$handleActionResult;
    }
}
