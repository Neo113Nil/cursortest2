package ru.ozon.app.android.travel.feature.entry.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelEntryFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelEntryFlagsModule travelEntryFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelEntryFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
