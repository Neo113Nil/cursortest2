package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentV5SingleProductWidgetKt$InstallmentWithBottomBlock$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InstallmentPurchaseV5VO.SingleProduct.SingleProductContent $content;
    final /* synthetic */ boolean $isSelect;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $topBlockBackingBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstallmentV5SingleProductWidgetKt$InstallmentWithBottomBlock$2(InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent, long j11, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, int i11, int i12) {
        super(2);
        this.$content = singleProductContent;
        this.$topBlockBackingBackground = j11;
        this.$modifier = eVar;
        this.$isSelect = z11;
        this.$actionHandler = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        InstallmentV5SingleProductWidgetKt.m885InstallmentWithBottomBlock8V94_ZQ(this.$content, this.$topBlockBackingBackground, this.$modifier, this.$isSelect, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
