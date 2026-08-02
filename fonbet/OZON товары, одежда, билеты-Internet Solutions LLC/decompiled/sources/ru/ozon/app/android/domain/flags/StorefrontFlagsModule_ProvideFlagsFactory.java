package ru.ozon.app.android.domain.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class StorefrontFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(StorefrontFlagsModule storefrontFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = storefrontFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
