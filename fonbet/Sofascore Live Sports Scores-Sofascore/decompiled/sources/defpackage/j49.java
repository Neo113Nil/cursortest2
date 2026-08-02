package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j49 implements zff {
    public final cc4 a;
    public final q90 b;

    public j49(dad dadVar, cc4 cc4Var, q90 q90Var) {
        this.a = cc4Var;
        this.b = q90Var;
    }

    @Override // defpackage.yff
    public final Object get() {
        mn2 mn2Var = (mn2) this.a.get();
        Iterator it = Arrays.asList(new fjc((qic) this.b.get())).iterator();
        while (it.hasNext()) {
            mn2Var = new px2(mn2Var, (fjc) it.next());
        }
        return new vw9(mn2Var, jh2.h.c(jx2.c, gx2.a));
    }
}
