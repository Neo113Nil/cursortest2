package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnboardingDialog$bind$1$2$1 implements Runnable {
    final /* synthetic */ OnboardingDialogCutConfig $onBoardingCutConfig;
    final /* synthetic */ OnboardingDialog this$0;

    OnboardingDialog$bind$1$2$1(OnboardingDialog onboardingDialog, OnboardingDialogCutConfig onboardingDialogCutConfig) {
        this.this$0 = onboardingDialog;
        this.$onBoardingCutConfig = onboardingDialogCutConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.this$0.updateVerticalParams(this.$onBoardingCutConfig);
    }
}
