package com.mbridge.msdk.config.component.eac;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class EacCpt extends a {
    private com.mbridge.msdk.config.component.eac.model.a h;
    private d i;

    private void a(Iterable<?> iterable, int i) {
        int i2 = 0;
        for (Object obj : iterable) {
            Object a = this.i.a(this.h.b(), this.d);
            if (!(a instanceof Integer) || ((Integer) a).intValue() == 1) {
                Object a2 = this.i.a(this.h.a(), this.d);
                if ((a2 instanceof Integer) && ((Integer) a2).intValue() == 1) {
                    break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(c.c("count"), i + "");
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    hashMap.put(c.c("key"), entry.getKey().toString());
                    hashMap.put(c.c("value"), entry.getValue());
                } else {
                    hashMap.put(c.c("key"), i2 + "");
                    hashMap.put(c.c("value"), obj);
                }
                a(a("921002", (Map<String, Object>) hashMap));
            }
            i2++;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(c.c("count"), Integer.valueOf(i));
        a(a("921003", (Map<String, Object>) hashMap2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "921001";
        this.h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object c = this.h.c();
        if (c == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.c("code"), "");
            hashMap.put(c.c("reason"), "iterationData is null");
            hashMap.put(c.c("count"), 0);
            a(a("921003", (Map<String, Object>) hashMap));
            return;
        }
        if (c instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) c;
            a(aVar.a(), aVar.f());
            return;
        }
        if (c instanceof Map) {
            Map map = (Map) c;
            a(map.entrySet(), map.size());
        } else {
            if (c instanceof List) {
                List list = (List) c;
                a(list, list.size());
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(c.c("code"), "");
            hashMap2.put(c.c("reason"), "iterationData type not match");
            hashMap2.put(c.c("count"), 0);
            a(a("921003", (Map<String, Object>) hashMap2));
        }
    }
}
