package ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog;

import GZ.g;
import Ib.b;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

/* loaded from: classes12.dex */
public final class CouponPromoBottomSheetDialog_MembersInjector implements b<CouponPromoBottomSheetDialog> {
    public static void injectAuthManager(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog, AuthStateStorage authStateStorage) {
        couponPromoBottomSheetDialog.authManager = authStateStorage;
    }

    public static void injectCouponActivationRepository(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog, CouponActivationRepository couponActivationRepository) {
        couponPromoBottomSheetDialog.couponActivationRepository = couponActivationRepository;
    }

    public static void injectCouponPromoRouter(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog, CouponPromoRouter couponPromoRouter) {
        couponPromoBottomSheetDialog.couponPromoRouter = couponPromoRouter;
    }

    public static void injectRouter(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog, g gVar) {
        couponPromoBottomSheetDialog.router = gVar;
    }
}
