package ru.ozon.app.android.common.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class PrefetchFlagsModule_ProvidePrefetchFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> providePrefetchFlags(PrefetchFlagsModule prefetchFlagsModule) {
        Set<FeatureFlagRegistrationModel> providePrefetchFlags = prefetchFlagsModule.providePrefetchFlags();
        j.d(providePrefetchFlags);
        return providePrefetchFlags;
    }
}
