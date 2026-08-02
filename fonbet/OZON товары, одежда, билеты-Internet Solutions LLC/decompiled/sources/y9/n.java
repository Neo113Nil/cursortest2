package y9;

import h9.EnumC6876a;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f106332b = {6, 8, 10, 12, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f106333c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f106334d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e, reason: collision with root package name */
    private static final int[][] f106335e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    private int f106336a = -1;

    private static int g(int[] iArr) throws h9.m {
        float f7 = 0.38f;
        int i11 = -1;
        for (int i12 = 0; i12 < 20; i12++) {
            float d11 = r.d(iArr, f106335e[i12], 0.5f);
            if (d11 < f7) {
                i11 = i12;
                f7 = d11;
            } else if (d11 == f7) {
                i11 = -1;
            }
        }
        if (i11 >= 0) {
            return i11 % 10;
        }
        throw h9.m.a();
    }

    private static int[] h(int i11, C8659a c8659a, int[] iArr) throws h9.m {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int j11 = c8659a.j();
        int i12 = i11;
        boolean z11 = false;
        int i13 = 0;
        while (i11 < j11) {
            if (c8659a.f(i11) != z11) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (r.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i12, i11};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z11 = !z11;
            }
            i11++;
        }
        throw h9.m.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(int i11, C8659a c8659a) throws h9.m {
        int min = Math.min(this.f106336a * 10, i11);
        for (int i12 = i11 - 1; min > 0 && i12 >= 0 && !c8659a.f(i12); i12--) {
            min--;
        }
        throw h9.m.a();
    }

    @Override // y9.r
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.h, h9.m {
        int[] h11;
        boolean z11;
        int j11 = c8659a.j();
        int h12 = c8659a.h(0);
        if (h12 == j11) {
            throw h9.m.a();
        }
        int[] h13 = h(h12, c8659a, f106333c);
        int i12 = h13[1];
        int i13 = h13[0];
        this.f106336a = (i12 - i13) / 4;
        i(i13, c8659a);
        int[][] iArr = f106334d;
        c8659a.m();
        try {
            int j12 = c8659a.j();
            int h14 = c8659a.h(0);
            if (h14 == j12) {
                throw h9.m.a();
            }
            try {
                h11 = h(h14, c8659a, iArr[0]);
            } catch (h9.m unused) {
                h11 = h(h14, c8659a, iArr[1]);
            }
            i(h11[0], c8659a);
            int i14 = h11[0];
            h11[0] = c8659a.j() - h11[1];
            h11[1] = c8659a.j() - i14;
            c8659a.m();
            StringBuilder sb2 = new StringBuilder(20);
            int i15 = h13[1];
            int i16 = h11[0];
            int[] iArr2 = new int[10];
            int[] iArr3 = new int[5];
            int[] iArr4 = new int[5];
            while (i15 < i16) {
                r.e(i15, c8659a, iArr2);
                for (int i17 = 0; i17 < 5; i17++) {
                    int i18 = i17 * 2;
                    iArr3[i17] = iArr2[i18];
                    iArr4[i17] = iArr2[i18 + 1];
                }
                sb2.append((char) (g(iArr3) + 48));
                sb2.append((char) (g(iArr4) + 48));
                for (int i19 = 0; i19 < 10; i19++) {
                    i15 += iArr2[i19];
                }
            }
            String sb3 = sb2.toString();
            int[] iArr5 = enumMap != null ? (int[]) enumMap.get(h9.e.ALLOWED_LENGTHS) : null;
            if (iArr5 == null) {
                iArr5 = f106332b;
            }
            int length = sb3.length();
            int length2 = iArr5.length;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i21 >= length2) {
                    z11 = false;
                    break;
                }
                int i23 = iArr5[i21];
                if (length == i23) {
                    z11 = true;
                    break;
                }
                if (i23 > i22) {
                    i22 = i23;
                }
                i21++;
            }
            if (!z11 && length > i22) {
                z11 = true;
            }
            if (!z11) {
                throw h9.h.a();
            }
            float f7 = i11;
            return new h9.q(sb3, null, new h9.s[]{new h9.s(h13[1], f7), new h9.s(h11[0], f7)}, EnumC6876a.ITF);
        } catch (Throwable th2) {
            c8659a.m();
            throw th2;
        }
    }
}
