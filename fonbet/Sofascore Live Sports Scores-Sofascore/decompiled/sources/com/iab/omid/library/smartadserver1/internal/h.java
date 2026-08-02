package com.iab.omid.library.smartadserver1.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.iab.omid.library.smartadserver1.adsession.ErrorType;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h {
    private static h a = new h();

    public class a implements Runnable {
        final /* synthetic */ WebView a;
        final /* synthetic */ String b;

        public a(WebView webView, String str) {
            this.a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c(this.a, this.b);
        }
    }

    private h() {
    }

    public void a(StringBuilder sb, Object[] objArr) {
        String obj;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj2 : objArr) {
            if (obj2 == null) {
                obj = "null";
            } else {
                if (obj2 instanceof String) {
                    obj = obj2.toString();
                    if (!obj.startsWith("{")) {
                        sb.append('\"');
                        sb.append(obj);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj2);
                }
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
            sb.append(obj);
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        }
        sb.setLength(sb.length() - 1);
    }

    public void b(WebView webView, String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public boolean c(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    webView.loadUrl("javascript: " + str);
                    return true;
                }
            } catch (Exception e) {
                com.iab.omid.library.smartadserver1.utils.d.d("Unable to inject javascript: " + e.getMessage());
            }
        }
        return false;
    }

    public void d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void b(WebView webView, String str, String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void b(WebView webView, @NonNull JSONObject jSONObject) {
        a(webView, "setSupportedAttestations", jSONObject);
    }

    public void c(WebView webView, String str, String str2) {
        a(webView, "setState", str2, str);
    }

    public void a(WebView webView, String str) {
        a(webView, "finishSession", str);
    }

    public void a(WebView webView, String str, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public void a(WebView webView, String str, ErrorType errorType, String str2) {
        a(webView, "error", errorType.toString(), str2, str);
    }

    public void a(WebView webView, String str, String str2) {
        a(webView, "setDeviceLockState", str2);
    }

    public void a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "init", jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.smartadserver1.utils.d.c("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    public void a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            c(webView, sb2);
        } else {
            handler.post(new a(webView, sb2));
        }
    }

    public void a(WebView webView, @NonNull JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    public static final h a() {
        return a;
    }
}
