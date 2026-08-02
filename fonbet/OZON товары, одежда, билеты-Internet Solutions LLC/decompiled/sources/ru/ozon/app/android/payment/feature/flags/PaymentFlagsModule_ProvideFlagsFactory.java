package ru.ozon.app.android.payment.feature.flags;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class PaymentFlagsModule_ProvideFlagsFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlags(PaymentFlagsModule paymentFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlags = paymentFlagsModule.provideFlags();
        j.d(provideFlags);
        return provideFlags;
    }
}
