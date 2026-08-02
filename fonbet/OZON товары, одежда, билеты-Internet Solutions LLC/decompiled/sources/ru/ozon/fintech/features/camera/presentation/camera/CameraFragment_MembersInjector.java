package ru.ozon.fintech.features.camera.presentation.camera;

import androidx.lifecycle.z0;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class CameraFragment_MembersInjector implements Ib.b<CameraFragment> {
    private final Pc.a<InterfaceC6618a> analyticsInteractorProvider;
    private final Pc.a<T30.c> executorProvider;
    private final Pc.a<z0.b> factoryProvider;

    public CameraFragment_MembersInjector(Pc.a<z0.b> aVar, Pc.a<InterfaceC6618a> aVar2, Pc.a<T30.c> aVar3) {
        this.factoryProvider = aVar;
        this.analyticsInteractorProvider = aVar2;
        this.executorProvider = aVar3;
    }

    public static Ib.b<CameraFragment> create(Pc.a<z0.b> aVar, Pc.a<InterfaceC6618a> aVar2, Pc.a<T30.c> aVar3) {
        return new CameraFragment_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectExecutorProvider(CameraFragment cameraFragment, T30.c cVar) {
        cameraFragment.executorProvider = cVar;
    }

    public void injectMembers(CameraFragment cameraFragment) {
        cameraFragment.factory = this.factoryProvider.get();
        cameraFragment.analyticsInteractor = this.analyticsInteractorProvider.get();
        injectExecutorProvider(cameraFragment, this.executorProvider.get());
    }
}
