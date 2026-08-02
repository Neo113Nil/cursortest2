package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemePassengersBlockWidgetViewHolder$observeLiveData$1$2 extends C7735q implements Function1<FlightSeatsSchemeViewModel.PassengerTabSeatUpdate, Unit> {
    FlightSeatsSchemePassengersBlockWidgetViewHolder$observeLiveData$1$2(Object obj) {
        super(1, obj, FlightSeatsSchemePassengersBlockWidgetViewHolder.class, "updatePassengerTabSeat", "updatePassengerTabSeat(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel$PassengerTabSeatUpdate;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlightSeatsSchemeViewModel.PassengerTabSeatUpdate passengerTabSeatUpdate) {
        invoke2(passengerTabSeatUpdate);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FlightSeatsSchemeViewModel.PassengerTabSeatUpdate p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FlightSeatsSchemePassengersBlockWidgetViewHolder) this.receiver).updatePassengerTabSeat(p02);
    }
}
