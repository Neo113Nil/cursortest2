package ru.ozon.app.android.storefront.widgets.fashionOnboarding;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.analytics.FashionTabOnBoardingAnalytics;

/* loaded from: classes2.dex */
public final class FashionTabOnboardingViewModelImpl_Factory implements e<FashionTabOnboardingViewModelImpl> {
    private final a<FashionTabOnBoardingAnalytics> analyticsProvider;
    private final a<OnBoardingMapper> onboardingMapperProvider;

    public FashionTabOnboardingViewModelImpl_Factory(a<OnBoardingMapper> aVar, a<FashionTabOnBoardingAnalytics> aVar2) {
        this.onboardingMapperProvider = aVar;
        this.analyticsProvider = aVar2;
    }

    public static FashionTabOnboardingViewModelImpl_Factory create(a<OnBoardingMapper> aVar, a<FashionTabOnBoardingAnalytics> aVar2) {
        return new FashionTabOnboardingViewModelImpl_Factory(aVar, aVar2);
    }

    public static FashionTabOnboardingViewModelImpl newInstance(OnBoardingMapper onBoardingMapper, FashionTabOnBoardingAnalytics fashionTabOnBoardingAnalytics) {
        return new FashionTabOnboardingViewModelImpl(onBoardingMapper, fashionTabOnBoardingAnalytics);
    }

    @Override // Pc.a
    public FashionTabOnboardingViewModelImpl get() {
        return newInstance(this.onboardingMapperProvider.get(), this.analyticsProvider.get());
    }
}
