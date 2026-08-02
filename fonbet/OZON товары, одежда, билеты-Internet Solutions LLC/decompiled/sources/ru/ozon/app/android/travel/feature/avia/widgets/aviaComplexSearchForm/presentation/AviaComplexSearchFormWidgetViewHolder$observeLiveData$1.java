package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaComplexSearchFormWidgetViewHolder$observeLiveData$1 extends C7735q implements Function1<AviaComplexSearchFormViewModel.UpdateRouteData, Unit> {
    AviaComplexSearchFormWidgetViewHolder$observeLiveData$1(Object obj) {
        super(1, obj, AviaComplexSearchFormWidgetViewHolder.class, "updateRoutes", "updateRoutes(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel$UpdateRouteData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AviaComplexSearchFormViewModel.UpdateRouteData updateRouteData) {
        invoke2(updateRouteData);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AviaComplexSearchFormViewModel.UpdateRouteData p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AviaComplexSearchFormWidgetViewHolder) this.receiver).updateRoutes(p02);
    }
}
