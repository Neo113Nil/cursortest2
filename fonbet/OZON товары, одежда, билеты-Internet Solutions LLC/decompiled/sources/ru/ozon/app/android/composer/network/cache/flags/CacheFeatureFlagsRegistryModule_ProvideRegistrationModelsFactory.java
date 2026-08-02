package ru.ozon.app.android.composer.network.cache.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CacheFeatureFlagsRegistryModule_ProvideRegistrationModelsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideRegistrationModels(CacheFeatureFlagsRegistryModule cacheFeatureFlagsRegistryModule) {
        Set<FeatureFlagRegistrationModel> provideRegistrationModels = cacheFeatureFlagsRegistryModule.provideRegistrationModels();
        j.d(provideRegistrationModels);
        return provideRegistrationModels;
    }
}
