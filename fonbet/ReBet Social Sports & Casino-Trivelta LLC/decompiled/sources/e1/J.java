package e1;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class J {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.common.collect.E f45484c = com.google.common.collect.E.u(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public int f45485a;

    /* renamed from: b, reason: collision with root package name */
    public int f45486b;
    private byte[] data;

    public J() {
        this.data = Z.EMPTY_BYTE_ARRAY;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return com.google.common.primitives.f.i((byte) 0, com.google.common.primitives.i.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), com.google.common.primitives.i.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), com.google.common.primitives.i.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int h(Charset charset) {
        AbstractC4134a.b(f45484c.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean i(byte b10) {
        return (b10 & 192) == 128;
    }

    public long A() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        this.f45485a = i10 + 1;
        this.f45485a = i10 + 2;
        this.f45485a = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f45485a = i10 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.f45485a = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.f45485a = i10 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.f45485a = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.f45485a = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public short B() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f45485a = i10 + 2;
        return (short) (((bArr[i11] & UByte.MAX_VALUE) << 8) | i12);
    }

    public long C() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        this.f45485a = i10 + 1;
        this.f45485a = i10 + 2;
        this.f45485a = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f45485a = i10 + 4;
        return ((bArr[r4] & 255) << 24) | j10;
    }

    public int D() {
        int z10 = z();
        if (z10 >= 0) {
            return z10;
        }
        throw new IllegalStateException("Top bit not zero: " + z10);
    }

    public int E() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f45485a = i10 + 2;
        return ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
    }

    public long F() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        this.f45485a = i10 + 1;
        this.f45485a = i10 + 2;
        this.f45485a = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f45485a = i10 + 4;
        long j11 = j10 | ((bArr[r4] & 255) << 32);
        this.f45485a = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.f45485a = i10 + 6;
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        this.f45485a = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.f45485a = i10 + 8;
        return (bArr[r4] & 255) | j14;
    }

    public String G() {
        return s((char) 0);
    }

    public String H(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f45485a;
        int i12 = (i11 + i10) - 1;
        String I10 = Z.I(this.data, i11, (i12 >= this.f45486b || this.data[i12] != 0) ? i10 : i10 - 1);
        this.f45485a += i10;
        return I10;
    }

    public short I() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f45485a = i10 + 2;
        return (short) ((bArr[i11] & UByte.MAX_VALUE) | i12);
    }

    public String J(int i10) {
        return K(i10, StandardCharsets.UTF_8);
    }

    public String K(int i10, Charset charset) {
        String str = new String(this.data, this.f45485a, i10, charset);
        this.f45485a += i10;
        return str;
    }

    public int L() {
        return (M() << 21) | (M() << 14) | (M() << 7) | M();
    }

    public int M() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        this.f45485a = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    public int N() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f45485a = i10 + 2;
        int i13 = (bArr[i11] & UByte.MAX_VALUE) | i12;
        this.f45485a = i10 + 4;
        return i13;
    }

    public long O() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        this.f45485a = i10 + 1;
        this.f45485a = i10 + 2;
        this.f45485a = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f45485a = i10 + 4;
        return (bArr[r4] & 255) | j10;
    }

    public int P() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 16;
        int i13 = i10 + 2;
        this.f45485a = i13;
        int i14 = ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
        this.f45485a = i10 + 3;
        return (bArr[i13] & UByte.MAX_VALUE) | i14;
    }

    public int Q() {
        int v10 = v();
        if (v10 >= 0) {
            return v10;
        }
        throw new IllegalStateException("Top bit not zero: " + v10);
    }

    public int R() {
        return com.google.common.primitives.f.e(S());
    }

    public long S() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f45485a == this.f45486b) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long M10 = M();
            j10 |= (127 & M10) << (i10 * 7);
            if ((M10 & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long T() {
        long F10 = F();
        if (F10 >= 0) {
            return F10;
        }
        throw new IllegalStateException("Top bit not zero: " + F10);
    }

    public int U() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f45485a = i10 + 2;
        return (bArr[i11] & UByte.MAX_VALUE) | i12;
    }

    public long V() {
        int i10;
        int i11;
        long j10 = this.data[this.f45485a];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.data[this.f45485a + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f45485a += i11;
        return j10;
    }

    public Charset W() {
        if (a() >= 3) {
            byte[] bArr = this.data;
            int i10 = this.f45485a;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f45485a = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i11 = this.f45485a;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f45485a = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f45485a = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void X(int i10) {
        Z(b() < i10 ? new byte[i10] : this.data, i10);
    }

    public void Y(byte[] bArr) {
        Z(bArr, bArr.length);
    }

    public void Z(byte[] bArr, int i10) {
        this.data = bArr;
        this.f45486b = i10;
        this.f45485a = 0;
    }

    public int a() {
        return Math.max(this.f45486b - this.f45485a, 0);
    }

    public void a0(int i10) {
        AbstractC4134a.a(i10 >= 0 && i10 <= this.data.length);
        this.f45486b = i10;
    }

    public int b() {
        return this.data.length;
    }

    public void b0(int i10) {
        AbstractC4134a.a(i10 >= 0 && i10 <= this.f45486b);
        this.f45485a = i10;
    }

    public void c0(int i10) {
        b0(this.f45485a + i10);
    }

    public void d(int i10) {
        if (i10 > b()) {
            this.data = Arrays.copyOf(this.data, i10);
        }
    }

    public void d0() {
        while ((M() & 128) != 0) {
        }
    }

    public final int e(Charset charset) {
        int i10;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f45485a;
        while (true) {
            int i12 = this.f45486b;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && Z.Q0(this.data[i11])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i11] == 0 && Z.Q0(bArr[i11 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.data;
                if (bArr2[i11 + 1] == 0 && Z.Q0(bArr2[i11])) {
                    break;
                }
            }
            i11 += i10;
        }
        return i11;
    }

    public final void e0(Charset charset) {
        if (r(charset, CR_AND_LF) == '\r') {
            r(charset, LF);
        }
    }

    public byte[] f() {
        return this.data;
    }

    public int g() {
        return this.f45485a;
    }

    public int j() {
        return this.f45486b;
    }

    public final char k(ByteOrder byteOrder, int i10) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.data;
            int i11 = this.f45485a;
            return com.google.common.primitives.b.c(bArr[i11 + i10], bArr[i11 + i10 + 1]);
        }
        byte[] bArr2 = this.data;
        int i12 = this.f45485a;
        return com.google.common.primitives.b.c(bArr2[i12 + i10 + 1], bArr2[i12 + i10]);
    }

    public int l(Charset charset) {
        if (m(charset) != 0) {
            return com.google.common.primitives.f.e(r3 >>> 8);
        }
        return 1114112;
    }

    public final int m(Charset charset) {
        int i10;
        int b10;
        AbstractC4134a.b(f45484c.contains(charset), "Unsupported charset: " + charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f45485a + ", limit=" + this.f45486b);
        }
        byte b11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b12 = this.data[this.f45485a];
            if ((b12 & ByteCompanionObject.MIN_VALUE) != 0) {
                return 0;
            }
            i10 = com.google.common.primitives.i.b(b12);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte o10 = o();
            if (o10 == 1) {
                b10 = com.google.common.primitives.i.b(this.data[this.f45485a]);
            } else if (o10 == 2) {
                byte[] bArr = this.data;
                int i11 = this.f45485a;
                b10 = c(0, 0, bArr[i11], bArr[i11 + 1]);
            } else if (o10 == 3) {
                byte[] bArr2 = this.data;
                int i12 = this.f45485a;
                b10 = c(0, bArr2[i12] & 15, bArr2[i12 + 1], bArr2[i12 + 2]);
            } else {
                if (o10 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.data;
                int i13 = this.f45485a;
                b10 = c(bArr3[i13], bArr3[i13 + 1], bArr3[i13 + 2], bArr3[i13 + 3]);
            }
            b11 = o10;
            i10 = b10;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char k10 = k(byteOrder, 0);
            if (!Character.isHighSurrogate(k10) || a() < 4) {
                i10 = k10;
                b11 = 2;
            } else {
                i10 = Character.toCodePoint(k10, k(byteOrder, 2));
                b11 = 4;
            }
        }
        return (i10 << 8) | b11;
    }

    public int n() {
        return this.data[this.f45485a] & UByte.MAX_VALUE;
    }

    public final byte o() {
        byte b10 = this.data[this.f45485a];
        if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
            return (byte) 1;
        }
        if ((b10 & 224) == 192 && a() >= 2 && i(this.data[this.f45485a + 1])) {
            return (byte) 2;
        }
        if ((this.data[this.f45485a] & 240) == 224 && a() >= 3 && i(this.data[this.f45485a + 1]) && i(this.data[this.f45485a + 2])) {
            return (byte) 3;
        }
        return ((this.data[this.f45485a] & 248) == 240 && a() >= 4 && i(this.data[this.f45485a + 1]) && i(this.data[this.f45485a + 2]) && i(this.data[this.f45485a + 3])) ? (byte) 4 : (byte) 0;
    }

    public void p(I i10, int i11) {
        q(i10.data, 0, i11);
        i10.p(0);
    }

    public void q(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.data, this.f45485a, bArr, i10, i11);
        this.f45485a += i11;
    }

    public final char r(Charset charset, char[] cArr) {
        int m10;
        if (a() < h(charset) || (m10 = m(charset)) == 0) {
            return (char) 0;
        }
        int a10 = com.google.common.primitives.j.a(m10 >>> 8);
        if (Character.isSupplementaryCodePoint(a10)) {
            return (char) 0;
        }
        char a11 = com.google.common.primitives.b.a(a10);
        if (!com.google.common.primitives.b.b(cArr, a11)) {
            return (char) 0;
        }
        this.f45485a += com.google.common.primitives.f.e(m10 & 255);
        return a11;
    }

    public String s(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f45485a;
        while (i10 < this.f45486b && this.data[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.data;
        int i11 = this.f45485a;
        String I10 = Z.I(bArr, i11, i10 - i11);
        this.f45485a = i10;
        if (i10 < this.f45486b) {
            this.f45485a = i10 + 1;
        }
        return I10;
    }

    public double t() {
        return Double.longBitsToDouble(F());
    }

    public float u() {
        return Float.intBitsToFloat(v());
    }

    public int v() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 24;
        int i13 = i10 + 2;
        this.f45485a = i13;
        int i14 = ((bArr[i11] & UByte.MAX_VALUE) << 16) | i12;
        int i15 = i10 + 3;
        this.f45485a = i15;
        int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 8);
        this.f45485a = i10 + 4;
        return (bArr[i15] & UByte.MAX_VALUE) | i16;
    }

    public int w() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = ((bArr[i10] & UByte.MAX_VALUE) << 24) >> 8;
        int i13 = i10 + 2;
        this.f45485a = i13;
        int i14 = ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
        this.f45485a = i10 + 3;
        return (bArr[i13] & UByte.MAX_VALUE) | i14;
    }

    public String x() {
        return y(StandardCharsets.UTF_8);
    }

    public String y(Charset charset) {
        AbstractC4134a.b(f45484c.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            W();
        }
        String K10 = K(e(charset) - this.f45485a, charset);
        if (this.f45485a == this.f45486b) {
            return K10;
        }
        e0(charset);
        return K10;
    }

    public int z() {
        byte[] bArr = this.data;
        int i10 = this.f45485a;
        int i11 = i10 + 1;
        this.f45485a = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        int i13 = i10 + 2;
        this.f45485a = i13;
        int i14 = ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
        int i15 = i10 + 3;
        this.f45485a = i15;
        int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 16);
        this.f45485a = i10 + 4;
        return ((bArr[i15] & UByte.MAX_VALUE) << 24) | i16;
    }

    public J(int i10) {
        this.data = new byte[i10];
        this.f45486b = i10;
    }

    public J(byte[] bArr) {
        this.data = bArr;
        this.f45486b = bArr.length;
    }

    public J(byte[] bArr, int i10) {
        this.data = bArr;
        this.f45486b = i10;
    }
}
