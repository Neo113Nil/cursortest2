package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lof implements l62 {
    public final cwh a;
    public final x52 b;
    public boolean c;

    public lof(cwh cwhVar) {
        cwhVar.getClass();
        this.a = cwhVar;
        this.b = new x52();
    }

    @Override // defpackage.l62
    public final String C0(Charset charset) {
        charset.getClass();
        cwh cwhVar = this.a;
        x52 x52Var = this.b;
        x52Var.M0(cwhVar);
        return x52Var.B0(x52Var.b, charset);
    }

    @Override // defpackage.l62
    public final gc2 G0() {
        cwh cwhVar = this.a;
        x52 x52Var = this.b;
        x52Var.M0(cwhVar);
        return x52Var.l0(x52Var.b);
    }

    @Override // defpackage.l62
    public final boolean I(long j, gc2 gc2Var) {
        gc2Var.getClass();
        int h = gc2Var.h();
        if (!this.c) {
            return h >= 0 && j >= 0 && h <= gc2Var.h() && (h == 0 || pco.A(this, gc2Var, h, j, j + 1) != -1);
        }
        a70.r("closed");
        return false;
    }

    @Override // defpackage.l62
    public final String K() {
        long e = e((byte) 10, 0L, Long.MAX_VALUE);
        x52 x52Var = this.b;
        if (e != -1) {
            return e.c(x52Var, e);
        }
        long j = x52Var.b;
        if (j != 0) {
            return k0(j);
        }
        return null;
    }

    @Override // defpackage.l62
    public final int K0() {
        o(4L);
        return this.b.K0();
    }

    @Override // defpackage.l62
    public final long R(long j, gc2 gc2Var) {
        gc2Var.getClass();
        return pco.A(this, gc2Var, gc2Var.h(), 0L, j);
    }

    @Override // defpackage.l62
    public final InputStream W0() {
        return new oy1(this, 4);
    }

    @Override // defpackage.l62
    public final long b0() {
        o(8L);
        return this.b.b0();
    }

    @Override // defpackage.l62
    public final int c0(wvd wvdVar) {
        wvdVar.getClass();
        if (this.c) {
            a70.r("closed");
            return 0;
        }
        while (true) {
            x52 x52Var = this.b;
            int d = e.d(x52Var, wvdVar, true);
            if (d != -2) {
                if (d != -1) {
                    x52Var.skip(wvdVar.a[d].h());
                    return d;
                }
            } else if (this.a.read(x52Var, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.k();
    }

    public final long e(byte b, long j, long j2) {
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        if (0 > j2) {
            ogj.h(vxd.l(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            x52 x52Var = this.b;
            byte b2 = b;
            long j4 = j2;
            long C = x52Var.C(b2, j3, j4);
            if (C == -1) {
                long j5 = x52Var.b;
                if (j5 >= j4 || this.a.read(x52Var, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return C;
            }
        }
        return -1L;
    }

    public final long f(gc2 gc2Var) {
        gc2Var.getClass();
        long j = 0;
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        while (true) {
            x52 x52Var = this.b;
            long e0 = x52Var.e0(j, gc2Var);
            if (e0 != -1) {
                return e0;
            }
            long j2 = x52Var.b;
            if (this.a.read(x52Var, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    public final lof h() {
        return new lof(new rce(this));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        r12.b -= r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[LOOP:2: B:23:0x0067->B:31:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        byte b;
        x52 x52Var;
        int i;
        int i2;
        byte t;
        o(1L);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean request = request(i5);
            b = 65;
            x52Var = this.b;
            if (!request) {
                break;
            }
            t = x52Var.t(i4);
            if ((t < 48 || t > 57) && ((t < 97 || t > 102) && (t < 65 || t > 70))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            String num = Integer.toString(t, CharsKt.checkRadix(16));
            num.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j = 0;
        if (x52Var.b == 0) {
            a70.q();
            return 0L;
        }
        boolean z = false;
        long j2 = 0;
        while (true) {
            b1h b1hVar = x52Var.a;
            b1hVar.getClass();
            byte[] bArr = b1hVar.a;
            long j3 = j;
            int i6 = b1hVar.b;
            int i7 = b1hVar.c;
            while (i6 < i7) {
                byte b2 = bArr[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else if (b2 >= b && b2 <= 70) {
                    i = b2 - 55;
                    if ((j2 & (-1152921504606846976L)) == j3) {
                        x52 x52Var2 = new x52();
                        x52Var2.a1(j2);
                        x52Var2.Y0(b2);
                        throw new NumberFormatException("Number too large: ".concat(x52Var2.E0()));
                    }
                    j2 = (j2 << 4) | i;
                    i6++;
                    i3++;
                    b = 65;
                } else {
                    if (i3 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(yqo.L(b2)));
                    }
                    z = true;
                    if (i6 != i7) {
                        x52Var.a = b1hVar.a();
                        o1h.a(b1hVar);
                    } else {
                        b1hVar.b = i6;
                    }
                    if (!!z || x52Var.a == null) {
                        break;
                    }
                    j = j3;
                    b = 65;
                }
                i = i2;
                if ((j2 & (-1152921504606846976L)) == j3) {
                }
            }
            if (i6 != i7) {
            }
            if (!z) {
                break;
            }
            break;
        }
    }

    @Override // defpackage.l62
    public final String k0(long j) {
        o(j);
        return this.b.B0(j, Charsets.UTF_8);
    }

    @Override // defpackage.l62
    public final gc2 l0(long j) {
        o(j);
        return this.b.l0(j);
    }

    public final short m() {
        o(2L);
        return this.b.u0();
    }

    public final String n(long j) {
        if (j < 0) {
            ogj.h(vxd.l(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long e = e((byte) 10, 0L, j2);
        x52 x52Var = this.b;
        if (e != -1) {
            return e.c(x52Var, e);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && x52Var.t(j2 - 1) == 13 && request(j2 + 1) && x52Var.t(j2) == 10) {
            return e.c(x52Var, j2);
        }
        x52 x52Var2 = new x52();
        x52Var.p(x52Var2, 0L, Math.min(32L, x52Var.b));
        a70.k(x52Var2.l0(x52Var2.b).i(), Math.min(x52Var.b, j));
        return null;
    }

    @Override // defpackage.l62
    public final void o(long j) {
        if (request(j)) {
            return;
        }
        a70.q();
    }

    @Override // defpackage.l62
    public final byte[] q0() {
        cwh cwhVar = this.a;
        x52 x52Var = this.b;
        x52Var.M0(cwhVar);
        return x52Var.j0(x52Var.b);
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            a70.r("closed");
            return 0L;
        }
        x52 x52Var2 = this.b;
        if (x52Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.read(x52Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return x52Var2.read(x52Var, Math.min(j, x52Var2.b));
    }

    @Override // defpackage.l62
    public final byte readByte() {
        o(1L);
        return this.b.readByte();
    }

    public final int readInt() {
        o(4L);
        return this.b.readInt();
    }

    public final short readShort() {
        o(2L);
        return this.b.readShort();
    }

    @Override // defpackage.l62
    public final boolean request(long j) {
        x52 x52Var;
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            a70.r("closed");
            return false;
        }
        do {
            x52Var = this.b;
            if (x52Var.b >= j) {
                return true;
            }
        } while (this.a.read(x52Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.l62
    public final void skip(long j) {
        if (this.c) {
            a70.r("closed");
            return;
        }
        while (j > 0) {
            x52 x52Var = this.b;
            if (x52Var.b == 0 && this.a.read(x52Var, 8192L) == -1) {
                a70.q();
                return;
            } else {
                long min = Math.min(j, x52Var.b);
                x52Var.skip(min);
                j -= min;
            }
        }
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.l62
    public final x52 u() {
        return this.b;
    }

    @Override // defpackage.l62
    public final boolean w() {
        if (this.c) {
            a70.r("closed");
            return false;
        }
        x52 x52Var = this.b;
        return x52Var.w() && this.a.read(x52Var, 8192L) == -1;
    }

    @Override // defpackage.l62
    public final long y0(k62 k62Var) {
        x52 x52Var;
        long j = 0;
        while (true) {
            cwh cwhVar = this.a;
            x52Var = this.b;
            if (cwhVar.read(x52Var, 8192L) == -1) {
                break;
            }
            long m = x52Var.m();
            if (m > 0) {
                j += m;
                k62Var.W(x52Var, m);
            }
        }
        long j2 = x52Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        k62Var.W(x52Var, j2);
        return j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        x52 x52Var = this.b;
        if (x52Var.b == 0 && this.a.read(x52Var, 8192L) == -1) {
            return -1;
        }
        return x52Var.read(byteBuffer);
    }
}
