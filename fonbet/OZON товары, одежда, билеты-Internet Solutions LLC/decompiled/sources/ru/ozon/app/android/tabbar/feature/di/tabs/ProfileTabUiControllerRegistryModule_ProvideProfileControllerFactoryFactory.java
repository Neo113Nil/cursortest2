package ru.ozon.app.android.tabbar.feature.di.tabs;

import Jb.e;
import Jb.j;
import Pc.a;
import android.app.Application;
import ru.ozon.app.android.tabbar.feature.tab.factory.ProfileTabUiControllerFactory;

/* loaded from: classes7.dex */
public final class ProfileTabUiControllerRegistryModule_ProvideProfileControllerFactoryFactory implements e<ProfileTabUiControllerFactory> {
    private final a<Application> applicationProvider;
    private final ProfileTabUiControllerRegistryModule module;

    public ProfileTabUiControllerRegistryModule_ProvideProfileControllerFactoryFactory(ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, a<Application> aVar) {
        this.module = profileTabUiControllerRegistryModule;
        this.applicationProvider = aVar;
    }

    public static ProfileTabUiControllerRegistryModule_ProvideProfileControllerFactoryFactory create(ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, a<Application> aVar) {
        return new ProfileTabUiControllerRegistryModule_ProvideProfileControllerFactoryFactory(profileTabUiControllerRegistryModule, aVar);
    }

    public static ProfileTabUiControllerFactory provideProfileControllerFactory(ProfileTabUiControllerRegistryModule profileTabUiControllerRegistryModule, Application application) {
        ProfileTabUiControllerFactory provideProfileControllerFactory = profileTabUiControllerRegistryModule.provideProfileControllerFactory(application);
        j.d(provideProfileControllerFactory);
        return provideProfileControllerFactory;
    }

    @Override // Pc.a
    public ProfileTabUiControllerFactory get() {
        return provideProfileControllerFactory(this.module, this.applicationProvider.get());
    }
}
