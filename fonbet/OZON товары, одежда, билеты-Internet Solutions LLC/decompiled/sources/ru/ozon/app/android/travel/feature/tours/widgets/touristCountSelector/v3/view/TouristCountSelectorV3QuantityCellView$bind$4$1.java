package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TouristCountSelectorV3QuantityCellView$bind$4$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ TouristCountSelectorV3QuantityCellVO $item;
    final /* synthetic */ TouristCountSelectorV3QuantityCellView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3QuantityCellView$bind$4$1(TouristCountSelectorV3QuantityCellView touristCountSelectorV3QuantityCellView, TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO) {
        super(1);
        this.this$0 = touristCountSelectorV3QuantityCellView;
        this.$item = touristCountSelectorV3QuantityCellVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        function1 = this.this$0.onPlusButtonClicked;
        if (function1 != null) {
            function1.invoke(this.$item);
        }
    }
}
