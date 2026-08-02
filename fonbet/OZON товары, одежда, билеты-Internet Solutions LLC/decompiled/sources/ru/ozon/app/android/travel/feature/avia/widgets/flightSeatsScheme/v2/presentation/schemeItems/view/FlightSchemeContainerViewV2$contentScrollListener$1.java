package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSchemeContainerViewV2$contentScrollListener$1 extends C7735q implements Function2<RecyclerView, Boolean, Unit> {
    FlightSchemeContainerViewV2$contentScrollListener$1(Object obj) {
        super(2, obj, FlightSchemeContainerViewV2.class, "observeLastItemThresholdVisibility", "observeLastItemThresholdVisibility(Landroidx/recyclerview/widget/RecyclerView;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(RecyclerView recyclerView, Boolean bool) {
        invoke(recyclerView, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(RecyclerView p02, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FlightSchemeContainerViewV2) this.receiver).observeLastItemThresholdVisibility(p02, z11);
    }
}
