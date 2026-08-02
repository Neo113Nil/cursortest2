package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.sen.SenCpt;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {
    private static b k;
    private static Map<String, a> l;
    private String h;
    private String i;
    private int j;

    private String c(String str) {
        return c.c("331").equals(str) ? "accelerometer" : c.c("332").equals(str) ? "magnetic" : c.c("333").equals(str) ? "gyroscope" : c.c("334").equals(str) ? "rotation" : str;
    }

    private int g() {
        if (c.c("331").equals(this.i)) {
            return 1;
        }
        if (c.c("332").equals(this.i)) {
            return 2;
        }
        if (c.c("333").equals(this.i)) {
            return 4;
        }
        return c.c("334").equals(this.i) ? 11 : -1;
    }

    private void h() {
        if (k == null) {
            k = new b();
        }
        Map map = l;
        if (map == null) {
            map = new HashMap();
            l = map;
        }
        a aVar = new a() { // from class: j4h
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(b bVar) {
                SenCpt.this.b(bVar);
            }
        };
        map.put(this.i, aVar);
        k.a(aVar);
        k.a(g(), c(this.i), this.j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(c.c("149"))) {
                    this.i = String.valueOf(entry.getValue());
                } else if (key.equals(c.c("150"))) {
                    double parseDouble = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (parseDouble > 0.0d) {
                        this.j = (int) (parseDouble * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(c.c(StatisticData.ERROR_CODE_NOT_FOUND))) {
                    this.h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.h.equals(c.c("310"))) {
            h();
        }
        if (this.h.equals(c.c("318")) && k != null && (map = l) != null) {
            k.b(map.get(this.i));
            l.remove(this.i);
            if (l.isEmpty()) {
                k.a();
                k = null;
            }
        }
        a("917003", (HashMap<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }
}
