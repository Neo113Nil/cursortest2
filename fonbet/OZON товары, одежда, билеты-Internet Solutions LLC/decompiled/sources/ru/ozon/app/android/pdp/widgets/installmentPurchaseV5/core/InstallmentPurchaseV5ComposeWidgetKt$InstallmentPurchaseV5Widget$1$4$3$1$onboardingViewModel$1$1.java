package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core;

import Sc.InterfaceC4008j;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf3/a;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "invoke", "(Lf3/a;)Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$3$1$onboardingViewModel$1$1 extends AbstractC7737t implements Function1<AbstractC6409a, BaseOnBoardingViewModel.Default> {
    final /* synthetic */ InterfaceC4008j<InstallmentPurchaseV5Component> $component$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$3$1$onboardingViewModel$1$1(InterfaceC4008j<? extends InstallmentPurchaseV5Component> interfaceC4008j) {
        super(1);
        this.$component$delegate = interfaceC4008j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BaseOnBoardingViewModel.Default invoke(AbstractC6409a viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        return InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1.AnonymousClass4.invoke$lambda$0(this.$component$delegate).getOnboardingViewModel();
    }
}
