package ru.ozon.app.android.storefront.domain.onboarding;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class CommonOnboardingRepositoryImpl_Factory implements e<CommonOnboardingRepositoryImpl> {
    private final a<SharedPreferences> sharedPreferencesProvider;

    public CommonOnboardingRepositoryImpl_Factory(a<SharedPreferences> aVar) {
        this.sharedPreferencesProvider = aVar;
    }

    public static CommonOnboardingRepositoryImpl_Factory create(a<SharedPreferences> aVar) {
        return new CommonOnboardingRepositoryImpl_Factory(aVar);
    }

    public static CommonOnboardingRepositoryImpl newInstance(SharedPreferences sharedPreferences) {
        return new CommonOnboardingRepositoryImpl(sharedPreferences);
    }

    @Override // Pc.a
    public CommonOnboardingRepositoryImpl get() {
        return newInstance(this.sharedPreferencesProvider.get());
    }
}
