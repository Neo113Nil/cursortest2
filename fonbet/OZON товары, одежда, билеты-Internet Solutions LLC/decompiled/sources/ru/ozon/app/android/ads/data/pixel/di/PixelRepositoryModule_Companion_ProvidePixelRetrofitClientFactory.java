package ru.ozon.app.android.ads.data.pixel.di;

import Jb.e;
import Jb.j;
import Pc.a;
import We.E;
import retrofit2.Retrofit;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes6.dex */
public final class PixelRepositoryModule_Companion_ProvidePixelRetrofitClientFactory implements e<Retrofit> {
    private final a<NetworkComponentConfig> configProvider;
    private final a<E> pixelOkHttpClientProvider;

    public PixelRepositoryModule_Companion_ProvidePixelRetrofitClientFactory(a<NetworkComponentConfig> aVar, a<E> aVar2) {
        this.configProvider = aVar;
        this.pixelOkHttpClientProvider = aVar2;
    }

    public static PixelRepositoryModule_Companion_ProvidePixelRetrofitClientFactory create(a<NetworkComponentConfig> aVar, a<E> aVar2) {
        return new PixelRepositoryModule_Companion_ProvidePixelRetrofitClientFactory(aVar, aVar2);
    }

    public static Retrofit providePixelRetrofitClient(NetworkComponentConfig networkComponentConfig, E e11) {
        Retrofit providePixelRetrofitClient = PixelRepositoryModule.INSTANCE.providePixelRetrofitClient(networkComponentConfig, e11);
        j.d(providePixelRetrofitClient);
        return providePixelRetrofitClient;
    }

    @Override // Pc.a
    public Retrofit get() {
        return providePixelRetrofitClient(this.configProvider.get(), this.pixelOkHttpClientProvider.get());
    }
}
