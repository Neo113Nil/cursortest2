package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B2BUpcomingTripsCardItemContentKt$TripItem$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ B2BUpcomingTripsDTO.UpcomingTrip $trip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2BUpcomingTripsCardItemContentKt$TripItem$1$1(B2BUpcomingTripsDTO.UpcomingTrip upcomingTrip, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$trip = upcomingTrip;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        B2BUpcomingTripsCardItemContentKt.onTripClick(this.$trip.getCommon(), this.$actionHandler);
    }
}
