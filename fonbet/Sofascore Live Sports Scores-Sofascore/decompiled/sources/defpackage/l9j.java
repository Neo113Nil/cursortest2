package defpackage;

import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l9j implements Appendable {
    public final m9j a;
    public final e7a b;
    public final mo2 c;
    public z41 d;
    public long e;
    public pej f;
    public i1d g;
    public Pair h;

    public l9j(m9j m9jVar, z41 z41Var, m9j m9jVar2, e7a e7aVar, int i) {
        i1d i1dVar = null;
        z41Var = (i & 2) != 0 ? null : z41Var;
        m9jVar2 = (i & 4) != 0 ? m9jVar : m9jVar2;
        e7aVar = (i & 8) != 0 ? null : e7aVar;
        this.a = m9jVar2;
        this.b = e7aVar;
        mo2 mo2Var = new mo2();
        mo2Var.d = m9jVar;
        mo2Var.b = -1;
        mo2Var.c = -1;
        this.c = mo2Var;
        this.d = z41Var != null ? new z41(z41Var) : null;
        long j = m9jVar.d;
        List list = m9jVar.a;
        this.e = j;
        this.f = m9jVar.e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            p80[] p80VarArr = new p80[size];
            for (int i2 = 0; i2 < size; i2++) {
                p80VarArr[i2] = (p80) list.get(i2);
            }
            i1dVar = new i1d(p80VarArr, size);
        }
        this.g = i1dVar;
    }

    public static m9j g(l9j l9jVar, long j, pej pejVar, int i) {
        List list;
        if ((i & 1) != 0) {
            j = l9jVar.e;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            pejVar = l9jVar.f;
        }
        pej pejVar2 = pejVar;
        i1d i1dVar = l9jVar.g;
        if (i1dVar != null) {
            List m = i1dVar.m();
            if (!((j0d) m).isEmpty()) {
                list = m;
                return new m9j(l9jVar.c.toString(), j2, pejVar2, null, list, null, 8);
            }
        }
        list = null;
        return new m9j(l9jVar.c.toString(), j2, pejVar2, null, list, null, 8);
    }

    public final z41 a() {
        z41 z41Var = this.d;
        if (z41Var != null) {
            return z41Var;
        }
        z41 z41Var2 = new z41((z41) null);
        this.d = z41Var2;
        return z41Var2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            mo2 mo2Var = this.c;
            b(mo2Var.length(), mo2Var.length(), charSequence.length());
            mo2Var.a(mo2Var.length(), mo2Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        z41 a = a();
        if (i != i2 || i3 != 0) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            int i5 = i3 - (max - min);
            int i6 = 0;
            jn2 jn2Var = null;
            boolean z = false;
            while (true) {
                i1d i1dVar = (i1d) a.b;
                if (i6 >= i1dVar.c) {
                    break;
                }
                jn2 jn2Var2 = (jn2) i1dVar.a[i6];
                int i7 = jn2Var2.a;
                if ((min > i7 || i7 > max) && ((min > (i4 = jn2Var2.b) || i4 > max) && ((min > i4 || i7 > min) && (max > i4 || i7 > max)))) {
                    if (i7 > max && !z) {
                        a.p(jn2Var, min, max, i5);
                        z = true;
                    }
                    if (z) {
                        jn2Var2.a += i5;
                        jn2Var2.b += i5;
                    }
                    ((i1d) a.c).b(jn2Var2);
                } else if (jn2Var == null) {
                    jn2Var = jn2Var2;
                } else {
                    jn2Var.b = jn2Var2.b;
                    jn2Var.d = jn2Var2.d;
                }
                i6++;
            }
            if (!z) {
                a.p(jn2Var, min, max, i5);
            }
            i1d i1dVar2 = (i1d) a.b;
            a.b = (i1d) a.c;
            a.c = i1dVar2;
            i1dVar2.n();
        }
        e7a e7aVar = this.b;
        if (e7aVar != null) {
            e7aVar.i(i, i2, i3);
        }
        this.e = cga.o(i, i2, i3, this.e);
    }

    public final void c(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            u3a.a("Expected start=" + i + " <= end=" + i2);
        }
        if (length < 0) {
            u3a.a("Expected textStart=0 <= textEnd=" + length);
        }
        mo2 mo2Var = this.c;
        int c = llf.c(i, 0, mo2Var.length());
        int c2 = llf.c(i2, 0, mo2Var.length());
        int c3 = llf.c(0, 0, charSequence.length());
        int c4 = llf.c(length, 0, charSequence.length());
        b(c, c2, c4 - c3);
        mo2Var.a(c, c2, charSequence, c3, c4);
        e(null);
        this.h = null;
    }

    public final void d(int i, int i2, List list) {
        mo2 mo2Var = this.c;
        if (i < 0 || i > mo2Var.length()) {
            pvd.m(mo2Var.length(), lnb.t(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > mo2Var.length()) {
            pvd.m(mo2Var.length(), lnb.t(i2, "end (", ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            a70.p(dmi.k(i, i2, "Do not set reversed or empty range: ", " > "));
            return;
        }
        e(new pej(t6a.g(i, i2)));
        i1d i1dVar = this.g;
        if (i1dVar != null) {
            i1dVar.n();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.g == null) {
            this.g = new i1d(new p80[16], 0);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            p80 p80Var = (p80) list.get(i3);
            i1d i1dVar2 = this.g;
            if (i1dVar2 != null) {
                i1dVar2.b(p80.a(p80Var, null, p80Var.b + i, p80Var.c + i, 9));
            }
        }
    }

    public final void e(pej pejVar) {
        if (pejVar != null && !pej.d(pejVar.a)) {
            this.f = pejVar;
            return;
        }
        this.f = null;
        i1d i1dVar = this.g;
        if (i1dVar != null) {
            i1dVar.n();
        }
    }

    public final void f(long j) {
        long g = t6a.g(0, this.c.length());
        if (!pej.a(g, j)) {
            u3a.a("Expected " + ((Object) pej.i(j)) + " to be in " + ((Object) pej.i(g)));
        }
        this.e = j;
        this.h = null;
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        mo2 mo2Var = this.c;
        b(mo2Var.length(), mo2Var.length(), 1);
        mo2Var.a(mo2Var.length(), mo2Var.length(), r5, 0, String.valueOf(c).length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            mo2 mo2Var = this.c;
            b(mo2Var.length(), mo2Var.length(), i2 - i);
            mo2Var.a(mo2Var.length(), mo2Var.length(), r5, 0, charSequence.subSequence(i, i2).length());
        }
        return this;
    }
}
