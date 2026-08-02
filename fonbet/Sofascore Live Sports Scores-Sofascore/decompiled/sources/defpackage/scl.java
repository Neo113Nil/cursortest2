package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class scl {
    public final k6g a;
    public final yxk b = new yxk(5);

    public scl(k6g k6gVar) {
        this.a = k6gVar;
    }

    public final void a(String str, Set set) {
        str.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gz8.S(this.a, false, true, new bcl(5, this, new rcl((String) it.next(), str)));
        }
    }
}
