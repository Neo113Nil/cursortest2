package ru.ozon.app.android.storefront.domain.onboarding.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepositoryImpl;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepositoryImpl_Factory;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponent;

/* loaded from: classes7.dex */
public final class DaggerOnboardingComponent {

    private static final class Factory implements OnboardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponent.Factory
        public OnboardingComponent create(StorageComponentApi storageComponentApi) {
            storageComponentApi.getClass();
            return new OnboardingComponentImpl(storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OnboardingComponentImpl implements OnboardingComponent {
        private a<CommonOnboardingRepositoryImpl> commonOnboardingRepositoryImplProvider;
        private a<SharedPreferences> getSharedPreferencesProvider;
        private final OnboardingComponentImpl onboardingComponentImpl;

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

        /* synthetic */ OnboardingComponentImpl(StorageComponentApi storageComponentApi, int i11) {
            this(storageComponentApi);
        }

        private void initialize(StorageComponentApi storageComponentApi) {
            GetSharedPreferencesProvider getSharedPreferencesProvider = new GetSharedPreferencesProvider(storageComponentApi);
            this.getSharedPreferencesProvider = getSharedPreferencesProvider;
            this.commonOnboardingRepositoryImplProvider = d.b(CommonOnboardingRepositoryImpl_Factory.create(getSharedPreferencesProvider));
        }

        @Override // ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi
        public CommonOnboardingRepository getOnboardingRepository() {
            return this.commonOnboardingRepositoryImplProvider.get();
        }

        private OnboardingComponentImpl(StorageComponentApi storageComponentApi) {
            this.onboardingComponentImpl = this;
            initialize(storageComponentApi);
        }
    }

    public static OnboardingComponent.Factory factory() {
        return new Factory(0);
    }
}
