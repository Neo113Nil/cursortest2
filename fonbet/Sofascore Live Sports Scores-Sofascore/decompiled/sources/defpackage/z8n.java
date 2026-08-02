package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z8n {
    public static volatile z8n b;
    public static final z8n c = new z8n(0);
    public final Map a;

    public z8n() {
        this.a = new HashMap();
    }

    public static z8n a() {
        int i = o7n.a;
        return c;
    }

    public static z8n b() {
        z8n z8nVar = b;
        if (z8nVar != null) {
            return z8nVar;
        }
        synchronized (z8n.class) {
            try {
                z8n z8nVar2 = b;
                if (z8nVar2 != null) {
                    return z8nVar2;
                }
                int i = o7n.a;
                z8n b2 = n9n.b();
                b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public z8n(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
