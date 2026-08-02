package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import b90.C5594a;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechRkoModule_ProvideExternalOkHttpSettingsFactory implements e<C5594a> {
    private final a<AndroidPlatformComponentConfig> configProvider;
    private final a<FintechCookieJar> fintechCookieJarProvider;
    private final FintechRkoModule module;
    private final a<ExternalFintechSettings> settingsProvider;

    public FintechRkoModule_ProvideExternalOkHttpSettingsFactory(FintechRkoModule fintechRkoModule, a<FintechCookieJar> aVar, a<ExternalFintechSettings> aVar2, a<AndroidPlatformComponentConfig> aVar3) {
        this.module = fintechRkoModule;
        this.fintechCookieJarProvider = aVar;
        this.settingsProvider = aVar2;
        this.configProvider = aVar3;
    }

    public static FintechRkoModule_ProvideExternalOkHttpSettingsFactory create(FintechRkoModule fintechRkoModule, a<FintechCookieJar> aVar, a<ExternalFintechSettings> aVar2, a<AndroidPlatformComponentConfig> aVar3) {
        return new FintechRkoModule_ProvideExternalOkHttpSettingsFactory(fintechRkoModule, aVar, aVar2, aVar3);
    }

    public static C5594a provideExternalOkHttpSettings(FintechRkoModule fintechRkoModule, FintechCookieJar fintechCookieJar, ExternalFintechSettings externalFintechSettings, AndroidPlatformComponentConfig androidPlatformComponentConfig) {
        C5594a provideExternalOkHttpSettings = fintechRkoModule.provideExternalOkHttpSettings(fintechCookieJar, externalFintechSettings, androidPlatformComponentConfig);
        j.d(provideExternalOkHttpSettings);
        return provideExternalOkHttpSettings;
    }

    @Override // Pc.a
    public C5594a get() {
        return provideExternalOkHttpSettings(this.module, this.fintechCookieJarProvider.get(), this.settingsProvider.get(), this.configProvider.get());
    }
}
