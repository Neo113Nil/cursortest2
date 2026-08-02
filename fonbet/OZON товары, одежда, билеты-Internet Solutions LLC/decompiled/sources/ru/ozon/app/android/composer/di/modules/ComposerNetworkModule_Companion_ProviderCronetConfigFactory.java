package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.cronet.CronetConfig;

/* loaded from: classes6.dex */
public final class ComposerNetworkModule_Companion_ProviderCronetConfigFactory implements e<CronetConfig> {
    public static CronetConfig providerCronetConfig() {
        CronetConfig providerCronetConfig = ComposerNetworkModule.INSTANCE.providerCronetConfig();
        j.d(providerCronetConfig);
        return providerCronetConfig;
    }
}
