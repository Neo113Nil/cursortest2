package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelSearchSortAndFilterWidgetViewHolder$observeLiveData$1 extends C7735q implements Function1<TravelSearchSortAndFilterViewModel.Result, Unit> {
    TravelSearchSortAndFilterWidgetViewHolder$observeLiveData$1(Object obj) {
        super(1, obj, TravelSearchSortAndFilterWidgetViewHolder.class, "handleResult", "handleResult(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelSearchSortAndFilterViewModel.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelSearchSortAndFilterViewModel.Result p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TravelSearchSortAndFilterWidgetViewHolder) this.receiver).handleResult(p02);
    }
}
