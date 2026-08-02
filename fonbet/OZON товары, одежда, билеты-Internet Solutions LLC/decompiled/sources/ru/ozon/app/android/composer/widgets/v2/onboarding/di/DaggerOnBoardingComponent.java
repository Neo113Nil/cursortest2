package ru.ozon.app.android.composer.widgets.v2.onboarding.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.SharedPreferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponent;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerOnBoardingComponent {

    private static final class Factory implements OnBoardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponent.Factory
        public OnBoardingComponent create(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            return new OnBoardingComponentImpl(0, networkComponentApi, storageComponentApi);
        }

        private Factory() {
        }
    }

    private static final class OnBoardingComponentImpl implements OnBoardingComponent {
        private a<OnBoardingDisplayRepository.Default> defaultProvider;
        private a<OnBoardingDisplayRepository.Empty> emptyProvider;
        private final NetworkComponentApi networkComponentApi;
        private final OnBoardingComponentImpl onBoardingComponentImpl;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92480id;
            private final OnBoardingComponentImpl onBoardingComponentImpl;

            SwitchingProvider(OnBoardingComponentImpl onBoardingComponentImpl, int i11) {
                this.onBoardingComponentImpl = onBoardingComponentImpl;
                this.f92480id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92480id;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return (T) new OnBoardingDisplayRepository.Empty();
                    }
                    throw new AssertionError(this.f92480id);
                }
                SharedPreferences sharedPreferences = this.onBoardingComponentImpl.storageComponentApi.getSharedPreferences();
                j.c(sharedPreferences);
                return (T) new OnBoardingDisplayRepository.Default(sharedPreferences);
            }
        }

        /* synthetic */ OnBoardingComponentImpl(int i11, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi) {
            this(storageComponentApi, networkComponentApi);
        }

        private OnBoardingDisplayDisableRepository.Default default_() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            return new OnBoardingDisplayDisableRepository.Default(sharedPreferences, featureService, appVersionService);
        }

        private void initialize(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            this.defaultProvider = d.b(new SwitchingProvider(this.onBoardingComponentImpl, 0));
            this.emptyProvider = d.b(new SwitchingProvider(this.onBoardingComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi
        public OnBoardingDisplayDisableRepository getDefaultOnBoardingDisplayDisableRepository() {
            return default_();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi
        public OnBoardingDisplayOnPageRepository getDefaultOnBoardingDisplayOnPageRepository() {
            return OnBoardingModule_Companion_ProvideDefaultOnBoardingDisplayOnPageRepositoryFactory.provideDefaultOnBoardingDisplayOnPageRepository();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi
        public OnBoardingDisplayRepository getDefaultOnBoardingDisplayRepository() {
            return this.defaultProvider.get();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi
        public OnBoardingDisplayOnPageRepository getEmptyOnBoardingDisplayOnPageRepository() {
            return OnBoardingModule_Companion_ProvideEmptyOnBoardingDisplayOnPageRepositoryFactory.provideEmptyOnBoardingDisplayOnPageRepository();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi
        public OnBoardingDisplayRepository getEmptyOnBoardingDisplayRepository() {
            return this.emptyProvider.get();
        }

        private OnBoardingComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi) {
            this.onBoardingComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(storageComponentApi, networkComponentApi);
        }
    }

    public static OnBoardingComponent.Factory factory() {
        return new Factory(0);
    }
}
