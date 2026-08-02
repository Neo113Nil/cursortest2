package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "seat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSchemeContainerViewV2$contentAdapter$3 extends AbstractC7737t implements Function2<Integer, AirplaneSeatTypeV2VI, Unit> {
    final /* synthetic */ FlightSchemeContainerViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSchemeContainerViewV2$contentAdapter$3(FlightSchemeContainerViewV2 flightSchemeContainerViewV2) {
        super(2);
        this.this$0 = flightSchemeContainerViewV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, AirplaneSeatTypeV2VI airplaneSeatTypeV2VI) {
        invoke(num.intValue(), airplaneSeatTypeV2VI);
        return Unit.f71690a;
    }

    public final void invoke(int i11, AirplaneSeatTypeV2VI seat) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(seat, "seat");
        function2 = this.this$0.onSeatClickListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i11), seat);
        }
    }
}
