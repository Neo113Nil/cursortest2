package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DeviceModel.java */
/* loaded from: classes13.dex */
public class a {
    private String a;
    private List<String> b;
    private List<String> c;
    private List<String> d;
    private List<String> e;
    private int f = 1;
    private int g = 1;
    private int h = 1;
    private com.mbridge.msdk.config.component.info.provider.a i;

    public a(Map<String, Object> map) {
        a(map);
        g();
    }

    private void g() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f, this.g, this.h);
        this.i = aVar;
        aVar.e();
        this.i.c();
        this.i.d();
    }

    public List<String> a() {
        return this.e;
    }

    public List<String> b() {
        return this.d;
    }

    public Map<String, Object> c() {
        Map<String, Object> c = this.i.c();
        Map<String, Object> d = this.i.d();
        HashMap hashMap = new HashMap();
        hashMap.putAll(c);
        hashMap.putAll(d);
        return hashMap;
    }

    public List<String> d() {
        return this.b;
    }

    public List<String> e() {
        return this.c;
    }

    public String f() {
        return this.a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("138"));
            if (obj != null) {
                this.a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("199"));
            if (obj instanceof List) {
                this.b = (List) obj2;
            }
            Object obj3 = map.get(c.c("140"));
            if (obj3 instanceof List) {
                this.c = (List) obj3;
            }
            Object obj4 = map.get(c.c("196"));
            if (obj4 instanceof List) {
                this.d = (List) obj4;
            }
            Object obj5 = map.get(c.c("197"));
            if (obj5 instanceof List) {
                this.e = (List) obj5;
            }
            Object obj6 = map.get(c.c("139"));
            if (obj6 != null) {
                try {
                    this.f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th) {
                    q0.b("DeviceModel", th.getMessage());
                }
            }
            Object obj7 = map.get(c.c("194"));
            if (obj7 != null) {
                try {
                    this.g = Integer.parseInt(String.valueOf(obj7));
                } catch (Throwable th2) {
                    q0.b("DeviceModel", th2.getMessage());
                }
            }
            Object obj8 = map.get(c.c("195"));
            if (obj8 != null) {
                try {
                    this.h = Integer.parseInt(String.valueOf(obj8));
                } catch (Throwable th3) {
                    q0.b("DeviceModel", th3.getMessage());
                }
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.i.a(str);
    }
}
