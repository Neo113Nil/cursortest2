package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wd2 implements sd2 {
    public List a;

    @Override // defpackage.sd2
    public final boolean a(umg umgVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (pp4.p((ae2) it.next(), umgVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return mz1.p(new StringBuilder("not("), this.a, ")");
    }
}
