package ru.ozon.app.android.marketing.common.coupon;

import io.reactivex.p;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u0007H&¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;", "", "", "couponCode", "", "activateCode", "(Ljava/lang/String;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "observeActivateResult", "()Lio/reactivex/p;", "", "observeActivatedCoupons", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CouponViewModel {
    void activateCode(@NotNull String couponCode);

    @NotNull
    p<CouponResult> observeActivateResult();

    @NotNull
    p<Set<String>> observeActivatedCoupons();
}
