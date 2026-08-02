package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ boolean $isSelect;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ BaseOnBoardingViewModel.Default $onboardingViewModel;
    final /* synthetic */ InstallmentPurchaseV5VO.SingleProduct $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$4(InstallmentPurchaseV5VO.SingleProduct singleProduct, boolean z11, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12, BaseOnBoardingViewModel.Default r52, int i11, int i12) {
        super(2);
        this.$state = singleProduct;
        this.$isSelect = z11;
        this.$onView = function1;
        this.$actionHandler = function12;
        this.$onboardingViewModel = r52;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        InstallmentV5SingleProductWidgetKt.InstallmentV5SingleProductWidget(this.$state, this.$isSelect, this.$onView, this.$actionHandler, this.$onboardingViewModel, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
