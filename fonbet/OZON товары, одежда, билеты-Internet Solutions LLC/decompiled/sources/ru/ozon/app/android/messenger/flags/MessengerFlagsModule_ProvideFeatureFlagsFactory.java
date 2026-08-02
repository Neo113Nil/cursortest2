package ru.ozon.app.android.messenger.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class MessengerFlagsModule_ProvideFeatureFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFeatureFlags(MessengerFlagsModule messengerFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFeatureFlags = messengerFlagsModule.provideFeatureFlags();
        j.d(provideFeatureFlags);
        return provideFeatureFlags;
    }
}
