package ru.ozon.app.android.storefront.screens.about.di;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.screens.about.AboutFragment;
import ru.ozon.app.android.storefront.screens.about.AboutFragment_MembersInjector;
import ru.ozon.app.android.storefront.screens.about.AboutViewModelImpl;
import ru.ozon.app.android.storefront.screens.about.AboutViewModelImpl_Factory;
import ru.ozon.app.android.storefront.screens.about.di.AboutFragmentComponent;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes2.dex */
public final class DaggerAboutFragmentComponent {

    private static final class AboutFragmentComponentImpl implements AboutFragmentComponent {
        private final AboutFragmentComponentImpl aboutFragmentComponentImpl;
        private a<AboutViewModelImpl> aboutViewModelImplProvider;
        private final AccountComponentApi accountComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<ComposerLocationRepository> getComposerLocationRepositoryProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final StorageComponentApi storageComponentApi;

        private static final class GetComposerLocationRepositoryProvider implements a<ComposerLocationRepository> {
            private final LocationComponentApi locationComponentApi;

            GetComposerLocationRepositoryProvider(LocationComponentApi locationComponentApi) {
                this.locationComponentApi = locationComponentApi;
            }

            @Override // Pc.a
            public ComposerLocationRepository get() {
                ComposerLocationRepository composerLocationRepository = this.locationComponentApi.getComposerLocationRepository();
                j.c(composerLocationRepository);
                return composerLocationRepository;
            }
        }

        /* synthetic */ AboutFragmentComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(networkComponentApi, storageComponentApi, navigationComponentApi, accountComponentApi, locationComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            GetComposerLocationRepositoryProvider getComposerLocationRepositoryProvider = new GetComposerLocationRepositoryProvider(locationComponentApi);
            this.getComposerLocationRepositoryProvider = getComposerLocationRepositoryProvider;
            this.aboutViewModelImplProvider = AboutViewModelImpl_Factory.create(getComposerLocationRepositoryProvider);
        }

        private AboutFragment injectAboutFragment(AboutFragment aboutFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            AboutFragment_MembersInjector.injectRouter(aboutFragment, ozonRouter);
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            AboutFragment_MembersInjector.injectUserManager(aboutFragment, userManager);
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            AboutFragment_MembersInjector.injectConfig(aboutFragment, networkComponentConfig);
            DebugToolsService debugToolService = this.storageComponentApi.getDebugToolService();
            j.c(debugToolService);
            AboutFragment_MembersInjector.injectDebugToolsService(aboutFragment, debugToolService);
            AboutFragment_MembersInjector.injectViewModelProvider(aboutFragment, this.aboutViewModelImplProvider);
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            AboutFragment_MembersInjector.injectAppType(aboutFragment, appType);
            return aboutFragment;
        }

        @Override // ru.ozon.app.android.storefront.screens.about.di.AboutFragmentComponent
        public void inject(AboutFragment aboutFragment) {
            injectAboutFragment(aboutFragment);
        }

        private AboutFragmentComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.aboutFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            initialize(networkComponentApi, storageComponentApi, navigationComponentApi, accountComponentApi, locationComponentApi, androidPlatformComponentDependencies);
        }
    }

    private static final class Factory implements AboutFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.screens.about.di.AboutFragmentComponent.Factory
        public AboutFragmentComponent create(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, AccountComponentApi accountComponentApi, LocationComponentApi locationComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            navigationComponentApi.getClass();
            accountComponentApi.getClass();
            locationComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new AboutFragmentComponentImpl(networkComponentApi, storageComponentApi, navigationComponentApi, accountComponentApi, locationComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static AboutFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
