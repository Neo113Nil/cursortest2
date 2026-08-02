package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f1633c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1634d;

    /* renamed from: e, reason: collision with root package name */
    public int f1635e;

    /* renamed from: f, reason: collision with root package name */
    public int f1636f;

    /* renamed from: g, reason: collision with root package name */
    public int f1637g;

    /* renamed from: h, reason: collision with root package name */
    public int f1638h;

    /* renamed from: i, reason: collision with root package name */
    public int f1639i;
    public int j = Integer.MAX_VALUE;

    public k(InputStream inputStream) {
        a0.a(inputStream, "input");
        this.f1633c = inputStream;
        this.f1634d = new byte[4096];
        this.f1635e = 0;
        this.f1637g = 0;
        this.f1639i = 0;
    }

    public final byte[] A(int i5) {
        if (i5 == 0) {
            return a0.f1573b;
        }
        if (i5 < 0) {
            throw c0.d();
        }
        int i10 = this.f1639i;
        int i11 = this.f1637g;
        int i12 = i10 + i11 + i5;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            J((i13 - i10) - i11);
            throw c0.e();
        }
        int i14 = this.f1635e - i11;
        int i15 = i5 - i14;
        InputStream inputStream = this.f1633c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (c0 e7) {
                e7.f1585a = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f1634d, this.f1637g, bArr, 0, i14);
        this.f1639i += this.f1635e;
        this.f1637g = 0;
        this.f1635e = 0;
        while (i14 < i5) {
            try {
                int read = inputStream.read(bArr, i14, i5 - i14);
                if (read == -1) {
                    throw c0.e();
                }
                this.f1639i += read;
                i14 += read;
            } catch (c0 e9) {
                e9.f1585a = true;
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
                int read = this.f1633c.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw c0.e();
                }
                this.f1639i += read;
                i10 += read;
            }
            i5 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i5 = this.f1637g;
        if (this.f1635e - i5 < 4) {
            I(4);
            i5 = this.f1637g;
        }
        this.f1637g = i5 + 4;
        byte[] bArr = this.f1634d;
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }

    public final long D() {
        int i5 = this.f1637g;
        if (this.f1635e - i5 < 8) {
            I(8);
            i5 = this.f1637g;
        }
        this.f1637g = i5 + 8;
        byte[] bArr = this.f1634d;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public final int E() {
        int i5;
        int i10 = this.f1637g;
        int i11 = this.f1635e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1634d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f1637g = i12;
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
                this.f1637g = i13;
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
        int i5 = this.f1637g;
        int i10 = this.f1635e;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f1634d;
            byte b10 = bArr[i5];
            if (b10 >= 0) {
                this.f1637g = i11;
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
                this.f1637g = i12;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            if (this.f1637g == this.f1635e) {
                I(1);
            }
            int i10 = this.f1637g;
            this.f1637g = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i5;
            if ((this.f1634d[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw c0.c();
    }

    public final void H() {
        int i5 = this.f1635e + this.f1636f;
        this.f1635e = i5;
        int i10 = this.f1639i + i5;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f1636f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f1636f = i12;
        this.f1635e = i5 - i12;
    }

    public final void I(int i5) {
        if (K(i5)) {
            return;
        }
        if (i5 <= (Integer.MAX_VALUE - this.f1639i) - this.f1637g) {
            throw c0.e();
        }
        throw new c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i5) {
        int i10 = this.f1635e;
        int i11 = this.f1637g;
        if (i5 <= i10 - i11 && i5 >= 0) {
            this.f1637g = i11 + i5;
            return;
        }
        InputStream inputStream = this.f1633c;
        if (i5 < 0) {
            throw c0.d();
        }
        int i12 = this.f1639i;
        int i13 = i12 + i11;
        int i14 = i13 + i5;
        int i15 = this.j;
        if (i14 > i15) {
            J((i15 - i12) - i11);
            throw c0.e();
        }
        this.f1639i = i13;
        int i16 = i10 - i11;
        this.f1635e = 0;
        this.f1637g = 0;
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
                } catch (c0 e7) {
                    e7.f1585a = true;
                    throw e7;
                }
            } catch (Throwable th2) {
                this.f1639i += i16;
                H();
                throw th2;
            }
        }
        this.f1639i += i16;
        H();
        if (i16 >= i5) {
            return;
        }
        int i17 = this.f1635e;
        int i18 = i17 - this.f1637g;
        this.f1637g = i17;
        I(1);
        while (true) {
            int i19 = i5 - i18;
            int i20 = this.f1635e;
            if (i19 <= i20) {
                this.f1637g = i19;
                return;
            } else {
                i18 += i20;
                this.f1637g = i20;
                I(1);
            }
        }
    }

    public final boolean K(int i5) {
        InputStream inputStream = this.f1633c;
        int i10 = this.f1637g;
        int i11 = i10 + i5;
        int i12 = this.f1635e;
        if (i11 <= i12) {
            throw new IllegalStateException(d9.e.f(i5, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f1639i;
        if (i5 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i5 <= this.j) {
            byte[] bArr = this.f1634d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f1639i += i10;
                this.f1635e -= i10;
                this.f1637g = 0;
            }
            int i14 = this.f1635e;
            try {
                int read = inputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f1639i) - i14));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f1635e += read;
                    H();
                    if (this.f1635e >= i5) {
                        return true;
                    }
                    return K(i5);
                }
            } catch (c0 e7) {
                e7.f1585a = true;
                throw e7;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void a(int i5) {
        if (this.f1638h != i5) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int b() {
        return this.f1639i + this.f1637g;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean c() {
        return this.f1637g == this.f1635e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void d(int i5) {
        this.j = i5;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int e(int i5) {
        if (i5 < 0) {
            throw c0.d();
        }
        int i10 = this.f1639i + this.f1637g + i5;
        if (i10 < 0) {
            throw new c0("Failed to parse the message.");
        }
        int i11 = this.j;
        if (i10 > i11) {
            throw c0.e();
        }
        this.j = i10;
        H();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final h g() {
        int E = E();
        int i5 = this.f1635e;
        int i10 = this.f1637g;
        int i11 = i5 - i10;
        byte[] bArr = this.f1634d;
        if (E <= i11 && E > 0) {
            h c2 = i.c(bArr, i10, E);
            this.f1637g += E;
            return c2;
        }
        if (E == 0) {
            return i.f1618b;
        }
        if (E < 0) {
            throw c0.d();
        }
        byte[] A = A(E);
        if (A != null) {
            return i.c(A, 0, A.length);
        }
        int i12 = this.f1637g;
        int i13 = this.f1635e;
        int i14 = i13 - i12;
        this.f1639i += i13;
        this.f1637g = 0;
        this.f1635e = 0;
        ArrayList B = B(E - i14);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        h hVar = i.f1618b;
        return new h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int q() {
        int E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long r() {
        long F = F();
        return (-(F & 1)) ^ (F >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String s() {
        int E = E();
        byte[] bArr = this.f1634d;
        if (E > 0) {
            int i5 = this.f1635e;
            int i10 = this.f1637g;
            if (E <= i5 - i10) {
                String str = new String(bArr, i10, E, a0.f1572a);
                this.f1637g += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            throw c0.d();
        }
        if (E > this.f1635e) {
            return new String(z(E), a0.f1572a);
        }
        I(E);
        String str2 = new String(bArr, this.f1637g, E, a0.f1572a);
        this.f1637g += E;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final String t() {
        int E = E();
        int i5 = this.f1637g;
        int i10 = this.f1635e;
        int i11 = i10 - i5;
        byte[] bArr = this.f1634d;
        if (E <= i11 && E > 0) {
            this.f1637g = i5 + E;
        } else {
            if (E == 0) {
                return "";
            }
            if (E < 0) {
                throw c0.d();
            }
            i5 = 0;
            if (E <= i10) {
                I(E);
                this.f1637g = E;
            } else {
                bArr = z(E);
            }
        }
        return n1.f1659a.f(bArr, i5, E);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int u() {
        if (c()) {
            this.f1638h = 0;
            return 0;
        }
        int E = E();
        this.f1638h = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new c0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.l
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
                return false;
            }
            if (i10 != 5) {
                throw c0.b();
            }
            J(4);
            return true;
        }
        int i12 = this.f1635e - this.f1637g;
        byte[] bArr = this.f1634d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f1637g;
                this.f1637g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw c0.c();
        }
        while (i11 < 10) {
            if (this.f1637g == this.f1635e) {
                I(1);
            }
            int i14 = this.f1637g;
            this.f1637g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw c0.c();
        return true;
    }

    public final byte[] z(int i5) {
        byte[] A = A(i5);
        if (A != null) {
            return A;
        }
        int i10 = this.f1637g;
        int i11 = this.f1635e;
        int i12 = i11 - i10;
        this.f1639i += i11;
        this.f1637g = 0;
        this.f1635e = 0;
        ArrayList B = B(i5 - i12);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f1634d, i10, bArr, 0, i12);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }
}
