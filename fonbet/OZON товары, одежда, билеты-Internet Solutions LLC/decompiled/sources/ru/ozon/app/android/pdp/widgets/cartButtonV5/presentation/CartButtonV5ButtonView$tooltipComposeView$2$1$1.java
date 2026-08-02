package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import S0.InterfaceC3967k;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip.CartButtonV5TooltipKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CartButtonV5ButtonView$tooltipComposeView$2$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ CartButtonV5ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ButtonView$tooltipComposeView$2$1$1(CartButtonV5ButtonView cartButtonV5ButtonView) {
        super(2);
        this.this$0 = cartButtonV5ButtonView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CartButtonV5DTO.CartButton.Button.Tooltip tooltipDto;
        boolean isTooltipVisible;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        tooltipDto = this.this$0.getTooltipDto();
        isTooltipVisible = this.this$0.isTooltipVisible();
        C6041S c6041s = new C6041S(9, true, true);
        CartButtonV5ButtonView cartButtonV5ButtonView = this.this$0;
        interfaceC3967k.o(-822522227);
        boolean F11 = interfaceC3967k.F(this.this$0);
        CartButtonV5ButtonView cartButtonV5ButtonView2 = this.this$0;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CartButtonV5ButtonView$tooltipComposeView$2$1$1$1$1(cartButtonV5ButtonView2);
            interfaceC3967k.x(C11);
        }
        Function0 function0 = (Function0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-822520370);
        boolean F12 = interfaceC3967k.F(this.this$0);
        CartButtonV5ButtonView cartButtonV5ButtonView3 = this.this$0;
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new CartButtonV5ButtonView$tooltipComposeView$2$1$1$2$1(cartButtonV5ButtonView3);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        CartButtonV5TooltipKt.CartButtonV5Tooltip(tooltipDto, isTooltipVisible, cartButtonV5ButtonView, c6041s, function0, (Function0) C12, interfaceC3967k, TooltipDTO.$stable | 3072);
    }
}
