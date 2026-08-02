package com.mbridge.msdk.config.component.cal.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;
import xsna.sqe0;

/* compiled from: CallBackModel.java */
/* loaded from: classes13.dex */
public class a {
    private String a;
    private String b;
    private Map<String, Object> c;
    private String d;
    private String e;
    private int f;
    private String g;
    private int h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("100"));
            if (obj != null) {
                this.a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("106"));
            if (obj2 != null) {
                this.b = String.valueOf(obj2);
            }
            Object obj3 = map.get(c.c("103"));
            if (obj3 instanceof Map) {
                this.c = (Map) obj3;
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.c = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
            }
            Object obj4 = map.get(c.c("101"));
            if (obj4 != null) {
                this.d = String.valueOf(obj4);
            }
            Object obj5 = map.get(c.c("102"));
            if (obj5 != null) {
                this.e = String.valueOf(obj5);
            }
            Object obj6 = map.get(c.c("104"));
            if (obj6 instanceof String) {
                this.f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(c.c("115"));
            if (obj7 instanceof String) {
                this.g = String.valueOf(obj7);
            }
            String c = sqe0.c("init_status", map);
            if (c.equalsIgnoreCase("null")) {
                a(1);
            } else {
                a(Integer.parseInt(c));
            }
        }
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.f;
    }

    public Map<String, Object> f() {
        return this.c;
    }

    public String g() {
        return this.b;
    }

    public String a() {
        return this.g;
    }

    public void a(int i) {
        this.h = i;
    }
}
