package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.sqe0;

/* loaded from: classes13.dex */
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
            String c = sqe0.c("142", next);
            String c2 = sqe0.c("118", next);
            String c3 = sqe0.c("143", next);
            Object a = this.i.a(c, this.d);
            boolean z = false;
            if (a instanceof Integer) {
                if (((Integer) a).intValue() == 1) {
                    z = true;
                }
            } else if (a instanceof String) {
                z = String.valueOf(a).equals("1");
            }
            if (z) {
                obj = this.i.a(c2, this.d);
                if (c3.equals("N")) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("data"), obj);
        a(a("920002", (Map<String, Object>) hashMap));
    }
}
