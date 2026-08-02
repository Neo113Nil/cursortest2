package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziem;
import com.google.android.gms.internal.ads.zzifz;
import com.google.android.gms.internal.ads.zzige;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class opo extends zziem {
    public final InputStream d;
    public int g;
    public int i;
    public int k = Integer.MAX_VALUE;
    public final byte[] e = new byte[4096];
    public int f = 0;
    public int h = 0;
    public int j = 0;

    public /* synthetic */ opo(InputStream inputStream) {
        this.d = inputStream;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long A() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int B() {
        return zziem.h(K());
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long C() {
        return zziem.i(L());
    }

    public final void D(int i) {
        InputStream inputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = this.k;
        if (i6 + i > i7) {
            D((i7 - i5) - i3);
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
                } catch (zzige e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                E();
                throw th;
            }
        }
        this.j += i4;
        E();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f;
        int i9 = i8 - this.h;
        this.h = i8;
        F(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f;
            if (i10 <= i11) {
                this.h = i10;
                return;
            } else {
                i9 += i11;
                this.h = i11;
                F(1);
            }
        }
    }

    public final void E() {
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

    public final void F(int i) {
        if (G(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.j) - this.h) {
            hbo.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean G(int i) {
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
                int read = inputStream.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > 4096) {
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
                    E();
                    if (this.f >= i || G(i)) {
                        return true;
                    }
                }
            } catch (zzige e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] H(int i) {
        byte[] I = I(i);
        if (I != null) {
            return I;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList J = J(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        Iterator it = J.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] I(int i) {
        if (i == 0) {
            return zzifz.a;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            hbo.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.k;
        if (i4 > i5) {
            D((i5 - i2) - i3);
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
            } catch (zzige e) {
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
                    hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += read;
                i6 += read;
            } catch (zzige e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.d.read(bArr, i2, min - i2);
                    if (read == -1) {
                        hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.j += read;
                    i2 += read;
                } catch (zzige e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() {
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
        return (int) M();
    }

    public final long L() {
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
        return M();
    }

    public final long M() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                F(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        hbo.i("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int N() {
        int i = this.h;
        if (this.f - i < 4) {
            F(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long O() {
        int i = this.h;
        if (this.f - i < 8) {
            F(8);
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

    @Override // com.google.android.gms.internal.ads.zziem
    public final int a(int i) {
        if (i < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            hbo.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.k;
        if (i2 > i3) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i2;
        E();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final void b(int i) {
        this.k = i;
        E();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final boolean c() {
        return this.h == this.f && !G(1);
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int d() {
        return this.j + this.h;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int j() {
        if (c()) {
            this.i = 0;
            return 0;
        }
        int K = K();
        this.i = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        hbo.i("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final void k(int i) {
        if (this.i == i) {
            return;
        }
        hbo.i("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final boolean l(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                D(8);
                return true;
            }
            if (i2 == 2) {
                D(K());
                return true;
            }
            if (i2 == 3) {
                g();
                k(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    k(0);
                }
                return false;
            }
            if (i2 == 5) {
                D(4);
                return true;
            }
            hbo.e();
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
            hbo.i("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.h == this.f) {
                F(1);
            }
            int i7 = this.h;
            this.h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        hbo.i("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final double m() {
        return Double.longBitsToDouble(O());
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final float n() {
        return Float.intBitsToFloat(N());
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long o() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long p() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int q() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long r() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int s() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final boolean t() {
        return L() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final String u() {
        int K = K();
        byte[] bArr = this.e;
        if (K > 0) {
            int i = this.f;
            int i2 = this.h;
            if (K <= i - i2) {
                String str = new String(bArr, i2, K, StandardCharsets.UTF_8);
                this.h += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (K > this.f) {
            return new String(H(K), StandardCharsets.UTF_8);
        }
        F(K);
        String str2 = new String(bArr, this.h, K, StandardCharsets.UTF_8);
        this.h += K;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final String v() {
        int K = K();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArr = this.e;
        if (K <= i3 && K > 0) {
            this.h = i + K;
        } else {
            if (K == 0) {
                return "";
            }
            if (K < 0) {
                hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (K <= i2) {
                F(K);
                this.h = K;
            } else {
                bArr = H(K);
            }
        }
        return tqo.b(i, K, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final mpo w() {
        int K = K();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (K <= i3 && K > 0) {
            mpo C = zziei.C(i2, K, bArr);
            this.h += K;
            return C;
        }
        if (K == 0) {
            return zziei.b;
        }
        if (K < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] I = I(K);
        if (I != null) {
            return zziei.C(0, I.length, I);
        }
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList J = J(K - i6);
        byte[] bArr2 = new byte[K];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = J.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        mpo mpoVar = zziei.b;
        try {
            return K == 0 ? zziei.b : new mpo(bArr2);
        } catch (zzige e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int x() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int y() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int z() {
        return N();
    }
}
