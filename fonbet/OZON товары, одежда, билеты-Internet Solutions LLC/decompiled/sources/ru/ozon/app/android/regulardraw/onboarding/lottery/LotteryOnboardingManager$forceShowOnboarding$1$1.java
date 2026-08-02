package ru.ozon.app.android.regulardraw.onboarding.lottery;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryOnboardingManager$forceShowOnboarding$1$1 extends AbstractC7737t implements Function1<LotteryOnboardingInfoVI.OnboardingStep, Boolean> {
    public static final LotteryOnboardingManager$forceShowOnboarding$1$1 INSTANCE = new LotteryOnboardingManager$forceShowOnboarding$1$1();

    LotteryOnboardingManager$forceShowOnboarding$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LotteryOnboardingInfoVI.OnboardingStep it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.getIsSkipable());
    }
}
