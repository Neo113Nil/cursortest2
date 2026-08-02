package ru.ozon.app.android.marketing.common.coupon;

import Lm0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.network.error.OzonError;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Throwable;)Lru/ozon/app/android/marketing/common/coupon/CouponResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponViewModelImpl$activate$2 extends AbstractC7737t implements Function1<Throwable, CouponResult> {
    final /* synthetic */ CouponViewModelImpl.CouponActivation.Common $activation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponViewModelImpl$activate$2(CouponViewModelImpl.CouponActivation.Common common) {
        super(1);
        this.$activation = common;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CouponResult invoke(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a.f17149a.e(it);
        String couponCode = this.$activation.getCouponCode();
        OzonError.NetworkError.ServerError serverError = it instanceof OzonError.NetworkError.ServerError ? (OzonError.NetworkError.ServerError) it : null;
        return new CouponResult.Fail(couponCode, serverError != null ? serverError.getMessage() : null, it);
    }
}
