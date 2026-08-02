package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookTotalV2WidgetViewHolder$observeLiveData$1 extends C7735q implements Function1<HotelsBookTotalV2ViewModel.ActionResult, Unit> {
    HotelsBookTotalV2WidgetViewHolder$observeLiveData$1(Object obj) {
        super(1, obj, HotelsBookTotalV2WidgetViewHolder.class, "handleResult", "handleResult(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewModel$ActionResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HotelsBookTotalV2ViewModel.ActionResult actionResult) {
        invoke2(actionResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HotelsBookTotalV2ViewModel.ActionResult p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HotelsBookTotalV2WidgetViewHolder) this.receiver).handleResult(p02);
    }
}
