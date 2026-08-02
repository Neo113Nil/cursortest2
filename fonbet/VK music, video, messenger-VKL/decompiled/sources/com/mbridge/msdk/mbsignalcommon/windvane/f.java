package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.adapters.vungle.VungleConstants;
import org.json.JSONObject;
import xsna.ss9;
import xsna.zr;

/* compiled from: WindVaneCallJs.java */
/* loaded from: classes13.dex */
public class f {
    private static f a = new f();

    private f() {
    }

    public static f a() {
        return a;
    }

    public void b(Object obj, String str) {
        String a2;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                a2 = zr.a("javascript:window.WindVane.onSuccess(", aVar.g, ",'');");
            } else {
                a2 = ss9.a("javascript:window.WindVane.onSuccess(", aVar.g, ",'", i.a(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(a2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String a2 = TextUtils.isEmpty(str2) ? zr.a("javascript:window.WindVane.fireEvent('", str, "', '');") : ss9.a("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(a2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(WebView webView, String str, String str2) {
        String a2;
        if (TextUtils.isEmpty(str2)) {
            a2 = zr.a("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            a2 = ss9.a("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(a2);
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
            if (TextUtils.isEmpty(str)) {
                String str2 = aVar.g;
            } else {
                str = i.a(str);
            }
            String a2 = ss9.a("javascript:window.WindVane.onFailure(", aVar.g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(a2);
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
            jSONObject.put("api_version", VungleConstants.META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION);
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        }
    }
}
