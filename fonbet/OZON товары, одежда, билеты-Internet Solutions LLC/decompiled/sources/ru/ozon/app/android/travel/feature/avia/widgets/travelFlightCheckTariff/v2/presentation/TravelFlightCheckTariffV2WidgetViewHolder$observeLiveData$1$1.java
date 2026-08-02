package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TravelFlightCheckTariffV2WidgetViewHolder$observeLiveData$1$1 extends C7735q implements Function1<Boolean, Unit> {
    TravelFlightCheckTariffV2WidgetViewHolder$observeLiveData$1$1(Object obj) {
        super(1, obj, TravelFlightCheckTariffV2WidgetViewHolder.class, "setProgress", "setProgress(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((TravelFlightCheckTariffV2WidgetViewHolder) this.receiver).setProgress(z11);
    }
}
