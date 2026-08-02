package m1;

import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import w1.C6698c;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.p f56271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56272b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.p f56273c;

    /* renamed from: d, reason: collision with root package name */
    public int f56274d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56275e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56276f = false;

    public l1(androidx.media3.exoplayer.p pVar, androidx.media3.exoplayer.p pVar2, int i10) {
        this.f56271a = pVar;
        this.f56272b = i10;
        this.f56273c = pVar2;
    }

    public static androidx.media3.common.a[] i(androidx.media3.exoplayer.trackselection.y yVar) {
        int length = yVar != null ? yVar.length() : 0;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = ((androidx.media3.exoplayer.trackselection.y) AbstractC4134a.e(yVar)).e(i10);
        }
        return aVarArr;
    }

    public static boolean z(androidx.media3.exoplayer.p pVar) {
        return pVar.getState() != 0;
    }

    public final boolean A() {
        return this.f56274d == 3;
    }

    public void B(androidx.media3.exoplayer.source.c0 c0Var, androidx.media3.exoplayer.f fVar, long j10, boolean z10) {
        C(this.f56271a, c0Var, fVar, j10, z10);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            C(pVar, c0Var, fVar, j10, z10);
        }
    }

    public final void C(androidx.media3.exoplayer.p pVar, androidx.media3.exoplayer.source.c0 c0Var, androidx.media3.exoplayer.f fVar, long j10, boolean z10) {
        if (z(pVar)) {
            if (c0Var != pVar.M()) {
                d(pVar, fVar);
            } else if (z10) {
                pVar.O(j10);
            }
        }
    }

    public void D() {
        int i10 = this.f56274d;
        if (i10 == 3 || i10 == 4) {
            Z(i10 == 4);
            this.f56274d = this.f56274d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f56274d = 0;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            if (this.f56275e) {
                this.f56271a.reset();
                this.f56275e = false;
                return;
            }
            return;
        }
        if (this.f56276f) {
            ((androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c)).reset();
            this.f56276f = false;
        }
    }

    public void F(androidx.media3.exoplayer.trackselection.G g10, androidx.media3.exoplayer.trackselection.G g11, long j10) {
        int i10;
        boolean c10 = g10.c(this.f56272b);
        boolean c11 = g11.c(this.f56272b);
        androidx.media3.exoplayer.p pVar = (this.f56273c == null || (i10 = this.f56274d) == 3 || (i10 == 0 && z(this.f56271a))) ? this.f56271a : (androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c);
        if (!c10 || pVar.y()) {
            return;
        }
        boolean z10 = m() == -2;
        k1[] k1VarArr = g10.rendererConfigurations;
        int i11 = this.f56272b;
        k1 k1Var = k1VarArr[i11];
        k1 k1Var2 = g11.rendererConfigurations[i11];
        if (!c11 || !Objects.equals(k1Var2, k1Var) || z10 || u()) {
            P(pVar, j10);
        }
    }

    public void G(androidx.media3.exoplayer.l lVar) {
        ((androidx.media3.exoplayer.p) AbstractC4134a.e(l(lVar))).v();
    }

    public void H() {
        this.f56271a.release();
        this.f56275e = false;
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            pVar.release();
            this.f56276f = false;
        }
    }

    public void I(long j10, long j11) {
        if (z(this.f56271a)) {
            this.f56271a.h(j10, j11);
        }
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar == null || !z(pVar)) {
            return;
        }
        this.f56273c.h(j10, j11);
    }

    public int J(androidx.media3.exoplayer.l lVar, androidx.media3.exoplayer.trackselection.G g10, androidx.media3.exoplayer.f fVar) {
        int K10 = K(this.f56271a, lVar, g10, fVar);
        return K10 == 1 ? K(this.f56273c, lVar, g10, fVar) : K10;
    }

    public final int K(androidx.media3.exoplayer.p pVar, androidx.media3.exoplayer.l lVar, androidx.media3.exoplayer.trackselection.G g10, androidx.media3.exoplayer.f fVar) {
        if (pVar == null || !z(pVar) || ((pVar == this.f56271a && w()) || (pVar == this.f56273c && A()))) {
            return 1;
        }
        androidx.media3.exoplayer.source.c0 M10 = pVar.M();
        androidx.media3.exoplayer.source.c0[] c0VarArr = lVar.sampleStreams;
        int i10 = this.f56272b;
        boolean z10 = M10 != c0VarArr[i10];
        boolean c10 = g10.c(i10);
        if (c10 && !z10) {
            return 1;
        }
        if (!pVar.y()) {
            pVar.u(i(g10.selections[this.f56272b]), (androidx.media3.exoplayer.source.c0) AbstractC4134a.e(lVar.sampleStreams[this.f56272b]), lVar.n(), lVar.m(), lVar.f21364g.f56123a);
            return 3;
        }
        if (!pVar.b()) {
            return 0;
        }
        d(pVar, fVar);
        if (!c10 || u()) {
            E(pVar == this.f56271a);
        }
        return 1;
    }

    public void L() {
        if (!z(this.f56271a)) {
            E(true);
        }
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar == null || z(pVar)) {
            return;
        }
        E(false);
    }

    public void M(androidx.media3.exoplayer.l lVar, long j10) {
        androidx.media3.exoplayer.p l10 = l(lVar);
        if (l10 != null) {
            l10.O(j10);
        }
    }

    public void N(long j10) {
        int i10;
        if (z(this.f56271a) && (i10 = this.f56274d) != 4 && i10 != 2) {
            P(this.f56271a, j10);
        }
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar == null || !z(pVar) || this.f56274d == 3) {
            return;
        }
        P(this.f56273c, j10);
    }

    public void O(androidx.media3.exoplayer.l lVar, long j10) {
        P((androidx.media3.exoplayer.p) AbstractC4134a.e(l(lVar)), j10);
    }

    public final void P(androidx.media3.exoplayer.p pVar, long j10) {
        pVar.m();
        if (pVar instanceof C1.i) {
            ((C1.i) pVar).H0(j10);
        }
    }

    public void Q(float f10, float f11) {
        this.f56271a.I(f10, f11);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            pVar.I(f10, f11);
        }
    }

    public void R(n1 n1Var) {
        this.f56271a.t(18, n1Var);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            pVar.t(18, n1Var);
        }
    }

    public void S(AbstractC2346O abstractC2346O) {
        this.f56271a.C(abstractC2346O);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            pVar.C(abstractC2346O);
        }
    }

    public void T(F1.y yVar) {
        if (m() != 2) {
            return;
        }
        this.f56271a.t(7, yVar);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            pVar.t(7, yVar);
        }
    }

    public void U(Object obj) {
        if (m() != 2) {
            return;
        }
        int i10 = this.f56274d;
        if (i10 == 4 || i10 == 1) {
            ((androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c)).t(1, obj);
        } else {
            this.f56271a.t(1, obj);
        }
    }

    public void V(float f10) {
        if (m() != 1) {
            return;
        }
        this.f56271a.t(2, Float.valueOf(f10));
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            pVar.t(2, Float.valueOf(f10));
        }
    }

    public void W() {
        if (this.f56271a.getState() == 1 && this.f56274d != 4) {
            this.f56271a.start();
            return;
        }
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar == null || pVar.getState() != 1 || this.f56274d == 3) {
            return;
        }
        this.f56273c.start();
    }

    public void X() {
        int i10;
        AbstractC4134a.g(!u());
        if (z(this.f56271a)) {
            i10 = 3;
        } else {
            androidx.media3.exoplayer.p pVar = this.f56273c;
            i10 = (pVar == null || !z(pVar)) ? 2 : 4;
        }
        this.f56274d = i10;
    }

    public void Y() {
        if (z(this.f56271a)) {
            g(this.f56271a);
        }
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar == null || !z(pVar)) {
            return;
        }
        g(this.f56273c);
    }

    public final void Z(boolean z10) {
        if (z10) {
            ((androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c)).t(17, this.f56271a);
        } else {
            this.f56271a.t(17, AbstractC4134a.e(this.f56273c));
        }
    }

    public boolean a(androidx.media3.exoplayer.l lVar) {
        androidx.media3.exoplayer.p l10 = l(lVar);
        return l10 == null || l10.i() || l10.c() || l10.b();
    }

    public void b(androidx.media3.exoplayer.f fVar) {
        d(this.f56271a, fVar);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar != null) {
            boolean z10 = z(pVar) && this.f56274d != 3;
            d(this.f56273c, fVar);
            E(false);
            if (z10) {
                Z(true);
            }
        }
        this.f56274d = 0;
    }

    public void c(androidx.media3.exoplayer.f fVar) {
        if (u()) {
            int i10 = this.f56274d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 != 4 ? 0 : 1;
            d(z10 ? this.f56271a : (androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c), fVar);
            E(z10);
            this.f56274d = i11;
        }
    }

    public final void d(androidx.media3.exoplayer.p pVar, androidx.media3.exoplayer.f fVar) {
        AbstractC4134a.g(this.f56271a == pVar || this.f56273c == pVar);
        if (z(pVar)) {
            fVar.a(pVar);
            g(pVar);
            pVar.disable();
        }
    }

    public void e(k1 k1Var, androidx.media3.exoplayer.trackselection.y yVar, androidx.media3.exoplayer.source.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, D.b bVar, androidx.media3.exoplayer.f fVar) {
        androidx.media3.common.a[] i10 = i(yVar);
        int i11 = this.f56274d;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            this.f56275e = true;
            this.f56271a.L(k1Var, i10, c0Var, j10, z10, z11, j11, j12, bVar);
            fVar.b(this.f56271a);
        } else {
            this.f56276f = true;
            ((androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c)).L(k1Var, i10, c0Var, j10, z10, z11, j11, j12, bVar);
            fVar.b(this.f56273c);
        }
    }

    public void f() {
        if (z(this.f56271a)) {
            this.f56271a.l();
            return;
        }
        androidx.media3.exoplayer.p pVar = this.f56273c;
        if (pVar == null || !z(pVar)) {
            return;
        }
        this.f56273c.l();
    }

    public final void g(androidx.media3.exoplayer.p pVar) {
        if (pVar.getState() == 2) {
            pVar.stop();
        }
    }

    public int h() {
        boolean z10 = z(this.f56271a);
        androidx.media3.exoplayer.p pVar = this.f56273c;
        return (z10 ? 1 : 0) + ((pVar == null || !z(pVar)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long B10 = z(this.f56271a) ? this.f56271a.B(j10, j11) : LongCompanionObject.MAX_VALUE;
        androidx.media3.exoplayer.p pVar = this.f56273c;
        return (pVar == null || !z(pVar)) ? B10 : Math.min(B10, this.f56273c.B(j10, j11));
    }

    public long k(androidx.media3.exoplayer.l lVar) {
        androidx.media3.exoplayer.p l10 = l(lVar);
        Objects.requireNonNull(l10);
        return l10.N();
    }

    public final androidx.media3.exoplayer.p l(androidx.media3.exoplayer.l lVar) {
        if (lVar != null && lVar.sampleStreams[this.f56272b] != null) {
            if (this.f56271a.M() == lVar.sampleStreams[this.f56272b]) {
                return this.f56271a;
            }
            androidx.media3.exoplayer.p pVar = this.f56273c;
            if (pVar != null && pVar.M() == lVar.sampleStreams[this.f56272b]) {
                return this.f56273c;
            }
        }
        return null;
    }

    public int m() {
        return this.f56271a.f();
    }

    public void n(int i10, Object obj, androidx.media3.exoplayer.l lVar) {
        ((androidx.media3.exoplayer.p) AbstractC4134a.e(l(lVar))).t(i10, obj);
    }

    public boolean o(androidx.media3.exoplayer.l lVar) {
        return p(lVar, this.f56271a) && p(lVar, this.f56273c);
    }

    public final boolean p(androidx.media3.exoplayer.l lVar, androidx.media3.exoplayer.p pVar) {
        if (pVar == null) {
            return true;
        }
        androidx.media3.exoplayer.source.c0 c0Var = lVar.sampleStreams[this.f56272b];
        if (pVar.M() == null || (pVar.M() == c0Var && (c0Var == null || pVar.i() || q(pVar, lVar)))) {
            return true;
        }
        androidx.media3.exoplayer.l k10 = lVar.k();
        return k10 != null && k10.sampleStreams[this.f56272b] == pVar.M();
    }

    public final boolean q(androidx.media3.exoplayer.p pVar, androidx.media3.exoplayer.l lVar) {
        androidx.media3.exoplayer.l k10 = lVar.k();
        if (lVar.f21364g.f56129g && k10 != null && k10.f21362e) {
            return (pVar instanceof C1.i) || (pVar instanceof C6698c) || pVar.N() >= k10.n();
        }
        return false;
    }

    public boolean r(androidx.media3.exoplayer.l lVar) {
        return ((androidx.media3.exoplayer.p) AbstractC4134a.e(l(lVar))).i();
    }

    public boolean s() {
        return this.f56273c != null;
    }

    public boolean t() {
        boolean b10 = z(this.f56271a) ? this.f56271a.b() : true;
        androidx.media3.exoplayer.p pVar = this.f56273c;
        return (pVar == null || !z(pVar)) ? b10 : b10 & this.f56273c.b();
    }

    public boolean u() {
        return w() || A();
    }

    public boolean v(androidx.media3.exoplayer.l lVar) {
        return (w() && l(lVar) == this.f56271a) || (A() && l(lVar) == this.f56273c);
    }

    public final boolean w() {
        int i10 = this.f56274d;
        return i10 == 2 || i10 == 4;
    }

    public boolean x(androidx.media3.exoplayer.l lVar) {
        return l(lVar) != null;
    }

    public boolean y() {
        int i10 = this.f56274d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? z(this.f56271a) : z((androidx.media3.exoplayer.p) AbstractC4134a.e(this.f56273c));
    }
}
