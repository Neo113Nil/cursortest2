package ru.ozon.app.android.pikazon.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class PikazonFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(PikazonFlagsModule pikazonFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = pikazonFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
