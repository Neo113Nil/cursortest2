package ru.ozon.app.android.storefrontcommonwidgets.di.component;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponent;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService_Factory;

/* loaded from: classes7.dex */
public final class DaggerStorefrontCommonComponent {

    private static final class Factory implements StorefrontCommonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponent.Factory
        public StorefrontCommonComponent create(StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerComponentApi composerComponentApi) {
            storageComponentApi.getClass();
            contextComponentDependencies.getClass();
            androidPlatformComponentApi.getClass();
            composerComponentApi.getClass();
            return new StorefrontCommonComponentImpl(storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, composerComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class StorefrontCommonComponentImpl implements StorefrontCommonComponent {
        private a<ComposerCacheService> getComposerCacheServiceProvider;
        private a<TeensModeStorage> getTeensModeStorageProvider;
        private final StorefrontCommonComponentImpl storefrontCommonComponentImpl;
        private a<TeensModeService> teensModeServiceProvider;

        private static final class GetComposerCacheServiceProvider implements a<ComposerCacheService> {
            private final ComposerComponentApi composerComponentApi;

            GetComposerCacheServiceProvider(ComposerComponentApi composerComponentApi) {
                this.composerComponentApi = composerComponentApi;
            }

            @Override // Pc.a
            public ComposerCacheService get() {
                ComposerCacheService composerCacheService = this.composerComponentApi.getComposerCacheService();
                j.c(composerCacheService);
                return composerCacheService;
            }
        }

        private static final class GetTeensModeStorageProvider implements a<TeensModeStorage> {
            private final StorageComponentApi storageComponentApi;

            GetTeensModeStorageProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public TeensModeStorage get() {
                TeensModeStorage teensModeStorage = this.storageComponentApi.getTeensModeStorage();
                j.c(teensModeStorage);
                return teensModeStorage;
            }
        }

        /* synthetic */ StorefrontCommonComponentImpl(StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerComponentApi composerComponentApi, int i11) {
            this(storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, composerComponentApi);
        }

        private void initialize(StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerComponentApi composerComponentApi) {
            this.getTeensModeStorageProvider = new GetTeensModeStorageProvider(storageComponentApi);
            GetComposerCacheServiceProvider getComposerCacheServiceProvider = new GetComposerCacheServiceProvider(composerComponentApi);
            this.getComposerCacheServiceProvider = getComposerCacheServiceProvider;
            this.teensModeServiceProvider = d.b(TeensModeService_Factory.create(this.getTeensModeStorageProvider, getComposerCacheServiceProvider));
        }

        @Override // ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi
        public TeensModeService getTeensModeService() {
            return this.teensModeServiceProvider.get();
        }

        private StorefrontCommonComponentImpl(StorageComponentApi storageComponentApi, ContextComponentDependencies contextComponentDependencies, AndroidPlatformComponentApi androidPlatformComponentApi, ComposerComponentApi composerComponentApi) {
            this.storefrontCommonComponentImpl = this;
            initialize(storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, composerComponentApi);
        }
    }

    public static StorefrontCommonComponent.Factory factory() {
        return new Factory(0);
    }
}
