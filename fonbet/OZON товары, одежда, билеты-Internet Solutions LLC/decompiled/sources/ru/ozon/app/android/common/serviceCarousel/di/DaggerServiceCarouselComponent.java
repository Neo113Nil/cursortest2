package ru.ozon.app.android.common.serviceCarousel.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import android.content.SharedPreferences;
import retrofit2.Retrofit;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselApi;
import ru.ozon.app.android.common.serviceCarousel.data.onboarding.ServiceCarouselOnboardingDisplayRepository;
import ru.ozon.app.android.common.serviceCarousel.data.onboarding.ServiceCarouselOnboardingDisplayRepository_Factory;
import ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewModel;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewModel_Factory;
import ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.ServiceCarouselOnboardingViewModel;
import ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.ServiceCarouselOnboardingViewModel_Factory;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel_Factory;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository_Default_Factory;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes11.dex */
public final class DaggerServiceCarouselComponent {

    private static final class Factory implements ServiceCarouselComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent.Factory
        public ServiceCarouselComponent create(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            return new ServiceCarouselComponentImpl(new ServiceCarouselModule(), networkComponentApi, customActionHandlersComponentApi, coroutineDispatchersComponentApi, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class ServiceCarouselComponentImpl implements ServiceCarouselComponent {
        private a<OnBoardingDisplayRepository> bindOnboardingDisplayRepositoryProvider;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<OnBoardingDisplayDisableRepository.Default> defaultProvider;
        private a<AppVersionService> getAppVersionServiceProvider;
        private a<FeatureService> getFeatureServiceProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<SharedPreferences> getSharedPreferencesProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<ServiceCarouselApi> provideServiceCarouselApiProvider;
        private final ServiceCarouselComponentImpl serviceCarouselComponentImpl;
        private a<ServiceCarouselOnboardingDisplayRepository> serviceCarouselOnboardingDisplayRepositoryProvider;
        private a<ServiceCarouselOnboardingViewModel> serviceCarouselOnboardingViewModelProvider;
        private a<ServiceCarouselViewModel> serviceCarouselViewModelProvider;

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

        private static final class GetRetrofitProvider implements a<Retrofit> {
            private final NetworkComponentApi networkComponentApi;

            GetRetrofitProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public Retrofit get() {
                Retrofit retrofit = this.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return retrofit;
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

        /* synthetic */ ServiceCarouselComponentImpl(ServiceCarouselModule serviceCarouselModule, NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, StorageComponentApi storageComponentApi, int i11) {
            this(serviceCarouselModule, networkComponentApi, customActionHandlersComponentApi, coroutineDispatchersComponentApi, storageComponentApi);
        }

        private void initialize(ServiceCarouselModule serviceCarouselModule, NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, StorageComponentApi storageComponentApi) {
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            a<ServiceCarouselApi> a11 = m.a(ServiceCarouselModule_ProvideServiceCarouselApiFactory.create(serviceCarouselModule, getRetrofitProvider));
            this.provideServiceCarouselApiProvider = a11;
            this.serviceCarouselViewModelProvider = ServiceCarouselViewModel_Factory.create(a11);
            GetSharedPreferencesProvider getSharedPreferencesProvider = new GetSharedPreferencesProvider(storageComponentApi);
            this.getSharedPreferencesProvider = getSharedPreferencesProvider;
            ServiceCarouselOnboardingDisplayRepository_Factory create = ServiceCarouselOnboardingDisplayRepository_Factory.create(getSharedPreferencesProvider);
            this.serviceCarouselOnboardingDisplayRepositoryProvider = create;
            this.bindOnboardingDisplayRepositoryProvider = d.b(create);
            this.getFeatureServiceProvider = new GetFeatureServiceProvider(networkComponentApi);
            GetAppVersionServiceProvider getAppVersionServiceProvider = new GetAppVersionServiceProvider(networkComponentApi);
            this.getAppVersionServiceProvider = getAppVersionServiceProvider;
            this.defaultProvider = OnBoardingDisplayDisableRepository_Default_Factory.create(this.getSharedPreferencesProvider, this.getFeatureServiceProvider, getAppVersionServiceProvider);
            this.serviceCarouselOnboardingViewModelProvider = ServiceCarouselOnboardingViewModel_Factory.create(this.bindOnboardingDisplayRepositoryProvider, OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory.create(), this.defaultProvider);
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent
        public CoroutineDispatcherProvider getCoroutineDispatchersProvider() {
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return dispatcherProvider;
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent
        public Vg.d getCustomActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent
        public FeatureService getFeatureService() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return featureService;
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent
        public a<ServiceCarouselOnboardingViewModel> getOnBoardingViewModel() {
            return this.serviceCarouselOnboardingViewModelProvider;
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent
        public a<SharedCarouselViewModel> getSharedViewModel() {
            return SharedCarouselViewModel_Factory.create();
        }

        @Override // ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent
        public a<ServiceCarouselViewModel> getViewModel() {
            return this.serviceCarouselViewModelProvider;
        }

        private ServiceCarouselComponentImpl(ServiceCarouselModule serviceCarouselModule, NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, StorageComponentApi storageComponentApi) {
            this.serviceCarouselComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(serviceCarouselModule, networkComponentApi, customActionHandlersComponentApi, coroutineDispatchersComponentApi, storageComponentApi);
        }
    }

    public static ServiceCarouselComponent.Factory factory() {
        return new Factory(0);
    }
}
