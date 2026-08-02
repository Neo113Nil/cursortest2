package s9;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f23328d;

    /* renamed from: e, reason: collision with root package name */
    public int f23329e;

    /* renamed from: f, reason: collision with root package name */
    public int f23330f;

    /* renamed from: g, reason: collision with root package name */
    public int f23331g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23332h;

    /* renamed from: i, reason: collision with root package name */
    public int f23333i;
    public int j = Integer.MAX_VALUE;

    public i(byte[] bArr, int i5, int i10, boolean z5) {
        this.f23328d = bArr;
        this.f23329e = i10 + i5;
        this.f23331g = i5;
        this.f23332h = i5;
    }

    public final long A() {
        int i5 = this.f23331g;
        if (this.f23329e - i5 < 8) {
            throw v.e();
        }
        this.f23331g = i5 + 8;
        byte[] bArr = this.f23328d;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public final int B() {
        int i5;
        int i10 = this.f23331g;
        int i11 = this.f23329e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f23328d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f23331g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i5 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i5 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i5 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i5 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i19;
                            }
                            i5 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f23331g = i13;
                return i5;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j;
        long j6;
        long j10;
        long j11;
        int i5 = this.f23331g;
        int i10 = this.f23329e;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f23328d;
            byte b10 = bArr[i5];
            if (b10 >= 0) {
                this.f23331g = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i5 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i5 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j11 = (-2080896) ^ i17;
                        } else {
                            long j12 = i17;
                            i12 = i5 + 5;
                            long j13 = j12 ^ (bArr[i16] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i16 = i5 + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i12 = i5 + 7;
                                    j13 = j14 ^ (bArr[i16] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i5 + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i12 = i5 + 9;
                                            long j15 = (j14 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i5 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j6 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i12 = i16;
                        j = j11;
                    }
                }
                this.f23331g = i12;
                return j;
            }
        }
        return D();
    }

    public final long D() {
        long j = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int i10 = this.f23331g;
            if (i10 == this.f23329e) {
                throw v.e();
            }
            this.f23331g = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i5;
            if ((this.f23328d[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw v.c();
    }

    public final void E() {
        int i5 = this.f23329e + this.f23330f;
        this.f23329e = i5;
        int i10 = i5 - this.f23332h;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f23330f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f23330f = i12;
        this.f23329e = i5 - i12;
    }

    public final void F(int i5) {
        if (i5 >= 0) {
            int i10 = this.f23329e;
            int i11 = this.f23331g;
            if (i5 <= i10 - i11) {
                this.f23331g = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw v.e();
        }
        throw v.d();
    }

    @Override // s9.k
    public final void a(int i5) {
        if (this.f23333i != i5) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // s9.k
    public final int b() {
        return this.f23331g - this.f23332h;
    }

    @Override // s9.k
    public final boolean c() {
        return this.f23331g == this.f23329e;
    }

    @Override // s9.k
    public final void d(int i5) {
        this.j = i5;
        E();
    }

    @Override // s9.k
    public final int e(int i5) {
        if (i5 < 0) {
            throw v.d();
        }
        int b10 = b() + i5;
        if (b10 < 0) {
            throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i10 = this.j;
        if (b10 > i10) {
            throw v.e();
        }
        this.j = b10;
        E();
        return i10;
    }

    @Override // s9.k
    public final boolean f() {
        return C() != 0;
    }

    @Override // s9.k
    public final g g() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.f23328d;
        if (B > 0) {
            int i5 = this.f23329e;
            int i10 = this.f23331g;
            if (B <= i5 - i10) {
                g c2 = h.c(bArr2, i10, B);
                this.f23331g += B;
                return c2;
            }
        }
        if (B == 0) {
            return h.f23322b;
        }
        if (B > 0) {
            int i11 = this.f23329e;
            int i12 = this.f23331g;
            if (B <= i11 - i12) {
                int i13 = B + i12;
                this.f23331g = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                g gVar = h.f23322b;
                return new g(bArr);
            }
        }
        if (B > 0) {
            throw v.e();
        }
        if (B != 0) {
            throw v.d();
        }
        bArr = t.f23376b;
        g gVar2 = h.f23322b;
        return new g(bArr);
    }

    @Override // s9.k
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // s9.k
    public final int i() {
        return B();
    }

    @Override // s9.k
    public final int j() {
        return z();
    }

    @Override // s9.k
    public final long k() {
        return A();
    }

    @Override // s9.k
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // s9.k
    public final int m() {
        return B();
    }

    @Override // s9.k
    public final long n() {
        return C();
    }

    @Override // s9.k
    public final int o() {
        return z();
    }

    @Override // s9.k
    public final long p() {
        return A();
    }

    @Override // s9.k
    public final int q() {
        int B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // s9.k
    public final long r() {
        long C = C();
        return (-(C & 1)) ^ (C >>> 1);
    }

    @Override // s9.k
    public final String s() {
        int B = B();
        if (B > 0) {
            int i5 = this.f23329e;
            int i10 = this.f23331g;
            if (B <= i5 - i10) {
                String str = new String(this.f23328d, i10, B, t.f23375a);
                this.f23331g += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw v.d();
        }
        throw v.e();
    }

    @Override // s9.k
    public final String t() {
        int B = B();
        if (B > 0) {
            int i5 = this.f23329e;
            int i10 = this.f23331g;
            if (B <= i5 - i10) {
                String f6 = y0.f23390a.f(this.f23328d, i10, B);
                this.f23331g += B;
                return f6;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw v.d();
        }
        throw v.e();
    }

    @Override // s9.k
    public final int u() {
        if (c()) {
            this.f23333i = 0;
            return 0;
        }
        int B = B();
        this.f23333i = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new v("Protocol message contained an invalid tag (zero).");
    }

    @Override // s9.k
    public final int v() {
        return B();
    }

    @Override // s9.k
    public final long w() {
        return C();
    }

    @Override // s9.k
    public final boolean x(int i5) {
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                F(8);
                return true;
            }
            if (i10 == 2) {
                F(B());
                return true;
            }
            if (i10 == 3) {
                y();
                a(((i5 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                if (this.f23344b == 0) {
                    a(0);
                }
                return false;
            }
            if (i10 != 5) {
                throw v.b();
            }
            F(4);
            return true;
        }
        int i12 = this.f23329e - this.f23331g;
        byte[] bArr = this.f23328d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f23331g;
                this.f23331g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw v.c();
        }
        while (i11 < 10) {
            int i14 = this.f23331g;
            if (i14 == this.f23329e) {
                throw v.e();
            }
            this.f23331g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw v.c();
        return true;
    }

    public final int z() {
        int i5 = this.f23331g;
        if (this.f23329e - i5 < 4) {
            throw v.e();
        }
        this.f23331g = i5 + 4;
        byte[] bArr = this.f23328d;
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }
}
