package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$5 extends C7735q implements Function1<Boolean, Unit> {
    FlightSeatsSchemeBlockWidgetViewHolder$observeLiveData$1$5(Object obj) {
        super(1, obj, FlightSeatsSchemeBlockWidgetViewHolder.class, "updateClearButton", "updateClearButton(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((FlightSeatsSchemeBlockWidgetViewHolder) this.receiver).updateClearButton(z11);
    }
}
