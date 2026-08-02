package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziem;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class npo extends zziem {
    public final byte[] d;
    public final int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public /* synthetic */ npo(byte[] bArr, int i, int i2) {
        this.d = bArr;
        int i3 = i2 + i;
        this.e = i3;
        this.f = i3;
        this.g = i;
        this.h = i;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long A() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int B() {
        return zziem.h(F());
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long C() {
        return zziem.i(G());
    }

    public final long D() {
        int i = this.g;
        if (this.f - i < 8) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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

    public final void E(int i) {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final int F() {
        int i;
        int i2 = this.g;
        int i3 = this.f;
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
        return (int) H();
    }

    public final long G() {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.f;
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
        return H();
    }

    public final long H() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.f) {
                hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        hbo.i("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int I() {
        int i = this.g;
        if (this.f - i < 4) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int a(int i) {
        if (i < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.g;
        int i3 = this.h;
        int i4 = (i2 - i3) + i;
        if (i4 < 0) {
            hbo.i("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i5 = this.j;
        if (i4 > i5) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.j = i4;
        int i6 = this.e;
        if (i4 <= i6 - i3) {
            this.f = i4 + i3;
            return i5;
        }
        this.f = i6;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final void b(int i) {
        this.j = i;
        int i2 = this.e;
        int i3 = this.h;
        if (i <= i2 - i3) {
            this.f = i + i3;
        } else {
            this.f = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final boolean c() {
        return this.g == this.f;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int d() {
        return this.g - this.h;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int j() {
        if (c()) {
            this.i = 0;
            return 0;
        }
        int F = F();
        this.i = F;
        if ((F >>> 3) != 0) {
            return F;
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
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                E(8);
                return true;
            }
            if (i2 == 2) {
                E(F());
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
                E(4);
                return true;
            }
            hbo.e();
            return false;
        }
        int i4 = this.f - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            hbo.i("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.f) {
                hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        hbo.i("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final double m() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final float n() {
        return Float.intBitsToFloat(I());
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long o() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long p() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int q() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final long r() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int s() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final boolean t() {
        return G() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final String u() {
        int F = F();
        if (F > 0) {
            int i = this.f;
            int i2 = this.g;
            if (F <= i - i2) {
                String str = new String(this.d, i2, F, StandardCharsets.UTF_8);
                this.g += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final String v() {
        int F = F();
        if (F > 0) {
            int i = this.f;
            int i2 = this.g;
            if (F <= i - i2) {
                String b = tqo.b(i2, F, this.d);
                this.g += F;
                return b;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F <= 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final mpo w() {
        int F = F();
        byte[] bArr = this.d;
        if (F > 0) {
            int i = this.f;
            int i2 = this.g;
            if (F <= i - i2) {
                mpo C = zziei.C(i2, F, bArr);
                this.g += F;
                return C;
            }
        }
        if (F == 0) {
            return zziei.b;
        }
        if (F > 0) {
            int i3 = this.f;
            int i4 = this.g;
            if (F <= i3 - i4) {
                int i5 = F + i4;
                this.g = i5;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                mpo mpoVar = zziei.b;
                return copyOfRange.length == 0 ? zziei.b : new mpo(copyOfRange);
            }
        }
        if (F <= 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int x() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int y() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zziem
    public final int z() {
        return I();
    }
}
