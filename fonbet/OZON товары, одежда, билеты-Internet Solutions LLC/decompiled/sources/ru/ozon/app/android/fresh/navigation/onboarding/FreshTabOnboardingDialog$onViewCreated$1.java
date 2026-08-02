package ru.ozon.app.android.fresh.navigation.onboarding;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.navigation.onboarding.OnBoardingDialogState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "dialogState", "Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingDialogState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/navigation/onboarding/OnBoardingDialogState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshTabOnboardingDialog$onViewCreated$1 extends AbstractC7737t implements Function1<OnBoardingDialogState, Unit> {
    final /* synthetic */ FreshTabOnboardingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTabOnboardingDialog$onViewCreated$1(FreshTabOnboardingDialog freshTabOnboardingDialog) {
        super(1);
        this.this$0 = freshTabOnboardingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnBoardingDialogState onBoardingDialogState) {
        invoke2(onBoardingDialogState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnBoardingDialogState onBoardingDialogState) {
        if (onBoardingDialogState instanceof OnBoardingDialogState.StartAnimation) {
            this.this$0.startAnimation(((OnBoardingDialogState.StartAnimation) onBoardingDialogState).getOnBoardingVO());
        } else {
            if (!(onBoardingDialogState instanceof OnBoardingDialogState.Error)) {
                throw new o();
            }
            this.this$0.dismissAllowingStateLoss();
        }
    }
}
