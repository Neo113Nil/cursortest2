package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m21 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[LOOP:0: B:11:0x0078->B:13:0x007c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m21(String str, char[] cArr, byte[] bArr, boolean z) {
        int i;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n6a.a[roundingMode2.ordinal()]) {
                    case 1:
                        f6a.k((length > 0) & (((length + (-1)) & length) == 0));
                    case 2:
                    case 3:
                        i = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        i = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                        i = (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - length))) >>> 31);
                        break;
                    default:
                        ogj.b();
                        break;
                }
                this.d = i;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                int i2 = 1 << (3 - numberOfTrailingZeros);
                this.e = i2;
                this.f = i >> numberOfTrailingZeros;
                this.c = cArr.length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.f; i3++) {
                    int i4 = this.d;
                    RoundingMode roundingMode3 = RoundingMode.CEILING;
                    zArr[o6a.t(i3 * 8, i4)] = true;
                }
                this.h = zArr;
                this.i = z;
            }
            a70.p(lnb.k(length, "x (", ") must be > 0"));
            i = 0;
            this.d = i;
            int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i);
            int i22 = 1 << (3 - numberOfTrailingZeros2);
            this.e = i22;
            this.f = i >> numberOfTrailingZeros2;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr2 = new boolean[i22];
            while (i3 < this.f) {
            }
            this.h = zArr2;
            this.i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int a(char c) {
        if (c > 127) {
            throw new p21(bf3.i(c, new StringBuilder("Unrecognized character: 0x")));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new p21(bf3.i(c, new StringBuilder("Unrecognized character: 0x")));
        }
        throw new p21("Unrecognized character: " + c);
    }

    public final m21 b() {
        if (this.i) {
            return this;
        }
        byte[] bArr = this.g;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        int i = 65;
        while (true) {
            if (i > 90) {
                return new m21(mz1.o(new StringBuilder(), this.a, ".ignoreCase()"), this.b, copyOf, true);
            }
            int i2 = i | 32;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (b == -1) {
                copyOf[i] = b2;
            } else {
                boolean z = b2 == -1;
                char c = (char) i;
                char c2 = (char) i2;
                if (!z) {
                    a70.r(ufa.C("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                    return null;
                }
                copyOf[i2] = b;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m21)) {
            return false;
        }
        m21 m21Var = (m21) obj;
        return this.i == m21Var.i && Arrays.equals(this.b, m21Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m21(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    a70.p(ufa.C("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                a70.p(ufa.C("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
