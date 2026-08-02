package com.mbridge.msdk.config.component.log.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.w1l;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private int a = 2;
    private int b = 15000;
    private int c = 0;
    private int d = 0;
    private int e = 50;
    private int f = 50;
    private int g = 604800000;
    private int h;
    private Map<String, Object> i;
    private Map<String, Object> j;
    private Map<String, Object> k;

    public a(Map<String, Object> map) {
        if (map != null) {
            a(map);
        }
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.c("181"))) {
                String j = w1l.j("181", map);
                if (!TextUtils.isEmpty(j) && !"null".equalsIgnoreCase(j)) {
                    try {
                        this.a = Integer.parseInt(j);
                    } catch (Exception e) {
                        q0.b("LogSenderModel", e.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("162"))) {
                String j2 = w1l.j("162", map);
                if (!TextUtils.isEmpty(j2) && !"null".equalsIgnoreCase(j2)) {
                    try {
                        this.b = Integer.parseInt(j2) * 1000;
                    } catch (Exception e2) {
                        q0.b("LogSenderModel", e2.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("182"))) {
                String j3 = w1l.j("182", map);
                if (!TextUtils.isEmpty(j3) && !"null".equalsIgnoreCase(j3)) {
                    try {
                        this.c = Integer.parseInt(j3);
                    } catch (Exception e3) {
                        q0.b("LogSenderModel", e3.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("183"))) {
                String j4 = w1l.j("183", map);
                if (!TextUtils.isEmpty(j4) && !"null".equalsIgnoreCase(j4)) {
                    try {
                        this.d = Integer.parseInt(j4);
                    } catch (Exception e4) {
                        q0.b("LogSenderModel", e4.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("174"))) {
                String j5 = w1l.j("174", map);
                if (!TextUtils.isEmpty(j5) && !"null".equalsIgnoreCase(j5)) {
                    try {
                        this.e = Integer.parseInt(j5);
                    } catch (Exception e5) {
                        q0.b("LogSenderModel", e5.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("184"))) {
                String j6 = w1l.j("184", map);
                if (!TextUtils.isEmpty(j6) && !"null".equalsIgnoreCase(j6)) {
                    try {
                        this.f = Integer.parseInt(j6);
                    } catch (Exception e6) {
                        q0.b("LogSenderModel", e6.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("185"))) {
                String j7 = w1l.j("185", map);
                if (!TextUtils.isEmpty(j7) && !"null".equalsIgnoreCase(j7)) {
                    try {
                        this.g = Integer.parseInt(j7) * 1000;
                    } catch (Exception e7) {
                        q0.b("LogSenderModel", e7.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("178"))) {
                String j8 = w1l.j("178", map);
                if (!TextUtils.isEmpty(j8) && !"null".equalsIgnoreCase(j8)) {
                    try {
                        this.h = Integer.parseInt(j8);
                    } catch (Exception e8) {
                        q0.b("LogSenderModel", e8.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("180"))) {
                Object obj = map.get(c.c("180"));
                if (obj instanceof Map) {
                    this.i = (Map) obj;
                } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.i = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
                }
            }
            if (map.containsKey(c.c("179"))) {
                Object obj2 = map.get(c.c("179"));
                if (obj2 instanceof Map) {
                    this.j = (Map) obj2;
                } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.j = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                }
            }
            if (map.containsKey(c.c("186"))) {
                Object obj3 = map.get(c.c("186"));
                if (obj3 instanceof Map) {
                    this.k = (Map) obj3;
                } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.k = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
                }
            }
        }
    }

    public int b() {
        return this.b;
    }

    public String c() {
        Map<String, Object> map = this.i;
        if (map == null || !map.containsKey(c.c("116"))) {
            return "";
        }
        String j = w1l.j("116", this.i);
        return (TextUtils.isEmpty(j) || "null".equalsIgnoreCase(j)) ? "" : j;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        Map<String, Object> map = this.i;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.e;
    }

    public Map<String, Object> h() {
        return this.k;
    }

    public String i() {
        Map<String, Object> map = this.j;
        if (map == null || !map.containsKey(c.c("114"))) {
            return "";
        }
        String j = w1l.j("114", this.j);
        return (TextUtils.isEmpty(j) || "null".equalsIgnoreCase(j)) ? "" : j;
    }

    public int j() {
        Map<String, Object> map = this.j;
        if (map == null || !map.containsKey(c.c("172"))) {
            return 9377;
        }
        String j = w1l.j("172", this.j);
        if (TextUtils.isEmpty(j) || "null".equals(j)) {
            return 9377;
        }
        try {
            return Integer.parseInt(j);
        } catch (Exception e) {
            q0.b("LogSenderModel", e.getMessage());
            return 9377;
        }
    }

    public int k() {
        return this.g;
    }

    public int a() {
        return this.a;
    }
}
