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
import com.safedk.android.internal.partials.NetworkBridge;
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
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: UnityCoreSourceFile */
/* loaded from: classes9.dex */
public class UnityCoreNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            String url = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.m);
            Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
            InputStream inputStream = null;
            try {
                inputStream = targetInstance.getInputStream();
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
            }
            InputStream a = CreativeInfoManager.a(h.m, url, inputStream, headerFields);
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
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            OutputStream outputStream = targetInstance.getOutputStream();
            String url = targetInstance.getURL().toString();
            Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", url, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.m);
            return CreativeInfoManager.a(h.m, url, outputStream);
        }
        return targetInstance.getOutputStream();
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String str;
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        if (targetInstance != null && targetInstance.getURL() != null) {
            str = targetInstance.getURL().toString();
        } else {
            str = null;
        }
        Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.m, ", response code= ", Integer.valueOf(responseCode), ", url= ", str);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.m, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
            CreativeInfoManager.onResourceLoaded(h.m, null, str);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.m);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
            } else {
                NetworkBridge.logWebviewLoadURLRequest(h.m, targetInstance, url);
                AdNetworkDiscovery j = CreativeInfoManager.j(h.m);
                if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                    CreativeInfoManager.a(url, (String) null, targetInstance, h.m);
                }
                SafeDKWebAppInterface.a(h.m, targetInstance, url, true);
            }
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.m);
            CreativeInfoManager.a(baseUrl, data, targetInstance, h.m);
            SafeDKWebAppInterface.a(h.m, targetInstance, data, true);
        }
        AdNetworkDiscovery j = CreativeInfoManager.j(h.m);
        if (j != null) {
            data = j.a(targetInstance, baseUrl, data);
        }
        targetInstance.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
    }

    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.m, " object is: ", object, " and name: ", name);
        AdNetworkDiscovery j = CreativeInfoManager.j(h.m);
        if (j != null) {
            j.a(targetInstance, object);
        } else {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.m, ", add to pending list");
            d.b(targetInstance, object);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static void okhttp3CallEnqueue(Call targetInstance, Callback responseCallback) {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->okhttp3CallEnqueue(Lokhttp3/Call;Lokhttp3/Callback;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Request request = targetInstance.request();
                int identityHashCode = System.identityHashCode(request);
                String url = request.url().getUrl();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(h.m, url);
                } else {
                    requestInfo.a(url);
                }
                NetworkBridge.d.put(Integer.valueOf(identityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitokhttp3Call_enqueue request id:", Integer.valueOf(identityHashCode), ", RequestInfo:", requestInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3.Call enqueue error ", th.getMessage());
            }
        }
        targetInstance.enqueue(responseCallback);
    }

    public static ResponseBody okhttp3Response_body(Response targetInstance) {
        Logger.d("UnityCoreNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/UnityCoreNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
        ResponseBody body = targetInstance.body();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int identityHashCode = System.identityHashCode(targetInstance);
                NetworkBridge.RequestInfo remove = NetworkBridge.d.remove(Integer.valueOf(identityHashCode));
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body response id ", Integer.valueOf(identityHashCode), ", info ", remove, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (remove == null) {
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, skipping response Id:", Integer.valueOf(identityHashCode));
                } else {
                    int identityHashCode2 = System.identityHashCode(body);
                    NetworkBridge.d.put(Integer.valueOf(identityHashCode2), remove);
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, removing response Id:", Integer.valueOf(identityHashCode), ", adding  responseBodyId:", Integer.valueOf(identityHashCode2), ", RequestInfo:", remove);
                }
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body error ", th.getMessage());
            }
        }
        return body;
    }
}
