package l2;

import androidx.annotation.NonNull;
import f2.C6404d;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import m2.d;
import m2.e;
import m2.f;
import m2.m;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7853b extends m {

    /* renamed from: I0, reason: collision with root package name */
    f f72544I0;

    /* renamed from: J0, reason: collision with root package name */
    private e[] f72545J0;

    /* renamed from: L0, reason: collision with root package name */
    private int f72547L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f72548M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f72549N0;

    /* renamed from: O0, reason: collision with root package name */
    private int f72550O0;

    /* renamed from: P0, reason: collision with root package name */
    private float f72551P0;

    /* renamed from: Q0, reason: collision with root package name */
    private float f72552Q0;

    /* renamed from: R0, reason: collision with root package name */
    private String f72553R0;

    /* renamed from: S0, reason: collision with root package name */
    private String f72554S0;

    /* renamed from: T0, reason: collision with root package name */
    private String f72555T0;

    /* renamed from: U0, reason: collision with root package name */
    private String f72556U0;

    /* renamed from: V0, reason: collision with root package name */
    private int f72557V0;

    /* renamed from: W0, reason: collision with root package name */
    private int f72558W0;

    /* renamed from: X0, reason: collision with root package name */
    private boolean[][] f72559X0;

    /* renamed from: Z0, reason: collision with root package name */
    private int[][] f72561Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f72562a1;

    /* renamed from: b1, reason: collision with root package name */
    private int[][] f72563b1;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f72546K0 = false;

    /* renamed from: Y0, reason: collision with root package name */
    HashSet f72560Y0 = new HashSet();

    /* renamed from: c1, reason: collision with root package name */
    private int f72564c1 = 0;

    public C7853b() {
        int[][] B12;
        int[][] B13;
        boolean[][] zArr;
        this.f72558W0 = 0;
        N1();
        int[][] iArr = this.f72561Z0;
        boolean z11 = iArr != null && iArr.length == this.f74240w0 && (zArr = this.f72559X0) != null && zArr.length == this.f72547L0 && zArr[0].length == this.f72549N0;
        if (!z11) {
            z1();
        }
        if (z11) {
            for (int i11 = 0; i11 < this.f72559X0.length; i11++) {
                int i12 = 0;
                while (true) {
                    boolean[][] zArr2 = this.f72559X0;
                    if (i12 < zArr2[0].length) {
                        zArr2[i11][i12] = true;
                        i12++;
                    }
                }
            }
            for (int i13 = 0; i13 < this.f72561Z0.length; i13++) {
                int i14 = 0;
                while (true) {
                    int[][] iArr2 = this.f72561Z0;
                    if (i14 < iArr2[0].length) {
                        iArr2[i13][i14] = -1;
                        i14++;
                    }
                }
            }
        }
        this.f72558W0 = 0;
        String str = this.f72556U0;
        if (str != null && !str.trim().isEmpty() && (B13 = B1(this.f72556U0, false)) != null) {
            x1(B13);
        }
        String str2 = this.f72555T0;
        if (str2 == null || str2.trim().isEmpty() || (B12 = B1(this.f72555T0, true)) == null) {
            return;
        }
        y1(B12);
    }

    private boolean A1(int i11, int i12, int i13, int i14) {
        for (int i15 = i11; i15 < i11 + i13; i15++) {
            for (int i16 = i12; i16 < i12 + i14; i16++) {
                boolean[][] zArr = this.f72559X0;
                if (i15 < zArr.length && i16 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i15];
                    if (zArr2[i16]) {
                        zArr2[i16] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private int[][] B1(String str, boolean z11) {
        try {
            String[] split = str.split(",");
            Arrays.sort(split, new C7852a(0));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
            if (this.f72547L0 != 1 && this.f72549N0 != 1) {
                for (int i11 = 0; i11 < split.length; i11++) {
                    String[] split2 = split[i11].trim().split(ProductContainerDTO.RATIO_DELIMITER);
                    String[] split3 = split2[1].split("x");
                    iArr[i11][0] = Integer.parseInt(split2[0]);
                    if ((this.f72562a1 & 1) > 0) {
                        iArr[i11][1] = Integer.parseInt(split3[1]);
                        iArr[i11][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i11][1] = Integer.parseInt(split3[0]);
                        iArr[i11][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < split.length; i14++) {
                String[] split4 = split[i14].trim().split(ProductContainerDTO.RATIO_DELIMITER);
                iArr[i14][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i14];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f72549N0 == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i12 += iArr[i14][1];
                    if (z11) {
                        i12--;
                    }
                }
                if (this.f72547L0 == 1) {
                    iArr[i14][2] = Integer.parseInt(split4[1]);
                    i13 += iArr[i14][2];
                    if (z11) {
                        i13--;
                    }
                }
            }
            if (i12 != 0 && !this.f72546K0) {
                J1(this.f72547L0 + i12);
            }
            if (i13 != 0 && !this.f72546K0) {
                E1(this.f72549N0 + i13);
            }
            this.f72546K0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private static float[] C1(int i11, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(",");
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 < split.length) {
                try {
                    fArr[i12] = Float.parseFloat(split[i12]);
                } catch (Exception e11) {
                    System.err.println("Error parsing `" + split[i12] + "`: " + e11.getMessage());
                    fArr[i12] = 1.0f;
                }
            } else {
                fArr[i12] = 1.0f;
            }
        }
        return fArr;
    }

    private void N1() {
        int i11;
        int i12 = this.f72548M0;
        if (i12 != 0 && (i11 = this.f72550O0) != 0) {
            this.f72547L0 = i12;
            this.f72549N0 = i11;
            return;
        }
        int i13 = this.f72550O0;
        if (i13 > 0) {
            this.f72549N0 = i13;
            this.f72547L0 = ((this.f74240w0 + i13) - 1) / i13;
        } else if (i12 > 0) {
            this.f72547L0 = i12;
            this.f72549N0 = ((this.f74240w0 + i12) - 1) / i12;
        } else {
            int sqrt = (int) (Math.sqrt(this.f74240w0) + 1.5d);
            this.f72547L0 = sqrt;
            this.f72549N0 = ((this.f74240w0 + sqrt) - 1) / sqrt;
        }
    }

    private static void t1(e eVar) {
        eVar.f74149o0[1] = -1.0f;
        eVar.f74105L.n();
        eVar.f74107N.n();
        eVar.f74108O.n();
    }

    private void u1(e eVar, int i11, int i12, int i13, int i14) {
        eVar.f74104K.a(this.f72545J0[i12].f74104K, 0);
        eVar.f74105L.a(this.f72545J0[i11].f74105L, 0);
        eVar.f74106M.a(this.f72545J0[(i12 + i14) - 1].f74106M, 0);
        eVar.f74107N.a(this.f72545J0[(i11 + i13) - 1].f74107N, 0);
    }

    private int v1(int i11) {
        return this.f72557V0 == 1 ? i11 / this.f72547L0 : i11 % this.f72549N0;
    }

    private int w1(int i11) {
        return this.f72557V0 == 1 ? i11 % this.f72547L0 : i11 / this.f72549N0;
    }

    private void x1(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!A1(w1(iArr2[0]), v1(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void y1(int[][] iArr) {
        if ((this.f72562a1 & 2) > 0) {
            return;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int w12 = w1(iArr[i11][0]);
            int v12 = v1(iArr[i11][0]);
            int[] iArr2 = iArr[i11];
            if (!A1(w12, v12, iArr2[1], iArr2[2])) {
                break;
            }
            e eVar = this.f74239v0[i11];
            int[] iArr3 = iArr[i11];
            u1(eVar, w12, v12, iArr3[1], iArr3[2]);
            this.f72560Y0.add(this.f74239v0[i11].f74140k);
        }
    }

    private void z1() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f72547L0, this.f72549N0);
        this.f72559X0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i11 = this.f74240w0;
        if (i11 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, 4);
            this.f72561Z0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final void D1(@NonNull String str) {
        String str2 = this.f72554S0;
        if (str2 == null || !str2.equals(str)) {
            this.f72554S0 = str;
        }
    }

    public final void E1(int i11) {
        if (i11 <= 50 && this.f72550O0 != i11) {
            this.f72550O0 = i11;
            N1();
            z1();
        }
    }

    public final void F1(int i11) {
        this.f72562a1 = i11;
    }

    public final void G1(float f7) {
        if (f7 >= 0.0f && this.f72551P0 != f7) {
            this.f72551P0 = f7;
        }
    }

    public final void H1(int i11) {
        if ((i11 == 0 || i11 == 1) && this.f72557V0 != i11) {
            this.f72557V0 = i11;
        }
    }

    public final void I1(@NonNull String str) {
        String str2 = this.f72553R0;
        if (str2 == null || !str2.equals(str)) {
            this.f72553R0 = str;
        }
    }

    public final void J1(int i11) {
        if (i11 <= 50 && this.f72548M0 != i11) {
            this.f72548M0 = i11;
            N1();
            z1();
        }
    }

    public final void K1(@NonNull String str) {
        String str2 = this.f72556U0;
        if (str2 == null || !str2.equals(str)) {
            this.f72546K0 = false;
            this.f72556U0 = str;
        }
    }

    public final void L1(@NonNull CharSequence charSequence) {
        String str = this.f72555T0;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f72546K0 = false;
            this.f72555T0 = charSequence.toString();
        }
    }

    public final void M1(float f7) {
        if (f7 >= 0.0f && this.f72552Q0 != f7) {
            this.f72552Q0 = f7;
        }
    }

    @Override // m2.e
    public final void f(C6404d c6404d, boolean z11) {
        int i11;
        int i12;
        int[][] iArr;
        int i13;
        super.f(c6404d, z11);
        int max = Math.max(this.f72547L0, this.f72549N0);
        e eVar = this.f72545J0[0];
        float[] C12 = C1(this.f72547L0, this.f72553R0);
        int i14 = this.f72547L0;
        d dVar = this.f74107N;
        d dVar2 = this.f74105L;
        if (i14 == 1) {
            t1(eVar);
            eVar.f74105L.a(dVar2, 0);
            eVar.f74107N.a(dVar, 0);
        } else {
            int i15 = 0;
            while (true) {
                i11 = this.f72547L0;
                if (i15 >= i11) {
                    break;
                }
                e eVar2 = this.f72545J0[i15];
                t1(eVar2);
                if (C12 != null) {
                    eVar2.f74149o0[1] = C12[i15];
                }
                d dVar3 = eVar2.f74105L;
                if (i15 > 0) {
                    dVar3.a(this.f72545J0[i15 - 1].f74107N, 0);
                } else {
                    dVar3.a(dVar2, 0);
                }
                int i16 = this.f72547L0 - 1;
                d dVar4 = eVar2.f74107N;
                if (i15 < i16) {
                    dVar4.a(this.f72545J0[i15 + 1].f74105L, 0);
                } else {
                    dVar4.a(dVar, 0);
                }
                if (i15 > 0) {
                    dVar3.f74091g = (int) this.f72552Q0;
                }
                i15++;
            }
            while (i11 < max) {
                e eVar3 = this.f72545J0[i11];
                t1(eVar3);
                eVar3.f74105L.a(dVar2, 0);
                eVar3.f74107N.a(dVar, 0);
                i11++;
            }
        }
        int max2 = Math.max(this.f72547L0, this.f72549N0);
        e eVar4 = this.f72545J0[0];
        float[] C13 = C1(this.f72549N0, this.f72554S0);
        int i17 = this.f72549N0;
        d dVar5 = this.f74106M;
        d dVar6 = this.f74104K;
        if (i17 == 1) {
            eVar4.f74149o0[0] = -1.0f;
            eVar4.f74104K.n();
            eVar4.f74106M.n();
            eVar4.f74104K.a(dVar6, 0);
            eVar4.f74106M.a(dVar5, 0);
        } else {
            int i18 = 0;
            while (true) {
                i12 = this.f72549N0;
                if (i18 >= i12) {
                    break;
                }
                e eVar5 = this.f72545J0[i18];
                eVar5.f74149o0[0] = -1.0f;
                eVar5.f74104K.n();
                eVar5.f74106M.n();
                if (C13 != null) {
                    eVar5.f74149o0[0] = C13[i18];
                }
                d dVar7 = eVar5.f74104K;
                if (i18 > 0) {
                    dVar7.a(this.f72545J0[i18 - 1].f74106M, 0);
                } else {
                    dVar7.a(dVar6, 0);
                }
                int i19 = this.f72549N0 - 1;
                d dVar8 = eVar5.f74106M;
                if (i18 < i19) {
                    dVar8.a(this.f72545J0[i18 + 1].f74104K, 0);
                } else {
                    dVar8.a(dVar5, 0);
                }
                if (i18 > 0) {
                    dVar7.f74091g = (int) this.f72551P0;
                }
                i18++;
            }
            while (i12 < max2) {
                e eVar6 = this.f72545J0[i12];
                eVar6.f74149o0[0] = -1.0f;
                eVar6.f74104K.n();
                eVar6.f74106M.n();
                eVar6.f74104K.a(dVar6, 0);
                eVar6.f74106M.a(dVar5, 0);
                i12++;
            }
        }
        for (int i21 = 0; i21 < this.f74240w0; i21++) {
            if (!this.f72560Y0.contains(this.f74239v0[i21].f74140k)) {
                boolean z12 = false;
                int i22 = 0;
                while (true) {
                    if (z12) {
                        break;
                    }
                    i22 = this.f72558W0;
                    if (i22 >= this.f72547L0 * this.f72549N0) {
                        i22 = -1;
                        break;
                    }
                    int w12 = w1(i22);
                    int v12 = v1(this.f72558W0);
                    boolean[] zArr = this.f72559X0[w12];
                    if (zArr[v12]) {
                        zArr[v12] = false;
                        z12 = true;
                    }
                    this.f72558W0++;
                }
                int w13 = w1(i22);
                int v13 = v1(i22);
                if (i22 == -1) {
                    return;
                }
                if ((this.f72562a1 & 2) > 0 && (iArr = this.f72563b1) != null && (i13 = this.f72564c1) < iArr.length) {
                    int[] iArr2 = iArr[i13];
                    if (iArr2[0] == i22) {
                        this.f72559X0[w13][v13] = true;
                        if (A1(w13, v13, iArr2[1], iArr2[2])) {
                            e eVar7 = this.f74239v0[i21];
                            int[] iArr3 = this.f72563b1[this.f72564c1];
                            u1(eVar7, w13, v13, iArr3[1], iArr3[2]);
                            this.f72564c1++;
                        }
                    }
                }
                u1(this.f74239v0[i21], w13, v13, 1, 1);
            }
        }
    }

    @Override // m2.m
    public final void h1(int i11, int i12, int i13, int i14) {
        int[][] B12;
        this.f72544I0 = (f) this.f74116W;
        if (this.f72547L0 >= 1 && this.f72549N0 >= 1) {
            this.f72558W0 = 0;
            String str = this.f72556U0;
            if (str != null && !str.trim().isEmpty() && (B12 = B1(this.f72556U0, false)) != null) {
                x1(B12);
            }
            String str2 = this.f72555T0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f72563b1 = B1(this.f72555T0, true);
            }
            int max = Math.max(this.f72547L0, this.f72549N0);
            e[] eVarArr = this.f72545J0;
            if (eVarArr == null) {
                this.f72545J0 = new e[max];
                int i15 = 0;
                while (true) {
                    e[] eVarArr2 = this.f72545J0;
                    if (i15 >= eVarArr2.length) {
                        break;
                    }
                    e eVar = new e();
                    e.b[] bVarArr = eVar.f74115V;
                    e.b bVar = e.b.MATCH_CONSTRAINT;
                    bVarArr[0] = bVar;
                    bVarArr[1] = bVar;
                    eVar.f74140k = String.valueOf(eVar.hashCode());
                    eVarArr2[i15] = eVar;
                    i15++;
                }
            } else if (max != eVarArr.length) {
                e[] eVarArr3 = new e[max];
                for (int i16 = 0; i16 < max; i16++) {
                    e[] eVarArr4 = this.f72545J0;
                    if (i16 < eVarArr4.length) {
                        eVarArr3[i16] = eVarArr4[i16];
                    } else {
                        e eVar2 = new e();
                        e.b[] bVarArr2 = eVar2.f74115V;
                        e.b bVar2 = e.b.MATCH_CONSTRAINT;
                        bVarArr2[0] = bVar2;
                        bVarArr2[1] = bVar2;
                        eVar2.f74140k = String.valueOf(eVar2.hashCode());
                        eVarArr3[i16] = eVar2;
                    }
                }
                while (true) {
                    e[] eVarArr5 = this.f72545J0;
                    if (max >= eVarArr5.length) {
                        break;
                    }
                    e eVar3 = eVarArr5[max];
                    this.f72544I0.f74253v0.remove(eVar3);
                    eVar3.i0();
                    max++;
                }
                this.f72545J0 = eVarArr3;
            }
            int[][] iArr = this.f72563b1;
            if (iArr != null) {
                y1(iArr);
            }
        }
        f fVar = this.f72544I0;
        e[] eVarArr6 = this.f72545J0;
        fVar.getClass();
        for (e eVar4 : eVarArr6) {
            fVar.b(eVar4);
        }
    }
}
