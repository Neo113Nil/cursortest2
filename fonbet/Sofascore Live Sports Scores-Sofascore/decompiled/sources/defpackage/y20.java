package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y20 extends wtc implements k5g, ug3, ga5, ula {
    public final wzc o;
    public final boolean p;
    public final float q;
    public final c23 r;
    public final Function0 s;
    public n72 t;
    public float u;
    public boolean w;
    public j5g y;
    public l5g z;
    public long v = 0;
    public final l0d x = new l0d();

    public y20(wzc wzcVar, boolean z, float f, c23 c23Var, Function0 function0) {
        this.o = wzcVar;
        this.p = z;
        this.q = f;
        this.r = c23Var;
        this.s = function0;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.ula, defpackage.o1c
    public final void c(long j) {
        this.w = true;
        kx4 kx4Var = c6o.c0(this).y;
        this.v = d7a.I(j);
        float f = this.q;
        this.u = Float.isNaN(f) ? v7a.v(kx4Var, this.p, this.v) : kx4Var.H0(f);
        l0d l0dVar = this.x;
        Object[] objArr = l0dVar.a;
        int i = l0dVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            k1((n6f) objArr[i2]);
        }
        l0dVar.d();
    }

    @Override // defpackage.wtc
    public final void c1() {
        xw3.L(Y0(), null, null, new gje(this, null, 20), 3);
    }

    @Override // defpackage.wtc
    public final void d1() {
        j5g j5gVar = this.y;
        if (j5gVar != null) {
            z0();
            gp5 gp5Var = j5gVar.d;
            l5g l5gVar = (l5g) gp5Var.a.get(this);
            if (l5gVar != null) {
                l5gVar.c();
                LinkedHashMap linkedHashMap = gp5Var.a;
                l5g l5gVar2 = (l5g) linkedHashMap.get(this);
                if (l5gVar2 != null) {
                }
                linkedHashMap.remove(this);
                j5gVar.c.add(l5gVar);
            }
        }
    }

    public final void k1(n6f n6fVar) {
        l5g l5gVar;
        if (!(n6fVar instanceof l6f)) {
            if (n6fVar instanceof m6f) {
                l5g l5gVar2 = this.z;
                if (l5gVar2 != null) {
                    l5gVar2.d();
                    return;
                }
                return;
            }
            if (!(n6fVar instanceof k6f) || (l5gVar = this.z) == null) {
                return;
            }
            l5gVar.d();
            return;
        }
        l6f l6fVar = (l6f) n6fVar;
        long j = this.v;
        float f = this.u;
        j5g j5gVar = this.y;
        if (j5gVar == null) {
            j5gVar = v8a.p(v8a.q((View) tgj.x(this, nz.f)));
            this.y = j5gVar;
        }
        l5g a = j5gVar.a(this);
        a.b(l6fVar, this.p, j, wzb.b(f), this.r.a(), ((g5g) this.s.invoke()).d, new z0(this, 14));
        this.z = a;
        n9e.E(this);
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        ymaVar.a();
        n72 n72Var = this.t;
        if (n72Var != null) {
            n72Var.b(ymaVar, this.u, this.r.a());
        }
        uj2 t = ymaVar.a.b.t();
        l5g l5gVar = this.z;
        if (l5gVar != null) {
            long j = this.v;
            int b = wzb.b(this.u);
            l5gVar.e(((g5g) this.s.invoke()).d, j, this.r.a(), b);
            l5gVar.draw(xx.b(t));
        }
    }

    @Override // defpackage.k5g
    public final void z0() {
        this.z = null;
        n9e.E(this);
    }
}
