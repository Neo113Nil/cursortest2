package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<unused var>", "Landroidx/compose/ui/e;", "onboardingPositonModifier", "", "invoke", "(Ljava/lang/String;Landroidx/compose/ui/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$3 extends AbstractC7737t implements InterfaceC6512o<String, e, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ boolean $isSelect;
    final /* synthetic */ InstallmentPurchaseV5VO.SingleProduct $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$3(InstallmentPurchaseV5VO.SingleProduct singleProduct, Function1<? super AtomAction, Unit> function1, boolean z11) {
        super(4);
        this.$state = singleProduct;
        this.$actionHandler = function1;
        this.$isSelect = z11;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(String str, e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(str, eVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(String str, e onboardingPositonModifier, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(onboardingPositonModifier, "onboardingPositonModifier");
        if ((i11 & 48) == 0) {
            i11 |= interfaceC3967k.n(onboardingPositonModifier) ? 32 : 16;
        }
        if ((i11 & 145) == 144 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            InstallmentV5SingleProductWidgetKt.InstallmentV5SingleProductContent(this.$state, this.$actionHandler, onboardingPositonModifier, this.$isSelect, interfaceC3967k, (i11 << 3) & 896, 0);
        }
    }
}
