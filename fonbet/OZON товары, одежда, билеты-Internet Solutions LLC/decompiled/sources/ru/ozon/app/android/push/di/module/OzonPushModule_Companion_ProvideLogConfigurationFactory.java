package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import Zg0.d;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvideLogConfigurationFactory implements e<d> {
    public static d provideLogConfiguration(FeatureService featureService) {
        d provideLogConfiguration = OzonPushModule.INSTANCE.provideLogConfiguration(featureService);
        j.d(provideLogConfiguration);
        return provideLogConfiguration;
    }
}
