package ru.ozon.app.android.video.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.cronet.CronetConfig;

/* loaded from: classes7.dex */
public final class VideoModule_Companion_ProviderCronetConfigFactory implements e<CronetConfig> {
    public static CronetConfig providerCronetConfig() {
        CronetConfig providerCronetConfig = VideoModule.INSTANCE.providerCronetConfig();
        j.d(providerCronetConfig);
        return providerCronetConfig;
    }
}
