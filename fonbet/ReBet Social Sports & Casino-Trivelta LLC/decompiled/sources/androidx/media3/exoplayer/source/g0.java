package androidx.media3.exoplayer.source;

import D1.k;
import D1.m;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.L;
import b1.AbstractC2335D;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import h1.AbstractC4417m;
import h1.C4401D;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import m1.O0;
import m1.o1;

/* loaded from: classes.dex */
public final class g0 implements C, m.b {

    /* renamed from: a, reason: collision with root package name */
    public final C4418n f21768a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4411g.a f21769b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4403F f21770c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.k f21771d;

    /* renamed from: e, reason: collision with root package name */
    public final L.a f21772e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f21773f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21774g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final long f21775h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.m f21776i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.a f21777j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21778k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21779l;

    /* renamed from: m, reason: collision with root package name */
    public int f21780m;
    byte[] sampleData;

    public final class b implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public int f21781a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21782b;

        public b() {
        }

        @Override // androidx.media3.exoplayer.source.c0
        public void a() {
            g0 g0Var = g0.this;
            if (g0Var.f21778k) {
                return;
            }
            g0Var.f21776i.a();
        }

        public final void b() {
            if (this.f21782b) {
                return;
            }
            g0.this.f21772e.j(AbstractC2335D.k(g0.this.f21777j.f20543o), g0.this.f21777j, 0, null, 0L);
            this.f21782b = true;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public boolean c() {
            return g0.this.f21779l;
        }

        public void d() {
            if (this.f21781a == 2) {
                this.f21781a = 1;
            }
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int q(long j10) {
            b();
            if (j10 <= 0 || this.f21781a == 2) {
                return 0;
            }
            this.f21781a = 2;
            return 1;
        }

        @Override // androidx.media3.exoplayer.source.c0
        public int s(O0 o02, k1.f fVar, int i10) {
            b();
            g0 g0Var = g0.this;
            boolean z10 = g0Var.f21779l;
            if (z10 && g0Var.sampleData == null) {
                this.f21781a = 2;
            }
            int i11 = this.f21781a;
            if (i11 == 2) {
                fVar.e(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                o02.f56121b = g0Var.f21777j;
                this.f21781a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            AbstractC4134a.e(g0Var.sampleData);
            fVar.e(1);
            fVar.f54110f = 0L;
            if ((i10 & 4) == 0) {
                fVar.p(g0.this.f21780m);
                ByteBuffer byteBuffer = fVar.f54108d;
                g0 g0Var2 = g0.this;
                byteBuffer.put(g0Var2.sampleData, 0, g0Var2.f21780m);
            }
            if ((i10 & 1) == 0) {
                this.f21781a = 2;
            }
            return -4;
        }
    }

    public static final class c implements m.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f21784a = C2223y.a();

        /* renamed from: b, reason: collision with root package name */
        public final C4418n f21785b;

        /* renamed from: c, reason: collision with root package name */
        public final C4401D f21786c;
        private byte[] sampleData;

        public c(C4418n c4418n, InterfaceC4411g interfaceC4411g) {
            this.f21785b = c4418n;
            this.f21786c = new C4401D(interfaceC4411g);
        }

        @Override // D1.m.e
        public void a() {
            this.f21786c.r();
            try {
                this.f21786c.b(this.f21785b);
                int i10 = 0;
                while (i10 != -1) {
                    int o10 = (int) this.f21786c.o();
                    byte[] bArr = this.sampleData;
                    if (bArr == null) {
                        this.sampleData = new byte[1024];
                    } else if (o10 == bArr.length) {
                        this.sampleData = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C4401D c4401d = this.f21786c;
                    byte[] bArr2 = this.sampleData;
                    i10 = c4401d.read(bArr2, o10, bArr2.length - o10);
                }
                AbstractC4417m.a(this.f21786c);
            } catch (Throwable th2) {
                AbstractC4417m.a(this.f21786c);
                throw th2;
            }
        }

        @Override // D1.m.e
        public void c() {
        }
    }

    public g0(C4418n c4418n, InterfaceC4411g.a aVar, InterfaceC4403F interfaceC4403F, androidx.media3.common.a aVar2, long j10, D1.k kVar, L.a aVar3, boolean z10, E1.b bVar) {
        this.f21768a = c4418n;
        this.f21769b = aVar;
        this.f21770c = interfaceC4403F;
        this.f21777j = aVar2;
        this.f21775h = j10;
        this.f21771d = kVar;
        this.f21772e = aVar3;
        this.f21778k = z10;
        this.f21773f = new m0(new b1.P(aVar2));
        this.f21776i = bVar != null ? new D1.m(bVar) : new D1.m("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        if (this.f21779l || this.f21776i.j() || this.f21776i.i()) {
            return false;
        }
        InterfaceC4411g a10 = this.f21769b.a();
        InterfaceC4403F interfaceC4403F = this.f21770c;
        if (interfaceC4403F != null) {
            a10.c(interfaceC4403F);
        }
        this.f21776i.n(new c(this.f21768a, a10), this, this.f21771d.c(1));
        return true;
    }

    @Override // D1.m.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void l(c cVar, long j10, long j11, boolean z10) {
        C4401D c4401d = cVar.f21786c;
        C2223y c2223y = new C2223y(cVar.f21784a, cVar.f21785b, c4401d.p(), c4401d.q(), j10, j11, c4401d.o());
        this.f21771d.d(cVar.f21784a);
        this.f21772e.m(c2223y, 1, -1, null, 0, null, 0L, this.f21775h);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return (this.f21779l || this.f21776i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21776i.j();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return this.f21779l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        for (int i10 = 0; i10 < this.f21774g.size(); i10++) {
            ((b) this.f21774g.get(i10)).d();
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null && (yVarArr[i10] == null || !zArr[i10])) {
                this.f21774g.remove(c0Var);
                c0VarArr[i10] = null;
            }
            if (c0VarArr[i10] == null && yVarArr[i10] != null) {
                b bVar = new b();
                this.f21774g.add(bVar);
                c0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        return -9223372036854775807L;
    }

    @Override // D1.m.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, long j10, long j11) {
        this.f21780m = (int) cVar.f21786c.o();
        this.sampleData = (byte[]) AbstractC4134a.e(cVar.sampleData);
        this.f21779l = true;
        C4401D c4401d = cVar.f21786c;
        C2223y c2223y = new C2223y(cVar.f21784a, cVar.f21785b, c4401d.p(), c4401d.q(), j10, j11, this.f21780m);
        this.f21771d.d(cVar.f21784a);
        this.f21772e.p(c2223y, 1, -1, this.f21777j, 0, null, 0L, this.f21775h);
    }

    @Override // D1.m.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public m.c o(c cVar, long j10, long j11, IOException iOException, int i10) {
        m.c h10;
        C4401D c4401d = cVar.f21786c;
        C2223y c2223y = new C2223y(cVar.f21784a, cVar.f21785b, c4401d.p(), c4401d.q(), j10, j11, c4401d.o());
        long b10 = this.f21771d.b(new k.c(c2223y, new B(1, -1, this.f21777j, 0, null, 0L, e1.Z.J1(this.f21775h)), iOException, i10));
        boolean z10 = b10 == -9223372036854775807L || i10 >= this.f21771d.c(1);
        if (this.f21778k && z10) {
            AbstractC4156x.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f21779l = true;
            h10 = D1.m.f2456f;
        } else {
            h10 = b10 != -9223372036854775807L ? D1.m.h(false, b10) : D1.m.f2457g;
        }
        m.c cVar2 = h10;
        boolean c10 = cVar2.c();
        this.f21772e.r(c2223y, 1, -1, this.f21777j, 0, null, 0L, this.f21775h, iOException, !c10);
        if (!c10) {
            this.f21771d.d(cVar.f21784a);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
    }

    @Override // D1.m.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void j(c cVar, long j10, long j11, int i10) {
        C4401D c4401d = cVar.f21786c;
        this.f21772e.v(i10 == 0 ? new C2223y(cVar.f21784a, cVar.f21785b, j10) : new C2223y(cVar.f21784a, cVar.f21785b, c4401d.p(), c4401d.q(), j10, j11, c4401d.o()), 1, -1, this.f21777j, 0, null, 0L, this.f21775h, i10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        aVar.i(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return this.f21773f;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
    }

    public void w() {
        this.f21776i.l();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        return j10;
    }
}
