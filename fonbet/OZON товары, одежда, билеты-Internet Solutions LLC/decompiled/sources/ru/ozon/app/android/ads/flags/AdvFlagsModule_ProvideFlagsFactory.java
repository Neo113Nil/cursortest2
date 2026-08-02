package ru.ozon.app.android.ads.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class AdvFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(AdvFlagsModule advFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = advFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
