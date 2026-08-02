package ru.ozon.app.android.common.serviceCarousel.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselApi;

/* loaded from: classes11.dex */
public final class ServiceCarouselModule_ProvideServiceCarouselApiFactory implements e<ServiceCarouselApi> {
    private final ServiceCarouselModule module;
    private final a<Retrofit> retrofitProvider;

    public ServiceCarouselModule_ProvideServiceCarouselApiFactory(ServiceCarouselModule serviceCarouselModule, a<Retrofit> aVar) {
        this.module = serviceCarouselModule;
        this.retrofitProvider = aVar;
    }

    public static ServiceCarouselModule_ProvideServiceCarouselApiFactory create(ServiceCarouselModule serviceCarouselModule, a<Retrofit> aVar) {
        return new ServiceCarouselModule_ProvideServiceCarouselApiFactory(serviceCarouselModule, aVar);
    }

    public static ServiceCarouselApi provideServiceCarouselApi(ServiceCarouselModule serviceCarouselModule, Retrofit retrofit) {
        ServiceCarouselApi provideServiceCarouselApi = serviceCarouselModule.provideServiceCarouselApi(retrofit);
        j.d(provideServiceCarouselApi);
        return provideServiceCarouselApi;
    }

    @Override // Pc.a
    public ServiceCarouselApi get() {
        return provideServiceCarouselApi(this.module, this.retrofitProvider.get());
    }
}
