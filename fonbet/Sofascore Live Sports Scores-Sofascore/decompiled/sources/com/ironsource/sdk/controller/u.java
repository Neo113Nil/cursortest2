package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4114he;
import com.ironsource.C4157k4;
import com.ironsource.C4187lg;
import com.ironsource.C4219nc;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;
    private C4219nc a = new C4219nc();
    private C4187lg c = new C4187lg();

    public u(Context context) {
        this.b = context;
    }

    private void a(a aVar, InterfaceC4199ma interfaceC4199ma) {
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
            interfaceC4199ma.a(true, aVar.c, a2);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            interfaceC4199ma.a(false, aVar.d, e2.getMessage());
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

    public void a(String str, InterfaceC4199ma interfaceC4199ma) throws Exception {
        a a2 = a(str);
        if (e.equals(a2.a)) {
            a(a2.b, a2, interfaceC4199ma);
            return;
        }
        if (f.equals(a2.a)) {
            a(a2, interfaceC4199ma);
            return;
        }
        Logger.i(d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4199ma interfaceC4199ma) {
        C4114he c4114he = new C4114he();
        try {
            this.a.a(jSONObject);
            interfaceC4199ma.a(true, aVar.c, c4114he);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC4199ma.a(false, aVar.d, c4114he);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.a = jSONObject.optString("functionName");
        aVar.b = jSONObject.optJSONObject("functionParams");
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
