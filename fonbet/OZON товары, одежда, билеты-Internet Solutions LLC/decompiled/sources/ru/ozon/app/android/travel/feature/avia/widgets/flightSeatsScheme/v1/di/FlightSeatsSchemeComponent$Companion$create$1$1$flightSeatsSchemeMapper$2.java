package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeItemsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeComponent$Companion$create$1$1$flightSeatsSchemeMapper$2 extends AbstractC7737t implements Function0<FlightSeatsSchemeMapper> {
    final /* synthetic */ FlightSeatsSchemeComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeComponent$Companion$create$1$1$flightSeatsSchemeMapper$2(FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = flightSeatsSchemeComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FlightSeatsSchemeMapper invoke() {
        FlightSeatsSchemeItemsMapper itemsMapper;
        FlightSeatsSchemePassengersBlockMapper passengersBlockMapper;
        itemsMapper = this.this$0.getItemsMapper();
        passengersBlockMapper = this.this$0.getPassengersBlockMapper();
        return new FlightSeatsSchemeMapper(itemsMapper, passengersBlockMapper);
    }
}
