package ru.ozon.app.android.injection.cache.handler;

import Jb.d;
import Jb.j;
import Pc.a;
import com.google.common.collect.A;
import ei0.InterfaceC6369b;
import java.util.Set;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.cart.domain.prefetch.cache.CartAdaptRequestForCachingDelegate;
import ru.ozon.app.android.cart.domain.prefetch.cache.CartCacheHandler;
import ru.ozon.app.android.cart.domain.prefetch.cache.PclPageTracker;
import ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutCacheHandler;
import ru.ozon.app.android.common.cache.SearchAdapterRequestForCachingDelegate;
import ru.ozon.app.android.common.cache.handler.dialogSearch.DialogTapTagsCacheHandler;
import ru.ozon.app.android.common.cache.handler.search.SearchCacheHandler;
import ru.ozon.app.android.common.cache.handler.suggest.SuggestResultCacheHandler;
import ru.ozon.app.android.common.homeprefetch.HomeCacheHandler;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;
import ru.ozon.app.android.composer.network.cache.cacheHandler.DefaultCacheHandler;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.injection.cache.handler.CacheHandlerRegistrationComponent;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.cache.PdpAdaptRequestForCachingDelegate;
import ru.ozon.app.android.pdp.cache.PdpCacheHandler;

/* loaded from: classes6.dex */
public final class DaggerCacheHandlerRegistrationComponent {

    private static final class CacheHandlerRegistrationComponentImpl implements CacheHandlerRegistrationComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final CacheComponentApi cacheComponentApi;
        private final CacheHandlerRegistrationComponentImpl cacheHandlerRegistrationComponentImpl;
        private a<CartCacheHandler> cartCacheHandlerProvider;
        private a<CheckoutCacheHandler> checkoutCacheHandlerProvider;
        private a<DefaultCacheHandler> defaultCacheHandlerProvider;
        private a<DialogTapTagsCacheHandler> dialogTapTagsCacheHandlerProvider;
        private a<HomeCacheHandler> homeCacheHandlerProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<PclPageTracker> pclPageTrackerProvider;
        private a<PdpCacheHandler> pdpCacheHandlerProvider;
        private final RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi;
        private a<SearchCacheHandler> searchCacheHandlerProvider;
        private a<SuggestResultCacheHandler> suggestResultCacheHandlerProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CacheHandlerRegistrationComponentImpl cacheHandlerRegistrationComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92814id;

            SwitchingProvider(CacheHandlerRegistrationComponentImpl cacheHandlerRegistrationComponentImpl, int i11) {
                this.cacheHandlerRegistrationComponentImpl = cacheHandlerRegistrationComponentImpl;
                this.f92814id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92814id) {
                    case 0:
                        FeatureChecker featureChecker = this.cacheHandlerRegistrationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        ComposerCacheCleaner cacheCleaner = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner);
                        return (T) new CheckoutCacheHandler(featureChecker, cacheCleaner);
                    case 1:
                        ComposerCacheCleaner cacheCleaner2 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner2);
                        return (T) new SearchCacheHandler(cacheCleaner2);
                    case 2:
                        SearchAdapterRequestForCachingDelegate searchAdapterRequestForCachingDelegate = this.cacheHandlerRegistrationComponentImpl.searchAdapterRequestForCachingDelegate();
                        ComposerCacheCleaner cacheCleaner3 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner3);
                        ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder = this.cacheHandlerRegistrationComponentImpl.runningPrefetchedRequestUrlsComponentApi.getRunningPrefetchedRequestUrlsHolder();
                        j.c(runningPrefetchedRequestUrlsHolder);
                        FeatureChecker featureChecker2 = this.cacheHandlerRegistrationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker2);
                        return (T) new SuggestResultCacheHandler(searchAdapterRequestForCachingDelegate, cacheCleaner3, runningPrefetchedRequestUrlsHolder, featureChecker2);
                    case 3:
                        SearchAdapterRequestForCachingDelegate searchAdapterRequestForCachingDelegate2 = this.cacheHandlerRegistrationComponentImpl.searchAdapterRequestForCachingDelegate();
                        ComposerCacheCleaner cacheCleaner4 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner4);
                        ComposerRunningPrefetchedRequestUrlsHolder runningPrefetchedRequestUrlsHolder2 = this.cacheHandlerRegistrationComponentImpl.runningPrefetchedRequestUrlsComponentApi.getRunningPrefetchedRequestUrlsHolder();
                        j.c(runningPrefetchedRequestUrlsHolder2);
                        FeatureChecker featureChecker3 = this.cacheHandlerRegistrationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker3);
                        return (T) new DialogTapTagsCacheHandler(searchAdapterRequestForCachingDelegate2, cacheCleaner4, runningPrefetchedRequestUrlsHolder2, featureChecker3);
                    case 4:
                        FeatureChecker featureChecker4 = this.cacheHandlerRegistrationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker4);
                        CartAdaptRequestForCachingDelegate cartAdaptRequestForCachingDelegate = this.cacheHandlerRegistrationComponentImpl.cartAdaptRequestForCachingDelegate();
                        ComposerCacheCleaner cacheCleaner5 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner5);
                        return (T) new CartCacheHandler(featureChecker4, cartAdaptRequestForCachingDelegate, cacheCleaner5, (PclPageTracker) this.cacheHandlerRegistrationComponentImpl.pclPageTrackerProvider.get());
                    case 5:
                        InterfaceC6369b ozonTracker = this.cacheHandlerRegistrationComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker);
                        FeatureChecker featureChecker5 = this.cacheHandlerRegistrationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker5);
                        return (T) new PclPageTracker(ozonTracker, featureChecker5);
                    case 6:
                        PdpAdaptRequestForCachingDelegate pdpAdaptRequestForCachingDelegate = this.cacheHandlerRegistrationComponentImpl.pdpAdaptRequestForCachingDelegate();
                        ComposerCacheCleaner cacheCleaner6 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner6);
                        return (T) new PdpCacheHandler(pdpAdaptRequestForCachingDelegate, cacheCleaner6);
                    case 7:
                        ComposerCacheCleaner cacheCleaner7 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner7);
                        return (T) new DefaultCacheHandler(cacheCleaner7);
                    case 8:
                        ComposerCacheCleaner cacheCleaner8 = this.cacheHandlerRegistrationComponentImpl.cacheComponentApi.getCacheCleaner();
                        j.c(cacheCleaner8);
                        FeatureChecker featureChecker6 = this.cacheHandlerRegistrationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker6);
                        return (T) new HomeCacheHandler(cacheCleaner8, featureChecker6);
                    default:
                        throw new AssertionError(this.f92814id);
                }
            }
        }

        /* synthetic */ CacheHandlerRegistrationComponentImpl(CacheComponentApi cacheComponentApi, NetworkComponentApi networkComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, AnalyticsComponentApi analyticsComponentApi, int i11) {
            this(cacheComponentApi, networkComponentApi, runningPrefetchedRequestUrlsComponentApi, analyticsComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CartAdaptRequestForCachingDelegate cartAdaptRequestForCachingDelegate() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return new CartAdaptRequestForCachingDelegate(featureService);
        }

        private void initialize(CacheComponentApi cacheComponentApi, NetworkComponentApi networkComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.checkoutCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 0));
            this.searchCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 1));
            this.suggestResultCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 2));
            this.dialogTapTagsCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 3));
            this.pclPageTrackerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 5));
            this.cartCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 4));
            this.pdpCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 6));
            this.defaultCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 7));
            this.homeCacheHandlerProvider = d.b(new SwitchingProvider(this.cacheHandlerRegistrationComponentImpl, 8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PdpAdaptRequestForCachingDelegate pdpAdaptRequestForCachingDelegate() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return new PdpAdaptRequestForCachingDelegate(featureService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SearchAdapterRequestForCachingDelegate searchAdapterRequestForCachingDelegate() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return new SearchAdapterRequestForCachingDelegate(featureService);
        }

        @Override // ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi
        public Set<ComposerCacheHandler> getCacheHandlers() {
            return A.F(this.checkoutCacheHandlerProvider.get(), this.searchCacheHandlerProvider.get(), this.suggestResultCacheHandlerProvider.get(), this.dialogTapTagsCacheHandlerProvider.get(), this.cartCacheHandlerProvider.get(), this.pdpCacheHandlerProvider.get(), this.defaultCacheHandlerProvider.get(), this.homeCacheHandlerProvider.get());
        }

        private CacheHandlerRegistrationComponentImpl(CacheComponentApi cacheComponentApi, NetworkComponentApi networkComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            this.cacheHandlerRegistrationComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.cacheComponentApi = cacheComponentApi;
            this.runningPrefetchedRequestUrlsComponentApi = runningPrefetchedRequestUrlsComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            initialize(cacheComponentApi, networkComponentApi, runningPrefetchedRequestUrlsComponentApi, analyticsComponentApi);
        }
    }

    private static final class Factory implements CacheHandlerRegistrationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.injection.cache.handler.CacheHandlerRegistrationComponent.Factory
        public CacheHandlerRegistrationComponent create(CacheComponentApi cacheComponentApi, NetworkComponentApi networkComponentApi, RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi, AnalyticsComponentApi analyticsComponentApi) {
            cacheComponentApi.getClass();
            networkComponentApi.getClass();
            runningPrefetchedRequestUrlsComponentApi.getClass();
            analyticsComponentApi.getClass();
            return new CacheHandlerRegistrationComponentImpl(cacheComponentApi, networkComponentApi, runningPrefetchedRequestUrlsComponentApi, analyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CacheHandlerRegistrationComponent.Factory factory() {
        return new Factory(0);
    }
}
