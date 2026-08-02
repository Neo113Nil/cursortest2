package ru.ozon.app.android.common.serviceCarousel.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselApi;

/* loaded from: classes11.dex */
public final class ServiceCarouselViewModel_Factory implements e<ServiceCarouselViewModel> {
    private final a<ServiceCarouselApi> apiProvider;

    public ServiceCarouselViewModel_Factory(a<ServiceCarouselApi> aVar) {
        this.apiProvider = aVar;
    }

    public static ServiceCarouselViewModel_Factory create(a<ServiceCarouselApi> aVar) {
        return new ServiceCarouselViewModel_Factory(aVar);
    }

    public static ServiceCarouselViewModel newInstance(ServiceCarouselApi serviceCarouselApi) {
        return new ServiceCarouselViewModel(serviceCarouselApi);
    }

    @Override // Pc.a
    public ServiceCarouselViewModel get() {
        return newInstance(this.apiProvider.get());
    }
}
