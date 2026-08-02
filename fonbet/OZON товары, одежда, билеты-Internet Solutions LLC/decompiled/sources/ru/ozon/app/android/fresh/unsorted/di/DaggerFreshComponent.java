package ru.ozon.app.android.fresh.unsorted.di;

import Jb.d;
import Jb.j;
import Jb.k;
import Pc.a;
import android.app.Application;
import bh0.InterfaceC5666b;
import java.util.Set;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.unsorted.di.FreshComponent;
import ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider;
import ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider;
import ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider_Factory;
import ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus.OrderStatusLiveActivityNotificationProvider;
import ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus.OrderStatusLiveActivityNotificationProvider_Factory;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerFreshComponent {

    private static final class Factory implements FreshComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.unsorted.di.FreshComponent.Factory
        public FreshComponent create(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            analyticsComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new FreshComponentImpl(networkComponentApi, analyticsComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class FreshComponentImpl implements FreshComponent {
        private a<LiveActivityNotificationProvider> bindClickLiveActivityNotificationProvider;
        private a<LiveActivityNotificationProvider> bindOrderStatusLiveActivityNotificationProvider;
        private a<ClickLiveActivityNotificationProvider> clickLiveActivityNotificationProvider;
        private final FreshComponentImpl freshComponentImpl;
        private a<Application> getApplicationProvider;
        private a<JsonParser> getJsonDeserializerProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<OrderStatusLiveActivityNotificationProvider> orderStatusLiveActivityNotificationProvider;
        private a<InterfaceC5666b> provideClickLiveActivityListenerProvider;
        private a<InterfaceC5666b> provideOrderStatusLiveActivityListenerProvider;
        private a<RecShelfApi> provideRecShelfApiProvider;

        private static final class GetApplicationProvider implements a<Application> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetApplicationProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Application get() {
                Application application = this.contextComponentDependencies.getApplication();
                j.c(application);
                return application;
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

        /* synthetic */ FreshComponentImpl(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, analyticsComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.getApplicationProvider = new GetApplicationProvider(contextComponentDependencies);
            GetJsonDeserializerProvider getJsonDeserializerProvider = new GetJsonDeserializerProvider(networkComponentApi);
            this.getJsonDeserializerProvider = getJsonDeserializerProvider;
            OrderStatusLiveActivityNotificationProvider_Factory create = OrderStatusLiveActivityNotificationProvider_Factory.create(this.getApplicationProvider, getJsonDeserializerProvider);
            this.orderStatusLiveActivityNotificationProvider = create;
            a<LiveActivityNotificationProvider> b11 = d.b(create);
            this.bindOrderStatusLiveActivityNotificationProvider = b11;
            this.provideOrderStatusLiveActivityListenerProvider = d.b(FreshModule_Companion_ProvideOrderStatusLiveActivityListenerFactory.create(this.getApplicationProvider, b11));
            ClickLiveActivityNotificationProvider_Factory create2 = ClickLiveActivityNotificationProvider_Factory.create(this.getApplicationProvider, this.getJsonDeserializerProvider);
            this.clickLiveActivityNotificationProvider = create2;
            a<LiveActivityNotificationProvider> b12 = d.b(create2);
            this.bindClickLiveActivityNotificationProvider = b12;
            this.provideClickLiveActivityListenerProvider = d.b(FreshModule_Companion_ProvideClickLiveActivityListenerFactory.create(this.getApplicationProvider, b12));
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            this.provideRecShelfApiProvider = d.b(FreshModule_Companion_ProvideRecShelfApiFactory.create(getRetrofitProvider));
        }

        @Override // ru.ozon.app.android.fresh.unsorted.di.FreshComponentApi
        public Set<InterfaceC5666b> getLiveActivityListeners() {
            k d11 = k.d(2);
            d11.a(this.provideOrderStatusLiveActivityListenerProvider.get());
            d11.a(this.provideClickLiveActivityListenerProvider.get());
            return d11.c();
        }

        private FreshComponentImpl(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.freshComponentImpl = this;
            initialize(networkComponentApi, analyticsComponentApi, contextComponentDependencies);
        }
    }

    public static FreshComponent.Factory factory() {
        return new Factory(0);
    }
}
