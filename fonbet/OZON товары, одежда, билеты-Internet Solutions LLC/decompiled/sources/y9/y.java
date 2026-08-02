package y9;

import h9.EnumC6876a;
import java.util.Arrays;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public abstract class y extends r {

    /* renamed from: d, reason: collision with root package name */
    static final int[] f106355d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f106356e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f106357f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g, reason: collision with root package name */
    static final int[][] f106358g;

    /* renamed from: h, reason: collision with root package name */
    static final int[][] f106359h;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f106360a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final x f106361b = new x();

    /* renamed from: c, reason: collision with root package name */
    private final m f106362c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f106358g = iArr;
        int[][] iArr2 = new int[20][];
        f106359h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = f106358g[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            f106359h[i11] = iArr4;
        }
    }

    protected y() {
    }

    static boolean h(String str) throws h9.h {
        int length = str.length();
        if (length != 0) {
            int i11 = length - 1;
            if (q(str.subSequence(0, i11)) == Character.digit(str.charAt(i11), 10)) {
                return true;
            }
        }
        return false;
    }

    static int i(C8659a c8659a, int[] iArr, int i11, int[][] iArr2) throws h9.m {
        r.e(i11, c8659a, iArr);
        int length = iArr2.length;
        float f7 = 0.48f;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float d11 = r.d(iArr, iArr2[i13], 0.7f);
            if (d11 < f7) {
                i12 = i13;
                f7 = d11;
            }
        }
        if (i12 >= 0) {
            return i12;
        }
        throw h9.m.a();
    }

    static int[] m(C8659a c8659a, int i11, boolean z11, int[] iArr) throws h9.m {
        return n(c8659a, i11, z11, iArr, new int[iArr.length]);
    }

    private static int[] n(C8659a c8659a, int i11, boolean z11, int[] iArr, int[] iArr2) throws h9.m {
        int j11 = c8659a.j();
        int i12 = z11 ? c8659a.i(i11) : c8659a.h(i11);
        int length = iArr.length;
        boolean z12 = z11;
        int i13 = 0;
        int i14 = i12;
        while (i12 < j11) {
            if (c8659a.f(i12) != z12) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 != length - 1) {
                    i13++;
                } else {
                    if (r.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i14, i12};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i15 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i15);
                    iArr2[i15] = 0;
                    iArr2[i13] = 0;
                    i13--;
                }
                iArr2[i13] = 1;
                z12 = !z12;
            }
            i12++;
        }
        throw h9.m.a();
    }

    static int[] o(C8659a c8659a) throws h9.m {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = n(c8659a, i11, false, f106355d, iArr);
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            int i14 = i12 - (i13 - i12);
            if (i14 >= 0) {
                z11 = c8659a.l(i14, i12);
            }
            i11 = i13;
        }
        return iArr2;
    }

    static int q(CharSequence charSequence) throws h9.h {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int charAt = charSequence.charAt(i12) - '0';
            if (charAt < 0 || charAt > 9) {
                throw h9.h.a();
            }
            i11 += charAt;
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int charAt2 = charSequence.charAt(i14) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw h9.h.a();
            }
            i13 += charAt2;
        }
        return (1000 - i13) % 10;
    }

    @Override // y9.r
    public h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h9.d, h9.h {
        return l(i11, c8659a, o(c8659a), enumMap);
    }

    boolean g(String str) throws h9.h {
        return h(str);
    }

    int[] j(int i11, C8659a c8659a) throws h9.m {
        return n(c8659a, i11, false, f106355d, new int[3]);
    }

    protected abstract int k(C8659a c8659a, int[] iArr, StringBuilder sb2) throws h9.m;

    public h9.q l(int i11, C8659a c8659a, int[] iArr, EnumMap enumMap) throws h9.m, h9.d, h9.h {
        int i12;
        String b11;
        h9.t tVar = enumMap == null ? null : (h9.t) enumMap.get(h9.e.NEED_RESULT_POINT_CALLBACK);
        if (tVar != null) {
            tVar.a(new h9.s((iArr[0] + iArr[1]) / 2.0f, i11));
        }
        StringBuilder sb2 = this.f106360a;
        sb2.setLength(0);
        int k11 = k(c8659a, iArr, sb2);
        if (tVar != null) {
            tVar.a(new h9.s(k11, i11));
        }
        int[] j11 = j(k11, c8659a);
        if (tVar != null) {
            tVar.a(new h9.s((j11[0] + j11[1]) / 2.0f, i11));
        }
        int i13 = j11[1];
        int i14 = (i13 - j11[0]) + i13;
        if (i14 >= c8659a.j() || !c8659a.l(i13, i14)) {
            throw h9.m.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw h9.h.a();
        }
        if (!g(sb3)) {
            throw h9.d.a();
        }
        EnumC6876a p11 = p();
        float f7 = i11;
        h9.q qVar = new h9.q(sb3, null, new h9.s[]{new h9.s((iArr[1] + iArr[0]) / 2.0f, f7), new h9.s((j11[1] + j11[0]) / 2.0f, f7)}, p11);
        try {
            h9.q a11 = this.f106361b.a(i11, j11[1], c8659a);
            qVar.h(h9.r.UPC_EAN_EXTENSION, a11.f());
            qVar.g(a11.d());
            qVar.a(a11.e());
            i12 = a11.f().length();
        } catch (h9.p unused) {
            i12 = 0;
        }
        int[] iArr2 = enumMap != null ? (int[]) enumMap.get(h9.e.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i15 : iArr2) {
                if (i12 != i15) {
                }
            }
            throw h9.m.a();
        }
        if ((p11 == EnumC6876a.EAN_13 || p11 == EnumC6876a.UPC_A) && (b11 = this.f106362c.b(sb3)) != null) {
            qVar.h(h9.r.POSSIBLE_COUNTRY, b11);
        }
        return qVar;
    }

    abstract EnumC6876a p();
}
