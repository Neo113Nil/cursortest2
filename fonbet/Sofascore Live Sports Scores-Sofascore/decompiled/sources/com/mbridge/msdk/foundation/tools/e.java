package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String j;
    public String k;
    public int m;
    public String n;
    public String o;
    public String p;
    public String r;
    public String s;
    public String t;
    public String v;
    public String q = "android";
    public String i = m0.u();
    public String u = m0.r();
    public String l = g.d();

    public e(Context context) {
        int s = m0.s(context);
        this.n = String.valueOf(s);
        this.o = m0.a(context, s);
        this.j = m0.l(context);
        this.e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.t = String.valueOf(v0.g(context));
        this.s = String.valueOf(v0.f(context));
        this.r = String.valueOf(v0.d(context));
        this.v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.g = m0.t();
        this.m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.p = U3.i.C;
        } else {
            this.p = U3.i.D;
        }
        this.f = com.mbridge.msdk.foundation.same.a.V;
        this.h = com.mbridge.msdk.foundation.same.a.g;
        this.k = m0.w();
        this.c = g.e();
        this.a = g.a();
        this.b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(U3.i.G, this.i);
                jSONObject.put("system_version", this.u);
                jSONObject.put("network_type", this.n);
                jSONObject.put("network_type_str", this.o);
                jSONObject.put("device_ua", this.j);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("opensdk_ver", m0.D() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("brand", this.g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.a);
                jSONObject.put("adid_limit_dev", this.b);
            }
            jSONObject.put("plantform", this.q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.l);
                jSONObject.put("az_aid_info", this.c);
            }
            jSONObject.put("appkey", this.e);
            jSONObject.put("appId", this.d);
            jSONObject.put("screen_width", this.t);
            jSONObject.put("screen_height", this.s);
            jSONObject.put(U3.i.n, this.p);
            jSONObject.put("scale", this.r);
            jSONObject.put("b", this.f);
            jSONObject.put(com.mbridge.msdk.foundation.controller.a.q, this.h);
            jSONObject.put("web_env", this.v);
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.k);
            jSONObject.put("misk_spt", this.m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.a);
                jSONObject2.put("adid_limit_dev", this.b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
