package ru.ozon.app.android.marketing.widgets.couponPromo.di;

import GZ.g;
import Jb.j;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.marketing.widgets.couponPromo.di.CouponPromoBottomSheetComponent;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog_MembersInjector;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes12.dex */
public final class DaggerCouponPromoBottomSheetComponent {

    private static final class CouponPromoBottomSheetComponentImpl implements CouponPromoBottomSheetComponent {
        private final CouponComponentApi couponComponentApi;
        private final CouponPromoBottomSheetComponentImpl couponPromoBottomSheetComponentImpl;
        private final NavigationComponentApi navigationComponentApi;
        private final StorageComponentApi storageComponentApi;

        /* synthetic */ CouponPromoBottomSheetComponentImpl(StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi, int i11) {
            this(storageComponentApi, navigationComponentApi, couponComponentApi);
        }

        private CouponPromoRouter couponPromoRouter() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new CouponPromoRouter(ozonRouter);
        }

        private CouponPromoBottomSheetDialog injectCouponPromoBottomSheetDialog(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            CouponPromoBottomSheetDialog_MembersInjector.injectRouter(couponPromoBottomSheetDialog, ozonRouter);
            CouponActivationRepository couponActivationRepository = this.couponComponentApi.getCouponActivationRepository();
            j.c(couponActivationRepository);
            CouponPromoBottomSheetDialog_MembersInjector.injectCouponActivationRepository(couponPromoBottomSheetDialog, couponActivationRepository);
            AuthStateStorage authStateStorage = this.storageComponentApi.getAuthStateStorage();
            j.c(authStateStorage);
            CouponPromoBottomSheetDialog_MembersInjector.injectAuthManager(couponPromoBottomSheetDialog, authStateStorage);
            CouponPromoBottomSheetDialog_MembersInjector.injectCouponPromoRouter(couponPromoBottomSheetDialog, couponPromoRouter());
            return couponPromoBottomSheetDialog;
        }

        @Override // ru.ozon.app.android.marketing.widgets.couponPromo.di.CouponPromoBottomSheetComponent
        public void inject(CouponPromoBottomSheetDialog couponPromoBottomSheetDialog) {
            injectCouponPromoBottomSheetDialog(couponPromoBottomSheetDialog);
        }

        private CouponPromoBottomSheetComponentImpl(StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi) {
            this.couponPromoBottomSheetComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.couponComponentApi = couponComponentApi;
            this.storageComponentApi = storageComponentApi;
        }
    }

    private static final class Factory implements CouponPromoBottomSheetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.couponPromo.di.CouponPromoBottomSheetComponent.Factory
        public CouponPromoBottomSheetComponent create(StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi) {
            storageComponentApi.getClass();
            navigationComponentApi.getClass();
            couponComponentApi.getClass();
            return new CouponPromoBottomSheetComponentImpl(storageComponentApi, navigationComponentApi, couponComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CouponPromoBottomSheetComponent.Factory factory() {
        return new Factory(0);
    }
}
