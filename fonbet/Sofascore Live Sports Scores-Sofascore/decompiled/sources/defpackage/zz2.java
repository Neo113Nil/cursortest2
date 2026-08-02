package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zz2 extends qo2 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public zz2(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.qo2
    public final int A() {
        return M();
    }

    @Override // defpackage.qo2
    public final long B() {
        return N();
    }

    public final int J() {
        int i = this.f;
        if (this.d - i < 4) {
            throw maa.j();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long K() {
        int i = this.f;
        if (this.d - i < 8) {
            throw maa.j();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int M() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f = i5;
                return i;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f = i4;
                return j;
            }
        }
        return O();
    }

    public final long O() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw maa.j();
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        throw maa.h();
    }

    public final void P() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    @Override // defpackage.qo2
    public final void a(int i) {
        if (this.h != i) {
            throw new maa("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.qo2
    public final int b() {
        return this.f - this.g;
    }

    @Override // defpackage.qo2
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // defpackage.qo2
    public final void h(int i) {
        this.i = i;
        P();
    }

    @Override // defpackage.qo2
    public final int i(int i) {
        if (i < 0) {
            throw maa.i();
        }
        int b = b() + i;
        if (b < 0) {
            throw new maa("Failed to parse the message.");
        }
        int i2 = this.i;
        if (b > i2) {
            throw maa.j();
        }
        this.i = b;
        P();
        return i2;
    }

    @Override // defpackage.qo2
    public final boolean j() {
        return N() != 0;
    }

    @Override // defpackage.qo2
    public final cc2 k() {
        byte[] bArr;
        int M = M();
        byte[] bArr2 = this.c;
        if (M > 0) {
            int i = this.d;
            int i2 = this.f;
            if (M <= i - i2) {
                cc2 e = cc2.e(i2, M, bArr2);
                this.f += M;
                return e;
            }
        }
        if (M == 0) {
            return cc2.c;
        }
        if (M > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (M <= i3 - i4) {
                int i5 = M + i4;
                this.f = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                cc2 cc2Var = cc2.c;
                return new cc2(bArr);
            }
        }
        if (M > 0) {
            throw maa.j();
        }
        if (M != 0) {
            throw maa.i();
        }
        bArr = u7a.b;
        cc2 cc2Var2 = cc2.c;
        return new cc2(bArr);
    }

    @Override // defpackage.qo2
    public final double m() {
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.qo2
    public final int n() {
        return M();
    }

    @Override // defpackage.qo2
    public final int o() {
        return J();
    }

    @Override // defpackage.qo2
    public final long p() {
        return K();
    }

    @Override // defpackage.qo2
    public final float q() {
        return Float.intBitsToFloat(J());
    }

    @Override // defpackage.qo2
    public final int r() {
        return M();
    }

    @Override // defpackage.qo2
    public final long s() {
        return N();
    }

    @Override // defpackage.qo2
    public final int t() {
        return J();
    }

    @Override // defpackage.qo2
    public final long u() {
        return K();
    }

    @Override // defpackage.qo2
    public final int v() {
        int M = M();
        return (-(M & 1)) ^ (M >>> 1);
    }

    @Override // defpackage.qo2
    public final long w() {
        long N = N();
        return (-(N & 1)) ^ (N >>> 1);
    }

    @Override // defpackage.qo2
    public final String x() {
        int M = M();
        if (M > 0) {
            int i = this.d;
            int i2 = this.f;
            if (M <= i - i2) {
                String str = new String(this.c, i2, M, u7a.a);
                this.f += M;
                return str;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M < 0) {
            throw maa.i();
        }
        throw maa.j();
    }

    @Override // defpackage.qo2
    public final String y() {
        int M = M();
        if (M > 0) {
            int i = this.d;
            int i2 = this.f;
            if (M <= i - i2) {
                String r = eik.a.r(i2, M, this.c);
                this.f += M;
                return r;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M <= 0) {
            throw maa.i();
        }
        throw maa.j();
    }

    @Override // defpackage.qo2
    public final int z() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int M = M();
        this.h = M;
        if ((M >>> 3) != 0) {
            return M;
        }
        throw new maa("Protocol message contained an invalid tag (zero).");
    }
}
