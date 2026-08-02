package ru.ozon.app.android.account.locale.app.di;

import Jb.j;
import Pc.a;
import android.content.Context;
import android.content.SharedPreferences;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.locale.app.data.AppLocaleChangedEventBus;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl;
import ru.ozon.app.android.account.locale.app.data.ChangeLocaleUseCase;
import ru.ozon.app.android.account.locale.app.data.DefaultAppLocaleDataSource;
import ru.ozon.app.android.account.locale.app.data.LocalizationDebugPreferences;
import ru.ozon.app.android.account.locale.app.data.LocalizationDebugPreferencesImpl;
import ru.ozon.app.android.account.locale.app.data.PrefsLocaleDataStore;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponent;
import ru.ozon.app.android.account.locale.app.di.module.AppLocaleModule_Companion_ProvideAndroidLoggerFactory;
import ru.ozon.app.android.account.locale.app.di.module.AppLocaleModule_Companion_ProvidePreferencesFactory;
import ru.ozon.app.android.account.locale.network.NetworkLocaleRepositoryImpl;
import ru.ozon.app.android.account.locale.network.api.LocaleApi;
import ru.ozon.app.android.account.locale.network.di.module.NetworkLocaleModule_Companion_ProvideLocaleApi$account_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import sj.d;

/* loaded from: classes6.dex */
public final class DaggerAppLocaleComponent {

    private static final class AppLocaleComponentImpl implements AppLocaleComponent {
        private a<AppLocaleChangedEventBus> appLocaleChangedEventBusProvider;
        private final AppLocaleComponentImpl appLocaleComponentImpl;
        private final AppLocaleDependenciesApi appLocaleDependenciesApi;
        private a<AppLocaleRepositoryImpl> appLocaleRepositoryImplProvider;
        private a<AppLocaleRepository> bindAppLocaleRepositoryProvider;
        private a<LocalizationDebugPreferences> bindLocalizationDebugPreferencesProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<DefaultAppLocaleDataSource> defaultAppLocaleDataSourceProvider;
        private a<ChangeLocaleUseCase> getChangeLocaleUseCaseProvider;
        private a<LocalizationDebugPreferencesImpl> localizationDebugPreferencesImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<NetworkLocaleRepositoryImpl> networkLocaleRepositoryImplProvider;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private a<d> provideAndroidLoggerProvider;
        private a<SharedPreferences> providePreferencesProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AppLocaleComponentImpl appLocaleComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92087id;

            SwitchingProvider(AppLocaleComponentImpl appLocaleComponentImpl, int i11) {
                this.appLocaleComponentImpl = appLocaleComponentImpl;
                this.f92087id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92087id) {
                    case 0:
                        PrefsLocaleDataStore prefsLocaleDataStore = this.appLocaleComponentImpl.prefsLocaleDataStore();
                        Ib.a a11 = Jb.d.a(this.appLocaleComponentImpl.defaultAppLocaleDataSourceProvider);
                        Ib.a a12 = Jb.d.a(this.appLocaleComponentImpl.getChangeLocaleUseCaseProvider);
                        Ib.a a13 = Jb.d.a(this.appLocaleComponentImpl.networkLocaleRepositoryImplProvider);
                        AppLocaleChangedEventBus appLocaleChangedEventBus = (AppLocaleChangedEventBus) this.appLocaleComponentImpl.appLocaleChangedEventBusProvider.get();
                        FeatureService featureService = this.appLocaleComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        AppVersionService appVersionService = this.appLocaleComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        d dVar = (d) this.appLocaleComponentImpl.provideAndroidLoggerProvider.get();
                        Ob0.a ozonIdAppApi = this.appLocaleComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(ozonIdAppApi);
                        return (T) new AppLocaleRepositoryImpl(prefsLocaleDataStore, a11, a12, a13, appLocaleChangedEventBus, featureService, appVersionService, dVar, ozonIdAppApi, (LocalizationDebugPreferences) this.appLocaleComponentImpl.bindLocalizationDebugPreferencesProvider.get());
                    case 1:
                        Context context = this.appLocaleComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        return (T) AppLocaleModule_Companion_ProvidePreferencesFactory.providePreferences(context);
                    case 2:
                        Context context2 = this.appLocaleComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) new DefaultAppLocaleDataSource(context2);
                    case 3:
                        T t2 = (T) this.appLocaleComponentImpl.appLocaleDependenciesApi.getChangeLocaleUseCase();
                        j.c(t2);
                        return t2;
                    case 4:
                        return (T) new NetworkLocaleRepositoryImpl(this.appLocaleComponentImpl.localeApi());
                    case 5:
                        return (T) new AppLocaleChangedEventBus();
                    case 6:
                        return (T) AppLocaleModule_Companion_ProvideAndroidLoggerFactory.provideAndroidLogger();
                    case 7:
                        Context context3 = this.appLocaleComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        return (T) new LocalizationDebugPreferencesImpl(context3);
                    default:
                        throw new AssertionError(this.f92087id);
                }
            }
        }

        /* synthetic */ AppLocaleComponentImpl(ContextComponentDependencies contextComponentDependencies, AppLocaleDependenciesApi appLocaleDependenciesApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, int i11) {
            this(contextComponentDependencies, appLocaleDependenciesApi, networkComponentApi, networkOzonIdComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AppLocaleDependenciesApi appLocaleDependenciesApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi) {
            this.providePreferencesProvider = Jb.d.b(new SwitchingProvider(this.appLocaleComponentImpl, 1));
            this.defaultAppLocaleDataSourceProvider = new SwitchingProvider(this.appLocaleComponentImpl, 2);
            this.getChangeLocaleUseCaseProvider = new SwitchingProvider(this.appLocaleComponentImpl, 3);
            this.networkLocaleRepositoryImplProvider = new SwitchingProvider(this.appLocaleComponentImpl, 4);
            this.appLocaleChangedEventBusProvider = Jb.d.b(new SwitchingProvider(this.appLocaleComponentImpl, 5));
            this.provideAndroidLoggerProvider = Jb.d.b(new SwitchingProvider(this.appLocaleComponentImpl, 6));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.appLocaleComponentImpl, 7);
            this.localizationDebugPreferencesImplProvider = switchingProvider;
            this.bindLocalizationDebugPreferencesProvider = Jb.d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.appLocaleComponentImpl, 0);
            this.appLocaleRepositoryImplProvider = switchingProvider2;
            this.bindAppLocaleRepositoryProvider = Jb.d.b(switchingProvider2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LocaleApi localeApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return NetworkLocaleModule_Companion_ProvideLocaleApi$account_prodGoogleAllVendorsReleaseFactory.provideLocaleApi$account_prodGoogleAllVendorsRelease(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PrefsLocaleDataStore prefsLocaleDataStore() {
            return new PrefsLocaleDataStore(this.providePreferencesProvider.get());
        }

        @Override // ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi
        public AppLocaleChangedEventBus getAppLocaleChangedEventBus() {
            return this.appLocaleChangedEventBusProvider.get();
        }

        @Override // ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi
        public AppLocaleRepository getAppLocaleRepository() {
            return this.bindAppLocaleRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi
        public LocalizationDebugPreferences getLocalizationDebugPreferences() {
            return this.bindLocalizationDebugPreferencesProvider.get();
        }

        private AppLocaleComponentImpl(ContextComponentDependencies contextComponentDependencies, AppLocaleDependenciesApi appLocaleDependenciesApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi) {
            this.appLocaleComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.appLocaleDependenciesApi = appLocaleDependenciesApi;
            this.networkComponentApi = networkComponentApi;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            initialize(contextComponentDependencies, appLocaleDependenciesApi, networkComponentApi, networkOzonIdComponentApi);
        }
    }

    private static final class Factory implements AppLocaleComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.account.locale.app.di.AppLocaleComponent.Factory
        public AppLocaleComponent create(AppLocaleDependenciesApi appLocaleDependenciesApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi) {
            appLocaleDependenciesApi.getClass();
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            return new AppLocaleComponentImpl(contextComponentDependencies, appLocaleDependenciesApi, networkComponentApi, networkOzonIdComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AppLocaleComponent.Factory factory() {
        return new Factory(0);
    }
}
