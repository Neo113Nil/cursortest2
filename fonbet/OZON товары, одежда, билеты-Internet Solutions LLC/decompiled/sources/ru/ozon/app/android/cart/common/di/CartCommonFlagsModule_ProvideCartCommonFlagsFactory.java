package ru.ozon.app.android.cart.common.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CartCommonFlagsModule_ProvideCartCommonFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideCartCommonFlags(CartCommonFlagsModule cartCommonFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideCartCommonFlags = cartCommonFlagsModule.provideCartCommonFlags();
        j.d(provideCartCommonFlags);
        return provideCartCommonFlags;
    }
}
