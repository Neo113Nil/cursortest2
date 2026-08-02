package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import b90.C5594a;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class FintechPayModule_ProvideExternalOkHttpSettingsFactory implements e<C5594a> {
    private final a<AndroidPlatformComponentConfig> configProvider;
    private final a<FintechCookieJar> fintechCookieJarProvider;
    private final FintechPayModule module;
    private final a<ExternalFintechSettings> settingsProvider;

    public FintechPayModule_ProvideExternalOkHttpSettingsFactory(FintechPayModule fintechPayModule, a<FintechCookieJar> aVar, a<ExternalFintechSettings> aVar2, a<AndroidPlatformComponentConfig> aVar3) {
        this.module = fintechPayModule;
        this.fintechCookieJarProvider = aVar;
        this.settingsProvider = aVar2;
        this.configProvider = aVar3;
    }

    public static FintechPayModule_ProvideExternalOkHttpSettingsFactory create(FintechPayModule fintechPayModule, a<FintechCookieJar> aVar, a<ExternalFintechSettings> aVar2, a<AndroidPlatformComponentConfig> aVar3) {
        return new FintechPayModule_ProvideExternalOkHttpSettingsFactory(fintechPayModule, aVar, aVar2, aVar3);
    }

    public static C5594a provideExternalOkHttpSettings(FintechPayModule fintechPayModule, FintechCookieJar fintechCookieJar, ExternalFintechSettings externalFintechSettings, AndroidPlatformComponentConfig androidPlatformComponentConfig) {
        C5594a provideExternalOkHttpSettings = fintechPayModule.provideExternalOkHttpSettings(fintechCookieJar, externalFintechSettings, androidPlatformComponentConfig);
        j.d(provideExternalOkHttpSettings);
        return provideExternalOkHttpSettings;
    }

    @Override // Pc.a
    public C5594a get() {
        return provideExternalOkHttpSettings(this.module, this.fintechCookieJarProvider.get(), this.settingsProvider.get(), this.configProvider.get());
    }
}
