package org.spongycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes5.dex */
public abstract class e implements c {

    public static class b extends e {

        /* renamed from: g, reason: collision with root package name */
        public BigInteger f62845g;

        /* renamed from: h, reason: collision with root package name */
        public BigInteger f62846h;

        /* renamed from: i, reason: collision with root package name */
        public BigInteger f62847i;

        public b(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, u(bigInteger), bigInteger2);
        }

        public static BigInteger u(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return c.f62725b.shiftLeft(bitLength).subtract(bigInteger);
        }

        public BigInteger A(BigInteger bigInteger) {
            int f10 = f();
            int i10 = (f10 + 31) >> 5;
            int[] n10 = pj.m.n(f10, this.f62845g);
            int[] n11 = pj.m.n(f10, bigInteger);
            int[] i11 = pj.m.i(i10);
            pj.b.d(n10, n11, i11);
            return pj.m.O(i10, i11);
        }

        public BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            return C(bigInteger.multiply(bigInteger2));
        }

        public BigInteger C(BigInteger bigInteger) {
            if (this.f62846h == null) {
                return bigInteger.mod(this.f62845g);
            }
            boolean z10 = bigInteger.signum() < 0;
            if (z10) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f62845g.bitLength();
            boolean equals = this.f62846h.equals(c.f62725b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f62846h);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f62845g) >= 0) {
                bigInteger = bigInteger.subtract(this.f62845g);
            }
            return (!z10 || bigInteger.signum() == 0) ? bigInteger : this.f62845g.subtract(bigInteger);
        }

        public BigInteger D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f62845g) : subtract;
        }

        @Override // org.spongycastle.math.ec.e
        public e a(e eVar) {
            return new b(this.f62845g, this.f62846h, x(this.f62847i, eVar.t()));
        }

        @Override // org.spongycastle.math.ec.e
        public e b() {
            BigInteger add = this.f62847i.add(c.f62725b);
            if (add.compareTo(this.f62845g) == 0) {
                add = c.f62724a;
            }
            return new b(this.f62845g, this.f62846h, add);
        }

        @Override // org.spongycastle.math.ec.e
        public e d(e eVar) {
            return new b(this.f62845g, this.f62846h, B(this.f62847i, A(eVar.t())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f62845g.equals(bVar.f62845g) && this.f62847i.equals(bVar.f62847i);
        }

        @Override // org.spongycastle.math.ec.e
        public int f() {
            return this.f62845g.bitLength();
        }

        @Override // org.spongycastle.math.ec.e
        public e g() {
            return new b(this.f62845g, this.f62846h, A(this.f62847i));
        }

        public int hashCode() {
            return this.f62845g.hashCode() ^ this.f62847i.hashCode();
        }

        @Override // org.spongycastle.math.ec.e
        public e j(e eVar) {
            return new b(this.f62845g, this.f62846h, B(this.f62847i, eVar.t()));
        }

        @Override // org.spongycastle.math.ec.e
        public e k(e eVar, e eVar2, e eVar3) {
            BigInteger bigInteger = this.f62847i;
            BigInteger t10 = eVar.t();
            BigInteger t11 = eVar2.t();
            BigInteger t12 = eVar3.t();
            return new b(this.f62845g, this.f62846h, C(bigInteger.multiply(t10).subtract(t11.multiply(t12))));
        }

        @Override // org.spongycastle.math.ec.e
        public e l(e eVar, e eVar2, e eVar3) {
            BigInteger bigInteger = this.f62847i;
            BigInteger t10 = eVar.t();
            BigInteger t11 = eVar2.t();
            BigInteger t12 = eVar3.t();
            return new b(this.f62845g, this.f62846h, C(bigInteger.multiply(t10).add(t11.multiply(t12))));
        }

        @Override // org.spongycastle.math.ec.e
        public e m() {
            if (this.f62847i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f62845g;
            return new b(bigInteger, this.f62846h, bigInteger.subtract(this.f62847i));
        }

        @Override // org.spongycastle.math.ec.e
        public e n() {
            if (i() || h()) {
                return this;
            }
            if (!this.f62845g.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f62845g.testBit(1)) {
                BigInteger add = this.f62845g.shiftRight(2).add(c.f62725b);
                BigInteger bigInteger = this.f62845g;
                return v(new b(bigInteger, this.f62846h, this.f62847i.modPow(add, bigInteger)));
            }
            if (this.f62845g.testBit(2)) {
                BigInteger modPow = this.f62847i.modPow(this.f62845g.shiftRight(3), this.f62845g);
                BigInteger B10 = B(modPow, this.f62847i);
                if (B(B10, modPow).equals(c.f62725b)) {
                    return v(new b(this.f62845g, this.f62846h, B10));
                }
                return v(new b(this.f62845g, this.f62846h, B(B10, c.f62726c.modPow(this.f62845g.shiftRight(2), this.f62845g))));
            }
            BigInteger shiftRight = this.f62845g.shiftRight(1);
            BigInteger modPow2 = this.f62847i.modPow(shiftRight, this.f62845g);
            BigInteger bigInteger2 = c.f62725b;
            if (!modPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.f62847i;
            BigInteger y10 = y(y(bigInteger3));
            BigInteger add2 = shiftRight.add(bigInteger2);
            BigInteger subtract = this.f62845g.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.f62845g.bitLength(), random);
                if (bigInteger4.compareTo(this.f62845g) < 0 && C(bigInteger4.multiply(bigInteger4).subtract(y10)).modPow(shiftRight, this.f62845g).equals(subtract)) {
                    BigInteger[] w10 = w(bigInteger4, bigInteger3, add2);
                    BigInteger bigInteger5 = w10[0];
                    BigInteger bigInteger6 = w10[1];
                    if (B(bigInteger6, bigInteger6).equals(y10)) {
                        return new b(this.f62845g, this.f62846h, z(bigInteger6));
                    }
                    if (!bigInteger5.equals(c.f62725b) && !bigInteger5.equals(subtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.spongycastle.math.ec.e
        public e o() {
            BigInteger bigInteger = this.f62845g;
            BigInteger bigInteger2 = this.f62846h;
            BigInteger bigInteger3 = this.f62847i;
            return new b(bigInteger, bigInteger2, B(bigInteger3, bigInteger3));
        }

        @Override // org.spongycastle.math.ec.e
        public e p(e eVar, e eVar2) {
            BigInteger bigInteger = this.f62847i;
            BigInteger t10 = eVar.t();
            BigInteger t11 = eVar2.t();
            return new b(this.f62845g, this.f62846h, C(bigInteger.multiply(bigInteger).add(t10.multiply(t11))));
        }

        @Override // org.spongycastle.math.ec.e
        public e r(e eVar) {
            return new b(this.f62845g, this.f62846h, D(this.f62847i, eVar.t()));
        }

        @Override // org.spongycastle.math.ec.e
        public BigInteger t() {
            return this.f62847i;
        }

        public final e v(e eVar) {
            if (eVar.o().equals(this)) {
                return eVar;
            }
            return null;
        }

        public final BigInteger[] w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = c.f62725b;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = c.f62726c;
            BigInteger bigInteger8 = bigInteger6;
            for (int i10 = bitLength - 1; i10 >= lowestSetBit + 1; i10--) {
                bigInteger4 = B(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i10)) {
                    bigInteger8 = B(bigInteger4, bigInteger2);
                    bigInteger6 = B(bigInteger6, bigInteger5);
                    bigInteger7 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = C(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger C10 = C(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger C11 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = C(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = C11;
                    bigInteger6 = C10;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger B10 = B(bigInteger4, bigInteger8);
            BigInteger B11 = B(B10, bigInteger2);
            BigInteger C12 = C(bigInteger6.multiply(bigInteger7).subtract(B10));
            BigInteger C13 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(B10)));
            BigInteger B12 = B(B10, B11);
            for (int i11 = 1; i11 <= lowestSetBit; i11++) {
                C12 = B(C12, C13);
                C13 = C(C13.multiply(C13).subtract(B12.shiftLeft(1)));
                B12 = B(B12, B12);
            }
            return new BigInteger[]{C12, C13};
        }

        public BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f62845g) >= 0 ? add.subtract(this.f62845g) : add;
        }

        public BigInteger y(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f62845g) >= 0 ? shiftLeft.subtract(this.f62845g) : shiftLeft;
        }

        public BigInteger z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f62845g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f62845g = bigInteger;
            this.f62846h = bigInteger2;
            this.f62847i = bigInteger3;
        }
    }

    public abstract e a(e eVar);

    public abstract e b();

    public int c() {
        return t().bitLength();
    }

    public abstract e d(e eVar);

    public byte[] e() {
        return Aj.b.a((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract e g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract e j(e eVar);

    public e k(e eVar, e eVar2, e eVar3) {
        return j(eVar).r(eVar2.j(eVar3));
    }

    public e l(e eVar, e eVar2, e eVar3) {
        return j(eVar).a(eVar2.j(eVar3));
    }

    public abstract e m();

    public abstract e n();

    public abstract e o();

    public e p(e eVar, e eVar2) {
        return o().a(eVar.j(eVar2));
    }

    public e q(int i10) {
        e eVar = this;
        for (int i11 = 0; i11 < i10; i11++) {
            eVar = eVar.o();
        }
        return eVar;
    }

    public abstract e r(e eVar);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }

    public static class a extends e {

        /* renamed from: g, reason: collision with root package name */
        public int f62842g;

        /* renamed from: h, reason: collision with root package name */
        public int f62843h;

        /* renamed from: i, reason: collision with root package name */
        public m f62844i;
        private int[] ks;

        public a(int i10, int i11, int i12, int i13, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i12 == 0 && i13 == 0) {
                this.f62842g = 2;
                this.ks = new int[]{i11};
            } else {
                if (i12 >= i13) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i12 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f62842g = 3;
                this.ks = new int[]{i11, i12, i13};
            }
            this.f62843h = i10;
            this.f62844i = new m(bigInteger);
        }

        public static void u(e eVar, e eVar2) {
            if (!(eVar instanceof a) || !(eVar2 instanceof a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            a aVar = (a) eVar;
            a aVar2 = (a) eVar2;
            if (aVar.f62842g != aVar2.f62842g) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (aVar.f62843h != aVar2.f62843h || !Aj.a.c(aVar.ks, aVar2.ks)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // org.spongycastle.math.ec.e
        public e a(e eVar) {
            m mVar = (m) this.f62844i.clone();
            mVar.f(((a) eVar).f62844i, 0);
            return new a(this.f62843h, this.ks, mVar);
        }

        @Override // org.spongycastle.math.ec.e
        public e b() {
            return new a(this.f62843h, this.ks, this.f62844i.d());
        }

        @Override // org.spongycastle.math.ec.e
        public int c() {
            return this.f62844i.j();
        }

        @Override // org.spongycastle.math.ec.e
        public e d(e eVar) {
            return j(eVar.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f62843h == aVar.f62843h && this.f62842g == aVar.f62842g && Aj.a.c(this.ks, aVar.ks) && this.f62844i.equals(aVar.f62844i);
        }

        @Override // org.spongycastle.math.ec.e
        public int f() {
            return this.f62843h;
        }

        @Override // org.spongycastle.math.ec.e
        public e g() {
            int i10 = this.f62843h;
            int[] iArr = this.ks;
            return new a(i10, iArr, this.f62844i.t(i10, iArr));
        }

        @Override // org.spongycastle.math.ec.e
        public boolean h() {
            return this.f62844i.r();
        }

        public int hashCode() {
            return (this.f62844i.hashCode() ^ this.f62843h) ^ Aj.a.s(this.ks);
        }

        @Override // org.spongycastle.math.ec.e
        public boolean i() {
            return this.f62844i.s();
        }

        @Override // org.spongycastle.math.ec.e
        public e j(e eVar) {
            int i10 = this.f62843h;
            int[] iArr = this.ks;
            return new a(i10, iArr, this.f62844i.u(((a) eVar).f62844i, i10, iArr));
        }

        @Override // org.spongycastle.math.ec.e
        public e k(e eVar, e eVar2, e eVar3) {
            return l(eVar, eVar2, eVar3);
        }

        @Override // org.spongycastle.math.ec.e
        public e l(e eVar, e eVar2, e eVar3) {
            m mVar = this.f62844i;
            m mVar2 = ((a) eVar).f62844i;
            m mVar3 = ((a) eVar2).f62844i;
            m mVar4 = ((a) eVar3).f62844i;
            m x10 = mVar.x(mVar2, this.f62843h, this.ks);
            m x11 = mVar3.x(mVar4, this.f62843h, this.ks);
            if (x10 == mVar || x10 == mVar2) {
                x10 = (m) x10.clone();
            }
            x10.f(x11, 0);
            x10.z(this.f62843h, this.ks);
            return new a(this.f62843h, this.ks, x10);
        }

        @Override // org.spongycastle.math.ec.e
        public e m() {
            return this;
        }

        @Override // org.spongycastle.math.ec.e
        public e n() {
            return (this.f62844i.s() || this.f62844i.r()) ? this : q(this.f62843h - 1);
        }

        @Override // org.spongycastle.math.ec.e
        public e o() {
            int i10 = this.f62843h;
            int[] iArr = this.ks;
            return new a(i10, iArr, this.f62844i.v(i10, iArr));
        }

        @Override // org.spongycastle.math.ec.e
        public e p(e eVar, e eVar2) {
            m mVar = this.f62844i;
            m mVar2 = ((a) eVar).f62844i;
            m mVar3 = ((a) eVar2).f62844i;
            m J10 = mVar.J(this.f62843h, this.ks);
            m x10 = mVar2.x(mVar3, this.f62843h, this.ks);
            if (J10 == mVar) {
                J10 = (m) J10.clone();
            }
            J10.f(x10, 0);
            J10.z(this.f62843h, this.ks);
            return new a(this.f62843h, this.ks, J10);
        }

        @Override // org.spongycastle.math.ec.e
        public e q(int i10) {
            if (i10 < 1) {
                return this;
            }
            int i11 = this.f62843h;
            int[] iArr = this.ks;
            return new a(i11, iArr, this.f62844i.w(i10, i11, iArr));
        }

        @Override // org.spongycastle.math.ec.e
        public e r(e eVar) {
            return a(eVar);
        }

        @Override // org.spongycastle.math.ec.e
        public boolean s() {
            return this.f62844i.M();
        }

        @Override // org.spongycastle.math.ec.e
        public BigInteger t() {
            return this.f62844i.N();
        }

        public a(int i10, int[] iArr, m mVar) {
            this.f62843h = i10;
            this.f62842g = iArr.length == 1 ? 2 : 3;
            this.ks = iArr;
            this.f62844i = mVar;
        }
    }
}
