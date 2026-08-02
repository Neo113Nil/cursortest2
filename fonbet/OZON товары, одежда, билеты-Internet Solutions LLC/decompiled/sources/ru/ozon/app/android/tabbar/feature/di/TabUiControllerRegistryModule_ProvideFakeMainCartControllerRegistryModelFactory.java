package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideFakeMainCartControllerRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<CartTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideFakeMainCartControllerRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideFakeMainCartControllerRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideFakeMainCartControllerRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideFakeMainCartControllerRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, CartTabUiControllerFactory cartTabUiControllerFactory) {
        TabControllerRegistryModel provideFakeMainCartControllerRegistryModel = tabUiControllerRegistryModule.provideFakeMainCartControllerRegistryModel(cartTabUiControllerFactory);
        j.d(provideFakeMainCartControllerRegistryModel);
        return provideFakeMainCartControllerRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideFakeMainCartControllerRegistryModel(this.module, this.factoryProvider.get());
    }
}
