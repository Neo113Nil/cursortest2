package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends WebViewClient {
    public static final String[] c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a a;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a b;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static boolean a(String str) {
        s sVar;
        if (str == null || (sVar = IAConfigManager.N.t) == null) {
            return false;
        }
        o oVar = sVar.b;
        String[] strArr = c;
        String a = oVar.a("font_urls", (String) null);
        if (a != null) {
            try {
                JSONArray jSONArray = new JSONArray(a);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr2[i] = jSONArray.getString(i);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        int i;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        str = "";
        if (webResourceError != null) {
            str = webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "";
            i = webResourceError.getErrorCode();
        } else {
            i = -999;
        }
        String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "unknown" : webResourceRequest.getUrl().toString();
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, Integer.valueOf(i), uri);
        if (a(uri)) {
            return;
        }
        String str2 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(uri)) {
            uri = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str2, uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", str);
        Uri parse = Uri.parse(str);
        if (parse == null || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority()) || TextUtils.isEmpty(parse.getHost()) || !"FyRemote://".toLowerCase().contains(parse.getScheme())) {
            return true;
        }
        HashMap a = h0.a(parse);
        String host = parse.getHost();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.a;
        if (aVar == null) {
            return true;
        }
        aVar.a(host, a);
        return true;
    }

    public final void a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String valueOf = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
        IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", valueOf, str);
        String str2 = "Webview did crash: " + valueOf + " on webview: " + str;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str2, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, Integer.valueOf(i), str2);
        if (a(str2)) {
            return;
        }
        String str3 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(str2)) {
            str2 = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, str2);
        }
    }
}
