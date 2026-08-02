package ru.ozon.fintech.features.camera.di.module;

import Jb.e;
import Jb.j;
import Pc.a;
import d40.InterfaceC6083a;
import ru.ozon.fintech.features.camera.domain.CameraInteractor;
import ru.ozon.fintech.features.camera.network.CameraNetwork;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes3.dex */
public final class CameraModule_ProvideCameraInteractorFactory implements e<CameraInteractor> {
    private final a<R30.a> appCoroutineScopesProvider;
    private final a<CameraNetwork> cameraNetworkProvider;
    private final a<InterfaceC6083a> exchangerProvider;
    private final a<ExternalFintechSettings> externalFintechSettingsProvider;

    public CameraModule_ProvideCameraInteractorFactory(a<InterfaceC6083a> aVar, a<CameraNetwork> aVar2, a<ExternalFintechSettings> aVar3, a<R30.a> aVar4) {
        this.exchangerProvider = aVar;
        this.cameraNetworkProvider = aVar2;
        this.externalFintechSettingsProvider = aVar3;
        this.appCoroutineScopesProvider = aVar4;
    }

    public static CameraModule_ProvideCameraInteractorFactory create(a<InterfaceC6083a> aVar, a<CameraNetwork> aVar2, a<ExternalFintechSettings> aVar3, a<R30.a> aVar4) {
        return new CameraModule_ProvideCameraInteractorFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static CameraInteractor provideCameraInteractor(InterfaceC6083a interfaceC6083a, CameraNetwork cameraNetwork, ExternalFintechSettings externalFintechSettings, R30.a aVar) {
        CameraInteractor provideCameraInteractor = CameraModule.provideCameraInteractor(interfaceC6083a, cameraNetwork, externalFintechSettings, aVar);
        j.d(provideCameraInteractor);
        return provideCameraInteractor;
    }

    @Override // Pc.a
    public CameraInteractor get() {
        return provideCameraInteractor(this.exchangerProvider.get(), this.cameraNetworkProvider.get(), this.externalFintechSettingsProvider.get(), this.appCoroutineScopesProvider.get());
    }
}
