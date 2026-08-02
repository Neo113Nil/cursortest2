package ru.ozon.fintech.features.camera.di.module;

import Jb.e;
import Jb.j;
import Pc.a;
import We.E;
import ru.ozon.fintech.features.camera.network.CameraNetwork;

/* loaded from: classes3.dex */
public final class CameraModule_ProvideCameraNetworkFactory implements e<CameraNetwork> {
    private final a<ru.ozon.fintech.settings.domain.a> fintechSettingsProvider;
    private final a<E> okHttpClientProvider;

    public CameraModule_ProvideCameraNetworkFactory(a<ru.ozon.fintech.settings.domain.a> aVar, a<E> aVar2) {
        this.fintechSettingsProvider = aVar;
        this.okHttpClientProvider = aVar2;
    }

    public static CameraModule_ProvideCameraNetworkFactory create(a<ru.ozon.fintech.settings.domain.a> aVar, a<E> aVar2) {
        return new CameraModule_ProvideCameraNetworkFactory(aVar, aVar2);
    }

    public static CameraNetwork provideCameraNetwork(ru.ozon.fintech.settings.domain.a aVar, E e11) {
        CameraNetwork provideCameraNetwork = CameraModule.provideCameraNetwork(aVar, e11);
        j.d(provideCameraNetwork);
        return provideCameraNetwork;
    }

    @Override // Pc.a
    public CameraNetwork get() {
        return provideCameraNetwork(this.fintechSettingsProvider.get(), this.okHttpClientProvider.get());
    }
}
