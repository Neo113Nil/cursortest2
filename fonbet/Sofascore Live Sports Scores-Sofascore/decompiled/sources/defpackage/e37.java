package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class e37 extends q8 {
    public final wi7 e;
    public final String f;
    public final e1d g;
    public final pog h;
    public final fdi i;
    public final hof j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e37(wi7 wi7Var, Application application) {
        super(application);
        wi7Var.getClass();
        this.e = wi7Var;
        ia0 ia0Var = ia0.q;
        this.f = fc6.e();
        rlh rlhVar = rlh.b;
        this.g = e.f(new a37(true, rlhVar, rlhVar, null, null, false, false));
        this.h = sea.y(new qo6(this, 8));
        fdi a = gdi.a(null);
        this.i = a;
        this.j = pco.w(la8.a(new wj0(a, 3), new tl((rq3) null, this, 6)), un0.z(this));
    }

    public final void k(fo1 fo1Var) {
        Object obj;
        a37 n = n();
        Iterator<E> it = n().c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(((eo7) next).l, fo1Var != null ? Integer.valueOf(fo1Var.a) : null)) {
                obj = next;
                break;
            }
        }
        boolean z = n.a;
        gv9 gv9Var = n.b;
        gv9 gv9Var2 = n.c;
        boolean z2 = n.f;
        boolean z3 = n.g;
        gv9Var.getClass();
        gv9Var2.getClass();
        ((eoh) this.g).setValue(new a37(z, gv9Var, gv9Var2, (eo7) obj, fo1Var, z2, z3));
    }

    /* renamed from: l */
    public abstract ev6 getK();

    public final void m(ev6 ev6Var, j67 j67Var) {
        fdi fdiVar;
        Object value;
        ev6Var.getClass();
        do {
            fdiVar = this.i;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, j67Var));
        xw3.L(un0.z(this), null, null, new f54(j67Var, this, ev6Var, (rq3) null, 2), 3);
    }

    public final a37 n() {
        return (a37) ((eoh) this.g).getValue();
    }
}
