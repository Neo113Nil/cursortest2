package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import b40.InterfaceC5539a;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.FintechUrls;

/* loaded from: classes6.dex */
public final class FintechEsiaModule_ProvideEsiaFactory implements e<InterfaceC5539a> {
    private final a<AppVersionService> appVersionServiceProvider;
    private final a<EnvironmentService> environmentServiceProvider;
    private final a<FintechUrls> fintechUrlsProvider;
    private final FintechEsiaModule module;

    public FintechEsiaModule_ProvideEsiaFactory(FintechEsiaModule fintechEsiaModule, a<AppVersionService> aVar, a<EnvironmentService> aVar2, a<FintechUrls> aVar3) {
        this.module = fintechEsiaModule;
        this.appVersionServiceProvider = aVar;
        this.environmentServiceProvider = aVar2;
        this.fintechUrlsProvider = aVar3;
    }

    public static FintechEsiaModule_ProvideEsiaFactory create(FintechEsiaModule fintechEsiaModule, a<AppVersionService> aVar, a<EnvironmentService> aVar2, a<FintechUrls> aVar3) {
        return new FintechEsiaModule_ProvideEsiaFactory(fintechEsiaModule, aVar, aVar2, aVar3);
    }

    public static InterfaceC5539a provideEsia(FintechEsiaModule fintechEsiaModule, AppVersionService appVersionService, EnvironmentService environmentService, FintechUrls fintechUrls) {
        InterfaceC5539a provideEsia = fintechEsiaModule.provideEsia(appVersionService, environmentService, fintechUrls);
        j.d(provideEsia);
        return provideEsia;
    }

    @Override // Pc.a
    public InterfaceC5539a get() {
        return provideEsia(this.module, this.appVersionServiceProvider.get(), this.environmentServiceProvider.get(), this.fintechUrlsProvider.get());
    }
}
