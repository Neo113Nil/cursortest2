package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4373ie;
import com.ironsource.InterfaceC4458na;
import com.ironsource.InterfaceC4652y7;
import com.ironsource.Kb;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class i {
    private static final String c = "i";
    private static final String d = "getDeviceData";
    private static final String e = "deviceDataFunction";
    private static final String f = "deviceDataParams";
    private static final String g = "success";
    private static final String h = "fail";
    private Context a;
    private final InterfaceC4652y7 b = Kb.Y().a();

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

    public i(Context context) {
        this.a = context;
    }

    public void a(String str, InterfaceC4458na interfaceC4458na) throws Exception {
        a a2 = a(str);
        if (d.equals(a2.a)) {
            interfaceC4458na.a(true, a2.c, a());
            return;
        }
        Logger.i(c, "unhandled API request " + str);
    }

    private C4373ie a() {
        C4373ie c4373ie = new C4373ie();
        c4373ie.b(SDKUtils.encodeString(X3.j.i0), SDKUtils.encodeString(String.valueOf(this.b.j())));
        c4373ie.b(SDKUtils.encodeString(X3.j.j0), SDKUtils.encodeString(String.valueOf(this.b.r(this.a))));
        c4373ie.b(SDKUtils.encodeString(X3.j.k0), SDKUtils.encodeString(String.valueOf(this.b.D(this.a))));
        c4373ie.b(SDKUtils.encodeString(X3.j.l0), SDKUtils.encodeString(String.valueOf(this.b.E(this.a))));
        c4373ie.b(SDKUtils.encodeString(X3.j.m0), SDKUtils.encodeString(String.valueOf(this.b.f(this.a))));
        c4373ie.b(SDKUtils.encodeString(X3.j.n0), SDKUtils.encodeString(String.valueOf(this.b.i(this.a))));
        return c4373ie;
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
