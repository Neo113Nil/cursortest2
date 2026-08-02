package ru.ozon.app.android.widgets.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class DSFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(DSFlagsModule dSFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = dSFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
