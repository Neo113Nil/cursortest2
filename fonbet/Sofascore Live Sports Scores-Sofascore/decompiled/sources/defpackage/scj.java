package defpackage;

import android.view.View;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class scj {
    public final y3g a;
    public l9j b;
    public final e1d c;
    public final e1d d;
    public final e1d e;
    public final d4a f;
    public final i1d g;

    public scj(String str, long j, y3g y3gVar) {
        this.a = y3gVar;
        this.b = new l9j(new m9j(str, t6a.q(str.length(), j), null, null, null, null, 60), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = e.f(bool);
        this.d = e.f(new m9j(str, j, null, null, null, null, 60));
        this.e = e.f(bool);
        this.f = new d4a(this, 21);
        this.g = new i1d(new b40[16], 0);
    }

    public final void a(l9j l9jVar) {
        boolean z = ((i1d) l9jVar.a().b).c > 0;
        boolean c = true ^ pej.c(l9jVar.e, this.b.e);
        if (z) {
            d(c(), l9j.g(l9jVar, 0L, null, 15), l9jVar.a(), haj.b);
        }
        g(l9jVar, z, c);
    }

    public final void b(q4a q4aVar, boolean z, haj hajVar) {
        m9j c = c();
        if (((i1d) this.b.a().b).c == 0 && pej.c(c.d, this.b.e)) {
            if (Intrinsics.c(c.e, this.b.f) && Intrinsics.c(c.f, this.b.h) && Intrinsics.c(c.a, this.b.g)) {
                return;
            }
            m9j c2 = c();
            String mo2Var = this.b.c.toString();
            l9j l9jVar = this.b;
            long j = l9jVar.e;
            pej pejVar = l9jVar.f;
            h(c2, new m9j(mo2Var, j, pejVar, l9jVar.h, w1a.q(pejVar, l9jVar.g), null, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((i1d) this.b.a().b).c != 0;
        String mo2Var2 = this.b.c.toString();
        l9j l9jVar2 = this.b;
        long j2 = l9jVar2.e;
        pej pejVar2 = l9jVar2.f;
        m9j m9jVar = new m9j(mo2Var2, j2, pejVar2, l9jVar2.h, w1a.q(pejVar2, l9jVar2.g), null, 32);
        if (q4aVar == null) {
            if (z3 && z) {
                z2 = true;
            }
            h(c, m9jVar, z2);
            d(c, m9jVar, this.b.a(), hajVar);
            return;
        }
        l9j l9jVar3 = new l9j(m9jVar, this.b.a(), c, null, 8);
        q4aVar.j(l9jVar3);
        boolean j3 = c.j(l9jVar3.c, m9jVar);
        boolean z4 = !j3;
        boolean c3 = pej.c(l9jVar3.e, m9jVar.d);
        boolean z5 = !c3;
        if (j3 && c3) {
            h(c, l9j.g(l9jVar3, 0L, m9jVar.e, 13), z);
        } else {
            g(l9jVar3, z4, z5);
        }
        d(c, c(), l9jVar3.a(), hajVar);
    }

    public final m9j c() {
        return (m9j) ((eoh) this.d).getValue();
    }

    public final void d(m9j m9jVar, m9j m9jVar2, z41 z41Var, haj hajVar) {
        int ordinal = hajVar.ordinal();
        y3g y3gVar = this.a;
        if (ordinal == 0) {
            v7a.A(y3gVar, m9jVar, m9jVar2, z41Var, true);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                v7a.A(y3gVar, m9jVar, m9jVar2, z41Var, false);
                return;
            } else {
                zzl.b();
                return;
            }
        }
        ((eoh) ((e1d) y3gVar.c)).setValue(null);
        z9k z9kVar = (z9k) y3gVar.b;
        z9kVar.b.clear();
        z9kVar.c.clear();
    }

    public final void e(boolean z) {
        ((eoh) this.e).setValue(Boolean.valueOf(z));
    }

    public final l9j f() {
        e1d e1dVar = this.c;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            if (((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
                u3a.c("TextFieldState does not support concurrent or nested editing.");
            }
            ((eoh) e1dVar).setValue(Boolean.TRUE);
            return new l9j(c(), null, null, null, 14);
        } finally {
            bea.K(w, C, e);
        }
    }

    public final void g(l9j l9jVar, boolean z, boolean z2) {
        m9j g = l9j.g(this.b, 0L, null, 15);
        if (z) {
            this.b = new l9j(new m9j(l9jVar.c.toString(), l9jVar.e, null, null, null, null, 60), null, null, null, 14);
        } else if (z2) {
            l9j l9jVar2 = this.b;
            long j = l9jVar.e;
            int i = pej.c;
            l9jVar2.f(t6a.g((int) (j >> 32), (int) (j & 4294967295L)));
        }
        if (z || z2 || !Intrinsics.c(g.e, l9jVar.f)) {
            this.b.e(null);
        }
        h(g, l9j.g(this.b, 0L, null, 15), true);
    }

    public final void h(m9j m9jVar, m9j m9jVar2, boolean z) {
        ((eoh) this.d).setValue(m9jVar2);
        i1d i1dVar = this.g;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            b40 b40Var = (b40) objArr[i2];
            boolean z2 = (!z || c.j(m9jVar.c, m9jVar2) || m9jVar.e == null) ? false : true;
            z41 z41Var = b40Var.a;
            long j = m9jVar.d;
            pej pejVar = m9jVar.e;
            long j2 = m9jVar2.d;
            pej pejVar2 = m9jVar2.e;
            if (z2) {
                z41Var.x().restartInput((View) z41Var.b);
            } else if (!pej.c(j, j2) || !Intrinsics.c(pejVar, pejVar2)) {
                z41Var.x().updateSelection((View) z41Var.b, pej.g(j2), pej.f(j2), pejVar2 != null ? pej.g(pejVar2.a) : -1, pejVar2 != null ? pej.f(pejVar2.a) : -1);
            }
        }
        e(false);
    }

    public final String toString() {
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            return "TextFieldState(selection=" + ((Object) pej.i(c().d)) + ", text=\"" + ((Object) c().c) + "\")";
        } finally {
            bea.K(w, C, e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public scj(String str) {
        this(str, t6a.g(r0, r0));
        int length = str.length();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public scj(String str, long j) {
        this(str, j, new y3g((kfj) null, new z9k(r2, r2, 100)));
        km5 km5Var = km5.a;
    }
}
