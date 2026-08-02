package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.cart.ui.tab.CartTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideApparelCartControllerRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<CartTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideApparelCartControllerRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideApparelCartControllerRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<CartTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideApparelCartControllerRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideApparelCartControllerRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, CartTabUiControllerFactory cartTabUiControllerFactory) {
        TabControllerRegistryModel provideApparelCartControllerRegistryModel = tabUiControllerRegistryModule.provideApparelCartControllerRegistryModel(cartTabUiControllerFactory);
        j.d(provideApparelCartControllerRegistryModel);
        return provideApparelCartControllerRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideApparelCartControllerRegistryModel(this.module, this.factoryProvider.get());
    }
}
