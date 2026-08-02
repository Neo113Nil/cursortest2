package ru.ozon.app.android.regulardraw.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class RegularDrawFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(RegularDrawFlagsModule regularDrawFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = regularDrawFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
