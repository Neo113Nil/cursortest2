package ru.ozon.app.android.marketing.coupon.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepositoryImpl_Factory;
import ru.ozon.app.android.marketing.coupon.data.CouponApi;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage_Factory;
import ru.ozon.app.android.marketing.coupon.di.CouponComponent;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerCouponComponent {

    private static final class CouponComponentImpl implements CouponComponent {
        private a<CouponActivationRepository> bindCouponActivationRepositoryProvider;
        private a<CouponActivationRepositoryImpl> couponActivationRepositoryImplProvider;
        private final CouponComponentImpl couponComponentImpl;
        private a<CouponStorage> couponStorageProvider;
        private a<AuthStateStorage> getAuthStateStorageProvider;
        private a<ApplyCouponState> getCouponUpdateStateProvider;
        private a<JsonParser> getJsonDeserializerProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<CouponApi> provideCouponApiProvider;
        private final StorageComponentApi storageComponentApi;

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

        private static final class GetCouponUpdateStateProvider implements a<ApplyCouponState> {
            private final AccountComponentApi accountComponentApi;

            GetCouponUpdateStateProvider(AccountComponentApi accountComponentApi) {
                this.accountComponentApi = accountComponentApi;
            }

            @Override // Pc.a
            public ApplyCouponState get() {
                ApplyCouponState couponUpdateState = this.accountComponentApi.getCouponUpdateState();
                j.c(couponUpdateState);
                return couponUpdateState;
            }
        }

        private static final class GetJsonDeserializerProvider implements a<JsonParser> {
            private final NetworkComponentApi networkComponentApi;

            GetJsonDeserializerProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public JsonParser get() {
                JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
                j.c(jsonDeserializer);
                return jsonDeserializer;
            }
        }

        private static final class GetRetrofitProvider implements a<Retrofit> {
            private final NetworkComponentApi networkComponentApi;

            GetRetrofitProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public Retrofit get() {
                Retrofit retrofit = this.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return retrofit;
            }
        }

        /* synthetic */ CouponComponentImpl(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, int i11) {
            this(contextComponentDependencies, storageComponentApi, networkComponentApi, accountComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi) {
            this.getAuthStateStorageProvider = new GetAuthStateStorageProvider(storageComponentApi);
            GetCouponUpdateStateProvider getCouponUpdateStateProvider = new GetCouponUpdateStateProvider(accountComponentApi);
            this.getCouponUpdateStateProvider = getCouponUpdateStateProvider;
            this.couponStorageProvider = d.b(CouponStorage_Factory.create(this.getAuthStateStorageProvider, getCouponUpdateStateProvider));
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            this.provideCouponApiProvider = d.b(CouponModule_Companion_ProvideCouponApiFactory.create(getRetrofitProvider));
            GetJsonDeserializerProvider getJsonDeserializerProvider = new GetJsonDeserializerProvider(networkComponentApi);
            this.getJsonDeserializerProvider = getJsonDeserializerProvider;
            CouponActivationRepositoryImpl_Factory create = CouponActivationRepositoryImpl_Factory.create(this.provideCouponApiProvider, getJsonDeserializerProvider);
            this.couponActivationRepositoryImplProvider = create;
            this.bindCouponActivationRepositoryProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.marketing.coupon.di.CouponComponentApi
        public CouponActivationRepository getCouponActivationRepository() {
            return this.bindCouponActivationRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.marketing.coupon.di.CouponComponentApi
        public CouponInteractor getCouponInteractor() {
            AuthStateStorage authStateStorage = this.storageComponentApi.getAuthStateStorage();
            j.c(authStateStorage);
            return new CouponInteractor(authStateStorage, this.bindCouponActivationRepositoryProvider.get());
        }

        @Override // ru.ozon.app.android.marketing.coupon.di.CouponComponentApi
        public CouponStorage getCouponStorage() {
            return this.couponStorageProvider.get();
        }

        private CouponComponentImpl(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi) {
            this.couponComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            initialize(contextComponentDependencies, storageComponentApi, networkComponentApi, accountComponentApi);
        }
    }

    private static final class Factory implements CouponComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.coupon.di.CouponComponent.Factory
        public CouponComponent create(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi) {
            contextComponentDependencies.getClass();
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            accountComponentApi.getClass();
            return new CouponComponentImpl(contextComponentDependencies, storageComponentApi, networkComponentApi, accountComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CouponComponent.Factory factory() {
        return new Factory(0);
    }
}
