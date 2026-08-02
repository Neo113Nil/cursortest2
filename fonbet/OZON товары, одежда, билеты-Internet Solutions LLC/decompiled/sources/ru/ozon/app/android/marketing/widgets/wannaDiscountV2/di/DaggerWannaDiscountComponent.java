package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di;

import Jb.d;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core.WannaDiscountDecisionMapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core.WannaDiscountDecisionMapper_Factory;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2Mapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2Mapper_Factory;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2Repository;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2Repository_Factory;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Api;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModelImpl;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModelImpl_Factory;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerWannaDiscountComponent {

    private static final class Factory implements WannaDiscountComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent.Factory
        public WannaDiscountComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new WannaDiscountComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class WannaDiscountComponentImpl implements WannaDiscountComponent {
        private a<Retrofit> getRetrofitProvider;
        private a<WannaDiscountV2Api> provideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseProvider;
        private final WannaDiscountComponentImpl wannaDiscountComponentImpl;
        private a<WannaDiscountDecisionMapper> wannaDiscountDecisionMapperProvider;
        private a<WannaDiscountV2Mapper> wannaDiscountV2MapperProvider;
        private a<WannaDiscountV2Repository> wannaDiscountV2RepositoryProvider;
        private a<WannaDiscountV2ViewModelImpl> wannaDiscountV2ViewModelImplProvider;

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

        /* synthetic */ WannaDiscountComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi) {
            this.wannaDiscountV2MapperProvider = d.b(WannaDiscountV2Mapper_Factory.create());
            this.wannaDiscountDecisionMapperProvider = d.b(WannaDiscountDecisionMapper_Factory.create());
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            WannaDiscountModule_Companion_ProvideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseFactory create = WannaDiscountModule_Companion_ProvideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseFactory.create(getRetrofitProvider);
            this.provideWannaDiscountApi$marketing_prodGoogleAllVendorsReleaseProvider = create;
            WannaDiscountV2Repository_Factory create2 = WannaDiscountV2Repository_Factory.create(create);
            this.wannaDiscountV2RepositoryProvider = create2;
            this.wannaDiscountV2ViewModelImplProvider = WannaDiscountV2ViewModelImpl_Factory.create(create2);
        }

        @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent
        public WannaDiscountDecisionMapper getWannaDiscountDecisionMapper() {
            return this.wannaDiscountDecisionMapperProvider.get();
        }

        @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent
        public WannaDiscountV2Mapper getWannaDiscountV2Mapper() {
            return this.wannaDiscountV2MapperProvider.get();
        }

        @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent
        public a<WannaDiscountV2ViewModelImpl> getWannaDiscountV2ViewModelProvider() {
            return this.wannaDiscountV2ViewModelImplProvider;
        }

        private WannaDiscountComponentImpl(NetworkComponentApi networkComponentApi) {
            this.wannaDiscountComponentImpl = this;
            initialize(networkComponentApi);
        }
    }

    public static WannaDiscountComponent.Factory factory() {
        return new Factory(0);
    }
}
