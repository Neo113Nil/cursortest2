package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1624c;

    /* renamed from: d, reason: collision with root package name */
    public int f1625d;

    /* renamed from: e, reason: collision with root package name */
    public int f1626e;

    /* renamed from: f, reason: collision with root package name */
    public int f1627f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1628g;

    /* renamed from: h, reason: collision with root package name */
    public int f1629h;

    /* renamed from: i, reason: collision with root package name */
    public int f1630i = Integer.MAX_VALUE;

    public j(byte[] bArr, int i5, int i10, boolean z5) {
        this.f1624c = bArr;
        this.f1625d = i10 + i5;
        this.f1627f = i5;
        this.f1628g = i5;
    }

    public final long A() {
        int i5 = this.f1627f;
        if (this.f1625d - i5 < 8) {
            throw c0.e();
        }
        this.f1627f = i5 + 8;
        byte[] bArr = this.f1624c;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public final int B() {
        int i5;
        int i10 = this.f1627f;
        int i11 = this.f1625d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1624c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f1627f = i12;
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
                this.f1627f = i13;
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
        int i5 = this.f1627f;
        int i10 = this.f1625d;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f1624c;
            byte b10 = bArr[i5];
            if (b10 >= 0) {
                this.f1627f = i11;
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
                this.f1627f = i12;
                return j;
            }
        }
        return D();
    }

    public final long D() {
        long j = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int i10 = this.f1627f;
            if (i10 == this.f1625d) {
                throw c0.e();
            }
            this.f1627f = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i5;
            if ((this.f1624c[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw c0.c();
    }

    public final void E() {
        int i5 = this.f1625d + this.f1626e;
        this.f1625d = i5;
        int i10 = i5 - this.f1628g;
        int i11 = this.f1630i;
        if (i10 <= i11) {
            this.f1626e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f1626e = i12;
        this.f1625d = i5 - i12;
    }

    public final void F(int i5) {
        if (i5 >= 0) {
            int i10 = this.f1625d;
            int i11 = this.f1627f;
            if (i5 <= i10 - i11) {
                this.f1627f = i11 + i5;
                return;
            }
        }
        if (i5 >= 0) {
            throw c0.e();
        }
        throw c0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void a(int i5) {
        if (this.f1629h != i5) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int b() {
        return this.f1627f - this.f1628g;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean c() {
        return this.f1627f == this.f1625d;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void d(int i5) {
        this.f1630i = i5;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int e(int i5) {
        if (i5 < 0) {
            throw c0.d();
        }
        int b10 = b() + i5;
        if (b10 < 0) {
            throw new c0("Failed to parse the message.");
        }
        int i10 = this.f1630i;
        if (b10 > i10) {
            throw c0.e();
        }
        this.f1630i = b10;
        E();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean f() {
        return C() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final h g() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.f1624c;
        if (B > 0) {
            int i5 = this.f1625d;
            int i10 = this.f1627f;
            if (B <= i5 - i10) {
                h c2 = i.c(bArr2, i10, B);
                this.f1627f += B;
                return c2;
            }
        }
        if (B == 0) {
            return i.f1618b;
        }
        if (B > 0) {
            int i11 = this.f1625d;
            int i12 = this.f1627f;
            if (B <= i11 - i12) {
                int i13 = B + i12;
                this.f1627f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                h hVar = i.f1618b;
                return new h(bArr);
            }
        }
        if (B > 0) {
            throw c0.e();
        }
        if (B != 0) {
            throw c0.d();
        }
        bArr = a0.f1573b;
        h hVar2 = i.f1618b;
        return new h(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int q() {
        int B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long r() {
        long C = C();
        return (-(C & 1)) ^ (C >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String s() {
        int B = B();
        if (B > 0) {
            int i5 = this.f1625d;
            int i10 = this.f1627f;
            if (B <= i5 - i10) {
                String str = new String(this.f1624c, i10, B, a0.f1572a);
                this.f1627f += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw c0.d();
        }
        throw c0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String t() {
        int B = B();
        if (B > 0) {
            int i5 = this.f1625d;
            int i10 = this.f1627f;
            if (B <= i5 - i10) {
                String f6 = n1.f1659a.f(this.f1624c, i10, B);
                this.f1627f += B;
                return f6;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw c0.d();
        }
        throw c0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int u() {
        if (c()) {
            this.f1629h = 0;
            return 0;
        }
        int B = B();
        this.f1629h = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new c0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.l
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
                return false;
            }
            if (i10 != 5) {
                throw c0.b();
            }
            F(4);
            return true;
        }
        int i12 = this.f1625d - this.f1627f;
        byte[] bArr = this.f1624c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f1627f;
                this.f1627f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw c0.c();
        }
        while (i11 < 10) {
            int i14 = this.f1627f;
            if (i14 == this.f1625d) {
                throw c0.e();
            }
            this.f1627f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw c0.c();
        return true;
    }

    public final int z() {
        int i5 = this.f1627f;
        if (this.f1625d - i5 < 4) {
            throw c0.e();
        }
        this.f1627f = i5 + 4;
        byte[] bArr = this.f1624c;
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }
}
