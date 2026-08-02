package ru.ozon.app.android.domain.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.storage.environment.EnvironmentService;

/* loaded from: classes6.dex */
public final class TilesFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(TilesFlagsModule tilesFlagsModule, EnvironmentService environmentService) {
        Set<FeatureFlagRegistrationModel> provideFlags = tilesFlagsModule.provideFlags(environmentService);
        j.d(provideFlags);
        return provideFlags;
    }
}
