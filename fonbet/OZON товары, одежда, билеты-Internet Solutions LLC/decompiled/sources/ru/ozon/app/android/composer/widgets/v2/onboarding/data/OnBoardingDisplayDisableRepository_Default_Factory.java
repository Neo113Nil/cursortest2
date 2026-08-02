package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.version.AppVersionService;

/* loaded from: classes11.dex */
public final class OnBoardingDisplayDisableRepository_Default_Factory implements e<OnBoardingDisplayDisableRepository.Default> {
    private final a<AppVersionService> appVersionServiceProvider;
    private final a<FeatureService> featureServiceProvider;
    private final a<SharedPreferences> sharedPreferencesProvider;

    public OnBoardingDisplayDisableRepository_Default_Factory(a<SharedPreferences> aVar, a<FeatureService> aVar2, a<AppVersionService> aVar3) {
        this.sharedPreferencesProvider = aVar;
        this.featureServiceProvider = aVar2;
        this.appVersionServiceProvider = aVar3;
    }

    public static OnBoardingDisplayDisableRepository_Default_Factory create(a<SharedPreferences> aVar, a<FeatureService> aVar2, a<AppVersionService> aVar3) {
        return new OnBoardingDisplayDisableRepository_Default_Factory(aVar, aVar2, aVar3);
    }

    public static OnBoardingDisplayDisableRepository.Default newInstance(SharedPreferences sharedPreferences, FeatureService featureService, AppVersionService appVersionService) {
        return new OnBoardingDisplayDisableRepository.Default(sharedPreferences, featureService, appVersionService);
    }

    @Override // Pc.a
    public OnBoardingDisplayDisableRepository.Default get() {
        return newInstance(this.sharedPreferencesProvider.get(), this.featureServiceProvider.get(), this.appVersionServiceProvider.get());
    }
}
