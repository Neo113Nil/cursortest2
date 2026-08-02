package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.app.Application;
import ru.ozon.app.android.bank.ui.BankTabUiControllerFactory;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideBankTabUiControllerFactoryFactory implements e<BankTabUiControllerFactory> {
    private final a<Application> applicationProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideBankTabUiControllerFactoryFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<Application> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.applicationProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideBankTabUiControllerFactoryFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<Application> aVar) {
        return new TabUiControllerRegistryModule_ProvideBankTabUiControllerFactoryFactory(tabUiControllerRegistryModule, aVar);
    }

    public static BankTabUiControllerFactory provideBankTabUiControllerFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, Application application) {
        BankTabUiControllerFactory provideBankTabUiControllerFactory = tabUiControllerRegistryModule.provideBankTabUiControllerFactory(application);
        j.d(provideBankTabUiControllerFactory);
        return provideBankTabUiControllerFactory;
    }

    @Override // Pc.a
    public BankTabUiControllerFactory get() {
        return provideBankTabUiControllerFactory(this.module, this.applicationProvider.get());
    }
}
