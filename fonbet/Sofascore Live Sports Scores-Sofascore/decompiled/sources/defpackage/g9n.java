package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzaed;
import com.google.android.gms.internal.measurement.zzaeh;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g9n extends zzacv {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public /* synthetic */ g9n(InputStream inputStream, int i) {
        this.d = inputStream;
        this.e = new byte[i < 8 ? 8 : i];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int A() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int B() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int C() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long D() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int E() {
        return zzacv.j(G());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long F() {
        return zzacv.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int G() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) O();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long H() {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = i9 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i6] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i6] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (bArr[i10] << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (bArr[i6] << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.h = i4;
                return j;
            }
        }
        return O();
    }

    public final void I() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void J(int i) {
        if (K(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.j) - this.h) {
            hbo.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean K(int i) {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            a70.r(fn0.k(i, "refillBuffer() called when ", " bytes were already available in buffer", new StringBuilder(String.valueOf(i).length() + 66)));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.j + i2;
                this.j = i5;
                i4 = this.f - i2;
                this.f = i4;
                this.h = 0;
            }
            try {
                int read = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > bArr.length) {
                    String valueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (read > 0) {
                    this.f += read;
                    I();
                    if (this.f >= i || K(i)) {
                        return true;
                    }
                }
            } catch (zzaeh e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] L(int i) {
        byte[] M = M(i);
        if (M != null) {
            return M;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList N = N(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] M(int i) {
        if (i == 0) {
            return zzaed.a;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            hbo.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.k;
        if (i4 > i5) {
            g((i5 - i2) - i3);
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zzaeh e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += read;
                i6 += read;
            } catch (zzaeh e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList N(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.d.read(bArr, i2, min - i2);
                    if (read == -1) {
                        hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.j += read;
                    i2 += read;
                } catch (zzaeh e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long O() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                J(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        hbo.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int P() {
        int i = this.h;
        if (this.f - i < 4) {
            J(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long Q() {
        int i = this.h;
        if (this.f - i < 8) {
            J(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int a(int i) {
        if (i < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            hbo.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.k;
        if (i2 > i3) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i2;
        I();
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void b(int i) {
        this.k = i;
        I();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int c() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.j + this.h);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean d() {
        return this.h == this.f && !K(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int e() {
        return this.j + this.h;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int f(int i, int i2, byte[] bArr) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f;
        int i4 = this.h;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int min = Math.min(i2, i5);
            System.arraycopy(this.e, this.h, bArr, i, min);
            this.h += min;
            return min;
        }
        int min2 = Math.min(i2, (this.k - this.j) - i4);
        if (min2 <= 0) {
            return -1;
        }
        try {
            int read = this.d.read(bArr, i, min2);
            if (read != -1) {
                this.j += read;
            }
            return read;
        } catch (zzaeh e) {
            e.a = true;
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void g(int i) {
        InputStream inputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = this.k;
        if (i6 + i > i7) {
            g((i7 - i5) - i3);
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.j = i6;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (zzaeh e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                I();
                throw th;
            }
        }
        this.j += i4;
        I();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f;
        int i9 = i8 - this.h;
        this.h = i8;
        J(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f;
            if (i10 <= i11) {
                this.h = i10;
                return;
            } else {
                i9 += i11;
                this.h = i11;
                J(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int l() {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int G = G();
        this.i = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        hbo.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void m(int i) {
        if (this.i == i) {
            return;
        }
        hbo.o("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean n(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                g(8);
                return true;
            }
            if (i2 == 2) {
                g(G());
                return true;
            }
            if (i2 == 3) {
                i();
                m(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    m(0);
                }
                return false;
            }
            if (i2 == 5) {
                g(4);
                return true;
            }
            zzl.w();
            return false;
        }
        int i3 = this.f - this.h;
        byte[] bArr = this.e;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            hbo.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.h == this.f) {
                J(1);
            }
            int i7 = this.h;
            this.h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        hbo.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double o() {
        return Double.longBitsToDouble(Q());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float p() {
        return Float.intBitsToFloat(P());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long r() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int s() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int u() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String w() {
        int G = G();
        byte[] bArr = this.e;
        if (G > 0) {
            int i = this.f;
            int i2 = this.h;
            if (G <= i - i2) {
                String str = new String(bArr, i2, G, StandardCharsets.UTF_8);
                this.h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (G > this.f) {
            return new String(L(G), StandardCharsets.UTF_8);
        }
        J(G);
        String str2 = new String(bArr, this.h, G, StandardCharsets.UTF_8);
        this.h += G;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String x() {
        int G = G();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArr = this.e;
        if (G <= i3 && G > 0) {
            this.h = i + G;
        } else {
            if (G == 0) {
                return "";
            }
            if (G < 0) {
                hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (G <= i2) {
                J(G);
                this.h = G;
            } else {
                bArr = L(G);
            }
        }
        return ten.d(i, G, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final a9n y() {
        int G = G();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (G <= i3 && G > 0) {
            a9n r = zzacr.r(i2, G, bArr);
            this.h += G;
            return r;
        }
        if (G == 0) {
            return zzacr.b;
        }
        if (G < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] M = M(G);
        if (M != null) {
            return zzacr.r(0, M.length, M);
        }
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList N = N(G - i6);
        byte[] bArr2 = new byte[G];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            a9n a9nVar = zzacr.b;
            return G == 0 ? zzacr.b : new a9n(bArr2);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] z() {
        int G = G();
        int i = this.f;
        int i2 = this.h;
        if (G <= i - i2 && G > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.e, i2, i2 + G);
            this.h += G;
            return copyOfRange;
        }
        if (G >= 0) {
            return L(G);
        }
        hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }
}
