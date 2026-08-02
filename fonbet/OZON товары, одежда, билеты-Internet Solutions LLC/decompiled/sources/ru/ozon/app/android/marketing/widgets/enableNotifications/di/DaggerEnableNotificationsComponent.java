package ru.ozon.app.android.marketing.widgets.enableNotifications.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor_Factory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.di.notifications.NotificationCenterModule_Companion_ProvideAllowPushApisFactory;
import ru.ozon.app.android.marketing.widgets.enableNotifications.api.EnableNotificationsApi;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsMapper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsMapper_Factory;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepository;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepositoryImpl;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepositoryImpl_Factory;
import ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModelImpl;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModelImpl_Factory;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes12.dex */
public final class DaggerEnableNotificationsComponent {

    private static final class EnableNotificationsComponentImpl implements EnableNotificationsComponent {
        private a<EnableNotificationsRepository> bindAllowPushRepositoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final EnableNotificationsComponentImpl enableNotificationsComponentImpl;
        private a<EnableNotificationsMapper> enableNotificationsMapperProvider;
        private a<EnableNotificationsRepositoryImpl> enableNotificationsRepositoryImplProvider;
        private a<EnableNotificationsViewModelImpl> enableNotificationsViewModelImplProvider;
        private a<Context> getContextProvider;
        private a<NetworkComponentConfig> getNetworkComponentConfigProvider;
        private a<Retrofit> getRetrofitProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private a<EnableNotificationsApi> provideAllowPushApisProvider;

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        private static final class GetNetworkComponentConfigProvider implements a<NetworkComponentConfig> {
            private final NetworkComponentApi networkComponentApi;

            GetNetworkComponentConfigProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public NetworkComponentConfig get() {
                NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
                j.c(networkComponentConfig);
                return networkComponentConfig;
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

        /* synthetic */ EnableNotificationsComponentImpl(int i11, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this(contextComponentDependencies, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            this.provideAllowPushApisProvider = m.a(NotificationCenterModule_Companion_ProvideAllowPushApisFactory.create(getRetrofitProvider));
            GetNetworkComponentConfigProvider getNetworkComponentConfigProvider = new GetNetworkComponentConfigProvider(networkComponentApi);
            this.getNetworkComponentConfigProvider = getNetworkComponentConfigProvider;
            EnableNotificationsRepositoryImpl_Factory create = EnableNotificationsRepositoryImpl_Factory.create(this.provideAllowPushApisProvider, getNetworkComponentConfigProvider);
            this.enableNotificationsRepositoryImplProvider = create;
            a<EnableNotificationsRepository> a11 = m.a(create);
            this.bindAllowPushRepositoryProvider = a11;
            this.enableNotificationsViewModelImplProvider = EnableNotificationsViewModelImpl_Factory.create(a11);
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.enableNotificationsMapperProvider = d.b(EnableNotificationsMapper_Factory.create(getContextProvider));
            this.handlersInhibitorProvider = m.a(HandlersInhibitor_Factory.create());
        }

        @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent
        public Context getContext() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return context;
        }

        @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent
        public a<EnableNotificationsViewModelImpl> getEnableNotificationsViewModelProvider() {
            return this.enableNotificationsViewModelImplProvider;
        }

        @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent
        public EnableNotificationsMapper getMapper() {
            return this.enableNotificationsMapperProvider.get();
        }

        private EnableNotificationsComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            this.enableNotificationsComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(contextComponentDependencies, networkComponentApi);
        }
    }

    private static final class Factory implements EnableNotificationsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent.Factory
        public EnableNotificationsComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            return new EnableNotificationsComponentImpl(0, contextComponentDependencies, networkComponentApi);
        }

        private Factory() {
        }
    }

    public static EnableNotificationsComponent.Factory factory() {
        return new Factory(0);
    }
}
