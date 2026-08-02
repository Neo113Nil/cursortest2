package ru.ozon.app.android.regulardraw.onboarding;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2$1", "invoke", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ MorkovskOnboardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2(MorkovskOnboardingDelegateImpl morkovskOnboardingDelegateImpl) {
        super(0);
        this.this$0 = morkovskOnboardingDelegateImpl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final MorkovskOnboardingDelegateImpl morkovskOnboardingDelegateImpl = this.this$0;
        return new MorkovskOnboardingDelegate.MorkovskOnboarding() { // from class: ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl$morkovksOnboardingPart$2.1
            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.MorkovskOnboarding
            public void markMainDrawMajorScreenOnboardingIsShown(boolean isShown) {
                MorkovskOnboardingManager morkovskOnboardingManager;
                morkovskOnboardingManager = MorkovskOnboardingDelegateImpl.this.morkovskOnboardingManager;
                if (morkovskOnboardingManager != null) {
                    morkovskOnboardingManager.markMainDrawMajorScreenOnboardingIsShown(isShown);
                }
            }

            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.MorkovskOnboarding
            public void markWelcomeOnboardingIsShown(boolean isShown) {
                MorkovskOnboardingManager morkovskOnboardingManager;
                morkovskOnboardingManager = MorkovskOnboardingDelegateImpl.this.morkovskOnboardingManager;
                if (morkovskOnboardingManager != null) {
                    morkovskOnboardingManager.markWelcomeOnboardingIsShown(isShown);
                }
                MorkovskOnboardingDelegateImpl.this.checkSkipOnboarding = false;
            }

            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.MorkovskOnboarding
            public void putOnboardingModel(BaseOnboardingModel onboardingModel) {
                MorkovskOnboardingManager morkovskOnboardingManager;
                Intrinsics.checkNotNullParameter(onboardingModel, "onboardingModel");
                morkovskOnboardingManager = MorkovskOnboardingDelegateImpl.this.morkovskOnboardingManager;
                if (morkovskOnboardingManager != null) {
                    morkovskOnboardingManager.putOnboardingModel(onboardingModel);
                }
            }

            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.MorkovskOnboarding
            public boolean shouldShowWelcomeScreen() {
                MorkovskOnboardingManager morkovskOnboardingManager;
                morkovskOnboardingManager = MorkovskOnboardingDelegateImpl.this.morkovskOnboardingManager;
                if (morkovskOnboardingManager != null) {
                    return morkovskOnboardingManager.getShowFirstOnboarding();
                }
                return false;
            }
        };
    }
}
