package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideExpressSellerCartControllerRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<CartTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideExpressSellerCartControllerRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideExpressSellerCartControllerRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideExpressSellerCartControllerRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideExpressSellerCartControllerRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, CartTabUiControllerFactory cartTabUiControllerFactory) {
        TabControllerRegistryModel provideExpressSellerCartControllerRegistryModel = tabUiControllerRegistryModule.provideExpressSellerCartControllerRegistryModel(cartTabUiControllerFactory);
        j.d(provideExpressSellerCartControllerRegistryModel);
        return provideExpressSellerCartControllerRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideExpressSellerCartControllerRegistryModel(this.module, this.factoryProvider.get());
    }
}
