package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;

/* loaded from: classes6.dex */
public final class OnBoardingDisplayRepository_Default_Factory implements e<OnBoardingDisplayRepository.Default> {
    private final a<SharedPreferences> sharedPreferencesProvider;

    public OnBoardingDisplayRepository_Default_Factory(a<SharedPreferences> aVar) {
        this.sharedPreferencesProvider = aVar;
    }

    public static OnBoardingDisplayRepository_Default_Factory create(a<SharedPreferences> aVar) {
        return new OnBoardingDisplayRepository_Default_Factory(aVar);
    }

    public static OnBoardingDisplayRepository.Default newInstance(SharedPreferences sharedPreferences) {
        return new OnBoardingDisplayRepository.Default(sharedPreferences);
    }

    @Override // Pc.a
    public OnBoardingDisplayRepository.Default get() {
        return newInstance(this.sharedPreferencesProvider.get());
    }
}
