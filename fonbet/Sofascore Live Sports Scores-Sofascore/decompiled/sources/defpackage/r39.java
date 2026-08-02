package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r39 extends r99 {
    public String A0;
    public int B0;
    public n39 n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public float v0;
    public float w0;
    public String x0;
    public String y0;
    public String z0;

    public r39(zci zciVar, int i) {
        super(zciVar, i);
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        if (i == 10) {
            this.t0 = 1;
        } else if (i == 11) {
            this.u0 = 1;
        }
    }

    @Override // defpackage.r99, defpackage.fm3, defpackage.gtf, defpackage.hm6
    public final void apply() {
        s();
        n39 n39Var = this.n0;
        int i = this.s0;
        n39Var.getClass();
        if ((i == 0 || i == 1) && n39Var.R0 != i) {
            n39Var.R0 = i;
        }
        int i2 = this.t0;
        if (i2 != 0) {
            n39 n39Var2 = this.n0;
            if (i2 > 50) {
                n39Var2.getClass();
            } else if (n39Var2.I0 != i2) {
                n39Var2.I0 = i2;
                n39Var2.k0();
                n39Var2.g0();
            }
        }
        int i3 = this.u0;
        if (i3 != 0) {
            n39 n39Var3 = this.n0;
            if (i3 > 50) {
                n39Var3.getClass();
            } else if (n39Var3.K0 != i3) {
                n39Var3.K0 = i3;
                n39Var3.k0();
                n39Var3.g0();
            }
        }
        float f = this.v0;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            n39 n39Var4 = this.n0;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                n39Var4.getClass();
            } else if (n39Var4.L0 != f) {
                n39Var4.L0 = f;
            }
        }
        float f2 = this.w0;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            n39 n39Var5 = this.n0;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                n39Var5.getClass();
            } else if (n39Var5.M0 != f2) {
                n39Var5.M0 = f2;
            }
        }
        String str = this.x0;
        if (str != null && !str.isEmpty()) {
            n39 n39Var6 = this.n0;
            String str2 = this.x0;
            String str3 = n39Var6.N0;
            if (str3 == null || !str3.equals(str2)) {
                n39Var6.N0 = str2;
            }
        }
        String str4 = this.y0;
        if (str4 != null && !str4.isEmpty()) {
            n39 n39Var7 = this.n0;
            String str5 = this.y0;
            String str6 = n39Var7.O0;
            if (str6 == null || !str6.equals(str5)) {
                n39Var7.O0 = str5;
            }
        }
        String str7 = this.z0;
        if (str7 != null && !str7.isEmpty()) {
            n39 n39Var8 = this.n0;
            String str8 = this.z0;
            String str9 = n39Var8.P0;
            if (str9 == null || !str9.equals(str8.toString())) {
                n39Var8.G0 = false;
                n39Var8.P0 = str8.toString();
            }
        }
        String str10 = this.A0;
        if (str10 != null && !str10.isEmpty()) {
            n39 n39Var9 = this.n0;
            String str11 = this.A0;
            String str12 = n39Var9.Q0;
            if (str12 == null || !str12.equals(str11)) {
                n39Var9.G0 = false;
                n39Var9.Q0 = str11;
            }
        }
        n39 n39Var10 = this.n0;
        n39Var10.W0 = this.B0;
        int i4 = this.o0;
        n39Var10.v0 = i4;
        n39Var10.x0 = i4;
        n39Var10.y0 = i4;
        n39Var10.w0 = this.p0;
        n39Var10.t0 = this.q0;
        n39Var10.u0 = this.r0;
        r();
    }

    @Override // defpackage.r99
    public final t99 s() {
        int[][] i0;
        int[][] i02;
        boolean[][] zArr;
        n39 n39Var = this.n0;
        if (n39Var == null) {
            n39Var = new n39();
            n39Var.G0 = false;
            n39Var.S0 = 0;
            n39Var.U0 = new HashSet();
            n39Var.Y0 = 0;
            n39Var.k0();
            int[][] iArr = n39Var.V0;
            boolean z = iArr != null && iArr.length == n39Var.s0 && (zArr = n39Var.T0) != null && zArr.length == n39Var.H0 && zArr[0].length == n39Var.J0;
            if (!z) {
                n39Var.g0();
            }
            if (z) {
                for (int i = 0; i < n39Var.T0.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = n39Var.T0;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < n39Var.V0.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = n39Var.V0;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            n39Var.S0 = 0;
            String str = n39Var.Q0;
            if (str != null && !str.trim().isEmpty() && (i02 = n39Var.i0(n39Var.Q0, false)) != null) {
                n39Var.e0(i02);
            }
            String str2 = n39Var.P0;
            if (str2 != null && !str2.trim().isEmpty() && (i0 = n39Var.i0(n39Var.P0, true)) != null) {
                n39Var.f0(i0);
            }
            this.n0 = n39Var;
        }
        return n39Var;
    }
}
