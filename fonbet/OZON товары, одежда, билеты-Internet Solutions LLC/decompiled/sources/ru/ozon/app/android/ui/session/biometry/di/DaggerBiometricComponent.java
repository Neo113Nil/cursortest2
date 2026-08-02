package ru.ozon.app.android.ui.session.biometry.di;

import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.session.di.auth.AuthComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModelImpl;
import ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModelImpl_Factory;
import ru.ozon.app.android.ui.session.biometry.BiometricDialogFragment;
import ru.ozon.app.android.ui.session.biometry.BiometricDialogFragment_MembersInjector;
import ru.ozon.app.android.ui.session.biometry.di.BiometricComponent;

/* loaded from: classes2.dex */
public final class DaggerBiometricComponent {

    private static final class BiometricComponentImpl implements BiometricComponent {
        private a<BiometricAuthViewModelImpl> biometricAuthViewModelImplProvider;
        private final BiometricComponentImpl biometricComponentImpl;
        private a<Fb0.a> getBiometryAuthProvider;

        private static final class GetBiometryAuthProvider implements a<Fb0.a> {
            private final AuthComponentApi authComponentApi;

            GetBiometryAuthProvider(AuthComponentApi authComponentApi) {
                this.authComponentApi = authComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Fb0.a get() {
                Fb0.a biometryAuth = this.authComponentApi.getBiometryAuth();
                j.c(biometryAuth);
                return biometryAuth;
            }
        }

        /* synthetic */ BiometricComponentImpl(NetworkComponentApi networkComponentApi, AuthComponentApi authComponentApi, AccountComponentApi accountComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, authComponentApi, accountComponentApi, storageComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, AuthComponentApi authComponentApi, AccountComponentApi accountComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            GetBiometryAuthProvider getBiometryAuthProvider = new GetBiometryAuthProvider(authComponentApi);
            this.getBiometryAuthProvider = getBiometryAuthProvider;
            this.biometricAuthViewModelImplProvider = BiometricAuthViewModelImpl_Factory.create(getBiometryAuthProvider);
        }

        private BiometricDialogFragment injectBiometricDialogFragment(BiometricDialogFragment biometricDialogFragment) {
            BiometricDialogFragment_MembersInjector.injectPViewModel(biometricDialogFragment, this.biometricAuthViewModelImplProvider);
            return biometricDialogFragment;
        }

        @Override // ru.ozon.app.android.ui.session.biometry.di.BiometricComponent
        public void inject(BiometricDialogFragment biometricDialogFragment) {
            injectBiometricDialogFragment(biometricDialogFragment);
        }

        private BiometricComponentImpl(NetworkComponentApi networkComponentApi, AuthComponentApi authComponentApi, AccountComponentApi accountComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.biometricComponentImpl = this;
            initialize(networkComponentApi, authComponentApi, accountComponentApi, storageComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }
    }

    private static final class Factory implements BiometricComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ui.session.biometry.di.BiometricComponent.Factory
        public BiometricComponent create(StorageComponentApi storageComponentApi, AuthComponentApi authComponentApi, AccountComponentApi accountComponentApi, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            storageComponentApi.getClass();
            authComponentApi.getClass();
            accountComponentApi.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new BiometricComponentImpl(networkComponentApi, authComponentApi, accountComponentApi, storageComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static BiometricComponent.Factory factory() {
        return new Factory(0);
    }
}
