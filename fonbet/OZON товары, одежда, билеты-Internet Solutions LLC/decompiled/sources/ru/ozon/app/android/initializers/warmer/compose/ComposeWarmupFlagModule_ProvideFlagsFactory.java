package ru.ozon.app.android.initializers.warmer.compose;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class ComposeWarmupFlagModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(ComposeWarmupFlagModule composeWarmupFlagModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = composeWarmupFlagModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
