package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import b90.C5594a;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideExternalOkHttpSettingsFactory implements e<C5594a> {
    private final a<AndroidPlatformComponentConfig> configProvider;
    private final a<FintechCookieJar> fintechCookieJarProvider;
    private final FintechFinanceModule module;
    private final a<ExternalFintechSettings> settingsProvider;

    public FintechFinanceModule_ProvideExternalOkHttpSettingsFactory(FintechFinanceModule fintechFinanceModule, a<FintechCookieJar> aVar, a<ExternalFintechSettings> aVar2, a<AndroidPlatformComponentConfig> aVar3) {
        this.module = fintechFinanceModule;
        this.fintechCookieJarProvider = aVar;
        this.settingsProvider = aVar2;
        this.configProvider = aVar3;
    }

    public static FintechFinanceModule_ProvideExternalOkHttpSettingsFactory create(FintechFinanceModule fintechFinanceModule, a<FintechCookieJar> aVar, a<ExternalFintechSettings> aVar2, a<AndroidPlatformComponentConfig> aVar3) {
        return new FintechFinanceModule_ProvideExternalOkHttpSettingsFactory(fintechFinanceModule, aVar, aVar2, aVar3);
    }

    public static C5594a provideExternalOkHttpSettings(FintechFinanceModule fintechFinanceModule, FintechCookieJar fintechCookieJar, ExternalFintechSettings externalFintechSettings, AndroidPlatformComponentConfig androidPlatformComponentConfig) {
        C5594a provideExternalOkHttpSettings = fintechFinanceModule.provideExternalOkHttpSettings(fintechCookieJar, externalFintechSettings, androidPlatformComponentConfig);
        j.d(provideExternalOkHttpSettings);
        return provideExternalOkHttpSettings;
    }

    @Override // Pc.a
    public C5594a get() {
        return provideExternalOkHttpSettings(this.module, this.fintechCookieJarProvider.get(), this.settingsProvider.get(), this.configProvider.get());
    }
}
