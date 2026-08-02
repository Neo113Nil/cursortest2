package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import i30.C7004a;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechRkoModule_ProvideGraylogConfigFactory implements e<C7004a> {
    private final a<EnvironmentService> environmentServiceProvider;
    private final a<ExternalFintechSettings> externalFintechSettingsProvider;
    private final FintechRkoModule module;

    public FintechRkoModule_ProvideGraylogConfigFactory(FintechRkoModule fintechRkoModule, a<EnvironmentService> aVar, a<ExternalFintechSettings> aVar2) {
        this.module = fintechRkoModule;
        this.environmentServiceProvider = aVar;
        this.externalFintechSettingsProvider = aVar2;
    }

    public static FintechRkoModule_ProvideGraylogConfigFactory create(FintechRkoModule fintechRkoModule, a<EnvironmentService> aVar, a<ExternalFintechSettings> aVar2) {
        return new FintechRkoModule_ProvideGraylogConfigFactory(fintechRkoModule, aVar, aVar2);
    }

    public static C7004a provideGraylogConfig(FintechRkoModule fintechRkoModule, EnvironmentService environmentService, ExternalFintechSettings externalFintechSettings) {
        C7004a provideGraylogConfig = fintechRkoModule.provideGraylogConfig(environmentService, externalFintechSettings);
        j.d(provideGraylogConfig);
        return provideGraylogConfig;
    }

    @Override // Pc.a
    public C7004a get() {
        return provideGraylogConfig(this.module, this.environmentServiceProvider.get(), this.externalFintechSettingsProvider.get());
    }
}
