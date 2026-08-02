package ru.ozon.app.android.travel.feature.hotels.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelHotelsFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelHotelsFlagsModule travelHotelsFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelHotelsFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
