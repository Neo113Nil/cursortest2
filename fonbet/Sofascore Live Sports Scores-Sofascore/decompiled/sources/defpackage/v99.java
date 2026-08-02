package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v99 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final g7h o;

    public v99(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, g7h g7hVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = g7hVar;
    }

    public static v99 a(j9e j9eVar, boolean z, g7h g7hVar) {
        boolean z2;
        zid R;
        int i;
        int i2 = 4;
        try {
            if (z) {
                j9eVar.O(4);
            } else {
                j9eVar.O(21);
            }
            int A = j9eVar.A() & 3;
            int A2 = j9eVar.A();
            int i3 = j9eVar.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= A2) {
                    break;
                }
                j9eVar.O(1);
                int H = j9eVar.H();
                for (int i7 = 0; i7 < H; i7++) {
                    int H2 = j9eVar.H();
                    i6 += H2 + 4;
                    j9eVar.O(H2);
                }
                i5++;
            }
            j9eVar.N(i3);
            byte[] bArr = new byte[i6];
            g7h g7hVar2 = g7hVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < A2) {
                int A3 = j9eVar.A() & 63;
                int H3 = j9eVar.H();
                int i20 = i4;
                g7h g7hVar3 = g7hVar2;
                while (i20 < H3) {
                    boolean z3 = z2;
                    int H4 = j9eVar.H();
                    int i21 = A;
                    System.arraycopy(kik.l, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(j9eVar.a, j9eVar.b, bArr, i22, H4);
                    if (A3 == 32 && i20 == 0) {
                        g7hVar3 = kik.T(i22, i22 + H4, bArr);
                    } else {
                        if (A3 == 33 && i20 == 0) {
                            c3d S = kik.S(bArr, i22, i22 + H4, g7hVar3);
                            i8 = S.a + 1;
                            i9 = S.g;
                            int i23 = S.h;
                            i11 = S.c + 8;
                            i12 = S.d + 8;
                            int i24 = S.k;
                            i10 = i23;
                            int i25 = S.l;
                            int i26 = S.m;
                            float f2 = S.i;
                            int i27 = S.j;
                            y2d y2dVar = S.b;
                            if (y2dVar != null) {
                                i = i27;
                                str = wz2.a(y2dVar.a, y2dVar.b, y2dVar.c, y2dVar.d, y2dVar.e, y2dVar.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (A3 == 39 && i20 == 0 && (R = kik.R(i22, i22 + H4, bArr)) != null && g7hVar3 != null) {
                            i4 = 0;
                            i16 = R.b == ((x2d) ((hv9) g7hVar3.b).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + H4;
                    j9eVar.O(H4);
                    i20++;
                    z2 = z3;
                    A = i21;
                    i2 = 4;
                }
                i18++;
                g7hVar2 = g7hVar3;
                i2 = 4;
            }
            return new v99(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), A + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str, g7hVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw s9e.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
