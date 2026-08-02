package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hbj {
    public final q80 a;
    public final long b;
    public final aej c;
    public final nnd d;
    public final oej e;
    public long f;
    public final q80 g;
    public final wcj h;
    public final bej i;

    public hbj(wcj wcjVar, nnd nndVar, bej bejVar, oej oejVar) {
        q80 q80Var = wcjVar.a;
        long j = wcjVar.b;
        aej aejVar = bejVar != null ? bejVar.a : null;
        this.a = q80Var;
        this.b = j;
        this.c = aejVar;
        this.d = nndVar;
        this.e = oejVar;
        this.f = j;
        this.g = q80Var;
        this.h = wcjVar;
        this.i = bejVar;
    }

    public final List a(Function1 function1) {
        if (!pej.d(this.f)) {
            return b.j(new t43("", 0), new p9h(pej.g(this.f), pej.g(this.f)));
        }
        vg5 vg5Var = (vg5) function1.invoke(this);
        if (vg5Var != null) {
            return a.c(vg5Var);
        }
        return null;
    }

    public final Integer b() {
        aej aejVar = this.c;
        if (aejVar == null) {
            return null;
        }
        eyc eycVar = aejVar.b;
        int f = pej.f(this.f);
        nnd nndVar = this.d;
        return Integer.valueOf(nndVar.i(eycVar.c(eycVar.d(nndVar.v(f)), true)));
    }

    public final Integer c() {
        aej aejVar = this.c;
        if (aejVar == null) {
            return null;
        }
        int g = pej.g(this.f);
        nnd nndVar = this.d;
        return Integer.valueOf(nndVar.i(aejVar.h(aejVar.b.d(nndVar.v(g)))));
    }

    public final Integer d() {
        int length;
        aej aejVar = this.c;
        if (aejVar == null) {
            return null;
        }
        int r = r();
        while (true) {
            q80 q80Var = this.a;
            if (r < q80Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long k = aejVar.k(length2);
                int i = pej.c;
                int i2 = (int) (k & 4294967295L);
                if (i2 > r) {
                    length = this.d.i(i2);
                    break;
                }
                r++;
            } else {
                length = q80Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i;
        aej aejVar = this.c;
        if (aejVar == null) {
            return null;
        }
        int r = r();
        while (true) {
            if (r <= 0) {
                i = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (r <= length) {
                length = r;
            }
            long k = aejVar.k(length);
            int i2 = pej.c;
            int i3 = (int) (k >> 32);
            if (i3 < r) {
                i = this.d.i(i3);
                break;
            }
            r--;
        }
        return Integer.valueOf(i);
    }

    public final boolean f() {
        aej aejVar = this.c;
        return (aejVar != null ? aejVar.i(r()) : null) != d1g.b;
    }

    public final int g(aej aejVar, int i) {
        int r = r();
        oej oejVar = this.e;
        if (oejVar.a == null) {
            oejVar.a = Float.valueOf(aejVar.c(r).a);
        }
        eyc eycVar = aejVar.b;
        int d = eycVar.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= eycVar.f) {
            return this.g.b.length();
        }
        float b = eycVar.b(d) - 1.0f;
        Float f = oejVar.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= aejVar.g(d)) || (!f() && floatValue <= aejVar.f(d))) {
            return eycVar.c(d, true);
        }
        return this.d.i(eycVar.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(bej bejVar, int i) {
        oqf oqfVar;
        dma dmaVar = bejVar.b;
        aej aejVar = bejVar.a;
        if (dmaVar != null) {
            dma dmaVar2 = bejVar.c;
            oqfVar = dmaVar2 != null ? dmaVar2.p(dmaVar, true) : null;
        }
        oqfVar = oqf.e;
        long j = this.h.b;
        int i2 = pej.c;
        nnd nndVar = this.d;
        oqf c = aejVar.c(nndVar.v((int) (j & 4294967295L)));
        float f = c.a;
        float intBitsToFloat = (Float.intBitsToFloat((int) (oqfVar.e() & 4294967295L)) * i) + c.b;
        return nndVar.i(aejVar.b.g((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        oej oejVar = this.e;
        oejVar.a = null;
        q80 q80Var = this.g;
        if (q80Var.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            oejVar.a = null;
            if (q80Var.b.length() > 0) {
                String str = q80Var.b;
                long j = this.f;
                int i = pej.c;
                int x = hda.x((int) (j & 4294967295L), str);
                if (x != -1) {
                    q(x, x);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        q80 q80Var = this.g;
        String str = q80Var.b;
        String str2 = q80Var.b;
        if (str.length() > 0) {
            int t = wca.t(str2, pej.f(this.f));
            if (t == pej.f(this.f) && t != str2.length()) {
                t = wca.t(str2, t + 1);
            }
            q(t, t);
        }
    }

    public final void k() {
        this.e.a = null;
        q80 q80Var = this.g;
        if (q80Var.b.length() > 0) {
            String str = q80Var.b;
            long j = this.f;
            int i = pej.c;
            int y = hda.y((int) (j & 4294967295L), str);
            if (y != -1) {
                q(y, y);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        q80 q80Var = this.g;
        String str = q80Var.b;
        String str2 = q80Var.b;
        if (str.length() > 0) {
            int u = wca.u(str2, pej.g(this.f));
            if (u == pej.g(this.f) && u != 0) {
                u = wca.u(str2, u - 1);
            }
            q(u, u);
        }
    }

    public final void m() {
        oej oejVar = this.e;
        oejVar.a = null;
        q80 q80Var = this.g;
        if (q80Var.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            oejVar.a = null;
            if (q80Var.b.length() > 0) {
                String str = q80Var.b;
                long j = this.f;
                int i = pej.c;
                int x = hda.x((int) (j & 4294967295L), str);
                if (x != -1) {
                    q(x, x);
                }
            }
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        q(intValue, intValue);
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (c = c()) == null) {
            return;
        }
        int intValue = c.intValue();
        q(intValue, intValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = pej.c;
            this.f = t6a.g((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = t6a.g(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = pej.c;
        return this.d.v((int) (j & 4294967295L));
    }
}
