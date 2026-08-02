package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x52 implements l62, k62, Cloneable, ByteChannel {
    public b1h a;
    public long b;

    public final String B0(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            ogj.h(vxd.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            a70.q();
            return null;
        }
        if (j == 0) {
            return "";
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        int i = b1hVar.b;
        if (i + j > b1hVar.c) {
            return new String(j0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(b1hVar.a, i, i2, charset);
        int i3 = b1hVar.b + i2;
        b1hVar.b = i3;
        this.b -= j;
        if (i3 == b1hVar.c) {
            this.a = b1hVar.a();
            o1h.a(b1hVar);
        }
        return str;
    }

    public final long C(byte b, long j, long j2) {
        b1h b1hVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            fn0.t(j3, " fromIndex=", " toIndex=", sb);
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (b1hVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                b1hVar = b1hVar.g;
                b1hVar.getClass();
                j6 -= b1hVar.c - b1hVar.b;
            }
            while (j6 < j4) {
                byte[] bArr = b1hVar.a;
                long j8 = j7;
                int min = (int) Math.min(b1hVar.c, (b1hVar.b + j4) - j6);
                for (int i = (int) ((b1hVar.b + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - b1hVar.b) + j6;
                    }
                }
                j6 += b1hVar.c - b1hVar.b;
                b1hVar = b1hVar.f;
                b1hVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (b1hVar.c - b1hVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = b1hVar.a;
            int min2 = (int) Math.min(b1hVar.c, (b1hVar.b + j4) - j5);
            for (int i2 = (int) ((b1hVar.b + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - b1hVar.b) + j5;
                }
            }
            j5 += b1hVar.c - b1hVar.b;
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // defpackage.l62
    public final String C0(Charset charset) {
        charset.getClass();
        return B0(this.b, charset);
    }

    public final String E0() {
        return B0(this.b, Charsets.UTF_8);
    }

    @Override // defpackage.k62
    public final /* bridge */ /* synthetic */ k62 G(long j) {
        c1(j);
        return this;
    }

    @Override // defpackage.l62
    public final gc2 G0() {
        return l0(this.b);
    }

    public final int H0() {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            a70.q();
            return 0;
        }
        byte t = t(0L);
        if ((t & 128) == 0) {
            i = t & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((t & 224) == 192) {
            i = t & 31;
            i2 = 2;
            i3 = 128;
        } else if ((t & 240) == 224) {
            i = t & 15;
            i2 = 3;
            i3 = a.o;
        } else {
            if ((t & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = t & 7;
            i2 = 4;
            i3 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder t2 = lnb.t(i2, "size < ", ": ");
            t2.append(this.b);
            t2.append(" (to read code point prefixed 0x");
            t2.append(yqo.L(t));
            t2.append(')');
            throw new EOFException(t2.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte t3 = t(j2);
            if ((t3 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (t3 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.l62
    public final boolean I(long j, gc2 gc2Var) {
        gc2Var.getClass();
        return g0(j, gc2Var, gc2Var.h());
    }

    public final gc2 I0() {
        long j = this.b;
        if (j <= 2147483647L) {
            return P0((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.l62
    public final String K() {
        long C = C((byte) 10, 0L, Long.MAX_VALUE);
        if (C != -1) {
            return e.c(this, C);
        }
        long j = this.b;
        if (j != 0) {
            return B0(j, Charsets.UTF_8);
        }
        return null;
    }

    @Override // defpackage.l62
    public final int K0() {
        return yqo.I(readInt());
    }

    @Override // defpackage.k62
    public final long M0(cwh cwhVar) {
        cwhVar.getClass();
        long j = 0;
        while (true) {
            long read = cwhVar.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final gc2 P0(int i) {
        if (i == 0) {
            return gc2.d;
        }
        yqo.x(this.b, 0L, i);
        b1h b1hVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            b1hVar.getClass();
            int i5 = b1hVar.c;
            int i6 = b1hVar.b;
            if (i5 == i6) {
                a70.j("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            b1hVar = b1hVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        b1h b1hVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            b1hVar2.getClass();
            bArr[i7] = b1hVar2.a;
            i2 += b1hVar2.c - b1hVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = b1hVar2.b;
            b1hVar2.d = true;
            i7++;
            b1hVar2 = b1hVar2.f;
        }
        return new a2h(bArr, iArr);
    }

    public final b1h Q0(int i) {
        if (i < 1 || i > 8192) {
            a70.p("unexpected capacity");
            return null;
        }
        b1h b1hVar = this.a;
        if (b1hVar == null) {
            b1h b = o1h.b();
            this.a = b;
            b.g = b;
            b.f = b;
            return b;
        }
        b1h b1hVar2 = b1hVar.g;
        b1hVar2.getClass();
        if (b1hVar2.c + i <= 8192 && b1hVar2.e) {
            return b1hVar2;
        }
        b1h b2 = o1h.b();
        b1hVar2.b(b2);
        return b2;
    }

    @Override // defpackage.l62
    public final long R(long j, gc2 gc2Var) {
        gc2Var.getClass();
        byte[] bArr = e.a;
        return e.a(this, gc2Var, 0L, j, gc2Var.h());
    }

    @Override // defpackage.k62
    public final /* bridge */ /* synthetic */ k62 R0(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.k62
    public final /* bridge */ /* synthetic */ k62 S(String str) {
        g1(str);
        return this;
    }

    @Override // defpackage.ejh
    public final void W(x52 x52Var, long j) {
        b1h b;
        x52Var.getClass();
        if (x52Var == this) {
            a70.p("source == this");
            return;
        }
        yqo.x(x52Var.b, 0L, j);
        while (j > 0) {
            b1h b1hVar = x52Var.a;
            b1hVar.getClass();
            int i = b1hVar.c;
            b1h b1hVar2 = x52Var.a;
            b1hVar2.getClass();
            long j2 = i - b1hVar2.b;
            int i2 = 0;
            if (j < j2) {
                b1h b1hVar3 = this.a;
                b1h b1hVar4 = b1hVar3 != null ? b1hVar3.g : null;
                if (b1hVar4 != null && b1hVar4.e) {
                    if ((b1hVar4.c + j) - (b1hVar4.d ? 0 : b1hVar4.b) <= 8192) {
                        b1h b1hVar5 = x52Var.a;
                        b1hVar5.getClass();
                        b1hVar5.d(b1hVar4, (int) j);
                        x52Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                b1h b1hVar6 = x52Var.a;
                b1hVar6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > b1hVar6.c - b1hVar6.b) {
                    a70.p("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = b1hVar6.c();
                } else {
                    b = o1h.b();
                    byte[] bArr = b1hVar6.a;
                    byte[] bArr2 = b.a;
                    int i4 = b1hVar6.b;
                    mh0.f(bArr, 0, i4, bArr2, i4 + i3);
                }
                b.c = b.b + i3;
                b1hVar6.b += i3;
                b1h b1hVar7 = b1hVar6.g;
                b1hVar7.getClass();
                b1hVar7.b(b);
                x52Var.a = b;
            }
            b1h b1hVar8 = x52Var.a;
            b1hVar8.getClass();
            long j3 = b1hVar8.c - b1hVar8.b;
            x52Var.a = b1hVar8.a();
            b1h b1hVar9 = this.a;
            if (b1hVar9 == null) {
                this.a = b1hVar8;
                b1hVar8.g = b1hVar8;
                b1hVar8.f = b1hVar8;
            } else {
                b1h b1hVar10 = b1hVar9.g;
                b1hVar10.getClass();
                b1hVar10.b(b1hVar8);
                b1h b1hVar11 = b1hVar8.g;
                if (b1hVar11 == b1hVar8) {
                    a70.r("cannot compact");
                    return;
                }
                b1hVar11.getClass();
                if (b1hVar11.e) {
                    int i5 = b1hVar8.c - b1hVar8.b;
                    b1h b1hVar12 = b1hVar8.g;
                    b1hVar12.getClass();
                    int i6 = 8192 - b1hVar12.c;
                    b1h b1hVar13 = b1hVar8.g;
                    b1hVar13.getClass();
                    if (!b1hVar13.d) {
                        b1h b1hVar14 = b1hVar8.g;
                        b1hVar14.getClass();
                        i2 = b1hVar14.b;
                    }
                    if (i5 <= i6 + i2) {
                        b1h b1hVar15 = b1hVar8.g;
                        b1hVar15.getClass();
                        b1hVar8.d(b1hVar15, i5);
                        b1hVar8.a();
                        o1h.a(b1hVar8);
                    }
                }
            }
            x52Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.l62
    public final InputStream W0() {
        return new oy1(this, 1);
    }

    public final void X0(gc2 gc2Var) {
        gc2Var.getClass();
        gc2Var.x(this, gc2Var.h());
    }

    public final void Y0(int i) {
        b1h Q0 = Q0(1);
        byte[] bArr = Q0.a;
        int i2 = Q0.c;
        Q0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void Z0(long j) {
        boolean z;
        if (j == 0) {
            Y0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                g1("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = e.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > e.b[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        b1h Q0 = Q0(i);
        byte[] bArr2 = Q0.a;
        int i2 = Q0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = e.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        Q0.c += i;
        this.b += i;
    }

    public final void a1(long j) {
        if (j == 0) {
            Y0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        b1h Q0 = Q0(i);
        byte[] bArr = Q0.a;
        int i2 = Q0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = e.a[(int) (15 & j)];
            j >>>= 4;
        }
        Q0.c += i;
        this.b += i;
    }

    @Override // defpackage.l62
    public final long b0() {
        long j;
        if (this.b < 8) {
            a70.q();
            return 0L;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        int i = b1hVar.b;
        int i2 = b1hVar.c;
        if (i2 - i < 8) {
            j = ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        } else {
            byte[] bArr = b1hVar.a;
            int i3 = i + 7;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (bArr[i3] & 255);
            this.b -= 8;
            if (i4 == i2) {
                this.a = b1hVar.a();
                o1h.a(b1hVar);
            } else {
                b1hVar.b = i4;
            }
            j = j3;
        }
        return yqo.J(j);
    }

    public final void b1(int i) {
        b1h Q0 = Q0(4);
        byte[] bArr = Q0.a;
        int i2 = Q0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        Q0.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.l62
    public final int c0(wvd wvdVar) {
        wvdVar.getClass();
        int d = e.d(this, wvdVar, false);
        if (d == -1) {
            return -1;
        }
        skip(wvdVar.a[d].h());
        return d;
    }

    public final void c1(long j) {
        long J = yqo.J(j);
        b1h Q0 = Q0(8);
        byte[] bArr = Q0.a;
        int i = Q0.c;
        bArr[i] = (byte) ((J >>> 56) & 255);
        bArr[i + 1] = (byte) ((J >>> 48) & 255);
        bArr[i + 2] = (byte) ((J >>> 40) & 255);
        bArr[i + 3] = (byte) ((J >>> 32) & 255);
        bArr[i + 4] = (byte) ((J >>> 24) & 255);
        bArr[i + 5] = (byte) ((J >>> 16) & 255);
        bArr[i + 6] = (byte) ((J >>> 8) & 255);
        bArr[i + 7] = (byte) (J & 255);
        Q0.c = i + 8;
        this.b += 8;
    }

    public final Object clone() {
        return n();
    }

    public final void d1(int i) {
        b1h Q0 = Q0(2);
        byte[] bArr = Q0.a;
        int i2 = Q0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        Q0.c = i2 + 2;
        this.b += 2;
    }

    public final long e0(long j, gc2 gc2Var) {
        gc2Var.getClass();
        long j2 = 0;
        if (j < 0) {
            ogj.h(vxd.l(j, "fromIndex < 0: "));
            return 0L;
        }
        b1h b1hVar = this.a;
        if (b1hVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                b1hVar = b1hVar.g;
                b1hVar.getClass();
                j3 -= b1hVar.c - b1hVar.b;
            }
            if (gc2Var.h() == 2) {
                byte m = gc2Var.m(0);
                byte m2 = gc2Var.m(1);
                while (j3 < this.b) {
                    byte[] bArr = b1hVar.a;
                    int i = b1hVar.c;
                    for (int i2 = (int) ((b1hVar.b + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == m || b == m2) {
                            return (i2 - b1hVar.b) + j3;
                        }
                    }
                    j3 += b1hVar.c - b1hVar.b;
                    b1hVar = b1hVar.f;
                    b1hVar.getClass();
                    j = j3;
                }
            } else {
                byte[] l = gc2Var.l();
                while (j3 < this.b) {
                    byte[] bArr2 = b1hVar.a;
                    int i3 = b1hVar.c;
                    for (int i4 = (int) ((b1hVar.b + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : l) {
                            if (b2 == b3) {
                                return (i4 - b1hVar.b) + j3;
                            }
                        }
                    }
                    j3 += b1hVar.c - b1hVar.b;
                    b1hVar = b1hVar.f;
                    b1hVar.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (b1hVar.c - b1hVar.b) + j2;
            if (j4 > j) {
                break;
            }
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j2 = j4;
        }
        if (gc2Var.h() == 2) {
            byte m3 = gc2Var.m(0);
            byte m4 = gc2Var.m(1);
            while (j2 < this.b) {
                byte[] bArr3 = b1hVar.a;
                int i5 = b1hVar.c;
                for (int i6 = (int) ((b1hVar.b + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == m3 || b4 == m4) {
                        return (i6 - b1hVar.b) + j2;
                    }
                }
                j2 += b1hVar.c - b1hVar.b;
                b1hVar = b1hVar.f;
                b1hVar.getClass();
                j = j2;
            }
        } else {
            byte[] l2 = gc2Var.l();
            while (j2 < this.b) {
                byte[] bArr4 = b1hVar.a;
                int i7 = b1hVar.c;
                for (int i8 = (int) ((b1hVar.b + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : l2) {
                        if (b5 == b6) {
                            return (i8 - b1hVar.b) + j2;
                        }
                    }
                }
                j2 += b1hVar.c - b1hVar.b;
                b1hVar = b1hVar.f;
                b1hVar.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    public final void e1(OutputStream outputStream, long j) {
        outputStream.getClass();
        yqo.x(this.b, 0L, j);
        b1h b1hVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            b1hVar.getClass();
            int min = (int) Math.min(j2, b1hVar.c - b1hVar.b);
            outputStream.write(b1hVar.a, b1hVar.b, min);
            int i = b1hVar.b + min;
            b1hVar.b = i;
            long j3 = min;
            this.b -= j3;
            j2 -= j3;
            if (i == b1hVar.c) {
                b1h a = b1hVar.a();
                this.a = a;
                o1h.a(b1hVar);
                b1hVar = a;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x52)) {
            return false;
        }
        long j = this.b;
        x52 x52Var = (x52) obj;
        if (j != x52Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        b1h b1hVar2 = x52Var.a;
        b1hVar2.getClass();
        int i = b1hVar.b;
        int i2 = b1hVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(b1hVar.c - i, b1hVar2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (b1hVar.a[i] != b1hVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == b1hVar.c) {
                b1hVar = b1hVar.f;
                b1hVar.getClass();
                i = b1hVar.b;
            }
            if (i2 == b1hVar2.c) {
                b1hVar2 = b1hVar2.f;
                b1hVar2.getClass();
                i2 = b1hVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final long f0(gc2 gc2Var) {
        gc2Var.getClass();
        return e0(0L, gc2Var);
    }

    public final void f1(int i, int i2, String str) {
        char charAt;
        str.getClass();
        if (i < 0) {
            ogj.h(ljg.j(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            ogj.h(dmi.k(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            ogj.e(str.length(), lnb.t(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                b1h Q0 = Q0(1);
                byte[] bArr = Q0.a;
                int i3 = Q0.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = Q0.c;
                int i6 = (i3 + i) - i5;
                Q0.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    b1h Q02 = Q0(2);
                    byte[] bArr2 = Q02.a;
                    int i7 = Q02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    Q02.c = i7 + 2;
                    this.b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    b1h Q03 = Q0(3);
                    byte[] bArr3 = Q03.a;
                    int i8 = Q03.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    Q03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        Y0(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        b1h Q04 = Q0(4);
                        byte[] bArr4 = Q04.a;
                        int i11 = Q04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        Q04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final boolean g0(long j, gc2 gc2Var, int i) {
        gc2Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.b && i <= gc2Var.h()) {
            return i == 0 || e.a(this, gc2Var, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void g1(String str) {
        str.getClass();
        f1(0, str.length(), str);
    }

    public final void h1(int i) {
        if (i < 128) {
            Y0(i);
            return;
        }
        if (i < 2048) {
            b1h Q0 = Q0(2);
            byte[] bArr = Q0.a;
            int i2 = Q0.c;
            bArr[i2] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            Q0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Y0(63);
            return;
        }
        if (i < 65536) {
            b1h Q02 = Q0(3);
            byte[] bArr2 = Q02.a;
            int i3 = Q02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            Q02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            a70.p("Unexpected code point: 0x".concat(yqo.M(i)));
            return;
        }
        b1h Q03 = Q0(4);
        byte[] bArr3 = Q03.a;
        int i4 = Q03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        Q03.c = i4 + 4;
        this.b += 4;
    }

    public final int hashCode() {
        b1h b1hVar = this.a;
        if (b1hVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = b1hVar.c;
            for (int i3 = b1hVar.b; i3 < i2; i3++) {
                i = (i * 31) + b1hVar.a[i3];
            }
            b1hVar = b1hVar.f;
            b1hVar.getClass();
        } while (b1hVar != this.a);
        return i;
    }

    @Override // defpackage.k62
    public final /* bridge */ /* synthetic */ k62 i0(gc2 gc2Var) {
        X0(gc2Var);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j0(long j) {
        if (j < 0 || j > 2147483647L) {
            ogj.h(vxd.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            a70.q();
            return null;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read == -1) {
                a70.q();
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public final void k() {
        skip(this.b);
    }

    @Override // defpackage.l62
    public final String k0(long j) {
        return B0(j, Charsets.UTF_8);
    }

    @Override // defpackage.l62
    public final gc2 l0(long j) {
        if (j < 0 || j > 2147483647L) {
            ogj.h(vxd.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            a70.q();
            return null;
        }
        if (j < 4096) {
            return new gc2(j0(j));
        }
        gc2 P0 = P0((int) j);
        skip(j);
        return P0;
    }

    public final long m() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        b1h b1hVar2 = b1hVar.g;
        b1hVar2.getClass();
        return (b1hVar2.c >= 8192 || !b1hVar2.e) ? j : j - (r2 - b1hVar2.b);
    }

    public final x52 n() {
        x52 x52Var = new x52();
        if (this.b == 0) {
            return x52Var;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        b1h c = b1hVar.c();
        x52Var.a = c;
        c.g = c;
        c.f = c;
        for (b1h b1hVar2 = b1hVar.f; b1hVar2 != b1hVar; b1hVar2 = b1hVar2.f) {
            b1h b1hVar3 = c.g;
            b1hVar3.getClass();
            b1hVar2.getClass();
            b1hVar3.b(b1hVar2.c());
        }
        x52Var.b = this.b;
        return x52Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.b - r1;
        r19.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r1 = defpackage.mz1.r(r1, " but was 0x");
        r1.append(defpackage.yqo.L(t(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r3 = r17;
        defpackage.a70.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n0() {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            a70.q();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            b1h b1hVar = this.a;
            b1hVar.getClass();
            byte[] bArr = b1hVar.a;
            int i2 = b1hVar.b;
            int i3 = b1hVar.c;
            while (i2 < i3) {
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + i4;
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            j = j2;
            if (i2 == i3) {
                this.a = b1hVar.a();
                o1h.a(b1hVar);
            } else {
                b1hVar.b = i2;
            }
            if (z2 || this.a == null) {
                break;
            }
            j2 = j;
        }
        x52 x52Var = new x52();
        x52Var.Z0(j3);
        x52Var.Y0(b);
        if (!z) {
            x52Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(x52Var.E0()));
    }

    @Override // defpackage.l62
    public final void o(long j) {
        if (this.b >= j) {
            return;
        }
        a70.q();
    }

    public final void p(x52 x52Var, long j, long j2) {
        x52Var.getClass();
        long j3 = j;
        yqo.x(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        x52Var.b += j2;
        b1h b1hVar = this.a;
        while (true) {
            b1hVar.getClass();
            long j4 = b1hVar.c - b1hVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            b1hVar = b1hVar.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            b1hVar.getClass();
            b1h c = b1hVar.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            b1h b1hVar2 = x52Var.a;
            if (b1hVar2 == null) {
                c.g = c;
                c.f = c;
                x52Var.a = c;
            } else {
                b1h b1hVar3 = b1hVar2.g;
                b1hVar3.getClass();
                b1hVar3.b(c);
            }
            j5 -= c.c - c.b;
            b1hVar = b1hVar.f;
            j3 = 0;
        }
    }

    @Override // defpackage.l62
    public final byte[] q0() {
        return j0(this.b);
    }

    public final void r0(FileInputStream fileInputStream) {
        b1h Q0;
        long j = Long.MAX_VALUE;
        while (true) {
            Q0 = Q0(1);
            int read = fileInputStream.read(Q0.a, Q0.c, (int) Math.min(j, 8192 - Q0.c));
            if (read == -1) {
                break;
            }
            Q0.c += read;
            long j2 = read;
            this.b += j2;
            j -= j2;
        }
        if (Q0.b == Q0.c) {
            this.a = Q0.a();
            o1h.a(Q0);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        yqo.x(bArr.length, i, i2);
        b1h b1hVar = this.a;
        if (b1hVar == null) {
            return -1;
        }
        int min = Math.min(i2, b1hVar.c - b1hVar.b);
        byte[] bArr2 = b1hVar.a;
        int i3 = b1hVar.b;
        mh0.f(bArr2, i, i3, bArr, i3 + min);
        int i4 = b1hVar.b + min;
        b1hVar.b = i4;
        this.b -= min;
        if (i4 == b1hVar.c) {
            this.a = b1hVar.a();
            o1h.a(b1hVar);
        }
        return min;
    }

    @Override // defpackage.l62
    public final byte readByte() {
        if (this.b == 0) {
            a70.q();
            return (byte) 0;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        int i = b1hVar.b;
        int i2 = b1hVar.c;
        int i3 = i + 1;
        byte b = b1hVar.a[i];
        this.b--;
        if (i3 != i2) {
            b1hVar.b = i3;
            return b;
        }
        this.a = b1hVar.a();
        o1h.a(b1hVar);
        return b;
    }

    public final int readInt() {
        if (this.b < 4) {
            a70.q();
            return 0;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        int i = b1hVar.b;
        int i2 = b1hVar.c;
        if (i2 - i < 4) {
            return (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }
        byte[] bArr = b1hVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
        this.b -= 4;
        if (i5 != i2) {
            b1hVar.b = i5;
            return i6;
        }
        this.a = b1hVar.a();
        o1h.a(b1hVar);
        return i6;
    }

    public final short readShort() {
        if (this.b < 2) {
            a70.q();
            return (short) 0;
        }
        b1h b1hVar = this.a;
        b1hVar.getClass();
        int i = b1hVar.b;
        int i2 = b1hVar.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
        }
        byte[] bArr = b1hVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = b1hVar.a();
            o1h.a(b1hVar);
        } else {
            b1hVar.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.l62
    public final boolean request(long j) {
        return this.b >= j;
    }

    @Override // defpackage.l62
    public final void skip(long j) {
        while (j > 0) {
            b1h b1hVar = this.a;
            if (b1hVar == null) {
                a70.q();
                return;
            }
            int min = (int) Math.min(j, b1hVar.c - b1hVar.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = b1hVar.b + min;
            b1hVar.b = i;
            if (i == b1hVar.c) {
                this.a = b1hVar.a();
                o1h.a(b1hVar);
            }
        }
    }

    public final byte t(long j) {
        yqo.x(this.b, j, 1L);
        b1h b1hVar = this.a;
        b1hVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                b1hVar = b1hVar.g;
                b1hVar.getClass();
                j2 -= b1hVar.c - b1hVar.b;
            }
            return b1hVar.a[(int) ((b1hVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = b1hVar.c;
            int i2 = b1hVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return b1hVar.a[(int) ((i2 + j) - j3)];
            }
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.k62
    public final k62 t0(int i) {
        b1(yqo.I(i));
        return this;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return pij.d;
    }

    public final String toString() {
        return I0().toString();
    }

    public final short u0() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.l62
    public final boolean w() {
        return this.b == 0;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        yqo.x(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            b1h Q0 = Q0(1);
            int min = Math.min(i3 - i, 8192 - Q0.c);
            int i4 = i + min;
            mh0.f(bArr, Q0.c, i, Q0.a, i4);
            Q0.c += min;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.k62
    public final /* bridge */ /* synthetic */ k62 writeByte(int i) {
        Y0(i);
        return this;
    }

    @Override // defpackage.l62
    public final long y0(k62 k62Var) {
        long j = this.b;
        if (j > 0) {
            k62Var.W(this, j);
        }
        return j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ejh
    public final void close() {
    }

    @Override // defpackage.k62, defpackage.ejh, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.l62
    public final x52 u() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            b1h Q0 = Q0(1);
            int min = Math.min(i, 8192 - Q0.c);
            byteBuffer.get(Q0.a, Q0.c, min);
            i -= min;
            Q0.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.k62
    public final k62 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        b1h b1hVar = this.a;
        if (b1hVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), b1hVar.c - b1hVar.b);
        byteBuffer.put(b1hVar.a, b1hVar.b, min);
        int i = b1hVar.b + min;
        b1hVar.b = i;
        this.b -= min;
        if (i == b1hVar.c) {
            this.a = b1hVar.a();
            o1h.a(b1hVar);
        }
        return min;
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        x52Var.getClass();
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            x52Var.W(this, j);
            return j;
        }
        ogj.h(vxd.l(j, "byteCount < 0: "));
        return 0L;
    }
}
