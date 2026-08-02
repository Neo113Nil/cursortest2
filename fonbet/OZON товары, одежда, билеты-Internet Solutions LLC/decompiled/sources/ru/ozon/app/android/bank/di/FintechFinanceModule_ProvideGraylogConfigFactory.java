package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import i30.C7004a;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideGraylogConfigFactory implements e<C7004a> {
    private final a<AppVersionService> appVersionServiceProvider;
    private final a<EnvironmentService> environmentServiceProvider;
    private final a<ExternalFintechSettings> externalFintechSettingsProvider;
    private final FintechFinanceModule module;

    public FintechFinanceModule_ProvideGraylogConfigFactory(FintechFinanceModule fintechFinanceModule, a<EnvironmentService> aVar, a<ExternalFintechSettings> aVar2, a<AppVersionService> aVar3) {
        this.module = fintechFinanceModule;
        this.environmentServiceProvider = aVar;
        this.externalFintechSettingsProvider = aVar2;
        this.appVersionServiceProvider = aVar3;
    }

    public static FintechFinanceModule_ProvideGraylogConfigFactory create(FintechFinanceModule fintechFinanceModule, a<EnvironmentService> aVar, a<ExternalFintechSettings> aVar2, a<AppVersionService> aVar3) {
        return new FintechFinanceModule_ProvideGraylogConfigFactory(fintechFinanceModule, aVar, aVar2, aVar3);
    }

    public static C7004a provideGraylogConfig(FintechFinanceModule fintechFinanceModule, EnvironmentService environmentService, ExternalFintechSettings externalFintechSettings, AppVersionService appVersionService) {
        C7004a provideGraylogConfig = fintechFinanceModule.provideGraylogConfig(environmentService, externalFintechSettings, appVersionService);
        j.d(provideGraylogConfig);
        return provideGraylogConfig;
    }

    @Override // Pc.a
    public C7004a get() {
        return provideGraylogConfig(this.module, this.environmentServiceProvider.get(), this.externalFintechSettingsProvider.get(), this.appVersionServiceProvider.get());
    }
}
