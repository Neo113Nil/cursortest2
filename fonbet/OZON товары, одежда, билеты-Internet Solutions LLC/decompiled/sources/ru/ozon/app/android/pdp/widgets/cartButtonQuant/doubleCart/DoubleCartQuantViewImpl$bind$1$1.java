package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonQuantDoublecartBinding;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantViewState;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DoubleCartQuantViewImpl$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ WidgetCartbuttonQuantDoublecartBinding $this_with;
    final /* synthetic */ DoubleCartQuantViewImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantViewImpl$bind$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ WidgetCartbuttonQuantDoublecartBinding $this_with;
        final /* synthetic */ DoubleCartQuantViewImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DoubleCartQuantViewImpl doubleCartQuantViewImpl, WidgetCartbuttonQuantDoublecartBinding widgetCartbuttonQuantDoublecartBinding) {
            super(0);
            this.this$0 = doubleCartQuantViewImpl;
            this.$this_with = widgetCartbuttonQuantDoublecartBinding;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CartButtonQuantViewState cartButtonQuantViewState;
            CartButtonQuantViewState cartButtonQuantViewState2;
            cartButtonQuantViewState = this.this$0.firstBtnInitialViewState;
            if (cartButtonQuantViewState != null) {
                this.$this_with.firstCb.getButton().startTextAnimation(cartButtonQuantViewState);
            }
            cartButtonQuantViewState2 = this.this$0.secondBtnInitialViewState;
            if (cartButtonQuantViewState2 != null) {
                this.$this_with.secondCb.startTextAnimation(cartButtonQuantViewState2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DoubleCartQuantViewImpl$bind$1$1(DoubleCartQuantViewImpl doubleCartQuantViewImpl, WidgetCartbuttonQuantDoublecartBinding widgetCartbuttonQuantDoublecartBinding) {
        super(0);
        this.this$0 = doubleCartQuantViewImpl;
        this.$this_with = widgetCartbuttonQuantDoublecartBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CartButtonQuantViewState cartButtonQuantViewState;
        cartButtonQuantViewState = this.this$0.firstBtnInitialViewState;
        if (cartButtonQuantViewState != null) {
            this.$this_with.firstCb.getButton().startGradientAnimation(cartButtonQuantViewState);
        }
        this.$this_with.firstCb.getButton().onGradientAnimationFinish(new AnonymousClass2(this.this$0, this.$this_with));
    }
}
