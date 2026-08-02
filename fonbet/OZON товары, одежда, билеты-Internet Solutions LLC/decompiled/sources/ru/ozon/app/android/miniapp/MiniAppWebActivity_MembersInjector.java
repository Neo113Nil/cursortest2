package ru.ozon.app.android.miniapp;

import Ib.b;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.web.webview.client.OzonWebViewUrlInterceptor;

/* loaded from: classes12.dex */
public final class MiniAppWebActivity_MembersInjector implements b<MiniAppWebActivity> {
    public static void injectAppVersionService(MiniAppWebActivity miniAppWebActivity, AppVersionService appVersionService) {
        miniAppWebActivity.appVersionService = appVersionService;
    }

    public static void injectAuthTokenDataSource(MiniAppWebActivity miniAppWebActivity, AuthTokenDataSource authTokenDataSource) {
        miniAppWebActivity.authTokenDataSource = authTokenDataSource;
    }

    public static void injectDomainsInteractor(MiniAppWebActivity miniAppWebActivity, DomainsInteractor domainsInteractor) {
        miniAppWebActivity.domainsInteractor = domainsInteractor;
    }

    public static void injectFeatureChecker(MiniAppWebActivity miniAppWebActivity, FeatureChecker featureChecker) {
        miniAppWebActivity.featureChecker = featureChecker;
    }

    public static void injectOzonWebViewUrlInterceptor(MiniAppWebActivity miniAppWebActivity, OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor) {
        miniAppWebActivity.ozonWebViewUrlInterceptor = ozonWebViewUrlInterceptor;
    }

    public static void injectWebViewErrorLogger(MiniAppWebActivity miniAppWebActivity, WebViewErrorLogger webViewErrorLogger) {
        miniAppWebActivity.webViewErrorLogger = webViewErrorLogger;
    }
}
