package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* compiled from: InnerStoreModel.java */
/* loaded from: classes13.dex */
public class a {
    Context a;
    String b;
    String c;
    String d;
    String e;
    Map<String, Object> f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("159"));
            Map<String, Object> b = obj3 instanceof Map ? (Map) obj3 : obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b() : null;
            b(b);
            if (b != null && !b.isEmpty()) {
                c(String.valueOf(b.get(c.c("160"))));
            }
            Object obj4 = map.get(c.c("100"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.b;
    }

    public Map<String, Object> b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.c;
    }

    public void b(Map<String, Object> map) {
        this.f = map;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context;
    }

    public void a(String str) {
        this.e = str;
    }
}
