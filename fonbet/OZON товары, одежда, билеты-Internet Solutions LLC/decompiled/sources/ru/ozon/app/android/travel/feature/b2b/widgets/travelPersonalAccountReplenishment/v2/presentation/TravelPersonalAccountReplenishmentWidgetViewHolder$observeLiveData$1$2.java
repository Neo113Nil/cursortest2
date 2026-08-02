package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$2 extends C7735q implements Function1<TravelPersonalAccountReplenishmentViewModel.Result, Unit> {
    TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$2(Object obj) {
        super(1, obj, TravelPersonalAccountReplenishmentWidgetViewHolder.class, "handleSuccessResult", "handleSuccessResult(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewModel$Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelPersonalAccountReplenishmentViewModel.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelPersonalAccountReplenishmentViewModel.Result p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TravelPersonalAccountReplenishmentWidgetViewHolder) this.receiver).handleSuccessResult(p02);
    }
}
