package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2133h {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f19483f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f19484a;

    /* renamed from: b, reason: collision with root package name */
    public int f19485b;

    /* renamed from: c, reason: collision with root package name */
    public int f19486c;

    /* renamed from: d, reason: collision with root package name */
    public C2134i f19487d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19488e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends AbstractC2133h {
        private final byte[] buffer;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f19489g;

        /* renamed from: h, reason: collision with root package name */
        public int f19490h;

        /* renamed from: i, reason: collision with root package name */
        public int f19491i;

        /* renamed from: j, reason: collision with root package name */
        public int f19492j;

        /* renamed from: k, reason: collision with root package name */
        public int f19493k;

        /* renamed from: l, reason: collision with root package name */
        public int f19494l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f19495m;

        /* renamed from: n, reason: collision with root package name */
        public int f19496n;

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public String A() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f19490h;
                int i11 = this.f19492j;
                if (L10 <= i10 - i11) {
                    String str = new String(this.buffer, i11, L10, AbstractC2149y.f19691b);
                    this.f19492j += L10;
                    return str;
                }
            }
            if (L10 == 0) {
                return "";
            }
            if (L10 < 0) {
                throw C2150z.g();
            }
            throw C2150z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public String B() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f19490h;
                int i11 = this.f19492j;
                if (L10 <= i10 - i11) {
                    String a10 = q0.a(this.buffer, i11, L10);
                    this.f19492j += L10;
                    return a10;
                }
            }
            if (L10 == 0) {
                return "";
            }
            if (L10 <= 0) {
                throw C2150z.g();
            }
            throw C2150z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int C() {
            if (f()) {
                this.f19494l = 0;
                return 0;
            }
            int L10 = L();
            this.f19494l = L10;
            if (r0.a(L10) != 0) {
                return this.f19494l;
            }
            throw C2150z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public boolean F(int i10) {
            int b10 = r0.b(i10);
            if (b10 == 0) {
                Q();
                return true;
            }
            if (b10 == 1) {
                P(8);
                return true;
            }
            if (b10 == 2) {
                P(L());
                return true;
            }
            if (b10 == 3) {
                G();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw C2150z.e();
            }
            P(4);
            return true;
        }

        public byte H() {
            int i10 = this.f19492j;
            if (i10 == this.f19490h) {
                throw C2150z.m();
            }
            byte[] bArr = this.buffer;
            this.f19492j = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) {
            if (i10 > 0) {
                int i11 = this.f19490h;
                int i12 = this.f19492j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f19492j = i13;
                    return Arrays.copyOfRange(this.buffer, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C2150z.m();
            }
            if (i10 == 0) {
                return AbstractC2149y.EMPTY_BYTE_ARRAY;
            }
            throw C2150z.g();
        }

        public int J() {
            int i10 = this.f19492j;
            if (this.f19490h - i10 < 4) {
                throw C2150z.m();
            }
            byte[] bArr = this.buffer;
            this.f19492j = i10 + 4;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }

        public long K() {
            int i10 = this.f19492j;
            if (this.f19490h - i10 < 8) {
                throw C2150z.m();
            }
            byte[] bArr = this.buffer;
            this.f19492j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f19492j;
            int i12 = this.f19490h;
            if (i12 != i11) {
                byte[] bArr = this.buffer;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f19492j = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f19492j = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f19492j;
            int i11 = this.f19490h;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f19492j = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f19492j = i13;
                    return j10;
                }
            }
            return N();
        }

        public long N() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
                if ((H() & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            }
            throw C2150z.f();
        }

        public final void O() {
            int i10 = this.f19490h + this.f19491i;
            this.f19490h = i10;
            int i11 = i10 - this.f19493k;
            int i12 = this.f19496n;
            if (i11 <= i12) {
                this.f19491i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f19491i = i13;
            this.f19490h = i10 - i13;
        }

        public void P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f19490h;
                int i12 = this.f19492j;
                if (i10 <= i11 - i12) {
                    this.f19492j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C2150z.m();
            }
            throw C2150z.g();
        }

        public final void Q() {
            if (this.f19490h - this.f19492j >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.buffer;
                int i11 = this.f19492j;
                this.f19492j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2150z.f();
        }

        public final void S() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C2150z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public void a(int i10) {
            if (this.f19494l != i10) {
                throw C2150z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int e() {
            return this.f19492j - this.f19493k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public boolean f() {
            return this.f19492j == this.f19490h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public void l(int i10) {
            this.f19496n = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int m(int i10) {
            if (i10 < 0) {
                throw C2150z.g();
            }
            int e10 = i10 + e();
            if (e10 < 0) {
                throw C2150z.h();
            }
            int i11 = this.f19496n;
            if (e10 > i11) {
                throw C2150z.m();
            }
            this.f19496n = e10;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public AbstractC2132g o() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f19490h;
                int i11 = this.f19492j;
                if (L10 <= i10 - i11) {
                    AbstractC2132g s10 = (this.f19489g && this.f19495m) ? AbstractC2132g.s(this.buffer, i11, L10) : AbstractC2132g.g(this.buffer, i11, L10);
                    this.f19492j += L10;
                    return s10;
                }
            }
            return L10 == 0 ? AbstractC2132g.f19474b : AbstractC2132g.r(I(L10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int y() {
            return AbstractC2133h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long z() {
            return AbstractC2133h.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f19496n = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.f19490h = i11 + i10;
            this.f19492j = i10;
            this.f19493k = i10;
            this.f19489g = z10;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    public static final class c extends AbstractC2133h {
        private final byte[] buffer;

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f19497g;

        /* renamed from: h, reason: collision with root package name */
        public int f19498h;

        /* renamed from: i, reason: collision with root package name */
        public int f19499i;

        /* renamed from: j, reason: collision with root package name */
        public int f19500j;

        /* renamed from: k, reason: collision with root package name */
        public int f19501k;

        /* renamed from: l, reason: collision with root package name */
        public int f19502l;

        /* renamed from: m, reason: collision with root package name */
        public int f19503m;

        public static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C2150z e10) {
                e10.j();
                throw e10;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C2150z e10) {
                e10.j();
                throw e10;
            }
        }

        private void T() {
            int i10 = this.f19498h + this.f19499i;
            this.f19498h = i10;
            int i11 = this.f19502l + i10;
            int i12 = this.f19503m;
            if (i11 <= i12) {
                this.f19499i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f19499i = i13;
            this.f19498h = i10 - i13;
        }

        public static long V(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (C2150z e10) {
                e10.j();
                throw e10;
            }
        }

        private void Y() {
            if (this.f19498h - this.f19500j >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.buffer;
                int i11 = this.f19500j;
                this.f19500j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2150z.f();
        }

        private void a0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C2150z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public String A() {
            int Q10 = Q();
            if (Q10 > 0) {
                int i10 = this.f19498h;
                int i11 = this.f19500j;
                if (Q10 <= i10 - i11) {
                    String str = new String(this.buffer, i11, Q10, AbstractC2149y.f19691b);
                    this.f19500j += Q10;
                    return str;
                }
            }
            if (Q10 == 0) {
                return "";
            }
            if (Q10 < 0) {
                throw C2150z.g();
            }
            if (Q10 > this.f19498h) {
                return new String(L(Q10, false), AbstractC2149y.f19691b);
            }
            U(Q10);
            String str2 = new String(this.buffer, this.f19500j, Q10, AbstractC2149y.f19691b);
            this.f19500j += Q10;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public String B() {
            byte[] L10;
            int Q10 = Q();
            int i10 = this.f19500j;
            int i11 = this.f19498h;
            if (Q10 <= i11 - i10 && Q10 > 0) {
                L10 = this.buffer;
                this.f19500j = i10 + Q10;
            } else {
                if (Q10 == 0) {
                    return "";
                }
                if (Q10 < 0) {
                    throw C2150z.g();
                }
                i10 = 0;
                if (Q10 <= i11) {
                    U(Q10);
                    L10 = this.buffer;
                    this.f19500j = Q10;
                } else {
                    L10 = L(Q10, false);
                }
            }
            return q0.a(L10, i10, Q10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int C() {
            if (f()) {
                this.f19501k = 0;
                return 0;
            }
            int Q10 = Q();
            this.f19501k = Q10;
            if (r0.a(Q10) != 0) {
                return this.f19501k;
            }
            throw C2150z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public boolean F(int i10) {
            int b10 = r0.b(i10);
            if (b10 == 0) {
                Y();
                return true;
            }
            if (b10 == 1) {
                W(8);
                return true;
            }
            if (b10 == 2) {
                W(Q());
                return true;
            }
            if (b10 == 3) {
                G();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw C2150z.e();
            }
            W(4);
            return true;
        }

        public final AbstractC2132g J(int i10) {
            byte[] M10 = M(i10);
            if (M10 != null) {
                return AbstractC2132g.f(M10);
            }
            int i11 = this.f19500j;
            int i12 = this.f19498h;
            int i13 = i12 - i11;
            this.f19502l += i12;
            this.f19500j = 0;
            this.f19498h = 0;
            List<byte[]> N10 = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, i11, bArr, 0, i13);
            for (byte[] bArr2 : N10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC2132g.r(bArr);
        }

        public byte K() {
            if (this.f19500j == this.f19498h) {
                U(1);
            }
            byte[] bArr = this.buffer;
            int i10 = this.f19500j;
            this.f19500j = i10 + 1;
            return bArr[i10];
        }

        public final byte[] L(int i10, boolean z10) {
            byte[] M10 = M(i10);
            if (M10 != null) {
                return z10 ? (byte[]) M10.clone() : M10;
            }
            int i11 = this.f19500j;
            int i12 = this.f19498h;
            int i13 = i12 - i11;
            this.f19502l += i12;
            this.f19500j = 0;
            this.f19498h = 0;
            List<byte[]> N10 = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, i11, bArr, 0, i13);
            for (byte[] bArr2 : N10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i10) {
            if (i10 == 0) {
                return AbstractC2149y.EMPTY_BYTE_ARRAY;
            }
            if (i10 < 0) {
                throw C2150z.g();
            }
            int i11 = this.f19502l;
            int i12 = this.f19500j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f19486c > 0) {
                throw C2150z.l();
            }
            int i14 = this.f19503m;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C2150z.m();
            }
            int i15 = this.f19498h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f19497g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, this.f19500j, bArr, 0, i15);
            this.f19502l += this.f19498h;
            this.f19500j = 0;
            this.f19498h = 0;
            while (i15 < i10) {
                int I10 = I(this.f19497g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw C2150z.m();
                }
                this.f19502l += I10;
                i15 += I10;
            }
            return bArr;
        }

        public final List N(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f19497g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw C2150z.m();
                    }
                    this.f19502l += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() {
            int i10 = this.f19500j;
            if (this.f19498h - i10 < 4) {
                U(4);
                i10 = this.f19500j;
            }
            byte[] bArr = this.buffer;
            this.f19500j = i10 + 4;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }

        public long P() {
            int i10 = this.f19500j;
            if (this.f19498h - i10 < 8) {
                U(8);
                i10 = this.f19500j;
            }
            byte[] bArr = this.buffer;
            this.f19500j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f19500j;
            int i12 = this.f19498h;
            if (i12 != i11) {
                byte[] bArr = this.buffer;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f19500j = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f19500j = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f19500j;
            int i11 = this.f19498h;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f19500j = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f19500j = i13;
                    return j10;
                }
            }
            return S();
        }

        public long S() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
                if ((K() & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            }
            throw C2150z.f();
        }

        public final void U(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f19486c - this.f19502l) - this.f19500j) {
                throw C2150z.m();
            }
            throw C2150z.l();
        }

        public void W(int i10) {
            int i11 = this.f19498h;
            int i12 = this.f19500j;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f19500j = i12 + i10;
            }
        }

        public final void X(int i10) {
            if (i10 < 0) {
                throw C2150z.g();
            }
            int i11 = this.f19502l;
            int i12 = this.f19500j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f19503m;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C2150z.m();
            }
            this.f19502l = i11 + i12;
            int i15 = this.f19498h - i12;
            this.f19498h = 0;
            this.f19500j = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long V10 = V(this.f19497g, j10);
                    if (V10 < 0 || V10 > j10) {
                        throw new IllegalStateException(this.f19497g.getClass() + "#skip returned invalid result: " + V10 + "\nThe InputStream implementation is buggy.");
                    }
                    if (V10 == 0) {
                        break;
                    } else {
                        i15 += (int) V10;
                    }
                } finally {
                    this.f19502l += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f19498h;
            int i17 = i16 - this.f19500j;
            this.f19500j = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f19498h;
                if (i18 <= i19) {
                    this.f19500j = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f19500j = i19;
                    U(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public void a(int i10) {
            if (this.f19501k != i10) {
                throw C2150z.b();
            }
        }

        public final boolean b0(int i10) {
            int i11 = this.f19500j;
            int i12 = i11 + i10;
            int i13 = this.f19498h;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f19486c;
            int i15 = this.f19502l;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f19503m) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f19502l += i11;
                this.f19498h -= i11;
                this.f19500j = 0;
            }
            InputStream inputStream = this.f19497g;
            byte[] bArr2 = this.buffer;
            int i16 = this.f19498h;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f19486c - this.f19502l) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.buffer.length) {
                throw new IllegalStateException(this.f19497g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f19498h += I10;
            T();
            if (this.f19498h >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int e() {
            return this.f19502l + this.f19500j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public boolean f() {
            return this.f19500j == this.f19498h && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public void l(int i10) {
            this.f19503m = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int m(int i10) {
            if (i10 < 0) {
                throw C2150z.g();
            }
            int i11 = i10 + this.f19502l + this.f19500j;
            if (i11 < 0) {
                throw C2150z.h();
            }
            int i12 = this.f19503m;
            if (i11 > i12) {
                throw C2150z.m();
            }
            this.f19503m = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public AbstractC2132g o() {
            int Q10 = Q();
            int i10 = this.f19498h;
            int i11 = this.f19500j;
            if (Q10 <= i10 - i11 && Q10 > 0) {
                AbstractC2132g g10 = AbstractC2132g.g(this.buffer, i11, Q10);
                this.f19500j += Q10;
                return g10;
            }
            if (Q10 == 0) {
                return AbstractC2132g.f19474b;
            }
            if (Q10 >= 0) {
                return J(Q10);
            }
            throw C2150z.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public int y() {
            return AbstractC2133h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2133h
        public long z() {
            return AbstractC2133h.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f19503m = Integer.MAX_VALUE;
            AbstractC2149y.b(inputStream, "input");
            this.f19497g = inputStream;
            this.buffer = new byte[i10];
            this.f19498h = 0;
            this.f19500j = 0;
            this.f19502l = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2133h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC2133h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC2149y.EMPTY_BYTE_ARRAY) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2133h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC2133h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public static AbstractC2133h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (C2150z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() {
        int C10;
        do {
            C10 = C();
            if (C10 == 0) {
                return;
            }
            b();
            this.f19484a++;
            this.f19484a--;
        } while (F(C10));
    }

    public abstract void a(int i10);

    public void b() {
        if (this.f19484a >= this.f19485b) {
            throw C2150z.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC2132g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public AbstractC2133h() {
        this.f19485b = f19483f;
        this.f19486c = Integer.MAX_VALUE;
        this.f19488e = false;
    }
}
