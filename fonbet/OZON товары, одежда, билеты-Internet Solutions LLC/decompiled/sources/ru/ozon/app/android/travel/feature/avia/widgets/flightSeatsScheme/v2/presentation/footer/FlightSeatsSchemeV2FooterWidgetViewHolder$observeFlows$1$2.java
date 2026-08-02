package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeV2FooterWidgetViewHolder$observeFlows$1$2 extends C7719a implements Function2<FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate, d<? super Unit>, Object> {
    FlightSeatsSchemeV2FooterWidgetViewHolder$observeFlows$1$2(Object obj) {
        super(2, obj, FlightSeatsSchemeV2FooterWidgetViewHolder.class, "updatePassengerTabSeat", "updatePassengerTabSeat(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$PassengerTabSeatUpdate;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlightSeatsSchemeV2ViewModel.PassengerTabSeatUpdate passengerTabSeatUpdate, d<? super Unit> dVar) {
        Object observeFlows$lambda$0$updatePassengerTabSeat;
        observeFlows$lambda$0$updatePassengerTabSeat = FlightSeatsSchemeV2FooterWidgetViewHolder.observeFlows$lambda$0$updatePassengerTabSeat((FlightSeatsSchemeV2FooterWidgetViewHolder) this.receiver, passengerTabSeatUpdate, dVar);
        return observeFlows$lambda$0$updatePassengerTabSeat;
    }
}
