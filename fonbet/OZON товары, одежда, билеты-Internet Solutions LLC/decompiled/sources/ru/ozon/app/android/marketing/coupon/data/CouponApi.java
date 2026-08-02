package ru.ozon.app.android.marketing.coupon.data;

import We.M;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/coupon/data/CouponApi;", "", "", "code", "Lio/reactivex/y;", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "activateCode", "(Ljava/lang/String;)Lio/reactivex/y;", ImagesContract.URL, "Lretrofit2/Response;", "LWe/M;", "applyCoupon", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CouponApi {
    @POST("composer-api.bx/_action/activateCode")
    @NotNull
    y<ApplyCouponResponse> activateCode(@NotNull @Query("code") String code);

    @POST
    @NotNull
    y<Response<M>> applyCoupon(@Url @NotNull String url);
}
