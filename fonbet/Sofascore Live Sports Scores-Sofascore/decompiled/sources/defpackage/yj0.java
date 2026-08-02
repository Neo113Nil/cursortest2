package defpackage;

import android.os.Trace;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yj0 extends d7e implements swf {
    public static final dt v = new dt(21);
    public ay1 h;
    public boolean i;
    public yda j;
    public ku3 l;
    public Function1 n;
    public dk0 q;
    public ij0 r;
    public final fdi s;
    public final fdi t;
    public final jof u;
    public final e1d f = e.f(null);
    public float g = 1.0f;
    public long k = 9205357640488583168L;
    public Function1 m = v;
    public op3 o = mp3.b;
    public int p = 1;

    public yj0(ij0 ij0Var) {
        this.r = ij0Var;
        this.s = gdi.a(ij0Var);
        fdi a = gdi.a(jj0.a);
        this.t = a;
        this.u = un0.u(a);
    }

    @Override // defpackage.swf
    public final void a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object k = k();
            swf swfVar = k instanceof swf ? (swf) k : null;
            if (swfVar != null) {
                swfVar.a();
            }
            l();
            this.i = true;
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.swf
    public final void b() {
        yda ydaVar = this.j;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.j = null;
        Object k = k();
        swf swfVar = k instanceof swf ? (swf) k : null;
        if (swfVar != null) {
            swfVar.b();
        }
        this.i = false;
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        this.g = f;
        return true;
    }

    @Override // defpackage.swf
    public final void d() {
        yda ydaVar = this.j;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.j = null;
        Object k = k();
        swf swfVar = k instanceof swf ? (swf) k : null;
        if (swfVar != null) {
            swfVar.d();
        }
        this.i = false;
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        this.h = ay1Var;
        return true;
    }

    @Override // defpackage.d7e
    public final long i() {
        d7e k = k();
        if (k != null) {
            return k.i();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        long n = ha5Var.n();
        if (!njh.c(this.k, n)) {
            this.k = n;
        }
        d7e k = k();
        if (k != null) {
            k.g(ha5Var, ha5Var.n(), this.g, this.h);
        }
    }

    public final d7e k() {
        return (d7e) ((eoh) this.f).getValue();
    }

    public final void l() {
        ij0 ij0Var = this.r;
        if (ij0Var == null) {
            return;
        }
        ku3 ku3Var = this.l;
        rq3 rq3Var = null;
        if (ku3Var == null) {
            Intrinsics.i("scope");
            throw null;
        }
        g2 g2Var = new g2(this, ij0Var, rq3Var, 9);
        CoroutineContext coroutineContext = ku3Var.getCoroutineContext();
        int i = bjk.b;
        CoroutineContext.Element element = coroutineContext.get(d.Q7);
        au3 au3Var = element instanceof au3 ? (au3) element : null;
        g9i K = (au3Var == null || au3Var.equals(z45.b)) ? xw3.K(ku3Var, z45.b, nu3.d, g2Var) : xw3.K(s9a.c(new bv4(ku3Var.getCoroutineContext())), new cv4(au3Var), nu3.d, g2Var);
        yda ydaVar = this.j;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.j = K;
    }

    public final void m(ij0 ij0Var) {
        if (Intrinsics.c(this.r, ij0Var)) {
            return;
        }
        this.r = ij0Var;
        if (ij0Var == null) {
            yda ydaVar = this.j;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            this.j = null;
        } else if (this.i) {
            l();
        }
        if (ij0Var != null) {
            fdi fdiVar = this.s;
            fdiVar.getClass();
            fdiVar.m(null, ij0Var);
        }
    }

    public final nt9 n(nt9 nt9Var, boolean z) {
        ht9 a = nt9.a(nt9Var);
        a.d = new f4a(nt9Var, this, false, 23);
        kt9 kt9Var = nt9Var.w;
        if (kt9Var.f == null) {
            a.p = gkh.y7;
        }
        if (kt9Var.g == null) {
            op3 op3Var = this.o;
            int i = bjk.b;
            a.q = (Intrinsics.c(op3Var, mp3.b) || Intrinsics.c(op3Var, mp3.e)) ? jrg.b : jrg.a;
        }
        if (kt9Var.h == null) {
            a.r = e3f.b;
        }
        if (z) {
            g gVar = g.a;
            a.j = gVar;
            a.k = gVar;
            a.l = gVar;
        }
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(rj0 rj0Var) {
        wt9 wt9Var;
        d7e d7eVar;
        Function1 function1;
        fdi fdiVar = this.t;
        rj0 rj0Var2 = (rj0) fdiVar.getValue();
        rj0 rj0Var3 = (rj0) this.m.invoke(rj0Var);
        fdiVar.l(rj0Var3);
        op3 op3Var = this.o;
        if (!(rj0Var3 instanceof pj0)) {
            if (rj0Var3 instanceof lj0) {
                wt9Var = ((lj0) rj0Var3).b;
            }
            d7eVar = null;
            if (d7eVar == null) {
                d7eVar = rj0Var3.a();
            }
            ((eoh) this.f).setValue(d7eVar);
            if (rj0Var2.a() != rj0Var3.a()) {
                Object a = rj0Var2.a();
                swf swfVar = a instanceof swf ? (swf) a : null;
                if (swfVar != null) {
                    swfVar.d();
                }
                Object a2 = rj0Var3.a();
                swf swfVar2 = a2 instanceof swf ? (swf) a2 : null;
                if (swfVar2 != null) {
                    swfVar2.a();
                }
            }
            function1 = this.n;
            if (function1 != null) {
                function1.invoke(rj0Var3);
                return;
            }
            return;
        }
        wt9Var = ((pj0) rj0Var3).b;
        zwj a3 = ((qwj) fqj.w(wt9Var.a(), vt9.a)).a(z8e.a, wt9Var);
        if (a3 instanceof i24) {
            d7e a4 = rj0Var2.a();
            if (!(rj0Var2 instanceof nj0)) {
                a4 = null;
            }
            d7e a5 = rj0Var3.a();
            wd5 wd5Var = xd5.b;
            d7eVar = new e24(a4, a5, op3Var, wkn.R(((i24) a3).c, be5.MILLISECONDS), ((wt9Var instanceof emi) && ((emi) wt9Var).g) ? false : true, ((Boolean) fqj.w(wt9Var.a(), tt9.b)).booleanValue());
            if (d7eVar == null) {
            }
            ((eoh) this.f).setValue(d7eVar);
            if (rj0Var2.a() != rj0Var3.a()) {
            }
            function1 = this.n;
            if (function1 != null) {
            }
        }
        d7eVar = null;
        if (d7eVar == null) {
        }
        ((eoh) this.f).setValue(d7eVar);
        if (rj0Var2.a() != rj0Var3.a()) {
        }
        function1 = this.n;
        if (function1 != null) {
        }
    }
}
