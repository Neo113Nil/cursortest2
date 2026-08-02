package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideExpressCartControllerRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<CartTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideExpressCartControllerRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideExpressCartControllerRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideExpressCartControllerRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideExpressCartControllerRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, CartTabUiControllerFactory cartTabUiControllerFactory) {
        TabControllerRegistryModel provideExpressCartControllerRegistryModel = tabUiControllerRegistryModule.provideExpressCartControllerRegistryModel(cartTabUiControllerFactory);
        j.d(provideExpressCartControllerRegistryModel);
        return provideExpressCartControllerRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideExpressCartControllerRegistryModel(this.module, this.factoryProvider.get());
    }
}
