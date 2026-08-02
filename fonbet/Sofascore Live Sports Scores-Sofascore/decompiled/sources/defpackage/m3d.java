package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m3d {
    public static final Logger d = Logger.getLogger(m3d.class.getName());
    public static m3d e;
    public String a = "unknown";
    public final LinkedHashSet b = new LinkedHashSet();
    public lv9 c = awf.g;

    public final synchronized void a() {
        try {
            HashMap hashMap = new HashMap();
            String str = "unknown";
            Iterator it = this.b.iterator();
            char c = 0;
            while (it.hasNext()) {
                l3d l3dVar = (l3d) it.next();
                l3dVar.getClass();
                if (((l3d) hashMap.get("dns")) == null) {
                    hashMap.put("dns", l3dVar);
                }
                if (c < 5) {
                    str = "dns";
                    c = 5;
                }
            }
            this.c = lv9.f(hashMap);
            this.a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
