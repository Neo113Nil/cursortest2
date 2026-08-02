package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3477i {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f37300f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f37301a;

    /* renamed from: b, reason: collision with root package name */
    public int f37302b;

    /* renamed from: c, reason: collision with root package name */
    public int f37303c;

    /* renamed from: d, reason: collision with root package name */
    public C3478j f37304d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37305e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    public static final class b extends AbstractC3477i {
        private final byte[] buffer;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f37306g;

        /* renamed from: h, reason: collision with root package name */
        public int f37307h;

        /* renamed from: i, reason: collision with root package name */
        public int f37308i;

        /* renamed from: j, reason: collision with root package name */
        public int f37309j;

        /* renamed from: k, reason: collision with root package name */
        public int f37310k;

        /* renamed from: l, reason: collision with root package name */
        public int f37311l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f37312m;

        /* renamed from: n, reason: collision with root package name */
        public int f37313n;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public String A() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f37307h;
                int i11 = this.f37309j;
                if (J10 <= i10 - i11) {
                    String e10 = p0.e(this.buffer, i11, J10);
                    this.f37309j += J10;
                    return e10;
                }
            }
            if (J10 == 0) {
                return "";
            }
            if (J10 <= 0) {
                throw A.g();
            }
            throw A.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int B() {
            if (e()) {
                this.f37311l = 0;
                return 0;
            }
            int J10 = J();
            this.f37311l = J10;
            if (q0.a(J10) != 0) {
                return this.f37311l;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public boolean E(int i10) {
            int b10 = q0.b(i10);
            if (b10 == 0) {
                P();
                return true;
            }
            if (b10 == 1) {
                O(8);
                return true;
            }
            if (b10 == 2) {
                O(J());
                return true;
            }
            if (b10 == 3) {
                N();
                a(q0.c(q0.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw A.e();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i10 = this.f37309j;
            if (i10 == this.f37307h) {
                throw A.m();
            }
            byte[] bArr = this.buffer;
            this.f37309j = i10 + 1;
            return bArr[i10];
        }

        public byte[] G(int i10) {
            if (i10 > 0) {
                int i11 = this.f37307h;
                int i12 = this.f37309j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f37309j = i13;
                    return Arrays.copyOfRange(this.buffer, i12, i13);
                }
            }
            if (i10 > 0) {
                throw A.m();
            }
            if (i10 == 0) {
                return AbstractC3493z.EMPTY_BYTE_ARRAY;
            }
            throw A.g();
        }

        public int H() {
            int i10 = this.f37309j;
            if (this.f37307h - i10 < 4) {
                throw A.m();
            }
            byte[] bArr = this.buffer;
            this.f37309j = i10 + 4;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }

        public long I() {
            int i10 = this.f37309j;
            if (this.f37307h - i10 < 8) {
                throw A.m();
            }
            byte[] bArr = this.buffer;
            this.f37309j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int J() {
            int i10;
            int i11 = this.f37309j;
            int i12 = this.f37307h;
            if (i12 != i11) {
                byte[] bArr = this.buffer;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f37309j = i13;
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
                    this.f37309j = i14;
                    return i10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f37309j;
            int i11 = this.f37307h;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f37309j = i12;
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
                    this.f37309j = i13;
                    return j10;
                }
            }
            return L();
        }

        public long L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
                if ((F() & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            }
            throw A.f();
        }

        public final void M() {
            int i10 = this.f37307h + this.f37308i;
            this.f37307h = i10;
            int i11 = i10 - this.f37310k;
            int i12 = this.f37313n;
            if (i11 <= i12) {
                this.f37308i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f37308i = i13;
            this.f37307h = i10 - i13;
        }

        public void N() {
            int B10;
            do {
                B10 = B();
                if (B10 == 0) {
                    return;
                }
            } while (E(B10));
        }

        public void O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f37307h;
                int i12 = this.f37309j;
                if (i10 <= i11 - i12) {
                    this.f37309j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw A.m();
            }
            throw A.g();
        }

        public final void P() {
            if (this.f37307h - this.f37309j >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.buffer;
                int i11 = this.f37309j;
                this.f37309j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        public final void R() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public void a(int i10) {
            if (this.f37311l != i10) {
                throw A.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int d() {
            return this.f37309j - this.f37310k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public boolean e() {
            return this.f37309j == this.f37307h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public void k(int i10) {
            this.f37313n = i10;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int l(int i10) {
            if (i10 < 0) {
                throw A.g();
            }
            int d10 = i10 + d();
            if (d10 < 0) {
                throw A.h();
            }
            int i11 = this.f37313n;
            if (d10 > i11) {
                throw A.m();
            }
            this.f37313n = d10;
            M();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public AbstractC3476h n() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f37307h;
                int i11 = this.f37309j;
                if (J10 <= i10 - i11) {
                    AbstractC3476h y10 = (this.f37306g && this.f37312m) ? AbstractC3476h.y(this.buffer, i11, J10) : AbstractC3476h.g(this.buffer, i11, J10);
                    this.f37309j += J10;
                    return y10;
                }
            }
            return J10 == 0 ? AbstractC3476h.f37290b : AbstractC3476h.x(G(J10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int x() {
            return AbstractC3477i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long y() {
            return AbstractC3477i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public String z() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f37307h;
                int i11 = this.f37309j;
                if (J10 <= i10 - i11) {
                    String str = new String(this.buffer, i11, J10, AbstractC3493z.f37488b);
                    this.f37309j += J10;
                    return str;
                }
            }
            if (J10 == 0) {
                return "";
            }
            if (J10 < 0) {
                throw A.g();
            }
            throw A.m();
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f37313n = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.f37307h = i11 + i10;
            this.f37309j = i10;
            this.f37310k = i10;
            this.f37306g = z10;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    public static final class c extends AbstractC3477i {
        private final byte[] buffer;

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f37314g;

        /* renamed from: h, reason: collision with root package name */
        public int f37315h;

        /* renamed from: i, reason: collision with root package name */
        public int f37316i;

        /* renamed from: j, reason: collision with root package name */
        public int f37317j;

        /* renamed from: k, reason: collision with root package name */
        public int f37318k;

        /* renamed from: l, reason: collision with root package name */
        public int f37319l;

        /* renamed from: m, reason: collision with root package name */
        public int f37320m;

        public static int F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        public static int G(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        private void R() {
            int i10 = this.f37315h + this.f37316i;
            this.f37315h = i10;
            int i11 = this.f37319l + i10;
            int i12 = this.f37320m;
            if (i11 <= i12) {
                this.f37316i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f37316i = i13;
            this.f37315h = i10 - i13;
        }

        public static long T(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        private void X() {
            if (this.f37315h - this.f37317j >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.buffer;
                int i11 = this.f37317j;
                this.f37317j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        private void Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public String A() {
            byte[] J10;
            int O10 = O();
            int i10 = this.f37317j;
            int i11 = this.f37315h;
            if (O10 <= i11 - i10 && O10 > 0) {
                J10 = this.buffer;
                this.f37317j = i10 + O10;
            } else {
                if (O10 == 0) {
                    return "";
                }
                i10 = 0;
                if (O10 <= i11) {
                    S(O10);
                    J10 = this.buffer;
                    this.f37317j = O10;
                } else {
                    J10 = J(O10, false);
                }
            }
            return p0.e(J10, i10, O10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int B() {
            if (e()) {
                this.f37318k = 0;
                return 0;
            }
            int O10 = O();
            this.f37318k = O10;
            if (q0.a(O10) != 0) {
                return this.f37318k;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public boolean E(int i10) {
            int b10 = q0.b(i10);
            if (b10 == 0) {
                X();
                return true;
            }
            if (b10 == 1) {
                V(8);
                return true;
            }
            if (b10 == 2) {
                V(O());
                return true;
            }
            if (b10 == 3) {
                U();
                a(q0.c(q0.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw A.e();
            }
            V(4);
            return true;
        }

        public final AbstractC3476h H(int i10) {
            byte[] K10 = K(i10);
            if (K10 != null) {
                return AbstractC3476h.f(K10);
            }
            int i11 = this.f37317j;
            int i12 = this.f37315h;
            int i13 = i12 - i11;
            this.f37319l += i12;
            this.f37317j = 0;
            this.f37315h = 0;
            List<byte[]> L10 = L(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, i11, bArr, 0, i13);
            for (byte[] bArr2 : L10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC3476h.x(bArr);
        }

        public byte I() {
            if (this.f37317j == this.f37315h) {
                S(1);
            }
            byte[] bArr = this.buffer;
            int i10 = this.f37317j;
            this.f37317j = i10 + 1;
            return bArr[i10];
        }

        public final byte[] J(int i10, boolean z10) {
            byte[] K10 = K(i10);
            if (K10 != null) {
                return z10 ? (byte[]) K10.clone() : K10;
            }
            int i11 = this.f37317j;
            int i12 = this.f37315h;
            int i13 = i12 - i11;
            this.f37319l += i12;
            this.f37317j = 0;
            this.f37315h = 0;
            List<byte[]> L10 = L(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, i11, bArr, 0, i13);
            for (byte[] bArr2 : L10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] K(int i10) {
            if (i10 == 0) {
                return AbstractC3493z.EMPTY_BYTE_ARRAY;
            }
            if (i10 < 0) {
                throw A.g();
            }
            int i11 = this.f37319l;
            int i12 = this.f37317j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f37303c > 0) {
                throw A.l();
            }
            int i14 = this.f37320m;
            if (i13 > i14) {
                V((i14 - i11) - i12);
                throw A.m();
            }
            int i15 = this.f37315h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > F(this.f37314g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, this.f37317j, bArr, 0, i15);
            this.f37319l += this.f37315h;
            this.f37317j = 0;
            this.f37315h = 0;
            while (i15 < i10) {
                int G10 = G(this.f37314g, bArr, i15, i10 - i15);
                if (G10 == -1) {
                    throw A.m();
                }
                this.f37319l += G10;
                i15 += G10;
            }
            return bArr;
        }

        public final List L(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f37314g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw A.m();
                    }
                    this.f37319l += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int M() {
            int i10 = this.f37317j;
            if (this.f37315h - i10 < 4) {
                S(4);
                i10 = this.f37317j;
            }
            byte[] bArr = this.buffer;
            this.f37317j = i10 + 4;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }

        public long N() {
            int i10 = this.f37317j;
            if (this.f37315h - i10 < 8) {
                S(8);
                i10 = this.f37317j;
            }
            byte[] bArr = this.buffer;
            this.f37317j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int O() {
            int i10;
            int i11 = this.f37317j;
            int i12 = this.f37315h;
            if (i12 != i11) {
                byte[] bArr = this.buffer;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f37317j = i13;
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
                    this.f37317j = i14;
                    return i10;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f37317j;
            int i11 = this.f37315h;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f37317j = i12;
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
                    this.f37317j = i13;
                    return j10;
                }
            }
            return Q();
        }

        public long Q() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
                if ((I() & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            }
            throw A.f();
        }

        public final void S(int i10) {
            if (a0(i10)) {
                return;
            }
            if (i10 <= (this.f37303c - this.f37319l) - this.f37317j) {
                throw A.m();
            }
            throw A.l();
        }

        public void U() {
            int B10;
            do {
                B10 = B();
                if (B10 == 0) {
                    return;
                }
            } while (E(B10));
        }

        public void V(int i10) {
            int i11 = this.f37315h;
            int i12 = this.f37317j;
            if (i10 > i11 - i12 || i10 < 0) {
                W(i10);
            } else {
                this.f37317j = i12 + i10;
            }
        }

        public final void W(int i10) {
            if (i10 < 0) {
                throw A.g();
            }
            int i11 = this.f37319l;
            int i12 = this.f37317j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f37320m;
            if (i13 > i14) {
                V((i14 - i11) - i12);
                throw A.m();
            }
            this.f37319l = i11 + i12;
            int i15 = this.f37315h - i12;
            this.f37315h = 0;
            this.f37317j = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long T10 = T(this.f37314g, j10);
                    if (T10 < 0 || T10 > j10) {
                        throw new IllegalStateException(this.f37314g.getClass() + "#skip returned invalid result: " + T10 + "\nThe InputStream implementation is buggy.");
                    }
                    if (T10 == 0) {
                        break;
                    } else {
                        i15 += (int) T10;
                    }
                } finally {
                    this.f37319l += i15;
                    R();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f37315h;
            int i17 = i16 - this.f37317j;
            this.f37317j = i16;
            S(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f37315h;
                if (i18 <= i19) {
                    this.f37317j = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f37317j = i19;
                    S(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public void a(int i10) {
            if (this.f37318k != i10) {
                throw A.b();
            }
        }

        public final boolean a0(int i10) {
            int i11 = this.f37317j;
            int i12 = i11 + i10;
            int i13 = this.f37315h;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f37303c;
            int i15 = this.f37319l;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f37320m) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f37319l += i11;
                this.f37315h -= i11;
                this.f37317j = 0;
            }
            InputStream inputStream = this.f37314g;
            byte[] bArr2 = this.buffer;
            int i16 = this.f37315h;
            int G10 = G(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f37303c - this.f37319l) - i16));
            if (G10 == 0 || G10 < -1 || G10 > this.buffer.length) {
                throw new IllegalStateException(this.f37314g.getClass() + "#read(byte[]) returned invalid result: " + G10 + "\nThe InputStream implementation is buggy.");
            }
            if (G10 <= 0) {
                return false;
            }
            this.f37315h += G10;
            R();
            if (this.f37315h >= i10) {
                return true;
            }
            return a0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int d() {
            return this.f37319l + this.f37317j;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public boolean e() {
            return this.f37317j == this.f37315h && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public void k(int i10) {
            this.f37320m = i10;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int l(int i10) {
            if (i10 < 0) {
                throw A.g();
            }
            int i11 = i10 + this.f37319l + this.f37317j;
            int i12 = this.f37320m;
            if (i11 > i12) {
                throw A.m();
            }
            this.f37320m = i11;
            R();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public AbstractC3476h n() {
            int O10 = O();
            int i10 = this.f37315h;
            int i11 = this.f37317j;
            if (O10 > i10 - i11 || O10 <= 0) {
                return O10 == 0 ? AbstractC3476h.f37290b : H(O10);
            }
            AbstractC3476h g10 = AbstractC3476h.g(this.buffer, i11, O10);
            this.f37317j += O10;
            return g10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public int x() {
            return AbstractC3477i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public long y() {
            return AbstractC3477i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3477i
        public String z() {
            int O10 = O();
            if (O10 > 0) {
                int i10 = this.f37315h;
                int i11 = this.f37317j;
                if (O10 <= i10 - i11) {
                    String str = new String(this.buffer, i11, O10, AbstractC3493z.f37488b);
                    this.f37317j += O10;
                    return str;
                }
            }
            if (O10 == 0) {
                return "";
            }
            if (O10 > this.f37315h) {
                return new String(J(O10, false), AbstractC3493z.f37488b);
            }
            S(O10);
            String str2 = new String(this.buffer, this.f37317j, O10, AbstractC3493z.f37488b);
            this.f37317j += O10;
            return str2;
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f37320m = Integer.MAX_VALUE;
            AbstractC3493z.b(inputStream, "input");
            this.f37314g = inputStream;
            this.buffer = new byte[i10];
            this.f37315h = 0;
            this.f37317j = 0;
            this.f37319l = 0;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC3477i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC3477i g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(AbstractC3493z.EMPTY_BYTE_ARRAY) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC3477i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC3477i i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    public static AbstractC3477i j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (A e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract AbstractC3476h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public AbstractC3477i() {
        this.f37302b = f37300f;
        this.f37303c = Integer.MAX_VALUE;
        this.f37305e = false;
    }
}
