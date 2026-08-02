package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4373ie;
import com.ironsource.C4452n4;
import com.ironsource.Gc;
import com.ironsource.InterfaceC4458na;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
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
    private final Gc b = new Gc();

    public static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    public o(Context context) {
        this.a = context;
    }

    public void a(String str, InterfaceC4458na interfaceC4458na) throws Exception {
        char c2;
        a a2 = a(str);
        C4373ie c4373ie = new C4373ie();
        JSONObject jSONObject = a2.b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                c4373ie.b("adViewId", optString);
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
                c4373ie = this.b.a();
            } else if (c2 == 1) {
                this.b.d(a2.b);
            } else if (c2 == 2) {
                this.b.b(a2.b);
            } else if (c2 == 3) {
                this.b.c(a2.b);
            } else {
                if (c2 != 4) {
                    throw new IllegalArgumentException(a2.a + " | unsupported OMID API");
                }
                c4373ie = this.b.a();
            }
            interfaceC4458na.a(true, a2.c, c4373ie);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            c4373ie.b("errMsg", e2.getMessage());
            Logger.i(c, "OMIDJSAdapter " + a2.a + " Exception: " + e2.getMessage());
            interfaceC4458na.a(false, a2.d, c4373ie);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.a = jSONObject.optString(i);
        aVar.b = jSONObject.optJSONObject(j);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
