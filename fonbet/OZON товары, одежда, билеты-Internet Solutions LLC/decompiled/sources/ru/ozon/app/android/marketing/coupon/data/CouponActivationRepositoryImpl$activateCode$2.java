package ru.ozon.app.android.marketing.coupon.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CouponActivationRepositoryImpl$activateCode$2 extends C7735q implements Function1<ApplyCouponResponse, ApplyCouponResponse> {
    CouponActivationRepositoryImpl$activateCode$2(Object obj) {
        super(1, obj, CouponActivationRepositoryImpl.class, "mapToDTO", "mapToDTO(Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;)Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ApplyCouponResponse invoke(ApplyCouponResponse p02) {
        ApplyCouponResponse mapToDTO;
        Intrinsics.checkNotNullParameter(p02, "p0");
        mapToDTO = ((CouponActivationRepositoryImpl) this.receiver).mapToDTO(p02);
        return mapToDTO;
    }
}
