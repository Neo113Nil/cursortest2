package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import We.InterfaceC4875q;
import ru.ozon.app.android.bank.network.FintechCookieJar;
import ru.ozon.app.android.storage.hosts.FintechUrls;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideFintechCookieJarFactory implements e<FintechCookieJar> {
    private final FintechFinanceModule module;
    private final a<InterfaceC4875q> ozCookieJarProvider;
    private final a<FintechUrls> urlsProvider;

    public FintechFinanceModule_ProvideFintechCookieJarFactory(FintechFinanceModule fintechFinanceModule, a<InterfaceC4875q> aVar, a<FintechUrls> aVar2) {
        this.module = fintechFinanceModule;
        this.ozCookieJarProvider = aVar;
        this.urlsProvider = aVar2;
    }

    public static FintechFinanceModule_ProvideFintechCookieJarFactory create(FintechFinanceModule fintechFinanceModule, a<InterfaceC4875q> aVar, a<FintechUrls> aVar2) {
        return new FintechFinanceModule_ProvideFintechCookieJarFactory(fintechFinanceModule, aVar, aVar2);
    }

    public static FintechCookieJar provideFintechCookieJar(FintechFinanceModule fintechFinanceModule, InterfaceC4875q interfaceC4875q, FintechUrls fintechUrls) {
        FintechCookieJar provideFintechCookieJar = fintechFinanceModule.provideFintechCookieJar(interfaceC4875q, fintechUrls);
        j.d(provideFintechCookieJar);
        return provideFintechCookieJar;
    }

    @Override // Pc.a
    public FintechCookieJar get() {
        return provideFintechCookieJar(this.module, this.ozCookieJarProvider.get(), this.urlsProvider.get());
    }
}
