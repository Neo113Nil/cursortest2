package ru.ozon.app.android.platform.di.module;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class AndroidPlatformFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(AndroidPlatformFlagsModule androidPlatformFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = androidPlatformFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
