package ru.ozon.app.android.storefront.onboardingscreen.screen;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingEnablePushInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;

/* loaded from: classes2.dex */
public final class OnboardingFlowFragmentViewModel_Factory implements e<OnboardingFlowFragmentViewModel> {
    private final a<AuthEventsCollector> authEventsCollectorProvider;
    private final a<OnboardingEnablePushInteractor> onboardingEnablePushInteractorProvider;
    private final a<OnboardingInteractor> onboardingInteractorProvider;
    private final a<Ob0.a> ozonIdAppApiProvider;

    public OnboardingFlowFragmentViewModel_Factory(a<OnboardingInteractor> aVar, a<Ob0.a> aVar2, a<OnboardingEnablePushInteractor> aVar3, a<AuthEventsCollector> aVar4) {
        this.onboardingInteractorProvider = aVar;
        this.ozonIdAppApiProvider = aVar2;
        this.onboardingEnablePushInteractorProvider = aVar3;
        this.authEventsCollectorProvider = aVar4;
    }

    public static OnboardingFlowFragmentViewModel_Factory create(a<OnboardingInteractor> aVar, a<Ob0.a> aVar2, a<OnboardingEnablePushInteractor> aVar3, a<AuthEventsCollector> aVar4) {
        return new OnboardingFlowFragmentViewModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static OnboardingFlowFragmentViewModel newInstance(OnboardingInteractor onboardingInteractor, Ob0.a aVar, OnboardingEnablePushInteractor onboardingEnablePushInteractor, AuthEventsCollector authEventsCollector) {
        return new OnboardingFlowFragmentViewModel(onboardingInteractor, aVar, onboardingEnablePushInteractor, authEventsCollector);
    }

    @Override // Pc.a
    public OnboardingFlowFragmentViewModel get() {
        return newInstance(this.onboardingInteractorProvider.get(), this.ozonIdAppApiProvider.get(), this.onboardingEnablePushInteractorProvider.get(), this.authEventsCollectorProvider.get());
    }
}
