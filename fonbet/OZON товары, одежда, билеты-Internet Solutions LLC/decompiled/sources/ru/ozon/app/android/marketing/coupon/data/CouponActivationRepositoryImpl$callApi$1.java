package ru.ozon.app.android.marketing.coupon.data;

import We.M;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import ru.ozon.app.android.marketing.coupon.domain.CouponResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lretrofit2/Response;", "LWe/M;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lretrofit2/Response;)Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CouponActivationRepositoryImpl$callApi$1 extends AbstractC7737t implements Function1<Response<M>, CouponResponse> {
    final /* synthetic */ CouponActivationRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponActivationRepositoryImpl$callApi$1(CouponActivationRepositoryImpl couponActivationRepositoryImpl) {
        super(1);
        this.this$0 = couponActivationRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CouponResponse invoke(Response<M> it) {
        CouponResponse.Fail parseErrorBody;
        CouponResponse.Success parseSuccessBody;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccessful()) {
            parseSuccessBody = this.this$0.parseSuccessBody(it.body());
            return parseSuccessBody;
        }
        parseErrorBody = this.this$0.parseErrorBody(it.errorBody());
        return parseErrorBody;
    }
}
