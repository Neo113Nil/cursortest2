package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n39 extends yvk {
    public xm3 E0;
    public wm3[] F0;
    public boolean G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public float M0;
    public String N0;
    public String O0;
    public String P0;
    public String Q0;
    public int R0;
    public int S0;
    public boolean[][] T0;
    public HashSet U0;
    public int[][] V0;
    public int W0;
    public int[][] X0;
    public int Y0;

    public static void a0(wm3 wm3Var) {
        wm3Var.l0[1] = -1.0f;
        wm3Var.K.j();
        wm3Var.M.j();
        wm3Var.N.j();
    }

    public static float[] j0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < split.length) {
                try {
                    fArr[i2] = Float.parseFloat(split[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + split[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // defpackage.yvk
    public final void Y(int i, int i2, int i3, int i4) {
        int[][] i0;
        this.E0 = this.U;
        if (this.H0 >= 1 && this.J0 >= 1) {
            this.S0 = 0;
            String str = this.Q0;
            if (str != null && !str.trim().isEmpty() && (i0 = i0(this.Q0, false)) != null) {
                e0(i0);
            }
            String str2 = this.P0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.X0 = i0(this.P0, true);
            }
            int max = Math.max(this.H0, this.J0);
            wm3[] wm3VarArr = this.F0;
            if (wm3VarArr == null) {
                this.F0 = new wm3[max];
                int i5 = 0;
                while (true) {
                    wm3[] wm3VarArr2 = this.F0;
                    if (i5 >= wm3VarArr2.length) {
                        break;
                    }
                    wm3 wm3Var = new wm3();
                    int[] iArr = wm3Var.q0;
                    iArr[0] = 3;
                    iArr[1] = 3;
                    wm3Var.k = String.valueOf(wm3Var.hashCode());
                    wm3VarArr2[i5] = wm3Var;
                    i5++;
                }
            } else if (max != wm3VarArr.length) {
                wm3[] wm3VarArr3 = new wm3[max];
                for (int i6 = 0; i6 < max; i6++) {
                    wm3[] wm3VarArr4 = this.F0;
                    if (i6 < wm3VarArr4.length) {
                        wm3VarArr3[i6] = wm3VarArr4[i6];
                    } else {
                        wm3 wm3Var2 = new wm3();
                        int[] iArr2 = wm3Var2.q0;
                        iArr2[0] = 3;
                        iArr2[1] = 3;
                        wm3Var2.k = String.valueOf(wm3Var2.hashCode());
                        wm3VarArr3[i6] = wm3Var2;
                    }
                }
                while (true) {
                    wm3[] wm3VarArr5 = this.F0;
                    if (max >= wm3VarArr5.length) {
                        break;
                    }
                    wm3 wm3Var3 = wm3VarArr5[max];
                    this.E0.r0.remove(wm3Var3);
                    wm3Var3.D();
                    max++;
                }
                this.F0 = wm3VarArr3;
            }
            int[][] iArr3 = this.X0;
            if (iArr3 != null) {
                f0(iArr3);
            }
        }
        xm3 xm3Var = this.E0;
        wm3[] wm3VarArr6 = this.F0;
        xm3Var.getClass();
        for (wm3 wm3Var4 : wm3VarArr6) {
            xm3Var.V(wm3Var4);
        }
    }

    public final void b0(int i, int i2, int i3, int i4, wm3 wm3Var) {
        wm3Var.J.a(this.F0[i2].J, 0);
        wm3Var.K.a(this.F0[i].K, 0);
        wm3Var.L.a(this.F0[(i2 + i4) - 1].L, 0);
        wm3Var.M.a(this.F0[(i + i3) - 1].M, 0);
    }

    @Override // defpackage.wm3
    public final void c(h8b h8bVar, boolean z) {
        int i;
        int i2;
        n39 n39Var;
        int[][] iArr;
        int i3;
        super.c(h8bVar, z);
        int max = Math.max(this.H0, this.J0);
        wm3 wm3Var = this.F0[0];
        float[] j0 = j0(this.H0, this.N0);
        int i4 = this.H0;
        nl3 nl3Var = this.M;
        nl3 nl3Var2 = this.K;
        if (i4 == 1) {
            a0(wm3Var);
            wm3Var.K.a(nl3Var2, 0);
            wm3Var.M.a(nl3Var, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.H0;
                if (i5 >= i) {
                    break;
                }
                wm3 wm3Var2 = this.F0[i5];
                a0(wm3Var2);
                nl3 nl3Var3 = wm3Var2.K;
                if (j0 != null) {
                    wm3Var2.l0[1] = j0[i5];
                }
                if (i5 > 0) {
                    nl3Var3.a(this.F0[i5 - 1].M, 0);
                } else {
                    nl3Var3.a(nl3Var2, 0);
                }
                int i6 = this.H0 - 1;
                nl3 nl3Var4 = wm3Var2.M;
                if (i5 < i6) {
                    nl3Var4.a(this.F0[i5 + 1].K, 0);
                } else {
                    nl3Var4.a(nl3Var, 0);
                }
                if (i5 > 0) {
                    nl3Var3.g = (int) this.M0;
                }
                i5++;
            }
            while (i < max) {
                wm3 wm3Var3 = this.F0[i];
                a0(wm3Var3);
                wm3Var3.K.a(nl3Var2, 0);
                wm3Var3.M.a(nl3Var, 0);
                i++;
            }
        }
        int max2 = Math.max(this.H0, this.J0);
        wm3 wm3Var4 = this.F0[0];
        float[] j02 = j0(this.J0, this.O0);
        int i7 = this.J0;
        nl3 nl3Var5 = this.L;
        nl3 nl3Var6 = this.J;
        if (i7 == 1) {
            float[] fArr = wm3Var4.l0;
            nl3 nl3Var7 = wm3Var4.L;
            nl3 nl3Var8 = wm3Var4.J;
            fArr[0] = -1.0f;
            nl3Var8.j();
            nl3Var7.j();
            nl3Var8.a(nl3Var6, 0);
            nl3Var7.a(nl3Var5, 0);
        } else {
            int i8 = 0;
            while (true) {
                i2 = this.J0;
                if (i8 >= i2) {
                    break;
                }
                wm3 wm3Var5 = this.F0[i8];
                float[] fArr2 = wm3Var5.l0;
                nl3 nl3Var9 = wm3Var5.L;
                nl3 nl3Var10 = wm3Var5.J;
                fArr2[0] = -1.0f;
                nl3Var10.j();
                nl3Var9.j();
                if (j02 != null) {
                    wm3Var5.l0[0] = j02[i8];
                }
                if (i8 > 0) {
                    nl3Var10.a(this.F0[i8 - 1].L, 0);
                } else {
                    nl3Var10.a(nl3Var6, 0);
                }
                if (i8 < this.J0 - 1) {
                    nl3Var9.a(this.F0[i8 + 1].J, 0);
                } else {
                    nl3Var9.a(nl3Var5, 0);
                }
                if (i8 > 0) {
                    nl3Var10.g = (int) this.L0;
                }
                i8++;
            }
            while (i2 < max2) {
                wm3 wm3Var6 = this.F0[i2];
                float[] fArr3 = wm3Var6.l0;
                nl3 nl3Var11 = wm3Var6.L;
                nl3 nl3Var12 = wm3Var6.J;
                fArr3[0] = -1.0f;
                nl3Var12.j();
                nl3Var11.j();
                nl3Var12.a(nl3Var6, 0);
                nl3Var11.a(nl3Var5, 0);
                i2++;
            }
        }
        int i9 = 0;
        while (i9 < this.s0) {
            if (!this.U0.contains(this.r0[i9].k)) {
                boolean z2 = false;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        break;
                    }
                    i10 = this.S0;
                    if (i10 >= this.H0 * this.J0) {
                        i10 = -1;
                        break;
                    }
                    int d0 = this.d0(i10);
                    int c0 = this.c0(this.S0);
                    boolean[] zArr = this.T0[d0];
                    if (zArr[c0]) {
                        zArr[c0] = false;
                        z2 = true;
                    }
                    this.S0++;
                }
                int d02 = this.d0(i10);
                int c02 = this.c0(i10);
                if (i10 == -1) {
                    return;
                }
                if ((this.W0 & 2) > 0 && (iArr = this.X0) != null && (i3 = this.Y0) < iArr.length) {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i10) {
                        this.T0[d02][c02] = true;
                        if (this.h0(d02, c02, iArr2[1], iArr2[2])) {
                            wm3 wm3Var7 = this.r0[i9];
                            int[] iArr3 = this.X0[this.Y0];
                            n39Var = this;
                            n39Var.b0(d02, c02, iArr3[1], iArr3[2], wm3Var7);
                            n39Var.Y0++;
                            i9++;
                            this = n39Var;
                        }
                    }
                }
                n39Var = this;
                n39Var.b0(d02, c02, 1, 1, n39Var.r0[i9]);
                i9++;
                this = n39Var;
            }
            n39Var = this;
            i9++;
            this = n39Var;
        }
    }

    public final int c0(int i) {
        return this.R0 == 1 ? i / this.H0 : i % this.J0;
    }

    public final int d0(int i) {
        return this.R0 == 1 ? i % this.H0 : i / this.J0;
    }

    public final void e0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!h0(d0(iArr2[0]), c0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void f0(int[][] iArr) {
        if ((this.W0 & 2) > 0) {
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int d0 = this.d0(iArr[i][0]);
            int c0 = this.c0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!this.h0(d0, c0, iArr2[1], iArr2[2])) {
                return;
            }
            wm3 wm3Var = this.r0[i];
            int[] iArr3 = iArr[i];
            n39 n39Var = this;
            n39Var.b0(d0, c0, iArr3[1], iArr3[2], wm3Var);
            n39Var.U0.add(n39Var.r0[i].k);
            i++;
            this = n39Var;
        }
    }

    public final void g0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.H0, this.J0);
        this.T0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.s0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.V0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean h0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.T0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r11.G0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        r13 = r11.J0 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        if (r13 <= 50) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        if (r11.K0 != r13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        r11.K0 = r13;
        k0();
        g0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[][] i0(String str, boolean z) {
        int i;
        try {
            String[] split = str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            Arrays.sort(split, new m39(0));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
            if (this.H0 != 1 && this.J0 != 1) {
                for (int i2 = 0; i2 < split.length; i2++) {
                    String[] split2 = split[i2].trim().split(":");
                    String[] split3 = split2[1].split("x");
                    iArr[i2][0] = Integer.parseInt(split2[0]);
                    if ((this.W0 & 1) > 0) {
                        iArr[i2][1] = Integer.parseInt(split3[1]);
                        iArr[i2][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i2][1] = Integer.parseInt(split3[0]);
                        iArr[i2][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < split.length; i5++) {
                String[] split4 = split[i5].trim().split(":");
                iArr[i5][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i5];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.J0 == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i3 += iArr[i5][1];
                    if (z) {
                        i3--;
                    }
                }
                if (this.H0 == 1) {
                    iArr[i5][2] = Integer.parseInt(split4[1]);
                    i4 += iArr[i5][2];
                    if (z) {
                        i4--;
                    }
                }
            }
            if (i3 != 0 && !this.G0 && (i = this.H0 + i3) <= 50 && this.I0 != i) {
                this.I0 = i;
                k0();
                g0();
            }
            this.G0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void k0() {
        int i;
        int i2 = this.I0;
        if (i2 != 0 && (i = this.K0) != 0) {
            this.H0 = i2;
            this.J0 = i;
            return;
        }
        int i3 = this.K0;
        if (i3 > 0) {
            this.J0 = i3;
            this.H0 = ((this.s0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.H0 = i2;
            this.J0 = ((this.s0 + i2) - 1) / i2;
        } else {
            int sqrt = (int) (Math.sqrt(this.s0) + 1.5d);
            this.H0 = sqrt;
            this.J0 = ((this.s0 + sqrt) - 1) / sqrt;
        }
    }
}
