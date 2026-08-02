package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C2477ie;
import com.ironsource.C2478ig;
import com.ironsource.C2556n4;
import com.ironsource.C2564nc;
import com.ironsource.InterfaceC2544ma;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;
    private C2564nc a = new C2564nc();
    private C2478ig c = new C2478ig();

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public u(Context context) {
        this.b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        a aVar = new a();
        aVar.a = jsonObjectInit.optString("functionName");
        aVar.b = jsonObjectInit.optJSONObject("functionParams");
        aVar.c = jsonObjectInit.optString("success");
        aVar.d = jsonObjectInit.optString("fail");
        return aVar;
    }

    void a(String str, InterfaceC2544ma interfaceC2544ma) throws Exception {
        a a2 = a(str);
        if (e.equals(a2.a)) {
            a(a2.b, a2, interfaceC2544ma);
        } else if (f.equals(a2.a)) {
            a(a2, interfaceC2544ma);
        } else {
            Logger.i(d, "unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC2544ma interfaceC2544ma) {
        C2477ie c2477ie = new C2477ie();
        try {
            this.a.a(jSONObject);
            interfaceC2544ma.a(true, aVar.c, c2477ie);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC2544ma.a(false, aVar.d, c2477ie);
        }
    }

    private void a(a aVar, InterfaceC2544ma interfaceC2544ma) {
        try {
            JSONObject a2 = this.c.a();
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = a2.get(next);
                if (obj instanceof String) {
                    a2.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC2544ma.a(true, aVar.c, a2);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            interfaceC2544ma.a(false, aVar.d, e2.getMessage());
        }
    }
}
