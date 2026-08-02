package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes6.dex */
public final class NetworkDependencyModule_Companion_ProvideNetworkComponentConfigFactory implements e<NetworkComponentConfig> {
    public static NetworkComponentConfig provideNetworkComponentConfig(String str, String str2, Fb0.e eVar, DeviceType deviceType, boolean z11) {
        NetworkComponentConfig provideNetworkComponentConfig = NetworkDependencyModule.INSTANCE.provideNetworkComponentConfig(str, str2, eVar, deviceType, z11);
        j.d(provideNetworkComponentConfig);
        return provideNetworkComponentConfig;
    }
}
