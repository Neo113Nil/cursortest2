package ru.ozon.app.android.action.featureflag;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class AtomActionFlagModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(AtomActionFlagModule atomActionFlagModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = atomActionFlagModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
