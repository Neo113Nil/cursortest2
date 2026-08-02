package com.google.android.gms.internal.fido;

import defpackage.a70;
import defpackage.ba2;
import defpackage.dmi;
import defpackage.is8;
import defpackage.ljg;
import defpackage.vxd;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzhs implements Closeable {
    public final InputStream a;
    public zzhr b;
    public final byte[] c = new byte[8];
    public final ba2 d = new ba2(2);

    public zzhs(InputStream inputStream) {
        this.a = inputStream;
    }

    public final void C(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.a.read(bArr, i2, i - i2);
            if (read == -1) {
                a70.q();
                return;
            }
            i2 += read;
        }
        this.b = null;
    }

    public final byte[] H() {
        p();
        long n = n();
        if (n < 0 || n > 2147483647L) {
            a70.m("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < n) {
            a70.q();
            return null;
        }
        int i = (int) n;
        byte[] bArr = new byte[i];
        C(i, bArr);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.d.b();
    }

    public final long h() {
        t(Byte.MIN_VALUE);
        p();
        long n = n();
        if (n < 0) {
            a70.m("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (n > 0) {
            this.d.a.push(Long.valueOf(n));
        }
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r2 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhr k() {
        ba2 ba2Var = this.d;
        ArrayDeque arrayDeque = ba2Var.a;
        if (this.b == null) {
            int read = this.a.read();
            if (read == -1) {
                ba2Var.b();
                return null;
            }
            zzhr zzhrVar = new zzhr(read);
            this.b = zzhrVar;
            long j = -2;
            byte b = zzhrVar.a;
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            ba2Var.c(-1L);
                        } else {
                            if (b != 96) {
                                a70.r(ljg.j((b >> 5) & 7, "invalid major type: "));
                                return null;
                            }
                            ba2Var.c(-2L);
                        }
                        long d = ba2Var.d();
                        if (d == 1) {
                            arrayDeque.pop();
                        } else if (d > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(d - 1));
                        } else if (d == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (d == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (zzhrVar.b == 31) {
                    long d2 = ba2Var.d();
                    if (d2 >= 0) {
                        is8.e(vxd.l(d2, "expected indefinite length scope but found "));
                        return null;
                    }
                    if (d2 == -5) {
                        is8.e("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                    arrayDeque.pop();
                }
            }
            long d3 = ba2Var.d();
            if (d3 == -1) {
                j = d3;
            }
            is8.e(vxd.l(j, "expected non-string scope but found "));
            return null;
        }
        return this.b;
    }

    public final boolean m() {
        t((byte) -32);
        if (this.b.b > 24) {
            a70.r("expected simple value");
            return false;
        }
        int n = (int) n();
        if (n == 20) {
            return false;
        }
        if (n == 21) {
            return true;
        }
        a70.r("expected FALSE or TRUE");
        return false;
    }

    public final long n() {
        zzhr zzhrVar = this.b;
        byte b = zzhrVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int read = this.a.read();
            if (read != -1) {
                this.b = null;
                return read & 255;
            }
            a70.q();
            return 0L;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            C(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b == 26) {
            C(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b != 27) {
            is8.e(dmi.k(b, (zzhrVar.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        C(8, bArr);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (bArr[7] & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void p() {
        k();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        a70.r(ljg.j(b, "expected definite length but found "));
    }

    public final void t(byte b) {
        k();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        a70.r(dmi.k((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }

    public final long zzb() {
        boolean z;
        k();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                a70.r(ljg.j((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long n = n();
        if (n >= 0) {
            return z ? n : ~n;
        }
        a70.m("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long zzc() {
        t((byte) -96);
        p();
        long n = n();
        if (n < 0 || n > 4611686018427387903L) {
            a70.m("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (n > 0) {
            this.d.a.push(Long.valueOf(n + n));
        }
        return n;
    }
}
