package ru.ozon.app.android.ads.di.messaging;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import android.content.SharedPreferences;
import ru.ozon.app.android.ads.FirebaseAdvertisingMessagingService;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractorImpl;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractorImpl_Factory;
import ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorage;
import ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorageImpl;
import ru.ozon.app.android.ads.data.messaging.storage.AdvertisingMessagingStorageImpl_Factory;
import ru.ozon.app.android.ads.di.AdvertisingMessagingServiceModule_Companion_ProvideAdvertisingMessagingServiceFactory;
import ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingDependencyComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerAdvertisingMessagingDependencyComponent {

    private static final class AdvertisingMessagingDependencyComponentImpl implements AdvertisingMessagingDependencyComponent {
        private final AdvertisingMessagingDependencyComponentImpl advertisingMessagingDependencyComponentImpl;
        private a<AdvertisingMessagingInteractorImpl> advertisingMessagingInteractorImplProvider;
        private a<AdvertisingMessagingStorageImpl> advertisingMessagingStorageImplProvider;
        private a<AdvertisingMessagingInteractor> bindAdvertisingMessagingInteractorProvider;
        private a<AdvertisingMessagingStorage> bindAdvertisingMessagingStorageProvider;
        private a<Context> getContextProvider;
        private a<SharedPreferences> getEncryptedSharedPreferencesProvider;
        private a<FirebaseAdvertisingMessagingService> provideAdvertisingMessagingServiceProvider;

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        private static final class GetEncryptedSharedPreferencesProvider implements a<SharedPreferences> {
            private final StorageComponentApi storageComponentApi;

            GetEncryptedSharedPreferencesProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public SharedPreferences get() {
                SharedPreferences encryptedSharedPreferences = this.storageComponentApi.getEncryptedSharedPreferences();
                j.c(encryptedSharedPreferences);
                return encryptedSharedPreferences;
            }
        }

        /* synthetic */ AdvertisingMessagingDependencyComponentImpl(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, int i11) {
            this(contextComponentDependencies, storageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi) {
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.provideAdvertisingMessagingServiceProvider = AdvertisingMessagingServiceModule_Companion_ProvideAdvertisingMessagingServiceFactory.create(getContextProvider);
            GetEncryptedSharedPreferencesProvider getEncryptedSharedPreferencesProvider = new GetEncryptedSharedPreferencesProvider(storageComponentApi);
            this.getEncryptedSharedPreferencesProvider = getEncryptedSharedPreferencesProvider;
            AdvertisingMessagingStorageImpl_Factory create = AdvertisingMessagingStorageImpl_Factory.create(getEncryptedSharedPreferencesProvider);
            this.advertisingMessagingStorageImplProvider = create;
            a<AdvertisingMessagingStorage> b11 = d.b(create);
            this.bindAdvertisingMessagingStorageProvider = b11;
            AdvertisingMessagingInteractorImpl_Factory create2 = AdvertisingMessagingInteractorImpl_Factory.create(this.provideAdvertisingMessagingServiceProvider, b11);
            this.advertisingMessagingInteractorImplProvider = create2;
            this.bindAdvertisingMessagingInteractorProvider = d.b(create2);
        }

        @Override // ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingApi
        public AdvertisingMessagingInteractor getAdvertisingMessagingInteractor() {
            return this.bindAdvertisingMessagingInteractorProvider.get();
        }

        private AdvertisingMessagingDependencyComponentImpl(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi) {
            this.advertisingMessagingDependencyComponentImpl = this;
            initialize(contextComponentDependencies, storageComponentApi);
        }
    }

    private static final class Factory implements AdvertisingMessagingDependencyComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingDependencyComponent.Factory
        public AdvertisingMessagingDependencyComponent create(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi) {
            contextComponentDependencies.getClass();
            storageComponentApi.getClass();
            return new AdvertisingMessagingDependencyComponentImpl(contextComponentDependencies, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AdvertisingMessagingDependencyComponent.Factory factory() {
        return new Factory(0);
    }
}
