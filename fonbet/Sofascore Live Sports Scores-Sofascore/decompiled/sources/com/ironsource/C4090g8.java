package com.ironsource;

import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.dmi;
import defpackage.lnb;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4090g8 {
    private InterfaceC4054e8 a;
    private WebView c;
    private String d;
    private String e = "g8";
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {C4018c8.h, C4018c8.i, C4018c8.g, "handleGetViewVisibility", C4018c8.j};
    private Cg b = new Cg();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g8$a */
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
                if (!C4090g8.this.b(this.a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.a;
                    C4090g8.this.e;
                    C4090g8.this.a(this.b, str);
                    return;
                }
                if (this.a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C4090g8.this.e(this.c);
                    return;
                }
                if (!this.a.equalsIgnoreCase(C4018c8.j) && !this.a.equalsIgnoreCase(C4018c8.i)) {
                    return;
                }
                C4090g8.this.a(this.d.getString("params"), this.c, this.b);
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.a;
                C4090g8.this.e;
                C4090g8.this.a(this.b, str2);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g8$b */
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
                C4090g8.this.c.evaluateJavascript(this.a, null);
            } catch (Throwable th) {
                C4157k4.d().a(th);
                C4090g8.this.e;
            }
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

    private void d() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C4018c8.a, a());
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
        return str.equalsIgnoreCase(C4018c8.k);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            this.a.a(str3, dmi.q("No external adUnit attached to ISNAdView while trying to send message: ", str), this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C4157k4.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !h(optString)) {
                a(jSONObject.optString(C4018c8.v, C4018c8.c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void e() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(C4018c8.b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(String str) {
        this.d = str;
    }

    private void d(String str) {
        O7.a.d(new b(lnb.o("javascript:try{", str, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), str));
    }

    public void e(String str) throws JSONException {
        JSONObject a2 = this.b.a();
        a2.put("adViewId", this.d);
        a(str, a2);
    }

    public void b() {
        this.a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public void a(WebView webView) {
        this.c = webView;
    }

    public void a(InterfaceC4054e8 interfaceC4054e8) {
        this.a = interfaceC4054e8;
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC4054e8 interfaceC4054e8 = this.a;
        if (interfaceC4054e8 != null) {
            interfaceC4054e8.a(str, jSONObject);
        }
    }

    public void a(String str, String str2) {
        InterfaceC4054e8 interfaceC4054e8 = this.a;
        if (interfaceC4054e8 != null) {
            interfaceC4054e8.a(str, str2, this.d);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.a == null) {
            C4322t8.a(C4096ge.t, new C4233o8().a(C4427z5.y, "mDelegate is null").a());
        } else {
            O7.a.d(new a(str, str3, str2, jSONObject));
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
            jSONObject2.put(C4018c8.s, this.b.a());
            jSONObject.put(C4018c8.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    private String a(String str) {
        return String.format(C4018c8.u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
            return jSONObject2;
        } catch (Exception e) {
            C4157k4.d().a(e);
            Objects.toString(jSONObject);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject2;
        }
    }
}
