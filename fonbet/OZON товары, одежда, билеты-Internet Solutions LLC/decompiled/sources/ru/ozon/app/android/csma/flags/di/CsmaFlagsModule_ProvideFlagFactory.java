package ru.ozon.app.android.csma.flags.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

/* loaded from: classes6.dex */
public final class CsmaFlagsModule_ProvideFlagFactory implements e<Set<FeatureFlagRegistrationModel>> {
    public static Set<FeatureFlagRegistrationModel> provideFlag(CsmaFlagsModule csmaFlagsModule) {
        Set<FeatureFlagRegistrationModel> provideFlag = csmaFlagsModule.provideFlag();
        j.d(provideFlag);
        return provideFlag;
    }
}
