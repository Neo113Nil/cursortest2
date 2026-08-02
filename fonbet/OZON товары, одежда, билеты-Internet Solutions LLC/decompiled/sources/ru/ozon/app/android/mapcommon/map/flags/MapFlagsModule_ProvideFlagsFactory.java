package ru.ozon.app.android.mapcommon.map.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class MapFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(MapFlagsModule mapFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = mapFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
