package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzaed;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f9n extends zzacv {
    public final byte[] d;
    public int f;
    public int h;
    public int i = Integer.MAX_VALUE;
    public int e = 0;
    public int g = 0;

    public /* synthetic */ f9n(byte[] bArr) {
        this.d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int A() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int B() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int C() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long D() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int E() {
        return zzacv.j(M());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long F() {
        return zzacv.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int G() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long H() {
        long j;
        long j2;
        long j3;
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
                this.g = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        hbo.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int J() {
        int i = this.g;
        if (this.e - i < 4) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long K() {
        int i = this.g;
        if (this.e - i < 8) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final byte[] L(int i) {
        if (i > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.g = i4;
                return Arrays.copyOfRange(this.d, i3, i4);
            }
        }
        if (i > 0) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return zzaed.a;
        }
        hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    public final int M() {
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
        return (int) I();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int a(int i) {
        if (i < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.g;
        if (i2 < 0) {
            hbo.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.i;
        if (i2 > i3) {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.i = i2;
        int i4 = this.e + this.f;
        this.e = i4;
        if (i4 <= i2) {
            this.f = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.f = i5;
        this.e = i4 - i5;
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void b(int i) {
        this.i = i;
        int i2 = this.e + this.f;
        this.e = i2;
        if (i2 <= i) {
            this.f = 0;
            return;
        }
        int i3 = i2 - i;
        this.f = i3;
        this.e = i2 - i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int c() {
        int i = this.i;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean d() {
        return this.g == this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int e() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int f(int i, int i2, byte[] bArr) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.e - this.g);
        if (min == 0) {
            return -1;
        }
        System.arraycopy(this.d, this.g, bArr, i, min);
        this.g += min;
        return min;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void g(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int l() {
        if (d()) {
            this.h = 0;
            return 0;
        }
        int M = M();
        this.h = M;
        if ((M >>> 3) != 0) {
            return M;
        }
        hbo.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void m(int i) {
        if (this.h == i) {
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
                g(M());
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
        int i3 = this.e - this.g;
        byte[] bArr = this.d;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            hbo.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.g;
            if (i7 == this.e) {
                hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        hbo.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double o() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float p() {
        return Float.intBitsToFloat(J());
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
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String w() {
        int M = M();
        if (M > 0) {
            int i = this.e;
            int i2 = this.g;
            if (M <= i - i2) {
                String str = new String(this.d, i2, M, StandardCharsets.UTF_8);
                this.g += M;
                return str;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M < 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String x() {
        int M = M();
        if (M > 0) {
            int i = this.e;
            int i2 = this.g;
            if (M <= i - i2) {
                String d = ten.d(i2, M, this.d);
                this.g += M;
                return d;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M <= 0) {
            hbo.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final a9n y() {
        int M = M();
        if (M > 0) {
            int i = this.e;
            int i2 = this.g;
            if (M <= i - i2) {
                a9n r = zzacr.r(i2, M, this.d);
                this.g += M;
                return r;
            }
        }
        if (M == 0) {
            return zzacr.b;
        }
        byte[] L = L(M);
        a9n a9nVar = zzacr.b;
        return L.length == 0 ? zzacr.b : new a9n(L);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] z() {
        return L(M());
    }
}
