package ru.ozon.app.android.search.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class SearchFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(SearchFlagsModule searchFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = searchFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
