package ru.ozon.app.android.checkoutcomposer.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CheckoutFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(CheckoutFlagsModule checkoutFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = checkoutFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
