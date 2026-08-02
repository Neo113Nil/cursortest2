package y9;

import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class o extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f106337b = {1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f106338c = {3, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f106339d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // y9.s
    public final boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        s.c(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int b11 = s.b(zArr, 0, f106337b, true);
        for (int i11 = 0; i11 < length; i11 += 2) {
            int digit = Character.digit(str.charAt(i11), 10);
            int digit2 = Character.digit(str.charAt(i11 + 1), 10);
            int[] iArr = new int[10];
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                int[][] iArr2 = f106339d;
                iArr[i13] = iArr2[digit][i12];
                iArr[i13 + 1] = iArr2[digit2][i12];
            }
            b11 += s.b(zArr, b11, iArr, true);
        }
        s.b(zArr, b11, f106338c, true);
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.ITF);
    }
}
