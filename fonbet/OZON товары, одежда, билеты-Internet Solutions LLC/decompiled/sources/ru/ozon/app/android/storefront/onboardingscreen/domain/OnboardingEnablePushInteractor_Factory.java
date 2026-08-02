package ru.ozon.app.android.storefront.onboardingscreen.domain;

import Jb.e;
import Pc.a;

/* loaded from: classes2.dex */
public final class OnboardingEnablePushInteractor_Factory implements e<OnboardingEnablePushInteractor> {
    private final a<OnboardingPushApi> onboardingPushApiProvider;

    public OnboardingEnablePushInteractor_Factory(a<OnboardingPushApi> aVar) {
        this.onboardingPushApiProvider = aVar;
    }

    public static OnboardingEnablePushInteractor_Factory create(a<OnboardingPushApi> aVar) {
        return new OnboardingEnablePushInteractor_Factory(aVar);
    }

    public static OnboardingEnablePushInteractor newInstance(OnboardingPushApi onboardingPushApi) {
        return new OnboardingEnablePushInteractor(onboardingPushApi);
    }

    @Override // Pc.a
    public OnboardingEnablePushInteractor get() {
        return newInstance(this.onboardingPushApiProvider.get());
    }
}
