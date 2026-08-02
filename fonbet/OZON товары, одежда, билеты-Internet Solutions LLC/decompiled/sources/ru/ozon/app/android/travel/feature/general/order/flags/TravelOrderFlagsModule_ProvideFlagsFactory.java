package ru.ozon.app.android.travel.feature.general.order.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelOrderFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelOrderFlagsModule travelOrderFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelOrderFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
