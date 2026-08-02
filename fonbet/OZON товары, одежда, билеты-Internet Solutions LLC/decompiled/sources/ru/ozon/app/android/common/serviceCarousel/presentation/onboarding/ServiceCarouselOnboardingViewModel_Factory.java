package ru.ozon.app.android.common.serviceCarousel.presentation.onboarding;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;

/* loaded from: classes11.dex */
public final class ServiceCarouselOnboardingViewModel_Factory implements e<ServiceCarouselOnboardingViewModel> {
    private final a<OnBoardingDisplayDisableRepository> disableOnBoardingRepositoryProvider;
    private final a<OnBoardingDisplayOnPageRepository> displayOnPageRepositoryProvider;
    private final a<OnBoardingDisplayRepository> displayRepositoryProvider;

    public ServiceCarouselOnboardingViewModel_Factory(a<OnBoardingDisplayRepository> aVar, a<OnBoardingDisplayOnPageRepository> aVar2, a<OnBoardingDisplayDisableRepository> aVar3) {
        this.displayRepositoryProvider = aVar;
        this.displayOnPageRepositoryProvider = aVar2;
        this.disableOnBoardingRepositoryProvider = aVar3;
    }

    public static ServiceCarouselOnboardingViewModel_Factory create(a<OnBoardingDisplayRepository> aVar, a<OnBoardingDisplayOnPageRepository> aVar2, a<OnBoardingDisplayDisableRepository> aVar3) {
        return new ServiceCarouselOnboardingViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static ServiceCarouselOnboardingViewModel newInstance(OnBoardingDisplayRepository onBoardingDisplayRepository, OnBoardingDisplayOnPageRepository onBoardingDisplayOnPageRepository, OnBoardingDisplayDisableRepository onBoardingDisplayDisableRepository) {
        return new ServiceCarouselOnboardingViewModel(onBoardingDisplayRepository, onBoardingDisplayOnPageRepository, onBoardingDisplayDisableRepository);
    }

    @Override // Pc.a
    public ServiceCarouselOnboardingViewModel get() {
        return newInstance(this.displayRepositoryProvider.get(), this.displayOnPageRepositoryProvider.get(), this.disableOnBoardingRepositoryProvider.get());
    }
}
