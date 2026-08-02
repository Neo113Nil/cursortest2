package ru.ozon.app.android.account.coupon;

import Nc.C3669c;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0003R\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/coupon/ApplyCouponStateImpl;", "Lru/ozon/app/android/account/coupon/ApplyCouponState;", "<init>", "()V", "Lio/reactivex/p;", "", "observeCouponUpdate", "()Lio/reactivex/p;", "couponApply", "LNc/c;", "kotlin.jvm.PlatformType", "couponUpdate", "LNc/c;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplyCouponStateImpl implements ApplyCouponState {

    @NotNull
    private final C3669c<Unit> couponUpdate;

    public ApplyCouponStateImpl() {
        C3669c<Unit> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.couponUpdate = d11;
    }

    @Override // ru.ozon.app.android.account.coupon.ApplyCouponState
    public void couponApply() {
        this.couponUpdate.onNext(Unit.f71690a);
    }

    @Override // ru.ozon.app.android.account.coupon.ApplyCouponState
    @NotNull
    public p<Unit> observeCouponUpdate() {
        return this.couponUpdate;
    }
}
