package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class NetworkFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(NetworkFlagsModule networkFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = networkFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
