package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.go9;
import xsna.zr;

/* renamed from: com.ironsource.j8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4384j8 {
    private InterfaceC4349h8 a;
    private WebView c;
    private String d;
    private String e = "j8";
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {C4313f8.h, C4313f8.i, C4313f8.g, "handleGetViewVisibility", C4313f8.j};
    private Fg b = new Fg();

    /* renamed from: com.ironsource.j8$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ JSONObject d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C4384j8.this.b(this.a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.a;
                    Log.e(C4384j8.this.e, str);
                    C4384j8.this.a(this.b, str);
                    return;
                }
                if (this.a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C4384j8.this.e(this.c);
                    return;
                }
                if (!this.a.equalsIgnoreCase(C4313f8.j) && !this.a.equalsIgnoreCase(C4313f8.i)) {
                    return;
                }
                C4384j8.this.a(this.d.getString("params"), this.c, this.b);
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.a;
                Log.e(C4384j8.this.e, str2);
                C4384j8.this.a(this.b, str2);
            }
        }
    }

    /* renamed from: com.ironsource.j8$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4384j8.this.c.evaluateJavascript(this.a, null);
            } catch (Throwable th) {
                C4452n4.d().a(th);
                Log.e(C4384j8.this.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C4313f8.a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C4313f8.k);
    }

    public void e() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C4313f8.b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(String str) {
        this.d = str;
    }

    public void a(WebView webView) {
        this.c = webView;
    }

    public void b() {
        this.a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public void a(InterfaceC4349h8 interfaceC4349h8) {
        this.a = interfaceC4349h8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (!TextUtils.isEmpty(optString) && h(optString)) {
                if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                    a(jSONObject, (String) null, (String) null);
                    return;
                }
                return;
            }
            a(jSONObject.optString(C4313f8.v, C4313f8.c), jSONObject);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            Log.e(this.e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d(String str) {
        R7.a.d(new b(zr.a("javascript:try{", str, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), str));
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC4349h8 interfaceC4349h8 = this.a;
        if (interfaceC4349h8 != null) {
            interfaceC4349h8.a(str, jSONObject);
        }
    }

    public void e(String str) throws JSONException {
        JSONObject a2 = this.b.a();
        a2.put("adViewId", this.d);
        a(str, a2);
    }

    public void a(String str, String str2) {
        InterfaceC4349h8 interfaceC4349h8 = this.a;
        if (interfaceC4349h8 != null) {
            interfaceC4349h8.a(str, str2, this.d);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.a == null) {
            C4617w8.a(C4355he.t, new C4527r8().a(B5.y, "mDelegate is null").a());
        } else {
            R7.a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C4313f8.s, this.b.a());
            jSONObject.put(C4313f8.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            String b2 = go9.b("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.e, b2);
            this.a.a(str3, b2, this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    private String a(String str) {
        return String.format(C4313f8.u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
            return jSONObject2;
        } catch (Exception e) {
            C4452n4.d().a(e);
            Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject2;
        }
    }
}
