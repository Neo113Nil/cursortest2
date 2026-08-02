package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.bank.ui.BankTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideBankTabBadgeControllerRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<BankTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideBankTabBadgeControllerRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<BankTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideBankTabBadgeControllerRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<BankTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideBankTabBadgeControllerRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideBankTabBadgeControllerRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, BankTabUiControllerFactory bankTabUiControllerFactory) {
        TabControllerRegistryModel provideBankTabBadgeControllerRegistryModel = tabUiControllerRegistryModule.provideBankTabBadgeControllerRegistryModel(bankTabUiControllerFactory);
        j.d(provideBankTabBadgeControllerRegistryModel);
        return provideBankTabBadgeControllerRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideBankTabBadgeControllerRegistryModel(this.module, this.factoryProvider.get());
    }
}
