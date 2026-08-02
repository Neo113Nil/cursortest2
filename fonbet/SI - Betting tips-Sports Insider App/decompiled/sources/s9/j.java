package s9;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f23334d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f23335e;

    /* renamed from: f, reason: collision with root package name */
    public int f23336f;

    /* renamed from: g, reason: collision with root package name */
    public int f23337g;

    /* renamed from: h, reason: collision with root package name */
    public int f23338h;

    /* renamed from: i, reason: collision with root package name */
    public int f23339i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f23340k = Integer.MAX_VALUE;

    public j(InputStream inputStream) {
        t.a(inputStream, "input");
        this.f23334d = inputStream;
        this.f23335e = new byte[4096];
        this.f23336f = 0;
        this.f23338h = 0;
        this.j = 0;
    }

    public final byte[] A(int i5) {
        if (i5 == 0) {
            return t.f23376b;
        }
        if (i5 < 0) {
            throw v.d();
        }
        int i10 = this.j;
        int i11 = this.f23338h;
        int i12 = i10 + i11 + i5;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.f23340k;
        if (i12 > i13) {
            J((i13 - i10) - i11);
            throw v.e();
        }
        int i14 = this.f23336f - i11;
        int i15 = i5 - i14;
        InputStream inputStream = this.f23334d;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (v e7) {
                e7.f23378a = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f23335e, this.f23338h, bArr, 0, i14);
        this.j += this.f23336f;
        this.f23338h = 0;
        this.f23336f = 0;
        while (i14 < i5) {
            try {
                int read = inputStream.read(bArr, i14, i5 - i14);
                if (read == -1) {
                    throw v.e();
                }
                this.j += read;
                i14 += read;
            } catch (v e9) {
                e9.f23378a = true;
                throw e9;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i5) {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int min = Math.min(i5, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f23334d.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw v.e();
                }
                this.j += read;
                i10 += read;
            }
            i5 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i5 = this.f23338h;
        if (this.f23336f - i5 < 4) {
            I(4);
            i5 = this.f23338h;
        }
        this.f23338h = i5 + 4;
        byte[] bArr = this.f23335e;
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }

    public final long D() {
        int i5 = this.f23338h;
        if (this.f23336f - i5 < 8) {
            I(8);
            i5 = this.f23338h;
        }
        this.f23338h = i5 + 8;
        byte[] bArr = this.f23335e;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public final int E() {
        int i5;
        int i10 = this.f23338h;
        int i11 = this.f23336f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f23335e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f23338h = i12;
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
                this.f23338h = i13;
                return i5;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j6;
        long j10;
        long j11;
        int i5 = this.f23338h;
        int i10 = this.f23336f;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f23335e;
            byte b10 = bArr[i5];
            if (b10 >= 0) {
                this.f23338h = i11;
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
                this.f23338h = i12;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            if (this.f23338h == this.f23336f) {
                I(1);
            }
            int i10 = this.f23338h;
            this.f23338h = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i5;
            if ((this.f23335e[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw v.c();
    }

    public final void H() {
        int i5 = this.f23336f + this.f23337g;
        this.f23336f = i5;
        int i10 = this.j + i5;
        int i11 = this.f23340k;
        if (i10 <= i11) {
            this.f23337g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f23337g = i12;
        this.f23336f = i5 - i12;
    }

    public final void I(int i5) {
        if (K(i5)) {
            return;
        }
        if (i5 <= (Integer.MAX_VALUE - this.j) - this.f23338h) {
            throw v.e();
        }
        throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void J(int i5) {
        int i10 = this.f23336f;
        int i11 = this.f23338h;
        if (i5 <= i10 - i11 && i5 >= 0) {
            this.f23338h = i11 + i5;
            return;
        }
        InputStream inputStream = this.f23334d;
        if (i5 < 0) {
            throw v.d();
        }
        int i12 = this.j;
        int i13 = i12 + i11;
        int i14 = i13 + i5;
        int i15 = this.f23340k;
        if (i14 > i15) {
            J((i15 - i12) - i11);
            throw v.e();
        }
        this.j = i13;
        int i16 = i10 - i11;
        this.f23336f = 0;
        this.f23338h = 0;
        while (i16 < i5) {
            long j = i5 - i16;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i16 += (int) skip;
                    }
                } catch (v e7) {
                    e7.f23378a = true;
                    throw e7;
                }
            } catch (Throwable th2) {
                this.j += i16;
                H();
                throw th2;
            }
        }
        this.j += i16;
        H();
        if (i16 >= i5) {
            return;
        }
        int i17 = this.f23336f;
        int i18 = i17 - this.f23338h;
        this.f23338h = i17;
        I(1);
        while (true) {
            int i19 = i5 - i18;
            int i20 = this.f23336f;
            if (i19 <= i20) {
                this.f23338h = i19;
                return;
            } else {
                i18 += i20;
                this.f23338h = i20;
                I(1);
            }
        }
    }

    public final boolean K(int i5) {
        InputStream inputStream = this.f23334d;
        int i10 = this.f23338h;
        int i11 = i10 + i5;
        int i12 = this.f23336f;
        if (i11 <= i12) {
            throw new IllegalStateException(d9.e.f(i5, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.j;
        if (i5 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i5 <= this.f23340k) {
            byte[] bArr = this.f23335e;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.j += i10;
                this.f23336f -= i10;
                this.f23338h = 0;
            }
            int i14 = this.f23336f;
            try {
                int read = inputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.j) - i14));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f23336f += read;
                    H();
                    if (this.f23336f >= i5 || K(i5)) {
                        return true;
                    }
                }
            } catch (v e7) {
                e7.f23378a = true;
                throw e7;
            }
        }
        return false;
    }

    @Override // s9.k
    public final void a(int i5) {
        if (this.f23339i != i5) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // s9.k
    public final int b() {
        return this.j + this.f23338h;
    }

    @Override // s9.k
    public final boolean c() {
        return this.f23338h == this.f23336f && !K(1);
    }

    @Override // s9.k
    public final void d(int i5) {
        this.f23340k = i5;
        H();
    }

    @Override // s9.k
    public final int e(int i5) {
        if (i5 < 0) {
            throw v.d();
        }
        int i10 = this.j + this.f23338h + i5;
        if (i10 < 0) {
            throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f23340k;
        if (i10 > i11) {
            throw v.e();
        }
        this.f23340k = i10;
        H();
        return i11;
    }

    @Override // s9.k
    public final boolean f() {
        return F() != 0;
    }

    @Override // s9.k
    public final g g() {
        int E = E();
        int i5 = this.f23336f;
        int i10 = this.f23338h;
        int i11 = i5 - i10;
        byte[] bArr = this.f23335e;
        if (E <= i11 && E > 0) {
            g c2 = h.c(bArr, i10, E);
            this.f23338h += E;
            return c2;
        }
        if (E == 0) {
            return h.f23322b;
        }
        if (E < 0) {
            throw v.d();
        }
        byte[] A = A(E);
        if (A != null) {
            return h.c(A, 0, A.length);
        }
        int i12 = this.f23338h;
        int i13 = this.f23336f;
        int i14 = i13 - i12;
        this.j += i13;
        this.f23338h = 0;
        this.f23336f = 0;
        ArrayList B = B(E - i14);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        g gVar = h.f23322b;
        return new g(bArr2);
    }

    @Override // s9.k
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // s9.k
    public final int i() {
        return E();
    }

    @Override // s9.k
    public final int j() {
        return C();
    }

    @Override // s9.k
    public final long k() {
        return D();
    }

    @Override // s9.k
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // s9.k
    public final int m() {
        return E();
    }

    @Override // s9.k
    public final long n() {
        return F();
    }

    @Override // s9.k
    public final int o() {
        return C();
    }

    @Override // s9.k
    public final long p() {
        return D();
    }

    @Override // s9.k
    public final int q() {
        int E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // s9.k
    public final long r() {
        long F = F();
        return (-(F & 1)) ^ (F >>> 1);
    }

    @Override // s9.k
    public final String s() {
        int E = E();
        byte[] bArr = this.f23335e;
        if (E > 0) {
            int i5 = this.f23336f;
            int i10 = this.f23338h;
            if (E <= i5 - i10) {
                String str = new String(bArr, i10, E, t.f23375a);
                this.f23338h += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            throw v.d();
        }
        if (E > this.f23336f) {
            return new String(z(E), t.f23375a);
        }
        I(E);
        String str2 = new String(bArr, this.f23338h, E, t.f23375a);
        this.f23338h += E;
        return str2;
    }

    @Override // s9.k
    public final String t() {
        int E = E();
        int i5 = this.f23338h;
        int i10 = this.f23336f;
        int i11 = i10 - i5;
        byte[] bArr = this.f23335e;
        if (E <= i11 && E > 0) {
            this.f23338h = i5 + E;
        } else {
            if (E == 0) {
                return "";
            }
            if (E < 0) {
                throw v.d();
            }
            i5 = 0;
            if (E <= i10) {
                I(E);
                this.f23338h = E;
            } else {
                bArr = z(E);
            }
        }
        return y0.f23390a.f(bArr, i5, E);
    }

    @Override // s9.k
    public final int u() {
        if (c()) {
            this.f23339i = 0;
            return 0;
        }
        int E = E();
        this.f23339i = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new v("Protocol message contained an invalid tag (zero).");
    }

    @Override // s9.k
    public final int v() {
        return E();
    }

    @Override // s9.k
    public final long w() {
        return F();
    }

    @Override // s9.k
    public final boolean x(int i5) {
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                J(8);
                return true;
            }
            if (i10 == 2) {
                J(E());
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
            J(4);
            return true;
        }
        int i12 = this.f23336f - this.f23338h;
        byte[] bArr = this.f23335e;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f23338h;
                this.f23338h = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw v.c();
        }
        while (i11 < 10) {
            if (this.f23338h == this.f23336f) {
                I(1);
            }
            int i14 = this.f23338h;
            this.f23338h = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw v.c();
        return true;
    }

    public final byte[] z(int i5) {
        byte[] A = A(i5);
        if (A != null) {
            return A;
        }
        int i10 = this.f23338h;
        int i11 = this.f23336f;
        int i12 = i11 - i10;
        this.j += i11;
        this.f23338h = 0;
        this.f23336f = 0;
        ArrayList B = B(i5 - i12);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f23335e, i10, bArr, 0, i12);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }
}
