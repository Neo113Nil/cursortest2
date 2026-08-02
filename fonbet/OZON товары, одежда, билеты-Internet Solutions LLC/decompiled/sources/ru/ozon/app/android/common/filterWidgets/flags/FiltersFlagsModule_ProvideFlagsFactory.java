package ru.ozon.app.android.common.filterWidgets.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class FiltersFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(FiltersFlagsModule filtersFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = filtersFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
