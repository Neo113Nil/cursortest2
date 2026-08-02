package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.coupon.common.CouponState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CouponViewHolder$onAttach$1 extends C7735q implements Function1<CouponState, Unit> {
    CouponViewHolder$onAttach$1(Object obj) {
        super(1, obj, CouponViewHolder.class, "observe", "observe(Lru/ozon/app/android/marketing/widgets/coupon/common/CouponState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CouponState couponState) {
        invoke2(couponState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CouponState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CouponViewHolder) this.receiver).observe(p02);
    }
}
