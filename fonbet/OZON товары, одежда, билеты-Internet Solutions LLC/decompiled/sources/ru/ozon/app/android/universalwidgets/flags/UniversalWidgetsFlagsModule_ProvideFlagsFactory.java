package ru.ozon.app.android.universalwidgets.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes7.dex */
public final class UniversalWidgetsFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(UniversalWidgetsFlagsModule universalWidgetsFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = universalWidgetsFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
