package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.me4;
import defpackage.x5n;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeu {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final zzgxw f = zzgxw.y(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public zzeu(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public static int u(Charset charset) {
        zzguk.e(charset, "Unsupported charset: %s", f.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b) {
        return (b & 192) == 128;
    }

    public static int x(int i, int i2, int i3, int i4) {
        return zzhbj.c((byte) 0, zzhbn.a(((i & 7) << 2) | ((i2 & 48) >> 4)), zzhbn.a(((i3 & 60) >> 2) | ((i2 & 15) << 4)), zzhbn.a((i4 & 63) | ((i3 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.c - this.b, 0);
    }

    public final void C(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        zzguk.a(z);
        this.c = i;
    }

    public final void D(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        zzguk.a(z);
        this.b = i;
    }

    public final void E(int i) {
        D(this.b + i);
    }

    public final void F(int i, int i2, byte[] bArr) {
        v(i2);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int G() {
        v(1);
        return this.a[this.b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int H() {
        if (B() >= 4) {
            this.b -= 4;
            return b();
        }
        int i = this.b;
        int i2 = this.c;
        defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i2).length()), i, "position=", i2, ", limit="));
        return 0;
    }

    public final int I() {
        v(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int J() {
        v(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 8);
    }

    public final int K() {
        v(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
    }

    public final short L() {
        v(2);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        return (short) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 8));
    }

    public final int M() {
        v(3);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 16) | (i5 << 8);
    }

    public final long N() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (bArr[r3] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 4;
        return (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 2;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.b = i + 4;
        return (i3 << 8) | i4;
    }

    public final int g() {
        return I() | (I() << 21) | (I() << 14) | (I() << 7);
    }

    public final int h() {
        int b = b();
        if (b >= 0) {
            return b;
        }
        a70.r(me4.g(b, "Top bit not zero: ", new StringBuilder(String.valueOf(b).length() + 18)));
        return 0;
    }

    public final int i() {
        int c = c();
        if (c >= 0) {
            return c;
        }
        a70.r(me4.g(c, "Top bit not zero: ", new StringBuilder(String.valueOf(c).length() + 18)));
        return 0;
    }

    public final long j() {
        long d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        a70.r(x5n.m(d2, "Top bit not zero: ", new StringBuilder(String.valueOf(d2).length() + 18)));
        return 0L;
    }

    public final String k(int i, Charset charset) {
        v(i);
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final String l(int i) {
        v(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        String str = zzfm.a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = zzfm.a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str2;
    }

    public final String n(Charset charset) {
        zzguk.e(charset, "Unsupported charset: %s", f.contains(charset));
        if (B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            q();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                a70.p("Unsupported charset: ".concat(String.valueOf(charset)));
                return null;
            }
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b = this.a[i2];
                String str = zzfm.a;
                if (b != 10) {
                    if (b == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0) {
                    byte b2 = bArr[i2 + 1];
                    String str2 = zzfm.a;
                    if (b2 != 10) {
                        if (b2 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0) {
                    byte b3 = bArr2[i2];
                    String str3 = zzfm.a;
                    if (b3 == 10 || b3 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i2 += i;
        }
        String k = k(i2 - this.b, charset);
        if (this.b != this.c && s(charset, d) == '\r') {
            s(charset, e);
        }
        return k;
    }

    public final long o() {
        int i;
        v(1);
        long j = this.a[this.b];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r7 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(x5n.m(j, "Invalid UTF-8 sequence first byte: ", new StringBuilder(String.valueOf(j).length() + 35)));
        }
        v(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.a[this.b + i3] & 192) != 128) {
                throw new NumberFormatException(x5n.m(j, "Invalid UTF-8 sequence continuation byte: ", new StringBuilder(String.valueOf(j).length() + 42)));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i;
        return j;
    }

    public final long p() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.b == this.c) {
                a70.r("Attempting to read a byte over the limit.");
                return 0L;
            }
            long I = I();
            j |= (127 & I) << (i * 7);
            if ((I & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        v(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.a;
        int i2 = this.b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (b << 8));
    }

    public final char s(Charset charset, char[] cArr) {
        int t;
        if (B() >= u(charset) && (t = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j = r0;
                char c = (char) j;
                zzguk.d(j, ((long) c) == j, "Out of range: %s");
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.b = zzhbj.a(t & 255) + this.b;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int i;
        int i2;
        zzguk.e(charset, "Unsupported charset: %s", f.contains(charset));
        if (B() < u(charset)) {
            int i3 = this.b;
            int i4 = this.c;
            defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i3).length() + 17 + String.valueOf(i4).length()), i3, "position=", i4, ", limit="));
            return 0;
        }
        int i5 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.a[this.b];
            if ((b & 128) == 0) {
                i = Byte.toUnsignedInt(b);
                return (i << 8) | i5;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.a[this.b];
            if ((b2 & 128) == 0) {
                i2 = 1;
            } else if ((b2 & 224) == 192 && B() >= 2 && w(this.a[this.b + 1])) {
                i2 = 2;
            } else {
                if ((this.a[this.b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.a;
                    int i6 = this.b;
                    if (w(bArr[i6 + 1]) && w(bArr[i6 + 2])) {
                        i2 = 3;
                    }
                }
                if ((this.a[this.b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.a;
                    int i7 = this.b;
                    if (w(bArr2[i7 + 1]) && w(bArr2[i7 + 2]) && w(bArr2[i7 + 3])) {
                        i2 = 4;
                    }
                }
                i2 = 0;
            }
            if (i2 == 1) {
                i = Byte.toUnsignedInt(this.a[this.b]);
            } else if (i2 == 2) {
                byte[] bArr3 = this.a;
                int i8 = this.b;
                i = x(0, 0, bArr3[i8], bArr3[i8 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr4 = this.a;
                        int i9 = this.b;
                        i = x(bArr4[i9], bArr4[i9 + 1], bArr4[i9 + 2], bArr4[i9 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.a;
                int i10 = this.b;
                i = x(0, bArr5[i10] & 15, bArr5[i10 + 1], bArr5[i10 + 2]);
            }
            i5 = i2;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char r = r(0, byteOrder);
            if (!Character.isHighSurrogate(r) || B() < 4) {
                i = r;
                i5 = 2;
            } else {
                i = Character.toCodePoint(r, r(2, byteOrder));
                i5 = 4;
            }
        }
        return (i << 8) | i5;
    }

    public final void v(int i) {
        if (!g.get() || B() >= i) {
            return;
        }
        int B = B();
        defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(B).length()), i, "bytesNeeded= ", B, ", bytesLeft="));
    }

    public final void y(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public zzeu() {
        this.a = zzfm.b;
    }

    public zzeu(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public zzeu(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
