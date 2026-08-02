package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import defpackage.w1l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MatCpt extends a {
    ArrayList<Map<String, Object>> h;
    d i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f = "920001";
        Object obj = map.get(c.c("118"));
        if (obj instanceof List) {
            this.h = (ArrayList) obj;
        }
        this.i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        ArrayList<Map<String, Object>> arrayList = this.h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator<Map<String, Object>> it = this.h.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Map<String, Object> next = it.next();
            String j = w1l.j("142", next);
            String j2 = w1l.j("118", next);
            String j3 = w1l.j("143", next);
            Object a = this.i.a(j, this.d);
            boolean z = false;
            if (a instanceof Integer) {
                if (((Integer) a).intValue() == 1) {
                    z = true;
                }
            } else if (a instanceof String) {
                z = String.valueOf(a).equals("1");
            }
            if (z) {
                obj = this.i.a(j2, this.d);
                if (j3.equals("N")) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("data"), obj);
        a(a("920002", (Map<String, Object>) hashMap));
    }
}
