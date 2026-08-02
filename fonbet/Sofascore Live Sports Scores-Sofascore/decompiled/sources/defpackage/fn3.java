package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fn3 implements gkh, mma {
    public long a;
    public ArrayList b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rq3 rq3Var) {
        en3 en3Var;
        int i;
        fsf fsfVar;
        Throwable th;
        int h;
        a35 a35Var;
        int g;
        if (rq3Var instanceof en3) {
            en3Var = (en3) rq3Var;
            int i2 = en3Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                en3Var.u = i2 - Integer.MIN_VALUE;
                Object obj = en3Var.s;
                lu3 lu3Var = lu3.a;
                i = en3Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (an3.k(this.a)) {
                        fsf fsfVar2 = new fsf();
                        try {
                            en3Var.r = fsfVar2;
                            en3Var.u = 1;
                            lj2 lj2Var = new lj2(1, z9a.b(en3Var));
                            lj2Var.t();
                            fsfVar2.a = lj2Var;
                            this.b.add(lj2Var);
                            if (lj2Var.q() == lu3Var) {
                                return lu3Var;
                            }
                            fsfVar = fsfVar2;
                        } catch (Throwable th2) {
                            fsfVar = fsfVar2;
                            th = th2;
                            ArrayList arrayList = this.b;
                            i5k.a(arrayList).remove(fsfVar.a);
                            throw th;
                        }
                    }
                    long j = this.a;
                    h = an3.h(j);
                    a35 a35Var2 = v25.a;
                    if (h != Integer.MAX_VALUE) {
                        t25.a(h);
                        a35Var = new t25(h);
                    } else {
                        a35Var = a35Var2;
                    }
                    g = an3.g(j);
                    if (g != Integer.MAX_VALUE) {
                        t25.a(g);
                        a35Var2 = new t25(g);
                    }
                    return new kjh(a35Var, a35Var2);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fsfVar = en3Var.r;
                try {
                    y6a.M(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ArrayList arrayList2 = this.b;
                    i5k.a(arrayList2).remove(fsfVar.a);
                    throw th;
                }
                ArrayList arrayList3 = this.b;
                i5k.a(arrayList3).remove(fsfVar.a);
                long j2 = this.a;
                h = an3.h(j2);
                a35 a35Var22 = v25.a;
                if (h != Integer.MAX_VALUE) {
                }
                g = an3.g(j2);
                if (g != Integer.MAX_VALUE) {
                }
                return new kjh(a35Var, a35Var22);
            }
        }
        en3Var = new en3(this, (sq3) rq3Var);
        Object obj2 = en3Var.s;
        lu3 lu3Var2 = lu3.a;
        i = en3Var.u;
        if (i != 0) {
        }
        ArrayList arrayList32 = this.b;
        i5k.a(arrayList32).remove(fsfVar.a);
        long j22 = this.a;
        h = an3.h(j22);
        a35 a35Var222 = v25.a;
        if (h != Integer.MAX_VALUE) {
        }
        g = an3.g(j22);
        if (g != Integer.MAX_VALUE) {
        }
        return new kjh(a35Var, a35Var222);
    }

    public final void g(long j) {
        this.a = j;
        if (an3.k(j)) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rq3 rq3Var = (rq3) it.next();
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(Unit.a);
        }
    }

    @Override // defpackage.mma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        g(j);
        qhe J = g1cVar.J(j);
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 3));
    }
}
