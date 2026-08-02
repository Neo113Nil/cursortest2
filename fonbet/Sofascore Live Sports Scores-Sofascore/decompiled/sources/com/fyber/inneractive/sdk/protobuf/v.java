package com.fyber.inneractive.sdk.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.zzl;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v extends w {
    public final ByteBuffer e;
    public final long f;
    public long g;
    public long h;
    public final long i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public v(ByteBuffer byteBuffer, boolean z) {
        this.e = byteBuffer;
        long j = x3.c.a.getLong(byteBuffer, x3.g);
        this.f = j;
        this.g = byteBuffer.limit() + j;
        long position = j + byteBuffer.position();
        this.h = position;
        this.i = position;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) {
        int m = m();
        if (this.a >= this.b) {
            zzl.j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
            return;
        }
        int d = d(m);
        this.a++;
        ((t0) c2Var).a(this, h0Var);
        a(0);
        this.a--;
        this.l = d;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.h - this.i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.h == this.g;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i) {
        if (i < 0) {
            zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + ((int) (this.h - this.i));
        int i3 = this.l;
        if (i2 > i3) {
            zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.l = i2;
        z();
        return i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i) {
        int t;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.g - this.h)) >= 10) {
                while (i3 < 10) {
                    long j = this.h;
                    this.h = j + 1;
                    if (x3.c.a(j) < 0) {
                        i3++;
                    }
                }
                zzl.j("CodedInputStream encountered a malformed varint.");
                return false;
            }
            while (i3 < 10) {
                long j2 = this.h;
                if (j2 == this.g) {
                    zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return false;
                }
                this.h = j2 + 1;
                if (x3.c.a(j2) < 0) {
                    i3++;
                }
            }
            zzl.j("CodedInputStream encountered a malformed varint.");
            return false;
            return true;
        }
        if (i2 == 1) {
            f(8);
            return true;
        }
        if (i2 == 2) {
            f(m());
            return true;
        }
        if (i2 == 3) {
            do {
                t = t();
                if (t == 0) {
                    break;
                }
            } while (e(t));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 == 5) {
            f(4);
            return true;
        }
        zzl.o();
        return false;
    }

    public final void f(int i) {
        if (i >= 0) {
            long j = this.g;
            long j2 = this.h;
            if (i <= ((int) (j - j2))) {
                this.h = j2 + i;
                return;
            }
        }
        if (i < 0) {
            zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int m() {
        int i;
        long j = this.h;
        if (this.g != j) {
            long j2 = j + 1;
            w3 w3Var = x3.c;
            byte a = w3Var.a(j);
            if (a >= 0) {
                this.h = j2;
                return a;
            }
            if (this.g - j2 >= 9) {
                long j3 = 2 + j;
                int a2 = (w3Var.a(j2) << 7) ^ a;
                if (a2 < 0) {
                    i = a2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int a3 = a2 ^ (w3Var.a(j3) << 14);
                    if (a3 >= 0) {
                        i = a3 ^ 16256;
                        j3 = j4;
                    } else {
                        j3 = 4 + j;
                        int a4 = a3 ^ (w3Var.a(j4) << 21);
                        if (a4 < 0) {
                            i = (-2080896) ^ a4;
                        } else {
                            long j5 = 5 + j;
                            byte a5 = w3Var.a(j3);
                            int i2 = (a4 ^ (a5 << 28)) ^ 266354560;
                            if (a5 < 0) {
                                j3 = 6 + j;
                                if (w3Var.a(j5) < 0) {
                                    j5 = 7 + j;
                                    if (w3Var.a(j3) < 0) {
                                        j3 = 8 + j;
                                        if (w3Var.a(j5) < 0) {
                                            long j6 = 9 + j;
                                            if (w3Var.a(j3) < 0) {
                                                long j7 = j + 10;
                                                if (w3Var.a(j6) >= 0) {
                                                    j3 = j7;
                                                }
                                            } else {
                                                j3 = j6;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            j3 = j5;
                            i = i2;
                        }
                    }
                }
                this.h = j3;
                return i;
            }
        }
        long j8 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            long j9 = this.h;
            if (j9 == this.g) {
                zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            this.h = j9 + 1;
            j8 |= (r6 & Byte.MAX_VALUE) << i3;
            if ((x3.c.a(j9) & 128) == 0) {
                return (int) j8;
            }
        }
        zzl.j("CodedInputStream encountered a malformed varint.");
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() {
        int m = m();
        if (m > 0) {
            long j = this.g;
            long j2 = this.h;
            if (m <= ((int) (j - j2))) {
                byte[] bArr = new byte[m];
                long j3 = m;
                x3.c.a(j2, bArr, j3);
                String str = new String(bArr, l1.a);
                this.h += j3;
                return str;
            }
        }
        if (m == 0) {
            return "";
        }
        if (m < 0) {
            zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() {
        int m = m();
        if (m > 0) {
            long j = this.g;
            long j2 = this.h;
            if (m <= ((int) (j - j2))) {
                int i = (int) (j2 - this.f);
                ByteBuffer byteBuffer = this.e;
                z3 z3Var = d4.a;
                z3Var.getClass();
                String a = byteBuffer.hasArray() ? z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i, m) : byteBuffer.isDirect() ? z3Var.b(byteBuffer, i, m) : z3.a(byteBuffer, i, m);
                this.h += m;
                return a;
            }
        }
        if (m == 0) {
            return "";
        }
        if (m <= 0) {
            zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() {
        if (c()) {
            this.k = 0;
            return 0;
        }
        int m = m();
        this.k = m;
        if ((m >>> 3) != 0) {
            return m;
        }
        zzl.j("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    public final int w() {
        long j = this.h;
        if (this.g - j < 4) {
            zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.h = 4 + j;
        w3 w3Var = x3.c;
        return ((w3Var.a(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (w3Var.a(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((w3Var.a(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((w3Var.a(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long x() {
        long j = this.h;
        if (this.g - j < 8) {
            zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.h = 8 + j;
        w3 w3Var = x3.c;
        return ((w3Var.a(j + 7) & 255) << 56) | (w3Var.a(j) & 255) | ((w3Var.a(1 + j) & 255) << 8) | ((w3Var.a(2 + j) & 255) << 16) | ((w3Var.a(3 + j) & 255) << 24) | ((w3Var.a(4 + j) & 255) << 32) | ((w3Var.a(5 + j) & 255) << 40) | ((w3Var.a(6 + j) & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y() {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        long j4 = this.h;
        if (this.g != j4) {
            long j5 = j4 + 1;
            w3 w3Var = x3.c;
            byte a = w3Var.a(j4);
            if (a >= 0) {
                this.h = j5;
                return a;
            }
            if (this.g - j5 >= 9) {
                long j6 = 2 + j4;
                int a2 = (w3Var.a(j5) << 7) ^ a;
                if (a2 >= 0) {
                    long j7 = 3 + j4;
                    int a3 = a2 ^ (w3Var.a(j6) << 14);
                    if (a3 >= 0) {
                        j2 = a3 ^ 16256;
                        j6 = j7;
                    } else {
                        j6 = 4 + j4;
                        int a4 = a3 ^ (w3Var.a(j7) << 21);
                        if (a4 < 0) {
                            i = (-2080896) ^ a4;
                        } else {
                            j = 1;
                            long j8 = j4 + 5;
                            long a5 = a4 ^ (w3Var.a(j6) << 28);
                            if (a5 >= 0) {
                                j2 = 266354560 ^ a5;
                                j6 = j8;
                            } else {
                                j6 = j4 + 6;
                                long a6 = (w3Var.a(j8) << 35) ^ a5;
                                if (a6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    long j9 = 7 + j4;
                                    long a7 = a6 ^ (w3Var.a(j6) << 42);
                                    if (a7 >= 0) {
                                        j2 = 4363953127296L ^ a7;
                                        j6 = j9;
                                    } else {
                                        j6 = j4 + 8;
                                        a6 = a7 ^ (w3Var.a(j9) << 49);
                                        if (a6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            long j10 = 9 + j4;
                                            long a8 = (a6 ^ (w3Var.a(j6) << 56)) ^ 71499008037633920L;
                                            if (a8 < 0) {
                                                long j11 = j4 + 10;
                                                if (w3Var.a(j10) >= 0) {
                                                    j6 = j11;
                                                }
                                                long j12 = 0;
                                                for (i2 = 0; i2 < 64; i2 += 7) {
                                                    long j13 = this.h;
                                                    if (j13 == this.g) {
                                                        zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0L;
                                                    }
                                                    this.h = j13 + j;
                                                    j12 |= (r4 & Byte.MAX_VALUE) << i2;
                                                    if ((x3.c.a(j13) & 128) == 0) {
                                                        return j12;
                                                    }
                                                }
                                                zzl.j("CodedInputStream encountered a malformed varint.");
                                                return 0L;
                                            }
                                            j6 = j10;
                                            j2 = a8;
                                        }
                                    }
                                }
                                j2 = j3 ^ a6;
                            }
                        }
                    }
                    this.h = j6;
                    return j2;
                }
                i = a2 ^ (-128);
                j2 = i;
                this.h = j6;
                return j2;
            }
        }
        j = 1;
        long j122 = 0;
        while (i2 < 64) {
        }
        zzl.j("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final void z() {
        long j = this.g + this.j;
        this.g = j;
        int i = (int) (j - this.i);
        int i2 = this.l;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.g = j - i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i) {
        this.l = i;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i, c2 c2Var, h0 h0Var) {
        int i2 = this.a;
        if (i2 < this.b) {
            this.a = i2 + 1;
            ((t0) c2Var).a(this, h0Var);
            a((i << 3) | 4);
            this.a--;
            return;
        }
        zzl.j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i) {
        if (this.k == i) {
            return;
        }
        zzl.j("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i = this.l;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - ((int) (this.h - this.i));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() {
        int m = m();
        if (m > 0) {
            long j = this.g;
            long j2 = this.h;
            if (m <= ((int) (j - j2))) {
                byte[] bArr = new byte[m];
                long j3 = m;
                x3.c.a(j2, bArr, j3);
                this.h += j3;
                q qVar = s.b;
                return new q(bArr);
            }
        }
        if (m == 0) {
            return s.b;
        }
        if (m < 0) {
            zzl.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        zzl.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }
}
