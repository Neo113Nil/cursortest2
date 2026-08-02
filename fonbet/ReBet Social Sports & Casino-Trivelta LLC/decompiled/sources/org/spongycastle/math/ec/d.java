package org.spongycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import oj.InterfaceC5919a;
import oj.InterfaceC5920b;
import org.spongycastle.math.ec.e;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.math.field.a f62821a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.math.ec.e f62822b;

    /* renamed from: c, reason: collision with root package name */
    public org.spongycastle.math.ec.e f62823c;

    /* renamed from: d, reason: collision with root package name */
    public BigInteger f62824d;

    /* renamed from: e, reason: collision with root package name */
    public BigInteger f62825e;

    /* renamed from: f, reason: collision with root package name */
    public int f62826f = 0;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC5919a f62827g = null;

    /* renamed from: h, reason: collision with root package name */
    public f f62828h = null;

    public static abstract class a extends d {

        /* renamed from: si, reason: collision with root package name */
        private BigInteger[] f62829si;

        public a(int i10, int i11, int i12, int i13) {
            super(F(i10, i11, i12, i13));
            this.f62829si = null;
        }

        public static org.spongycastle.math.field.a F(int i10, int i11, int i12, int i13) {
            if (i11 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i12 == 0) {
                if (i13 == 0) {
                    return org.spongycastle.math.field.b.a(new int[]{0, i11, i10});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i12 <= i11) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i13 > i12) {
                return org.spongycastle.math.field.b.a(new int[]{0, i11, i12, i13, i10});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        public synchronized BigInteger[] G() {
            try {
                if (this.f62829si == null) {
                    this.f62829si = q.f(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f62829si;
        }

        public boolean H() {
            if (this.f62824d == null || this.f62825e == null || !this.f62823c.h()) {
                return false;
            }
            return this.f62822b.i() || this.f62822b.h();
        }

        public final org.spongycastle.math.ec.e I(org.spongycastle.math.ec.e eVar) {
            org.spongycastle.math.ec.e eVar2;
            if (eVar.i()) {
                return eVar;
            }
            org.spongycastle.math.ec.e m10 = m(org.spongycastle.math.ec.c.f62724a);
            int t10 = t();
            Random random = new Random();
            do {
                org.spongycastle.math.ec.e m11 = m(new BigInteger(t10, random));
                org.spongycastle.math.ec.e eVar3 = eVar;
                eVar2 = m10;
                for (int i10 = 1; i10 < t10; i10++) {
                    org.spongycastle.math.ec.e o10 = eVar3.o();
                    eVar2 = eVar2.o().a(o10.j(m11));
                    eVar3 = o10.a(eVar);
                }
                if (!eVar3.i()) {
                    return null;
                }
            } while (eVar2.o().a(eVar2).i());
            return eVar2;
        }

        @Override // org.spongycastle.math.ec.d
        public g g(BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
            org.spongycastle.math.ec.e m10 = m(bigInteger);
            org.spongycastle.math.ec.e m11 = m(bigInteger2);
            int q10 = q();
            if (q10 == 5 || q10 == 6) {
                if (!m10.i()) {
                    m11 = m11.d(m10).a(m10);
                } else if (!m11.o().equals(o())) {
                    throw new IllegalArgumentException();
                }
            }
            return h(m10, m11, z10);
        }

        @Override // org.spongycastle.math.ec.d
        public g k(int i10, BigInteger bigInteger) {
            org.spongycastle.math.ec.e eVar;
            org.spongycastle.math.ec.e m10 = m(bigInteger);
            if (m10.i()) {
                eVar = o().n();
            } else {
                org.spongycastle.math.ec.e I10 = I(m10.o().g().j(o()).a(n()).a(m10));
                if (I10 != null) {
                    if (I10.s() != (i10 == 1)) {
                        I10 = I10.b();
                    }
                    int q10 = q();
                    eVar = (q10 == 5 || q10 == 6) ? I10.a(m10) : I10.j(m10);
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                return h(m10, eVar, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    public static abstract class b extends d {
        public b(BigInteger bigInteger) {
            super(org.spongycastle.math.field.b.b(bigInteger));
        }

        @Override // org.spongycastle.math.ec.d
        public g k(int i10, BigInteger bigInteger) {
            org.spongycastle.math.ec.e m10 = m(bigInteger);
            org.spongycastle.math.ec.e n10 = m10.o().a(this.f62822b).j(m10).a(this.f62823c).n();
            if (n10 == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (n10.s() != (i10 == 1)) {
                n10 = n10.m();
            }
            return h(m10, n10, true);
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f62830a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC5919a f62831b;

        /* renamed from: c, reason: collision with root package name */
        public f f62832c;

        public c(int i10, InterfaceC5919a interfaceC5919a, f fVar) {
            this.f62830a = i10;
            this.f62831b = interfaceC5919a;
            this.f62832c = fVar;
        }

        public d a() {
            if (!d.this.C(this.f62830a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            d c10 = d.this.c();
            if (c10 == d.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (c10) {
                c10.f62826f = this.f62830a;
                c10.f62827g = this.f62831b;
                c10.f62828h = this.f62832c;
            }
            return c10;
        }

        public c b(InterfaceC5919a interfaceC5919a) {
            this.f62831b = interfaceC5919a;
            return this;
        }
    }

    /* renamed from: org.spongycastle.math.ec.d$d, reason: collision with other inner class name */
    public static class C0867d extends a {

        /* renamed from: i, reason: collision with root package name */
        public int f62834i;

        /* renamed from: j, reason: collision with root package name */
        public int f62835j;

        /* renamed from: k, reason: collision with root package name */
        public int f62836k;

        /* renamed from: l, reason: collision with root package name */
        public int f62837l;

        /* renamed from: m, reason: collision with root package name */
        public g.c f62838m;

        public C0867d(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // org.spongycastle.math.ec.d
        public boolean C(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 6;
        }

        @Override // org.spongycastle.math.ec.d
        public d c() {
            return new C0867d(this.f62834i, this.f62835j, this.f62836k, this.f62837l, this.f62822b, this.f62823c, this.f62824d, this.f62825e);
        }

        @Override // org.spongycastle.math.ec.d
        public f e() {
            return H() ? new u() : super.e();
        }

        @Override // org.spongycastle.math.ec.d
        public g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
            return new g.c(this, eVar, eVar2, z10);
        }

        @Override // org.spongycastle.math.ec.d
        public g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
            return new g.c(this, eVar, eVar2, eVarArr, z10);
        }

        @Override // org.spongycastle.math.ec.d
        public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
            return new e.a(this.f62834i, this.f62835j, this.f62836k, this.f62837l, bigInteger);
        }

        @Override // org.spongycastle.math.ec.d
        public int t() {
            return this.f62834i;
        }

        @Override // org.spongycastle.math.ec.d
        public g u() {
            return this.f62838m;
        }

        public C0867d(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, i12, i13, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C0867d(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i10, i11, i12, i13);
            this.f62834i = i10;
            this.f62835j = i11;
            this.f62836k = i12;
            this.f62837l = i13;
            this.f62824d = bigInteger3;
            this.f62825e = bigInteger4;
            this.f62838m = new g.c(this, null, null);
            this.f62822b = m(bigInteger);
            this.f62823c = m(bigInteger2);
            this.f62826f = 6;
        }

        public C0867d(int i10, int i11, int i12, int i13, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i10, i11, i12, i13);
            this.f62834i = i10;
            this.f62835j = i11;
            this.f62836k = i12;
            this.f62837l = i13;
            this.f62824d = bigInteger;
            this.f62825e = bigInteger2;
            this.f62838m = new g.c(this, null, null);
            this.f62822b = eVar;
            this.f62823c = eVar2;
            this.f62826f = 6;
        }
    }

    public static class e extends b {

        /* renamed from: i, reason: collision with root package name */
        public BigInteger f62839i;

        /* renamed from: j, reason: collision with root package name */
        public BigInteger f62840j;

        /* renamed from: k, reason: collision with root package name */
        public g.d f62841k;

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.spongycastle.math.ec.d
        public boolean C(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4;
        }

        @Override // org.spongycastle.math.ec.d
        public d c() {
            return new e(this.f62839i, this.f62840j, this.f62822b, this.f62823c, this.f62824d, this.f62825e);
        }

        @Override // org.spongycastle.math.ec.d
        public g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10) {
            return new g.d(this, eVar, eVar2, z10);
        }

        @Override // org.spongycastle.math.ec.d
        public g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10) {
            return new g.d(this, eVar, eVar2, eVarArr, z10);
        }

        @Override // org.spongycastle.math.ec.d
        public org.spongycastle.math.ec.e m(BigInteger bigInteger) {
            return new e.b(this.f62839i, this.f62840j, bigInteger);
        }

        @Override // org.spongycastle.math.ec.d
        public int t() {
            return this.f62839i.bitLength();
        }

        @Override // org.spongycastle.math.ec.d
        public g u() {
            return this.f62841k;
        }

        @Override // org.spongycastle.math.ec.d
        public g y(g gVar) {
            int q10;
            return (this == gVar.h() || q() != 2 || gVar.r() || !((q10 = gVar.h().q()) == 2 || q10 == 3 || q10 == 4)) ? super.y(gVar) : new g.d(this, m(gVar.f62849b.t()), m(gVar.f62850c.t()), new org.spongycastle.math.ec.e[]{m(gVar.zs[0].t())}, gVar.f62851d);
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f62839i = bigInteger;
            this.f62840j = e.b.u(bigInteger);
            this.f62841k = new g.d(this, null, null);
            this.f62822b = m(bigInteger2);
            this.f62823c = m(bigInteger3);
            this.f62824d = bigInteger4;
            this.f62825e = bigInteger5;
            this.f62826f = 4;
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f62839i = bigInteger;
            this.f62840j = bigInteger2;
            this.f62841k = new g.d(this, null, null);
            this.f62822b = eVar;
            this.f62823c = eVar2;
            this.f62824d = bigInteger3;
            this.f62825e = bigInteger4;
            this.f62826f = 4;
        }
    }

    public d(org.spongycastle.math.field.a aVar) {
        this.f62821a = aVar;
    }

    public void A(g[] gVarArr, int i10, int i11, org.spongycastle.math.ec.e eVar) {
        b(gVarArr, i10, i11);
        int q10 = q();
        if (q10 == 0 || q10 == 5) {
            if (eVar != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        org.spongycastle.math.ec.e[] eVarArr = new org.spongycastle.math.ec.e[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i10 + i13;
            g gVar = gVarArr[i14];
            if (gVar != null && (eVar != null || !gVar.s())) {
                eVarArr[i12] = gVar.q(0);
                iArr[i12] = i14;
                i12++;
            }
        }
        if (i12 == 0) {
            return;
        }
        org.spongycastle.math.ec.b.m(eVarArr, 0, i12, eVar);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = iArr[i15];
            gVarArr[i16] = gVarArr[i16].w(eVarArr[i15]);
        }
    }

    public void B(g gVar, String str, n nVar) {
        a(gVar);
        synchronized (gVar) {
            try {
                Hashtable hashtable = gVar.f62852e;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    gVar.f62852e = hashtable;
                }
                hashtable.put(str, nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract boolean C(int i10);

    public g D(BigInteger bigInteger, BigInteger bigInteger2) {
        g f10 = f(bigInteger, bigInteger2);
        if (f10.isValid()) {
            return f10;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public g E(BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
        g g10 = g(bigInteger, bigInteger2, z10);
        if (g10.isValid()) {
            return g10;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public void a(g gVar) {
        if (gVar == null || this != gVar.h()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public void b(g[] gVarArr, int i10, int i11) {
        if (gVarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i10 < 0 || i11 < 0 || i10 > gVarArr.length - i11) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar = gVarArr[i10 + i12];
            if (gVar != null && this != gVar.h()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public abstract d c();

    public synchronized c d() {
        return new c(this.f62826f, this.f62827g, this.f62828h);
    }

    public f e() {
        InterfaceC5919a interfaceC5919a = this.f62827g;
        return interfaceC5919a instanceof InterfaceC5920b ? new l(this, (InterfaceC5920b) interfaceC5919a) : new r();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l((d) obj);
        }
        return true;
    }

    public g f(BigInteger bigInteger, BigInteger bigInteger2) {
        return g(bigInteger, bigInteger2, false);
    }

    public g g(BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
        return h(m(bigInteger), m(bigInteger2), z10);
    }

    public abstract g h(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, boolean z10);

    public int hashCode() {
        return (s().hashCode() ^ Aj.c.a(n().t().hashCode(), 8)) ^ Aj.c.a(o().t().hashCode(), 16);
    }

    public abstract g i(org.spongycastle.math.ec.e eVar, org.spongycastle.math.ec.e eVar2, org.spongycastle.math.ec.e[] eVarArr, boolean z10);

    public g j(byte[] bArr) {
        g u10;
        int t10 = (t() + 7) / 8;
        byte b10 = bArr[0];
        if (b10 != 0) {
            if (b10 == 2 || b10 == 3) {
                if (bArr.length != t10 + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                u10 = k(b10 & 1, Aj.b.d(bArr, 1, t10));
                if (!u10.x()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b10 != 4) {
                if (b10 != 6 && b10 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b10, 16));
                }
                if (bArr.length != (t10 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger d10 = Aj.b.d(bArr, 1, t10);
                BigInteger d11 = Aj.b.d(bArr, t10 + 1, t10);
                if (d11.testBit(0) != (b10 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                u10 = D(d10, d11);
            } else {
                if (bArr.length != (t10 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                u10 = D(Aj.b.d(bArr, 1, t10), Aj.b.d(bArr, t10 + 1, t10));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            u10 = u();
        }
        if (b10 == 0 || !u10.r()) {
            return u10;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract g k(int i10, BigInteger bigInteger);

    public boolean l(d dVar) {
        if (this != dVar) {
            return dVar != null && s().equals(dVar.s()) && n().t().equals(dVar.n().t()) && o().t().equals(dVar.o().t());
        }
        return true;
    }

    public abstract org.spongycastle.math.ec.e m(BigInteger bigInteger);

    public org.spongycastle.math.ec.e n() {
        return this.f62822b;
    }

    public org.spongycastle.math.ec.e o() {
        return this.f62823c;
    }

    public BigInteger p() {
        return this.f62825e;
    }

    public int q() {
        return this.f62826f;
    }

    public InterfaceC5919a r() {
        return this.f62827g;
    }

    public org.spongycastle.math.field.a s() {
        return this.f62821a;
    }

    public abstract int t();

    public abstract g u();

    public synchronized f v() {
        try {
            if (this.f62828h == null) {
                this.f62828h = e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f62828h;
    }

    public BigInteger w() {
        return this.f62824d;
    }

    public n x(g gVar, String str) {
        n nVar;
        a(gVar);
        synchronized (gVar) {
            Hashtable hashtable = gVar.f62852e;
            nVar = hashtable == null ? null : (n) hashtable.get(str);
        }
        return nVar;
    }

    public g y(g gVar) {
        if (this == gVar.h()) {
            return gVar;
        }
        if (gVar.r()) {
            return u();
        }
        g v10 = gVar.v();
        return E(v10.o().t(), v10.p().t(), v10.f62851d);
    }

    public void z(g[] gVarArr) {
        A(gVarArr, 0, gVarArr.length, null);
    }
}
