package ru.ozon.app.android.bank.di;

import GZ.g;
import GZ.k;
import Jb.e;
import Jb.j;
import Pc.a;
import T80.b;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideExternalFintechNavigationFactory implements e<b> {
    private final a<HZ.a> deeplinkHandlersCacheProvider;
    private final FintechFinanceModule module;
    private final a<g> ozonRouterProvider;
    private final a<k> routeFactoryProvider;

    public FintechFinanceModule_ProvideExternalFintechNavigationFactory(FintechFinanceModule fintechFinanceModule, a<g> aVar, a<k> aVar2, a<HZ.a> aVar3) {
        this.module = fintechFinanceModule;
        this.ozonRouterProvider = aVar;
        this.routeFactoryProvider = aVar2;
        this.deeplinkHandlersCacheProvider = aVar3;
    }

    public static FintechFinanceModule_ProvideExternalFintechNavigationFactory create(FintechFinanceModule fintechFinanceModule, a<g> aVar, a<k> aVar2, a<HZ.a> aVar3) {
        return new FintechFinanceModule_ProvideExternalFintechNavigationFactory(fintechFinanceModule, aVar, aVar2, aVar3);
    }

    public static b provideExternalFintechNavigation(FintechFinanceModule fintechFinanceModule, g gVar, k kVar, HZ.a aVar) {
        b provideExternalFintechNavigation = fintechFinanceModule.provideExternalFintechNavigation(gVar, kVar, aVar);
        j.d(provideExternalFintechNavigation);
        return provideExternalFintechNavigation;
    }

    @Override // Pc.a
    public b get() {
        return provideExternalFintechNavigation(this.module, this.ozonRouterProvider.get(), this.routeFactoryProvider.get(), this.deeplinkHandlersCacheProvider.get());
    }
}
