package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1;
import com.ironsource.C4114he;
import com.ironsource.C4157k4;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
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

    public q(Context context) {
        this.a = context;
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4199ma interfaceC4199ma) {
        C4114he c4114he = new C4114he();
        try {
            c4114he.a(e, C1.a(this.a, jSONObject.getJSONArray(e)));
            interfaceC4199ma.a(true, aVar.c, c4114he);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c4114he.b("errMsg", e2.getMessage());
            interfaceC4199ma.a(false, aVar.d, c4114he);
        }
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC4199ma interfaceC4199ma) {
        C4114he c4114he = new C4114he();
        try {
            String string = jSONObject.getString(f);
            c4114he.b(f, string);
            if (C1.d(this.a, string)) {
                c4114he.b("status", String.valueOf(C1.c(this.a, string)));
                interfaceC4199ma.a(true, aVar.c, c4114he);
            } else {
                c4114he.b("status", l);
                interfaceC4199ma.a(false, aVar.d, c4114he);
            }
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            c4114he.b("errMsg", e2.getMessage());
            interfaceC4199ma.a(false, aVar.d, c4114he);
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
        if (c.equals(a2.a)) {
            a(a2.b, a2, interfaceC4199ma);
            return;
        }
        if (d.equals(a2.a)) {
            b(a2.b, a2, interfaceC4199ma);
            return;
        }
        Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
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
