package ru.ozon.app.android.warmup.flags.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class WarmupFeatureFlagsModule_ProvideWarmupFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideWarmupFlags(WarmupFeatureFlagsModule warmupFeatureFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideWarmupFlags = warmupFeatureFlagsModule.provideWarmupFlags();
        j.d(provideWarmupFlags);
        return provideWarmupFlags;
    }
}
