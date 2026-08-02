package ru.ozon.app.android.travel.feature.general.common.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class TravelGeneralFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TravelGeneralFlagsModule travelGeneralFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = travelGeneralFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
