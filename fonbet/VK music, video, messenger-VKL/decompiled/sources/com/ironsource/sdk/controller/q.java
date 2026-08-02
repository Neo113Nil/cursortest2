package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4373ie;
import com.ironsource.C4452n4;
import com.ironsource.E1;
import com.ironsource.InterfaceC4458na;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class q {
    private static final String b = "q";
    private static final String c = "getPermissions";
    private static final String d = "isPermissionGranted";
    private static final String e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";
    private static final String h = "functionName";
    private static final String i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";
    private static final String l = "unhandledPermission";
    private Context a;

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

    public q(Context context) {
        this.a = context;
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

    public void b(JSONObject jSONObject, a aVar, InterfaceC4458na interfaceC4458na) {
        C4373ie c4373ie = new C4373ie();
        try {
            String string = jSONObject.getString(f);
            c4373ie.b(f, string);
            if (E1.d(this.a, string)) {
                c4373ie.b("status", String.valueOf(E1.c(this.a, string)));
                interfaceC4458na.a(true, aVar.c, c4373ie);
            } else {
                c4373ie.b("status", l);
                interfaceC4458na.a(false, aVar.d, c4373ie);
            }
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            c4373ie.b("errMsg", e2.getMessage());
            interfaceC4458na.a(false, aVar.d, c4373ie);
        }
    }

    public void a(String str, InterfaceC4458na interfaceC4458na) throws Exception {
        a a2 = a(str);
        if (c.equals(a2.a)) {
            a(a2.b, a2, interfaceC4458na);
            return;
        }
        if (d.equals(a2.a)) {
            b(a2.b, a2, interfaceC4458na);
            return;
        }
        Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4458na interfaceC4458na) {
        C4373ie c4373ie = new C4373ie();
        try {
            c4373ie.a("permissions", E1.a(this.a, jSONObject.getJSONArray("permissions")));
            interfaceC4458na.a(true, aVar.c, c4373ie);
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c4373ie.b("errMsg", e2.getMessage());
            interfaceC4458na.a(false, aVar.d, c4373ie);
        }
    }
}
