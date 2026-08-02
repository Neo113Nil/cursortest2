package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2PassengerTabView;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeV2PassengerAdapterDelegateKt$colorAnimator$1 extends C7735q implements Function1<Integer, Unit> {
    FlightSeatsSchemeV2PassengerAdapterDelegateKt$colorAnimator$1(Object obj) {
        super(1, obj, FlightSeatsSchemeV2PassengerTabView.class, "setSeatBackgroundColor", "setSeatBackgroundColor(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((FlightSeatsSchemeV2PassengerTabView) this.receiver).setSeatBackgroundColor(i11);
    }
}
