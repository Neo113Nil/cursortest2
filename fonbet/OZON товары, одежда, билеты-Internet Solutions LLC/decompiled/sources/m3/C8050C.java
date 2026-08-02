package m3;

import I0.C3173b;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: m3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8050C {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f74261d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f74262e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.common.collect.A<Charset> f74263f;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f74264a;

    /* renamed from: b, reason: collision with root package name */
    private int f74265b;

    /* renamed from: c, reason: collision with root package name */
    private int f74266c;

    static {
        Charset charset = StandardCharsets.US_ASCII;
        Charset charset2 = StandardCharsets.UTF_8;
        Charset charset3 = StandardCharsets.UTF_16;
        Charset charset4 = StandardCharsets.UTF_16BE;
        Charset charset5 = StandardCharsets.UTF_16LE;
        f74263f = com.google.common.collect.A.H();
    }

    public C8050C() {
        this.f74264a = N.f74291c;
    }

    private static int c(int i11, int i12, int i13, int i14) {
        byte b11 = (byte) i13;
        return com.google.common.primitives.b.d((byte) 0, com.google.common.primitives.e.a(((i11 & 7) << 2) | ((i12 & 48) >> 4)), com.google.common.primitives.e.a(((((byte) i12) & 15) << 4) | ((b11 & 60) >> 2)), com.google.common.primitives.e.a(((b11 & 3) << 6) | (((byte) i14) & 63)));
    }

    private static int g(Charset charset) {
        G10.a.b("Unsupported charset: " + charset, f74263f.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean h(byte b11) {
        return (b11 & 192) == 128;
    }

    private char j(int i11, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f74264a;
            int i12 = this.f74265b + i11;
            return Hd.b.c(bArr[i12], bArr[i12 + 1]);
        }
        byte[] bArr2 = this.f74264a;
        int i13 = this.f74265b + i11;
        return Hd.b.c(bArr2[i13 + 1], bArr2[i13]);
    }

    private int l(Charset charset) {
        int i11;
        int i12;
        G10.a.b("Unsupported charset: " + charset, f74263f.contains(charset));
        if (a() < g(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f74265b + ", limit=" + this.f74266c);
        }
        int i13 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b11 = this.f74264a[this.f74265b];
            if ((b11 & 128) == 0) {
                i11 = b11 & 255;
                return (i11 << 8) | i13;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b12 = this.f74264a[this.f74265b];
            int i14 = (b12 & 128) == 0 ? 1 : ((b12 & 224) == 192 && a() >= 2 && h(this.f74264a[this.f74265b + 1])) ? 2 : ((this.f74264a[this.f74265b] & 240) == 224 && a() >= 3 && h(this.f74264a[this.f74265b + 1]) && h(this.f74264a[this.f74265b + 2])) ? 3 : ((this.f74264a[this.f74265b] & 248) == 240 && a() >= 4 && h(this.f74264a[this.f74265b + 1]) && h(this.f74264a[this.f74265b + 2]) && h(this.f74264a[this.f74265b + 3])) ? 4 : 0;
            if (i14 == 1) {
                i12 = this.f74264a[this.f74265b] & 255;
            } else if (i14 == 2) {
                byte[] bArr = this.f74264a;
                int i15 = this.f74265b;
                i12 = c(0, 0, bArr[i15], bArr[i15 + 1]);
            } else {
                if (i14 != 3) {
                    if (i14 == 4) {
                        byte[] bArr2 = this.f74264a;
                        int i16 = this.f74265b;
                        i12 = c(bArr2[i16], bArr2[i16 + 1], bArr2[i16 + 2], bArr2[i16 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.f74264a;
                int i17 = this.f74265b;
                i12 = c(0, bArr3[i17] & 15, bArr3[i17 + 1], bArr3[i17 + 2]);
            }
            i13 = i14;
            i11 = i12;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char j11 = j(0, byteOrder);
            if (!Character.isHighSurrogate(j11) || a() < 4) {
                i11 = j11;
                i13 = 2;
            } else {
                i11 = Character.toCodePoint(j11, j(2, byteOrder));
                i13 = 4;
            }
        }
        return (i11 << 8) | i13;
    }

    private char o(Charset charset, char[] cArr) {
        int l11;
        if (a() < g(charset) || (l11 = l(charset)) == 0) {
            return (char) 0;
        }
        int a11 = com.google.common.primitives.f.a(l11 >>> 8);
        if (Character.isSupplementaryCodePoint(a11)) {
            return (char) 0;
        }
        char a12 = Hd.b.a(a11);
        if (!Hd.b.b(cArr, a12)) {
            return (char) 0;
        }
        this.f74265b = com.google.common.primitives.b.c(l11 & 255) + this.f74265b;
        return a12;
    }

    public final String A(int i11) {
        if (i11 == 0) {
            return "";
        }
        int i12 = this.f74265b;
        int i13 = (i12 + i11) - 1;
        int i14 = (i13 >= this.f74266c || this.f74264a[i13] != 0) ? i11 : i11 - 1;
        byte[] bArr = this.f74264a;
        int i15 = N.f74289a;
        String str = new String(bArr, i12, i14, StandardCharsets.UTF_8);
        this.f74265b += i11;
        return str;
    }

    public final short B() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f74265b = i11 + 2;
        return (short) ((bArr[i12] & 255) | i13);
    }

    public final String C(int i11, Charset charset) {
        String str = new String(this.f74264a, this.f74265b, i11, charset);
        this.f74265b += i11;
        return str;
    }

    public final int D() {
        return (E() << 21) | (E() << 14) | (E() << 7) | E();
    }

    public final int E() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        this.f74265b = i11 + 1;
        return bArr[i11] & 255;
    }

    public final int F() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f74265b = i11 + 2;
        int i14 = (bArr[i12] & 255) | i13;
        this.f74265b = i11 + 4;
        return i14;
    }

    public final long G() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        this.f74265b = i11 + 1;
        this.f74265b = i11 + 2;
        this.f74265b = i11 + 3;
        long j11 = ((bArr[i11] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f74265b = i11 + 4;
        return (bArr[r4] & 255) | j11;
    }

    public final int H() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = (bArr[i11] & 255) << 16;
        int i14 = i11 + 2;
        this.f74265b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f74265b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public final int I() {
        int p11 = p();
        if (p11 >= 0) {
            return p11;
        }
        throw new IllegalStateException(Ej.b.a(p11, "Top bit not zero: "));
    }

    public final int J() {
        long j11 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            if (this.f74265b == this.f74266c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long E11 = E();
            j11 |= (127 & E11) << (i11 * 7);
            if ((E11 & 128) == 0) {
                break;
            }
        }
        return com.google.common.primitives.b.c(j11);
    }

    public final long K() {
        long y11 = y();
        if (y11 >= 0) {
            return y11;
        }
        throw new IllegalStateException(C3173b.b(y11, "Top bit not zero: "));
    }

    public final int L() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f74265b = i11 + 2;
        return (bArr[i12] & 255) | i13;
    }

    public final long M() {
        int i11;
        int i12;
        long j11 = this.f74264a[this.f74265b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j11) != 0) {
                i13--;
            } else if (i13 < 6) {
                j11 &= r6 - 1;
                i12 = 7 - i13;
            } else if (i13 == 7) {
                i12 = 1;
            }
        }
        i12 = 0;
        if (i12 == 0) {
            throw new NumberFormatException(C3173b.b(j11, "Invalid UTF-8 sequence first byte: "));
        }
        for (i11 = 1; i11 < i12; i11++) {
            if ((this.f74264a[this.f74265b + i11] & 192) != 128) {
                throw new NumberFormatException(C3173b.b(j11, "Invalid UTF-8 sequence continuation byte: "));
            }
            j11 = (j11 << 6) | (r3 & 63);
        }
        this.f74265b += i12;
        return j11;
    }

    public final Charset N() {
        if (a() >= 3) {
            byte[] bArr = this.f74264a;
            int i11 = this.f74265b;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f74265b = i11 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f74264a;
        int i12 = this.f74265b;
        byte b11 = bArr2[i12];
        if (b11 == -2 && bArr2[i12 + 1] == -1) {
            this.f74265b = i12 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b11 != -1 || bArr2[i12 + 1] != -2) {
            return null;
        }
        this.f74265b = i12 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void O(int i11) {
        byte[] bArr = this.f74264a;
        if (bArr.length < i11) {
            bArr = new byte[i11];
        }
        P(i11, bArr);
    }

    public final void P(int i11, byte[] bArr) {
        this.f74264a = bArr;
        this.f74266c = i11;
        this.f74265b = 0;
    }

    public final void Q(int i11) {
        G10.a.c(i11 >= 0 && i11 <= this.f74264a.length);
        this.f74266c = i11;
    }

    public final void R(int i11) {
        G10.a.c(i11 >= 0 && i11 <= this.f74266c);
        this.f74265b = i11;
    }

    public final void S(int i11) {
        R(this.f74265b + i11);
    }

    public final int a() {
        return Math.max(this.f74266c - this.f74265b, 0);
    }

    public final int b() {
        return this.f74264a.length;
    }

    public final void d(int i11) {
        byte[] bArr = this.f74264a;
        if (i11 > bArr.length) {
            this.f74264a = Arrays.copyOf(bArr, i11);
        }
    }

    public final byte[] e() {
        return this.f74264a;
    }

    public final int f() {
        return this.f74265b;
    }

    public final int i() {
        return this.f74266c;
    }

    public final int k(Charset charset) {
        if (l(charset) != 0) {
            return com.google.common.primitives.b.c(r3 >>> 8);
        }
        return 1114112;
    }

    public final int m() {
        return this.f74264a[this.f74265b] & 255;
    }

    public final void n(int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f74264a, this.f74265b, bArr, i11, i12);
        this.f74265b += i12;
    }

    public final int p() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.f74265b = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.f74265b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.f74265b = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    public final int q() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = ((bArr[i11] & 255) << 24) >> 8;
        int i14 = i11 + 2;
        this.f74265b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f74265b = i11 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public final String r(Charset charset) {
        int i11;
        G10.a.b("Unsupported charset: " + charset, f74263f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            N();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i11 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i11 = 2;
        }
        int i12 = this.f74265b;
        while (true) {
            int i13 = this.f74266c;
            if (i12 >= i13 - (i11 - 1)) {
                i12 = i13;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && N.O(this.f74264a[i12])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f74264a;
                if (bArr[i12] == 0 && N.O(bArr[i12 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f74264a;
                if (bArr2[i12 + 1] == 0 && N.O(bArr2[i12])) {
                    break;
                }
            }
            i12 += i11;
        }
        String C11 = C(i12 - this.f74265b, charset);
        if (this.f74265b != this.f74266c && o(charset, f74261d) == '\r') {
            o(charset, f74262e);
        }
        return C11;
    }

    public final int s() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = bArr[i11] & 255;
        int i14 = i11 + 2;
        this.f74265b = i14;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        int i16 = i11 + 3;
        this.f74265b = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.f74265b = i11 + 4;
        return ((bArr[i16] & 255) << 24) | i17;
    }

    public final long t() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        this.f74265b = i11 + 1;
        this.f74265b = i11 + 2;
        this.f74265b = i11 + 3;
        long j11 = (bArr[i11] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f74265b = i11 + 4;
        long j12 = j11 | ((bArr[r8] & 255) << 24);
        this.f74265b = i11 + 5;
        long j13 = j12 | ((bArr[r7] & 255) << 32);
        this.f74265b = i11 + 6;
        long j14 = j13 | ((bArr[r8] & 255) << 40);
        this.f74265b = i11 + 7;
        long j15 = j14 | ((bArr[r7] & 255) << 48);
        this.f74265b = i11 + 8;
        return ((bArr[r8] & 255) << 56) | j15;
    }

    public final short u() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = bArr[i11] & 255;
        this.f74265b = i11 + 2;
        return (short) (((bArr[i12] & 255) << 8) | i13);
    }

    public final long v() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        this.f74265b = i11 + 1;
        this.f74265b = i11 + 2;
        this.f74265b = i11 + 3;
        long j11 = (bArr[i11] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f74265b = i11 + 4;
        return ((bArr[r4] & 255) << 24) | j11;
    }

    public final int w() {
        int s11 = s();
        if (s11 >= 0) {
            return s11;
        }
        throw new IllegalStateException(Ej.b.a(s11, "Top bit not zero: "));
    }

    public final int x() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        int i12 = i11 + 1;
        this.f74265b = i12;
        int i13 = bArr[i11] & 255;
        this.f74265b = i11 + 2;
        return ((bArr[i12] & 255) << 8) | i13;
    }

    public final long y() {
        byte[] bArr = this.f74264a;
        int i11 = this.f74265b;
        this.f74265b = i11 + 1;
        this.f74265b = i11 + 2;
        this.f74265b = i11 + 3;
        long j11 = ((bArr[i11] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f74265b = i11 + 4;
        long j12 = j11 | ((bArr[r4] & 255) << 32);
        this.f74265b = i11 + 5;
        long j13 = j12 | ((bArr[r7] & 255) << 24);
        this.f74265b = i11 + 6;
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        this.f74265b = i11 + 7;
        long j15 = j14 | ((bArr[r7] & 255) << 8);
        this.f74265b = i11 + 8;
        return (bArr[r4] & 255) | j15;
    }

    public final String z() {
        if (a() == 0) {
            return null;
        }
        int i11 = this.f74265b;
        while (i11 < this.f74266c && this.f74264a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f74264a;
        int i12 = this.f74265b;
        int i13 = N.f74289a;
        String str = new String(bArr, i12, i11 - i12, StandardCharsets.UTF_8);
        this.f74265b = i11;
        if (i11 < this.f74266c) {
            this.f74265b = i11 + 1;
        }
        return str;
    }

    public C8050C(int i11) {
        this.f74264a = new byte[i11];
        this.f74266c = i11;
    }

    public C8050C(byte[] bArr) {
        this.f74264a = bArr;
        this.f74266c = bArr.length;
    }

    public C8050C(int i11, byte[] bArr) {
        this.f74264a = bArr;
        this.f74266c = i11;
    }
}
