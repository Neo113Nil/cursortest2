package ru.ozon.app.android.scanit.di;

import GZ.g;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.modules.NonComposerPageViewAnalyticsHelper;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.scanit.di.ScanItFragmentComponent;
import ru.ozon.app.android.scanit.scanit.ScanItAnalyticsImpl;
import ru.ozon.app.android.scanit.scanit.ScanItApi;
import ru.ozon.app.android.scanit.scanit.ScanItFragment;
import ru.ozon.app.android.scanit.scanit.ScanItFragment_MembersInjector;
import ru.ozon.app.android.scanit.scanit.ScanItViewModel;
import ru.ozon.app.android.scanit.scanit.ScanItViewModel_Factory;

/* loaded from: classes13.dex */
public final class DaggerScanItFragmentComponent {

    private static final class Factory implements ScanItFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.scanit.di.ScanItFragmentComponent.Factory
        public ScanItFragmentComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new ScanItFragmentComponentImpl(contextComponentDependencies, networkComponentApi, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class ScanItFragmentComponentImpl implements ScanItFragmentComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<Context> getContextProvider;
        private a<Retrofit> getRetrofitProvider;
        private final NavigationComponentApi navigationComponentApi;
        private a<ScanItApi> provideApi$scanit_prodGoogleAllVendorsReleaseProvider;
        private final ScanItFragmentComponentImpl scanItFragmentComponentImpl;
        private a<ScanItViewModel> scanItViewModelProvider;

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

        /* synthetic */ ScanItFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(contextComponentDependencies, networkComponentApi, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.getContextProvider = new GetContextProvider(contextComponentDependencies);
            GetRetrofitProvider getRetrofitProvider = new GetRetrofitProvider(networkComponentApi);
            this.getRetrofitProvider = getRetrofitProvider;
            ScanItModule_Companion_ProvideApi$scanit_prodGoogleAllVendorsReleaseFactory create = ScanItModule_Companion_ProvideApi$scanit_prodGoogleAllVendorsReleaseFactory.create(getRetrofitProvider);
            this.provideApi$scanit_prodGoogleAllVendorsReleaseProvider = create;
            this.scanItViewModelProvider = ScanItViewModel_Factory.create(this.getContextProvider, create);
        }

        private ScanItFragment injectScanItFragment(ScanItFragment scanItFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            ScanItFragment_MembersInjector.injectScreenRouter(scanItFragment, ozonRouter);
            ScanItFragment_MembersInjector.injectScanItAnalytics(scanItFragment, scanItAnalyticsImpl());
            ScanItFragment_MembersInjector.injectPViewModel(scanItFragment, this.scanItViewModelProvider);
            return scanItFragment;
        }

        private NonComposerPageViewAnalyticsHelper nonComposerPageViewAnalyticsHelper() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a provideAnalyticsScreenStorage$scanit_prodGoogleAllVendorsRelease = ScanItModule_Companion_ProvideAnalyticsScreenStorage$scanit_prodGoogleAllVendorsReleaseFactory.provideAnalyticsScreenStorage$scanit_prodGoogleAllVendorsRelease();
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return new NonComposerPageViewAnalyticsHelper(analyticsDataLayer, pluginsManager, provideAnalyticsScreenStorage$scanit_prodGoogleAllVendorsRelease, applicationAnalyticsScreenStorage);
        }

        private ScanItAnalyticsImpl scanItAnalyticsImpl() {
            return new ScanItAnalyticsImpl(nonComposerPageViewAnalyticsHelper());
        }

        @Override // ru.ozon.app.android.scanit.di.ScanItFragmentComponent
        public void inject(ScanItFragment scanItFragment) {
            injectScanItFragment(scanItFragment);
        }

        private ScanItFragmentComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.scanItFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(contextComponentDependencies, networkComponentApi, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    public static ScanItFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
