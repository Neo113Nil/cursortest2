package ru.ozon.app.android.regulardraw.onboarding;

import WZ.l;
import androidx.fragment.app.G;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "", "Landroidx/fragment/app/G;", "fragmentManager", "LWZ/l;", "tokenizedAnalytics", "", "init", "(Landroidx/fragment/app/G;LWZ/l;)V", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$MorkovskOnboarding;", "provideMorokvskOnboarding", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$MorkovskOnboarding;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$LotteryOnboarding;", "provideLotteryOnboarding", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$LotteryOnboarding;", "clear", "()V", "MorkovskOnboarding", "LotteryOnboarding", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MorkovskOnboardingDelegate {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$LotteryOnboarding;", "", "putLotteryOnboardingModel", "", "lotteryOnboardingModel", "Lru/ozon/app/android/regulardraw/onboarding/BaseOnboardingModel;", "showSecondPartIfNeeded", "", "markSecondPartAsShown", "forceShowOnboarding", "disposeLotteryOnboardingModel", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LotteryOnboarding {
        void disposeLotteryOnboardingModel();

        void forceShowOnboarding();

        void markSecondPartAsShown();

        void putLotteryOnboardingModel(@NotNull BaseOnboardingModel lotteryOnboardingModel);

        boolean showSecondPartIfNeeded();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate$MorkovskOnboarding;", "", "putOnboardingModel", "", "onboardingModel", "Lru/ozon/app/android/regulardraw/onboarding/BaseOnboardingModel;", "shouldShowWelcomeScreen", "", "markWelcomeOnboardingIsShown", "isShown", "markMainDrawMajorScreenOnboardingIsShown", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MorkovskOnboarding {
        void markMainDrawMajorScreenOnboardingIsShown(boolean isShown);

        void markWelcomeOnboardingIsShown(boolean isShown);

        void putOnboardingModel(@NotNull BaseOnboardingModel onboardingModel);

        boolean shouldShowWelcomeScreen();
    }

    void clear();

    void init(@NotNull G fragmentManager, l tokenizedAnalytics);

    @NotNull
    LotteryOnboarding provideLotteryOnboarding();

    @NotNull
    MorkovskOnboarding provideMorokvskOnboarding();
}
