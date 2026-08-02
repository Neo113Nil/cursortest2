package r1;

import D1.f;
import H1.C1177j;
import H1.InterfaceC1184q;
import android.net.Uri;
import androidx.media3.common.DrmInitData;
import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.J;
import e1.Q;
import e1.U;
import h1.AbstractC4417m;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import n1.G1;
import r1.f;
import s1.f;

/* loaded from: classes.dex */
public final class j extends B1.m {

    /* renamed from: O, reason: collision with root package name */
    public static final AtomicInteger f63786O = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f63787A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f63788B;

    /* renamed from: C, reason: collision with root package name */
    public final G1 f63789C;

    /* renamed from: D, reason: collision with root package name */
    public final long f63790D;

    /* renamed from: E, reason: collision with root package name */
    public k f63791E;

    /* renamed from: F, reason: collision with root package name */
    public s f63792F;

    /* renamed from: G, reason: collision with root package name */
    public int f63793G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f63794H;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f63795I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f63796J;

    /* renamed from: K, reason: collision with root package name */
    public AbstractC3445z f63797K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f63798L;

    /* renamed from: M, reason: collision with root package name */
    public long f63799M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f63800N;

    /* renamed from: k, reason: collision with root package name */
    public final int f63801k;

    /* renamed from: l, reason: collision with root package name */
    public final int f63802l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f63803m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f63804n;

    /* renamed from: o, reason: collision with root package name */
    public final int f63805o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC4411g f63806p;

    /* renamed from: q, reason: collision with root package name */
    public final C4418n f63807q;

    /* renamed from: r, reason: collision with root package name */
    public final k f63808r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f63809s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f63810t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f63811u;

    /* renamed from: v, reason: collision with root package name */
    public final h f63812v;

    /* renamed from: w, reason: collision with root package name */
    public final List f63813w;

    /* renamed from: x, reason: collision with root package name */
    public final DrmInitData f63814x;

    /* renamed from: y, reason: collision with root package name */
    public final V1.h f63815y;

    /* renamed from: z, reason: collision with root package name */
    public final J f63816z;

    public j(h hVar, InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, boolean z10, InterfaceC4411g interfaceC4411g2, C4418n c4418n2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, Q q10, long j13, DrmInitData drmInitData, k kVar, V1.h hVar2, J j14, boolean z15, boolean z16, G1 g12) {
        super(interfaceC4411g, c4418n, aVar, i10, obj, j10, j11, j12);
        this.f63787A = z10;
        this.f63805o = i11;
        this.f63799M = z12 ? j11 - j10 : -9223372036854775807L;
        this.f63802l = i12;
        this.f63807q = c4418n2;
        this.f63806p = interfaceC4411g2;
        this.f63794H = c4418n2 != null;
        this.f63788B = z11;
        this.f63803m = uri;
        this.f63809s = z14;
        this.f63811u = q10;
        this.f63790D = j13;
        this.f63810t = z13;
        this.f63812v = hVar;
        this.f63813w = list;
        this.f63814x = drmInitData;
        this.f63808r = kVar;
        this.f63815y = hVar2;
        this.f63816z = j14;
        this.f63800N = z15;
        this.f63804n = z16;
        this.f63789C = g12;
        this.f63797K = AbstractC3445z.t();
        this.f63801k = f63786O.getAndIncrement();
    }

    public static InterfaceC4411g i(InterfaceC4411g interfaceC4411g, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC4411g;
        }
        AbstractC4134a.e(bArr2);
        return new C6196a(interfaceC4411g, bArr, bArr2);
    }

    public static j k(h hVar, InterfaceC4411g interfaceC4411g, androidx.media3.common.a aVar, long j10, s1.f fVar, f.e eVar, Uri uri, List list, int i10, Object obj, boolean z10, v vVar, long j11, j jVar, byte[] bArr, byte[] bArr2, boolean z11, boolean z12, G1 g12, f.C0047f c0047f) {
        boolean z13;
        InterfaceC4411g interfaceC4411g2;
        C4418n c4418n;
        boolean z14;
        Uri uri2;
        V1.h hVar2;
        J j12;
        k kVar;
        f.g gVar = eVar.f63780a;
        C4418n a10 = new C4418n.b().i(U.g(fVar.f64566a, gVar.f64529a)).h(gVar.f64537i).g(gVar.f64538j).b(eVar.f63783d ? 8 : 0).a();
        if (c0047f != null) {
            a10 = c0047f.a().a(a10);
        }
        C4418n c4418n2 = a10;
        boolean z15 = bArr != null;
        InterfaceC4411g i11 = i(interfaceC4411g, bArr, z15 ? m((String) AbstractC4134a.e(gVar.f64536h)) : null);
        f.C0896f c0896f = gVar.f64530b;
        if (c0896f != null) {
            boolean z16 = bArr2 != null;
            byte[] m10 = z16 ? m((String) AbstractC4134a.e(c0896f.f64536h)) : null;
            z13 = true;
            c4418n = new C4418n.b().i(U.g(fVar.f64566a, c0896f.f64529a)).h(c0896f.f64537i).g(c0896f.f64538j).a();
            if (c0047f != null) {
                c4418n = c0047f.l(com.google.android.material.shape.i.f35755A).a().a(c4418n);
            }
            interfaceC4411g2 = i(interfaceC4411g, bArr2, m10);
            z14 = z16;
        } else {
            z13 = true;
            interfaceC4411g2 = null;
            c4418n = null;
            z14 = false;
        }
        long j13 = j10 + gVar.f64533e;
        long j14 = j13 + gVar.f64531c;
        int i12 = fVar.f64470j + gVar.f64532d;
        if (jVar != null) {
            C4418n c4418n3 = jVar.f63807q;
            boolean z17 = (c4418n == c4418n3 || (c4418n != null && c4418n3 != null && c4418n.f47554a.equals(c4418n3.f47554a) && c4418n.f47559f == jVar.f63807q.f47559f)) ? z13 : false;
            uri2 = uri;
            boolean z18 = (uri2.equals(jVar.f63803m) && jVar.f63796J) ? z13 : false;
            hVar2 = jVar.f63815y;
            j12 = jVar.f63816z;
            kVar = (z17 && z18 && !jVar.f63798L && jVar.f63802l == i12) ? jVar.f63791E : null;
        } else {
            uri2 = uri;
            hVar2 = new V1.h();
            j12 = new J(10);
            kVar = null;
        }
        return new j(hVar, i11, c4418n2, aVar, z15, interfaceC4411g2, c4418n, z14, uri2, list, i10, obj, j13, j14, eVar.f63781b, eVar.f63782c, !eVar.f63783d, i12, gVar.f64539k, z10, vVar.a(i12), j11, gVar.f64534f, kVar, hVar2, j12, z11, z12, g12);
    }

    public static byte[] m(String str) {
        if (Ra.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean y(j jVar, long j10, Uri uri, boolean z10, f.e eVar, long j11) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f63803m) && jVar.f63796J) {
            return false;
        }
        return !z10 || j11 + eVar.f63780a.f64533e < j10;
    }

    @Override // D1.m.e
    public void a() {
        k kVar;
        AbstractC4134a.e(this.f63792F);
        if (this.f63791E == null && (kVar = this.f63808r) != null && kVar.d()) {
            this.f63791E = this.f63808r;
            this.f63794H = false;
        }
        t();
        if (this.f63795I) {
            return;
        }
        if (!this.f63810t) {
            s();
        }
        this.f63796J = !this.f63795I;
    }

    @Override // D1.m.e
    public void c() {
        this.f63795I = true;
    }

    @Override // B1.m
    public boolean h() {
        return this.f63796J;
    }

    public void j() {
        this.f63800N = false;
    }

    public final void l(InterfaceC4411g interfaceC4411g, C4418n c4418n, boolean z10, boolean z11) {
        C4418n e10;
        long position;
        if (z10) {
            r0 = this.f63793G != 0;
            e10 = c4418n;
        } else {
            e10 = c4418n.e(this.f63793G);
        }
        try {
            C1177j v10 = v(interfaceC4411g, e10, z11);
            if (r0) {
                v10.l(this.f63793G);
            }
            while (!this.f63795I && this.f63791E.a(v10)) {
                try {
                    try {
                    } catch (EOFException e11) {
                        if ((this.f559d.f20534f & 16384) == 0) {
                            throw e11;
                        }
                        this.f63791E.b();
                        position = v10.getPosition();
                    }
                } catch (Throwable th2) {
                    this.f63793G = (int) (v10.getPosition() - c4418n.f47559f);
                    throw th2;
                }
            }
            position = v10.getPosition();
            this.f63793G = (int) (position - c4418n.f47559f);
        } finally {
            AbstractC4417m.a(interfaceC4411g);
        }
    }

    public int n(int i10) {
        AbstractC4134a.g(!this.f63800N);
        if (i10 >= this.f63797K.size()) {
            return 0;
        }
        return ((Integer) this.f63797K.get(i10)).intValue();
    }

    public long o() {
        long j10 = this.f63799M;
        if (j10 != -9223372036854775807L) {
            return this.f562g + j10;
        }
        return -9223372036854775807L;
    }

    public void p(s sVar, AbstractC3445z abstractC3445z) {
        this.f63792F = sVar;
        this.f63797K = abstractC3445z;
    }

    public void q() {
        this.f63798L = true;
    }

    public boolean r() {
        return this.f63799M != -9223372036854775807L;
    }

    public final void s() {
        l(this.f564i, this.f557b, this.f63787A, true);
    }

    public final void t() {
        if (this.f63794H) {
            AbstractC4134a.e(this.f63806p);
            AbstractC4134a.e(this.f63807q);
            l(this.f63806p, this.f63807q, this.f63788B, false);
            this.f63793G = 0;
            this.f63794H = false;
        }
    }

    public final long u(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.g();
        try {
            this.f63816z.X(10);
            interfaceC1184q.n(this.f63816z.f(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f63816z.P() != 4801587) {
            return -9223372036854775807L;
        }
        this.f63816z.c0(3);
        int L10 = this.f63816z.L();
        int i10 = L10 + 10;
        if (i10 > this.f63816z.b()) {
            byte[] f10 = this.f63816z.f();
            this.f63816z.X(i10);
            System.arraycopy(f10, 0, this.f63816z.f(), 0, 10);
        }
        interfaceC1184q.n(this.f63816z.f(), 10, L10);
        C2334C e10 = this.f63815y.e(this.f63816z.f(), L10);
        if (e10 == null) {
            return -9223372036854775807L;
        }
        int e11 = e10.e();
        for (int i11 = 0; i11 < e11; i11++) {
            C2334C.a d10 = e10.d(i11);
            if (d10 instanceof V1.m) {
                V1.m mVar = (V1.m) d10;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f12361b)) {
                    System.arraycopy(mVar.privateData, 0, this.f63816z.f(), 0, 8);
                    this.f63816z.b0(0);
                    this.f63816z.a0(8);
                    return this.f63816z.F() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final C1177j v(InterfaceC4411g interfaceC4411g, C4418n c4418n, boolean z10) {
        k e10;
        long b10 = interfaceC4411g.b(c4418n);
        if (z10) {
            try {
                this.f63811u.j(this.f63809s, this.f562g, this.f63790D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e11) {
                throw new IOException(e11);
            }
        }
        C1177j c1177j = new C1177j(interfaceC4411g, c4418n.f47559f, b10);
        if (this.f63791E == null) {
            long u10 = u(c1177j);
            c1177j.g();
            k kVar = this.f63808r;
            if (kVar != null) {
                e10 = kVar.f();
            } else {
                e10 = this.f63812v.e(c4418n.f47554a, this.f559d, this.f63813w, this.f63811u, interfaceC4411g.f(), c1177j, this.f63789C);
                c1177j = c1177j;
            }
            this.f63791E = e10;
            if (e10.e()) {
                this.f63792F.r0(u10 != -9223372036854775807L ? this.f63811u.b(u10) : this.f562g);
            } else {
                this.f63792F.r0(0L);
            }
            this.f63792F.d0();
            this.f63791E.c(this.f63792F);
        }
        this.f63792F.o0(this.f63814x);
        return c1177j;
    }

    public void w(long j10) {
        this.f63799M = j10;
    }

    public boolean x() {
        return this.f63800N;
    }
}
