package ru.ozon.app.android.miniapp.di;

import Jb.j;
import ru.ozon.app.android.miniapp.MiniAppWebActivity;
import ru.ozon.app.android.miniapp.MiniAppWebActivity_MembersInjector;
import ru.ozon.app.android.miniapp.di.MiniAppWebActivityComponent;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.client.AddBarsOffsetQueryInterceptor;
import ru.ozon.app.android.web.webview.client.OzonWebViewUrlInterceptor;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

/* loaded from: classes12.dex */
public final class DaggerMiniAppWebActivityComponent {

    private static final class Factory implements MiniAppWebActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.miniapp.di.MiniAppWebActivityComponent.Factory
        public MiniAppWebActivityComponent create(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, WebComponentApi webComponentApi) {
            storageComponentApi.getClass();
            networkComponentApi.getClass();
            whitelistComponentApi.getClass();
            webComponentApi.getClass();
            return new MiniAppWebActivityComponentImpl(storageComponentApi, networkComponentApi, whitelistComponentApi, webComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class MiniAppWebActivityComponentImpl implements MiniAppWebActivityComponent {
        private final MiniAppWebActivityComponentImpl miniAppWebActivityComponentImpl;
        private final NetworkComponentApi networkComponentApi;
        private final StorageComponentApi storageComponentApi;
        private final WebComponentApi webComponentApi;
        private final WhitelistComponentApi whitelistComponentApi;

        /* synthetic */ MiniAppWebActivityComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, WebComponentApi webComponentApi, int i11) {
            this(storageComponentApi, networkComponentApi, whitelistComponentApi, webComponentApi);
        }

        private MiniAppWebActivity injectMiniAppWebActivity(MiniAppWebActivity miniAppWebActivity) {
            DomainsInteractor domainsInteractor = this.whitelistComponentApi.getDomainsInteractor();
            j.c(domainsInteractor);
            MiniAppWebActivity_MembersInjector.injectDomainsInteractor(miniAppWebActivity, domainsInteractor);
            AuthTokenDataSource authTokenDataSource = this.storageComponentApi.getAuthTokenDataSource();
            j.c(authTokenDataSource);
            MiniAppWebActivity_MembersInjector.injectAuthTokenDataSource(miniAppWebActivity, authTokenDataSource);
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            MiniAppWebActivity_MembersInjector.injectAppVersionService(miniAppWebActivity, appVersionService);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            MiniAppWebActivity_MembersInjector.injectFeatureChecker(miniAppWebActivity, featureChecker);
            MiniAppWebActivity_MembersInjector.injectOzonWebViewUrlInterceptor(miniAppWebActivity, ozonWebViewUrlInterceptor());
            WebViewErrorLogger webViewErrorLogger = this.networkComponentApi.getWebViewErrorLogger();
            j.c(webViewErrorLogger);
            MiniAppWebActivity_MembersInjector.injectWebViewErrorLogger(miniAppWebActivity, webViewErrorLogger);
            return miniAppWebActivity;
        }

        private OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor() {
            DomainsInteractor domainsInteractor = this.whitelistComponentApi.getDomainsInteractor();
            j.c(domainsInteractor);
            NetworkHeadersProvider networkHeadersProvider = this.networkComponentApi.getNetworkHeadersProvider();
            j.c(networkHeadersProvider);
            AddBarsOffsetQueryInterceptor addBarsOffsetQueryInterceptor = this.webComponentApi.getAddBarsOffsetQueryInterceptor();
            j.c(addBarsOffsetQueryInterceptor);
            return new OzonWebViewUrlInterceptor(domainsInteractor, networkHeadersProvider, addBarsOffsetQueryInterceptor);
        }

        @Override // ru.ozon.app.android.miniapp.di.MiniAppWebActivityComponent
        public WebViewRendererProcessCrashHandler getWebViewRendererProcessCrashHandler() {
            WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler = this.webComponentApi.getWebViewRendererProcessCrashHandler();
            j.c(webViewRendererProcessCrashHandler);
            return webViewRendererProcessCrashHandler;
        }

        @Override // ru.ozon.app.android.miniapp.di.MiniAppWebActivityComponent
        public void inject(MiniAppWebActivity miniAppWebActivity) {
            injectMiniAppWebActivity(miniAppWebActivity);
        }

        private MiniAppWebActivityComponentImpl(StorageComponentApi storageComponentApi, NetworkComponentApi networkComponentApi, WhitelistComponentApi whitelistComponentApi, WebComponentApi webComponentApi) {
            this.miniAppWebActivityComponentImpl = this;
            this.whitelistComponentApi = whitelistComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.webComponentApi = webComponentApi;
        }
    }

    public static MiniAppWebActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
