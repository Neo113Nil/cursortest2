package ru.ozon.fintech.features.camera.di.factory;

import Jb.e;
import Pc.a;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes3.dex */
public final class CameraApiComponentFactory_Factory implements e<CameraApiComponentFactory> {
    private final a<CameraScannerFactory> cameraScannerFactoryProvider;
    private final a<ExternalFintechSettings> externalFintechSettingsProvider;

    public CameraApiComponentFactory_Factory(a<CameraScannerFactory> aVar, a<ExternalFintechSettings> aVar2) {
        this.cameraScannerFactoryProvider = aVar;
        this.externalFintechSettingsProvider = aVar2;
    }

    public static CameraApiComponentFactory_Factory create(a<CameraScannerFactory> aVar, a<ExternalFintechSettings> aVar2) {
        return new CameraApiComponentFactory_Factory(aVar, aVar2);
    }

    public static CameraApiComponentFactory newInstance(CameraScannerFactory cameraScannerFactory, ExternalFintechSettings externalFintechSettings) {
        return new CameraApiComponentFactory(cameraScannerFactory, externalFintechSettings);
    }

    @Override // Pc.a
    public CameraApiComponentFactory get() {
        return newInstance(this.cameraScannerFactoryProvider.get(), this.externalFintechSettingsProvider.get());
    }
}
