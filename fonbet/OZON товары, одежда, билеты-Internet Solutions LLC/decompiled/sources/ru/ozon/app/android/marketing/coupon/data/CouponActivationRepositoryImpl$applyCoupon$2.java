package ru.ozon.app.android.marketing.coupon.data;

import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.coupon.domain.CouponResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CouponActivationRepositoryImpl$applyCoupon$2 extends AbstractC7737t implements Function1<String, C<? extends CouponResponse>> {
    final /* synthetic */ CouponActivationRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponActivationRepositoryImpl$applyCoupon$2(CouponActivationRepositoryImpl couponActivationRepositoryImpl) {
        super(1);
        this.this$0 = couponActivationRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends CouponResponse> invoke(String it) {
        y callApi;
        Intrinsics.checkNotNullParameter(it, "it");
        callApi = this.this$0.callApi(it);
        return callApi;
    }
}
