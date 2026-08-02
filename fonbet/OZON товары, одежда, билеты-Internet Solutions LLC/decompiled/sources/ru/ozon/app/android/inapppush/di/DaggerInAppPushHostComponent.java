package ru.ozon.app.android.inapppush.di;

import GZ.g;
import Jb.j;
import Ld0.c;
import We.B;
import We.InterfaceC4875q;
import ei0.InterfaceC6369b;
import java.util.List;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.inapppush.InAppPushHost;
import ru.ozon.app.android.inapppush.di.InAppPushHostComponent;
import ru.ozon.app.android.inapppush.domain.GetPageNameFromDeeplinkOrJsonUseCase;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class DaggerInAppPushHostComponent {

    private static final class Factory implements InAppPushHostComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.inapppush.di.InAppPushHostComponent.Factory
        public InAppPushHostComponent create(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            navigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            networkComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            limb2ComponentApi.getClass();
            return new InAppPushHostComponentImpl(navigationComponentApi, analyticsComponentApi, networkComponentApi, androidPlatformComponentDependencies, limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class InAppPushHostComponentImpl implements InAppPushHostComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final InAppPushHostComponentImpl inAppPushHostComponentImpl;
        private final Limb2ComponentApi limb2ComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ InAppPushHostComponentImpl(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(navigationComponentApi, analyticsComponentApi, networkComponentApi, androidPlatformComponentDependencies, limb2ComponentApi);
        }

        @Override // ru.ozon.app.android.inapppush.InAppPushHostApi
        public InAppPushHost getInAppPushHost() {
            GetPageNameFromDeeplinkOrJsonUseCase getPageNameFromDeeplinkOrJsonUseCase = new GetPageNameFromDeeplinkOrJsonUseCase();
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            InterfaceC4875q cookieJar = this.networkComponentApi.getCookieJar();
            j.c(cookieJar);
            InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
            j.c(ozonTracker);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            List<B> interceptors = this.networkComponentApi.getInterceptors();
            j.c(interceptors);
            c ozonLimbDiStore = this.limb2ComponentApi.getOzonLimbDiStore();
            j.c(ozonLimbDiStore);
            return InAppPushModule_ProvideInAppPushHostFactory.provideInAppPushHost(getPageNameFromDeeplinkOrJsonUseCase, ozonRouter, featureChecker, cookieJar, ozonTracker, jsonDeserializer, networkComponentConfig, appType, interceptors, ozonLimbDiStore);
        }

        private InAppPushHostComponentImpl(NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, Limb2ComponentApi limb2ComponentApi) {
            this.inAppPushHostComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.limb2ComponentApi = limb2ComponentApi;
        }
    }

    public static InAppPushHostComponent.Factory factory() {
        return new Factory(0);
    }
}
