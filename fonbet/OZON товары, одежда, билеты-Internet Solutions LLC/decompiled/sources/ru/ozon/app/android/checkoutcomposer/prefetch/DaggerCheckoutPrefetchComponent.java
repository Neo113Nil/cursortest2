package ru.ozon.app.android.checkoutcomposer.prefetch;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import java.util.Set;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutcomposer.common.configurator.CheckoutRequestInterceptor;
import ru.ozon.app.android.checkoutcomposer.common.configurator.InitCheckoutRequestConfigurator;
import ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutPrefetchComponent;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes6.dex */
public final class DaggerCheckoutPrefetchComponent {

    private static final class CheckoutPrefetchComponentImpl implements CheckoutPrefetchComponent {
        private a<CheckoutPrefetchController> bindCheckoutPrefetchControllerProvider;
        private a<LocalGoodsForCheckoutRepository> bindLocalGoodsForCheckoutRepositoryProvider;
        private final CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi;
        private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
        private final CheckoutPrefetchComponentImpl checkoutPrefetchComponentImpl;
        private a<CheckoutPrefetchControllerImpl> checkoutPrefetchControllerImplProvider;
        private final ComposerComponentApi composerComponentApi;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private a<LocalGoodsForCheckoutRepositoryStub> localGoodsForCheckoutRepositoryStubProvider;
        private final LocationComponentApi locationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<CheckoutCacheHandler> provideCheckoutCacheHandlerProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CheckoutPrefetchComponentImpl checkoutPrefetchComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92308id;

            SwitchingProvider(CheckoutPrefetchComponentImpl checkoutPrefetchComponentImpl, int i11) {
                this.checkoutPrefetchComponentImpl = checkoutPrefetchComponentImpl;
                this.f92308id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92308id;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            return (T) new LocalGoodsForCheckoutRepositoryStub();
                        }
                        throw new AssertionError(this.f92308id);
                    }
                    Set<ComposerCacheHandler> cacheHandlers = this.checkoutPrefetchComponentImpl.cacheHandlerRegistrationComponentApi.getCacheHandlers();
                    j.c(cacheHandlers);
                    return (T) CheckoutPrefetchModule_Companion_ProvideCheckoutCacheHandlerFactory.provideCheckoutCacheHandler(cacheHandlers);
                }
                FeatureChecker featureChecker = this.checkoutPrefetchComponentImpl.networkComponentApi.getFeatureChecker();
                j.c(featureChecker);
                FeatureService featureService = this.checkoutPrefetchComponentImpl.networkComponentApi.getFeatureService();
                j.c(featureService);
                ComposerPrefetchService composerPrefetchService = this.checkoutPrefetchComponentImpl.composerComponentApi.getComposerPrefetchService();
                j.c(composerPrefetchService);
                JsonParser jsonDeserializer = this.checkoutPrefetchComponentImpl.networkComponentApi.getJsonDeserializer();
                j.c(jsonDeserializer);
                CheckoutCacheHandler checkoutCacheHandler = (CheckoutCacheHandler) this.checkoutPrefetchComponentImpl.provideCheckoutCacheHandlerProvider.get();
                InitCheckoutRequestConfigurator initCheckoutRequestConfigurator = this.checkoutPrefetchComponentImpl.initCheckoutRequestConfigurator();
                AuthStateStorage authStateStorage = this.checkoutPrefetchComponentImpl.storageComponentApi.getAuthStateStorage();
                j.c(authStateStorage);
                CoroutineDispatcherProvider dispatcherProvider = this.checkoutPrefetchComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                j.c(dispatcherProvider);
                ReferrerValueController referrerValueController = this.checkoutPrefetchComponentImpl.composerComponentApi.getReferrerValueController();
                j.c(referrerValueController);
                return (T) new CheckoutPrefetchControllerImpl(featureChecker, featureService, composerPrefetchService, jsonDeserializer, checkoutCacheHandler, initCheckoutRequestConfigurator, authStateStorage, dispatcherProvider, referrerValueController, this.checkoutPrefetchComponentImpl.availableNativePaymentInterceptor(), this.checkoutPrefetchComponentImpl.checkoutRequestInterceptor());
            }
        }

        /* synthetic */ CheckoutPrefetchComponentImpl(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CacheComponentApi cacheComponentApi, ContextComponentDependencies contextComponentDependencies, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi, int i11) {
            this(composerComponentApi, networkComponentApi, storageComponentApi, cacheComponentApi, contextComponentDependencies, cacheHandlerRegistrationComponentApi, androidPlatformComponentApi, coroutineDispatchersComponentApi, checkoutPaymentComponentApi, locationComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AvailableNativePaymentInterceptor availableNativePaymentInterceptor() {
            SberPayManager sberPayManager = this.checkoutPaymentComponentApi.getSberPayManager();
            j.c(sberPayManager);
            return new AvailableNativePaymentInterceptor(sberPayManager);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CheckoutRequestInterceptor checkoutRequestInterceptor() {
            LastLocationRepository lastLocationRepository = this.locationComponentApi.getLastLocationRepository();
            j.c(lastLocationRepository);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            JsonSerializer jsonSerializer = this.networkComponentApi.getJsonSerializer();
            j.c(jsonSerializer);
            return new CheckoutRequestInterceptor(lastLocationRepository, jsonDeserializer, jsonSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InitCheckoutRequestConfigurator initCheckoutRequestConfigurator() {
            ApplicationInfoDataSource applicationInfoStorage = this.storageComponentApi.getApplicationInfoStorage();
            j.c(applicationInfoStorage);
            LocalGoodsForCheckoutRepository localGoodsForCheckoutRepository = this.bindLocalGoodsForCheckoutRepositoryProvider.get();
            GooglePayAvailabilityStorage googlePayAvailabilityStorage = this.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage();
            j.c(googlePayAvailabilityStorage);
            return new InitCheckoutRequestConfigurator(applicationInfoStorage, localGoodsForCheckoutRepository, googlePayAvailabilityStorage);
        }

        private void initialize(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CacheComponentApi cacheComponentApi, ContextComponentDependencies contextComponentDependencies, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi) {
            this.provideCheckoutCacheHandlerProvider = d.b(new SwitchingProvider(this.checkoutPrefetchComponentImpl, 1));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.checkoutPrefetchComponentImpl, 2);
            this.localGoodsForCheckoutRepositoryStubProvider = switchingProvider;
            this.bindLocalGoodsForCheckoutRepositoryProvider = m.a(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.checkoutPrefetchComponentImpl, 0);
            this.checkoutPrefetchControllerImplProvider = switchingProvider2;
            this.bindCheckoutPrefetchControllerProvider = d.b(switchingProvider2);
        }

        @Override // ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi
        public CheckoutPrefetchController getCheckoutPrefetchController() {
            return this.bindCheckoutPrefetchControllerProvider.get();
        }

        private CheckoutPrefetchComponentImpl(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CacheComponentApi cacheComponentApi, ContextComponentDependencies contextComponentDependencies, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi) {
            this.checkoutPrefetchComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.composerComponentApi = composerComponentApi;
            this.cacheHandlerRegistrationComponentApi = cacheHandlerRegistrationComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.checkoutPaymentComponentApi = checkoutPaymentComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.locationComponentApi = locationComponentApi;
            initialize(composerComponentApi, networkComponentApi, storageComponentApi, cacheComponentApi, contextComponentDependencies, cacheHandlerRegistrationComponentApi, androidPlatformComponentApi, coroutineDispatchersComponentApi, checkoutPaymentComponentApi, locationComponentApi);
        }
    }

    private static final class Factory implements CheckoutPrefetchComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutPrefetchComponent.Factory
        public CheckoutPrefetchComponent create(ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, CacheComponentApi cacheComponentApi, ContextComponentDependencies contextComponentDependencies, CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, LocationComponentApi locationComponentApi) {
            composerComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            cacheComponentApi.getClass();
            contextComponentDependencies.getClass();
            cacheHandlerRegistrationComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            checkoutPaymentComponentApi.getClass();
            locationComponentApi.getClass();
            return new CheckoutPrefetchComponentImpl(composerComponentApi, networkComponentApi, storageComponentApi, cacheComponentApi, contextComponentDependencies, cacheHandlerRegistrationComponentApi, androidPlatformComponentApi, coroutineDispatchersComponentApi, checkoutPaymentComponentApi, locationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CheckoutPrefetchComponent.Factory factory() {
        return new Factory(0);
    }
}
