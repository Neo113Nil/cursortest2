package ru.ozon.app.android.ads.data.pixel.di;

import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import We.E;
import We.InterfaceC4875q;
import retrofit2.Retrofit;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepositoryImpl;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepositoryImpl_Factory;
import ru.ozon.app.android.ads.data.pixel.PixelHeadersInterceptor;
import ru.ozon.app.android.ads.data.pixel.PixelHeadersInterceptor_Factory;
import ru.ozon.app.android.ads.data.pixel.data.PixelApi;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponent;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerPixelRepositoryComponent {

    private static final class Factory implements PixelRepositoryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponent.Factory
        public PixelRepositoryComponent create(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, WhitelistComponentApi whitelistComponentApi, Limb2ComponentApi limb2ComponentApi) {
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            whitelistComponentApi.getClass();
            limb2ComponentApi.getClass();
            return new PixelRepositoryComponentImpl(networkComponentApi, storageComponentApi, whitelistComponentApi, limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PixelRepositoryComponentImpl implements PixelRepositoryComponent {
        private a<PixelApiRepository> bindPixelApiRepositoryProvider;
        private a<AppVersionService> getAppVersionServiceProvider;
        private a<AppVersionStorage> getAppVersionStorageProvider;
        private a<InterfaceC4875q> getCookieJarProvider;
        private a<DomainsInteractor> getDomainsInteractorProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<NetworkComponentConfig> getNetworkComponentConfigProvider;
        private a<c> getOzonLimbDiStoreProvider;
        private a<PixelApiRepositoryImpl> pixelApiRepositoryImplProvider;
        private a<PixelHeadersInterceptor> pixelHeadersInterceptorProvider;
        private final PixelRepositoryComponentImpl pixelRepositoryComponentImpl;
        private a<PixelApi> providePixelApiProvider;
        private a<E> providePixelOkHttpClientProvider;
        private a<Retrofit> providePixelRetrofitClientProvider;

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

        private static final class GetAppVersionStorageProvider implements a<AppVersionStorage> {
            private final StorageComponentApi storageComponentApi;

            GetAppVersionStorageProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public AppVersionStorage get() {
                AppVersionStorage appVersionStorage = this.storageComponentApi.getAppVersionStorage();
                j.c(appVersionStorage);
                return appVersionStorage;
            }
        }

        private static final class GetCookieJarProvider implements a<InterfaceC4875q> {
            private final NetworkComponentApi networkComponentApi;

            GetCookieJarProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public InterfaceC4875q get() {
                InterfaceC4875q cookieJar = this.networkComponentApi.getCookieJar();
                j.c(cookieJar);
                return cookieJar;
            }
        }

        private static final class GetDomainsInteractorProvider implements a<DomainsInteractor> {
            private final WhitelistComponentApi whitelistComponentApi;

            GetDomainsInteractorProvider(WhitelistComponentApi whitelistComponentApi) {
                this.whitelistComponentApi = whitelistComponentApi;
            }

            @Override // Pc.a
            public DomainsInteractor get() {
                DomainsInteractor domainsInteractor = this.whitelistComponentApi.getDomainsInteractor();
                j.c(domainsInteractor);
                return domainsInteractor;
            }
        }

        private static final class GetFeatureCheckerProvider implements a<FeatureChecker> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureCheckerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureChecker get() {
                FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                return featureChecker;
            }
        }

        private static final class GetNetworkComponentConfigProvider implements a<NetworkComponentConfig> {
            private final NetworkComponentApi networkComponentApi;

            GetNetworkComponentConfigProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public NetworkComponentConfig get() {
                NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
                j.c(networkComponentConfig);
                return networkComponentConfig;
            }
        }

        private static final class GetOzonLimbDiStoreProvider implements a<c> {
            private final Limb2ComponentApi limb2ComponentApi;

            GetOzonLimbDiStoreProvider(Limb2ComponentApi limb2ComponentApi) {
                this.limb2ComponentApi = limb2ComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public c get() {
                c ozonLimbDiStore = this.limb2ComponentApi.getOzonLimbDiStore();
                j.c(ozonLimbDiStore);
                return ozonLimbDiStore;
            }
        }

        /* synthetic */ PixelRepositoryComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, WhitelistComponentApi whitelistComponentApi, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(networkComponentApi, storageComponentApi, whitelistComponentApi, limb2ComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, WhitelistComponentApi whitelistComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.getNetworkComponentConfigProvider = new GetNetworkComponentConfigProvider(networkComponentApi);
            this.getAppVersionStorageProvider = new GetAppVersionStorageProvider(storageComponentApi);
            this.getAppVersionServiceProvider = new GetAppVersionServiceProvider(networkComponentApi);
            GetDomainsInteractorProvider getDomainsInteractorProvider = new GetDomainsInteractorProvider(whitelistComponentApi);
            this.getDomainsInteractorProvider = getDomainsInteractorProvider;
            this.pixelHeadersInterceptorProvider = PixelHeadersInterceptor_Factory.create(this.getAppVersionStorageProvider, this.getAppVersionServiceProvider, getDomainsInteractorProvider);
            this.getCookieJarProvider = new GetCookieJarProvider(networkComponentApi);
            this.getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            GetOzonLimbDiStoreProvider getOzonLimbDiStoreProvider = new GetOzonLimbDiStoreProvider(limb2ComponentApi);
            this.getOzonLimbDiStoreProvider = getOzonLimbDiStoreProvider;
            a<E> b11 = d.b(PixelRepositoryModule_Companion_ProvidePixelOkHttpClientFactory.create(this.pixelHeadersInterceptorProvider, this.getCookieJarProvider, this.getFeatureCheckerProvider, getOzonLimbDiStoreProvider));
            this.providePixelOkHttpClientProvider = b11;
            a<Retrofit> b12 = d.b(PixelRepositoryModule_Companion_ProvidePixelRetrofitClientFactory.create(this.getNetworkComponentConfigProvider, b11));
            this.providePixelRetrofitClientProvider = b12;
            a<PixelApi> b13 = d.b(PixelRepositoryModule_Companion_ProvidePixelApiFactory.create(b12));
            this.providePixelApiProvider = b13;
            PixelApiRepositoryImpl_Factory create = PixelApiRepositoryImpl_Factory.create(b13);
            this.pixelApiRepositoryImplProvider = create;
            this.bindPixelApiRepositoryProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi
        public PixelApiRepository getPixelRepository() {
            return this.bindPixelApiRepositoryProvider.get();
        }

        private PixelRepositoryComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, WhitelistComponentApi whitelistComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.pixelRepositoryComponentImpl = this;
            initialize(networkComponentApi, storageComponentApi, whitelistComponentApi, limb2ComponentApi);
        }
    }

    public static PixelRepositoryComponent.Factory factory() {
        return new Factory(0);
    }
}
