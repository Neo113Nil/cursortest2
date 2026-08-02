package ru.ozon.app.android.pdp.widgets.brand.presentation.original;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OriginalBrandBinder$bindOnboarding$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ PDPOnBoardingViewModel $viewModel;
    final /* synthetic */ OriginalBrandBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OriginalBrandBinder$bindOnboarding$1(OriginalBrandBinder originalBrandBinder, PDPOnBoardingViewModel pDPOnBoardingViewModel, OnBoardingDTO onBoardingDTO) {
        super(0);
        this.this$0 = originalBrandBinder;
        this.$viewModel = pDPOnBoardingViewModel;
        this.$onboarding = onBoardingDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        OnBoardingDelegate onBoardingDelegate2;
        onBoardingDelegate = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate == null) {
            this.this$0.initDelegate(this.$viewModel, this.$onboarding);
        }
        onBoardingDelegate2 = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate2 != null) {
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, this.this$0.getViewHolderOwner(), new OnBoardingCutConfig(null, null, null, null, null, Integer.valueOf(Dimens.INSTANCE.getDP_8()), null, false, 223, null), null, 4, null);
        }
    }
}
