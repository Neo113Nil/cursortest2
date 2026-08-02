package ru.ozon.app.android.common.actionHandlers.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CommonActionHandlersFlagsModule_ProvidePrefetchFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> providePrefetchFlags(CommonActionHandlersFlagsModule commonActionHandlersFlagsModule) {
        Set<FeatureFlagRegistrationModel> providePrefetchFlags = commonActionHandlersFlagsModule.providePrefetchFlags();
        j.d(providePrefetchFlags);
        return providePrefetchFlags;
    }
}
