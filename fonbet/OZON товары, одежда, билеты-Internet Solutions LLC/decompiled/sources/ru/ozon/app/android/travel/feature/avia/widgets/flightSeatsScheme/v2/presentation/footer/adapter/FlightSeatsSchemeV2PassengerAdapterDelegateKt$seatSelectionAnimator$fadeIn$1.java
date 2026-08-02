package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2PassengerTabView;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$fadeIn$1 extends C7735q implements Function1<Float, Unit> {
    FlightSeatsSchemeV2PassengerAdapterDelegateKt$seatSelectionAnimator$fadeIn$1(Object obj) {
        super(1, obj, FlightSeatsSchemeV2PassengerTabView.class, "setIndicatorAlpha", "setIndicatorAlpha(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        ((FlightSeatsSchemeV2PassengerTabView) this.receiver).setIndicatorAlpha(f7);
    }
}
