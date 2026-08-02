package ru.ozon.app.android.cart.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CartFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(CartFlagsModule cartFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = cartFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
