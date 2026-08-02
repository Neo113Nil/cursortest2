package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* compiled from: AdMobSourceFile */
/* loaded from: classes9.dex */
public class AdMobNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            String url = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.h);
            Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
            InputStream inputStream = null;
            try {
                inputStream = targetInstance.getInputStream();
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
            }
            InputStream a = CreativeInfoManager.a(h.h, url, inputStream, headerFields);
            if ((targetInstance instanceof HttpURLConnection) && (a instanceof f)) {
                Logger.d("SafeDKNetwork", "following HttpURLConnection:", targetInstance, " and stream: ", a);
                f fVar = (f) a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) targetInstance;
                NetworkBridge.b.put(httpURLConnection, fVar);
                fVar.a(httpURLConnection);
            }
            return a;
        }
        return targetInstance.getInputStream();
    }

    public static OutputStream urlConnectionGetOutputStream(URLConnection targetInstance) throws IOException {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            OutputStream outputStream = targetInstance.getOutputStream();
            String url = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.h);
            return CreativeInfoManager.a(h.h, url, outputStream);
        }
        return targetInstance.getOutputStream();
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String str;
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        if (targetInstance != null && targetInstance.getURL() != null) {
            str = targetInstance.getURL().toString();
        } else {
            str = null;
        }
        Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.h, ", response code= ", Integer.valueOf(responseCode), ", url= ", str);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.h, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
            CreativeInfoManager.onResourceLoaded(h.h, null, str);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Logger.d("SafeDKNetwork", "httpUrlConnectionDisconnect", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                f remove = NetworkBridge.b.remove(targetInstance);
                if (remove != null) {
                    remove.a();
                }
            } catch (Throwable th) {
            }
        }
        targetInstance.disconnect();
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.h);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            } else {
                NetworkBridge.logWebviewLoadURLRequest(h.h, targetInstance, url);
                AdNetworkDiscovery j = CreativeInfoManager.j(h.h);
                if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                    CreativeInfoManager.a(url, (String) null, targetInstance, h.h);
                }
                SafeDKWebAppInterface.a(h.h, targetInstance, url, true);
            }
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.h);
            CreativeInfoManager.a(baseUrl, data, targetInstance, h.h);
            SafeDKWebAppInterface.a(h.h, targetInstance, data, true);
        }
        AdNetworkDiscovery j = CreativeInfoManager.j(h.h);
        if (j != null) {
            data = j.a(targetInstance, baseUrl, data);
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }

    public static void webviewLoadData(WebView targetInstance, String data, String mimeType, String encoding) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", targetInstance, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", h.h);
        if (z) {
            CreativeInfoManager.a((String) null, data, targetInstance, h.h);
            SafeDKWebAppInterface.a(h.h, targetInstance, data, true);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/AdMobNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.h, " object is: ", object, " and name: ", name);
        AdNetworkDiscovery j = CreativeInfoManager.j(h.h);
        if (j != null) {
            j.a(targetInstance, object);
        } else {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.h, ", add to pending list");
            d.b(targetInstance, object);
        }
        targetInstance.addJavascriptInterface(object, name);
    }
}
