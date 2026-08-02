package com.google.common.io;

import com.ironsource.B5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import xsna.e9x;
import xsna.f370;
import xsna.fxc0;
import xsna.i5s;
import xsna.o19;

/* loaded from: classes13.dex */
public abstract class BaseEncoding {
    public static final b a;

    public static final class DecodingException extends IOException {
    }

    public static final class b extends d {
        public final char[] e;

        public b(a aVar) {
            super(aVar, (Character) null);
            this.e = new char[512];
            char[] cArr = aVar.b;
            fxc0.p(cArr.length == 16);
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.e;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | 256] = cArr[i & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final void c(StringBuilder sb, byte[] bArr, int i) throws IOException {
            fxc0.w(0, i, bArr.length);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = bArr[i2] & 255;
                char[] cArr = this.e;
                sb.append(cArr[i3]);
                sb.append(cArr[i3 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public final BaseEncoding f(a aVar, Character ch) {
            return new b(aVar);
        }
    }

    public static final class c extends d {
        public c(String str, String str2) {
            this(new a(str, str2.toCharArray()), Character.valueOf(B5.U));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final void c(StringBuilder sb, byte[] bArr, int i) throws IOException {
            int i2 = 0;
            fxc0.w(0, i, bArr.length);
            for (int i3 = i; i3 >= 3; i3 -= 3) {
                int i4 = i2 + 2;
                int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
                i2 += 3;
                int i6 = i5 | (bArr[i4] & 255);
                a aVar = this.b;
                char[] cArr = aVar.b;
                char[] cArr2 = aVar.b;
                sb.append(cArr[i6 >>> 18]);
                sb.append(cArr2[(i6 >>> 12) & 63]);
                sb.append(cArr2[(i6 >>> 6) & 63]);
                sb.append(cArr2[i6 & 63]);
            }
            if (i2 < i) {
                d(i2, i - i2, sb, bArr);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public final BaseEncoding f(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            fxc0.p(aVar.b.length == 64);
        }
    }

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public static b a() {
        return a;
    }

    public final String b(byte[] bArr) {
        int length = bArr.length;
        fxc0.w(0, length, bArr.length);
        a aVar = ((d) this).b;
        int i = aVar.e;
        int i2 = aVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(e9x.b(length, i2) * i);
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public abstract void c(StringBuilder sb, byte[] bArr, int i) throws IOException;

    public static class d extends BaseEncoding {
        public final a b;
        public final Character c;
        public volatile BaseEncoding d;

        public d(a aVar, Character ch) {
            boolean z;
            this.b = aVar;
            if (ch != null) {
                char charValue = ch.charValue();
                byte[] bArr = aVar.g;
                if (charValue < bArr.length && bArr[charValue] != -1) {
                    z = false;
                    fxc0.o(ch, "Padding character %s was already in alphabet", z);
                    this.c = ch;
                }
            }
            z = true;
            fxc0.o(ch, "Padding character %s was already in alphabet", z);
            this.c = ch;
        }

        @Override // com.google.common.io.BaseEncoding
        public void c(StringBuilder sb, byte[] bArr, int i) throws IOException {
            int i2 = 0;
            fxc0.w(0, i, bArr.length);
            while (i2 < i) {
                a aVar = this.b;
                d(i2, Math.min(aVar.f, i - i2), sb, bArr);
                i2 += aVar.f;
            }
        }

        public final void d(int i, int i2, StringBuilder sb, byte[] bArr) throws IOException {
            fxc0.w(i, i + i2, bArr.length);
            a aVar = this.b;
            int i3 = aVar.f;
            int i4 = aVar.d;
            int i5 = 0;
            fxc0.p(i2 <= i3);
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & 255)) << 8;
            }
            int i7 = ((i2 + 1) * 8) - i4;
            while (i5 < i2 * 8) {
                sb.append(aVar.b[((int) (j >>> (i7 - i5))) & aVar.c]);
                i5 += i4;
            }
            Character ch = this.c;
            if (ch != null) {
                while (i5 < aVar.f * 8) {
                    sb.append(ch.charValue());
                    i5 += i4;
                }
            }
        }

        public final BaseEncoding e() {
            boolean z;
            BaseEncoding baseEncoding = this.d;
            if (baseEncoding == null) {
                a aVar = this.b;
                char[] cArr = aVar.b;
                int length = cArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (o19.o(cArr[i])) {
                        int length2 = cArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                z = false;
                                break;
                            }
                            char c = cArr[i2];
                            if (c >= 'a' && c <= 'z') {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        fxc0.A(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                        char[] cArr2 = new char[cArr.length];
                        for (int i3 = 0; i3 < cArr.length; i3++) {
                            char c2 = cArr[i3];
                            if (o19.o(c2)) {
                                c2 = (char) (c2 ^ ' ');
                            }
                            cArr2[i3] = c2;
                        }
                        a aVar2 = new a(i5s.a(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
                        if (aVar.h) {
                            byte[] bArr = aVar2.g;
                            if (!aVar2.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (int i4 = 65; i4 <= 90; i4++) {
                                    int i5 = i4 | 32;
                                    byte b = bArr[i4];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        copyOf[i4] = b2;
                                    } else {
                                        char c3 = (char) i4;
                                        char c4 = (char) i5;
                                        if (!(b2 == -1)) {
                                            throw new IllegalStateException(f370.E("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                        }
                                        copyOf[i5] = b;
                                    }
                                }
                                aVar = new a(i5s.a(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, copyOf, true);
                            }
                        }
                        aVar = aVar2;
                    } else {
                        i++;
                    }
                }
                baseEncoding = aVar == this.b ? this : f(aVar, this.c);
                this.d = baseEncoding;
            }
            return baseEncoding;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.b.equals(dVar.b) && Objects.equals(this.c, dVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public BaseEncoding f(a aVar, Character ch) {
            return new d(aVar, ch);
        }

        public final int hashCode() {
            return this.b.hashCode() ^ Objects.hashCode(this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            a aVar = this.b;
            sb.append(aVar);
            if (8 % aVar.d != 0) {
                Character ch = this.c;
                if (ch == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(ch);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public d(String str, String str2) {
            this(new a(str, str2.toCharArray()), Character.valueOf(B5.U));
        }
    }

    public static final class a {
        public final String a;
        public final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        public final boolean h;

        public a(String str, char[] cArr, byte[] bArr, boolean z) {
            str.getClass();
            this.a = str;
            cArr.getClass();
            this.b = cArr;
            try {
                int length = cArr.length;
                RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                int c = e9x.c(length);
                this.d = c;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c);
                int i = 1 << (3 - numberOfTrailingZeros);
                this.e = i;
                this.f = c >> numberOfTrailingZeros;
                this.c = cArr.length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f; i2++) {
                    int i3 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[e9x.b(i2 * 8, i3)] = true;
                }
                this.h = z;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.h == aVar.h && Arrays.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
        }

        public final String toString() {
            return this.a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(String str, char[] cArr) {
            this(str, cArr, r1, false);
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                if (c < 128) {
                    if (bArr[c] == -1) {
                        bArr[c] = (byte) i;
                    } else {
                        throw new IllegalArgumentException(f370.E("Duplicate character: %s", Character.valueOf(c)));
                    }
                } else {
                    throw new IllegalArgumentException(f370.E("Non-ASCII character: %s", Character.valueOf(c)));
                }
            }
        }
    }
}
