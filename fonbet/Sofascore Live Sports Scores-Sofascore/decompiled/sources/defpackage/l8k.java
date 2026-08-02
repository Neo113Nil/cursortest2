package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class l8k extends uaa {
    public static final int[] e = {1, 1, 1};
    public static final int[] f = {1, 1, 1, 1, 1};
    public static final int[] g = {1, 1, 1, 1, 1, 1};
    public static final int[][] h;
    public static final int[][] i;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        h = iArr;
        int[][] iArr2 = new int[20][];
        i = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = h[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            i[i2] = iArr4;
        }
    }

    public static boolean E(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            int i2 = length - 1;
            if (F(charSequence.subSequence(0, i2)) == Character.digit(charSequence.charAt(i2), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int F(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int charAt = charSequence.charAt(i3) - '0';
            if (charAt < 0 || charAt > 9) {
                um8 um8Var = um8.c;
                if (dof.a) {
                    throw new um8();
                }
                throw um8.c;
            }
            i2 += charAt;
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int charAt2 = charSequence.charAt(i5) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                um8 um8Var2 = um8.c;
                if (dof.a) {
                    throw new um8();
                }
                throw um8.c;
            }
            i4 += charAt2;
        }
        return (1000 - i4) % 10;
    }
}
