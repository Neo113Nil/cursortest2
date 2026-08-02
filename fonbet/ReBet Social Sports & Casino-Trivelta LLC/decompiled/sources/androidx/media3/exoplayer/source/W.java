package androidx.media3.exoplayer.source;

import D1.k;
import D1.m;
import H1.C1181n;
import H1.J;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2222x;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.b0;
import b1.AbstractC2335D;
import b1.C2334C;
import b1.C2338G;
import b1.InterfaceC2358l;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.C4146m;
import h1.AbstractC4417m;
import h1.C4401D;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import m1.O0;
import m1.o1;
import q1.t;

/* loaded from: classes.dex */
public final class W implements C, H1.r, m.b, m.f, b0.d {

    /* renamed from: T, reason: collision with root package name */
    public static final Map f21576T = N();

    /* renamed from: V, reason: collision with root package name */
    public static final androidx.media3.common.a f21577V = new a.b().j0("icy").y0("application/x-icy").P();

    /* renamed from: A, reason: collision with root package name */
    public H1.J f21578A;

    /* renamed from: B, reason: collision with root package name */
    public long f21579B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21580C;

    /* renamed from: D, reason: collision with root package name */
    public int f21581D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21582E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f21583F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21584G;

    /* renamed from: H, reason: collision with root package name */
    public int f21585H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21586I;

    /* renamed from: J, reason: collision with root package name */
    public long f21587J;

    /* renamed from: K, reason: collision with root package name */
    public long f21588K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21589L;

    /* renamed from: O, reason: collision with root package name */
    public int f21590O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f21591P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f21592R;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f21593a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4411g f21594b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.u f21595c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.k f21596d;

    /* renamed from: e, reason: collision with root package name */
    public final L.a f21597e;

    /* renamed from: f, reason: collision with root package name */
    public final t.a f21598f;

    /* renamed from: g, reason: collision with root package name */
    public final c f21599g;

    /* renamed from: h, reason: collision with root package name */
    public final D1.b f21600h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21601i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21602j;

    /* renamed from: k, reason: collision with root package name */
    public final int f21603k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.media3.common.a f21604l;

    /* renamed from: m, reason: collision with root package name */
    public final long f21605m;

    /* renamed from: n, reason: collision with root package name */
    public final D1.m f21606n;

    /* renamed from: o, reason: collision with root package name */
    public final Q f21607o;

    /* renamed from: p, reason: collision with root package name */
    public final C4146m f21608p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f21609q;

    /* renamed from: r, reason: collision with root package name */
    public final Runnable f21610r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f21611s;
    private e[] sampleQueueTrackIds;
    private b0[] sampleQueues;

    /* renamed from: t, reason: collision with root package name */
    public C.a f21612t;

    /* renamed from: u, reason: collision with root package name */
    public U1.b f21613u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21614v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21615w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21616x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21617y;

    /* renamed from: z, reason: collision with root package name */
    public f f21618z;

    public class a extends H1.A {
        public a(H1.J j10) {
            super(j10);
        }

        @Override // H1.A, H1.J
        public long m() {
            return W.this.f21579B;
        }
    }

    public final class b implements m.e, C2222x.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f21621b;

        /* renamed from: c, reason: collision with root package name */
        public final C4401D f21622c;

        /* renamed from: d, reason: collision with root package name */
        public final Q f21623d;

        /* renamed from: e, reason: collision with root package name */
        public final H1.r f21624e;

        /* renamed from: f, reason: collision with root package name */
        public final C4146m f21625f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f21627h;

        /* renamed from: j, reason: collision with root package name */
        public long f21629j;

        /* renamed from: l, reason: collision with root package name */
        public H1.O f21631l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f21632m;

        /* renamed from: g, reason: collision with root package name */
        public final H1.I f21626g = new H1.I();

        /* renamed from: i, reason: collision with root package name */
        public boolean f21628i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f21620a = C2223y.a();

        /* renamed from: k, reason: collision with root package name */
        public C4418n f21630k = i(0);

        public b(Uri uri, InterfaceC4411g interfaceC4411g, Q q10, H1.r rVar, C4146m c4146m) {
            this.f21621b = uri;
            this.f21622c = new C4401D(interfaceC4411g);
            this.f21623d = q10;
            this.f21624e = rVar;
            this.f21625f = c4146m;
        }

        @Override // D1.m.e
        public void a() {
            int i10 = 0;
            while (i10 == 0 && !this.f21627h) {
                try {
                    long j10 = this.f21626g.f4333a;
                    C4418n i11 = i(j10);
                    this.f21630k = i11;
                    long b10 = this.f21622c.b(i11);
                    if (this.f21627h) {
                        if (i10 != 1 && this.f21623d.e() != -1) {
                            this.f21626g.f4333a = this.f21623d.e();
                        }
                        AbstractC4417m.a(this.f21622c);
                        return;
                    }
                    if (b10 != -1) {
                        b10 += j10;
                        W.this.Y();
                    }
                    long j11 = b10;
                    W.this.f21613u = U1.b.d(this.f21622c.f());
                    InterfaceC2358l interfaceC2358l = this.f21622c;
                    if (W.this.f21613u != null && W.this.f21613u.f12009f != -1) {
                        interfaceC2358l = new C2222x(this.f21622c, W.this.f21613u.f12009f, this);
                        H1.O Q10 = W.this.Q();
                        this.f21631l = Q10;
                        Q10.c(W.f21577V);
                    }
                    this.f21623d.b(interfaceC2358l, this.f21621b, this.f21622c.f(), j10, j11, this.f21624e);
                    if (W.this.f21613u != null) {
                        this.f21623d.c();
                    }
                    if (this.f21628i) {
                        this.f21623d.a(j10, this.f21629j);
                        this.f21628i = false;
                    }
                    while (i10 == 0 && !this.f21627h) {
                        try {
                            this.f21625f.a();
                            i10 = this.f21623d.d(this.f21626g);
                            long e10 = this.f21623d.e();
                            if (e10 > W.this.f21602j + j10) {
                                this.f21625f.d();
                                W.this.f21611s.post(W.this.f21610r);
                                j10 = e10;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f21623d.e() != -1) {
                        this.f21626g.f4333a = this.f21623d.e();
                    }
                    AbstractC4417m.a(this.f21622c);
                } catch (Throwable th2) {
                    if (i10 != 1 && this.f21623d.e() != -1) {
                        this.f21626g.f4333a = this.f21623d.e();
                    }
                    AbstractC4417m.a(this.f21622c);
                    throw th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.C2222x.a
        public void b(e1.J j10) {
            long max = !this.f21632m ? this.f21629j : Math.max(W.this.P(true), this.f21629j);
            int a10 = j10.a();
            H1.O o10 = (H1.O) AbstractC4134a.e(this.f21631l);
            o10.a(j10, a10);
            o10.g(max, 1, a10, 0, null);
            this.f21632m = true;
        }

        @Override // D1.m.e
        public void c() {
            this.f21627h = true;
        }

        public final C4418n i(long j10) {
            return new C4418n.b().i(this.f21621b).h(j10).f(W.this.f21601i).b(6).e(W.f21576T).a();
        }

        public final void j(long j10, long j11) {
            this.f21626g.f4333a = j10;
            this.f21629j = j11;
            this.f21628i = true;
            this.f21632m = false;
        }
    }

    public interface c {
        void e(long j10, H1.J j11, boolean z10);
    }

    public final class d implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f21634a;

        public d(int i10) {
            this.f21634a = i10;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public void a() {
            W.this.X(this.f21634a);
        }

        @Override // androidx.media3.exoplayer.source.c0
        public boolean c() {
            return W.this.S(this.f21634a);
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int q(long j10) {
            return W.this.i0(this.f21634a, j10);
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int s(O0 o02, k1.f fVar, int i10) {
            return W.this.e0(this.f21634a, o02, fVar, i10);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f21636a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21637b;

        public e(int i10, boolean z10) {
            this.f21636a = i10;
            this.f21637b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f21636a == eVar.f21636a && this.f21637b == eVar.f21637b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f21636a * 31) + (this.f21637b ? 1 : 0);
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f21638a;
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;

        public f(m0 m0Var, boolean[] zArr) {
            this.f21638a = m0Var;
            this.trackIsAudioVideoFlags = zArr;
            int i10 = m0Var.f21832a;
            this.trackEnabledStates = new boolean[i10];
            this.trackNotifiedDownstreamFormats = new boolean[i10];
        }
    }

    public W(Uri uri, InterfaceC4411g interfaceC4411g, Q q10, q1.u uVar, t.a aVar, D1.k kVar, L.a aVar2, c cVar, D1.b bVar, String str, int i10, int i11, androidx.media3.common.a aVar3, long j10, E1.b bVar2) {
        this.f21593a = uri;
        this.f21594b = interfaceC4411g;
        this.f21595c = uVar;
        this.f21598f = aVar;
        this.f21596d = kVar;
        this.f21597e = aVar2;
        this.f21599g = cVar;
        this.f21600h = bVar;
        this.f21601i = str;
        this.f21602j = i10;
        this.f21603k = i11;
        this.f21604l = aVar3;
        this.f21606n = bVar2 != null ? new D1.m(bVar2) : new D1.m("ProgressiveMediaPeriod");
        this.f21607o = q10;
        this.f21605m = j10;
        this.f21608p = new C4146m();
        this.f21609q = new Runnable() { // from class: androidx.media3.exoplayer.source.T
            @Override // java.lang.Runnable
            public final void run() {
                W.this.T();
            }
        };
        this.f21610r = new Runnable() { // from class: androidx.media3.exoplayer.source.U
            @Override // java.lang.Runnable
            public final void run() {
                W.y(W.this);
            }
        };
        this.f21611s = e1.Z.z();
        this.sampleQueueTrackIds = new e[0];
        this.sampleQueues = new b0[0];
        this.f21588K = -9223372036854775807L;
        this.f21581D = 1;
    }

    public static Map N() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private boolean R() {
        return this.f21588K != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f21592R || this.f21615w || !this.f21614v || this.f21578A == null) {
            return;
        }
        for (b0 b0Var : this.sampleQueues) {
            if (b0Var.I() == null) {
                return;
            }
        }
        this.f21608p.d();
        int length = this.sampleQueues.length;
        b1.P[] pArr = new b1.P[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(this.sampleQueues[i10].I());
            String str = aVar.f20543o;
            boolean o10 = AbstractC2335D.o(str);
            boolean z10 = o10 || AbstractC2335D.t(str);
            zArr[i10] = z10;
            this.f21616x = z10 | this.f21616x;
            this.f21617y = this.f21605m != -9223372036854775807L && length == 1 && AbstractC2335D.q(str);
            U1.b bVar = this.f21613u;
            if (bVar != null) {
                if (o10 || this.sampleQueueTrackIds[i10].f21637b) {
                    C2334C c2334c = aVar.f20540l;
                    aVar = aVar.b().r0(c2334c == null ? new C2334C(bVar) : c2334c.a(bVar)).P();
                }
                if (o10 && aVar.f20536h == -1 && aVar.f20537i == -1 && bVar.f12004a != -1) {
                    aVar = aVar.b().S(bVar.f12004a).P();
                }
            }
            androidx.media3.common.a c10 = aVar.c(this.f21595c.b(aVar));
            pArr[i10] = new b1.P(Integer.toString(i10), c10);
            this.f21584G = c10.f20549u | this.f21584G;
        }
        this.f21618z = new f(new m0(pArr), zArr);
        if (this.f21617y && this.f21579B == -9223372036854775807L) {
            this.f21579B = this.f21605m;
            this.f21578A = new a(this.f21578A);
        }
        this.f21599g.e(this.f21579B, this.f21578A, this.f21580C);
        this.f21615w = true;
        ((C.a) AbstractC4134a.e(this.f21612t)).i(this);
    }

    public static /* synthetic */ void y(W w10) {
        if (w10.f21592R) {
            return;
        }
        ((C.a) AbstractC4134a.e(w10.f21612t)).j(w10);
    }

    public final void L() {
        AbstractC4134a.g(this.f21615w);
        AbstractC4134a.e(this.f21618z);
        AbstractC4134a.e(this.f21578A);
    }

    public final boolean M(b bVar, int i10) {
        H1.J j10;
        if (this.f21586I || !((j10 = this.f21578A) == null || j10.m() == -9223372036854775807L)) {
            this.f21590O = i10;
            return true;
        }
        if (this.f21615w && !k0()) {
            this.f21589L = true;
            return false;
        }
        this.f21583F = this.f21615w;
        this.f21587J = 0L;
        this.f21590O = 0;
        for (b0 b0Var : this.sampleQueues) {
            b0Var.X();
        }
        bVar.j(0L, 0L);
        return true;
    }

    public final int O() {
        int i10 = 0;
        for (b0 b0Var : this.sampleQueues) {
            i10 += b0Var.J();
        }
        return i10;
    }

    public final long P(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.sampleQueues.length; i10++) {
            if (z10 || ((f) AbstractC4134a.e(this.f21618z)).trackEnabledStates[i10]) {
                j10 = Math.max(j10, this.sampleQueues[i10].C());
            }
        }
        return j10;
    }

    public H1.O Q() {
        return d0(new e(0, true));
    }

    public boolean S(int i10) {
        return !k0() && this.sampleQueues[i10].N(this.f21591P);
    }

    public final void U(int i10) {
        L();
        f fVar = this.f21618z;
        boolean[] zArr = fVar.trackNotifiedDownstreamFormats;
        if (zArr[i10]) {
            return;
        }
        androidx.media3.common.a a10 = fVar.f21638a.b(i10).a(0);
        this.f21597e.j(AbstractC2335D.k(a10.f20543o), a10, 0, null, this.f21587J);
        zArr[i10] = true;
    }

    public final void V(int i10) {
        L();
        if (this.f21589L) {
            if (!this.f21616x || this.f21618z.trackIsAudioVideoFlags[i10]) {
                if (this.sampleQueues[i10].N(false)) {
                    return;
                }
                this.f21588K = 0L;
                this.f21589L = false;
                this.f21583F = true;
                this.f21587J = 0L;
                this.f21590O = 0;
                for (b0 b0Var : this.sampleQueues) {
                    b0Var.X();
                }
                ((C.a) AbstractC4134a.e(this.f21612t)).j(this);
            }
        }
    }

    public void W() {
        this.f21606n.k(this.f21596d.c(this.f21581D));
    }

    public void X(int i10) {
        this.sampleQueues[i10].P();
        W();
    }

    public final void Y() {
        this.f21611s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.S
            @Override // java.lang.Runnable
            public final void run() {
                W.this.f21586I = true;
            }
        });
    }

    @Override // D1.m.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void l(b bVar, long j10, long j11, boolean z10) {
        C4401D c4401d = bVar.f21622c;
        C2223y c2223y = new C2223y(bVar.f21620a, bVar.f21630k, c4401d.p(), c4401d.q(), j10, j11, c4401d.o());
        this.f21596d.d(bVar.f21620a);
        this.f21597e.m(c2223y, 1, -1, null, 0, null, bVar.f21629j, this.f21579B);
        if (z10) {
            return;
        }
        for (b0 b0Var : this.sampleQueues) {
            b0Var.X();
        }
        if (this.f21585H > 0) {
            ((C.a) AbstractC4134a.e(this.f21612t)).j(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.b0.d
    public void a(androidx.media3.common.a aVar) {
        this.f21611s.post(this.f21609q);
    }

    @Override // D1.m.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, long j10, long j11) {
        if (this.f21579B == -9223372036854775807L && this.f21578A != null) {
            long P10 = P(true);
            long j12 = P10 == Long.MIN_VALUE ? 0L : P10 + 10000;
            this.f21579B = j12;
            this.f21599g.e(j12, this.f21578A, this.f21580C);
        }
        C4401D c4401d = bVar.f21622c;
        C2223y c2223y = new C2223y(bVar.f21620a, bVar.f21630k, c4401d.p(), c4401d.q(), j10, j11, c4401d.o());
        this.f21596d.d(bVar.f21620a);
        this.f21597e.p(c2223y, 1, -1, null, 0, null, bVar.f21629j, this.f21579B);
        this.f21591P = true;
        ((C.a) AbstractC4134a.e(this.f21612t)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        if (this.f21591P || this.f21606n.i() || this.f21589L) {
            return false;
        }
        if ((this.f21615w || this.f21604l != null) && this.f21585H == 0) {
            return false;
        }
        boolean f10 = this.f21608p.f();
        if (this.f21606n.j()) {
            return f10;
        }
        j0();
        return true;
    }

    @Override // D1.m.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c o(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        m.c h10;
        C4401D c4401d = bVar.f21622c;
        C2223y c2223y = new C2223y(bVar.f21620a, bVar.f21630k, c4401d.p(), c4401d.q(), j10, j11, c4401d.o());
        long b10 = this.f21596d.b(new k.c(c2223y, new B(1, -1, null, 0, null, e1.Z.J1(bVar.f21629j), e1.Z.J1(this.f21579B)), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = D1.m.f2457g;
            bVar2 = bVar;
        } else {
            int O10 = O();
            bVar2 = bVar;
            h10 = M(bVar2, O10) ? D1.m.h(O10 > this.f21590O, b10) : D1.m.f2456f;
        }
        boolean c10 = h10.c();
        this.f21597e.r(c2223y, 1, -1, null, 0, null, bVar2.f21629j, this.f21579B, iOException, !c10);
        if (!c10) {
            this.f21596d.d(bVar2.f21620a);
        }
        return h10;
    }

    @Override // H1.r
    public H1.O c(int i10, int i11) {
        return d0(new e(i10, false));
    }

    @Override // D1.m.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void j(b bVar, long j10, long j11, int i10) {
        C4401D c4401d = bVar.f21622c;
        this.f21597e.v(i10 == 0 ? new C2223y(bVar.f21620a, bVar.f21630k, j10) : new C2223y(bVar.f21620a, bVar.f21630k, c4401d.p(), c4401d.q(), j10, j11, c4401d.o()), 1, -1, null, 0, null, bVar.f21629j, this.f21579B, i10);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return g();
    }

    public final H1.O d0(e eVar) {
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.sampleQueueTrackIds[i10])) {
                return this.sampleQueues[i10];
            }
        }
        if (this.f21614v) {
            AbstractC4156x.i("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f21636a + ") after finishing tracks.");
            return new C1181n();
        }
        b0 l10 = b0.l(this.f21600h, this.f21595c, this.f21598f);
        l10.f0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.sampleQueueTrackIds, i11);
        eVarArr[length] = eVar;
        this.sampleQueueTrackIds = (e[]) e1.Z.j(eVarArr);
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.sampleQueues, i11);
        b0VarArr[length] = l10;
        this.sampleQueues = (b0[]) e1.Z.j(b0VarArr);
        return l10;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21606n.j() && this.f21608p.e();
    }

    public int e0(int i10, O0 o02, k1.f fVar, int i11) {
        if (k0()) {
            return -3;
        }
        U(i10);
        int U10 = this.sampleQueues[i10].U(o02, fVar, i11, this.f21591P);
        if (U10 == -3) {
            V(i10);
        }
        return U10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        L();
        if (!this.f21578A.i()) {
            return 0L;
        }
        J.a e10 = this.f21578A.e(j10);
        return o1Var.a(j10, e10.f4334a.f4339a, e10.f4335b.f4339a);
    }

    public void f0() {
        if (this.f21615w) {
            for (b0 b0Var : this.sampleQueues) {
                b0Var.T();
            }
        }
        this.f21606n.m(this);
        this.f21611s.removeCallbacksAndMessages(null);
        this.f21612t = null;
        this.f21592R = true;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        long j10;
        L();
        if (this.f21591P || this.f21585H == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f21588K;
        }
        if (this.f21616x) {
            int length = this.sampleQueues.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f21618z;
                if (fVar.trackIsAudioVideoFlags[i10] && fVar.trackEnabledStates[i10] && !this.sampleQueues[i10].M()) {
                    j10 = Math.min(j10, this.sampleQueues[i10].C());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == LongCompanionObject.MAX_VALUE) {
            j10 = P(false);
        }
        return j10 == Long.MIN_VALUE ? this.f21587J : j10;
    }

    public final boolean g0(boolean[] zArr, long j10, boolean z10) {
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            b0 b0Var = this.sampleQueues[i10];
            if (b0Var.F() != 0 || !z10) {
                if (!(this.f21617y ? b0Var.a0(b0Var.A()) : b0Var.b0(j10, this.f21591P)) && (zArr[i10] || !this.f21616x)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
    }

    public final void h0(H1.J j10) {
        this.f21578A = this.f21613u == null ? j10 : new J.b(-9223372036854775807L);
        this.f21579B = j10.m();
        boolean z10 = !this.f21586I && j10.m() == -9223372036854775807L;
        this.f21580C = z10;
        this.f21581D = z10 ? 7 : 1;
        if (this.f21615w) {
            this.f21599g.e(this.f21579B, j10, z10);
        } else {
            T();
        }
    }

    public int i0(int i10, long j10) {
        if (k0()) {
            return 0;
        }
        U(i10);
        b0 b0Var = this.sampleQueues[i10];
        int H10 = b0Var.H(j10, this.f21591P);
        b0Var.g0(H10);
        if (H10 == 0) {
            V(i10);
        }
        return H10;
    }

    public final void j0() {
        b bVar = new b(this.f21593a, this.f21594b, this.f21607o, this, this.f21608p);
        if (this.f21615w) {
            AbstractC4134a.g(R());
            long j10 = this.f21579B;
            if (j10 != -9223372036854775807L && this.f21588K > j10) {
                this.f21591P = true;
                this.f21588K = -9223372036854775807L;
                return;
            }
            bVar.j(((H1.J) AbstractC4134a.e(this.f21578A)).e(this.f21588K).f4334a.f4340b, this.f21588K);
            for (b0 b0Var : this.sampleQueues) {
                b0Var.d0(this.f21588K);
            }
            this.f21588K = -9223372036854775807L;
        }
        this.f21590O = O();
        this.f21606n.n(bVar, this, this.f21596d.c(this.f21581D));
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        L();
        boolean[] zArr = this.f21618z.trackIsAudioVideoFlags;
        if (!this.f21578A.i()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f21583F = false;
        boolean z10 = this.f21587J == j10;
        this.f21587J = j10;
        if (R()) {
            this.f21588K = j10;
            return j10;
        }
        if (this.f21581D == 7 || ((!this.f21591P && !this.f21606n.j()) || !g0(zArr, j10, z10))) {
            this.f21589L = false;
            this.f21588K = j10;
            this.f21591P = false;
            this.f21584G = false;
            if (this.f21606n.j()) {
                b0[] b0VarArr = this.sampleQueues;
                int length = b0VarArr.length;
                while (i10 < length) {
                    b0VarArr[i10].s();
                    i10++;
                }
                this.f21606n.f();
                return j10;
            }
            this.f21606n.g();
            b0[] b0VarArr2 = this.sampleQueues;
            int length2 = b0VarArr2.length;
            while (i10 < length2) {
                b0VarArr2[i10].X();
                i10++;
            }
        }
        return j10;
    }

    public final boolean k0() {
        return this.f21583F || R();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        androidx.media3.exoplayer.trackselection.y yVar;
        L();
        f fVar = this.f21618z;
        m0 m0Var = fVar.f21638a;
        boolean[] zArr3 = fVar.trackEnabledStates;
        int i10 = this.f21585H;
        int i11 = 0;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            c0 c0Var = c0VarArr[i12];
            if (c0Var != null && (yVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) c0Var).f21634a;
                AbstractC4134a.g(zArr3[i13]);
                this.f21585H--;
                zArr3[i13] = false;
                c0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f21582E ? j10 == 0 || this.f21617y : i10 != 0;
        for (int i14 = 0; i14 < yVarArr.length; i14++) {
            if (c0VarArr[i14] == null && (yVar = yVarArr[i14]) != null) {
                AbstractC4134a.g(yVar.length() == 1);
                AbstractC4134a.g(yVar.f(0) == 0);
                int d10 = m0Var.d(yVar.m());
                AbstractC4134a.g(!zArr3[d10]);
                this.f21585H++;
                zArr3[d10] = true;
                this.f21584G = yVar.r().f20549u | this.f21584G;
                c0VarArr[i14] = new d(d10);
                zArr2[i14] = true;
                if (!z10) {
                    b0 b0Var = this.sampleQueues[d10];
                    z10 = (b0Var.F() == 0 || b0Var.b0(j10, true)) ? false : true;
                }
            }
        }
        if (this.f21585H == 0) {
            this.f21589L = false;
            this.f21583F = false;
            this.f21584G = false;
            if (this.f21606n.j()) {
                b0[] b0VarArr = this.sampleQueues;
                int length = b0VarArr.length;
                while (i11 < length) {
                    b0VarArr[i11].s();
                    i11++;
                }
                this.f21606n.f();
            } else {
                this.f21591P = false;
                b0[] b0VarArr2 = this.sampleQueues;
                int length2 = b0VarArr2.length;
                while (i11 < length2) {
                    b0VarArr2[i11].X();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = k(j10);
            while (i11 < c0VarArr.length) {
                if (c0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f21582E = true;
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        if (this.f21584G) {
            this.f21584G = false;
            return this.f21587J;
        }
        if (!this.f21583F) {
            return -9223372036854775807L;
        }
        if (!this.f21591P && O() <= this.f21590O) {
            return -9223372036854775807L;
        }
        this.f21583F = false;
        return this.f21587J;
    }

    @Override // D1.m.f
    public void p() {
        for (b0 b0Var : this.sampleQueues) {
            b0Var.V();
        }
        this.f21607o.release();
    }

    @Override // H1.r
    public void q(final H1.J j10) {
        this.f21611s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.V
            @Override // java.lang.Runnable
            public final void run() {
                W.this.h0(j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        W();
        if (this.f21591P && !this.f21615w) {
            throw C2338G.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // H1.r
    public void s() {
        this.f21614v = true;
        this.f21611s.post(this.f21609q);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21612t = aVar;
        if (this.f21604l == null) {
            this.f21608p.f();
            j0();
        } else {
            c(this.f21603k, 3).c(this.f21604l);
            h0(new H1.E(new long[]{0}, new long[]{0}, -9223372036854775807L));
            s();
            this.f21588K = j10;
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        L();
        return this.f21618z.f21638a;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        if (this.f21617y) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f21618z.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.sampleQueues[i10].r(j10, z10, zArr[i10]);
        }
    }
}
