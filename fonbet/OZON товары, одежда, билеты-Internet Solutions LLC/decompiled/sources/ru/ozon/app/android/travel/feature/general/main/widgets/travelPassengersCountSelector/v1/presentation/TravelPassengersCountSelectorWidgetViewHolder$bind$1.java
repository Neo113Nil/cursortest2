package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TravelPassengersCountSelectorWidgetViewHolder$bind$1 extends C7735q implements Function1<TravelQuantityCellVO, Unit> {
    TravelPassengersCountSelectorWidgetViewHolder$bind$1(Object obj) {
        super(1, obj, TravelPassengersSelectorViewModel.class, "onMinusButtonClicked", "onMinusButtonClicked(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelQuantityCellVO travelQuantityCellVO) {
        invoke2(travelQuantityCellVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelQuantityCellVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TravelPassengersSelectorViewModel) this.receiver).onMinusButtonClicked(p02);
    }
}
