package ru.ozon.app.android.storefront.onboardingscreen.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingPushApi;

/* loaded from: classes2.dex */
public final class OnboardingPushModule_Companion_ProvideAllowPushApisFactory implements e<OnboardingPushApi> {
    private final a<Retrofit> retrofitProvider;

    public OnboardingPushModule_Companion_ProvideAllowPushApisFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static OnboardingPushModule_Companion_ProvideAllowPushApisFactory create(a<Retrofit> aVar) {
        return new OnboardingPushModule_Companion_ProvideAllowPushApisFactory(aVar);
    }

    public static OnboardingPushApi provideAllowPushApis(Retrofit retrofit) {
        OnboardingPushApi provideAllowPushApis = OnboardingPushModule.INSTANCE.provideAllowPushApis(retrofit);
        j.d(provideAllowPushApis);
        return provideAllowPushApis;
    }

    @Override // Pc.a
    public OnboardingPushApi get() {
        return provideAllowPushApis(this.retrofitProvider.get());
    }
}
