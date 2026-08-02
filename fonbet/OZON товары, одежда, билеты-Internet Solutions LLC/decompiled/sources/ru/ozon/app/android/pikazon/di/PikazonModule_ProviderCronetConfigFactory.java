package ru.ozon.app.android.pikazon.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.cronet.CronetConfig;

/* loaded from: classes7.dex */
public final class PikazonModule_ProviderCronetConfigFactory implements e<CronetConfig> {
    public static CronetConfig providerCronetConfig(PikazonModule pikazonModule) {
        CronetConfig providerCronetConfig = pikazonModule.providerCronetConfig();
        j.d(providerCronetConfig);
        return providerCronetConfig;
    }
}
