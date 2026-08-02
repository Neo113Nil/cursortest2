package ru.ozon.app.android.fresh.navigation.onboarding;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.fresh.navigation.onboarding.analytics.FreshTabOnBoardingAnalytics;

/* loaded from: classes12.dex */
public final class FreshTabOnboardingViewModelImpl_Factory implements e<FreshTabOnboardingViewModelImpl> {
    private final a<FreshTabOnBoardingAnalytics> analyticsProvider;
    private final a<OnBoardingMapper> onboardingMapperProvider;

    public FreshTabOnboardingViewModelImpl_Factory(a<OnBoardingMapper> aVar, a<FreshTabOnBoardingAnalytics> aVar2) {
        this.onboardingMapperProvider = aVar;
        this.analyticsProvider = aVar2;
    }

    public static FreshTabOnboardingViewModelImpl_Factory create(a<OnBoardingMapper> aVar, a<FreshTabOnBoardingAnalytics> aVar2) {
        return new FreshTabOnboardingViewModelImpl_Factory(aVar, aVar2);
    }

    public static FreshTabOnboardingViewModelImpl newInstance(OnBoardingMapper onBoardingMapper, FreshTabOnBoardingAnalytics freshTabOnBoardingAnalytics) {
        return new FreshTabOnboardingViewModelImpl(onBoardingMapper, freshTabOnBoardingAnalytics);
    }

    @Override // Pc.a
    public FreshTabOnboardingViewModelImpl get() {
        return newInstance(this.onboardingMapperProvider.get(), this.analyticsProvider.get());
    }
}
