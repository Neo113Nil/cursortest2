package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class era {
    public final Function1 a;
    public en0 c;
    public int f;
    public final sx2 b = new sx2(17, false);
    public int d = -1;
    public int e = -1;

    public era(Function1 function1) {
        this.a = function1;
    }

    public final dra a(int i, long j, boolean z, Function1 function1) {
        en0 en0Var = this.c;
        if (en0Var == null) {
            return ud5.a;
        }
        r5f r5fVar = (r5f) en0Var.e;
        boolean z2 = r5fVar instanceof u20;
        q5f q5fVar = new q5f(en0Var, i, this.b, function1);
        q5fVar.d = new an3(j);
        if (!z2) {
            r5fVar.a(q5fVar);
        } else if (z) {
            u20 u20Var = (u20) r5fVar;
            u20Var.b.add(new n7f(1, q5fVar));
            if (!u20Var.c) {
                u20Var.c = true;
                u20Var.a.post(u20Var);
            }
        } else {
            u20 u20Var2 = (u20) r5fVar;
            u20Var2.b.add(new n7f(0, q5fVar));
            if (!u20Var2.c) {
                u20Var2.c = true;
                u20Var2.a.post(u20Var2);
            }
        }
        eq3.a0(i, "compose:lazy:schedule_prefetch:index");
        return q5fVar;
    }
}
