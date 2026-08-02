package com.mbridge.msdk.config.component.vc.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* compiled from: RenderViewModel.java */
/* loaded from: classes13.dex */
public class a {
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.c("100"));
                if (obj != null) {
                    a(String.valueOf(obj));
                }
                Object obj2 = map.get(c.c("155"));
                if (obj2 != null) {
                    String valueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(valueOf)) {
                        try {
                            b(Integer.parseInt(valueOf));
                        } catch (Throwable th) {
                            q0.b("RenderViewModel", th.getMessage());
                        }
                    }
                }
                Object obj3 = map.get(c.c("154"));
                if (obj3 != null) {
                    String valueOf2 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(valueOf2)) {
                        try {
                            c(Integer.parseInt(valueOf2));
                        } catch (Throwable th2) {
                            q0.b("RenderViewModel", th2.getMessage());
                        }
                    }
                }
                Object obj4 = map.get(c.c("157"));
                if (obj4 != null) {
                    String valueOf3 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(valueOf3)) {
                        try {
                            f(Integer.parseInt(valueOf3));
                        } catch (Throwable th3) {
                            q0.b("RenderViewModel", th3.getMessage());
                        }
                    }
                }
                Object obj5 = map.get(c.c("158"));
                if (obj5 != null) {
                    String valueOf4 = String.valueOf(obj5);
                    if (!TextUtils.isEmpty(valueOf4)) {
                        try {
                            a(Integer.parseInt(valueOf4));
                        } catch (Throwable th4) {
                            q0.b("RenderViewModel", th4.getMessage());
                        }
                    }
                }
                Object obj6 = map.get(c.c("156"));
                int G = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
                if (obj6 != null) {
                    String valueOf5 = String.valueOf(obj6);
                    try {
                        if (TextUtils.isEmpty(valueOf5) || valueOf5.equalsIgnoreCase("null")) {
                            d(G);
                        } else {
                            d(Integer.parseInt(valueOf5));
                        }
                    } catch (Throwable th5) {
                        q0.b("RenderViewModel", th5.getMessage());
                        d(G);
                    }
                } else {
                    d(G);
                }
                Object obj7 = map.get(c.c("198"));
                if (obj7 != null) {
                    String valueOf6 = String.valueOf(obj7);
                    if (TextUtils.isEmpty(valueOf6) || valueOf6.equalsIgnoreCase("null")) {
                        return;
                    }
                    try {
                        e(Integer.parseInt(valueOf6));
                    } catch (Throwable th6) {
                        q0.b("RenderViewModel", th6.getMessage());
                    }
                }
            } catch (Exception e) {
                q0.b("RenderViewModel", e.getMessage());
            }
        }
    }

    public void b(int i) {
        this.b = i;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.f;
    }

    public void f(int i) {
        this.d = i;
    }

    public int g() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void c(int i) {
        this.c = i;
    }

    public void d(int i) {
        this.f = i;
    }

    public void e(int i) {
        this.g = i;
    }

    public int f() {
        return this.g;
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(int i) {
        this.e = i;
    }
}
