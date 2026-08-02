package ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip;

import Sc.s;
import Wc.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip.TooltipWrapper$create$1$3", f = "TooltipWrapper.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TooltipWrapper$create$1$3 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip $tooltip;
    int label;
    final /* synthetic */ TooltipWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipWrapper$create$1$3(SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip productTooltip, TooltipWrapper tooltipWrapper, d<? super TooltipWrapper$create$1$3> dVar) {
        super(2, dVar);
        this.$tooltip = productTooltip;
        this.this$0 = tooltipWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TooltipWrapper$create$1$3(this.$tooltip, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Double delayTimeInSeconds = this.$tooltip.getDelayTimeInSeconds();
            double doubleValue = delayTimeInSeconds != null ? delayTimeInSeconds.doubleValue() : 0.0d;
            this.label = 1;
            if (Y.b((long) (doubleValue * 1000), this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.isDelayOver = true;
        z11 = this.this$0.isTooltipInVisibleBounds;
        if (z11) {
            View rootView = this.this$0.tooltipView.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            ViewExtKt.show(rootView);
            this.this$0.runDismissWithDelay();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TooltipWrapper$create$1$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
