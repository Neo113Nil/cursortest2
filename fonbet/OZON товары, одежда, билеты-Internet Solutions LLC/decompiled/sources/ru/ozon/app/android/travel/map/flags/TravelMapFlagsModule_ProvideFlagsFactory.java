package ru.ozon.app.android.travel.map.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelMapFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelMapFlagsModule travelMapFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelMapFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
