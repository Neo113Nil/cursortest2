package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router.PdpCouponListV2Router;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

/* loaded from: classes12.dex */
public final class PdpCouponListV2ViewModelImpl_Factory implements e<PdpCouponListV2ViewModelImpl> {
    private final a<AuthStateStorage> authManagerProvider;
    private final a<CouponStorage> couponStorageProvider;
    private final a<CouponActivationRepository> repositoryProvider;
    private final a<PdpCouponListV2Router> routerProvider;

    public PdpCouponListV2ViewModelImpl_Factory(a<AuthStateStorage> aVar, a<CouponStorage> aVar2, a<CouponActivationRepository> aVar3, a<PdpCouponListV2Router> aVar4) {
        this.authManagerProvider = aVar;
        this.couponStorageProvider = aVar2;
        this.repositoryProvider = aVar3;
        this.routerProvider = aVar4;
    }

    public static PdpCouponListV2ViewModelImpl_Factory create(a<AuthStateStorage> aVar, a<CouponStorage> aVar2, a<CouponActivationRepository> aVar3, a<PdpCouponListV2Router> aVar4) {
        return new PdpCouponListV2ViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static PdpCouponListV2ViewModelImpl newInstance(AuthStateStorage authStateStorage, CouponStorage couponStorage, CouponActivationRepository couponActivationRepository, PdpCouponListV2Router pdpCouponListV2Router) {
        return new PdpCouponListV2ViewModelImpl(authStateStorage, couponStorage, couponActivationRepository, pdpCouponListV2Router);
    }

    @Override // Pc.a
    public PdpCouponListV2ViewModelImpl get() {
        return newInstance(this.authManagerProvider.get(), this.couponStorageProvider.get(), this.repositoryProvider.get(), this.routerProvider.get());
    }
}
