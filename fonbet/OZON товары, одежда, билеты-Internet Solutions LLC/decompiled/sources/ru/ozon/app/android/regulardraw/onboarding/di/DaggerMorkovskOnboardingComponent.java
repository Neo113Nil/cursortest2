package ru.ozon.app.android.regulardraw.onboarding.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegateImpl_Factory;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes7.dex */
public final class DaggerMorkovskOnboardingComponent {

    private static final class Factory implements MorkovskOnboardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponent.Factory
        public MorkovskOnboardingComponent create(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            return new MorkovskOnboardingComponentImpl(0, networkComponentApi, storageComponentApi);
        }

        private Factory() {
        }
    }

    private static final class MorkovskOnboardingComponentImpl implements MorkovskOnboardingComponent {
        private a<MorkovskOnboardingDelegate> bindMorkovskOnboardingDelegateProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<SharedPreferences> getSharedPreferencesProvider;
        private final MorkovskOnboardingComponentImpl morkovskOnboardingComponentImpl;
        private a<MorkovskOnboardingDelegateImpl> morkovskOnboardingDelegateImplProvider;
        private final NetworkComponentApi networkComponentApi;

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

        /* synthetic */ MorkovskOnboardingComponentImpl(int i11, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            this(storageComponentApi, networkComponentApi);
        }

        private void initialize(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            this.getSharedPreferencesProvider = new GetSharedPreferencesProvider(storageComponentApi);
            GetFeatureCheckerProvider getFeatureCheckerProvider = new GetFeatureCheckerProvider(networkComponentApi);
            this.getFeatureCheckerProvider = getFeatureCheckerProvider;
            MorkovskOnboardingDelegateImpl_Factory create = MorkovskOnboardingDelegateImpl_Factory.create(this.getSharedPreferencesProvider, getFeatureCheckerProvider);
            this.morkovskOnboardingDelegateImplProvider = create;
            this.bindMorkovskOnboardingDelegateProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi
        public MorkovskOnboardingDelegate getMorkovskOnboardingDelegate() {
            return this.bindMorkovskOnboardingDelegateProvider.get();
        }

        private MorkovskOnboardingComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            this.morkovskOnboardingComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            initialize(storageComponentApi, networkComponentApi);
        }
    }

    public static MorkovskOnboardingComponent.Factory factory() {
        return new Factory(0);
    }
}
