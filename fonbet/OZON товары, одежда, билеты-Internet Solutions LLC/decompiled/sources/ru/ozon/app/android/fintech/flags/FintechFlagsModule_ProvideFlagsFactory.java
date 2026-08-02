package ru.ozon.app.android.fintech.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class FintechFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(FintechFlagsModule fintechFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = fintechFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
