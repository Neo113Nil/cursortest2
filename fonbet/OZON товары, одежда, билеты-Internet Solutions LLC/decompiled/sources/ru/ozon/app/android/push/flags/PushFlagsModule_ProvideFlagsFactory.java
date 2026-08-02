package ru.ozon.app.android.push.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class PushFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(PushFlagsModule pushFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = pushFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
