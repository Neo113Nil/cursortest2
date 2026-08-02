package ru.ozon.app.android.commonwidgets.di.ff;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CommonWidgetsFeatureFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(CommonWidgetsFeatureFlagsModule commonWidgetsFeatureFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = commonWidgetsFeatureFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
