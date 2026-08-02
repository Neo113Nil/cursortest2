package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import b90.C5594a;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes6.dex */
public final class FintechPayModule_ProvideExternalNetworkSettingsFactory implements e<ExternalNetworkSettings> {
    private final a<AndroidPlatformComponentConfig> configProvider;
    private final a<DebugHeaderService> debugHeaderServiceProvider;
    private final a<DebugToolsService> debugToolsServiceProvider;
    private final a<C5594a> externalOkHttpSettingsProvider;
    private final FintechPayModule module;

    public FintechPayModule_ProvideExternalNetworkSettingsFactory(FintechPayModule fintechPayModule, a<C5594a> aVar, a<DebugToolsService> aVar2, a<DebugHeaderService> aVar3, a<AndroidPlatformComponentConfig> aVar4) {
        this.module = fintechPayModule;
        this.externalOkHttpSettingsProvider = aVar;
        this.debugToolsServiceProvider = aVar2;
        this.debugHeaderServiceProvider = aVar3;
        this.configProvider = aVar4;
    }

    public static FintechPayModule_ProvideExternalNetworkSettingsFactory create(FintechPayModule fintechPayModule, a<C5594a> aVar, a<DebugToolsService> aVar2, a<DebugHeaderService> aVar3, a<AndroidPlatformComponentConfig> aVar4) {
        return new FintechPayModule_ProvideExternalNetworkSettingsFactory(fintechPayModule, aVar, aVar2, aVar3, aVar4);
    }

    public static ExternalNetworkSettings provideExternalNetworkSettings(FintechPayModule fintechPayModule, C5594a c5594a, DebugToolsService debugToolsService, DebugHeaderService debugHeaderService, AndroidPlatformComponentConfig androidPlatformComponentConfig) {
        ExternalNetworkSettings provideExternalNetworkSettings = fintechPayModule.provideExternalNetworkSettings(c5594a, debugToolsService, debugHeaderService, androidPlatformComponentConfig);
        j.d(provideExternalNetworkSettings);
        return provideExternalNetworkSettings;
    }

    @Override // Pc.a
    public ExternalNetworkSettings get() {
        return provideExternalNetworkSettings(this.module, this.externalOkHttpSettingsProvider.get(), this.debugToolsServiceProvider.get(), this.debugHeaderServiceProvider.get(), this.configProvider.get());
    }
}
