package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import i30.C7004a;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechPayModule_ProvideGraylogConfigFactory implements e<C7004a> {
    private final a<EnvironmentService> environmentServiceProvider;
    private final a<ExternalFintechSettings> externalFintechSettingsProvider;
    private final FintechPayModule module;

    public FintechPayModule_ProvideGraylogConfigFactory(FintechPayModule fintechPayModule, a<EnvironmentService> aVar, a<ExternalFintechSettings> aVar2) {
        this.module = fintechPayModule;
        this.environmentServiceProvider = aVar;
        this.externalFintechSettingsProvider = aVar2;
    }

    public static FintechPayModule_ProvideGraylogConfigFactory create(FintechPayModule fintechPayModule, a<EnvironmentService> aVar, a<ExternalFintechSettings> aVar2) {
        return new FintechPayModule_ProvideGraylogConfigFactory(fintechPayModule, aVar, aVar2);
    }

    public static C7004a provideGraylogConfig(FintechPayModule fintechPayModule, EnvironmentService environmentService, ExternalFintechSettings externalFintechSettings) {
        C7004a provideGraylogConfig = fintechPayModule.provideGraylogConfig(environmentService, externalFintechSettings);
        j.d(provideGraylogConfig);
        return provideGraylogConfig;
    }

    @Override // Pc.a
    public C7004a get() {
        return provideGraylogConfig(this.module, this.environmentServiceProvider.get(), this.externalFintechSettingsProvider.get());
    }
}
