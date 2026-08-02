package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "position", "", "passenger", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2FooterWidgetViewHolder$onWidgetCreated$1 extends AbstractC7737t implements Function2<Integer, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> {
    final /* synthetic */ FlightSeatsSchemeV2FooterWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2FooterWidgetViewHolder$onWidgetCreated$1(FlightSeatsSchemeV2FooterWidgetViewHolder flightSeatsSchemeV2FooterWidgetViewHolder) {
        super(2);
        this.this$0 = flightSeatsSchemeV2FooterWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI) {
        invoke(num.intValue(), passengerV2VI);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i11, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI passengerV2VI) {
        FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel;
        Map<String, TokenizedTrackingInfo> clickEvent;
        i iVar;
        if (passengerV2VI != null && (clickEvent = passengerV2VI.getClickEvent()) != null) {
            FlightSeatsSchemeV2VI flightSeatsSchemeV2VI = (FlightSeatsSchemeV2VI) this.this$0.getBoundData();
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(clickEvent, flightSeatsSchemeV2VI != null ? Long.valueOf(flightSeatsSchemeV2VI.getId()) : null, null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                iVar = this.this$0.container;
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(iVar.X(), mapToTokenizedEvent$default, null, 2, null);
            }
        }
        flightSeatsSchemeV2ViewModel = this.this$0.viewModel;
        flightSeatsSchemeV2ViewModel.onPassengerTabClicked(i11, passengerV2VI);
    }
}
