package ru.ozon.app.android.tabbar.feature.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.tabbar.feature.tab.factory.ProfileTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class TabUiControllerRegistryModule_ProvideFakeOzonProfileTabRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<ProfileTabUiControllerFactory> factoryProvider;
    private final TabUiControllerRegistryModule module;

    public TabUiControllerRegistryModule_ProvideFakeOzonProfileTabRegistryModelFactory(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<ProfileTabUiControllerFactory> aVar) {
        this.module = tabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static TabUiControllerRegistryModule_ProvideFakeOzonProfileTabRegistryModelFactory create(TabUiControllerRegistryModule tabUiControllerRegistryModule, a<ProfileTabUiControllerFactory> aVar) {
        return new TabUiControllerRegistryModule_ProvideFakeOzonProfileTabRegistryModelFactory(tabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideFakeOzonProfileTabRegistryModel(TabUiControllerRegistryModule tabUiControllerRegistryModule, ProfileTabUiControllerFactory profileTabUiControllerFactory) {
        TabControllerRegistryModel provideFakeOzonProfileTabRegistryModel = tabUiControllerRegistryModule.provideFakeOzonProfileTabRegistryModel(profileTabUiControllerFactory);
        j.d(provideFakeOzonProfileTabRegistryModel);
        return provideFakeOzonProfileTabRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideFakeOzonProfileTabRegistryModel(this.module, this.factoryProvider.get());
    }
}
