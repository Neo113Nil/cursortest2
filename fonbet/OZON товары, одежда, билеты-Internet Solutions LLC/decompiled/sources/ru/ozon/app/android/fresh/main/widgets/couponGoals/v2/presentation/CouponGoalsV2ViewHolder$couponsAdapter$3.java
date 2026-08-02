package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CouponGoalsV2ViewHolder$couponsAdapter$3 extends C7735q implements Function0<Boolean> {
    CouponGoalsV2ViewHolder$couponsAdapter$3(Object obj) {
        super(0, obj, CouponGoalsV2ViewHolder.class, "isSingleCoupon", "isSingleCoupon()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean isSingleCoupon;
        isSingleCoupon = ((CouponGoalsV2ViewHolder) this.receiver).isSingleCoupon();
        return Boolean.valueOf(isSingleCoupon);
    }
}
