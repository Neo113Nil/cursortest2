package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class TransCpt extends a {
    private com.mbridge.msdk.config.component.trans.model.a h;
    private Map<String, Object> i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "911001";
        if (this.a.containsKey(c.c("50")) && (this.a.get(c.c("50")) instanceof Map)) {
            this.i = (Map) this.a.get(c.c("50"));
        }
        this.h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object a = new d().a(this.h.a(), this.d);
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put(c.c("500"), a);
        }
        a(a("911002", (Map<String, Object>) hashMap));
    }
}
