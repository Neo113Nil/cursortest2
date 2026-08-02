package ru.ozon.app.android.pdp.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class PdpFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(PdpFlagsModule pdpFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = pdpFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
