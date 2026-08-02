package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C2477ie;
import com.ironsource.C2556n4;
import com.ironsource.Fc;
import com.ironsource.InterfaceC2544ma;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class o {
    private static final String c = "o";
    private static final String d = "activate";
    private static final String e = "startSession";
    private static final String f = "finishSession";
    private static final String g = "impressionOccurred";
    private static final String h = "getOmidData";
    private static final String i = "omidFunction";
    private static final String j = "omidParams";
    private static final String k = "success";
    private static final String l = "fail";
    private static final String m = "%s | unsupported OMID API";
    private final Context a;
    private final Fc b = new Fc();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public o(Context context) {
        this.a = context;
    }

    void a(String str, InterfaceC2544ma interfaceC2544ma) throws Exception {
        char c2;
        a a2 = a(str);
        C2477ie c2477ie = new C2477ie();
        JSONObject jSONObject = a2.b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                c2477ie.b("adViewId", optString);
            }
        }
        try {
            String str2 = a2.a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(d)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -984459207:
                    if (str2.equals(h)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70701699:
                    if (str2.equals(f)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1208109646:
                    if (str2.equals(g)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1850541012:
                    if (str2.equals(e)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                this.b.a(this.a);
                c2477ie = this.b.a();
            } else if (c2 == 1) {
                this.b.d(a2.b);
            } else if (c2 == 2) {
                this.b.b(a2.b);
            } else if (c2 == 3) {
                this.b.c(a2.b);
            } else {
                if (c2 != 4) {
                    throw new IllegalArgumentException(String.format(m, a2.a));
                }
                c2477ie = this.b.a();
            }
            interfaceC2544ma.a(true, a2.c, c2477ie);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            c2477ie.b("errMsg", e2.getMessage());
            Logger.i(c, "OMIDJSAdapter " + a2.a + " Exception: " + e2.getMessage());
            interfaceC2544ma.a(false, a2.d, c2477ie);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.a = jsonObjectInit.optString(i);
        aVar.b = jsonObjectInit.optJSONObject(j);
        aVar.c = jsonObjectInit.optString("success");
        aVar.d = jsonObjectInit.optString("fail");
        return aVar;
    }
}
