package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4114he;
import com.ironsource.C4157k4;
import com.ironsource.Fc;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
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

    public o(Context context) {
        this.a = context;
    }

    public void a(String str, InterfaceC4199ma interfaceC4199ma) throws Exception {
        C4114he a2;
        a a3 = a(str);
        C4114he c4114he = new C4114he();
        JSONObject jSONObject = a3.b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                c4114he.b("adViewId", optString);
            }
        }
        try {
            String str2 = a3.a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(d)) {
                        this.b.a(this.a);
                        a2 = this.b.a();
                        c4114he = a2;
                        interfaceC4199ma.a(true, a3.c, c4114he);
                        return;
                    }
                    throw new IllegalArgumentException(a3.a + " | unsupported OMID API");
                case -984459207:
                    if (str2.equals(h)) {
                        a2 = this.b.a();
                        c4114he = a2;
                        interfaceC4199ma.a(true, a3.c, c4114he);
                        return;
                    }
                    throw new IllegalArgumentException(a3.a + " | unsupported OMID API");
                case 70701699:
                    if (str2.equals(f)) {
                        this.b.b(a3.b);
                        interfaceC4199ma.a(true, a3.c, c4114he);
                        return;
                    }
                    throw new IllegalArgumentException(a3.a + " | unsupported OMID API");
                case 1208109646:
                    if (str2.equals(g)) {
                        this.b.c(a3.b);
                        interfaceC4199ma.a(true, a3.c, c4114he);
                        return;
                    }
                    throw new IllegalArgumentException(a3.a + " | unsupported OMID API");
                case 1850541012:
                    if (str2.equals(e)) {
                        this.b.d(a3.b);
                        interfaceC4199ma.a(true, a3.c, c4114he);
                        return;
                    }
                    throw new IllegalArgumentException(a3.a + " | unsupported OMID API");
                default:
                    throw new IllegalArgumentException(a3.a + " | unsupported OMID API");
            }
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            c4114he.b("errMsg", e2.getMessage());
            Logger.i(c, "OMIDJSAdapter " + a3.a + " Exception: " + e2.getMessage());
            interfaceC4199ma.a(false, a3.d, c4114he);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
