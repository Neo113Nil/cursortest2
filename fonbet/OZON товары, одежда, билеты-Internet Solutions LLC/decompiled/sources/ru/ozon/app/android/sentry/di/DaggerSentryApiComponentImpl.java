package ru.ozon.app.android.sentry.di;

import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import android.content.SharedPreferences;
import hg0.InterfaceC6951a;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.sentry.di.SentryApiComponentImpl;
import ru.ozon.app.android.sentry.di.module.SentryApiModule;
import ru.ozon.app.android.sentry.di.module.SentryApiModule_ProvideSentryFlagsRepositoryFactory;
import ru.ozon.app.android.sentry.di.module.SentryApiModule_ProvideSentryFlagsStorageFactory;
import ru.ozon.app.android.sentry.di.module.SentryApiModule_ProvideSentryHelperBaseApiFactory;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsRepository;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes7.dex */
public final class DaggerSentryApiComponentImpl {

    private static final class Factory implements SentryApiComponentImpl.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.sentry.di.SentryApiComponentImpl.Factory
        public SentryApiComponentImpl create(Limb2ComponentApi limb2ComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            limb2ComponentApi.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            return new SentryApiComponentImplImpl(new SentryApiModule(), limb2ComponentApi, networkComponentApi, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SentryApiComponentImplImpl implements SentryApiComponentImpl {
        private final Limb2ComponentApi limb2ComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<SentryFlagsRepository> provideSentryFlagsRepositoryProvider;
        private a<SentryFlagsStorage> provideSentryFlagsStorageProvider;
        private a<InterfaceC6951a> provideSentryHelperBaseApiProvider;
        private final SentryApiComponentImplImpl sentryApiComponentImplImpl;
        private final SentryApiModule sentryApiModule;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93464id;
            private final SentryApiComponentImplImpl sentryApiComponentImplImpl;

            SwitchingProvider(SentryApiComponentImplImpl sentryApiComponentImplImpl, int i11) {
                this.sentryApiComponentImplImpl = sentryApiComponentImplImpl;
                this.f93464id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93464id;
                if (i11 == 0) {
                    SentryApiModule sentryApiModule = this.sentryApiComponentImplImpl.sentryApiModule;
                    c ozonLimbDiStore = this.sentryApiComponentImplImpl.limb2ComponentApi.getOzonLimbDiStore();
                    j.c(ozonLimbDiStore);
                    FeatureChecker featureChecker = this.sentryApiComponentImplImpl.networkComponentApi.getFeatureChecker();
                    j.c(featureChecker);
                    return (T) SentryApiModule_ProvideSentryHelperBaseApiFactory.provideSentryHelperBaseApi(sentryApiModule, ozonLimbDiStore, featureChecker);
                }
                if (i11 == 1) {
                    SentryApiModule sentryApiModule2 = this.sentryApiComponentImplImpl.sentryApiModule;
                    FeatureChecker featureChecker2 = this.sentryApiComponentImplImpl.networkComponentApi.getFeatureChecker();
                    j.c(featureChecker2);
                    return (T) SentryApiModule_ProvideSentryFlagsRepositoryFactory.provideSentryFlagsRepository(sentryApiModule2, featureChecker2, (SentryFlagsStorage) this.sentryApiComponentImplImpl.provideSentryFlagsStorageProvider.get());
                }
                if (i11 != 2) {
                    throw new AssertionError(this.f93464id);
                }
                SentryApiModule sentryApiModule3 = this.sentryApiComponentImplImpl.sentryApiModule;
                SharedPreferences sharedPreferences = this.sentryApiComponentImplImpl.storageComponentApi.getSharedPreferences();
                j.c(sharedPreferences);
                return (T) SentryApiModule_ProvideSentryFlagsStorageFactory.provideSentryFlagsStorage(sentryApiModule3, sharedPreferences);
            }
        }

        /* synthetic */ SentryApiComponentImplImpl(SentryApiModule sentryApiModule, Limb2ComponentApi limb2ComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, int i11) {
            this(sentryApiModule, limb2ComponentApi, networkComponentApi, storageComponentApi);
        }

        private void initialize(SentryApiModule sentryApiModule, Limb2ComponentApi limb2ComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            this.provideSentryHelperBaseApiProvider = d.b(new SwitchingProvider(this.sentryApiComponentImplImpl, 0));
            this.provideSentryFlagsStorageProvider = d.b(new SwitchingProvider(this.sentryApiComponentImplImpl, 2));
            this.provideSentryFlagsRepositoryProvider = d.b(new SwitchingProvider(this.sentryApiComponentImplImpl, 1));
        }

        @Override // ru.ozon.app.android.sentry.di.SentryApiComponent
        public InterfaceC6951a provideOzonSentryHelperApi() {
            return this.provideSentryHelperBaseApiProvider.get();
        }

        @Override // ru.ozon.app.android.sentry.di.SentryApiComponent
        public SentryFlagsRepository provideSentryFlagsRepository() {
            return this.provideSentryFlagsRepositoryProvider.get();
        }

        private SentryApiComponentImplImpl(SentryApiModule sentryApiModule, Limb2ComponentApi limb2ComponentApi, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            this.sentryApiComponentImplImpl = this;
            this.sentryApiModule = sentryApiModule;
            this.limb2ComponentApi = limb2ComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.storageComponentApi = storageComponentApi;
            initialize(sentryApiModule, limb2ComponentApi, networkComponentApi, storageComponentApi);
        }
    }

    public static SentryApiComponentImpl.Factory factory() {
        return new Factory(0);
    }
}
