package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2FooterBlockView$bind$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FlightSeatsSchemeV2FooterBlockVI $item;
    final /* synthetic */ FlightSeatsSchemeV2FooterBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2FooterBlockView$bind$2(FlightSeatsSchemeV2FooterBlockVI flightSeatsSchemeV2FooterBlockVI, FlightSeatsSchemeV2FooterBlockView flightSeatsSchemeV2FooterBlockView) {
        super(0);
        this.$item = flightSeatsSchemeV2FooterBlockVI;
        this.this$0 = flightSeatsSchemeV2FooterBlockView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$item.getPassengers().size() <= 2 || !this.$item.getIsUpdatedFromRemote()) {
            return;
        }
        this.this$0.scrollToPassengerTab(this.$item.getSelectedPassengerIndex());
    }
}
