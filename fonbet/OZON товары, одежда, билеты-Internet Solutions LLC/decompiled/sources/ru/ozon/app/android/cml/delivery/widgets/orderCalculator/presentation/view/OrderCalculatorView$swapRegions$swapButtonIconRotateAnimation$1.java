package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderCalculatorView$swapRegions$swapButtonIconRotateAnimation$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ OrderCalculatorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderCalculatorView$swapRegions$swapButtonIconRotateAnimation$1(OrderCalculatorView orderCalculatorView) {
        super(1);
        this.this$0 = orderCalculatorView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        IconButtonV3View swapButton;
        swapButton = this.this$0.getSwapButton();
        swapButton.setRotation(f7);
    }
}
