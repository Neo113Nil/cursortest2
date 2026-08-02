package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.di;

import GZ.g;
import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.di.PdpCouponListV2Component;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModelImpl;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModelImpl_Factory;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router.PdpCouponListV2Router;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router.PdpCouponListV2RouterImpl;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router.PdpCouponListV2RouterImpl_Factory;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes12.dex */
public final class DaggerPdpCouponListV2Component {

    private static final class Factory implements PdpCouponListV2Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.pdpCouponListV2.di.PdpCouponListV2Component.Factory
        public PdpCouponListV2Component create(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi) {
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            navigationComponentApi.getClass();
            couponComponentApi.getClass();
            return new PdpCouponListV2ComponentImpl(networkComponentApi, storageComponentApi, navigationComponentApi, couponComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PdpCouponListV2ComponentImpl implements PdpCouponListV2Component {
        private a<PdpCouponListV2Router> bindRouterProvider;
        private final CouponComponentApi couponComponentApi;
        private a<AuthStateStorage> getAuthStateStorageProvider;
        private a<CouponActivationRepository> getCouponActivationRepositoryProvider;
        private a<CouponStorage> getCouponStorageProvider;
        private a<g> getOzonRouterProvider;
        private final PdpCouponListV2ComponentImpl pdpCouponListV2ComponentImpl;
        private a<PdpCouponListV2RouterImpl> pdpCouponListV2RouterImplProvider;
        private a<PdpCouponListV2ViewModelImpl> pdpCouponListV2ViewModelImplProvider;

        private static final class GetAuthStateStorageProvider implements a<AuthStateStorage> {
            private final StorageComponentApi storageComponentApi;

            GetAuthStateStorageProvider(StorageComponentApi storageComponentApi) {
                this.storageComponentApi = storageComponentApi;
            }

            @Override // Pc.a
            public AuthStateStorage get() {
                AuthStateStorage authStateStorage = this.storageComponentApi.getAuthStateStorage();
                j.c(authStateStorage);
                return authStateStorage;
            }
        }

        private static final class GetCouponActivationRepositoryProvider implements a<CouponActivationRepository> {
            private final CouponComponentApi couponComponentApi;

            GetCouponActivationRepositoryProvider(CouponComponentApi couponComponentApi) {
                this.couponComponentApi = couponComponentApi;
            }

            @Override // Pc.a
            public CouponActivationRepository get() {
                CouponActivationRepository couponActivationRepository = this.couponComponentApi.getCouponActivationRepository();
                j.c(couponActivationRepository);
                return couponActivationRepository;
            }
        }

        private static final class GetCouponStorageProvider implements a<CouponStorage> {
            private final CouponComponentApi couponComponentApi;

            GetCouponStorageProvider(CouponComponentApi couponComponentApi) {
                this.couponComponentApi = couponComponentApi;
            }

            @Override // Pc.a
            public CouponStorage get() {
                CouponStorage couponStorage = this.couponComponentApi.getCouponStorage();
                j.c(couponStorage);
                return couponStorage;
            }
        }

        private static final class GetOzonRouterProvider implements a<g> {
            private final NavigationComponentApi navigationComponentApi;

            GetOzonRouterProvider(NavigationComponentApi navigationComponentApi) {
                this.navigationComponentApi = navigationComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public g get() {
                g ozonRouter = this.navigationComponentApi.getOzonRouter();
                j.c(ozonRouter);
                return ozonRouter;
            }
        }

        /* synthetic */ PdpCouponListV2ComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi, int i11) {
            this(networkComponentApi, storageComponentApi, navigationComponentApi, couponComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi) {
            this.getAuthStateStorageProvider = new GetAuthStateStorageProvider(storageComponentApi);
            this.getCouponStorageProvider = new GetCouponStorageProvider(couponComponentApi);
            this.getCouponActivationRepositoryProvider = new GetCouponActivationRepositoryProvider(couponComponentApi);
            GetOzonRouterProvider getOzonRouterProvider = new GetOzonRouterProvider(navigationComponentApi);
            this.getOzonRouterProvider = getOzonRouterProvider;
            PdpCouponListV2RouterImpl_Factory create = PdpCouponListV2RouterImpl_Factory.create(getOzonRouterProvider);
            this.pdpCouponListV2RouterImplProvider = create;
            a<PdpCouponListV2Router> b11 = d.b(create);
            this.bindRouterProvider = b11;
            this.pdpCouponListV2ViewModelImplProvider = PdpCouponListV2ViewModelImpl_Factory.create(this.getAuthStateStorageProvider, this.getCouponStorageProvider, this.getCouponActivationRepositoryProvider, b11);
        }

        @Override // ru.ozon.app.android.marketing.widgets.pdpCouponListV2.di.PdpCouponListV2Component
        public a<PdpCouponListV2ViewModelImpl> getViewModelProvider() {
            return this.pdpCouponListV2ViewModelImplProvider;
        }

        private PdpCouponListV2ComponentImpl(NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CouponComponentApi couponComponentApi) {
            this.pdpCouponListV2ComponentImpl = this;
            this.couponComponentApi = couponComponentApi;
            initialize(networkComponentApi, storageComponentApi, navigationComponentApi, couponComponentApi);
        }
    }

    public static PdpCouponListV2Component.Factory factory() {
        return new Factory(0);
    }
}
