package ru.ozon.app.android.regulardraw.onboarding;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes7.dex */
public final class MorkovskOnboardingDelegateImpl_Factory implements e<MorkovskOnboardingDelegateImpl> {
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<SharedPreferences> sharedPreferencesProvider;

    public MorkovskOnboardingDelegateImpl_Factory(a<SharedPreferences> aVar, a<FeatureChecker> aVar2) {
        this.sharedPreferencesProvider = aVar;
        this.featureCheckerProvider = aVar2;
    }

    public static MorkovskOnboardingDelegateImpl_Factory create(a<SharedPreferences> aVar, a<FeatureChecker> aVar2) {
        return new MorkovskOnboardingDelegateImpl_Factory(aVar, aVar2);
    }

    public static MorkovskOnboardingDelegateImpl newInstance(SharedPreferences sharedPreferences, FeatureChecker featureChecker) {
        return new MorkovskOnboardingDelegateImpl(sharedPreferences, featureChecker);
    }

    @Override // Pc.a
    public MorkovskOnboardingDelegateImpl get() {
        return newInstance(this.sharedPreferencesProvider.get(), this.featureCheckerProvider.get());
    }
}
