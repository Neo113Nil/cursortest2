package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentPurchaseWidgetViewHolder$bindOnboarding$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $additionalHeight;
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ String $onboardingKey;
    final /* synthetic */ InstallmentPurchaseWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseWidgetViewHolder$bindOnboarding$1$1(InstallmentPurchaseWidgetViewHolder installmentPurchaseWidgetViewHolder, String str, OnBoardingDTO onBoardingDTO, int i11) {
        super(0);
        this.this$0 = installmentPurchaseWidgetViewHolder;
        this.$onboardingKey = str;
        this.$onboarding = onBoardingDTO;
        this.$additionalHeight = i11;
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
        onBoardingDelegate = this.this$0.onBoardingDelegateInstallment;
        if (onBoardingDelegate == null) {
            this.this$0.initDelegate(this.$onboardingKey, this.$onboarding);
        }
        onBoardingDelegate2 = this.this$0.onBoardingDelegateInstallment;
        if (onBoardingDelegate2 != null) {
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, this.this$0, new OnBoardingCutConfig(null, null, null, Integer.valueOf(-this.$additionalHeight), null, null, null, false, 247, null), null, 4, null);
        }
    }
}
