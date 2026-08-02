package ru.ozon.app.android.network.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class DeprecatedFeatureFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(DeprecatedFeatureFlagsModule deprecatedFeatureFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = deprecatedFeatureFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
