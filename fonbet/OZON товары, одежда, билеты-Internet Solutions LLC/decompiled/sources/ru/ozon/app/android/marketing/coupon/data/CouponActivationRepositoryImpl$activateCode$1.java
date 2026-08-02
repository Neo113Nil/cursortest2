package ru.ozon.app.android.marketing.coupon.data;

import We.M;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.network.error.OzonError;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lio/reactivex/C;", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CouponActivationRepositoryImpl$activateCode$1 extends AbstractC7737t implements Function1<Throwable, C<? extends ApplyCouponResponse>> {
    final /* synthetic */ CouponActivationRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponActivationRepositoryImpl$activateCode$1(CouponActivationRepositoryImpl couponActivationRepositoryImpl) {
        super(1);
        this.this$0 = couponActivationRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends ApplyCouponResponse> invoke(Throwable it) {
        Object fromJson;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof HttpException) {
            CouponActivationRepositoryImpl couponActivationRepositoryImpl = this.this$0;
            Response<?> response = ((HttpException) it).response();
            M errorBody = response != null ? response.errorBody() : null;
            Object applyCouponResponse = new ApplyCouponResponse(null, null);
            if (errorBody != null && (fromJson = couponActivationRepositoryImpl.jsonDeserializer.fromJson(errorBody.string(), (Class<Object>) ApplyCouponResponse.class)) != null) {
                applyCouponResponse = fromJson;
            }
            it = new OzonError.NetworkError.ServerError(((ApplyCouponResponse) applyCouponResponse).getError());
        }
        return y.e(it);
    }
}
