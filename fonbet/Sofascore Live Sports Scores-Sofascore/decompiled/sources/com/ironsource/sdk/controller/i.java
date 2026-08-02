package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4114he;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.InterfaceC4339u7;
import com.ironsource.U3;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i {
    private static final String c = "i";
    private static final String d = "getDeviceData";
    private static final String e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";
    private static final String h = "fail";
    private Context a;
    private final InterfaceC4339u7 b = Ib.a0().a();

    public i(Context context) {
        this.a = context;
    }

    private C4114he a() {
        C4114he c4114he = new C4114he();
        c4114he.b(SDKUtils.encodeString(U3.j.i0), SDKUtils.encodeString(String.valueOf(this.b.j())));
        c4114he.b(SDKUtils.encodeString(U3.j.j0), SDKUtils.encodeString(String.valueOf(this.b.r(this.a))));
        c4114he.b(SDKUtils.encodeString(U3.j.k0), SDKUtils.encodeString(String.valueOf(this.b.D(this.a))));
        c4114he.b(SDKUtils.encodeString(U3.j.l0), SDKUtils.encodeString(String.valueOf(this.b.E(this.a))));
        c4114he.b(SDKUtils.encodeString(U3.j.m0), SDKUtils.encodeString(String.valueOf(this.b.f(this.a))));
        c4114he.b(SDKUtils.encodeString(U3.j.n0), SDKUtils.encodeString(String.valueOf(this.b.i(this.a))));
        return c4114he;
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
        if (d.equals(a2.a)) {
            interfaceC4199ma.a(true, a2.c, a());
            return;
        }
        Logger.i(c, "unhandled API request " + str);
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a(0);
        aVar.a = jSONObject.optString(e);
        aVar.b = jSONObject.optJSONObject(f);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
