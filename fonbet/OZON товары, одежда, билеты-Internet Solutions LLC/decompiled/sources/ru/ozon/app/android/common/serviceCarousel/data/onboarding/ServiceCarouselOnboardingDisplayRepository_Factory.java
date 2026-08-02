package ru.ozon.app.android.common.serviceCarousel.data.onboarding;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;

/* loaded from: classes11.dex */
public final class ServiceCarouselOnboardingDisplayRepository_Factory implements e<ServiceCarouselOnboardingDisplayRepository> {
    private final a<SharedPreferences> sharedPreferencesProvider;

    public ServiceCarouselOnboardingDisplayRepository_Factory(a<SharedPreferences> aVar) {
        this.sharedPreferencesProvider = aVar;
    }

    public static ServiceCarouselOnboardingDisplayRepository_Factory create(a<SharedPreferences> aVar) {
        return new ServiceCarouselOnboardingDisplayRepository_Factory(aVar);
    }

    public static ServiceCarouselOnboardingDisplayRepository newInstance(SharedPreferences sharedPreferences) {
        return new ServiceCarouselOnboardingDisplayRepository(sharedPreferences);
    }

    @Override // Pc.a
    public ServiceCarouselOnboardingDisplayRepository get() {
        return newInstance(this.sharedPreferencesProvider.get());
    }
}
