package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class axj {
    public final t01 a;
    public final axj b;
    public final String c;
    public final e1d d;
    public final e1d e;
    public final boh f = e.d(0);
    public final boh g = e.d(Long.MIN_VALUE);
    public final e1d h;
    public final SnapshotStateList i;
    public final SnapshotStateList j;
    public final e1d k;
    public final ay4 l;

    public axj(t01 t01Var, axj axjVar, String str) {
        this.a = t01Var;
        this.b = axjVar;
        this.c = str;
        this.d = e.f(t01Var.w());
        this.e = e.f(new uwj(t01Var.w(), t01Var.w()));
        Boolean bool = Boolean.FALSE;
        this.h = e.f(bool);
        this.i = new SnapshotStateList();
        this.j = new SnapshotStateList();
        this.k = e.f(bool);
        this.l = goh.b(new c7d(this, 2));
        t01Var.J(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Object obj, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(obj) : av8Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(this) ? 32 : 16;
        }
        int i3 = 18;
        int i4 = 0;
        if (!av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            av8Var.W();
        } else if (i()) {
            av8Var.d0(467722849);
            av8Var.s(false);
        } else {
            av8Var.d0(466062241);
            r(obj);
            int i5 = i2 & 112;
            Object[] objArr = i5 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (objArr != false || O == a99Var) {
                O = goh.b(new c7d(this, r4));
                av8Var.n0(O);
            }
            if (((Boolean) ((cdi) O).getValue()).booleanValue()) {
                av8Var.d0(466470356);
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = hz8.G(g.a, av8Var);
                    av8Var.n0(O2);
                }
                ku3 ku3Var = (ku3) O2;
                int i6 = (av8Var.i(ku3Var) ? 1 : 0) | (i5 != 32 ? 0 : 1);
                Object O3 = av8Var.O();
                if (i6 != 0 || O3 == a99Var) {
                    O3 = new mwj(i4, ku3Var, this);
                    av8Var.n0(O3);
                }
                hz8.b(ku3Var, this, (Function1) O3, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(467712929);
                av8Var.s(false);
            }
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(this, obj, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((vwj) snapshotStateList.get(i)).l.h());
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((axj) snapshotStateList2.get(i2)).b());
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            vwj vwjVar = (vwj) snapshotStateList.get(i);
            vwjVar.f = null;
            vwjVar.e = null;
            vwjVar.i = false;
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((axj) snapshotStateList2.get(i2)).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (((vwj) snapshotStateList.get(i)).e != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((axj) snapshotStateList2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        axj axjVar = this.b;
        return axjVar != null ? axjVar.e() : this.f.h();
    }

    public final twj f() {
        return (twj) ((eoh) this.e).getValue();
    }

    public final Object g() {
        return ((eoh) this.d).getValue();
    }

    public final long h() {
        return ((Number) this.l.getValue()).longValue();
    }

    public final boolean i() {
        return ((Boolean) ((eoh) this.k).getValue()).booleanValue();
    }

    public final void j(long j, boolean z) {
        boh bohVar = this.g;
        long h = bohVar.h();
        t01 t01Var = this.a;
        if (h == Long.MIN_VALUE) {
            bohVar.i(j);
            ((eoh) ((e1d) t01Var.b)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((eoh) ((e1d) t01Var.b)).getValue()).booleanValue()) {
            ((eoh) ((e1d) t01Var.b)).setValue(Boolean.TRUE);
        }
        ((eoh) this.h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            vwj vwjVar = (vwj) snapshotStateList.get(i);
            e1d e1dVar = vwjVar.g;
            e1d e1dVar2 = vwjVar.g;
            if (!((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
                long e = z ? vwjVar.c().e() : j;
                vwjVar.e(vwjVar.c().g(e));
                vwjVar.k = vwjVar.c().c(e);
                if (vwjVar.c().d(e)) {
                    ((eoh) e1dVar2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((eoh) e1dVar2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            axj axjVar = (axj) snapshotStateList2.get(i2);
            e1d e1dVar3 = axjVar.d;
            t01 t01Var2 = axjVar.a;
            if (!Intrinsics.c(((eoh) e1dVar3).getValue(), t01Var2.w())) {
                axjVar.j(j, z);
            }
            if (!Intrinsics.c(((eoh) axjVar.d).getValue(), t01Var2.w())) {
                z2 = false;
            }
        }
        if (z2) {
            k();
        }
    }

    public final void k() {
        this.g.i(Long.MIN_VALUE);
        t01 t01Var = this.a;
        if (t01Var instanceof h1d) {
            ((h1d) t01Var).I(((eoh) this.d).getValue());
        }
        p(0L);
        ((eoh) ((e1d) t01Var.b)).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((axj) snapshotStateList.get(i)).k();
        }
    }

    public final void l(float f) {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            vwj vwjVar = (vwj) snapshotStateList.get(i);
            vwjVar.getClass();
            if (f == -4.0f || f == -5.0f) {
                vti vtiVar = vwjVar.f;
                if (vtiVar != null) {
                    vwjVar.c().a(vtiVar.c);
                    vwjVar.e = null;
                    vwjVar.f = null;
                }
                Object obj = f == -4.0f ? vwjVar.c().d : vwjVar.c().c;
                vwjVar.c().a(obj);
                vwjVar.c().i(obj);
                vwjVar.e(obj);
                vwjVar.l.i(vwjVar.c().e());
            } else {
                vwjVar.h.i(f);
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((axj) snapshotStateList2.get(i2)).l(f);
        }
    }

    public final void m(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        t01 t01Var = this.a;
        ((eoh) ((e1d) t01Var.b)).setValue(Boolean.FALSE);
        boolean i = i();
        e1d e1dVar = this.d;
        if (!i || !Intrinsics.c(t01Var.w(), obj) || !Intrinsics.c(((eoh) e1dVar).getValue(), obj2)) {
            if (!Intrinsics.c(t01Var.w(), obj) && (t01Var instanceof h1d)) {
                ((h1d) t01Var).I(obj);
            }
            ((eoh) e1dVar).setValue(obj2);
            ((eoh) this.k).setValue(Boolean.TRUE);
            ((eoh) this.e).setValue(new uwj(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            axj axjVar = (axj) snapshotStateList.get(i2);
            axjVar.getClass();
            if (axjVar.i()) {
                axjVar.m(axjVar.a.w(), ((eoh) axjVar.d).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((vwj) snapshotStateList2.get(i3)).d(0L);
        }
    }

    public final void n(long j) {
        boh bohVar = this.g;
        if (bohVar.h() == Long.MIN_VALUE) {
            bohVar.i(j);
        }
        p(j);
        ((eoh) this.h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((vwj) snapshotStateList.get(i)).d(j);
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            axj axjVar = (axj) snapshotStateList2.get(i2);
            if (!Intrinsics.c(((eoh) axjVar.d).getValue(), axjVar.a.w())) {
                axjVar.n(j);
            }
        }
    }

    public final void o(h0h h0hVar) {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            vwj vwjVar = (vwj) snapshotStateList.get(i);
            e1d e1dVar = vwjVar.j;
            if (!Intrinsics.c(vwjVar.c().c, vwjVar.c().d)) {
                vwjVar.f = vwjVar.c();
                vwjVar.e = h0hVar;
            }
            eoh eohVar = (eoh) e1dVar;
            ((eoh) vwjVar.d).setValue(new vti(vwjVar.n, vwjVar.a, eohVar.getValue(), eohVar.getValue(), vwjVar.k.c()));
            vwjVar.l.i(vwjVar.c().e());
            vwjVar.i = true;
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((axj) snapshotStateList2.get(i2)).o(h0hVar);
        }
    }

    public final void p(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void q() {
        vti vtiVar;
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            vwj vwjVar = (vwj) snapshotStateList.get(i);
            h0h h0hVar = vwjVar.e;
            if (h0hVar != null && (vtiVar = vwjVar.f) != null) {
                long c = wzb.c(h0hVar.g * h0hVar.d);
                Object g = vtiVar.g(c);
                if (vwjVar.i) {
                    vwjVar.c().i(g);
                }
                vwjVar.c().a(g);
                vwjVar.l.i(vwjVar.c().e());
                if (vwjVar.h.h() == -2.0f || vwjVar.i) {
                    vwjVar.e(g);
                } else {
                    vwjVar.d(vwjVar.o.e());
                }
                if (c >= h0hVar.g) {
                    vwjVar.e = null;
                    vwjVar.f = null;
                } else {
                    h0hVar.c = false;
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((axj) snapshotStateList2.get(i2)).q();
        }
    }

    public final void r(Object obj) {
        e1d e1dVar = this.d;
        eoh eohVar = (eoh) e1dVar;
        if (Intrinsics.c(eohVar.getValue(), obj)) {
            return;
        }
        ((eoh) this.e).setValue(new uwj(eohVar.getValue(), obj));
        t01 t01Var = this.a;
        if (!Intrinsics.c(t01Var.w(), eohVar.getValue())) {
            t01Var.I(eohVar.getValue());
        }
        ((eoh) e1dVar).setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            ((eoh) this.h).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((vwj) snapshotStateList.get(i)).h.i(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((vwj) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }
}
