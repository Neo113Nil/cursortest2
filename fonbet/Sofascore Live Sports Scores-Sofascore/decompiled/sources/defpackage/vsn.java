package defpackage;

import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcj;
import com.google.android.gms.internal.wearable.zzdv;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vsn extends zzcj {
    public final byte[] c;
    public int d;
    public int e;
    public int g;
    public int h = Integer.MAX_VALUE;
    public int f = 0;

    public /* synthetic */ vsn(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
    }

    public final int A() {
        int i = this.f;
        if (this.d - i < 4) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long B() {
        int i = this.f;
        if (this.d - i < 8) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int a(int i) {
        if (i < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.f;
        if (i2 < 0) {
            throw new zzdv("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.h;
        if (i2 > i3) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.h = i2;
        int i4 = this.d + this.e;
        this.d = i4;
        if (i4 <= i2) {
            this.e = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.e = i5;
        this.d = i4 - i5;
        return i3;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final void b(int i) {
        this.h = i;
        int i2 = this.d + this.e;
        this.d = i2;
        if (i2 <= i) {
            this.e = 0;
            return;
        }
        int i3 = i2 - i;
        this.e = i3;
        this.d = i2 - i3;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int d() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int e() {
        if (c()) {
            this.g = 0;
            return 0;
        }
        int x = x();
        this.g = x;
        if ((x >>> 3) != 0) {
            return x;
        }
        throw new zzdv("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final void f() {
        if (this.g != 0) {
            throw new zzdv("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final double g() {
        return Double.longBitsToDouble(B());
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final float h() {
        return Float.intBitsToFloat(A());
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long i() {
        return y();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long j() {
        return y();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int k() {
        return x();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long l() {
        return B();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int m() {
        return A();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final boolean n() {
        return y() != 0;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final String o() {
        int x = x();
        if (x > 0) {
            int i = this.d;
            int i2 = this.f;
            if (x <= i - i2) {
                String str = new String(this.c, i2, x, StandardCharsets.UTF_8);
                this.f += x;
                return str;
            }
        }
        if (x == 0) {
            return "";
        }
        if (x < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final String p() {
        int x = x();
        if (x > 0) {
            int i = this.d;
            int i2 = this.f;
            if (x <= i - i2) {
                int i3 = fao.a;
                byte[] bArr = this.c;
                int length = bArr.length;
                if ((((length - i2) - x) | i2 | x) < 0) {
                    yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(x)});
                    return null;
                }
                int i4 = i2 + x;
                char[] cArr = new char[x];
                int i5 = 0;
                while (i2 < i4) {
                    byte b = bArr[i2];
                    if (b < 0) {
                        break;
                    }
                    i2++;
                    cArr[i5] = (char) b;
                    i5++;
                }
                while (i2 < i4) {
                    int i6 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (b2 >= 0) {
                        cArr[i5] = (char) b2;
                        i5++;
                        i2 = i6;
                        while (i2 < i4) {
                            byte b3 = bArr[i2];
                            if (b3 >= 0) {
                                i2++;
                                cArr[i5] = (char) b3;
                                i5++;
                            }
                        }
                    } else {
                        if (b2 >= -32) {
                            if (b2 >= -16) {
                                if (i6 >= i4 - 2) {
                                    throw new zzdv("Protocol message had invalid UTF-8.");
                                }
                                byte b4 = bArr[i6];
                                int i7 = i2 + 3;
                                byte b5 = bArr[i2 + 2];
                                i2 += 4;
                                byte b6 = bArr[i7];
                                if (!sha.f0(b4)) {
                                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !sha.f0(b5) && !sha.f0(b6)) {
                                        int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                        cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                        cArr[i5 + 1] = (char) ((i8 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                        i5 += 2;
                                    }
                                }
                                throw new zzdv("Protocol message had invalid UTF-8.");
                            }
                            if (i6 >= i4 - 1) {
                                throw new zzdv("Protocol message had invalid UTF-8.");
                            }
                            int i9 = i5 + 1;
                            int i10 = i2 + 2;
                            byte b7 = bArr[i6];
                            i2 += 3;
                            byte b8 = bArr[i10];
                            if (!sha.f0(b7)) {
                                if (b2 == -32) {
                                    if (b7 >= -96) {
                                        b2 = -32;
                                    }
                                }
                                if (b2 == -19) {
                                    if (b7 < -96) {
                                        b2 = -19;
                                    }
                                }
                                if (!sha.f0(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                            throw new zzdv("Protocol message had invalid UTF-8.");
                        }
                        if (i6 >= i4) {
                            throw new zzdv("Protocol message had invalid UTF-8.");
                        }
                        int i11 = i5 + 1;
                        i2 += 2;
                        byte b9 = bArr[i6];
                        if (b2 < -62 || sha.f0(b9)) {
                            throw new zzdv("Protocol message had invalid UTF-8.");
                        }
                        cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                        i5 = i11;
                    }
                }
                String str = new String(cArr, 0, i5);
                this.f += x;
                return str;
            }
        }
        if (x == 0) {
            return "";
        }
        if (x <= 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final zrn q() {
        zrn zrnVar;
        int x = x();
        byte[] bArr = this.c;
        if (x > 0) {
            int i = this.d;
            int i2 = this.f;
            if (x <= i - i2) {
                if (x == 0) {
                    zrnVar = zzcg.b;
                } else {
                    zrn zrnVar2 = zzcg.b;
                    zzcg.r(i2, i2 + x, bArr.length);
                    byte[] bArr2 = new byte[x];
                    System.arraycopy(bArr, i2, bArr2, 0, x);
                    zrnVar = new zrn(bArr2);
                }
                this.f += x;
                return zrnVar;
            }
        }
        if (x == 0) {
            return zzcg.b;
        }
        if (x > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (x <= i3 - i4) {
                int i5 = x + i4;
                this.f = i5;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                zrn zrnVar3 = zzcg.b;
                return copyOfRange.length == 0 ? zzcg.b : new zrn(copyOfRange);
            }
        }
        if (x <= 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int r() {
        return x();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int s() {
        return x();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int t() {
        return A();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long u() {
        return B();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int v() {
        int x = x();
        return (x >>> 1) ^ (-(x & 1));
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long w() {
        long y = y();
        return (y >>> 1) ^ (-(1 & y));
    }

    public final int x() {
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
        return (int) z();
    }

    public final long y() {
        long j;
        long j2;
        long j3;
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
                this.f = i4;
                return j;
            }
        }
        return z();
    }

    public final long z() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        throw new zzdv("CodedInputStream encountered a malformed varint.");
    }
}
