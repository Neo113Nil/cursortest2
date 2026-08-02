package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2FooterBlockView$updateItem$1 extends AbstractC7737t implements Function1<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> {
    final /* synthetic */ FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2FooterBlockView$updateItem$1(FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI) {
        super(1);
        this.$item = passengerV2VI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI invoke(FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$item;
    }
}
