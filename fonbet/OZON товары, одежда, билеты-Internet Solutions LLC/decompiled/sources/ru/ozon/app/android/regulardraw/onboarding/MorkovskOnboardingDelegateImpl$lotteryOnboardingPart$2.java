package ru.ozon.app.android.regulardraw.onboarding;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.lottery.LotteryOnboardingManager;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2$1", "invoke", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ MorkovskOnboardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2(MorkovskOnboardingDelegateImpl morkovskOnboardingDelegateImpl) {
        super(0);
        this.this$0 = morkovskOnboardingDelegateImpl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final MorkovskOnboardingDelegateImpl morkovskOnboardingDelegateImpl = this.this$0;
        return new MorkovskOnboardingDelegate.LotteryOnboarding() { // from class: ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl$lotteryOnboardingPart$2.1
            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.LotteryOnboarding
            public void disposeLotteryOnboardingModel() {
                LotteryOnboardingManager lotteryOnboardingManager;
                lotteryOnboardingManager = MorkovskOnboardingDelegateImpl.this.lotteryOnboardingManager;
                if (lotteryOnboardingManager != null) {
                    lotteryOnboardingManager.disposeLotteryOnboardingModel();
                }
            }

            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.LotteryOnboarding
            public void forceShowOnboarding() {
                LotteryOnboardingManager lotteryOnboardingManager;
                lotteryOnboardingManager = MorkovskOnboardingDelegateImpl.this.lotteryOnboardingManager;
                if (lotteryOnboardingManager != null) {
                    lotteryOnboardingManager.forceShowOnboarding();
                }
            }

            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.LotteryOnboarding
            public void markSecondPartAsShown() {
                LotteryOnboardingManager lotteryOnboardingManager;
                lotteryOnboardingManager = MorkovskOnboardingDelegateImpl.this.lotteryOnboardingManager;
                if (lotteryOnboardingManager != null) {
                    lotteryOnboardingManager.markSecondPartAsShown();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
            
                r0 = r1.lotteryOnboardingManager;
             */
            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.LotteryOnboarding
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void putLotteryOnboardingModel(BaseOnboardingModel lotteryOnboardingModel) {
                LotteryOnboardingManager lotteryOnboardingManager;
                Intrinsics.checkNotNullParameter(lotteryOnboardingModel, "lotteryOnboardingModel");
                LotteryOnboardingModel lotteryOnboardingModel2 = lotteryOnboardingModel instanceof LotteryOnboardingModel ? (LotteryOnboardingModel) lotteryOnboardingModel : null;
                if (lotteryOnboardingModel2 == null || lotteryOnboardingManager == null) {
                    return;
                }
                lotteryOnboardingManager.putLotteryOnboardingModel(lotteryOnboardingModel2);
            }

            @Override // ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate.LotteryOnboarding
            public boolean showSecondPartIfNeeded() {
                LotteryOnboardingManager lotteryOnboardingManager;
                lotteryOnboardingManager = MorkovskOnboardingDelegateImpl.this.lotteryOnboardingManager;
                if (lotteryOnboardingManager != null) {
                    return lotteryOnboardingManager.showSecondPartIfNeeded();
                }
                return false;
            }
        };
    }
}
