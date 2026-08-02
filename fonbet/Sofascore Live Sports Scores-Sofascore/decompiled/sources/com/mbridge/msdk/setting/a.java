package com.mbridge.msdk.setting;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private String e;
    private String f;
    private int g;
    private int a = 1;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int h = 0;

    public static a a(String str) {
        Exception e;
        a aVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            aVar = new a();
        } catch (Exception e2) {
            e = e2;
            aVar = null;
        }
        try {
            aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().h));
            aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().l));
            aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().p));
            aVar.f(jSONObject.optInt("type", 0));
            aVar.a(jSONObject.optInt("batch_size", 1));
            aVar.c(jSONObject.optInt(IronSourceConstants.EVENTS_DURATION, 0));
            aVar.b(jSONObject.optInt("disable", 0));
            aVar.d(jSONObject.optInt("e_t_l", 0));
            return aVar;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return aVar;
        }
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(int i) {
        this.c = i;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(int i) {
        this.g = i;
    }

    public void f(int i) {
        this.h = i;
    }

    public void b(String str) {
        this.e = str;
    }

    public void c(String str) {
        this.f = str;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        if (i < 1) {
            i = 1;
        }
        this.a = i;
    }
}
