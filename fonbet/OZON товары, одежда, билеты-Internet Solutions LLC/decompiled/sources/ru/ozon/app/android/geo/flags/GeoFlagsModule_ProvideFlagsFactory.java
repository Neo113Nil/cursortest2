package ru.ozon.app.android.geo.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class GeoFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(GeoFlagsModule geoFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = geoFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
