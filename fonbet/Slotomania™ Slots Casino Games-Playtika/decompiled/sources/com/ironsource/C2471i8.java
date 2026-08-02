package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2471i8 {
    private InterfaceC2435g8 a;
    private WebView c;
    private String d;
    private String e = "i8";
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {C2399e8.h, C2399e8.i, C2399e8.g, "handleGetViewVisibility", C2399e8.j};
    private C2783zg b = new C2783zg();

    /* renamed from: com.ironsource.i8$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ JSONObject d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C2471i8.this.b(this.a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.a;
                    Log.e(C2471i8.this.e, str);
                    C2471i8.this.a(this.b, str);
                } else if (this.a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C2471i8.this.e(this.c);
                } else if (this.a.equalsIgnoreCase(C2399e8.j) || this.a.equalsIgnoreCase(C2399e8.i)) {
                    C2471i8.this.a(this.d.getString("params"), this.c, this.b);
                }
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.a;
                Log.e(C2471i8.this.e, str2);
                C2471i8.this.a(this.b, str2);
            }
        }
    }

    /* renamed from: com.ironsource.i8$b */
    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                IronSourceNetworkBridge.webViewEvaluateJavaScript(C2471i8.this.c, this.a, null);
            } catch (Throwable th) {
                C2556n4.d().a(th);
                Log.e(C2471i8.this.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C2399e8.a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
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

    public void e() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C2399e8.b, a());
    }

    public void f(String str) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit.put("adViewId", this.d);
            a(str, jsonObjectInit);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(String str) {
        this.d = str;
    }

    public void a(InterfaceC2435g8 interfaceC2435g8) {
        this.a = interfaceC2435g8;
    }

    public void c(String str) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            String optString = jsonObjectInit.optString("method");
            if (TextUtils.isEmpty(optString) || !h(optString)) {
                a(jsonObjectInit.optString(C2399e8.v, C2399e8.c), jsonObjectInit);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jsonObjectInit, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C2556n4.d().a(e);
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

    public void a(String str, JSONObject jSONObject) {
        InterfaceC2435g8 interfaceC2435g8 = this.a;
        if (interfaceC2435g8 != null) {
            interfaceC2435g8.a(str, jSONObject);
        }
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C2399e8.k);
    }

    public void a(String str, String str2) {
        InterfaceC2435g8 interfaceC2435g8 = this.a;
        if (interfaceC2435g8 != null) {
            interfaceC2435g8.a(str, str2, this.d);
        }
    }

    public void e(String str) throws JSONException {
        JSONObject a2 = this.b.a();
        a2.put("adViewId", this.d);
        a(str, a2);
    }

    void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.a == null) {
            C2703v8.a(C2459he.t, new C2614q8().a(B5.y, "mDelegate is null").a());
        } else {
            Q7.a.d(new a(str, str3, str2, jSONObject));
        }
    }

    private void d(String str) {
        Q7.a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void a(String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit2.put(C2399e8.s, this.b.a());
            jsonObjectInit.put(C2399e8.p, jsonObjectInit2);
            jsonObjectInit.put("adViewId", c());
            return jsonObjectInit;
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.e, str4);
            this.a.a(str3, str4, this.d);
            return;
        }
        try {
            IronSourceNetworkBridge.jsonObjectInit(str);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put("adViewId", this.d);
        a(str2, jsonObjectInit);
    }

    private String a(String str) {
        return String.format(C2399e8.u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("id", jSONObject.getString("id"));
            jsonObjectInit.put("data", this.b.a());
            return jsonObjectInit;
        } catch (Exception e) {
            C2556n4.d().a(e);
            Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e.toString());
            return jsonObjectInit;
        }
    }
}
