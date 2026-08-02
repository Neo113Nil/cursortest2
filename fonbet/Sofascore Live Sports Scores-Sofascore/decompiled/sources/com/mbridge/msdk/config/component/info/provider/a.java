package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.L6;
import com.ironsource.U3;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.d;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import defpackage.bnk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static final Map<String, Object> g = new HashMap();
    private static final Map<String, Object> h = new HashMap();
    private int a;
    private int b;
    private int c;
    private c d;
    private d e;
    private final com.mbridge.msdk.config.component.info.provider.listener.a f = new bnk(this, 7);

    public a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(f.b.c)) {
                h.put(com.mbridge.msdk.config.component.common.util.c.c("546"), map.get(f.b.c));
            }
            if (map.containsKey("adIdB64")) {
                h.put(com.mbridge.msdk.config.component.common.util.c.c("547"), map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                h.put(com.mbridge.msdk.config.component.common.util.c.c("548"), map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = h;
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("549"), map.get("amazonIdInfoB64"));
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("550"), map.get("amazonIdInfo"));
            }
        }
    }

    private void b() {
        if (!e.d().c.get()) {
            e.d().a(this.f);
            return;
        }
        Map<String, Object> map = g;
        if (map.containsKey(com.mbridge.msdk.config.component.common.util.c.c("522"))) {
            return;
        }
        map.put(com.mbridge.msdk.config.component.common.util.c.c("522"), e.d().e());
    }

    public Map<String, Object> c() {
        String str = "";
        Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        Map<String, Object> map = g;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = h;
            if (map2.isEmpty()) {
                a(com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a(d));
                return map;
            }
            map.putAll(map2);
            return map;
        }
        try {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("524"), MBConfiguration.SDK_VERSION);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("506"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("567"), d.getPackageName());
            map.put(com.mbridge.msdk.config.component.common.util.c.c("568"), this.d.d(d));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("569"), Integer.valueOf(this.d.c(d)));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("570"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("571"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("572"), this.d.a(d, d.getPackageName()));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("573"), "2");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("574"), Integer.valueOf(this.d.k()));
            if (this.b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("508"), this.d.g());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("579"), Integer.valueOf(this.d.h()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("503"), this.d.f());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("552"), this.d.a());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("551"), this.d.d());
                if (e.d().c.get()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("522"), e.d().e());
                } else {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("522"), e.d().a());
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.c("502"), this.d.j());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("532"), this.d.h(d) + "x" + this.d.f(d));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("631"), "");
                Map<String, Object> e = this.d.e();
                if (e != null && !e.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("505"), e.get("totalMem"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("541"), e.get(L6.w));
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.c("519"), Integer.valueOf(this.d.p()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("518"), Integer.valueOf(this.d.n(d)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("520"), Integer.valueOf(this.d.l()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("566"), Integer.valueOf(this.d.a(com.mbridge.msdk.foundation.controller.c.n().h())));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("515"), Long.valueOf(this.d.b()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("512"), Integer.valueOf(this.d.m()));
                Map<String, String> i = this.d.i(d);
                if (i != null && !i.isEmpty()) {
                    String str2 = i.get("mnc");
                    String str3 = i.get("mcc");
                    String c = com.mbridge.msdk.config.component.common.util.c.c("564");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put(c, str2);
                    String c2 = com.mbridge.msdk.config.component.common.util.c.c("565");
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put(c2, str);
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.c("563"), this.d.c());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("562"), Integer.valueOf(this.d.m(d)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("561"), this.d.l(d));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("560"), Integer.valueOf(this.d.b(d)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("583"), Float.valueOf(this.d.i()));
            }
            if (this.c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("516"), Float.valueOf(this.e.c(d)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("510"), this.e.b());
                Map<String, Object> a = this.e.a();
                if (a != null && !a.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("555"), a.get("totalSpace"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("542"), a.get("freeExternalSize"));
                }
            }
            if (this.a == 1) {
                Map<String, Object> map3 = h;
                if (map3.isEmpty()) {
                    a(com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a(d));
                }
                if (!map3.isEmpty()) {
                    map.putAll(map3);
                }
            }
        } catch (Throwable th) {
            q0.b("DeviceInfoProvider", th.getMessage(), th);
        }
        return g;
    }

    public Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        try {
            Context d = com.mbridge.msdk.foundation.controller.c.n().d();
            if (this.b == 1) {
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("513"), this.d.e(d));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("509"), this.d.a(d));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("531"), Integer.valueOf(this.d.j(d)));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("533"), this.d.k(d));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("557"), Integer.valueOf(this.d.o()));
                HashMap<String, Object> n = this.d.n();
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("553"), n.get("available"));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("580"), n.get("versionName"));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("581"), n.get("versionCode"));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("538"), Integer.valueOf(m0.s(d)));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("517"), b.e().d);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("559"), Integer.valueOf(b.e().e));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("582"), Integer.valueOf(b.e().c));
            }
            if (this.c == 1) {
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("534"), Integer.valueOf(this.e.d(d)));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("535"), Integer.valueOf(this.e.d(d)));
                Map<String, Object> a = this.e.a(d);
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("536"), a.get("charging"));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("535"), a.get(U3.j.Y));
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("544"), this.e.b(d));
            }
            return hashMap;
        } catch (Throwable th) {
            q0.b("DeviceInfoProvider", th.getMessage(), th);
            return hashMap;
        }
    }

    public void e() {
        if (this.a == 1) {
            a();
        }
        if (this.b == 1) {
            b();
        }
        this.d = new c();
        this.e = new d();
        b.e().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map) {
        if (map != null) {
            a((Map<String, Object>) map);
        }
    }

    public String a(String str) {
        Map<String, Object> map = g;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = h;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = h;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> d = d();
        if (d.containsKey(str)) {
            return String.valueOf(d.get(str));
        }
        return "";
    }

    private void a() {
        if (com.mbridge.msdk.config.component.info.provider.subprovider.a.b().g.get()) {
            if (h.isEmpty()) {
                a(com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a());
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a(this.f);
    }
}
