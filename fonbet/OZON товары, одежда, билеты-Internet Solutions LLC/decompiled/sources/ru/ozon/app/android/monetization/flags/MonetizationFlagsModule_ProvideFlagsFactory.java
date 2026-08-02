package ru.ozon.app.android.monetization.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class MonetizationFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(MonetizationFlagsModule monetizationFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = monetizationFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
