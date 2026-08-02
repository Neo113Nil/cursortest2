package ru.ozon.app.android.marketing.common.coupon;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.coupon.data.ApplyCouponResponse;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;)Lru/ozon/app/android/marketing/common/coupon/CouponResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponViewModelImpl$activate$1 extends AbstractC7737t implements Function1<ApplyCouponResponse, CouponResult> {
    final /* synthetic */ CouponViewModelImpl.CouponActivation.Common $activation;
    final /* synthetic */ CouponViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponViewModelImpl$activate$1(CouponViewModelImpl.CouponActivation.Common common, CouponViewModelImpl couponViewModelImpl) {
        super(1);
        this.$activation = common;
        this.this$0 = couponViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CouponResult invoke(ApplyCouponResponse it) {
        CouponStorage couponStorage;
        Intrinsics.checkNotNullParameter(it, "it");
        String couponCode = this.$activation.getCouponCode();
        couponStorage = this.this$0.couponStorage;
        couponStorage.couponApplied(couponCode);
        return new CouponResult.Success(couponCode, null, 2, null);
    }
}
