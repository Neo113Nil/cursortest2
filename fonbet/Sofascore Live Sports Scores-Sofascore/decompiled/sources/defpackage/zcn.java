package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zcn extends bdn {
    public zcn() {
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    @Override // defpackage.bdn
    public final void a() {
        if (!this.d) {
            if (this.b > 0) {
                c(0).a.getClass();
                pvd.j();
                return;
            } else {
                Iterator it = d().iterator();
                if (it.hasNext()) {
                    throw fc6.d((Map.Entry) it.next());
                }
            }
        }
        super.a();
    }
}
