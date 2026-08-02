package ru.ozon.app.android.cart.domain.prefetch.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CartPrefetchFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(CartPrefetchFlagsModule cartPrefetchFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = cartPrefetchFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
