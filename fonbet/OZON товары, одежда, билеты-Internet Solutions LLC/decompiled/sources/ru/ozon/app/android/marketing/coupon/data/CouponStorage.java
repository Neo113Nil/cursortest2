package ru.ozon.app.android.marketing.coupon.data;

import DM.i;
import L9.b;
import Ty.C4054e;
import Ty.f;
import android.annotation.SuppressLint;
import io.reactivex.p;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0016j\b\u0012\u0004\u0012\u00020\u000b`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u001b*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00100\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/account/coupon/ApplyCouponState;", "applyCouponState", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/coupon/ApplyCouponState;)V", "", "observeAuth", "()V", "", "promocode", "couponApplied", "(Ljava/lang/String;)V", "Lio/reactivex/p;", "", "observeActivatedCoupons", "()Lio/reactivex/p;", "clear", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/coupon/ApplyCouponState;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "activatedCoupons", "Ljava/util/HashSet;", "LL9/b;", "kotlin.jvm.PlatformType", "activatedCouponsListener", "LL9/b;", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponStorage {

    @NotNull
    private final HashSet<String> activatedCoupons;

    @NotNull
    private final b<Set<String>> activatedCouponsListener;

    @NotNull
    private final ApplyCouponState applyCouponState;

    @NotNull
    private final AuthStateStorage authStateStorage;

    public CouponStorage(@NotNull AuthStateStorage authStateStorage, @NotNull ApplyCouponState applyCouponState) {
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(applyCouponState, "applyCouponState");
        this.authStateStorage = authStateStorage;
        this.applyCouponState = applyCouponState;
        HashSet<String> hashSet = new HashSet<>();
        this.activatedCoupons = hashSet;
        b<Set<String>> d11 = b.d(hashSet);
        Intrinsics.checkNotNullExpressionValue(d11, "createDefault(...)");
        this.activatedCouponsListener = d11;
        observeAuth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeActivatedCoupons$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @SuppressLint({"CheckResult"})
    private final void observeAuth() {
        this.authStateStorage.getAuthState().filter(new C4054e(CouponStorage$observeAuth$1.INSTANCE)).subscribe(new f(new CouponStorage$observeAuth$2(this), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeAuth$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    public final void clear() {
        this.activatedCoupons.clear();
        this.activatedCouponsListener.accept(this.activatedCoupons);
    }

    public final void couponApplied(@NotNull String promocode) {
        Intrinsics.checkNotNullParameter(promocode, "promocode");
        this.applyCouponState.couponApply();
        this.activatedCoupons.add(promocode);
        this.activatedCouponsListener.accept(this.activatedCoupons);
    }

    @NotNull
    public final p<Set<String>> observeActivatedCoupons() {
        p<Set<String>> filter = this.activatedCouponsListener.filter(new i(CouponStorage$observeActivatedCoupons$1.INSTANCE, 11));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        return filter;
    }
}
