package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C2477ie;
import com.ironsource.C2524l8;
import com.ironsource.C2556n4;
import com.ironsource.Dg;
import com.ironsource.InterfaceC2435g8;
import com.ironsource.InterfaceC2544ma;
import com.ironsource.ah;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class a implements InterfaceC2435g8 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";
    private ah a;
    private C2524l8 b = C2524l8.a();
    private Context c;

    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    private static class C0218a {
        String a;
        JSONObject b;
        String c;
        String d;

        private C0218a() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    public void a(ah ahVar) {
        this.a = ahVar;
    }

    @Override // com.ironsource.InterfaceC2435g8
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC2435g8
    public void a(String str, String str2, String str3) {
        a(str, Dg.a(str2, str3));
    }

    void a(String str, InterfaceC2544ma interfaceC2544ma) throws Exception {
        a aVar;
        char c;
        C0218a a = a(str);
        C2477ie c2477ie = new C2477ie();
        try {
            String str2 = a.a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                aVar = this;
                try {
                    this.b.a(aVar, a.b, this.c, a.c, a.d);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    C2556n4.d().a(e);
                    c2477ie.b("errMsg", e.getMessage());
                    String c2 = aVar.b.c(a.b);
                    if (!TextUtils.isEmpty(c2)) {
                        c2477ie.b("adViewId", c2);
                    }
                    interfaceC2544ma.a(false, a.d, c2477ie);
                    return;
                }
            }
            if (c == 1) {
                this.b.d(a.b, a.c, a.d);
                return;
            }
            if (c == 2) {
                this.b.c(a.b, a.c, a.d);
            } else if (c == 3) {
                this.b.a(a.b, a.c, a.d);
            } else {
                if (c != 4) {
                    throw new IllegalArgumentException(String.format(n, a.a));
                }
                this.b.b(a.b, a.c, a.d);
            }
        } catch (Exception e3) {
            e = e3;
            aVar = this;
        }
    }

    private C0218a a(String str) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        C0218a c0218a = new C0218a();
        c0218a.a = jsonObjectInit.optString("functionName");
        c0218a.b = jsonObjectInit.optJSONObject("functionParams");
        c0218a.c = jsonObjectInit.optString("success");
        c0218a.d = jsonObjectInit.optString("fail");
        return c0218a;
    }
}
