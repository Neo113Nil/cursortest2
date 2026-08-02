package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechRkoModule_ProvideExternalFintechSettingsFactory implements e<ExternalFintechSettings> {
    private final a<AndroidPlatformComponentConfig> androidPlatformComponentConfigProvider;
    private final a<AppVersionStorage> appVersionStorageProvider;
    private final a<AreaLocalStore> areaLocalStoreProvider;
    private final a<Context> contextProvider;
    private final a<EnvironmentService> environmentServiceProvider;
    private final FintechRkoModule module;
    private final a<FintechUrls> urlsProvider;

    public FintechRkoModule_ProvideExternalFintechSettingsFactory(FintechRkoModule fintechRkoModule, a<AndroidPlatformComponentConfig> aVar, a<AppVersionStorage> aVar2, a<Context> aVar3, a<EnvironmentService> aVar4, a<AreaLocalStore> aVar5, a<FintechUrls> aVar6) {
        this.module = fintechRkoModule;
        this.androidPlatformComponentConfigProvider = aVar;
        this.appVersionStorageProvider = aVar2;
        this.contextProvider = aVar3;
        this.environmentServiceProvider = aVar4;
        this.areaLocalStoreProvider = aVar5;
        this.urlsProvider = aVar6;
    }

    public static FintechRkoModule_ProvideExternalFintechSettingsFactory create(FintechRkoModule fintechRkoModule, a<AndroidPlatformComponentConfig> aVar, a<AppVersionStorage> aVar2, a<Context> aVar3, a<EnvironmentService> aVar4, a<AreaLocalStore> aVar5, a<FintechUrls> aVar6) {
        return new FintechRkoModule_ProvideExternalFintechSettingsFactory(fintechRkoModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static ExternalFintechSettings provideExternalFintechSettings(FintechRkoModule fintechRkoModule, AndroidPlatformComponentConfig androidPlatformComponentConfig, AppVersionStorage appVersionStorage, Context context, EnvironmentService environmentService, AreaLocalStore areaLocalStore, FintechUrls fintechUrls) {
        ExternalFintechSettings provideExternalFintechSettings = fintechRkoModule.provideExternalFintechSettings(androidPlatformComponentConfig, appVersionStorage, context, environmentService, areaLocalStore, fintechUrls);
        j.d(provideExternalFintechSettings);
        return provideExternalFintechSettings;
    }

    @Override // Pc.a
    public ExternalFintechSettings get() {
        return provideExternalFintechSettings(this.module, this.androidPlatformComponentConfigProvider.get(), this.appVersionStorageProvider.get(), this.contextProvider.get(), this.environmentServiceProvider.get(), this.areaLocalStoreProvider.get(), this.urlsProvider.get());
    }
}
