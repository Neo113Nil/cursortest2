package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import io.reactivex.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.time.b;
import kotlin.time.c;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/o;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lio/reactivex/o;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<o<Integer>, Unit> {
    final /* synthetic */ CartSplitV2ControlsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$1(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        super(1);
        this.this$0 = cartSplitV2ControlsWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(o<Integer> oVar) {
        invoke2(oVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(o<Integer> oVar) {
        long j11;
        ControlsVO controls;
        ControlsVO.QuantityControl quantity;
        Long debounceDelay;
        AsyncCartViewModel asyncCartViewModel = this.this$0.asyncCartViewModel;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) this.this$0.getBoundData();
        if (cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (quantity = controls.getQuantity()) == null || (debounceDelay = quantity.getDebounceDelay()) == null) {
            b.INSTANCE.getClass();
            j11 = 0;
        } else {
            b.Companion companion = b.INSTANCE;
            j11 = c.h(debounceDelay.longValue(), EnumC10311b.MILLISECONDS);
        }
        asyncCartViewModel.mo508showProcessingLRDsOJo(j11);
    }
}
