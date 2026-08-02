package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* compiled from: MolocoAdsSourceFile */
/* loaded from: classes9.dex */
public class MolocoAdsNetworkBridge {
    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("MolocoAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MolocoAdsNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.D);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            } else {
                NetworkBridge.logWebviewLoadURLRequest(h.D, targetInstance, url);
                AdNetworkDiscovery j = CreativeInfoManager.j(h.D);
                if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                    CreativeInfoManager.a(url, (String) null, targetInstance, h.D);
                }
                SafeDKWebAppInterface.a(h.D, targetInstance, url, true);
            }
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("MolocoAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MolocoAdsNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.D);
            CreativeInfoManager.a(baseUrl, data, targetInstance, h.D);
            SafeDKWebAppInterface.a(h.D, targetInstance, data, true);
        }
        AdNetworkDiscovery j = CreativeInfoManager.j(h.D);
        if (j != null) {
            data = j.a(targetInstance, baseUrl, data);
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("MolocoAdsNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/MolocoAdsNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.D, " object is: ", object, " and name: ", name);
        AdNetworkDiscovery j = CreativeInfoManager.j(h.D);
        if (j != null) {
            j.a(targetInstance, object);
        } else {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.D, ", add to pending list");
            d.b(targetInstance, object);
        }
        targetInstance.addJavascriptInterface(object, name);
    }
}
