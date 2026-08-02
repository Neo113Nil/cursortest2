package ru.ozon.app.android.marketing.coupon.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.marketing.coupon.data.CouponApi;

/* loaded from: classes6.dex */
public final class CouponModule_Companion_ProvideCouponApiFactory implements e<CouponApi> {
    private final a<Retrofit> retrofitProvider;

    public CouponModule_Companion_ProvideCouponApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static CouponModule_Companion_ProvideCouponApiFactory create(a<Retrofit> aVar) {
        return new CouponModule_Companion_ProvideCouponApiFactory(aVar);
    }

    public static CouponApi provideCouponApi(Retrofit retrofit) {
        CouponApi provideCouponApi = CouponModule.INSTANCE.provideCouponApi(retrofit);
        j.d(provideCouponApi);
        return provideCouponApi;
    }

    @Override // Pc.a
    public CouponApi get() {
        return provideCouponApi(this.retrofitProvider.get());
    }
}
