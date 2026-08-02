package ru.ozon.app.android.cabinet.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cabinet.di.AuthComponent;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.session.api.auth.AuthBiometricApi;
import ru.ozon.app.android.domain.session.api.auth.CredentialsApi;
import ru.ozon.app.android.domain.session.api.auth.SberAuthApi;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.interactors.AuthInteractorImpl;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractor;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractorImpl;
import ru.ozon.app.android.domain.session.interactors.SberIdInteractor;
import ru.ozon.app.android.domain.session.interactors.SberIdInteractorImpl;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;
import ru.ozon.app.android.domain.session.repository.AuthRepository;
import ru.ozon.app.android.domain.session.repository.BiometryInfoRepository;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerAuthComponent {

    private static final class AuthComponentImpl implements AuthComponent {
        private final AccountComponentApi accountComponentApi;
        private final ActionComponentApi actionComponentApi;
        private final AuthComponentImpl authComponentImpl;
        private a<AuthInteractorImpl> authInteractorImplProvider;
        private a<AuthInteractor> bindAuthInteractorProvider;
        private a<BiometryInteractor> bindBiometryInteractorProvider;
        private a<SberIdInteractor> bindSberidInteractorProvider;
        private a<BiometryInteractorImpl> biometryInteractorImplProvider;
        private a<Ob0.a> getOzonIdAppApiProvider;
        private final NetworkComponentApi networkComponentApi;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private a<CredentialsApi> provideApiProvider;
        private a<AuthBiometricApi> provideAuthBiometricApiProvider;
        private a<AuthDeeplinkReceiver> provideAuthDeeplinkReceiverProvider;
        private a<Fb0.a> provideBiometryAuthProvider;
        private a<SberAuthApi> provideSberApiProvider;
        private a<SberIdInteractorImpl> sberIdInteractorImplProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AuthComponentImpl authComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92220id;

            SwitchingProvider(AuthComponentImpl authComponentImpl, int i11) {
                this.authComponentImpl = authComponentImpl;
                this.f92220id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92220id) {
                    case 0:
                        return (T) BiometryModule_ProvideBiometryAuthFactory.provideBiometryAuth((Ob0.a) this.authComponentImpl.getOzonIdAppApiProvider.get());
                    case 1:
                        T t2 = (T) this.authComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(t2);
                        return t2;
                    case 2:
                        Retrofit retrofit = this.authComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) AuthModule_Companion_ProvideAuthBiometricApiFactory.provideAuthBiometricApi(retrofit);
                    case 3:
                        Retrofit retrofit3 = this.authComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit3);
                        return (T) AuthModule_Companion_ProvideApiFactory.provideApi(retrofit3);
                    case 4:
                        Retrofit retrofit4 = this.authComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit4);
                        return (T) AuthModule_Companion_ProvideSberApiFactory.provideSberApi(retrofit4);
                    case 5:
                        return (T) AuthModule_Companion_ProvideAuthDeeplinkReceiverFactory.provideAuthDeeplinkReceiver();
                    case 6:
                        BiometryInfoRepository biometryInfoRepository = this.authComponentImpl.biometryInfoRepository();
                        ActionV2Repository actionRepository = this.authComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        return (T) new AuthInteractorImpl(biometryInfoRepository, actionRepository, this.authComponentImpl.authResponseMapper());
                    case 7:
                        AuthBiometricApi authBiometricApi = (AuthBiometricApi) this.authComponentImpl.provideAuthBiometricApiProvider.get();
                        ActionV2Repository actionRepository2 = this.authComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository2);
                        KeyStoreRepository keyStoreRepository = this.authComponentImpl.accountComponentApi.getKeyStoreRepository();
                        j.c(keyStoreRepository);
                        ApplicationInfoDataSource applicationInfoStorage = this.authComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage);
                        return (T) new BiometryInteractorImpl(authBiometricApi, actionRepository2, keyStoreRepository, applicationInfoStorage, this.authComponentImpl.authResponseMapper());
                    case 8:
                        return (T) new SberIdInteractorImpl(this.authComponentImpl.authResponseMapper(), this.authComponentImpl.authRepository(), this.authComponentImpl.biometryInfoRepository());
                    default:
                        throw new AssertionError(this.f92220id);
                }
            }
        }

        /* synthetic */ AuthComponentImpl(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AccountComponentApi accountComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, networkOzonIdComponentApi, accountComponentApi, storageComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthRepository authRepository() {
            CredentialsApi credentialsApi = this.provideApiProvider.get();
            SberAuthApi sberAuthApi = this.provideSberApiProvider.get();
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            return new AuthRepository(credentialsApi, sberAuthApi, networkComponentConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthResponseMapper authResponseMapper() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return new AuthResponseMapper(userManager);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BiometryInfoRepository biometryInfoRepository() {
            return new BiometryInfoRepository(d.a(this.getOzonIdAppApiProvider));
        }

        private void initialize(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AccountComponentApi accountComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.getOzonIdAppApiProvider = new SwitchingProvider(this.authComponentImpl, 1);
            this.provideBiometryAuthProvider = d.b(new SwitchingProvider(this.authComponentImpl, 0));
            this.provideAuthBiometricApiProvider = d.b(new SwitchingProvider(this.authComponentImpl, 2));
            this.provideApiProvider = d.b(new SwitchingProvider(this.authComponentImpl, 3));
            this.provideSberApiProvider = d.b(new SwitchingProvider(this.authComponentImpl, 4));
            this.provideAuthDeeplinkReceiverProvider = d.b(new SwitchingProvider(this.authComponentImpl, 5));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.authComponentImpl, 6);
            this.authInteractorImplProvider = switchingProvider;
            this.bindAuthInteractorProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.authComponentImpl, 7);
            this.biometryInteractorImplProvider = switchingProvider2;
            this.bindBiometryInteractorProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.authComponentImpl, 8);
            this.sberIdInteractorImplProvider = switchingProvider3;
            this.bindSberidInteractorProvider = d.b(switchingProvider3);
        }

        @Override // ru.ozon.app.android.domain.session.di.auth.AuthComponentApi
        public AuthDeeplinkReceiver getAuthDeeplinkReceiver() {
            return this.provideAuthDeeplinkReceiverProvider.get();
        }

        @Override // ru.ozon.app.android.domain.session.di.auth.AuthComponentApi
        public AuthInteractor getAuthInteractor() {
            return this.bindAuthInteractorProvider.get();
        }

        @Override // ru.ozon.app.android.domain.session.di.auth.AuthComponentApi
        public Fb0.a getBiometryAuth() {
            return this.provideBiometryAuthProvider.get();
        }

        @Override // ru.ozon.app.android.domain.session.di.auth.AuthComponentApi
        public BiometryInteractor getBiometryInteractor() {
            return this.bindBiometryInteractorProvider.get();
        }

        @Override // ru.ozon.app.android.domain.session.di.auth.AuthComponentApi
        public SberIdInteractor getSberIdInteractor() {
            return this.bindSberidInteractorProvider.get();
        }

        private AuthComponentImpl(NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, AccountComponentApi accountComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.authComponentImpl = this;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.storageComponentApi = storageComponentApi;
            initialize(networkComponentApi, networkOzonIdComponentApi, accountComponentApi, storageComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }
    }

    private static final class Factory implements AuthComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cabinet.di.AuthComponent.Factory
        public AuthComponent create(StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            storageComponentApi.getClass();
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new AuthComponentImpl(networkComponentApi, networkOzonIdComponentApi, accountComponentApi, storageComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static AuthComponent.Factory factory() {
        return new Factory(0);
    }
}
