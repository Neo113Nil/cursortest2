package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rjh extends o9a {
    public c80 p;
    public mv1 q;
    public Function2 r;
    public long s;
    public long t;
    public boolean u;
    public final e1d v;

    public rjh(c80 c80Var, mv1 mv1Var, Function2 function2) {
        super(1);
        this.p = c80Var;
        this.q = mv1Var;
        this.r = function2;
        this.s = -9223372034707292160L;
        this.t = cn3.b(0, 0, 0, 0, 15);
        this.v = e.f(null);
    }

    @Override // defpackage.wtc
    public final void c1() {
        this.s = -9223372034707292160L;
        this.u = false;
    }

    @Override // defpackage.wtc
    public final void e1() {
        ((eoh) this.v).setValue(null);
    }

    @Override // defpackage.o9a, defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J;
        char c;
        long j2;
        pjh pjhVar;
        long d;
        pjh pjhVar2;
        if (m1cVar.W()) {
            this.t = j;
            this.u = true;
            J = g1cVar.J(j);
        } else {
            J = g1cVar.J(this.u ? this.t : j);
        }
        qhe qheVar = J;
        long j3 = (qheVar.b & 4294967295L) | (qheVar.a << 32);
        if (m1cVar.W()) {
            this.s = j3;
            c = ' ';
            d = j3;
            j2 = d;
        } else {
            long j4 = !c7a.a(this.s, -9223372034707292160L) ? this.s : j3;
            e1d e1dVar = this.v;
            pjh pjhVar3 = (pjh) ((eoh) e1dVar).getValue();
            if (pjhVar3 != null) {
                q50 q50Var = pjhVar3.a;
                c = ' ';
                j2 = j3;
                boolean z = (c7a.a(j4, ((c7a) q50Var.d()).a) || q50Var.e()) ? false : true;
                if (!c7a.a(j4, ((c7a) ((eoh) q50Var.e).getValue()).a) || z) {
                    pjhVar3.b = ((c7a) q50Var.d()).a;
                    pjhVar2 = pjhVar3;
                    xw3.L(Y0(), null, null, new a74(pjhVar2, j4, this, (rq3) null, 5), 3);
                } else {
                    pjhVar2 = pjhVar3;
                }
                pjhVar = pjhVar2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = j3;
                pjhVar = new pjh(new q50(new c7a(j5), lz.m, new c7a(4294967297L), 8), j5);
            }
            ((eoh) e1dVar).setValue(pjhVar);
            d = cn3.d(j, ((c7a) pjhVar.a.d()).a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return m1c.G0(m1cVar, i, i2, new qjh(this, j2, i, i2, m1cVar, qheVar));
    }
}
