package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultWidgetViewHolder$startTimer$1 extends C7735q implements Function0<Unit> {
    ToursSearchResultWidgetViewHolder$startTimer$1(Object obj) {
        super(0, obj, ToursSearchResultViewModel.class, "onTimerWentOff", "onTimerWentOff()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ToursSearchResultViewModel) this.receiver).onTimerWentOff();
    }
}
