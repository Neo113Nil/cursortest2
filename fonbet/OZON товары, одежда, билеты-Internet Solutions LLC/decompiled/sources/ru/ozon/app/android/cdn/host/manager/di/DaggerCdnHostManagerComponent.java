package ru.ozon.app.android.cdn.host.manager.di;

import Jb.d;
import Jb.j;
import Pc.a;
import We.E;
import android.content.Context;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.cdn.host.manager.CdnChooserSdkManager;
import ru.ozon.app.android.cdn.host.manager.CdnChooserSdkManagerImpl;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponent;
import ru.ozon.app.android.cdn.host.manager.di.module.CdnHostManagerModule_Companion_ProvideCdnChooserHostApiFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.video.di.CdnVideoComponentApi;
import ru.ozon.app.android.video.player.CdnChooserSdkVideoService;

/* loaded from: classes6.dex */
public final class DaggerCdnHostManagerComponent {

    private static final class CdnHostManagerComponentImpl implements CdnHostManagerComponent {
        private a<CdnChooserSdkManager> bindCdnChooserSdkManagerProvider;
        private a<CdnChooserSdkManagerImpl> cdnChooserSdkManagerImplProvider;
        private final CdnHostManagerComponentImpl cdnHostManagerComponentImpl;
        private final CdnVideoComponentApi cdnVideoComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NetworkComponentApi networkComponentApi;
        private a<YY.a> provideCdnChooserHostApiProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CdnHostManagerComponentImpl cdnHostManagerComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92283id;

            SwitchingProvider(CdnHostManagerComponentImpl cdnHostManagerComponentImpl, int i11) {
                this.cdnHostManagerComponentImpl = cdnHostManagerComponentImpl;
                this.f92283id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92283id;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new AssertionError(this.f92283id);
                    }
                    YY.a aVar = (YY.a) this.cdnHostManagerComponentImpl.provideCdnChooserHostApiProvider.get();
                    CdnChooserSdkVideoService cdnChooserSdkVideoService = this.cdnHostManagerComponentImpl.cdnVideoComponentApi.getCdnChooserSdkVideoService();
                    j.c(cdnChooserSdkVideoService);
                    return (T) new CdnChooserSdkManagerImpl(aVar, cdnChooserSdkVideoService);
                }
                Context context = this.cdnHostManagerComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                E okHttpClient = this.cdnHostManagerComponentImpl.networkComponentApi.getOkHttpClient();
                j.c(okHttpClient);
                NetworkComponentConfig networkComponentConfig = this.cdnHostManagerComponentImpl.networkComponentApi.getNetworkComponentConfig();
                j.c(networkComponentConfig);
                return (T) CdnHostManagerModule_Companion_ProvideCdnChooserHostApiFactory.provideCdnChooserHostApi(context, okHttpClient, networkComponentConfig);
            }
        }

        /* synthetic */ CdnHostManagerComponentImpl(NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, cdnVideoComponentApi, analyticsComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.provideCdnChooserHostApiProvider = d.b(new SwitchingProvider(this.cdnHostManagerComponentImpl, 0));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.cdnHostManagerComponentImpl, 1);
            this.cdnChooserSdkManagerImplProvider = switchingProvider;
            this.bindCdnChooserSdkManagerProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi
        public YY.a getCdnChooserHostApi() {
            return this.provideCdnChooserHostApiProvider.get();
        }

        @Override // ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi
        public CdnChooserSdkManager getCdnChooserSdkManager() {
            return this.bindCdnChooserSdkManagerProvider.get();
        }

        private CdnHostManagerComponentImpl(NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.cdnHostManagerComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            this.cdnVideoComponentApi = cdnVideoComponentApi;
            initialize(networkComponentApi, cdnVideoComponentApi, analyticsComponentApi, contextComponentDependencies);
        }
    }

    private static final class Factory implements CdnHostManagerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponent.Factory
        public CdnHostManagerComponent create(NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            cdnVideoComponentApi.getClass();
            analyticsComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new CdnHostManagerComponentImpl(networkComponentApi, cdnVideoComponentApi, analyticsComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static CdnHostManagerComponent.Factory factory() {
        return new Factory(0);
    }
}
