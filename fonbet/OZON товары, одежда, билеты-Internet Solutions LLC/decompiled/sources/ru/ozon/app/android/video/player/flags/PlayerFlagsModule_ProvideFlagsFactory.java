package ru.ozon.app.android.video.player.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class PlayerFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(PlayerFlagsModule playerFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = playerFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
