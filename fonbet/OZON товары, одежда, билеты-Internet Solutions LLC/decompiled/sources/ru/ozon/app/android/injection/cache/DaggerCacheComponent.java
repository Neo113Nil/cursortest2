package ru.ozon.app.android.injection.cache;

import Jb.d;
import Jb.j;
import Pc.a;
import We.C4862d;
import android.content.Context;
import ru.ozon.app.android.composer.network.cache.CachedUrls;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleanerImpl;
import ru.ozon.app.android.composer.network.cache.di.CacheModule_Companion_ProvideOkHttpCacheFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.injection.cache.CacheComponent;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerCacheComponent {

    private static final class CacheComponentImpl implements CacheComponent {
        private final CacheComponentImpl cacheComponentImpl;
        private a<CachedUrls> cachedUrlsProvider;
        private a<ComposerCacheCleanerImpl> composerCacheCleanerImplProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NetworkComponentApi networkComponentApi;
        private a<C4862d> provideOkHttpCacheProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CacheComponentImpl cacheComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92813id;

            SwitchingProvider(CacheComponentImpl cacheComponentImpl, int i11) {
                this.cacheComponentImpl = cacheComponentImpl;
                this.f92813id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92813id;
                if (i11 == 0) {
                    return (T) new ComposerCacheCleanerImpl((C4862d) this.cacheComponentImpl.provideOkHttpCacheProvider.get(), (CachedUrls) this.cacheComponentImpl.cachedUrlsProvider.get());
                }
                if (i11 == 1) {
                    Context context = this.cacheComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) CacheModule_Companion_ProvideOkHttpCacheFactory.provideOkHttpCache(context);
                }
                if (i11 != 2) {
                    throw new AssertionError(this.f92813id);
                }
                FeatureService featureService = this.cacheComponentImpl.networkComponentApi.getFeatureService();
                j.c(featureService);
                return (T) new CachedUrls(featureService);
            }
        }

        /* synthetic */ CacheComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(networkComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.provideOkHttpCacheProvider = d.b(new SwitchingProvider(this.cacheComponentImpl, 1));
            this.cachedUrlsProvider = d.b(new SwitchingProvider(this.cacheComponentImpl, 2));
            this.composerCacheCleanerImplProvider = d.b(new SwitchingProvider(this.cacheComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.composer.network.cache.di.CacheComponentApi
        public C4862d getCache() {
            return this.provideOkHttpCacheProvider.get();
        }

        @Override // ru.ozon.app.android.composer.network.cache.di.CacheComponentApi
        public ComposerCacheCleaner getCacheCleaner() {
            return this.composerCacheCleanerImplProvider.get();
        }

        @Override // ru.ozon.app.android.composer.network.cache.di.CacheComponentApi
        public CachedUrls getCachedUrls() {
            return this.cachedUrlsProvider.get();
        }

        private CacheComponentImpl(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.cacheComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            initialize(networkComponentApi, contextComponentDependencies);
        }
    }

    private static final class Factory implements CacheComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.injection.cache.CacheComponent.Factory
        public CacheComponent create(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new CacheComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    public static CacheComponent.Factory factory() {
        return new Factory(0);
    }
}
