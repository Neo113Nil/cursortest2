package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* compiled from: OpenAppModel.java */
/* loaded from: classes13.dex */
public class a {
    private Context a;
    private String b;
    private String c;
    private Map<String, Object> d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("160"));
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("151"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("109"));
            if (obj3 instanceof Map) {
                b((Map<String, Object>) obj3);
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b());
            }
        }
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public Map<String, Object> b() {
        return this.d;
    }

    public void b(Map<String, Object> map) {
        this.d = map;
    }

    public Context a() {
        return this.a;
    }

    public void a(Context context) {
        this.a = context;
    }

    public void a(String str) {
        this.b = str;
    }
}
