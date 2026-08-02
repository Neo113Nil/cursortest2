package ru.ozon.app.android.marketing.coupon.data;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

/* loaded from: classes6.dex */
public final class CouponStorage_Factory implements e<CouponStorage> {
    private final a<ApplyCouponState> applyCouponStateProvider;
    private final a<AuthStateStorage> authStateStorageProvider;

    public CouponStorage_Factory(a<AuthStateStorage> aVar, a<ApplyCouponState> aVar2) {
        this.authStateStorageProvider = aVar;
        this.applyCouponStateProvider = aVar2;
    }

    public static CouponStorage_Factory create(a<AuthStateStorage> aVar, a<ApplyCouponState> aVar2) {
        return new CouponStorage_Factory(aVar, aVar2);
    }

    public static CouponStorage newInstance(AuthStateStorage authStateStorage, ApplyCouponState applyCouponState) {
        return new CouponStorage(authStateStorage, applyCouponState);
    }

    @Override // Pc.a
    public CouponStorage get() {
        return newInstance(this.authStateStorageProvider.get(), this.applyCouponStateProvider.get());
    }
}
