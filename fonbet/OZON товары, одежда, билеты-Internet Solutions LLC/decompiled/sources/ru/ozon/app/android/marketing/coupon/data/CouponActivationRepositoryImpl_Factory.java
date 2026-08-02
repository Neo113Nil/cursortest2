package ru.ozon.app.android.marketing.coupon.data;

import Jb.e;
import Pc.a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class CouponActivationRepositoryImpl_Factory implements e<CouponActivationRepositoryImpl> {
    private final a<CouponApi> apiProvider;
    private final a<JsonParser> jsonDeserializerProvider;

    public CouponActivationRepositoryImpl_Factory(a<CouponApi> aVar, a<JsonParser> aVar2) {
        this.apiProvider = aVar;
        this.jsonDeserializerProvider = aVar2;
    }

    public static CouponActivationRepositoryImpl_Factory create(a<CouponApi> aVar, a<JsonParser> aVar2) {
        return new CouponActivationRepositoryImpl_Factory(aVar, aVar2);
    }

    public static CouponActivationRepositoryImpl newInstance(CouponApi couponApi, JsonParser jsonParser) {
        return new CouponActivationRepositoryImpl(couponApi, jsonParser);
    }

    @Override // Pc.a
    public CouponActivationRepositoryImpl get() {
        return newInstance(this.apiProvider.get(), this.jsonDeserializerProvider.get());
    }
}
