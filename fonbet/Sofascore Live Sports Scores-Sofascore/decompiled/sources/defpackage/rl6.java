package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rl6 {
    public final LinkedHashMap a;

    public rl6(tl6 tl6Var) {
        this.a = tub.q(tl6Var.a);
    }

    public final void a(sl6 sl6Var, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        if (obj != null) {
            linkedHashMap.put(sl6Var, obj);
        } else {
            linkedHashMap.remove(sl6Var);
        }
    }

    public rl6() {
        this.a = new LinkedHashMap();
    }
}
