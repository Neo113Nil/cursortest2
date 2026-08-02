package ru.ozon.app.android.fresh.common.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class FreshFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(FreshFlagsModule freshFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = freshFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
