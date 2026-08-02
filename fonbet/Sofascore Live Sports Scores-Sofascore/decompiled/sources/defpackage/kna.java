package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kna implements qe3 {
    public final wma a;
    public mg3 b;
    public aki c;
    public int d;
    public int e;
    public final x0d f;
    public final x0d g;
    public final ena h;
    public final bna i;
    public final x0d j;
    public final zji k;
    public final x0d l;
    public final i1d m;
    public int n;
    public int o;
    public final String p;

    public kna(wma wmaVar, aki akiVar) {
        this.a = wmaVar;
        this.c = akiVar;
        long[] jArr = qrg.a;
        this.f = new x0d();
        this.g = new x0d();
        this.h = new ena(this);
        this.i = new bna(this);
        this.j = new x0d();
        this.k = new zji();
        this.l = new x0d();
        this.m = new i1d(new Object[16], 0);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void c(cna cnaVar) {
        y0d y0dVar;
        fce fceVar = cnaVar.f;
        if (fceVar != null) {
            fceVar.h.set(hce.b);
            qn2 qn2Var = fceVar.k;
            if (((y0d) qn2Var.d).h()) {
                y0dVar = (y0d) qn2Var.d;
                y0d y0dVar2 = rrg.a;
                qn2Var.d = new y0d();
                ((i1d) qn2Var.c).n();
            } else {
                y0dVar = null;
            }
            qn2Var.e();
            sg3 sg3Var = fceVar.a;
            sg3Var.q = null;
            if (y0dVar != null) {
                sg3Var.u.k = y0dVar;
                sg3Var.w = 2;
            }
            cnaVar.f = null;
            sg3 sg3Var2 = cnaVar.c;
            if (sg3Var2 != null) {
                sg3Var2.d();
            }
            cnaVar.c = null;
        }
    }

    @Override // defpackage.qe3
    public final void a() {
        j(true);
    }

    public final void b(cna cnaVar, boolean z) {
        fce fceVar = cnaVar.f;
        if (fceVar != null) {
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                wma wmaVar = this.a;
                wmaVar.q = true;
                if (z) {
                    while (!fceVar.c()) {
                        try {
                            fceVar.e(new sw9(16));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                fceVar.a();
                cnaVar.f = null;
                Unit unit = Unit.a;
                wmaVar.q = false;
            } finally {
                bea.K(w, C, e);
            }
        }
    }

    public final vji d(Object obj) {
        return !this.a.H() ? new hna() : new ina(this, obj);
    }

    @Override // defpackage.qe3
    public final void e() {
        j(false);
    }

    @Override // defpackage.qe3
    public final void f() {
        sg3 sg3Var;
        wma wmaVar = this.a;
        wmaVar.q = true;
        x0d x0dVar = this.f;
        Object[] objArr = x0dVar.c;
        long[] jArr = x0dVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (sg3Var = ((cna) objArr[(i << 3) + i3]).c) != null) {
                            sg3Var.d();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        wmaVar.P();
        Unit unit = Unit.a;
        wmaVar.q = false;
        x0dVar.a();
        this.g.a();
        this.o = 0;
        this.n = 0;
        this.j.a();
        i();
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        List p = this.a.p();
        j0d j0dVar = (j0d) p;
        int i2 = (((i1d) j0dVar.b).c - this.o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.f.g((wma) j0dVar.get(i3));
                    g.getClass();
                    ((m0d) this.k.b).a(((cna) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.h(this.k);
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            z = false;
            while (i2 >= i) {
                try {
                    wma wmaVar = (wma) ((j0d) p).get(i2);
                    Object g2 = this.f.g(wmaVar);
                    g2.getClass();
                    cna cnaVar = (cna) g2;
                    Object obj = cnaVar.a;
                    if (((m0d) this.k.b).c(obj)) {
                        this.n++;
                        if (((Boolean) ((eoh) cnaVar.g).getValue()).booleanValue()) {
                            ana anaVar = wmaVar.G;
                            j1c j1cVar = anaVar.p;
                            uma umaVar = uma.c;
                            j1cVar.l = umaVar;
                            zkb zkbVar = anaVar.q;
                            if (zkbVar != null) {
                                zkbVar.j = umaVar;
                            }
                            m(cnaVar, false);
                            if (cnaVar.h) {
                                z = true;
                            }
                        }
                    } else {
                        wma wmaVar2 = this.a;
                        wmaVar2.q = true;
                        this.f.k(wmaVar);
                        sg3 sg3Var = cnaVar.c;
                        if (sg3Var != null) {
                            sg3Var.d();
                        }
                        this.a.Q(i2, 1);
                        Unit unit = Unit.a;
                        wmaVar2.q = false;
                    }
                    this.g.k(obj);
                    i2--;
                } catch (Throwable th) {
                    bea.K(w, C, e);
                    throw th;
                }
            }
            Unit unit2 = Unit.a;
            bea.K(w, C, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (snh.c) {
                y0d y0dVar = snh.j.h;
                if (y0dVar != null) {
                    if (y0dVar.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                snh.c();
            }
        }
        i();
    }

    public final void h(Object obj) {
        i();
        wma wmaVar = (wma) this.j.k(obj);
        wma wmaVar2 = this.a;
        if (wmaVar != null) {
            if (this.o <= 0) {
                r3a.b("No pre-composed items to dispose");
            }
            int p = ((i1d) ((j0d) wmaVar2.p()).b).p(wmaVar);
            if (p < ((i1d) ((j0d) wmaVar2.p()).b).c - this.o) {
                r3a.b("Item is not in pre-composed item range");
            }
            this.n++;
            this.o--;
            cna cnaVar = (cna) this.f.g(wmaVar);
            if (cnaVar != null) {
                c(cnaVar);
            }
            int i = (((i1d) ((j0d) wmaVar2.p()).b).c - this.o) - this.n;
            k(p, i);
            g(i);
        }
        if (this.m.o(obj)) {
            wma.V(wmaVar2, true, 6);
        }
    }

    public final void i() {
        int i = ((i1d) ((j0d) this.a.p()).b).c;
        x0d x0dVar = this.f;
        if (x0dVar.e != i) {
            r3a.a("Inconsistency between the count of nodes tracked by the state (" + x0dVar.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.n) - this.o < 0) {
            StringBuilder t = lnb.t(i, "Incorrect state. Total children ", ". Reusable children ");
            t.append(this.n);
            t.append(". Precomposed children ");
            t.append(this.o);
            r3a.a(t.toString());
        }
        x0d x0dVar2 = this.j;
        if (x0dVar2.e == this.o) {
            return;
        }
        r3a.a("Incorrect state. Precomposed children " + this.o + ". Map size " + x0dVar2.e);
    }

    public final void j(boolean z) {
        this.o = 0;
        this.j.a();
        List p = this.a.p();
        int i = ((i1d) ((j0d) p).b).c;
        if (this.n != i) {
            this.n = i;
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    wma wmaVar = (wma) ((j0d) p).get(i2);
                    cna cnaVar = (cna) this.f.g(wmaVar);
                    if (cnaVar != null && ((Boolean) ((eoh) cnaVar.g).getValue()).booleanValue()) {
                        ana anaVar = wmaVar.G;
                        j1c j1cVar = anaVar.p;
                        uma umaVar = uma.c;
                        j1cVar.l = umaVar;
                        zkb zkbVar = anaVar.q;
                        if (zkbVar != null) {
                            zkbVar.j = umaVar;
                        }
                        m(cnaVar, z);
                        cnaVar.a = rz8.j;
                    }
                } catch (Throwable th) {
                    bea.K(w, C, e);
                    throw th;
                }
            }
            Unit unit = Unit.a;
            bea.K(w, C, e);
            this.g.a();
        }
        i();
    }

    public final void k(int i, int i2) {
        wma wmaVar = this.a;
        wmaVar.q = true;
        wmaVar.L(i, i2, 1);
        Unit unit = Unit.a;
        wmaVar.q = false;
    }

    public final void l(Object obj, Function2 function2, boolean z) {
        wma wmaVar = this.a;
        if (wmaVar.H()) {
            i();
            if (this.g.c(obj)) {
                return;
            }
            this.l.k(obj);
            x0d x0dVar = this.j;
            Object g = x0dVar.g(obj);
            if (g == null) {
                g = o(obj);
                if (g != null) {
                    k(((i1d) ((j0d) wmaVar.p()).b).p(g), ((i1d) ((j0d) wmaVar.p()).b).c);
                    this.o++;
                } else {
                    int i = ((i1d) ((j0d) wmaVar.p()).b).c;
                    wma wmaVar2 = new wma(2);
                    wmaVar.q = true;
                    wmaVar.B(i, wmaVar2);
                    Unit unit = Unit.a;
                    wmaVar.q = false;
                    this.o++;
                    g = wmaVar2;
                }
                x0dVar.m(obj, g);
            }
            n((wma) g, obj, z, function2);
        }
    }

    public final void m(cna cnaVar, boolean z) {
        sg3 sg3Var;
        if (z || !cnaVar.h) {
            cnaVar.g = e.f(Boolean.FALSE);
        } else {
            ((eoh) cnaVar.g).setValue(Boolean.FALSE);
        }
        if (cnaVar.f != null) {
            c(cnaVar);
            return;
        }
        if (z) {
            sg3 sg3Var2 = cnaVar.c;
            if (sg3Var2 != null) {
                sg3Var2.p();
                return;
            }
            return;
        }
        owd outOfFrameExecutor = ((xy) zma.a(this.a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (cnaVar.h || (sg3Var = cnaVar.c) == null) {
                return;
            }
            sg3Var.p();
            return;
        }
        hv7 hv7Var = new hv7(cnaVar, 12);
        xy xyVar = (xy) outOfFrameExecutor;
        vg0 vg0Var = xyVar.i;
        boolean isEmpty = vg0Var.isEmpty();
        vg0Var.addLast(hv7Var);
        if (isEmpty) {
            Handler handler = xyVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(xyVar.j);
            } else {
                a70.p("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:41:0x0083, B:46:0x00ad, B:48:0x00bf, B:50:0x00d3, B:52:0x00d7, B:53:0x010d, B:56:0x00e4, B:57:0x00ef, B:59:0x00f3, B:60:0x010a, B:61:0x00c2, B:64:0x0092, B:66:0x00a0, B:67:0x0119, B:68:0x0123), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:41:0x0083, B:46:0x00ad, B:48:0x00bf, B:50:0x00d3, B:52:0x00d7, B:53:0x010d, B:56:0x00e4, B:57:0x00ef, B:59:0x00f3, B:60:0x010a, B:61:0x00c2, B:64:0x0092, B:66:0x00a0, B:67:0x0119, B:68:0x0123), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:41:0x0083, B:46:0x00ad, B:48:0x00bf, B:50:0x00d3, B:52:0x00d7, B:53:0x010d, B:56:0x00e4, B:57:0x00ef, B:59:0x00f3, B:60:0x010a, B:61:0x00c2, B:64:0x0092, B:66:0x00a0, B:67:0x0119, B:68:0x0123), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:41:0x0083, B:46:0x00ad, B:48:0x00bf, B:50:0x00d3, B:52:0x00d7, B:53:0x010d, B:56:0x00e4, B:57:0x00ef, B:59:0x00f3, B:60:0x010a, B:61:0x00c2, B:64:0x0092, B:66:0x00a0, B:67:0x0119, B:68:0x0123), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(wma wmaVar, Object obj, boolean z, Function2 function2) {
        boolean z2;
        sg3 sg3Var;
        x0d x0dVar = this.f;
        Object g = x0dVar.g(wmaVar);
        Object obj2 = g;
        if (g == null) {
            tc3 tc3Var = wd3.a;
            cna cnaVar = new cna();
            cnaVar.a = obj;
            cnaVar.b = tc3Var;
            cnaVar.c = null;
            cnaVar.g = e.f(Boolean.TRUE);
            x0dVar.m(wmaVar, cnaVar);
            obj2 = cnaVar;
        }
        cna cnaVar2 = (cna) obj2;
        boolean z3 = cnaVar2.b != function2;
        if (cnaVar2.f != null) {
            if (z3) {
                c(cnaVar2);
            } else if (z) {
                return;
            } else {
                b(cnaVar2, true);
            }
        }
        sg3 sg3Var2 = cnaVar2.c;
        if (sg3Var2 != null) {
            synchronized (sg3Var2.d) {
                z2 = sg3Var2.n.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || cnaVar2.d) {
            cnaVar2.b = function2;
            if (cnaVar2.f != null) {
                r3a.a("new subcompose call while paused composition is still active");
            }
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                wma wmaVar2 = this.a;
                wmaVar2.q = true;
                sg3 sg3Var3 = cnaVar2.c;
                mg3 mg3Var = this.b;
                if (mg3Var == null) {
                    r3a.c("parent composition reference not set");
                    throw new fka();
                }
                int i = 3;
                if (sg3Var3 != null) {
                    if (sg3Var3.w == 3) {
                    }
                    cnaVar2.c = sg3Var3;
                    Function2 function22 = cnaVar2.b;
                    if (((xy) zma.a(this.a)).getOutOfFrameExecutor() == null) {
                        cnaVar2.h = false;
                    } else {
                        cnaVar2.h = true;
                        function22 = new tc3(1524156494, new sz(i, cnaVar2, function22), true);
                    }
                    if (z) {
                        if (cnaVar2.e) {
                            sg3Var3.m();
                            sg3Var3.t();
                            av8 av8Var = sg3Var3.v;
                            av8Var.z = 0;
                            av8Var.y = true;
                            sg3Var3.x = function22;
                            sg3Var3.a.a(sg3Var3, function22);
                            av8Var.v();
                        } else {
                            sg3Var3.B(function22);
                        }
                    } else if (cnaVar2.e) {
                        sg3Var3.m();
                        sg3Var3.t();
                        cnaVar2.f = sg3Var3.o(true, function22);
                    } else {
                        cnaVar2.f = sg3Var3.o(sg3Var3.m(), function22);
                    }
                    cnaVar2.e = false;
                    Unit unit = Unit.a;
                    wmaVar2.q = false;
                    bea.K(w, C, e);
                    cnaVar2.d = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = aml.a;
                    sg3Var = new sg3(mg3Var, new a9k(wmaVar));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = aml.a;
                    sg3Var = new sg3(mg3Var, new a9k(wmaVar));
                }
                sg3Var3 = sg3Var;
                cnaVar2.c = sg3Var3;
                Function2 function222 = cnaVar2.b;
                if (((xy) zma.a(this.a)).getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                cnaVar2.e = false;
                Unit unit2 = Unit.a;
                wmaVar2.q = false;
                bea.K(w, C, e);
                cnaVar2.d = false;
            } catch (Throwable th) {
                bea.K(w, C, e);
                throw th;
            }
        }
    }

    public final wma o(Object obj) {
        x0d x0dVar;
        int i;
        if (this.n == 0) {
            return null;
        }
        j0d j0dVar = (j0d) this.a.p();
        int i2 = ((i1d) j0dVar.b).c - this.o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            x0dVar = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = x0dVar.g((wma) j0dVar.get(i5));
            g.getClass();
            if (Intrinsics.c(((cna) g).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object g2 = x0dVar.g((wma) j0dVar.get(i4));
                g2.getClass();
                cna cnaVar = (cna) g2;
                Object obj2 = cnaVar.a;
                if (obj2 == rz8.j || this.c.j(obj, obj2)) {
                    cnaVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            k(i5, i3);
        }
        this.n--;
        wma wmaVar = (wma) j0dVar.get(i3);
        Object g3 = x0dVar.g(wmaVar);
        g3.getClass();
        cna cnaVar2 = (cna) g3;
        cnaVar2.g = e.f(Boolean.TRUE);
        cnaVar2.e = true;
        cnaVar2.d = true;
        return wmaVar;
    }
}
