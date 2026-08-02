package com.mbridge.msdk.config.component.info;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class InfoCpt extends a {
    private com.mbridge.msdk.config.component.info.model.a h;

    private Object a(String str, Context context) {
        com.mbridge.msdk.config.component.info.model.a aVar = this.h;
        if (aVar == null || context == null) {
            return null;
        }
        return aVar.b(str);
    }

    private Map<String, Object> g() {
        HashMap hashMap = new HashMap();
        com.mbridge.msdk.config.component.info.model.a aVar = this.h;
        return aVar != null ? aVar.c() : hashMap;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f = "918001";
        this.h = new com.mbridge.msdk.config.component.info.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        com.mbridge.msdk.config.component.info.model.a aVar;
        super.d();
        a(a("918001", new HashMap<>()));
        String f = this.h.f();
        List<String> d = this.h.d();
        HashMap hashMap = new HashMap();
        Context d2 = c.n().d();
        HashMap hashMap2 = new HashMap();
        if (f != null) {
            if (TextUtils.isEmpty(f)) {
                if (d != null && !d.isEmpty()) {
                    for (String str : d) {
                        hashMap2.put(str, a(str, d2));
                    }
                }
            } else if (f.equals(com.mbridge.msdk.config.component.common.util.c.c("330"))) {
                hashMap2.putAll(g());
            } else {
                hashMap2.put(f, a(f, d2));
            }
        }
        if (this.h.e() != null && !this.h.e().isEmpty()) {
            int size = this.h.e().size();
            int[] iArr = new int[size];
            int i = 0;
            while (true) {
                int size2 = this.h.e().size();
                aVar = this.h;
                if (i < size2) {
                    iArr[i] = v0.c(d2, aVar.e().get(i)) ? 1 : 0;
                    i++;
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        q0.a("InfoCpt", e.getMessage());
                    }
                }
            }
            List<String> b = aVar.b();
            List<String> a = this.h.a();
            if (b != null && b.size() == this.h.e().size()) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < size; i2++) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(com.mbridge.msdk.config.component.common.util.c.c("ind"), Integer.valueOf(iArr[i2]));
                    hashMap3.put(com.mbridge.msdk.config.component.common.util.c.c(BidResponsedEx.KEY_CID), b.get(i2));
                    hashMap3.put(com.mbridge.msdk.config.component.common.util.c.c(CampaignEx.JSON_KEY_RETARGET_OFFER), a.get(i2));
                    arrayList.add(hashMap3);
                }
                hashMap2.put(com.mbridge.msdk.config.component.common.util.c.c("filter_list"), arrayList);
            }
            hashMap2.put(com.mbridge.msdk.config.component.common.util.c.c("575"), iArr);
        }
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("500"), hashMap2);
        a(a("918002", (Map<String, Object>) hashMap));
    }
}
