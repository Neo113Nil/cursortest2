package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import defpackage.bf3;
import defpackage.lnb;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    private static f a = new f();

    private f() {
    }

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String o = TextUtils.isEmpty(str2) ? lnb.o("javascript:window.WindVane.fireEvent('", str, "', '');") : bf3.k("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(o);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void b(Object obj, String str) {
        String k;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                k = lnb.o("javascript:window.WindVane.onSuccess(", aVar.g, ",'');");
            } else {
                k = bf3.k("javascript:window.WindVane.onSuccess(", aVar.g, ",'", i.a(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(k);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static f a() {
        return a;
    }

    public void a(WebView webView, String str, String str2) {
        String k;
        if (TextUtils.isEmpty(str2)) {
            k = lnb.o("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            k = bf3.k("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(k);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!TextUtils.isEmpty(str)) {
                str = i.a(str);
            }
            String k = bf3.k("javascript:window.WindVane.onFailure(", aVar.g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(k);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        }
    }
}
