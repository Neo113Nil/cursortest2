package ru.ozon.app.android.common.taglist.di;

import GZ.k;
import Jb.d;
import Jb.j;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.taglist.common.TagListOnboardingDisplayRepository;
import ru.ozon.app.android.common.taglist.common.TagListOnboardingDisplayRepository_Factory;
import ru.ozon.app.android.common.taglist.common.TagListOnboardingViewModel;
import ru.ozon.app.android.common.taglist.common.TagListOnboardingViewModel_Factory;
import ru.ozon.app.android.common.taglist.di.TagListComponent;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository_Default_Factory;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes11.dex */
public final class DaggerTagListComponent {

    private static final class Factory implements TagListComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent.Factory
        public TagListComponent create(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi, OnboardingComponentApi onboardingComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            storageComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            networkComponentApi.getClass();
            onboardingComponentApi.getClass();
            navigationComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            return new TagListComponentImpl(storageComponentApi, androidPlatformComponentApi, networkComponentApi, onboardingComponentApi, navigationComponentApi, customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TagListComponentImpl implements TagListComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<OnBoardingDisplayDisableRepository.Default> defaultProvider;
        private a<AppVersionService> getAppVersionServiceProvider;
        private a<FeatureService> getFeatureServiceProvider;
        private a<SharedPreferences> getSharedPreferencesProvider;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final OnboardingComponentApi onboardingComponentApi;
        private final TagListComponentImpl tagListComponentImpl;
        private a<TagListOnboardingDisplayRepository> tagListOnboardingDisplayRepositoryProvider;
        private a<TagListOnboardingViewModel> tagListOnboardingViewModelProvider;

        private static final class GetAppVersionServiceProvider implements a<AppVersionService> {
            private final NetworkComponentApi networkComponentApi;

            GetAppVersionServiceProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public AppVersionService get() {
                AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
                j.c(appVersionService);
                return appVersionService;
            }
        }

        private static final class GetFeatureServiceProvider implements a<FeatureService> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureServiceProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureService get() {
                FeatureService featureService = this.networkComponentApi.getFeatureService();
                j.c(featureService);
                return featureService;
            }
        }

        private static final class GetSharedPreferencesProvider implements a<SharedPreferences> {
            private final StorageComponentApi storageComponentApi;

            GetSharedPreferencesProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public SharedPreferences get() {
                SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
                j.c(sharedPreferences);
                return sharedPreferences;
            }
        }

        /* synthetic */ TagListComponentImpl(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi, OnboardingComponentApi onboardingComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(storageComponentApi, androidPlatformComponentApi, networkComponentApi, onboardingComponentApi, navigationComponentApi, customActionHandlersComponentApi);
        }

        private void initialize(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi, OnboardingComponentApi onboardingComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            GetSharedPreferencesProvider getSharedPreferencesProvider = new GetSharedPreferencesProvider(storageComponentApi);
            this.getSharedPreferencesProvider = getSharedPreferencesProvider;
            this.tagListOnboardingDisplayRepositoryProvider = d.b(TagListOnboardingDisplayRepository_Factory.create(getSharedPreferencesProvider));
            this.getFeatureServiceProvider = new GetFeatureServiceProvider(networkComponentApi);
            GetAppVersionServiceProvider getAppVersionServiceProvider = new GetAppVersionServiceProvider(networkComponentApi);
            this.getAppVersionServiceProvider = getAppVersionServiceProvider;
            this.defaultProvider = OnBoardingDisplayDisableRepository_Default_Factory.create(this.getSharedPreferencesProvider, this.getFeatureServiceProvider, getAppVersionServiceProvider);
            this.tagListOnboardingViewModelProvider = TagListOnboardingViewModel_Factory.create(this.tagListOnboardingDisplayRepositoryProvider, OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory.create(), this.defaultProvider);
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public Vg.d customActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public HZ.a deeplinkHandlersCache() {
            HZ.a deeplinkHandlersCache = this.navigationComponentApi.getDeeplinkHandlersCache();
            j.c(deeplinkHandlersCache);
            return deeplinkHandlersCache;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public FeatureChecker featureChecker() {
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return featureChecker;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public AppType getAppType() {
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return appType;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public CommonOnboardingRepository onboardingRepository() {
            CommonOnboardingRepository onboardingRepository = this.onboardingComponentApi.getOnboardingRepository();
            j.c(onboardingRepository);
            return onboardingRepository;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public a<TagListOnboardingViewModel> onboardingViewModel() {
            return this.tagListOnboardingViewModelProvider;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public RecycledViewPoolViewNullifier recycledViewPoolViewNullifier() {
            RecycledViewPoolViewNullifier recyclerViewPoolNullifier = this.androidPlatformComponentApi.recyclerViewPoolNullifier();
            j.c(recyclerViewPoolNullifier);
            return recyclerViewPoolNullifier;
        }

        @Override // ru.ozon.app.android.common.taglist.di.TagListComponent
        public k routeFactory() {
            k routeFactory = this.navigationComponentApi.getRouteFactory();
            j.c(routeFactory);
            return routeFactory;
        }

        private TagListComponentImpl(StorageComponentApi storageComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi, OnboardingComponentApi onboardingComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.tagListComponentImpl = this;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.onboardingComponentApi = onboardingComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(storageComponentApi, androidPlatformComponentApi, networkComponentApi, onboardingComponentApi, navigationComponentApi, customActionHandlersComponentApi);
        }
    }

    public static TagListComponent.Factory factory() {
        return new Factory(0);
    }
}
