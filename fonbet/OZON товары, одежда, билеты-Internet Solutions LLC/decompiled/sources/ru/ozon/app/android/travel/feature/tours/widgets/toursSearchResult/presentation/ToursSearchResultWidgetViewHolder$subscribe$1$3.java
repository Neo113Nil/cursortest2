package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultWidgetViewHolder$subscribe$1$3 extends C7735q implements Function1<ToursSearchResultViewModel.ToursState, Unit> {
    ToursSearchResultWidgetViewHolder$subscribe$1$3(Object obj) {
        super(1, obj, ToursSearchResultWidgetViewHolder.class, "submitSearchResultsAndRestoreLayoutManagerState", "submitSearchResultsAndRestoreLayoutManagerState(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$ToursState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ToursSearchResultViewModel.ToursState toursState) {
        invoke2(toursState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ToursSearchResultViewModel.ToursState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ToursSearchResultWidgetViewHolder) this.receiver).submitSearchResultsAndRestoreLayoutManagerState(p02);
    }
}
