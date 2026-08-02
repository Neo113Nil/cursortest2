package ru.ozon.fintech.features.camera.di.module;

import Jb.e;
import Jb.j;
import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CameraModule_ProvideViewModelFactoryFactory implements e<z0.b> {
    private final a<Map<Class<? extends w0>, a<w0>>> creatorsProvider;

    public CameraModule_ProvideViewModelFactoryFactory(a<Map<Class<? extends w0>, a<w0>>> aVar) {
        this.creatorsProvider = aVar;
    }

    public static CameraModule_ProvideViewModelFactoryFactory create(a<Map<Class<? extends w0>, a<w0>>> aVar) {
        return new CameraModule_ProvideViewModelFactoryFactory(aVar);
    }

    public static z0.b provideViewModelFactory(Map<Class<? extends w0>, a<w0>> map) {
        z0.b provideViewModelFactory = CameraModule.provideViewModelFactory(map);
        j.d(provideViewModelFactory);
        return provideViewModelFactory;
    }

    @Override // Pc.a
    public z0.b get() {
        return provideViewModelFactory(this.creatorsProvider.get());
    }
}
