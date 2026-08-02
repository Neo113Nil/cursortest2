package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ty2 extends bml {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final jij r;
    public py2 s;
    public ry2 t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty2(a51 a51Var, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(a51Var);
        a51Var.getClass();
        qx9.r(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new jij();
    }

    @Override // defpackage.a51
    public final v6c a(rcc rccVar, zz0 zz0Var, long j) {
        my2 my2Var = new my2(this.k.a(rccVar, zz0Var, j), this.n, this.u, this.v);
        this.q.add(my2Var);
        return my2Var;
    }

    @Override // defpackage.eg3, defpackage.a51
    public final void i() {
        ry2 ry2Var = this.t;
        if (ry2Var != null) {
            throw ry2Var;
        }
        super.i();
    }

    @Override // defpackage.a51
    public final void m(v6c v6cVar) {
        ArrayList arrayList = this.q;
        qx9.t(arrayList.remove(v6cVar));
        this.k.m(((my2) v6cVar).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        py2 py2Var = this.s;
        py2Var.getClass();
        z(py2Var.b);
    }

    @Override // defpackage.eg3, defpackage.a51
    public final void o() {
        super.o();
        this.t = null;
        this.s = null;
    }

    @Override // defpackage.bml
    public final void x(lij lijVar) {
        if (this.t != null) {
            return;
        }
        z(lijVar);
    }

    public final void z(lij lijVar) {
        long j;
        long j2;
        long j3;
        jij jijVar = this.r;
        lijVar.n(0, jijVar);
        long j4 = jijVar.o;
        py2 py2Var = this.s;
        long j5 = this.m;
        ArrayList arrayList = this.q;
        if (py2Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = jijVar.k;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.u = j4 + j;
            this.v = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                my2 my2Var = (my2) arrayList.get(i);
                long j7 = this.u;
                long j8 = this.v;
                my2Var.e = j7;
                my2Var.f = j8;
            }
            j3 = j2;
        } else {
            j = this.u - j4;
            j3 = j5 != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
        }
        try {
            py2 py2Var2 = new py2(lijVar, j, j3);
            this.s = py2Var2;
            l(py2Var2);
        } catch (ry2 e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((my2) arrayList.get(i2)).g = this.t;
            }
        }
    }
}
