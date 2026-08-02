package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSchemeContainerView$contentScrollListener$1 extends C7735q implements Function1<RecyclerView, Unit> {
    FlightSchemeContainerView$contentScrollListener$1(Object obj) {
        super(1, obj, FlightSchemeContainerView.class, "observeLastItemThresholdVisibility", "observeLastItemThresholdVisibility(Landroidx/recyclerview/widget/RecyclerView;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RecyclerView recyclerView) {
        invoke2(recyclerView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RecyclerView p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FlightSchemeContainerView) this.receiver).observeLastItemThresholdVisibility(p02);
    }
}
