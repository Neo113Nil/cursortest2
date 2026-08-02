package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PricesHistogramV2WidgetViewHolder$setupViews$3 extends AbstractC7737t implements Function2<ToggleView, Boolean, Unit> {
    final /* synthetic */ PricesHistogramV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramV2WidgetViewHolder$setupViews$3(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder) {
        super(2);
        this.this$0 = pricesHistogramV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ToggleView toggleView, Boolean bool) {
        invoke(toggleView, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(ToggleView toggleView, boolean z11) {
        PricesHistogramV2ViewModel pricesHistogramV2ViewModel;
        Intrinsics.checkNotNullParameter(toggleView, "<unused var>");
        pricesHistogramV2ViewModel = this.this$0.viewModel;
        pricesHistogramV2ViewModel.onToggleStateChanges(z11);
    }
}
