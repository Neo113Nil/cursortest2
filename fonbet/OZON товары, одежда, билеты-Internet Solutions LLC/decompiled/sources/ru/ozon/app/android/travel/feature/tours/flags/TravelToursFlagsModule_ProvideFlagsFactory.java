package ru.ozon.app.android.travel.feature.tours.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelToursFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelToursFlagsModule travelToursFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelToursFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
