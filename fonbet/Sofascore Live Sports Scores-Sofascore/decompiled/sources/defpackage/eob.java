package defpackage;

import android.view.View;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eob extends wtc implements a09, ga5, p3h, tkd {
    public ay4 B;
    public c7a D;
    public g62 E;
    public Function1 o;
    public Function1 p;
    public rie w;
    public View x;
    public kx4 y;
    public qie z;
    public float q = Float.NaN;
    public boolean r = true;
    public long s = 9205357640488583168L;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public boolean v = true;
    public final e1d A = e.e(null, f7a.k);
    public long C = 9205357640488583168L;

    public eob(Function1 function1, Function1 function12, rie rieVar) {
        this.o = function1;
        this.p = function12;
        this.w = rieVar;
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        ((eoh) this.A).setValue(dmaVar);
    }

    @Override // defpackage.tkd
    public final void Z() {
        z1a.R(this, new dob(this, 0));
    }

    @Override // defpackage.wtc
    public final void c1() {
        Z();
        this.E = ml4.g(0, 7, null);
        xw3.L(Y0(), null, nu3.d, new ppa(this, null, 6), 1);
    }

    @Override // defpackage.wtc
    public final void d1() {
        qie qieVar = this.z;
        if (qieVar != null) {
            ((sie) qieVar).b();
        }
        this.z = null;
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        b4hVar.a(fob.a, new dob(this, 1));
    }

    public final long k1() {
        ay4 ay4Var = this.B;
        if (ay4Var == null) {
            ay4Var = goh.b(new dob(this, 2));
            this.B = ay4Var;
        }
        return ((dnd) ay4Var.getValue()).a;
    }

    public final void l1() {
        qie qieVar = this.z;
        if (qieVar != null) {
            ((sie) qieVar).b();
        }
        View view = this.x;
        if (view == null) {
            view = pco.N(this);
        }
        View view2 = view;
        this.x = view2;
        kx4 kx4Var = this.y;
        if (kx4Var == null) {
            kx4Var = c6o.c0(this).y;
        }
        kx4 kx4Var2 = kx4Var;
        this.y = kx4Var2;
        this.z = this.w.b(view2, this.r, this.s, this.t, this.u, this.v, kx4Var2, this.q);
        n1();
    }

    public final void m1() {
        kx4 kx4Var = this.y;
        if (kx4Var == null) {
            kx4Var = c6o.c0(this).y;
            this.y = kx4Var;
        }
        long j = ((dnd) this.o.invoke(kx4Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & k1()) == 9205357640488583168L) {
            this.C = 9205357640488583168L;
            qie qieVar = this.z;
            if (qieVar != null) {
                ((sie) qieVar).b();
                return;
            }
            return;
        }
        this.C = dnd.i(k1(), j);
        if (this.z == null) {
            l1();
        }
        qie qieVar2 = this.z;
        if (qieVar2 != null) {
            qieVar2.a(this.C, 9205357640488583168L, this.q);
        }
        n1();
    }

    public final void n1() {
        kx4 kx4Var;
        qie qieVar = this.z;
        if (qieVar == null || (kx4Var = this.y) == null) {
            return;
        }
        sie sieVar = (sie) qieVar;
        long c = sieVar.c();
        c7a c7aVar = this.D;
        if (c7aVar != null && c == c7aVar.a) {
            return;
        }
        Function1 function1 = this.p;
        if (function1 != null) {
            function1.invoke(new s75(kx4Var.v(d7a.I(sieVar.c()))));
        }
        this.D = new c7a(sieVar.c());
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        ymaVar.a();
        g62 g62Var = this.E;
        if (g62Var != null) {
            g62Var.d(Unit.a);
        }
    }
}
