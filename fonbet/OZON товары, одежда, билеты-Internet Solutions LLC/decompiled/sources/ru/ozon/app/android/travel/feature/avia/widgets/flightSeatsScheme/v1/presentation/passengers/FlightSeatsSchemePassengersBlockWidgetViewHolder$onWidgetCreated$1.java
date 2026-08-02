package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "passenger", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemePassengersBlockWidgetViewHolder$onWidgetCreated$1 extends AbstractC7737t implements Function2<Integer, FlightSeatsSchemePassengersBlockVO.Passenger, Unit> {
    final /* synthetic */ FlightSeatsSchemePassengersBlockWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemePassengersBlockWidgetViewHolder$onWidgetCreated$1(FlightSeatsSchemePassengersBlockWidgetViewHolder flightSeatsSchemePassengersBlockWidgetViewHolder) {
        super(2);
        this.this$0 = flightSeatsSchemePassengersBlockWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlightSeatsSchemePassengersBlockVO.Passenger passenger) {
        invoke(num.intValue(), passenger);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i11, FlightSeatsSchemePassengersBlockVO.Passenger passenger) {
        FlightSeatsSchemeViewModel flightSeatsSchemeViewModel;
        Map<String, TokenizedTrackingInfo> clickEvent;
        l lVar;
        if (passenger != null && (clickEvent = passenger.getClickEvent()) != null) {
            FlightSeatsSchemeVO flightSeatsSchemeVO = (FlightSeatsSchemeVO) this.this$0.getBoundData();
            t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(clickEvent, flightSeatsSchemeVO != null ? Long.valueOf(flightSeatsSchemeVO.getId()) : null, null, 2, null);
            if (tokenizedEvent$default != null) {
                lVar = this.this$0.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent$default, null, 2, null);
            }
        }
        flightSeatsSchemeViewModel = this.this$0.viewModel;
        flightSeatsSchemeViewModel.onPassengerTabClicked(i11, passenger);
    }
}
