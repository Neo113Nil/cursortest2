package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideSellerCartControllerRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<CartTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideSellerCartControllerRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideSellerCartControllerRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideSellerCartControllerRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideSellerCartControllerRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, CartTabUiControllerFactory cartTabUiControllerFactory) {
        TabControllerRegistryModel provideSellerCartControllerRegistryModel = tabUiControllerRegistryModule.provideSellerCartControllerRegistryModel(cartTabUiControllerFactory);
        j.d(provideSellerCartControllerRegistryModel);
        return provideSellerCartControllerRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideSellerCartControllerRegistryModel(this.module, this.factoryProvider.get());
    }
}
