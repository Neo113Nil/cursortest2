package ru.ozon.app.android.marketing.common.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class MarketingFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(MarketingFlagsModule marketingFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = marketingFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
