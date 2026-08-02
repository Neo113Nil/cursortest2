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
public final class FintechFinanceModule_ProvideExternalNetworkSettingsFactory implements e<ExternalNetworkSettings> {
    private final a<AndroidPlatformComponentConfig> configProvider;
    private final a<DebugHeaderService> debugHeaderServiceProvider;
    private final a<DebugToolsService> debugToolsServiceProvider;
    private final a<C5594a> externalOkHttpSettingsProvider;
    private final FintechFinanceModule module;

    public FintechFinanceModule_ProvideExternalNetworkSettingsFactory(FintechFinanceModule fintechFinanceModule, a<C5594a> aVar, a<DebugToolsService> aVar2, a<DebugHeaderService> aVar3, a<AndroidPlatformComponentConfig> aVar4) {
        this.module = fintechFinanceModule;
        this.externalOkHttpSettingsProvider = aVar;
        this.debugToolsServiceProvider = aVar2;
        this.debugHeaderServiceProvider = aVar3;
        this.configProvider = aVar4;
    }

    public static FintechFinanceModule_ProvideExternalNetworkSettingsFactory create(FintechFinanceModule fintechFinanceModule, a<C5594a> aVar, a<DebugToolsService> aVar2, a<DebugHeaderService> aVar3, a<AndroidPlatformComponentConfig> aVar4) {
        return new FintechFinanceModule_ProvideExternalNetworkSettingsFactory(fintechFinanceModule, aVar, aVar2, aVar3, aVar4);
    }

    public static ExternalNetworkSettings provideExternalNetworkSettings(FintechFinanceModule fintechFinanceModule, C5594a c5594a, DebugToolsService debugToolsService, DebugHeaderService debugHeaderService, AndroidPlatformComponentConfig androidPlatformComponentConfig) {
        ExternalNetworkSettings provideExternalNetworkSettings = fintechFinanceModule.provideExternalNetworkSettings(c5594a, debugToolsService, debugHeaderService, androidPlatformComponentConfig);
        j.d(provideExternalNetworkSettings);
        return provideExternalNetworkSettings;
    }

    @Override // Pc.a
    public ExternalNetworkSettings get() {
        return provideExternalNetworkSettings(this.module, this.externalOkHttpSettingsProvider.get(), this.debugToolsServiceProvider.get(), this.debugHeaderServiceProvider.get(), this.configProvider.get());
    }
}
