package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.C10219a;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideAntiFraudConfigFactory implements e<C10219a> {
    private final FintechFinanceModule module;
    private final a<ExternalFintechSettings> settingsProvider;

    public FintechFinanceModule_ProvideAntiFraudConfigFactory(FintechFinanceModule fintechFinanceModule, a<ExternalFintechSettings> aVar) {
        this.module = fintechFinanceModule;
        this.settingsProvider = aVar;
    }

    public static FintechFinanceModule_ProvideAntiFraudConfigFactory create(FintechFinanceModule fintechFinanceModule, a<ExternalFintechSettings> aVar) {
        return new FintechFinanceModule_ProvideAntiFraudConfigFactory(fintechFinanceModule, aVar);
    }

    public static C10219a provideAntiFraudConfig(FintechFinanceModule fintechFinanceModule, ExternalFintechSettings externalFintechSettings) {
        C10219a provideAntiFraudConfig = fintechFinanceModule.provideAntiFraudConfig(externalFintechSettings);
        j.d(provideAntiFraudConfig);
        return provideAntiFraudConfig;
    }

    @Override // Pc.a
    public C10219a get() {
        return provideAntiFraudConfig(this.module, this.settingsProvider.get());
    }
}
