package k7;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18874a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f18875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18877d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18878e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18879f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f18880g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18881h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            char c2 = cArr[i5];
            if (!(c2 < 128)) {
                throw new IllegalArgumentException(a.d("Non-ASCII character: %s", Character.valueOf(c2)));
            }
            if (!(bArr[c2] == -1)) {
                throw new IllegalArgumentException(a.d("Duplicate character: %s", Character.valueOf(c2)));
            }
            bArr[c2] = (byte) i5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f18881h == i0Var.f18881h && Arrays.equals(this.f18875b, i0Var.f18875b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18875b) + (true != this.f18881h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f18874a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[LOOP:0: B:13:0x005d->B:15:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(String str, char[] cArr, byte[] bArr, boolean z5) {
        int numberOfLeadingZeros;
        int i5;
        this.f18874a = str;
        cArr.getClass();
        this.f18875b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (m0.f18896a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f18877d = numberOfLeadingZeros;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i10 = 1 << (3 - numberOfTrailingZeros);
                        this.f18878e = i10;
                        this.f18879f = numberOfLeadingZeros >> numberOfTrailingZeros;
                        this.f18876c = length - 1;
                        this.f18880g = bArr;
                        boolean[] zArr = new boolean[i10];
                        for (i5 = 0; i5 < this.f18879f; i5++) {
                            int i11 = this.f18877d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[a.a(i5 * 8, i11)] = true;
                        }
                        this.f18881h = z5;
                        return;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f18877d = numberOfLeadingZeros;
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i102 = 1 << (3 - numberOfTrailingZeros2);
                        this.f18878e = i102;
                        this.f18879f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                        this.f18876c = length - 1;
                        this.f18880g = bArr;
                        boolean[] zArr2 = new boolean[i102];
                        while (i5 < this.f18879f) {
                        }
                        this.f18881h = z5;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        this.f18877d = numberOfLeadingZeros;
                        int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i1022 = 1 << (3 - numberOfTrailingZeros22);
                        this.f18878e = i1022;
                        this.f18879f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                        this.f18876c = length - 1;
                        this.f18880g = bArr;
                        boolean[] zArr22 = new boolean[i1022];
                        while (i5 < this.f18879f) {
                        }
                        this.f18881h = z5;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
