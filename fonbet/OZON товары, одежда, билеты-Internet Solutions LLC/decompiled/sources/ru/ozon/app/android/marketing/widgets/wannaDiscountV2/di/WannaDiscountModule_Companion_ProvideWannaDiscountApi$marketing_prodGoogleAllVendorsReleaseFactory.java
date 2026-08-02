package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Api;

/* loaded from: classes12.dex */
public final class WannaDiscountModule_Companion_ProvideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseFactory implements e<WannaDiscountV2Api> {
    private final a<Retrofit> retrofitProvider;

    public WannaDiscountModule_Companion_ProvideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static WannaDiscountModule_Companion_ProvideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseFactory create(a<Retrofit> aVar) {
        return new WannaDiscountModule_Companion_ProvideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseFactory(aVar);
    }

    public static WannaDiscountV2Api provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease(Retrofit retrofit) {
        WannaDiscountV2Api provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease = WannaDiscountModule.INSTANCE.provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease(retrofit);
        j.d(provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease);
        return provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease;
    }

    @Override // Pc.a
    public WannaDiscountV2Api get() {
        return provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease(this.retrofitProvider.get());
    }
}
