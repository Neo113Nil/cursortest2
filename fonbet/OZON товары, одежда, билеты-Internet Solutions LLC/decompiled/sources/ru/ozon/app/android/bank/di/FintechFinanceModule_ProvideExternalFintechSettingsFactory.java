package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideExternalFintechSettingsFactory implements e<ExternalFintechSettings> {
    private final a<AndroidPlatformComponentConfig> androidPlatformComponentConfigProvider;
    private final a<AppVersionService> appVersionServiceProvider;
    private final a<AppVersionStorage> appVersionStorageProvider;
    private final a<AreaLocalStore> areaLocalStoreProvider;
    private final a<Context> contextProvider;
    private final a<EnvironmentService> environmentServiceProvider;
    private final FintechFinanceModule module;
    private final a<FintechUrls> urlsProvider;

    public FintechFinanceModule_ProvideExternalFintechSettingsFactory(FintechFinanceModule fintechFinanceModule, a<AndroidPlatformComponentConfig> aVar, a<AppVersionStorage> aVar2, a<Context> aVar3, a<EnvironmentService> aVar4, a<AreaLocalStore> aVar5, a<AppVersionService> aVar6, a<FintechUrls> aVar7) {
        this.module = fintechFinanceModule;
        this.androidPlatformComponentConfigProvider = aVar;
        this.appVersionStorageProvider = aVar2;
        this.contextProvider = aVar3;
        this.environmentServiceProvider = aVar4;
        this.areaLocalStoreProvider = aVar5;
        this.appVersionServiceProvider = aVar6;
        this.urlsProvider = aVar7;
    }

    public static FintechFinanceModule_ProvideExternalFintechSettingsFactory create(FintechFinanceModule fintechFinanceModule, a<AndroidPlatformComponentConfig> aVar, a<AppVersionStorage> aVar2, a<Context> aVar3, a<EnvironmentService> aVar4, a<AreaLocalStore> aVar5, a<AppVersionService> aVar6, a<FintechUrls> aVar7) {
        return new FintechFinanceModule_ProvideExternalFintechSettingsFactory(fintechFinanceModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ExternalFintechSettings provideExternalFintechSettings(FintechFinanceModule fintechFinanceModule, AndroidPlatformComponentConfig androidPlatformComponentConfig, AppVersionStorage appVersionStorage, Context context, EnvironmentService environmentService, AreaLocalStore areaLocalStore, AppVersionService appVersionService, FintechUrls fintechUrls) {
        ExternalFintechSettings provideExternalFintechSettings = fintechFinanceModule.provideExternalFintechSettings(androidPlatformComponentConfig, appVersionStorage, context, environmentService, areaLocalStore, appVersionService, fintechUrls);
        j.d(provideExternalFintechSettings);
        return provideExternalFintechSettings;
    }

    @Override // Pc.a
    public ExternalFintechSettings get() {
        return provideExternalFintechSettings(this.module, this.androidPlatformComponentConfigProvider.get(), this.appVersionStorageProvider.get(), this.contextProvider.get(), this.environmentServiceProvider.get(), this.areaLocalStoreProvider.get(), this.appVersionServiceProvider.get(), this.urlsProvider.get());
    }
}
