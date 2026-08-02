package ru.ozon.app.android.whitelist.common.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class WhitelistFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(WhitelistFlagsModule whitelistFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = whitelistFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
