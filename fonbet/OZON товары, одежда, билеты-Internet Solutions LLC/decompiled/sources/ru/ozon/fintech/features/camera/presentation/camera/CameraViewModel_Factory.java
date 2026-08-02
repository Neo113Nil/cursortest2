package ru.ozon.fintech.features.camera.presentation.camera;

import Jb.e;
import android.content.Context;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import r90.f;
import ru.ozon.fintech.features.camera.domain.CameraInteractor;
import ru.ozon.fintech.features.camera.domain.analytic.BankCardScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.PhoneScannerAnalytic;
import ru.ozon.fintech.features.camera.domain.analytic.QrScannerAnalytic;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;

/* loaded from: classes3.dex */
public final class CameraViewModel_Factory implements e<CameraViewModel> {
    private final Pc.a<InterfaceC6618a> analyticInteractorProvider;
    private final Pc.a<R30.a> appCoroutineScopesProvider;
    private final Pc.a<BankCardScannerAnalytic> bankCardScannerAnalyticProvider;
    private final Pc.a<CameraInteractor> cameraInteractorProvider;
    private final Pc.a<CameraScannerFactory> cameraScannerFactoryProvider;
    private final Pc.a<K40.a> cbottomDisplayProvider;
    private final Pc.a<Context> contextProvider;
    private final Pc.a<InterfaceC6083a> exchangerProvider;
    private final Pc.a<Q90.c> featureTogglesProvider;
    private final Pc.a<S80.b> fintechNavigationProvider;
    private final Pc.a<ru.ozon.fintech.settings.domain.a> fintechSettingsProvider;
    private final Pc.a<Moshi> moshiProvider;
    private final Pc.a<f> permissionsDelegateProvider;
    private final Pc.a<PhoneScannerAnalytic> phoneScannerAnalyticProvider;
    private final Pc.a<QrScannerAnalytic> qrScannerAnalyticProvider;

    public CameraViewModel_Factory(Pc.a<Context> aVar, Pc.a<CameraScannerFactory> aVar2, Pc.a<InterfaceC6618a> aVar3, Pc.a<CameraInteractor> aVar4, Pc.a<S80.b> aVar5, Pc.a<InterfaceC6083a> aVar6, Pc.a<f> aVar7, Pc.a<K40.a> aVar8, Pc.a<R30.a> aVar9, Pc.a<Q90.c> aVar10, Pc.a<ru.ozon.fintech.settings.domain.a> aVar11, Pc.a<Moshi> aVar12, Pc.a<PhoneScannerAnalytic> aVar13, Pc.a<BankCardScannerAnalytic> aVar14, Pc.a<QrScannerAnalytic> aVar15) {
        this.contextProvider = aVar;
        this.cameraScannerFactoryProvider = aVar2;
        this.analyticInteractorProvider = aVar3;
        this.cameraInteractorProvider = aVar4;
        this.fintechNavigationProvider = aVar5;
        this.exchangerProvider = aVar6;
        this.permissionsDelegateProvider = aVar7;
        this.cbottomDisplayProvider = aVar8;
        this.appCoroutineScopesProvider = aVar9;
        this.featureTogglesProvider = aVar10;
        this.fintechSettingsProvider = aVar11;
        this.moshiProvider = aVar12;
        this.phoneScannerAnalyticProvider = aVar13;
        this.bankCardScannerAnalyticProvider = aVar14;
        this.qrScannerAnalyticProvider = aVar15;
    }

    public static CameraViewModel_Factory create(Pc.a<Context> aVar, Pc.a<CameraScannerFactory> aVar2, Pc.a<InterfaceC6618a> aVar3, Pc.a<CameraInteractor> aVar4, Pc.a<S80.b> aVar5, Pc.a<InterfaceC6083a> aVar6, Pc.a<f> aVar7, Pc.a<K40.a> aVar8, Pc.a<R30.a> aVar9, Pc.a<Q90.c> aVar10, Pc.a<ru.ozon.fintech.settings.domain.a> aVar11, Pc.a<Moshi> aVar12, Pc.a<PhoneScannerAnalytic> aVar13, Pc.a<BankCardScannerAnalytic> aVar14, Pc.a<QrScannerAnalytic> aVar15) {
        return new CameraViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15);
    }

    public static CameraViewModel newInstance(Context context, CameraScannerFactory cameraScannerFactory, InterfaceC6618a interfaceC6618a, CameraInteractor cameraInteractor, S80.b bVar, InterfaceC6083a interfaceC6083a, f fVar, K40.a aVar, R30.a aVar2, Q90.c cVar, ru.ozon.fintech.settings.domain.a aVar3, Moshi moshi, PhoneScannerAnalytic phoneScannerAnalytic, BankCardScannerAnalytic bankCardScannerAnalytic, QrScannerAnalytic qrScannerAnalytic) {
        return new CameraViewModel(context, cameraScannerFactory, interfaceC6618a, cameraInteractor, bVar, interfaceC6083a, fVar, aVar, aVar2, cVar, aVar3, moshi, phoneScannerAnalytic, bankCardScannerAnalytic, qrScannerAnalytic);
    }

    @Override // Pc.a
    public CameraViewModel get() {
        return newInstance(this.contextProvider.get(), this.cameraScannerFactoryProvider.get(), this.analyticInteractorProvider.get(), this.cameraInteractorProvider.get(), this.fintechNavigationProvider.get(), this.exchangerProvider.get(), this.permissionsDelegateProvider.get(), this.cbottomDisplayProvider.get(), this.appCoroutineScopesProvider.get(), this.featureTogglesProvider.get(), this.fintechSettingsProvider.get(), this.moshiProvider.get(), this.phoneScannerAnalyticProvider.get(), this.bankCardScannerAnalyticProvider.get(), this.qrScannerAnalyticProvider.get());
    }
}
