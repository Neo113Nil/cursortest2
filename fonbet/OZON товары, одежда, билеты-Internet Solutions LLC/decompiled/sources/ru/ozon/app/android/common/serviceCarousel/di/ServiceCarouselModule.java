package ru.ozon.app.android.common.serviceCarousel.di;

import Ve.C4598rp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/di/ServiceCarouselModule;", "", "<init>", "()V", "provideServiceCarouselApi", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselApi;", "retrofit", "Lretrofit2/Retrofit;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServiceCarouselModule {
    @NotNull
    public final ServiceCarouselApi provideServiceCarouselApi(@NotNull Retrofit retrofit) {
        return (ServiceCarouselApi) C4598rp.b(retrofit, "retrofit", ServiceCarouselApi.class, "create(...)");
    }
}
