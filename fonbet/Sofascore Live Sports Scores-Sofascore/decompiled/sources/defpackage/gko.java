package defpackage;

import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzhaf;
import com.google.android.gms.internal.ads.zzhaz;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gko {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[LOOP:0: B:13:0x0063->B:15:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gko(String str, char[] cArr, byte[] bArr, boolean z) {
        int numberOfLeadingZeros;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
            switch (mko.a[roundingMode.ordinal()]) {
                case 1:
                    o3a.S(((length + (-1)) & length) == 0);
                case 2:
                case 3:
                    numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                    this.d = numberOfLeadingZeros;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i = 1 << (3 - numberOfTrailingZeros);
                    this.e = i;
                    this.f = numberOfLeadingZeros >> numberOfTrailingZeros;
                    this.c = length - 1;
                    this.g = bArr;
                    boolean[] zArr = new boolean[i];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        int i3 = this.d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[zzhaz.a(i2 * 8, i3)] = true;
                    }
                    this.h = zArr;
                    this.i = z;
                    return;
                case 4:
                case 5:
                    numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                    this.d = numberOfLeadingZeros;
                    int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i4 = 1 << (3 - numberOfTrailingZeros2);
                    this.e = i4;
                    this.f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                    this.c = length - 1;
                    this.g = bArr;
                    boolean[] zArr2 = new boolean[i4];
                    while (i2 < this.f) {
                    }
                    this.h = zArr2;
                    this.i = z;
                    return;
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                    numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                    this.d = numberOfLeadingZeros;
                    int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i42 = 1 << (3 - numberOfTrailingZeros22);
                    this.e = i42;
                    this.f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                    this.c = length - 1;
                    this.g = bArr;
                    boolean[] zArr22 = new boolean[i42];
                    while (i2 < this.f) {
                    }
                    this.h = zArr22;
                    this.i = z;
                    return;
                default:
                    throw new AssertionError();
            }
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(me4.g(length2, "Illegal alphabet length ", new StringBuilder(String.valueOf(length2).length() + 24)), e);
        }
    }

    public final int a(char c) {
        if (c > 127) {
            throw new zzhaf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzhaf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzhaf(lnb.q(new StringBuilder(String.valueOf(c).length() + 24), "Unrecognized character: ", c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gko)) {
            return false;
        }
        gko gkoVar = (gko) obj;
        return this.i == gkoVar.i && Arrays.equals(this.b, gkoVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gko(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    a70.p(zzgvb.a("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                a70.p(zzgvb.a("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
