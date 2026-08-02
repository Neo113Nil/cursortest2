package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a98 extends yvk {
    public wm3[] b1;
    public int E0 = -1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public float K0 = 0.5f;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 2;
    public int T0 = 2;
    public int U0 = 0;
    public int V0 = -1;
    public int W0 = 0;
    public final ArrayList X0 = new ArrayList();
    public wm3[] Y0 = null;
    public wm3[] Z0 = null;
    public int[] a1 = null;
    public int c1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06be  */
    @Override // defpackage.yvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        y88 y88Var;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        wm3 wm3Var;
        nl3 nl3Var;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.s0 > 0) {
            xm3 xm3Var = this.U;
            do1 do1Var = xm3Var != null ? xm3Var.v0 : null;
            if (do1Var == null) {
                this.A0 = 0;
                this.B0 = 0;
                this.z0 = false;
                return;
            }
            for (int i18 = 0; i18 < this.s0; i18++) {
                wm3 wm3Var2 = this.r0[i18];
                if (wm3Var2 != null && !(wm3Var2 instanceof s49)) {
                    int k = wm3Var2.k(0);
                    int k2 = wm3Var2.k(1);
                    if (k != 3 || wm3Var2.s == 1 || k2 != 3 || wm3Var2.t == 1) {
                        if (k == 3) {
                            k = 2;
                        }
                        if (k2 == 3) {
                            k2 = 2;
                        }
                        co1 co1Var = this.C0;
                        co1Var.a = k;
                        co1Var.b = k2;
                        co1Var.c = wm3Var2.r();
                        co1Var.d = wm3Var2.l();
                        do1Var.b(wm3Var2, co1Var);
                        wm3Var2.S(co1Var.e);
                        wm3Var2.N(co1Var.f);
                        wm3Var2.J(co1Var.g);
                    }
                }
            }
        }
        int i19 = this.x0;
        int i20 = this.y0;
        int i21 = this.t0;
        int i22 = this.u0;
        int[] iArr2 = new int[2];
        int i23 = (i2 - i19) - i20;
        int i24 = this.W0;
        if (i24 == 1) {
            i23 = (i4 - i21) - i22;
        }
        int i25 = this.E0;
        if (i24 == 0) {
            if (i25 == -1) {
                this.E0 = 0;
            }
            if (this.F0 == -1) {
                this.F0 = 0;
            }
        } else {
            if (i25 == -1) {
                this.E0 = 0;
            }
            if (this.F0 == -1) {
                this.F0 = 0;
            }
        }
        wm3[] wm3VarArr = this.r0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            i5 = this.s0;
            if (i26 >= i5) {
                break;
            }
            if (this.r0[i26].h0 == 8) {
                i27++;
            }
            i26++;
        }
        if (i27 > 0) {
            wm3VarArr = new wm3[i5 - i27];
            int i29 = 0;
            int i30 = 0;
            while (i29 < this.s0) {
                wm3 wm3Var3 = this.r0[i29];
                int i31 = i19;
                if (wm3Var3.h0 != 8) {
                    wm3VarArr[i30] = wm3Var3;
                    i30++;
                }
                i29++;
                i19 = i31;
            }
            i5 = i30;
        }
        int i32 = i19;
        wm3[] wm3VarArr2 = wm3VarArr;
        this.b1 = wm3VarArr2;
        this.c1 = i5;
        int i33 = this.U0;
        ArrayList arrayList = this.X0;
        if (i33 == 0) {
            i6 = i20;
            i7 = i21;
            i8 = i22;
            iArr = iArr2;
            i9 = i32;
            int i34 = this.W0;
            if (i5 != 0) {
                if (arrayList.size() == 0) {
                    y88Var = new y88(this, i34, this.J, this.K, this.L, this.M, i23);
                    arrayList.add(y88Var);
                } else {
                    y88 y88Var2 = (y88) arrayList.get(0);
                    y88Var2.c = 0;
                    y88Var2.b = null;
                    y88Var2.l = 0;
                    y88Var2.m = 0;
                    y88Var2.n = 0;
                    y88Var2.o = 0;
                    y88Var2.p = 0;
                    y88Var2.f(i34, this.J, this.K, this.L, this.M, this.x0, this.t0, this.y0, this.u0, i23);
                    y88Var = y88Var2;
                }
                for (int i35 = 0; i35 < i5; i35++) {
                    y88Var.a(wm3VarArr2[i35]);
                }
                i28 = 0;
                iArr[0] = y88Var.d();
                c = 1;
                iArr[1] = y88Var.c();
                int i36 = iArr[i28] + i9 + i6;
                int i37 = iArr[c] + i7 + i8;
                if (i != 1073741824) {
                }
                if (i3 != 1073741824) {
                }
                this.A0 = i36;
                this.B0 = i37;
                S(i36);
                N(i37);
                this.z0 = this.s0 <= 0 ? c : i28;
            }
            c = 1;
            int i362 = iArr[i28] + i9 + i6;
            int i372 = iArr[c] + i7 + i8;
            if (i != 1073741824) {
            }
            if (i3 != 1073741824) {
            }
            this.A0 = i362;
            this.B0 = i372;
            S(i362);
            N(i372);
            this.z0 = this.s0 <= 0 ? c : i28;
        }
        int[] iArr3 = this.q0;
        nl3 nl3Var2 = this.K;
        nl3 nl3Var3 = this.J;
        nl3 nl3Var4 = this.L;
        nl3 nl3Var5 = this.M;
        if (i33 == 1) {
            i6 = i20;
            i7 = i21;
            i8 = i22;
            iArr = iArr2;
            i9 = i32;
            int i38 = this.W0;
            if (i5 != 0) {
                arrayList.clear();
                y88 y88Var3 = new y88(this, i38, this.J, this.K, this.L, this.M, i23);
                arrayList.add(y88Var3);
                if (i38 == 0) {
                    i10 = 0;
                    int i39 = 0;
                    int i40 = 0;
                    while (i40 < i5) {
                        wm3 wm3Var4 = wm3VarArr2[i40];
                        int b0 = b0(wm3Var4, i23);
                        if (wm3Var4.q0[0] == 3) {
                            i10++;
                        }
                        int i41 = i10;
                        boolean z = (i39 == i23 || (this.Q0 + i39) + b0 > i23) && y88Var3.b != null;
                        if (!z && i40 > 0 && (i12 = this.V0) > 0 && i40 % i12 == 0) {
                            z = true;
                        }
                        if (z) {
                            y88Var3 = new y88(this, i38, this.J, this.K, this.L, this.M, i23);
                            y88Var3.n = i40;
                            arrayList.add(y88Var3);
                        } else if (i40 > 0) {
                            i39 = this.Q0 + b0 + i39;
                            y88Var3.a(wm3Var4);
                            i40++;
                            i10 = i41;
                        }
                        i39 = b0;
                        y88Var3.a(wm3Var4);
                        i40++;
                        i10 = i41;
                    }
                } else {
                    i10 = 0;
                    int i42 = 0;
                    int i43 = 0;
                    while (i43 < i5) {
                        wm3 wm3Var5 = wm3VarArr2[i43];
                        int a0 = a0(wm3Var5, i23);
                        if (wm3Var5.q0[1] == 3) {
                            i10++;
                        }
                        int i44 = i10;
                        boolean z2 = (i42 == i23 || (this.R0 + i42) + a0 > i23) && y88Var3.b != null;
                        if (!z2 && i43 > 0 && (i11 = this.V0) > 0 && i43 % i11 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            y88Var3 = new y88(this, i38, this.J, this.K, this.L, this.M, i23);
                            y88Var3.n = i43;
                            arrayList.add(y88Var3);
                        } else if (i43 > 0) {
                            i42 = this.R0 + a0 + i42;
                            y88Var3.a(wm3Var5);
                            i43++;
                            i10 = i44;
                        }
                        i42 = a0;
                        y88Var3.a(wm3Var5);
                        i43++;
                        i10 = i44;
                    }
                }
                int size = arrayList.size();
                int i45 = this.x0;
                int i46 = this.t0;
                int i47 = this.y0;
                int i48 = this.u0;
                boolean z3 = iArr3[0] == 2 || iArr3[1] == 2;
                if (i10 > 0 && z3) {
                    for (int i49 = 0; i49 < size; i49++) {
                        y88 y88Var4 = (y88) arrayList.get(i49);
                        if (i38 == 0) {
                            y88Var4.e(i23 - y88Var4.d());
                        } else {
                            y88Var4.e(i23 - y88Var4.c());
                        }
                    }
                }
                int i50 = i45;
                int i51 = i46;
                int i52 = i47;
                int i53 = i48;
                nl3 nl3Var6 = nl3Var3;
                nl3 nl3Var7 = nl3Var2;
                int i54 = 0;
                int i55 = 0;
                nl3 nl3Var8 = nl3Var4;
                nl3 nl3Var9 = nl3Var5;
                for (int i56 = 0; i56 < size; i56++) {
                    y88 y88Var5 = (y88) arrayList.get(i56);
                    if (i38 == 0) {
                        if (i56 < size - 1) {
                            nl3Var9 = ((y88) arrayList.get(i56 + 1)).b.K;
                            i53 = 0;
                        } else {
                            i53 = this.u0;
                            nl3Var9 = nl3Var5;
                        }
                        nl3 nl3Var10 = y88Var5.b.M;
                        y88Var5.f(i38, nl3Var6, nl3Var7, nl3Var8, nl3Var9, i50, i51, i52, i53, i23);
                        i54 = Math.max(i54, y88Var5.d());
                        int c2 = y88Var5.c() + i55;
                        if (i56 > 0) {
                            c2 += this.R0;
                        }
                        i55 = c2;
                        nl3Var7 = nl3Var10;
                        i51 = 0;
                    } else {
                        if (i56 < size - 1) {
                            nl3Var8 = ((y88) arrayList.get(i56 + 1)).b.J;
                            i52 = 0;
                        } else {
                            i52 = this.y0;
                            nl3Var8 = nl3Var4;
                        }
                        nl3 nl3Var11 = y88Var5.b.L;
                        y88Var5.f(i38, nl3Var6, nl3Var7, nl3Var8, nl3Var9, i50, i51, i52, i53, i23);
                        int d = y88Var5.d() + i54;
                        int max = Math.max(i55, y88Var5.c());
                        if (i56 > 0) {
                            d += this.Q0;
                        }
                        i55 = max;
                        i54 = d;
                        nl3Var6 = nl3Var11;
                        i50 = 0;
                    }
                }
                iArr[0] = i54;
                iArr[1] = i55;
            }
        } else {
            if (i33 == 2) {
                i6 = i20;
                i7 = i21;
                i8 = i22;
                iArr = iArr2;
                i9 = i32;
                int i57 = this.W0;
                int i58 = this.V0;
                if (i57 == 0) {
                    if (i58 <= 0) {
                        int i59 = 0;
                        i13 = 0;
                        for (int i60 = 0; i60 < i5; i60++) {
                            if (i60 > 0) {
                                i59 += this.Q0;
                            }
                            wm3 wm3Var6 = wm3VarArr2[i60];
                            if (wm3Var6 != null) {
                                int b02 = b0(wm3Var6, i23) + i59;
                                if (b02 > i23) {
                                    break;
                                }
                                i13++;
                                i59 = b02;
                            }
                        }
                    } else {
                        i13 = i58;
                    }
                    i58 = 0;
                } else {
                    if (i58 <= 0) {
                        int i61 = 0;
                        int i62 = 0;
                        for (int i63 = 0; i63 < i5; i63++) {
                            if (i63 > 0) {
                                i61 += this.R0;
                            }
                            wm3 wm3Var7 = wm3VarArr2[i63];
                            if (wm3Var7 != null) {
                                int a02 = a0(wm3Var7, i23) + i61;
                                if (a02 > i23) {
                                    break;
                                }
                                i62++;
                                i61 = a02;
                            }
                        }
                        i58 = i62;
                    }
                    i13 = 0;
                }
                if (this.a1 == null) {
                    this.a1 = new int[2];
                }
                boolean z4 = (i58 == 0 && i57 == 1) || (i13 == 0 && i57 == 0);
                while (!z4) {
                    if (i57 == 0) {
                        i58 = (int) Math.ceil(i5 / i13);
                    } else {
                        i13 = (int) Math.ceil(i5 / i58);
                    }
                    wm3[] wm3VarArr3 = this.Z0;
                    if (wm3VarArr3 == null || wm3VarArr3.length < i13) {
                        obj = null;
                        this.Z0 = new wm3[i13];
                    } else {
                        obj = null;
                        Arrays.fill(wm3VarArr3, (Object) null);
                    }
                    wm3[] wm3VarArr4 = this.Y0;
                    if (wm3VarArr4 == null || wm3VarArr4.length < i58) {
                        this.Y0 = new wm3[i58];
                    } else {
                        Arrays.fill(wm3VarArr4, obj);
                    }
                    for (int i64 = 0; i64 < i13; i64++) {
                        for (int i65 = 0; i65 < i58; i65++) {
                            int i66 = (i65 * i13) + i64;
                            if (i57 == 1) {
                                i66 = (i64 * i58) + i65;
                            }
                            if (i66 < wm3VarArr2.length && (wm3Var = wm3VarArr2[i66]) != null) {
                                int b03 = b0(wm3Var, i23);
                                wm3 wm3Var8 = this.Z0[i64];
                                if (wm3Var8 == null || wm3Var8.r() < b03) {
                                    this.Z0[i64] = wm3Var;
                                }
                                int a03 = a0(wm3Var, i23);
                                wm3 wm3Var9 = this.Y0[i65];
                                if (wm3Var9 == null || wm3Var9.l() < a03) {
                                    this.Y0[i65] = wm3Var;
                                }
                            }
                        }
                    }
                    int i67 = 0;
                    for (int i68 = 0; i68 < i13; i68++) {
                        wm3 wm3Var10 = this.Z0[i68];
                        if (wm3Var10 != null) {
                            if (i68 > 0) {
                                i67 += this.Q0;
                            }
                            i67 = b0(wm3Var10, i23) + i67;
                        }
                    }
                    int i69 = 0;
                    for (int i70 = 0; i70 < i58; i70++) {
                        wm3 wm3Var11 = this.Y0[i70];
                        if (wm3Var11 != null) {
                            if (i70 > 0) {
                                i69 += this.R0;
                            }
                            i69 = a0(wm3Var11, i23) + i69;
                        }
                    }
                    iArr[0] = i67;
                    iArr[1] = i69;
                    if (i57 == 0) {
                        if (i67 > i23 && i13 > 1) {
                            i13--;
                        }
                        z4 = true;
                    } else {
                        if (i69 > i23 && i58 > 1) {
                            i58--;
                        }
                        z4 = true;
                    }
                }
                int[] iArr4 = this.a1;
                iArr4[0] = i13;
                iArr4[1] = i58;
                c = 1;
                int i3622 = iArr[i28] + i9 + i6;
                int i3722 = iArr[c] + i7 + i8;
                if (i != 1073741824) {
                    i3622 = i2;
                } else if (i == Integer.MIN_VALUE) {
                    i3622 = Math.min(i3622, i2);
                } else if (i != 0) {
                    i3622 = i28;
                }
                if (i3 != 1073741824) {
                    i3722 = i4;
                } else if (i3 == Integer.MIN_VALUE) {
                    i3722 = Math.min(i3722, i4);
                } else if (i3 != 0) {
                    i3722 = i28;
                }
                this.A0 = i3622;
                this.B0 = i3722;
                S(i3622);
                N(i3722);
                this.z0 = this.s0 <= 0 ? c : i28;
            }
            if (i33 == 3) {
                int i71 = this.W0;
                if (i5 != 0) {
                    arrayList.clear();
                    i8 = i22;
                    i9 = i32;
                    iArr = iArr2;
                    i6 = i20;
                    i7 = i21;
                    y88 y88Var6 = new y88(this, i71, this.J, this.K, this.L, this.M, i23);
                    arrayList.add(y88Var6);
                    if (i71 == 0) {
                        int i72 = 0;
                        int i73 = 0;
                        i14 = 0;
                        int i74 = 0;
                        while (i72 < i5) {
                            i73++;
                            nl3 nl3Var12 = nl3Var5;
                            wm3 wm3Var12 = wm3VarArr2[i72];
                            int b04 = b0(wm3Var12, i23);
                            int i75 = i71;
                            int i76 = i72;
                            if (wm3Var12.q0[0] == 3) {
                                i14++;
                            }
                            int i77 = i14;
                            boolean z5 = (i74 == i23 || (this.Q0 + i74) + b04 > i23) && y88Var6.b != null;
                            if (!z5 && i76 > 0 && (i17 = this.V0) > 0 && i73 > i17) {
                                z5 = true;
                            }
                            if (z5) {
                                i71 = i75;
                                i16 = i76;
                                y88Var6 = new y88(this, i71, this.J, this.K, this.L, this.M, i23);
                                y88Var6.n = i16;
                                arrayList.add(y88Var6);
                                i74 = b04;
                                i73 = 1;
                            } else {
                                i71 = i75;
                                i16 = i76;
                                i74 = i16 > 0 ? this.Q0 + b04 + i74 : b04;
                            }
                            y88Var6.a(wm3Var12);
                            i72 = i16 + 1;
                            i14 = i77;
                            nl3Var5 = nl3Var12;
                        }
                        nl3Var = nl3Var5;
                    } else {
                        nl3Var = nl3Var5;
                        int i78 = 0;
                        int i79 = 0;
                        int i80 = 0;
                        int i81 = 0;
                        while (i81 < i5) {
                            i78++;
                            wm3 wm3Var13 = wm3VarArr2[i81];
                            int a04 = a0(wm3Var13, i23);
                            int i82 = i71;
                            if (wm3Var13.q0[1] == 3) {
                                i79++;
                            }
                            int i83 = i79;
                            boolean z6 = (i80 == i23 || (this.R0 + i80) + a04 > i23) && y88Var6.b != null;
                            if (!z6 && i81 > 0 && (i15 = this.V0) > 0 && i78 > i15) {
                                z6 = true;
                            }
                            if (z6) {
                                i71 = i82;
                                y88Var6 = new y88(this, i71, this.J, this.K, this.L, this.M, i23);
                                y88Var6.n = i81;
                                arrayList.add(y88Var6);
                                i80 = a04;
                                i78 = 1;
                            } else {
                                i71 = i82;
                                i80 = i81 > 0 ? this.R0 + a04 + i80 : a04;
                            }
                            y88Var6.a(wm3Var13);
                            i81++;
                            i79 = i83;
                        }
                        i14 = i79;
                    }
                    int size2 = arrayList.size();
                    int i84 = this.x0;
                    int i85 = this.t0;
                    int i86 = this.y0;
                    int i87 = this.u0;
                    boolean z7 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i14 > 0 && z7) {
                        for (int i88 = 0; i88 < size2; i88++) {
                            y88 y88Var7 = (y88) arrayList.get(i88);
                            if (i71 == 0) {
                                y88Var7.e(i23 - y88Var7.d());
                            } else {
                                y88Var7.e(i23 - y88Var7.c());
                            }
                        }
                    }
                    int i89 = i84;
                    int i90 = i85;
                    int i91 = i86;
                    int i92 = i87;
                    nl3 nl3Var13 = nl3Var3;
                    nl3 nl3Var14 = nl3Var2;
                    int i93 = 0;
                    int i94 = 0;
                    nl3 nl3Var15 = nl3Var4;
                    nl3 nl3Var16 = nl3Var;
                    for (int i95 = 0; i95 < size2; i95++) {
                        y88 y88Var8 = (y88) arrayList.get(i95);
                        if (i71 == 0) {
                            if (i95 < size2 - 1) {
                                nl3Var16 = ((y88) arrayList.get(i95 + 1)).b.K;
                                i92 = 0;
                            } else {
                                i92 = this.u0;
                                nl3Var16 = nl3Var;
                            }
                            nl3 nl3Var17 = y88Var8.b.M;
                            y88Var8.f(i71, nl3Var13, nl3Var14, nl3Var15, nl3Var16, i89, i90, i91, i92, i23);
                            i93 = Math.max(i93, y88Var8.d());
                            int c3 = y88Var8.c() + i94;
                            if (i95 > 0) {
                                c3 += this.R0;
                            }
                            i94 = c3;
                            nl3Var14 = nl3Var17;
                            i90 = 0;
                        } else {
                            if (i95 < size2 - 1) {
                                nl3Var15 = ((y88) arrayList.get(i95 + 1)).b.J;
                                i91 = 0;
                            } else {
                                i91 = this.y0;
                                nl3Var15 = nl3Var4;
                            }
                            nl3 nl3Var18 = y88Var8.b.L;
                            y88Var8.f(i71, nl3Var13, nl3Var14, nl3Var15, nl3Var16, i89, i90, i91, i92, i23);
                            int d2 = y88Var8.d() + i93;
                            int max2 = Math.max(i94, y88Var8.c());
                            if (i95 > 0) {
                                d2 += this.Q0;
                            }
                            i94 = max2;
                            i93 = d2;
                            nl3Var13 = nl3Var18;
                            i89 = 0;
                        }
                    }
                    iArr[0] = i93;
                    iArr[1] = i94;
                }
            }
            i6 = i20;
            i7 = i21;
            i8 = i22;
            iArr = iArr2;
            i9 = i32;
        }
        c = 1;
        int i36222 = iArr[i28] + i9 + i6;
        int i37222 = iArr[c] + i7 + i8;
        if (i != 1073741824) {
        }
        if (i3 != 1073741824) {
        }
        this.A0 = i36222;
        this.B0 = i37222;
        S(i36222);
        N(i37222);
        this.z0 = this.s0 <= 0 ? c : i28;
    }

    public final int a0(wm3 wm3Var, int i) {
        wm3 wm3Var2;
        if (wm3Var != null) {
            int[] iArr = wm3Var.q0;
            if (iArr[1] == 3) {
                int i2 = wm3Var.t;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (wm3Var.A * i);
                        if (i3 != wm3Var.l()) {
                            wm3Var.g = true;
                            Z(iArr[0], wm3Var.r(), 1, i3, wm3Var);
                        }
                        return i3;
                    }
                    wm3Var2 = wm3Var;
                    if (i2 == 1) {
                        return wm3Var2.l();
                    }
                    if (i2 == 3) {
                        return (int) ((wm3Var2.r() * wm3Var2.X) + 0.5f);
                    }
                }
            } else {
                wm3Var2 = wm3Var;
            }
            return wm3Var2.l();
        }
        return 0;
    }

    public final int b0(wm3 wm3Var, int i) {
        wm3 wm3Var2;
        if (wm3Var != null) {
            int[] iArr = wm3Var.q0;
            if (iArr[0] == 3) {
                int i2 = wm3Var.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (wm3Var.x * i);
                        if (i3 != wm3Var.r()) {
                            wm3Var.g = true;
                            Z(1, i3, iArr[1], wm3Var.l(), wm3Var);
                        }
                        return i3;
                    }
                    wm3Var2 = wm3Var;
                    if (i2 == 1) {
                        return wm3Var2.r();
                    }
                    if (i2 == 3) {
                        return (int) ((wm3Var2.l() * wm3Var2.X) + 0.5f);
                    }
                }
            } else {
                wm3Var2 = wm3Var;
            }
            return wm3Var2.r();
        }
        return 0;
    }

    @Override // defpackage.wm3
    public final void c(h8b h8bVar, boolean z) {
        wm3 wm3Var;
        float f;
        int i;
        super.c(h8bVar, z);
        xm3 xm3Var = this.U;
        boolean z2 = xm3Var != null && xm3Var.w0;
        int i2 = this.U0;
        ArrayList arrayList = this.X0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((y88) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((y88) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.a1 != null && this.Z0 != null && this.Y0 != null) {
                for (int i5 = 0; i5 < this.c1; i5++) {
                    this.b1[i5].E();
                }
                int[] iArr = this.a1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.K0;
                wm3 wm3Var2 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.K0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    wm3 wm3Var3 = this.Z0[i];
                    if (wm3Var3 != null) {
                        nl3 nl3Var = wm3Var3.J;
                        if (wm3Var3.h0 != 8) {
                            if (i8 == 0) {
                                wm3Var3.g(nl3Var, this.J, this.x0);
                                wm3Var3.j0 = this.E0;
                                wm3Var3.e0 = f;
                            }
                            if (i8 == i6 - 1) {
                                wm3Var3.g(wm3Var3.L, this.L, this.y0);
                            }
                            if (i8 > 0 && wm3Var2 != null) {
                                nl3 nl3Var2 = wm3Var2.L;
                                wm3Var3.g(nl3Var, nl3Var2, this.Q0);
                                wm3Var2.g(nl3Var2, nl3Var, 0);
                            }
                            wm3Var2 = wm3Var3;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    wm3 wm3Var4 = this.Y0[i9];
                    if (wm3Var4 != null) {
                        nl3 nl3Var3 = wm3Var4.K;
                        if (wm3Var4.h0 != 8) {
                            if (i9 == 0) {
                                wm3Var4.g(nl3Var3, this.K, this.t0);
                                wm3Var4.k0 = this.F0;
                                wm3Var4.f0 = this.L0;
                            }
                            if (i9 == i7 - 1) {
                                wm3Var4.g(wm3Var4.M, this.M, this.u0);
                            }
                            if (i9 > 0 && wm3Var2 != null) {
                                nl3 nl3Var4 = wm3Var2.M;
                                wm3Var4.g(nl3Var3, nl3Var4, this.R0);
                                wm3Var2.g(nl3Var4, nl3Var3, 0);
                            }
                            wm3Var2 = wm3Var4;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.W0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        wm3[] wm3VarArr = this.b1;
                        if (i12 < wm3VarArr.length && (wm3Var = wm3VarArr[i12]) != null && wm3Var.h0 != 8) {
                            wm3 wm3Var5 = this.Z0[i10];
                            wm3 wm3Var6 = this.Y0[i11];
                            if (wm3Var != wm3Var5) {
                                wm3Var.g(wm3Var.J, wm3Var5.J, 0);
                                wm3Var.g(wm3Var.L, wm3Var5.L, 0);
                            }
                            if (wm3Var != wm3Var6) {
                                wm3Var.g(wm3Var.K, wm3Var6.K, 0);
                                wm3Var.g(wm3Var.M, wm3Var6.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((y88) arrayList.get(0)).b(0, z2, true);
        }
        this.z0 = false;
    }
}
