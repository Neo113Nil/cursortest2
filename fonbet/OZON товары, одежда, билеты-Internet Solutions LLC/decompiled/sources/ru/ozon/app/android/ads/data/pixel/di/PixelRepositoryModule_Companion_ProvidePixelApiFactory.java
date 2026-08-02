package ru.ozon.app.android.ads.data.pixel.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.ads.data.pixel.data.PixelApi;

/* loaded from: classes6.dex */
public final class PixelRepositoryModule_Companion_ProvidePixelApiFactory implements e<PixelApi> {
    private final a<Retrofit> retrofitProvider;

    public PixelRepositoryModule_Companion_ProvidePixelApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static PixelRepositoryModule_Companion_ProvidePixelApiFactory create(a<Retrofit> aVar) {
        return new PixelRepositoryModule_Companion_ProvidePixelApiFactory(aVar);
    }

    public static PixelApi providePixelApi(Retrofit retrofit) {
        PixelApi providePixelApi = PixelRepositoryModule.INSTANCE.providePixelApi(retrofit);
        j.d(providePixelApi);
        return providePixelApi;
    }

    @Override // Pc.a
    public PixelApi get() {
        return providePixelApi(this.retrofitProvider.get());
    }
}
