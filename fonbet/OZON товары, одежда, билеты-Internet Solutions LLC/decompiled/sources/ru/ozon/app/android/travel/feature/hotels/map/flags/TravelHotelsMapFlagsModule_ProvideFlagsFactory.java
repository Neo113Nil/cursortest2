package ru.ozon.app.android.travel.feature.hotels.map.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelHotelsMapFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelHotelsMapFlagsModule travelHotelsMapFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelHotelsMapFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
