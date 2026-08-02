package com.mbridge.msdk.config.component.style.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: XMLViewModel.java */
/* loaded from: classes13.dex */
public class b {
    private String a;
    private String b;
    private String c;
    private String d;
    private List<a> e;

    public b(Map<String, Object> map) {
        a(map);
    }

    private a b(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        a aVar = new a();
        Object obj = map.get(c.c("130"));
        if (obj != null) {
            aVar.a(String.valueOf(obj));
        }
        Object obj2 = map.get(c.c("123"));
        if (obj2 != null) {
            aVar.c(String.valueOf(obj2));
        }
        Object obj3 = map.get(c.c("131"));
        if (obj3 != null) {
            aVar.a(obj3);
        }
        Object obj4 = map.get(c.c("134"));
        if (obj4 != null) {
            aVar.b(String.valueOf(obj4));
        }
        Object obj5 = map.get(c.c("132"));
        if (obj5 != null) {
            aVar.e(String.valueOf(obj5));
        }
        Object obj6 = map.get(c.c("133"));
        if (obj6 != null) {
            aVar.d(String.valueOf(obj6));
        }
        return aVar;
    }

    public void a(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b a;
        if (map != null) {
            try {
                Object obj = map.get(c.c("116"));
                if (obj != null) {
                    d(String.valueOf(obj));
                }
                Object obj2 = map.get(c.c("100"));
                if (obj2 != null) {
                    a(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.c("129"));
                if (obj3 != null) {
                    a(obj3);
                }
                Object obj4 = map.get(c.c("156"));
                if (obj4 != null) {
                    c(String.valueOf(obj4));
                } else {
                    c(String.valueOf(m0.G(com.mbridge.msdk.foundation.controller.c.n().d())));
                }
            } catch (Exception e) {
                q0.b("XMLViewModel", e.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(d()) || (a = com.mbridge.msdk.config.component.common.file.a.a(d(), 2, c())) == null || !a.e()) {
            return;
        }
        b(a.d());
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.a;
    }

    public List<a> e() {
        return this.e;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    private void a(Object obj) {
        a b;
        a b2;
        if (obj == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof Map) {
                    a b3 = b((Map<String, Object>) obj2);
                    if (b3 != null) {
                        arrayList.add(b3);
                    }
                } else if ((obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (b2 = b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b())) != null) {
                    arrayList.add(b2);
                }
            }
        } else if (obj instanceof Map) {
            a b4 = b((Map<String, Object>) obj);
            if (b4 != null) {
                arrayList.add(b4);
            }
        } else if ((obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (b = b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b())) != null) {
            arrayList.add(b);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a((List<a>) arrayList);
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(List<a> list) {
        this.e = list;
    }
}
