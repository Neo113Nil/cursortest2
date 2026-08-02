package ru.ozon.fintech.features.camera.di;

import Jb.d;
import Jb.i;
import Jb.j;
import P30.b;
import Q90.c;
import We.E;
import Y20.a;
import android.content.Context;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import java.util.Map;
import n90.InterfaceC8456a;
import r90.f;
import ru.ozon.fintech.features.camera.di.CameraComponent;
import ru.ozon.fintech.features.camera.di.module.CameraModule_ProvideCameraInteractorFactory;
import ru.ozon.fintech.features.camera.di.module.CameraModule_ProvideCameraNetworkFactory;
import ru.ozon.fintech.features.camera.di.module.CameraModule_ProvideViewModelFactoryFactory;
import ru.ozon.fintech.features.camera.domain.CameraInteractor;
import ru.ozon.fintech.features.camera.domain.analytic.BankCardScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.BankCardScannerAnalytic_Factory;
import ru.ozon.fintech.features.camera.domain.analytic.PhoneScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.PhoneScannerAnalytic_Factory;
import ru.ozon.fintech.features.camera.domain.analytic.QrScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.QrScannerAnalytic_Factory;
import ru.ozon.fintech.features.camera.network.CameraNetwork;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment_MembersInjector;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel_Factory;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultBottomSheet;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultViewModel;
import ru.ozon.fintech.features.camera.presentation.qrconfirm.QrScannerResultViewModel_Factory;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v40.C10226b;

/* loaded from: classes3.dex */
public final class DaggerCameraComponent {

    private static final class CameraComponentImpl implements CameraComponent {
        private final a analyticApi;
        private Pc.a<BankCardScannerAnalytic> bankCardScannerAnalyticProvider;
        private final CameraComponentImpl cameraComponentImpl;
        private Pc.a<CameraScannerFactory> cameraScannerFactoryProvider;
        private Pc.a<CameraViewModel> cameraViewModelProvider;
        private final ExternalFintechSettings externalFintechSettings;
        private Pc.a<ExternalFintechSettings> externalFintechSettingsProvider;
        private final b fintechAppApi;
        private Pc.a<InterfaceC6083a> getExchangerProvider;
        private Pc.a<c> getFeatureTogglesProvider;
        private Pc.a<InterfaceC6618a> getFintechAnalyticInteractorProvider;
        private Pc.a<f> getFintechPermissionDelegateProvider;
        private Pc.a<ru.ozon.fintech.settings.domain.a> getFintechSettingsProvider;
        private Pc.a<E> getOkHttpClientProvider;
        private Pc.a<Map<Class<? extends w0>, Pc.a<w0>>> mapOfClassOfAndProviderOfViewModelProvider;
        private Pc.a<PhoneScannerAnalytic> phoneScannerAnalyticProvider;
        private Pc.a<R30.a> provideAppCoroutineScopesProvider;
        private Pc.a<CameraInteractor> provideCameraInteractorProvider;
        private Pc.a<CameraNetwork> provideCameraNetworkProvider;
        private Pc.a<K40.a> provideCbottomDisplayProvider;
        private Pc.a<Context> provideContextProvider;
        private Pc.a<Moshi> provideMoshiProvider;
        private Pc.a<S80.b> provideNavigationProvider;
        private Pc.a<z0.b> provideViewModelFactoryProvider;
        private Pc.a<QrScannerAnalytic> qrScannerAnalyticProvider;
        private Pc.a<QrScannerResultViewModel> qrScannerResultViewModelProvider;

        private static final class GetExchangerProvider implements Pc.a<InterfaceC6083a> {
            private final InterfaceC6422b exchangerApi;

            GetExchangerProvider(InterfaceC6422b interfaceC6422b) {
                this.exchangerApi = interfaceC6422b;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public InterfaceC6083a get() {
                InterfaceC6083a G02 = this.exchangerApi.G0();
                j.c(G02);
                return G02;
            }
        }

        private static final class GetFeatureTogglesProvider implements Pc.a<c> {
            private final O90.a settingsApi;

            GetFeatureTogglesProvider(O90.a aVar) {
                this.settingsApi = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public c get() {
                c F02 = this.settingsApi.F0();
                j.c(F02);
                return F02;
            }
        }

        private static final class GetFintechAnalyticInteractorProvider implements Pc.a<InterfaceC6618a> {
            private final a analyticApi;

            GetFintechAnalyticInteractorProvider(a aVar) {
                this.analyticApi = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public InterfaceC6618a get() {
                InterfaceC6618a B11 = this.analyticApi.B();
                j.c(B11);
                return B11;
            }
        }

        private static final class GetFintechPermissionDelegateProvider implements Pc.a<f> {
            private final InterfaceC8456a permissionsManagerApi;

            GetFintechPermissionDelegateProvider(InterfaceC8456a interfaceC8456a) {
                this.permissionsManagerApi = interfaceC8456a;
            }

            @Override // Pc.a
            public f get() {
                return this.permissionsManagerApi.f0();
            }
        }

        private static final class GetFintechSettingsProvider implements Pc.a<ru.ozon.fintech.settings.domain.a> {
            private final O90.a settingsApi;

            GetFintechSettingsProvider(O90.a aVar) {
                this.settingsApi = aVar;
            }

            @Override // Pc.a
            public ru.ozon.fintech.settings.domain.a get() {
                ru.ozon.fintech.settings.domain.a w02 = this.settingsApi.w0();
                j.c(w02);
                return w02;
            }
        }

        private static final class GetOkHttpClientProvider implements Pc.a<E> {
            private final Z80.a fintechNetworkApi;

            GetOkHttpClientProvider(Z80.a aVar) {
                this.fintechNetworkApi = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public E get() {
                E okHttpClient = this.fintechNetworkApi.getOkHttpClient();
                j.c(okHttpClient);
                return okHttpClient;
            }
        }

        private static final class ProvideAppCoroutineScopesProvider implements Pc.a<R30.a> {
            private final b fintechAppApi;

            ProvideAppCoroutineScopesProvider(b bVar) {
                this.fintechAppApi = bVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public R30.a get() {
                R30.a f7 = this.fintechAppApi.f();
                j.c(f7);
                return f7;
            }
        }

        private static final class ProvideCbottomDisplayProvider implements Pc.a<K40.a> {
            private final I40.a cbottomDisplayApi;

            ProvideCbottomDisplayProvider(I40.a aVar) {
                this.cbottomDisplayApi = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public K40.a get() {
                K40.a D02 = this.cbottomDisplayApi.D0();
                j.c(D02);
                return D02;
            }
        }

        private static final class ProvideContextProvider implements Pc.a<Context> {
            private final b fintechAppApi;

            ProvideContextProvider(b bVar) {
                this.fintechAppApi = bVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context h11 = this.fintechAppApi.h();
                j.c(h11);
                return h11;
            }
        }

        private static final class ProvideNavigationProvider implements Pc.a<S80.b> {
            private final M80.a fintechNavigationApi;

            ProvideNavigationProvider(M80.a aVar) {
                this.fintechNavigationApi = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public S80.b get() {
                S80.b d02 = this.fintechNavigationApi.d0();
                j.c(d02);
                return d02;
            }
        }

        /* synthetic */ CameraComponentImpl(a aVar, Z80.a aVar2, b bVar, M80.a aVar3, InterfaceC6422b interfaceC6422b, O90.a aVar4, InterfaceC8456a interfaceC8456a, I40.a aVar5, CameraScannerFactory cameraScannerFactory, ExternalFintechSettings externalFintechSettings, int i11) {
            this(aVar, aVar2, bVar, aVar3, interfaceC6422b, aVar4, interfaceC8456a, aVar5, cameraScannerFactory, externalFintechSettings);
        }

        private void initialize(a aVar, Z80.a aVar2, b bVar, M80.a aVar3, InterfaceC6422b interfaceC6422b, O90.a aVar4, InterfaceC8456a interfaceC8456a, I40.a aVar5, CameraScannerFactory cameraScannerFactory, ExternalFintechSettings externalFintechSettings) {
            this.provideContextProvider = new ProvideContextProvider(bVar);
            this.cameraScannerFactoryProvider = Jb.f.a(cameraScannerFactory);
            this.getFintechAnalyticInteractorProvider = new GetFintechAnalyticInteractorProvider(aVar);
            this.getExchangerProvider = new GetExchangerProvider(interfaceC6422b);
            this.getFintechSettingsProvider = new GetFintechSettingsProvider(aVar4);
            GetOkHttpClientProvider getOkHttpClientProvider = new GetOkHttpClientProvider(aVar2);
            this.getOkHttpClientProvider = getOkHttpClientProvider;
            this.provideCameraNetworkProvider = d.b(CameraModule_ProvideCameraNetworkFactory.create(this.getFintechSettingsProvider, getOkHttpClientProvider));
            this.externalFintechSettingsProvider = Jb.f.a(externalFintechSettings);
            ProvideAppCoroutineScopesProvider provideAppCoroutineScopesProvider = new ProvideAppCoroutineScopesProvider(bVar);
            this.provideAppCoroutineScopesProvider = provideAppCoroutineScopesProvider;
            this.provideCameraInteractorProvider = d.b(CameraModule_ProvideCameraInteractorFactory.create(this.getExchangerProvider, this.provideCameraNetworkProvider, this.externalFintechSettingsProvider, provideAppCoroutineScopesProvider));
            this.provideNavigationProvider = new ProvideNavigationProvider(aVar3);
            this.getFintechPermissionDelegateProvider = new GetFintechPermissionDelegateProvider(interfaceC8456a);
            this.provideCbottomDisplayProvider = new ProvideCbottomDisplayProvider(aVar5);
            this.getFeatureTogglesProvider = new GetFeatureTogglesProvider(aVar4);
            this.provideMoshiProvider = d.b(C10226b.a());
            this.phoneScannerAnalyticProvider = PhoneScannerAnalytic_Factory.create(this.getFintechAnalyticInteractorProvider);
            this.bankCardScannerAnalyticProvider = BankCardScannerAnalytic_Factory.create(this.getFintechAnalyticInteractorProvider);
            QrScannerAnalytic_Factory create = QrScannerAnalytic_Factory.create(this.getFintechAnalyticInteractorProvider);
            this.qrScannerAnalyticProvider = create;
            this.cameraViewModelProvider = CameraViewModel_Factory.create(this.provideContextProvider, this.cameraScannerFactoryProvider, this.getFintechAnalyticInteractorProvider, this.provideCameraInteractorProvider, this.provideNavigationProvider, this.getExchangerProvider, this.getFintechPermissionDelegateProvider, this.provideCbottomDisplayProvider, this.provideAppCoroutineScopesProvider, this.getFeatureTogglesProvider, this.getFintechSettingsProvider, this.provideMoshiProvider, this.phoneScannerAnalyticProvider, this.bankCardScannerAnalyticProvider, create);
            this.qrScannerResultViewModelProvider = QrScannerResultViewModel_Factory.create(this.getExchangerProvider, this.provideNavigationProvider);
            i.a b11 = i.b(2);
            b11.b(CameraViewModel.class, this.cameraViewModelProvider);
            b11.b(QrScannerResultViewModel.class, this.qrScannerResultViewModelProvider);
            i a11 = b11.a();
            this.mapOfClassOfAndProviderOfViewModelProvider = a11;
            this.provideViewModelFactoryProvider = d.b(CameraModule_ProvideViewModelFactoryFactory.create(a11));
        }

        private CameraFragment injectCameraFragment(CameraFragment cameraFragment) {
            cameraFragment.factory = this.provideViewModelFactoryProvider.get();
            InterfaceC6618a B11 = this.analyticApi.B();
            j.c(B11);
            cameraFragment.analyticsInteractor = B11;
            T30.c j12 = this.fintechAppApi.j1();
            j.c(j12);
            CameraFragment_MembersInjector.injectExecutorProvider(cameraFragment, j12);
            return cameraFragment;
        }

        private QrScannerResultBottomSheet injectQrScannerResultBottomSheet(QrScannerResultBottomSheet qrScannerResultBottomSheet) {
            qrScannerResultBottomSheet.factory = this.provideViewModelFactoryProvider.get();
            InterfaceC6618a B11 = this.analyticApi.B();
            j.c(B11);
            qrScannerResultBottomSheet.analyticsInteractor = B11;
            return qrScannerResultBottomSheet;
        }

        @Override // ru.ozon.fintech.features.camera.di.CameraComponent
        public void inject(CameraFragment cameraFragment) {
            injectCameraFragment(cameraFragment);
        }

        @Override // ru.ozon.fintech.features.camera.di.CameraComponent
        public ExternalFintechSettings provideExternalFintechSettings() {
            return this.externalFintechSettings;
        }

        private CameraComponentImpl(a aVar, Z80.a aVar2, b bVar, M80.a aVar3, InterfaceC6422b interfaceC6422b, O90.a aVar4, InterfaceC8456a interfaceC8456a, I40.a aVar5, CameraScannerFactory cameraScannerFactory, ExternalFintechSettings externalFintechSettings) {
            this.cameraComponentImpl = this;
            this.analyticApi = aVar;
            this.fintechAppApi = bVar;
            this.externalFintechSettings = externalFintechSettings;
            initialize(aVar, aVar2, bVar, aVar3, interfaceC6422b, aVar4, interfaceC8456a, aVar5, cameraScannerFactory, externalFintechSettings);
        }

        @Override // ru.ozon.fintech.features.camera.di.CameraComponent
        public void inject(QrScannerResultBottomSheet qrScannerResultBottomSheet) {
            injectQrScannerResultBottomSheet(qrScannerResultBottomSheet);
        }
    }

    private static final class Factory implements CameraComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.fintech.features.camera.di.CameraComponent.Factory
        public CameraComponent create(a aVar, Z80.a aVar2, b bVar, M80.a aVar3, InterfaceC6422b interfaceC6422b, O90.a aVar4, InterfaceC8456a interfaceC8456a, I40.a aVar5, CameraScannerFactory cameraScannerFactory, ExternalFintechSettings externalFintechSettings) {
            aVar.getClass();
            aVar2.getClass();
            bVar.getClass();
            aVar3.getClass();
            interfaceC6422b.getClass();
            aVar4.getClass();
            interfaceC8456a.getClass();
            aVar5.getClass();
            cameraScannerFactory.getClass();
            externalFintechSettings.getClass();
            return new CameraComponentImpl(aVar, aVar2, bVar, aVar3, interfaceC6422b, aVar4, interfaceC8456a, aVar5, cameraScannerFactory, externalFintechSettings, 0);
        }

        private Factory() {
        }
    }

    private DaggerCameraComponent() {
    }

    public static CameraComponent.Factory factory() {
        return new Factory(0);
    }
}
