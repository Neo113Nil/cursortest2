package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import java.util.Map;
import java.util.Set;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideTabUiControllerFactoriesFactory implements e<Map<TabControllerRegistryModel.Key, TabUiControllerFactory>> {
    private final a<Set<TabControllerRegistryModel>> controllersProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideTabUiControllerFactoriesFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<Set<TabControllerRegistryModel>> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.controllersProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideTabUiControllerFactoriesFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<Set<TabControllerRegistryModel>> aVar) {
        return new TabUiControllerRegistryModule_ProvideTabUiControllerFactoriesFactory(tabUiControllerRegistryModule, aVar);
    }

    public static Map<TabControllerRegistryModel.Key, TabUiControllerFactory> provideTabUiControllerFactories(TabUiControllerRegistryModule tabUiControllerRegistryModule, Set<TabControllerRegistryModel> set) {
        Map<TabControllerRegistryModel.Key, TabUiControllerFactory> provideTabUiControllerFactories = tabUiControllerRegistryModule.provideTabUiControllerFactories(set);
        j.d(provideTabUiControllerFactories);
        return provideTabUiControllerFactories;
    }

    @Override // Pc.a
    public Map<TabControllerRegistryModel.Key, TabUiControllerFactory> get() {
        return provideTabUiControllerFactories(this.module, this.controllersProvider.get());
    }
}
