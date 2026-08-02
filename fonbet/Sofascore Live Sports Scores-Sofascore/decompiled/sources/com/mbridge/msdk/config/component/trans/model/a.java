package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private String a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(c.c("118"))) == null) {
            return;
        }
        a(String.valueOf(obj));
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }
}
