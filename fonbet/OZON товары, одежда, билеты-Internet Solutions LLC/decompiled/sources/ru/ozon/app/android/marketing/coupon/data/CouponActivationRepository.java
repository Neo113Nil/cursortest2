package ru.ozon.app.android.marketing.coupon.data;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.coupon.domain.CouponResponse;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "", "", "coupon", "Lio/reactivex/y;", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "activateCode", "(Ljava/lang/String;)Lio/reactivex/y;", "action", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "applyCoupon", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CouponActivationRepository {
    @NotNull
    y<ApplyCouponResponse> activateCode(@NotNull String coupon);

    @NotNull
    y<CouponResponse> applyCoupon(@NotNull String action);
}
