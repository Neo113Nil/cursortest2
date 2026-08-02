package ru.ozon.app.android.web;

import Ib.b;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;

/* loaded from: classes2.dex */
public final class WebFragment_MembersInjector implements b<WebFragment> {
    public static void injectAiWebFragmentUiDelegate(WebFragment webFragment, WebFragmentUiDelegate webFragmentUiDelegate) {
        webFragment.aiWebFragmentUiDelegate = webFragmentUiDelegate;
    }

    public static void injectFeatureChecker(WebFragment webFragment, FeatureChecker featureChecker) {
        webFragment.featureChecker = featureChecker;
    }

    public static void injectWebFragmentViewModelProvider(WebFragment webFragment, Pc.a<WebFragmentViewModelImpl> aVar) {
        webFragment.webFragmentViewModelProvider = aVar;
    }

    public static void injectWebViewCacheManager(WebFragment webFragment, WebViewResourcesManager webViewResourcesManager) {
        webFragment.webViewCacheManager = webViewResourcesManager;
    }

    public static void injectWebViewRouter(WebFragment webFragment, WebViewRouter webViewRouter) {
        webFragment.webViewRouter = webViewRouter;
    }
}
