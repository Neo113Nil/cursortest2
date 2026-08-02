package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2204e;
import androidx.media3.exoplayer.source.C2217s;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.F;
import androidx.media3.exoplayer.trackselection.G;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.io.IOException;
import m1.R0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C f21358a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21359b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21360c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21361d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21362e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21363f;

    /* renamed from: g, reason: collision with root package name */
    public R0 f21364g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21365h;

    /* renamed from: i, reason: collision with root package name */
    public final F f21366i;

    /* renamed from: j, reason: collision with root package name */
    public final n f21367j;

    /* renamed from: k, reason: collision with root package name */
    public l f21368k;

    /* renamed from: l, reason: collision with root package name */
    public m0 f21369l;

    /* renamed from: m, reason: collision with root package name */
    public G f21370m;
    private final boolean[] mayRetainStreamFlags;

    /* renamed from: n, reason: collision with root package name */
    public long f21371n;
    private final q[] rendererCapabilities;
    public final c0[] sampleStreams;

    public interface a {
        l a(R0 r02, long j10);
    }

    public l(q[] qVarArr, long j10, F f10, D1.b bVar, n nVar, R0 r02, G g10, long j11) {
        this.rendererCapabilities = qVarArr;
        this.f21371n = j10;
        this.f21366i = f10;
        this.f21367j = nVar;
        D.b bVar2 = r02.f56123a;
        this.f21359b = bVar2.f21516a;
        this.f21364g = r02;
        this.f21360c = j11;
        this.f21369l = m0.f21830d;
        this.f21370m = g10;
        this.sampleStreams = new c0[qVarArr.length];
        this.mayRetainStreamFlags = new boolean[qVarArr.length];
        this.f21358a = f(bVar2, nVar, bVar, r02.f56124b, r02.f56126d, r02.f56128f);
    }

    public static C f(D.b bVar, n nVar, D1.b bVar2, long j10, long j11, boolean z10) {
        C h10 = nVar.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new C2204e(h10, !z10, 0L, j11) : h10;
    }

    public static void y(n nVar, C c10) {
        try {
            if (c10 instanceof C2204e) {
                nVar.y(((C2204e) c10).f21716a);
            } else {
                nVar.y(c10);
            }
        } catch (RuntimeException e10) {
            AbstractC4156x.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(l lVar) {
        if (lVar == this.f21368k) {
            return;
        }
        g();
        this.f21368k = lVar;
        i();
    }

    public void B(long j10) {
        this.f21371n = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        C c10 = this.f21358a;
        if (c10 instanceof C2204e) {
            long j10 = this.f21364g.f56126d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C2204e) c10).x(0L, j10);
        }
    }

    public long a(G g10, long j10, boolean z10) {
        return b(g10, j10, z10, new boolean[this.rendererCapabilities.length]);
    }

    public long b(G g10, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= g10.f21913a) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z10 || !g10.b(this.f21370m, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.sampleStreams);
        g();
        this.f21370m = g10;
        i();
        long m10 = this.f21358a.m(g10.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j10);
        c(this.sampleStreams);
        this.f21363f = false;
        int i11 = 0;
        while (true) {
            c0[] c0VarArr = this.sampleStreams;
            if (i11 >= c0VarArr.length) {
                return m10;
            }
            if (c0VarArr[i11] != null) {
                AbstractC4134a.g(g10.c(i11));
                if (this.rendererCapabilities[i11].f() != -2) {
                    this.f21363f = true;
                }
            } else {
                AbstractC4134a.g(g10.selections[i11] == null);
            }
            i11++;
        }
    }

    public final void c(c0[] c0VarArr) {
        int i10 = 0;
        while (true) {
            q[] qVarArr = this.rendererCapabilities;
            if (i10 >= qVarArr.length) {
                return;
            }
            if (qVarArr[i10].f() == -2 && this.f21370m.c(i10)) {
                c0VarArr[i10] = new C2217s();
            }
            i10++;
        }
    }

    public boolean d(R0 r02) {
        if (!m.e(this.f21364g.f56127e, r02.f56127e)) {
            return false;
        }
        R0 r03 = this.f21364g;
        return r03.f56124b == r02.f56124b && r03.f56123a.equals(r02.f56123a);
    }

    public void e(k kVar) {
        AbstractC4134a.g(u());
        this.f21358a.b(kVar);
    }

    public final void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            G g10 = this.f21370m;
            if (i10 >= g10.f21913a) {
                return;
            }
            boolean c10 = g10.c(i10);
            y yVar = this.f21370m.selections[i10];
            if (c10 && yVar != null) {
                yVar.disable();
            }
            i10++;
        }
    }

    public final void h(c0[] c0VarArr) {
        int i10 = 0;
        while (true) {
            q[] qVarArr = this.rendererCapabilities;
            if (i10 >= qVarArr.length) {
                return;
            }
            if (qVarArr[i10].f() == -2) {
                c0VarArr[i10] = null;
            }
            i10++;
        }
    }

    public final void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            G g10 = this.f21370m;
            if (i10 >= g10.f21913a) {
                return;
            }
            boolean c10 = g10.c(i10);
            y yVar = this.f21370m.selections[i10];
            if (c10 && yVar != null) {
                yVar.enable();
            }
            i10++;
        }
    }

    public long j() {
        if (!this.f21362e) {
            return this.f21364g.f56124b;
        }
        long g10 = this.f21363f ? this.f21358a.g() : Long.MIN_VALUE;
        return g10 == Long.MIN_VALUE ? this.f21364g.f56127e : g10;
    }

    public l k() {
        return this.f21368k;
    }

    public long l() {
        if (this.f21362e) {
            return this.f21358a.d();
        }
        return 0L;
    }

    public long m() {
        return this.f21371n;
    }

    public long n() {
        return this.f21364g.f56124b + this.f21371n;
    }

    public m0 o() {
        return this.f21369l;
    }

    public G p() {
        return this.f21370m;
    }

    public void q(float f10, AbstractC2346O abstractC2346O, boolean z10) {
        this.f21362e = true;
        this.f21369l = this.f21358a.u();
        G z11 = z(f10, abstractC2346O, z10);
        R0 r02 = this.f21364g;
        long j10 = r02.f56124b;
        long j11 = r02.f56127e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(z11, j10, false);
        long j12 = this.f21371n;
        R0 r03 = this.f21364g;
        this.f21371n = j12 + (r03.f56124b - a10);
        this.f21364g = r03.b(a10);
    }

    public boolean r() {
        try {
            if (this.f21362e) {
                for (c0 c0Var : this.sampleStreams) {
                    if (c0Var != null) {
                        c0Var.a();
                    }
                }
            } else {
                this.f21358a.r();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f21362e) {
            return !this.f21363f || this.f21358a.g() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f21362e) {
            return s() || j() - this.f21364g.f56124b >= this.f21360c;
        }
        return false;
    }

    public final boolean u() {
        return this.f21368k == null;
    }

    public void v(C.a aVar, long j10) {
        this.f21361d = true;
        this.f21358a.t(aVar, j10);
    }

    public void w(long j10) {
        AbstractC4134a.g(u());
        if (this.f21362e) {
            this.f21358a.h(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f21367j, this.f21358a);
    }

    public G z(float f10, AbstractC2346O abstractC2346O, boolean z10) {
        G k10 = this.f21366i.k(this.rendererCapabilities, o(), this.f21364g.f56123a, abstractC2346O);
        for (int i10 = 0; i10 < k10.f21913a; i10++) {
            if (k10.c(i10)) {
                if (k10.selections[i10] == null && this.rendererCapabilities[i10].f() != -2) {
                    r3 = false;
                }
                AbstractC4134a.g(r3);
            } else {
                AbstractC4134a.g(k10.selections[i10] == null);
            }
        }
        for (y yVar : k10.selections) {
            if (yVar != null) {
                yVar.i(f10);
                yVar.o(z10);
            }
        }
        return k10;
    }
}
