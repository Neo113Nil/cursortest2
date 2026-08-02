package ru.ozon.app.android.analytics.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class AnalyticsFlagsModule_ProvideFeatureFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFeatureFlags(AnalyticsFlagsModule analyticsFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFeatureFlags = analyticsFlagsModule.provideFeatureFlags();
        j.d(provideFeatureFlags);
        return provideFeatureFlags;
    }
}
