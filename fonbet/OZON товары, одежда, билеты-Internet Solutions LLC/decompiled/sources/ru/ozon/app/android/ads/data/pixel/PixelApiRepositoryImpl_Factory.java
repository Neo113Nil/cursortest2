package ru.ozon.app.android.ads.data.pixel;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.ads.data.pixel.data.PixelApi;

/* loaded from: classes6.dex */
public final class PixelApiRepositoryImpl_Factory implements e<PixelApiRepositoryImpl> {
    private final a<PixelApi> pixelApiProvider;

    public PixelApiRepositoryImpl_Factory(a<PixelApi> aVar) {
        this.pixelApiProvider = aVar;
    }

    public static PixelApiRepositoryImpl_Factory create(a<PixelApi> aVar) {
        return new PixelApiRepositoryImpl_Factory(aVar);
    }

    public static PixelApiRepositoryImpl newInstance(PixelApi pixelApi) {
        return new PixelApiRepositoryImpl(pixelApi);
    }

    @Override // Pc.a
    public PixelApiRepositoryImpl get() {
        return newInstance(this.pixelApiProvider.get());
    }
}
