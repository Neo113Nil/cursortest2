package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k8n extends m8n {
    public final byte[] c;
    public int d;
    public int e;
    public int g;
    public int h = Integer.MAX_VALUE;
    public int f = 0;

    public /* synthetic */ k8n(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
    }

    public final long A() {
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
        return B();
    }

    public final long B() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        hbo.m("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int C() {
        int i = this.f;
        if (this.d - i < 4) {
            hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long D() {
        int i = this.f;
        if (this.d - i < 8) {
            hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.m8n
    public final int a(int i) {
        if (i < 0) {
            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.f;
        if (i2 < 0) {
            hbo.m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.h;
        if (i2 > i3) {
            hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
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

    @Override // defpackage.m8n
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

    @Override // defpackage.m8n
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // defpackage.m8n
    public final int d() {
        return this.f;
    }

    @Override // defpackage.m8n
    public final int g() {
        if (c()) {
            this.g = 0;
            return 0;
        }
        int z = z();
        this.g = z;
        if ((z >>> 3) != 0) {
            return z;
        }
        hbo.m("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.m8n
    public final void h() {
        if (this.g == 0) {
            return;
        }
        hbo.m("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.m8n
    public final double i() {
        return Double.longBitsToDouble(D());
    }

    @Override // defpackage.m8n
    public final float j() {
        return Float.intBitsToFloat(C());
    }

    @Override // defpackage.m8n
    public final long k() {
        return A();
    }

    @Override // defpackage.m8n
    public final long l() {
        return A();
    }

    @Override // defpackage.m8n
    public final int m() {
        return z();
    }

    @Override // defpackage.m8n
    public final long n() {
        return D();
    }

    @Override // defpackage.m8n
    public final int o() {
        return C();
    }

    @Override // defpackage.m8n
    public final boolean p() {
        return A() != 0;
    }

    @Override // defpackage.m8n
    public final String q() {
        int z = z();
        if (z > 0) {
            int i = this.d;
            int i2 = this.f;
            if (z <= i - i2) {
                String str = new String(this.c, i2, z, jan.a);
                this.f += z;
                return str;
            }
        }
        if (z == 0) {
            return "";
        }
        if (z < 0) {
            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.m8n
    public final String r() {
        int z = z();
        if (z > 0) {
            int i = this.d;
            int i2 = this.f;
            if (z <= i - i2) {
                String d = vdn.d(i2, z, this.c);
                this.f += z;
                return d;
            }
        }
        if (z == 0) {
            return "";
        }
        if (z <= 0) {
            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.m8n
    public final e8n s() {
        e8n e8nVar;
        int z = z();
        byte[] bArr = this.c;
        if (z > 0) {
            int i = this.d;
            int i2 = this.f;
            if (z <= i - i2) {
                if (z == 0) {
                    e8nVar = g8n.b;
                } else {
                    e8n e8nVar2 = g8n.b;
                    g8n.y(i2, i2 + z, bArr.length);
                    byte[] bArr2 = new byte[z];
                    System.arraycopy(bArr, i2, bArr2, 0, z);
                    e8nVar = new e8n(bArr2);
                }
                this.f += z;
                return e8nVar;
            }
        }
        if (z == 0) {
            return g8n.b;
        }
        if (z > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (z <= i3 - i4) {
                int i5 = z + i4;
                this.f = i5;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                e8n e8nVar3 = g8n.b;
                return copyOfRange.length == 0 ? g8n.b : new e8n(copyOfRange);
            }
        }
        if (z <= 0) {
            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.m8n
    public final int t() {
        return z();
    }

    @Override // defpackage.m8n
    public final int u() {
        return z();
    }

    @Override // defpackage.m8n
    public final int v() {
        return C();
    }

    @Override // defpackage.m8n
    public final long w() {
        return D();
    }

    @Override // defpackage.m8n
    public final int x() {
        return m8n.e(z());
    }

    @Override // defpackage.m8n
    public final long y() {
        return m8n.f(A());
    }

    public final int z() {
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
        return (int) B();
    }
}
