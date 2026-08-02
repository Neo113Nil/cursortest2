package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b03 extends qo2 {
    public final InputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public b03(InputStream inputStream) {
        u7a.a(inputStream, "input");
        this.c = inputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    @Override // defpackage.qo2
    public final int A() {
        return P();
    }

    @Override // defpackage.qo2
    public final long B() {
        return Q();
    }

    public final byte[] J(int i) {
        byte[] K = K(i);
        if (K != null) {
            return K;
        }
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList M = M(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, i4);
        Iterator it = M.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] K(int i) {
        if (i == 0) {
            return u7a.b;
        }
        if (i < 0) {
            throw maa.i();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new maa("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            U((i5 - i2) - i3);
            throw maa.j();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        InputStream inputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (maa e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw maa.j();
                }
                this.i += read;
                i6 += read;
            } catch (maa e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList M(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.c.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw maa.j();
                }
                this.i += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int N() {
        int i = this.g;
        if (this.e - i < 4) {
            T(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long O() {
        int i = this.g;
        if (this.e - i < 8) {
            T(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int P() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
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
                this.g = i5;
                return i;
            }
        }
        return (int) R();
    }

    public final long Q() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
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
                this.g = i4;
                return j;
            }
        }
        return R();
    }

    public final long R() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                T(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        throw maa.h();
    }

    public final void S() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void T(int i) {
        if (V(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw maa.j();
        }
        throw new maa("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void U(int i) {
        int i2 = this.e;
        int i3 = this.g;
        if (i <= i2 - i3 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        InputStream inputStream = this.c;
        if (i < 0) {
            throw maa.i();
        }
        int i4 = this.i;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.j;
        if (i6 > i7) {
            U((i7 - i4) - i3);
            throw maa.j();
        }
        this.i = i5;
        int i8 = i2 - i3;
        this.e = 0;
        this.g = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (maa e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i8;
                S();
                throw th;
            }
        }
        this.i += i8;
        S();
        if (i8 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        T(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                T(1);
            }
        }
    }

    public final boolean V(int i) {
        InputStream inputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            a70.r(lnb.k(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.i + i2;
                this.i = i5;
                i4 = this.e - i2;
                this.e = i4;
                this.g = 0;
            }
            try {
                int read = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > bArr.length) {
                    zzl.e(read, inputStream.getClass());
                    return false;
                }
                if (read > 0) {
                    this.e += read;
                    S();
                    if (this.e >= i) {
                        return true;
                    }
                    return V(i);
                }
            } catch (maa e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.qo2
    public final void a(int i) {
        if (this.h != i) {
            throw new maa("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.qo2
    public final int b() {
        return this.i + this.g;
    }

    @Override // defpackage.qo2
    public final boolean c() {
        return this.g == this.e && !V(1);
    }

    @Override // defpackage.qo2
    public final void h(int i) {
        this.j = i;
        S();
    }

    @Override // defpackage.qo2
    public final int i(int i) {
        if (i < 0) {
            throw maa.i();
        }
        int i2 = this.i + this.g + i;
        if (i2 < 0) {
            throw new maa("Failed to parse the message.");
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw maa.j();
        }
        this.j = i2;
        S();
        return i3;
    }

    @Override // defpackage.qo2
    public final boolean j() {
        return Q() != 0;
    }

    @Override // defpackage.qo2
    public final cc2 k() {
        int P = P();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (P <= i3 && P > 0) {
            cc2 e = cc2.e(i2, P, bArr);
            this.g += P;
            return e;
        }
        if (P == 0) {
            return cc2.c;
        }
        if (P < 0) {
            throw maa.i();
        }
        byte[] K = K(P);
        if (K != null) {
            return cc2.e(0, K.length, K);
        }
        int i4 = this.g;
        int i5 = this.e;
        int i6 = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList M = M(P - i6);
        byte[] bArr2 = new byte[P];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = M.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        cc2 cc2Var = cc2.c;
        return new cc2(bArr2);
    }

    @Override // defpackage.qo2
    public final double m() {
        return Double.longBitsToDouble(O());
    }

    @Override // defpackage.qo2
    public final int n() {
        return P();
    }

    @Override // defpackage.qo2
    public final int o() {
        return N();
    }

    @Override // defpackage.qo2
    public final long p() {
        return O();
    }

    @Override // defpackage.qo2
    public final float q() {
        return Float.intBitsToFloat(N());
    }

    @Override // defpackage.qo2
    public final int r() {
        return P();
    }

    @Override // defpackage.qo2
    public final long s() {
        return Q();
    }

    @Override // defpackage.qo2
    public final int t() {
        return N();
    }

    @Override // defpackage.qo2
    public final long u() {
        return O();
    }

    @Override // defpackage.qo2
    public final int v() {
        int P = P();
        return (-(P & 1)) ^ (P >>> 1);
    }

    @Override // defpackage.qo2
    public final long w() {
        long Q = Q();
        return (-(Q & 1)) ^ (Q >>> 1);
    }

    @Override // defpackage.qo2
    public final String x() {
        int P = P();
        byte[] bArr = this.d;
        if (P > 0) {
            int i = this.e;
            int i2 = this.g;
            if (P <= i - i2) {
                String str = new String(bArr, i2, P, u7a.a);
                this.g += P;
                return str;
            }
        }
        if (P == 0) {
            return "";
        }
        if (P < 0) {
            throw maa.i();
        }
        if (P > this.e) {
            return new String(J(P), u7a.a);
        }
        T(P);
        String str2 = new String(bArr, this.g, P, u7a.a);
        this.g += P;
        return str2;
    }

    @Override // defpackage.qo2
    public final String y() {
        int P = P();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArr = this.d;
        if (P <= i3 && P > 0) {
            this.g = i + P;
        } else {
            if (P == 0) {
                return "";
            }
            if (P < 0) {
                throw maa.i();
            }
            i = 0;
            if (P <= i2) {
                T(P);
                this.g = P;
            } else {
                bArr = J(P);
            }
        }
        return eik.a.r(i, P, bArr);
    }

    @Override // defpackage.qo2
    public final int z() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int P = P();
        this.h = P;
        if ((P >>> 3) != 0) {
            return P;
        }
        throw new maa("Protocol message contained an invalid tag (zero).");
    }
}
