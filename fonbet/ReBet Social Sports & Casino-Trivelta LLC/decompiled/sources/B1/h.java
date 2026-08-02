package B1;

import D1.k;
import D1.m;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.b0;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.d0;
import b1.AbstractC2335D;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m1.O0;
import m1.o1;
import q1.t;
import q1.u;

/* loaded from: classes.dex */
public class h implements c0, d0, m.b, m.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f567a;

    /* renamed from: b, reason: collision with root package name */
    public final i f568b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.a f569c;

    /* renamed from: d, reason: collision with root package name */
    public final L.a f570d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.k f571e;
    private final b0[] embeddedSampleQueues;
    private final androidx.media3.common.a[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;

    /* renamed from: f, reason: collision with root package name */
    public final D1.m f572f;

    /* renamed from: g, reason: collision with root package name */
    public final g f573g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f574h;

    /* renamed from: i, reason: collision with root package name */
    public final List f575i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f576j;

    /* renamed from: k, reason: collision with root package name */
    public final c f577k;

    /* renamed from: l, reason: collision with root package name */
    public e f578l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.media3.common.a f579m;

    /* renamed from: n, reason: collision with root package name */
    public b f580n;

    /* renamed from: o, reason: collision with root package name */
    public long f581o;

    /* renamed from: p, reason: collision with root package name */
    public long f582p;

    /* renamed from: q, reason: collision with root package name */
    public int f583q;

    /* renamed from: r, reason: collision with root package name */
    public B1.a f584r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f585s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f586t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f587u;

    public interface b {
        void a(h hVar);
    }

    public h(int i10, int[] iArr, androidx.media3.common.a[] aVarArr, i iVar, d0.a aVar, D1.b bVar, long j10, u uVar, t.a aVar2, D1.k kVar, L.a aVar3, boolean z10, E1.b bVar2) {
        this.f567a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = aVarArr == null ? new androidx.media3.common.a[0] : aVarArr;
        this.f568b = iVar;
        this.f569c = aVar;
        this.f570d = aVar3;
        this.f571e = kVar;
        this.f585s = z10;
        this.f572f = bVar2 != null ? new D1.m(bVar2) : new D1.m("ChunkSampleStream");
        this.f573g = new g();
        ArrayList arrayList = new ArrayList();
        this.f574h = arrayList;
        this.f575i = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new b0[length];
        this.embeddedTracksSelected = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        b0[] b0VarArr = new b0[i12];
        b0 l10 = b0.l(bVar, uVar, aVar2);
        this.f576j = l10;
        iArr2[0] = i10;
        b0VarArr[0] = l10;
        while (i11 < length) {
            b0 m10 = b0.m(bVar);
            this.embeddedSampleQueues[i11] = m10;
            int i13 = i11 + 1;
            b0VarArr[i13] = m10;
            iArr2[i13] = this.embeddedTrackTypes[i11];
            i11 = i13;
        }
        this.f577k = new c(iArr2, b0VarArr);
        this.f581o = j10;
        this.f582p = j10;
    }

    private void E(int i10) {
        AbstractC4134a.g(!this.f572f.j());
        int size = this.f574h.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!J(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = I().f563h;
        B1.a F10 = F(i10);
        if (this.f574h.isEmpty()) {
            this.f581o = this.f582p;
        }
        this.f587u = false;
        this.f570d.y(this.f567a, F10.f562g, j10);
    }

    private boolean K(e eVar) {
        return eVar instanceof B1.a;
    }

    private void V() {
        this.f576j.X();
        for (b0 b0Var : this.embeddedSampleQueues) {
            b0Var.X();
        }
    }

    public boolean C() {
        try {
            return this.f586t;
        } finally {
            this.f586t = false;
        }
    }

    public final void D(int i10) {
        int min = Math.min(S(i10, 0), this.f583q);
        if (min > 0) {
            Z.n1(this.f574h, 0, min);
            this.f583q -= min;
        }
    }

    public final B1.a F(int i10) {
        B1.a aVar = (B1.a) this.f574h.get(i10);
        ArrayList arrayList = this.f574h;
        Z.n1(arrayList, i10, arrayList.size());
        this.f583q = Math.max(this.f583q, this.f574h.size());
        int i11 = 0;
        this.f576j.w(aVar.i(0));
        while (true) {
            b0[] b0VarArr = this.embeddedSampleQueues;
            if (i11 >= b0VarArr.length) {
                return aVar;
            }
            b0 b0Var = b0VarArr[i11];
            i11++;
            b0Var.w(aVar.i(i11));
        }
    }

    public void G(long j10) {
        AbstractC4134a.g(!this.f572f.j());
        if (L() || j10 == -9223372036854775807L || this.f574h.isEmpty()) {
            return;
        }
        B1.a I10 = I();
        long j11 = I10.f531l;
        if (j11 == -9223372036854775807L) {
            j11 = I10.f563h;
        }
        if (j11 <= j10) {
            return;
        }
        long C10 = this.f576j.C();
        if (C10 <= j10) {
            return;
        }
        this.f576j.u(Math.max(j10, this.f576j.D() + 1));
        for (b0 b0Var : this.embeddedSampleQueues) {
            b0Var.u(Math.max(j10, b0Var.D() + 1));
        }
        this.f570d.y(this.f567a, j10, C10);
    }

    public i H() {
        return this.f568b;
    }

    public final B1.a I() {
        return (B1.a) this.f574h.get(r0.size() - 1);
    }

    public final boolean J(int i10) {
        int F10;
        B1.a aVar = (B1.a) this.f574h.get(i10);
        if (this.f576j.F() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b0[] b0VarArr = this.embeddedSampleQueues;
            if (i11 >= b0VarArr.length) {
                return false;
            }
            F10 = b0VarArr[i11].F();
            i11++;
        } while (F10 <= aVar.i(i11));
        return true;
    }

    public boolean L() {
        return this.f581o != -9223372036854775807L;
    }

    public final void M() {
        int S10 = S(this.f576j.F(), this.f583q - 1);
        while (true) {
            int i10 = this.f583q;
            if (i10 > S10) {
                return;
            }
            this.f583q = i10 + 1;
            N(i10);
        }
    }

    public final void N(int i10) {
        B1.a aVar = (B1.a) this.f574h.get(i10);
        androidx.media3.common.a aVar2 = aVar.f559d;
        if (!aVar2.equals(this.f579m)) {
            this.f570d.j(this.f567a, aVar2, aVar.f560e, aVar.f561f, aVar.f562g);
        }
        this.f579m = aVar2;
    }

    @Override // D1.m.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void l(e eVar, long j10, long j11, boolean z10) {
        this.f578l = null;
        this.f584r = null;
        C2223y c2223y = new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f571e.d(eVar.f556a);
        this.f570d.m(c2223y, eVar.f558c, this.f567a, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h);
        if (z10) {
            return;
        }
        if (L()) {
            V();
        } else if (K(eVar)) {
            F(this.f574h.size() - 1);
            if (this.f574h.isEmpty()) {
                this.f581o = this.f582p;
            }
        }
        this.f569c.j(this);
    }

    @Override // D1.m.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void i(e eVar, long j10, long j11) {
        this.f578l = null;
        this.f568b.k(eVar);
        C2223y c2223y = new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f571e.d(eVar.f556a);
        this.f570d.p(c2223y, eVar.f558c, this.f567a, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h);
        this.f569c.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    @Override // D1.m.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m.c o(e eVar, long j10, long j11, IOException iOException, int i10) {
        m.c cVar;
        boolean c10;
        long b10 = eVar.b();
        boolean K10 = K(eVar);
        int size = this.f574h.size() - 1;
        boolean z10 = (b10 != 0 && K10 && J(size)) ? false : true;
        C2223y c2223y = new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, b10);
        k.c cVar2 = new k.c(c2223y, new B(eVar.f558c, this.f567a, eVar.f559d, eVar.f560e, eVar.f561f, Z.J1(eVar.f562g), Z.J1(eVar.f563h)), iOException, i10);
        if (this.f568b.i(eVar, z10, cVar2, this.f571e)) {
            if (z10) {
                cVar = D1.m.f2456f;
                if (K10) {
                    AbstractC4134a.g(F(size) == eVar);
                    if (this.f574h.isEmpty()) {
                        this.f581o = this.f582p;
                    }
                }
                if (cVar == null) {
                    long b11 = this.f571e.b(cVar2);
                    cVar = b11 != -9223372036854775807L ? D1.m.h(false, b11) : D1.m.f2457g;
                }
                c10 = cVar.c();
                this.f570d.r(c2223y, eVar.f558c, this.f567a, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h, iOException, !c10);
                if (!c10) {
                    this.f578l = null;
                    this.f571e.d(eVar.f556a);
                    this.f569c.j(this);
                }
                return cVar;
            }
            AbstractC4156x.i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        }
        cVar = null;
        if (cVar == null) {
        }
        c10 = cVar.c();
        this.f570d.r(c2223y, eVar.f558c, this.f567a, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h, iOException, !c10);
        if (!c10) {
        }
        return cVar;
    }

    @Override // D1.m.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void j(e eVar, long j10, long j11, int i10) {
        this.f570d.v(i10 == 0 ? new C2223y(eVar.f556a, eVar.f557b, j10) : new C2223y(eVar.f556a, eVar.f557b, eVar.f(), eVar.e(), j10, j11, eVar.b()), eVar.f558c, this.f567a, eVar.f559d, eVar.f560e, eVar.f561f, eVar.f562g, eVar.f563h, i10);
    }

    public final int S(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f574h.size()) {
                return this.f574h.size() - 1;
            }
        } while (((B1.a) this.f574h.get(i11)).i(0) <= i10);
        return i11 - 1;
    }

    public void T() {
        U(null);
    }

    public void U(b bVar) {
        this.f580n = bVar;
        this.f576j.T();
        for (b0 b0Var : this.embeddedSampleQueues) {
            b0Var.T();
        }
        this.f572f.m(this);
    }

    public void W(long j10) {
        B1.a aVar;
        boolean b02;
        this.f582p = j10;
        int i10 = 0;
        this.f585s = false;
        if (L()) {
            this.f581o = j10;
            return;
        }
        for (int i11 = 0; i11 < this.f574h.size(); i11++) {
            aVar = (B1.a) this.f574h.get(i11);
            long j11 = aVar.f562g;
            if (j11 == j10 && aVar.f530k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            b02 = this.f576j.a0(aVar.i(0));
        } else {
            long d10 = d();
            b02 = this.f576j.b0(j10, d10 == Long.MIN_VALUE || j10 < d10);
        }
        if (b02) {
            this.f583q = S(this.f576j.F(), 0);
            b0[] b0VarArr = this.embeddedSampleQueues;
            int length = b0VarArr.length;
            while (i10 < length) {
                b0VarArr[i10].b0(j10, true);
                i10++;
            }
            return;
        }
        this.f581o = j10;
        this.f587u = false;
        this.f574h.clear();
        this.f583q = 0;
        if (!this.f572f.j()) {
            this.f572f.g();
            V();
            return;
        }
        this.f576j.s();
        b0[] b0VarArr2 = this.embeddedSampleQueues;
        int length2 = b0VarArr2.length;
        while (i10 < length2) {
            b0VarArr2[i10].s();
            i10++;
        }
        this.f572f.f();
    }

    public a X(long j10, int i10) {
        for (int i11 = 0; i11 < this.embeddedSampleQueues.length; i11++) {
            if (this.embeddedTrackTypes[i11] == i10) {
                AbstractC4134a.g(!this.embeddedTracksSelected[i11]);
                this.embeddedTracksSelected[i11] = true;
                this.embeddedSampleQueues[i11].b0(j10, true);
                return new a(this, this.embeddedSampleQueues[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.source.c0
    public void a() {
        this.f572f.a();
        this.f576j.P();
        if (this.f572f.j()) {
            return;
        }
        this.f568b.a();
    }

    @Override // androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        List list;
        long j10;
        if (this.f587u || this.f572f.j() || this.f572f.i()) {
            return false;
        }
        boolean L10 = L();
        if (L10) {
            list = Collections.EMPTY_LIST;
            j10 = this.f581o;
        } else {
            list = this.f575i;
            j10 = I().f563h;
        }
        this.f568b.h(kVar, j10, list, this.f573g);
        g gVar = this.f573g;
        boolean z10 = gVar.f566b;
        e eVar = gVar.f565a;
        gVar.a();
        if (z10) {
            this.f581o = -9223372036854775807L;
            this.f587u = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f578l = eVar;
        if (K(eVar)) {
            B1.a aVar = (B1.a) eVar;
            if (L10) {
                long j11 = aVar.f562g;
                long j12 = this.f581o;
                if (j11 < j12) {
                    this.f576j.d0(j12);
                    for (b0 b0Var : this.embeddedSampleQueues) {
                        b0Var.d0(this.f581o);
                    }
                    if (this.f585s) {
                        androidx.media3.common.a aVar2 = aVar.f559d;
                        this.f586t = !AbstractC2335D.a(aVar2.f20543o, aVar2.f20539k);
                    }
                }
                this.f585s = false;
                this.f581o = -9223372036854775807L;
            }
            aVar.k(this.f577k);
            this.f574h.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).g(this.f577k);
        }
        this.f572f.n(eVar, this, this.f571e.c(eVar.f558c));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public boolean c() {
        return !L() && this.f576j.N(this.f587u);
    }

    @Override // androidx.media3.exoplayer.source.d0
    public long d() {
        if (L()) {
            return this.f581o;
        }
        if (this.f587u) {
            return Long.MIN_VALUE;
        }
        return I().f563h;
    }

    @Override // androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f572f.j();
    }

    public long f(long j10, o1 o1Var) {
        return this.f568b.f(j10, o1Var);
    }

    @Override // androidx.media3.exoplayer.source.d0
    public long g() {
        if (this.f587u) {
            return Long.MIN_VALUE;
        }
        if (L()) {
            return this.f581o;
        }
        long j10 = this.f582p;
        B1.a I10 = I();
        if (!I10.h()) {
            if (this.f574h.size() > 1) {
                I10 = (B1.a) this.f574h.get(r2.size() - 2);
            } else {
                I10 = null;
            }
        }
        if (I10 != null) {
            j10 = Math.max(j10, I10.f563h);
        }
        return Math.max(j10, this.f576j.C());
    }

    @Override // androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        if (this.f572f.i() || L()) {
            return;
        }
        if (!this.f572f.j()) {
            int j11 = this.f568b.j(j10, this.f575i);
            if (j11 < this.f574h.size()) {
                E(j11);
                return;
            }
            return;
        }
        e eVar = (e) AbstractC4134a.e(this.f578l);
        if (!(K(eVar) && J(this.f574h.size() - 1)) && this.f568b.g(j10, eVar, this.f575i)) {
            this.f572f.f();
            if (K(eVar)) {
                this.f584r = (B1.a) eVar;
            }
        }
    }

    @Override // D1.m.f
    public void p() {
        this.f576j.V();
        for (b0 b0Var : this.embeddedSampleQueues) {
            b0Var.V();
        }
        this.f568b.release();
        b bVar = this.f580n;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public int q(long j10) {
        if (L()) {
            return 0;
        }
        int H10 = this.f576j.H(j10, this.f587u);
        B1.a aVar = this.f584r;
        if (aVar != null) {
            H10 = Math.min(H10, aVar.i(0) - this.f576j.F());
        }
        this.f576j.g0(H10);
        M();
        return H10;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public int s(O0 o02, k1.f fVar, int i10) {
        if (L()) {
            return -3;
        }
        B1.a aVar = this.f584r;
        if (aVar != null && aVar.i(0) <= this.f576j.F()) {
            return -3;
        }
        M();
        return this.f576j.U(o02, fVar, i10, this.f587u);
    }

    public void v(long j10, boolean z10) {
        if (L()) {
            return;
        }
        int A10 = this.f576j.A();
        this.f576j.r(j10, z10, true);
        int A11 = this.f576j.A();
        if (A11 > A10) {
            long B10 = this.f576j.B();
            int i10 = 0;
            while (true) {
                b0[] b0VarArr = this.embeddedSampleQueues;
                if (i10 >= b0VarArr.length) {
                    break;
                }
                b0VarArr[i10].r(B10, z10, this.embeddedTracksSelected[i10]);
                i10++;
            }
        }
        D(A11);
    }

    public final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final h f588a;

        /* renamed from: b, reason: collision with root package name */
        public final b0 f589b;

        /* renamed from: c, reason: collision with root package name */
        public final int f590c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f591d;

        public a(h hVar, b0 b0Var, int i10) {
            this.f588a = hVar;
            this.f589b = b0Var;
            this.f590c = i10;
        }

        private void b() {
            if (this.f591d) {
                return;
            }
            h.this.f570d.j(h.this.embeddedTrackTypes[this.f590c], h.this.embeddedTrackFormats[this.f590c], 0, null, h.this.f582p);
            this.f591d = true;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public boolean c() {
            return !h.this.L() && this.f589b.N(h.this.f587u);
        }

        public void d() {
            AbstractC4134a.g(h.this.embeddedTracksSelected[this.f590c]);
            h.this.embeddedTracksSelected[this.f590c] = false;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int q(long j10) {
            if (h.this.L()) {
                return 0;
            }
            int H10 = this.f589b.H(j10, h.this.f587u);
            if (h.this.f584r != null) {
                H10 = Math.min(H10, h.this.f584r.i(this.f590c + 1) - this.f589b.F());
            }
            this.f589b.g0(H10);
            if (H10 > 0) {
                b();
            }
            return H10;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int s(O0 o02, k1.f fVar, int i10) {
            if (h.this.L()) {
                return -3;
            }
            if (h.this.f584r != null && h.this.f584r.i(this.f590c + 1) <= this.f589b.F()) {
                return -3;
            }
            b();
            return this.f589b.U(o02, fVar, i10, h.this.f587u);
        }

        @Override // androidx.media3.exoplayer.source.c0
        public void a() {
        }
    }
}
