package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h3h {
    public final jwj a;
    public final aej b;
    public final boolean c;
    public final float d;
    public final g88 e;
    public final m9j f;
    public final j3h g;
    public long h;
    public l2l i;
    public final String j;

    public h3h(jwj jwjVar, aej aejVar, boolean z, float f, g88 g88Var) {
        this.a = jwjVar;
        this.b = aejVar;
        this.c = z;
        this.d = f;
        this.e = g88Var;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            m9j d = jwjVar.d();
            this.f = d;
            this.g = (j3h) ((eoh) jwjVar.e).getValue();
            Unit unit = Unit.a;
            bea.K(w, C, e);
            this.h = d.d;
            this.j = d.c.toString();
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }

    public final void a() {
        if (this.j.length() > 0) {
            m9j m9jVar = this.f;
            boolean d = pej.d(m9jVar.d);
            jwj jwjVar = this.a;
            if (d) {
                jwj.i(jwjVar, "", t6a.g((int) (m9jVar.d >> 32), (int) (this.h & 4294967295L)), !this.c, 4);
            } else {
                jwjVar.c();
            }
            this.h = this.a.d().d;
            this.i = l2l.a;
        }
    }

    public final boolean b() {
        aej aejVar = this.b;
        if (aejVar == null) {
            return true;
        }
        long j = this.h;
        int i = pej.c;
        return aejVar.i((int) (j & 4294967295L)) == d1g.a;
    }

    public final int c(aej aejVar, int i) {
        long j = this.h;
        int i2 = pej.c;
        int i3 = (int) (j & 4294967295L);
        g88 g88Var = this.e;
        if (Float.isNaN(g88Var.a)) {
            g88Var.a = aejVar.c(i3).a;
        }
        eyc eycVar = aejVar.b;
        int d = eycVar.d(i3) + i;
        if (d < 0) {
            return Integer.MIN_VALUE;
        }
        if (d >= eycVar.f) {
            return Integer.MAX_VALUE;
        }
        float b = eycVar.b(d) - 1.0f;
        float f = g88Var.a;
        if ((b() && f >= aejVar.g(d)) || (!b() && f <= aejVar.f(d))) {
            return eycVar.c(d, true);
        }
        return eycVar.g((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(b) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.f.d;
        int i2 = pej.c;
        int i3 = (int) (j & 4294967295L);
        aej aejVar = this.b;
        if (aejVar != null) {
            eyc eycVar = aejVar.b;
            float f = this.d;
            if (!Float.isNaN(f)) {
                oqf j2 = aejVar.c(i3).j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f * i);
                float f2 = j2.d;
                float f3 = j2.b;
                float b = eycVar.b(eycVar.e(f3));
                if (Math.abs(f3 - b) > Math.abs(f2 - b)) {
                    return eycVar.g(j2.f());
                }
                return eycVar.g((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(j2.a) << 32));
            }
        }
        return i3;
    }

    public final void e() {
        aej aejVar = this.b;
        int c = aejVar != null ? c(aejVar, 1) : Integer.MAX_VALUE;
        if (c == Integer.MAX_VALUE) {
            this.e.a = Float.NaN;
        }
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (c > length) {
                c = length;
            }
            long r = s6a.r(c, i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void f() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            long r = s6a.r(d(1), i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void g() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            long r = s6a.r(hda.x(i2, str), i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void h() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int t = wca.t(str, pej.f(j));
            if (t == pej.f(this.h) && t != str.length()) {
                t = wca.t(str, t + 1);
            }
            long r = s6a.r(t, i, this.a);
            int i2 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i2 != i || !pej.d(this.h)) {
                this.h = t6a.g(i2, i2);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void i() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            aej aejVar = this.b;
            if (aejVar != null) {
                int i3 = i2;
                while (true) {
                    m9j m9jVar = this.f;
                    if (i3 < m9jVar.c.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long k = aejVar.k(length2);
                        int i4 = pej.c;
                        int i5 = (int) (k & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = m9jVar.c.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long r = s6a.r(length, i2, this.a);
            int i6 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i6 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i6, i6);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void j() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            long r = s6a.r(hda.y(i2, str), i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void k() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int u = wca.u(str, pej.g(j));
            if (u == pej.g(this.h) && u != 0) {
                u = wca.u(str, u - 1);
            }
            long r = s6a.r(u, i, this.a);
            int i2 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i2 != i || !pej.d(this.h)) {
                this.h = t6a.g(i2, i2);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void l() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            aej aejVar = this.b;
            if (aejVar != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long k = aejVar.k(length);
                    int i5 = pej.c;
                    int i6 = (int) (k >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                    i4--;
                }
            }
            long r = s6a.r(i3, i2, this.a);
            int i7 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i7 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i7, i7);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void m() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            long r = s6a.r(str.length(), i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void n() {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            long r = s6a.r(0, i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void o() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (4294967295L & j);
            aej aejVar = this.b;
            if (aejVar != null) {
                eyc eycVar = aejVar.b;
                length = eycVar.c(eycVar.d(pej.f(j)), true);
            } else {
                length = str.length();
            }
            long r = s6a.r(length, i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void p() {
        int i;
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i2 = pej.c;
            int i3 = (int) (4294967295L & j);
            aej aejVar = this.b;
            if (aejVar != null) {
                i = aejVar.h(aejVar.b.d(pej.g(j)));
            } else {
                i = 0;
            }
            long r = s6a.r(i, i3, this.a);
            int i4 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i4 != i3 || !pej.d(this.h)) {
                this.h = t6a.g(i4, i4);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void q() {
        aej aejVar = this.b;
        int c = aejVar != null ? c(aejVar, -1) : Integer.MIN_VALUE;
        if (c == Integer.MIN_VALUE) {
            this.e.a = Float.NaN;
        }
        if (this.j.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            if (c < 0) {
                c = 0;
            }
            long r = s6a.r(c, i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void r() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = pej.c;
            int i2 = (int) (j & 4294967295L);
            long r = s6a.r(d(-1), i2, this.a);
            int i3 = (int) (r >> 32);
            l2l w = ok3.w(r);
            if (i3 != i2 || !pej.d(this.h)) {
                this.h = t6a.g(i3, i3);
            }
            if (w != null) {
                this.i = w;
            }
        }
    }

    public final void s() {
        if (this.j.length() > 0) {
            long j = this.f.d;
            int i = pej.c;
            this.h = t6a.g((int) (j >> 32), (int) (this.h & 4294967295L));
        }
    }
}
