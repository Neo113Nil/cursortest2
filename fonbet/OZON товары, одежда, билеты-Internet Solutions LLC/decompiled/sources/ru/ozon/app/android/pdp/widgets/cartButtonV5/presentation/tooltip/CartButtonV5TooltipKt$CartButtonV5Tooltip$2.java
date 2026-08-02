package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip;

import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipAtomKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CartButtonV5TooltipKt$CartButtonV5Tooltip$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ A1<Float> $alpha$delegate;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ CartButtonV5TooltipPositionProvider $positionProvider;
    final /* synthetic */ C6041S $properties;
    final /* synthetic */ TooltipDTO $tooltip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5TooltipKt$CartButtonV5Tooltip$2(CartButtonV5TooltipPositionProvider cartButtonV5TooltipPositionProvider, A1<Float> a12, TooltipDTO tooltipDTO, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$positionProvider = cartButtonV5TooltipPositionProvider;
        this.$alpha$delegate = a12;
        this.$tooltip = tooltipDTO;
        this.$properties = c6041s;
        this.$onDismissRequest = function0;
        this.$onCloseClick = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        A1<Integer> beakOffset = this.$positionProvider.getBeakOffset();
        e e11 = a0.e(e.f40358c0, 1.0f);
        interfaceC3967k.o(-450437009);
        boolean n11 = interfaceC3967k.n(this.$alpha$delegate);
        A1<Float> a12 = this.$alpha$delegate;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CartButtonV5TooltipKt$CartButtonV5Tooltip$2$1$1(a12);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DsTooltipAtomKt.DsTooltipAtom(this.$tooltip, a.a(e11, (Function1) C11), this.$positionProvider, beakOffset, this.$properties, this.$onDismissRequest, this.$onCloseClick, interfaceC3967k, TooltipDTO.$stable, 0);
    }
}
