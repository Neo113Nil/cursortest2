package ru.ozon.app.android.push.di;

import Jb.j;
import Jb.k;
import Ld0.c;
import Pc.a;
import We.B;
import We.C4871m;
import We.C4876s;
import We.InterfaceC4875q;
import Zg0.e;
import Zg0.g;
import android.app.Application;
import android.content.Context;
import androidx.core.app.n;
import eh0.b;
import eh0.d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.push.OzonPushManagerImpl;
import ru.ozon.app.android.push.di.PushComponent;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvideLogConfigurationFactory;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvideNetworkClientConfigurationFactory;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvideNotificationManagerFactory;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvideOzonPushFactory;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvidePostShowingPushNotificationHandlersFactory;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvidePushConfigurationFactory;
import ru.ozon.app.android.push.di.module.OzonPushModule_Companion_ProvideTeensModeProviderFactory;
import ru.ozon.app.android.push.handlers.PartPaymentPushHandler;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

/* loaded from: classes7.dex */
public final class DaggerPushComponent {

    private static final class Factory implements PushComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.push.di.PushComponent.Factory
        public PushComponent create(PushComponentDependencies pushComponentDependencies, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            pushComponentDependencies.getClass();
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            limb2ComponentApi.getClass();
            return new PushComponentImpl(pushComponentDependencies, contextComponentDependencies, networkComponentApi, storageComponentApi, limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PushComponentImpl implements PushComponent {
        private a<OzonPushManager> bindsOzonPushManagerProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<Set<d>> getPreShowNotificationsHandlerProvider;
        private final Limb2ComponentApi limb2ComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<OzonPushManagerImpl> ozonPushManagerImplProvider;
        private a<Zg0.d> provideLogConfigurationProvider;
        private a<e> provideNetworkClientConfigurationProvider;
        private a<n> provideNotificationManagerProvider;
        private a<Yg0.a> provideOzonPushProvider;
        private a<Set<b>> providePostShowingPushNotificationHandlersProvider;
        private a<g> providePushConfigurationProvider;
        private a<Yg0.g> provideTeensModeProvider;
        private final PushComponentDependencies pushComponentDependencies;
        private final PushComponentImpl pushComponentImpl;
        private a<Set<b>> setOfPostShowingPushNotificationHandlerProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93249id;
            private final PushComponentImpl pushComponentImpl;

            SwitchingProvider(PushComponentImpl pushComponentImpl, int i11) {
                this.pushComponentImpl = pushComponentImpl;
                this.f93249id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f93249id) {
                    case 0:
                        return (T) new OzonPushManagerImpl((Yg0.a) this.pushComponentImpl.provideOzonPushProvider.get(), Jb.d.a(this.pushComponentImpl.setOfPostShowingPushNotificationHandlerProvider), Jb.d.a(this.pushComponentImpl.getPreShowNotificationsHandlerProvider), Jb.d.a(this.pushComponentImpl.provideTeensModeProvider));
                    case 1:
                        Application application = this.pushComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application);
                        return (T) OzonPushModule_Companion_ProvideOzonPushFactory.provideOzonPush(application, (g) this.pushComponentImpl.providePushConfigurationProvider.get(), (Zg0.d) this.pushComponentImpl.provideLogConfigurationProvider.get());
                    case 2:
                        Context context = this.pushComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        PushComponentConfig pushComponentConfig = this.pushComponentImpl.pushComponentDependencies.getPushComponentConfig();
                        j.c(pushComponentConfig);
                        e eVar = (e) this.pushComponentImpl.provideNetworkClientConfigurationProvider.get();
                        ApplicationInfoDataSource applicationInfoStorage = this.pushComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage);
                        n nVar = (n) this.pushComponentImpl.provideNotificationManagerProvider.get();
                        FeatureChecker featureChecker = this.pushComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        c ozonLimbDiStore = this.pushComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) OzonPushModule_Companion_ProvidePushConfigurationFactory.providePushConfiguration(context, pushComponentConfig, eVar, applicationInfoStorage, nVar, featureChecker, ozonLimbDiStore);
                    case 3:
                        PushComponentConfig pushComponentConfig2 = this.pushComponentImpl.pushComponentDependencies.getPushComponentConfig();
                        j.c(pushComponentConfig2);
                        InterfaceC4875q cookieJar = this.pushComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar);
                        List<B> interceptors = this.pushComponentImpl.networkComponentApi.getInterceptors();
                        j.c(interceptors);
                        List<B> list = interceptors;
                        C4871m connectionPool = this.pushComponentImpl.networkComponentApi.getConnectionPool();
                        j.c(connectionPool);
                        C4876s dispatcher = this.pushComponentImpl.networkComponentApi.getDispatcher();
                        j.c(dispatcher);
                        FeatureService featureService = this.pushComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        return (T) OzonPushModule_Companion_ProvideNetworkClientConfigurationFactory.provideNetworkClientConfiguration(pushComponentConfig2, cookieJar, list, connectionPool, dispatcher, featureService);
                    case 4:
                        Context context2 = this.pushComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) OzonPushModule_Companion_ProvideNotificationManagerFactory.provideNotificationManager(context2);
                    case 5:
                        FeatureService featureService2 = this.pushComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        return (T) OzonPushModule_Companion_ProvideLogConfigurationFactory.provideLogConfiguration(featureService2);
                    case 6:
                        k d11 = k.d(1);
                        d11.b((Collection) this.pushComponentImpl.providePostShowingPushNotificationHandlersProvider.get());
                        return (T) d11.c();
                    case 7:
                        return (T) OzonPushModule_Companion_ProvidePostShowingPushNotificationHandlersFactory.providePostShowingPushNotificationHandlers(this.pushComponentImpl.partPaymentPushHandler());
                    case 8:
                        T t2 = (T) this.pushComponentImpl.pushComponentDependencies.getPreShowNotificationsHandler();
                        j.c(t2);
                        return t2;
                    case 9:
                        TeensModeStorage teensModeStorage = this.pushComponentImpl.storageComponentApi.getTeensModeStorage();
                        j.c(teensModeStorage);
                        return (T) OzonPushModule_Companion_ProvideTeensModeProviderFactory.provideTeensModeProvider(teensModeStorage);
                    default:
                        throw new AssertionError(this.f93249id);
                }
            }
        }

        /* synthetic */ PushComponentImpl(PushComponentDependencies pushComponentDependencies, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(pushComponentDependencies, contextComponentDependencies, networkComponentApi, storageComponentApi, limb2ComponentApi);
        }

        private void initialize(PushComponentDependencies pushComponentDependencies, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.provideNetworkClientConfigurationProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 3));
            this.provideNotificationManagerProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 4));
            this.providePushConfigurationProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 2));
            this.provideLogConfigurationProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 5));
            this.provideOzonPushProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 1));
            this.providePostShowingPushNotificationHandlersProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 7));
            this.setOfPostShowingPushNotificationHandlerProvider = new SwitchingProvider(this.pushComponentImpl, 6);
            this.getPreShowNotificationsHandlerProvider = new SwitchingProvider(this.pushComponentImpl, 8);
            this.provideTeensModeProvider = Jb.d.b(new SwitchingProvider(this.pushComponentImpl, 9));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.pushComponentImpl, 0);
            this.ozonPushManagerImplProvider = switchingProvider;
            this.bindsOzonPushManagerProvider = Jb.d.b(switchingProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PartPaymentPushHandler partPaymentPushHandler() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new PartPaymentPushHandler(context);
        }

        @Override // ru.ozon.app.android.push.di.PushComponentApi
        public OzonPushManager getOzonPushManager() {
            return this.bindsOzonPushManagerProvider.get();
        }

        private PushComponentImpl(PushComponentDependencies pushComponentDependencies, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.pushComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.pushComponentDependencies = pushComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.limb2ComponentApi = limb2ComponentApi;
            initialize(pushComponentDependencies, contextComponentDependencies, networkComponentApi, storageComponentApi, limb2ComponentApi);
        }
    }

    public static PushComponent.Factory factory() {
        return new Factory(0);
    }
}
