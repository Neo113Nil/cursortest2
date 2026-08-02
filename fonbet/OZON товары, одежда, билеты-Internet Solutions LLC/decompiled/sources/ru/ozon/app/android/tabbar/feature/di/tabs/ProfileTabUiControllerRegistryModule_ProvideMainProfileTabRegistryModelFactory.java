package ru.ozon.app.android.tabbar.feature.di.tabs;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.tabbar.feature.tab.factory.ProfileTabUiControllerFactory;
import ru.ozon.app.android.tabbar.ui.controller.TabControllerRegistryModel;

/* loaded from: classes7.dex */
public final class ProfileTabUiControllerRegistryModule_ProvideMainProfileTabRegistryModelFactory implements e<TabControllerRegistryModel> {
    private final a<ProfileTabUiControllerFactory> factoryProvider;
    private final ProfileTabUiControllerRegistryModule module;

    public ProfileTabUiControllerRegistryModule_ProvideMainProfileTabRegistryModelFactory(ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, a<ProfileTabUiControllerFactory> aVar) {
        this.module = profileTabUiControllerRegistryModule;
        this.factoryProvider = aVar;
    }

    public static ProfileTabUiControllerRegistryModule_ProvideMainProfileTabRegistryModelFactory create(ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, a<ProfileTabUiControllerFactory> aVar) {
        return new ProfileTabUiControllerRegistryModule_ProvideMainProfileTabRegistryModelFactory(profileTabUiControllerRegistryModule, aVar);
    }

    public static TabControllerRegistryModel provideMainProfileTabRegistryModel(ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, ProfileTabUiControllerFactory profileTabUiControllerFactory) {
        TabControllerRegistryModel provideMainProfileTabRegistryModel = profileTabUiControllerRegistryModule.provideMainProfileTabRegistryModel(profileTabUiControllerFactory);
        j.d(provideMainProfileTabRegistryModel);
        return provideMainProfileTabRegistryModel;
    }

    @Override // Pc.a
    public TabControllerRegistryModel get() {
        return provideMainProfileTabRegistryModel(this.module, this.factoryProvider.get());
    }
}
