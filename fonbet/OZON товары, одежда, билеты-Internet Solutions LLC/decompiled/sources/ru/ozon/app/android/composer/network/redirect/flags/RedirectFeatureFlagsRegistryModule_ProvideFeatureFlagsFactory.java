package ru.ozon.app.android.composer.network.redirect.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class RedirectFeatureFlagsRegistryModule_ProvideFeatureFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFeatureFlags(RedirectFeatureFlagsRegistryModule redirectFeatureFlagsRegistryModule) {
        Set<FeatureFlagRegistrationModel> provideFeatureFlags = redirectFeatureFlagsRegistryModule.provideFeatureFlags();
        j.d(provideFeatureFlags);
        return provideFeatureFlags;
    }
}
