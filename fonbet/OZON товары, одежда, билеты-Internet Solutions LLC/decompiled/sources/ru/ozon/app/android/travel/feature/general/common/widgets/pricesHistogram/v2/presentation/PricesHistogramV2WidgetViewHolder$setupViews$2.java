package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetPricesHistogramV2Binding;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PricesHistogramV2WidgetViewHolder$setupViews$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PricesHistogramV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramV2WidgetViewHolder$setupViews$2(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder) {
        super(0);
        this.this$0 = pricesHistogramV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PricesHistogramV2ViewModel pricesHistogramV2ViewModel;
        PricesHistogramV2ViewModel pricesHistogramV2ViewModel2;
        WidgetPricesHistogramV2Binding widgetPricesHistogramV2Binding;
        pricesHistogramV2ViewModel = this.this$0.viewModel;
        FlightDirection flightDirection = FlightDirection.BACK_FLIGHT;
        pricesHistogramV2ViewModel.changeDirection(flightDirection);
        pricesHistogramV2ViewModel2 = this.this$0.viewModel;
        t selectedTokenizedEvent = pricesHistogramV2ViewModel2.getSelectedTokenizedEvent(flightDirection);
        if (selectedTokenizedEvent != null) {
            this.this$0.sendAnalytics(selectedTokenizedEvent);
        }
        widgetPricesHistogramV2Binding = this.this$0.binding;
        widgetPricesHistogramV2Binding.chipTherePricesHistogramV2CV.setChipState(ChipState.ENABLED);
    }
}
