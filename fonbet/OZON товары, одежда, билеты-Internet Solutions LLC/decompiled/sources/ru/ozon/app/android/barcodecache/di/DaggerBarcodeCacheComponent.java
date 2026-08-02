package ru.ozon.app.android.barcodecache.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import com.squareup.moshi.Moshi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheRepository;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheSharedPreferences;
import ru.ozon.app.android.barcodecache.cache.PersistenceBarcodeCacheManagerImpl;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponent;
import ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCache;
import ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCacheImpl;
import ru.ozon.app.android.barcodecache.wearable.NoopWearableBarcodeSyncer;
import ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes6.dex */
public final class DaggerBarcodeCacheComponent {

    private static final class BarcodeCacheComponentImpl implements BarcodeCacheComponent {
        private final ActionComponentApi actionComponentApi;
        private final BarcodeCacheComponentImpl barcodeCacheComponentImpl;
        private a<BarcodeDrawableCacheImpl> barcodeDrawableCacheImplProvider;
        private a<BarcodeCacheManager> bindBarcodeCacheManagerProvider;
        private a<BarcodeDrawableCache> bindBarcodeDrawableCacheProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<PersistenceBarcodeCacheManagerImpl> persistenceBarcodeCacheManagerImplProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final BarcodeCacheComponentImpl barcodeCacheComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92213id;

            SwitchingProvider(BarcodeCacheComponentImpl barcodeCacheComponentImpl, int i11) {
                this.barcodeCacheComponentImpl = barcodeCacheComponentImpl;
                this.f92213id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92213id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new BarcodeDrawableCacheImpl();
                    }
                    throw new AssertionError(this.f92213id);
                }
                BarcodeCacheSharedPreferences barcodeCacheSharedPreferences = this.barcodeCacheComponentImpl.barcodeCacheSharedPreferences();
                BarcodeCacheRepository barcodeCacheRepository = this.barcodeCacheComponentImpl.barcodeCacheRepository();
                TeensModeStorage teensModeStorage = this.barcodeCacheComponentImpl.storageComponentApi.getTeensModeStorage();
                j.c(teensModeStorage);
                return (T) new PersistenceBarcodeCacheManagerImpl(barcodeCacheSharedPreferences, barcodeCacheRepository, teensModeStorage);
            }
        }

        /* synthetic */ BarcodeCacheComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, coroutineDispatchersComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BarcodeCacheRepository barcodeCacheRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return new BarcodeCacheRepository(actionRepository, dispatcherProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BarcodeCacheSharedPreferences barcodeCacheSharedPreferences() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new BarcodeCacheSharedPreferences(context, moshi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.barcodeCacheComponentImpl, 0);
            this.persistenceBarcodeCacheManagerImplProvider = switchingProvider;
            this.bindBarcodeCacheManagerProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.barcodeCacheComponentImpl, 1);
            this.barcodeDrawableCacheImplProvider = switchingProvider2;
            this.bindBarcodeDrawableCacheProvider = d.b(switchingProvider2);
        }

        @Override // ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi
        public BarcodeDrawableCache getBarcodeBitmapCache() {
            return this.bindBarcodeDrawableCacheProvider.get();
        }

        @Override // ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi
        public BarcodeCacheManager getPersistentCacheManager() {
            return this.bindBarcodeCacheManagerProvider.get();
        }

        @Override // ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi
        public WearableBarcodeSyncer getWearableBarcodeSyncer() {
            return new NoopWearableBarcodeSyncer();
        }

        private BarcodeCacheComponentImpl(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.barcodeCacheComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.storageComponentApi = storageComponentApi;
            initialize(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, coroutineDispatchersComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    private static final class Factory implements BarcodeCacheComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.barcodecache.di.BarcodeCacheComponent.Factory
        public BarcodeCacheComponent create(NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            contextComponentDependencies.getClass();
            storageComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new BarcodeCacheComponentImpl(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, coroutineDispatchersComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static BarcodeCacheComponent.Factory factory() {
        return new Factory(0);
    }
}
