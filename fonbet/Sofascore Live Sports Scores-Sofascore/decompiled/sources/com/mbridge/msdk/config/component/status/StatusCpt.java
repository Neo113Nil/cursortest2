package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.status.StatusCpt;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {
    private static c k;
    private static e l;
    private static d m;
    private static a n;
    String h = "";
    Map<String, Object> i = null;
    Map<String, Object> j = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        String c = bVar.c();
        c.getClass();
        switch (c) {
            case "916002":
                String valueOf = String.valueOf(bVar.b().get("networkType"));
                if (!TextUtils.isEmpty(this.h)) {
                    if (!this.h.equals(valueOf)) {
                        this.h = valueOf;
                        a(a(bVar.c(), bVar.b()));
                        break;
                    }
                } else {
                    this.h = valueOf;
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private boolean c(String str) {
        Object obj = this.i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("17"))).equals("1");
        }
        return false;
    }

    private void g() {
        boolean c = c("916002");
        boolean c2 = c("916005");
        boolean z = c("916004") || c("916003");
        boolean c3 = c("916006");
        if (c || c2 || z || c3) {
            return;
        }
        n = null;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String str;
        List<String> list;
        super.d();
        Map<String, Object> map = this.i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (n == null) {
            n = new a() { // from class: yei
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(b bVar) {
                    StatusCpt.this.b(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = k;
                if (cVar != null) {
                    cVar.b(n);
                    k.d();
                }
                k = null;
            } else if (k == null) {
                c cVar2 = new c();
                k = cVar2;
                cVar2.a(n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.s;
                if (bVar != null) {
                    bVar.a(n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.s;
                if (bVar2 != null) {
                    bVar2.b(n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = l;
                if (eVar != null) {
                    eVar.b(n);
                    l.d();
                }
                l = null;
            } else if (l == null) {
                e eVar2 = new e();
                l = eVar2;
                eVar2.a(n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.j;
            if (map2 != null) {
                Object obj = map2.get(com.mbridge.msdk.config.component.common.util.c.c(DownloadModel.FILE_NAME));
                if (obj == null) {
                    obj = "";
                }
                str = String.valueOf(obj);
                list = (this.j.containsKey(com.mbridge.msdk.config.component.common.util.c.c("key_list")) && (this.j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) instanceof List)) ? (List) this.j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) : null;
            } else {
                str = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = m;
                if (dVar != null) {
                    dVar.b(n);
                }
                m = null;
            } else if (m == null) {
                d dVar2 = new d(str);
                m = dVar2;
                dVar2.a(list);
                m.a(n);
            }
        }
        g();
        a(a("916007", (Map<String, Object>) null));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f = "916001";
        if (map == null) {
            return;
        }
        this.j = map;
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(com.mbridge.msdk.config.component.common.util.c.c("17"))) == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        return valueOf.equals("1") || valueOf.equals("0");
    }
}
