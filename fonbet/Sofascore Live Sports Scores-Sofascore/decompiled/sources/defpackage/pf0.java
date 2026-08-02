package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pf0 extends y0 {
    public final int d;

    public pf0(eyf eyfVar) {
        super(eyfVar);
        this.d = eyfVar.a;
    }

    @Override // defpackage.qf0
    public final void k(int i, int i2, int i3) {
        ArrayList v = v();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = v.subList(i, i3 + i);
            ArrayList U0 = CollectionsKt.U0(subList);
            subList.clear();
            v.addAll(i4, U0);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            v.set(i, v.set(i2, v.get(i)));
        } else {
            v.add(i4, v.remove(i));
        }
    }

    @Override // defpackage.y0
    public final void l() {
        Object obj = this.a;
        obj.getClass();
        ((yk5) obj).c.clear();
    }

    @Override // defpackage.qf0
    public final void p(int i, int i2) {
        ArrayList v = v();
        if (i2 == 1) {
            v.remove(i);
        } else {
            v.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.qf0
    public final void s(int i, Object obj) {
        mk5 mk5Var = (mk5) obj;
        Object obj2 = this.b;
        obj2.getClass();
        int i2 = ((yk5) obj2).a;
        if (i2 > 0) {
            if (mk5Var instanceof yk5) {
                yk5 yk5Var = (yk5) mk5Var;
                yk5Var.a = yk5Var.b ? this.d : i2 - 1;
            }
            v().add(i, mk5Var);
            return;
        }
        Object obj3 = this.a;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((yk5) obj3).a).toString());
    }

    public final ArrayList v() {
        mk5 mk5Var = (mk5) this.b;
        if (mk5Var instanceof yk5) {
            return ((yk5) mk5Var).c;
        }
        a70.r("Current node cannot accept children");
        return null;
    }

    @Override // defpackage.qf0
    public final void w(int i, Object obj) {
    }
}
