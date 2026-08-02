package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSchemeContainerViewV2$selectSeat$1 extends AbstractC7737t implements Function1<FlightSeatsSchemeV2Item, FlightSeatsSchemeV2Item> {
    final /* synthetic */ FlightSeatsSchemeV2ViewModel.SeatSelection $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSchemeContainerViewV2$selectSeat$1(FlightSeatsSchemeV2ViewModel.SeatSelection seatSelection) {
        super(1);
        this.$item = seatSelection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FlightSeatsSchemeV2Item invoke(FlightSeatsSchemeV2Item it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$item.getItem();
    }
}
