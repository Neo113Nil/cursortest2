package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C2477ie;
import com.ironsource.C2556n4;
import com.ironsource.E1;
import com.ironsource.InterfaceC2544ma;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
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

    private static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }
    }

    public q(Context context) {
        this.a = context;
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

    public void b(JSONObject jSONObject, a aVar, InterfaceC2544ma interfaceC2544ma) {
        C2477ie c2477ie = new C2477ie();
        try {
            String string = jSONObject.getString(f);
            c2477ie.b(f, string);
            if (E1.d(this.a, string)) {
                c2477ie.b("status", String.valueOf(E1.c(this.a, string)));
                interfaceC2544ma.a(true, aVar.c, c2477ie);
            } else {
                c2477ie.b("status", l);
                interfaceC2544ma.a(false, aVar.d, c2477ie);
            }
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            c2477ie.b("errMsg", e2.getMessage());
            interfaceC2544ma.a(false, aVar.d, c2477ie);
        }
    }

    void a(String str, InterfaceC2544ma interfaceC2544ma) throws Exception {
        a a2 = a(str);
        if (c.equals(a2.a)) {
            a(a2.b, a2, interfaceC2544ma);
        } else if (d.equals(a2.a)) {
            b(a2.b, a2, interfaceC2544ma);
        } else {
            Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
        }
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC2544ma interfaceC2544ma) {
        C2477ie c2477ie = new C2477ie();
        try {
            c2477ie.a("permissions", E1.a(this.a, jSONObject.getJSONArray("permissions")));
            interfaceC2544ma.a(true, aVar.c, c2477ie);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c2477ie.b("errMsg", e2.getMessage());
            interfaceC2544ma.a(false, aVar.d, c2477ie);
        }
    }
}
