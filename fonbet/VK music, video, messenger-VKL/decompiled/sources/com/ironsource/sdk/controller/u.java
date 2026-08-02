package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4373ie;
import com.ironsource.C4452n4;
import com.ironsource.C4478oc;
import com.ironsource.C4482og;
import com.ironsource.InterfaceC4458na;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;
    private C4478oc a = new C4478oc();
    private C4482og c = new C4482og();

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

    public u(Context context) {
        this.b = context;
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

    public void a(String str, InterfaceC4458na interfaceC4458na) throws Exception {
        a a2 = a(str);
        if (e.equals(a2.a)) {
            a(a2.b, a2, interfaceC4458na);
            return;
        }
        if (f.equals(a2.a)) {
            a(a2, interfaceC4458na);
            return;
        }
        Logger.i(d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4458na interfaceC4458na) {
        C4373ie c4373ie = new C4373ie();
        try {
            this.a.a(jSONObject);
            interfaceC4458na.a(true, aVar.c, c4373ie);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC4458na.a(false, aVar.d, c4373ie);
        }
    }

    private void a(a aVar, InterfaceC4458na interfaceC4458na) {
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
            interfaceC4458na.a(true, aVar.c, a2);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            interfaceC4458na.a(false, aVar.d, e2.getMessage());
        }
    }
}
