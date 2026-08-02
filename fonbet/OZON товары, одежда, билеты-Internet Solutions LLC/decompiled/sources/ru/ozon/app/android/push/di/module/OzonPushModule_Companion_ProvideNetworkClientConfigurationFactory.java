package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import We.B;
import We.C4871m;
import We.C4876s;
import We.InterfaceC4875q;
import java.util.List;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.push.di.PushComponentConfig;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvideNetworkClientConfigurationFactory implements e<Zg0.e> {
    public static Zg0.e provideNetworkClientConfiguration(PushComponentConfig pushComponentConfig, InterfaceC4875q interfaceC4875q, List<B> list, C4871m c4871m, C4876s c4876s, FeatureService featureService) {
        Zg0.e provideNetworkClientConfiguration = OzonPushModule.INSTANCE.provideNetworkClientConfiguration(pushComponentConfig, interfaceC4875q, list, c4871m, c4876s, featureService);
        j.d(provideNetworkClientConfiguration);
        return provideNetworkClientConfiguration;
    }
}
