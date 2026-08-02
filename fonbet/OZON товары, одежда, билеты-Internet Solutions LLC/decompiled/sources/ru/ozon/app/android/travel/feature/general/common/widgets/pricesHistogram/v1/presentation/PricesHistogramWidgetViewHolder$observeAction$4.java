package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import Sc.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetPricesHistogramBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$NewPosition;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel$NewPosition;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PricesHistogramWidgetViewHolder$observeAction$4 extends AbstractC7737t implements Function1<PricesHistogramViewModel.NewPosition, Unit> {
    final /* synthetic */ PricesHistogramWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PricesHistogramWidgetViewHolder$observeAction$4(PricesHistogramWidgetViewHolder pricesHistogramWidgetViewHolder) {
        super(1);
        this.this$0 = pricesHistogramWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PricesHistogramViewModel.NewPosition newPosition) {
        invoke2(newPosition);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PricesHistogramViewModel.NewPosition newPosition) {
        RecyclerView.z zVar;
        s sVar;
        WidgetPricesHistogramBinding widgetPricesHistogramBinding;
        if (newPosition == null) {
            throw new o();
        }
        PricesHistogramWidgetViewHolder pricesHistogramWidgetViewHolder = this.this$0;
        zVar = pricesHistogramWidgetViewHolder.smoothScrollerTo;
        sVar = this.this$0.snapHelperTo;
        widgetPricesHistogramBinding = this.this$0.binding;
        RecyclerView daysToPriceHistogramRV = widgetPricesHistogramBinding.daysToPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(daysToPriceHistogramRV, "daysToPriceHistogramRV");
        pricesHistogramWidgetViewHolder.scrollToPosition(zVar, sVar, daysToPriceHistogramRV, newPosition.getPosition());
        this.this$0.showStateTo(newPosition.getDays(), newPosition.getPosition(), newPosition.getTotalPrice());
    }
}
