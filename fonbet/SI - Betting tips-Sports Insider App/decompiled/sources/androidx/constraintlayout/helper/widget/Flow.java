package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.s;
import androidx.constraintlayout.widget.u;
import java.util.ArrayList;
import java.util.Arrays;
import x.c;
import x.d;
import x.f;
import x.g;
import x.h;
import y.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Flow extends u {
    public g j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.u, androidx.constraintlayout.widget.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f25356s0 = 0;
        gVar.f25357t0 = 0;
        gVar.f25358u0 = 0;
        gVar.f25359v0 = 0;
        gVar.f25360w0 = 0;
        gVar.x0 = 0;
        gVar.f25361y0 = false;
        gVar.z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f25355b1 = 0;
        this.j = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1216b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 0) {
                    this.j.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f25356s0 = dimensionPixelSize;
                    gVar2.f25357t0 = dimensionPixelSize;
                    gVar2.f25358u0 = dimensionPixelSize;
                    gVar2.f25359v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f25358u0 = dimensionPixelSize2;
                    gVar3.f25360w0 = dimensionPixelSize2;
                    gVar3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.j.f25359v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.j.f25360w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.j.f25356s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.j.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.j.f25357t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.j.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.j.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.j.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.j.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.j.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.j.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.j.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.j.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.j.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.j.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.j.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.j.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.j.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.j.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.j.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.j.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.j.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.j.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1064d = this.j;
        i();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void h(d dVar, boolean z5) {
        g gVar = this.j;
        int i5 = gVar.f25358u0;
        if (i5 > 0 || gVar.f25359v0 > 0) {
            if (z5) {
                gVar.f25360w0 = gVar.f25359v0;
                gVar.x0 = i5;
            } else {
                gVar.f25360w0 = i5;
                gVar.x0 = gVar.f25359v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0759  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // androidx.constraintlayout.widget.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        d[] dVarArr;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        int i19;
        f fVar;
        char c2;
        ?? r12;
        boolean z5;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        d dVar;
        boolean z7;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        c cVar;
        c cVar2;
        c cVar3;
        ArrayList arrayList;
        int i31;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = gVar.f25320p0;
        c cVar4 = gVar.J;
        c cVar5 = gVar.I;
        c cVar6 = gVar.K;
        c cVar7 = gVar.L;
        ArrayList arrayList2 = gVar.W0;
        if (gVar.f25369r0 > 0) {
            b bVar = gVar.B0;
            d dVar2 = gVar.T;
            e eVar = dVar2 != null ? ((x.e) dVar2).f25334u0 : null;
            if (eVar == null) {
                gVar.z0 = 0;
                gVar.A0 = 0;
                gVar.f25361y0 = false;
                setMeasuredDimension(gVar.z0, gVar.A0);
            }
            int i32 = 0;
            while (i32 < gVar.f25369r0) {
                d dVar3 = gVar.f25368q0[i32];
                if (dVar3 == null) {
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    if (!(dVar3 instanceof h)) {
                        cVar2 = cVar6;
                        int j = dVar3.j(0);
                        cVar3 = cVar7;
                        int j6 = dVar3.j(1);
                        arrayList = arrayList2;
                        if (j == 3) {
                            i31 = i32;
                            if (dVar3.f25321r != 1 && j6 == 3 && dVar3.f25322s != 1) {
                                i32 = i31 + 1;
                                cVar5 = cVar;
                                cVar6 = cVar2;
                                cVar7 = cVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i31 = i32;
                        }
                        if (j == 3) {
                            j = 2;
                        }
                        if (j6 == 3) {
                            j6 = 2;
                        }
                        bVar.f25478a = j;
                        bVar.f25479b = j6;
                        bVar.f25480c = dVar3.q();
                        bVar.f25481d = dVar3.k();
                        eVar.b(dVar3, bVar);
                        dVar3.O(bVar.f25482e);
                        dVar3.L(bVar.f25483f);
                        dVar3.I(bVar.f25484g);
                        i32 = i31 + 1;
                        cVar5 = cVar;
                        cVar6 = cVar2;
                        cVar7 = cVar3;
                        arrayList2 = arrayList;
                    }
                }
                cVar2 = cVar6;
                cVar3 = cVar7;
                arrayList = arrayList2;
                i31 = i32;
                i32 = i31 + 1;
                cVar5 = cVar;
                cVar6 = cVar2;
                cVar7 = cVar3;
                arrayList2 = arrayList;
            }
        }
        c cVar8 = cVar5;
        c cVar9 = cVar6;
        c cVar10 = cVar7;
        ArrayList arrayList3 = arrayList2;
        int i33 = gVar.f25360w0;
        int i34 = gVar.x0;
        int i35 = gVar.f25356s0;
        int i36 = gVar.f25357t0;
        int[] iArr3 = new int[2];
        int i37 = (size - i33) - i34;
        int i38 = gVar.V0;
        if (i38 == 1) {
            i37 = (size2 - i35) - i36;
        }
        int i39 = i37;
        if (i38 == 0) {
            if (gVar.D0 == -1) {
                i30 = 0;
                gVar.D0 = 0;
            } else {
                i30 = 0;
            }
            i11 = i34;
            if (gVar.E0 == -1) {
                gVar.E0 = i30;
            }
        } else {
            i11 = i34;
            if (gVar.D0 == -1) {
                gVar.D0 = 0;
            }
            if (gVar.E0 == -1) {
                gVar.E0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f25368q0;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            i12 = gVar.f25369r0;
            i13 = i35;
            if (i40 >= i12) {
                break;
            }
            if (gVar.f25368q0[i40].f25305g0 == 8) {
                i41++;
            }
            i40++;
            i35 = i13;
        }
        if (i41 > 0) {
            dVarArr = new d[i12 - i41];
            int i42 = 0;
            int i43 = 0;
            while (i42 < gVar.f25369r0) {
                d dVar4 = gVar.f25368q0[i42];
                d[] dVarArr3 = dVarArr;
                if (dVar4.f25305g0 != 8) {
                    dVarArr3[i43] = dVar4;
                    i43++;
                }
                i42++;
                dVarArr = dVarArr3;
            }
            i14 = i43;
        } else {
            i14 = i12;
            dVarArr = dVarArr2;
        }
        gVar.f25354a1 = dVarArr;
        gVar.f25355b1 = i14;
        int i44 = gVar.T0;
        if (i44 == 0) {
            d[] dVarArr4 = dVarArr;
            int i45 = i14;
            i15 = i36;
            iArr = iArr3;
            i16 = size2;
            i17 = i33;
            i18 = i11;
            i19 = i13;
            int i46 = gVar.V0;
            if (i45 != 0) {
                if (arrayList3.size() == 0) {
                    fVar = new f(gVar, i46, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                    arrayList3.add(fVar);
                } else {
                    f fVar2 = (f) arrayList3.get(0);
                    fVar2.f25340c = 0;
                    fVar2.f25339b = null;
                    fVar2.f25348l = 0;
                    fVar2.f25349m = 0;
                    fVar2.f25350n = 0;
                    fVar2.f25351o = 0;
                    fVar2.f25352p = 0;
                    fVar2.f(i46, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f25360w0, gVar.f25356s0, gVar.x0, gVar.f25357t0, i39);
                    fVar = fVar2;
                }
                for (int i47 = 0; i47 < i45; i47++) {
                    fVar.a(dVarArr4[i47]);
                }
                c2 = 0;
                iArr[0] = fVar.d();
                r12 = 1;
                iArr[1] = fVar.c();
                int i48 = iArr[c2] + i17 + i18;
                int i49 = iArr[r12] + i19 + i15;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                gVar.z0 = size;
                gVar.A0 = r0;
                gVar.O(size);
                gVar.L(r0);
                gVar.f25361y0 = gVar.f25369r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.z0, gVar.A0);
            }
        } else {
            if (i44 != 1) {
                if (i44 == 2) {
                    d[] dVarArr5 = dVarArr;
                    int i50 = i14;
                    i15 = i36;
                    iArr = iArr3;
                    i16 = size2;
                    i17 = i33;
                    i18 = i11;
                    i19 = i13;
                    int i51 = gVar.V0;
                    if (i51 == 0) {
                        int i52 = gVar.U0;
                        if (i52 <= 0) {
                            int i53 = 0;
                            i24 = 0;
                            for (int i54 = 0; i54 < i50; i54++) {
                                if (i54 > 0) {
                                    i53 += gVar.P0;
                                }
                                d dVar5 = dVarArr5[i54];
                                if (dVar5 != null) {
                                    int U = gVar.U(dVar5, i39) + i53;
                                    if (U > i39) {
                                        break;
                                    }
                                    i24++;
                                    i53 = U;
                                }
                            }
                        } else {
                            i24 = i52;
                        }
                        i23 = 0;
                    } else {
                        i23 = gVar.U0;
                        if (i23 <= 0) {
                            int i55 = 0;
                            int i56 = 0;
                            for (int i57 = 0; i57 < i50; i57++) {
                                if (i57 > 0) {
                                    i55 += gVar.Q0;
                                }
                                d dVar6 = dVarArr5[i57];
                                if (dVar6 != null) {
                                    int T = gVar.T(dVar6, i39) + i55;
                                    if (T > i39) {
                                        break;
                                    }
                                    i56++;
                                    i55 = T;
                                }
                            }
                            i23 = i56;
                        }
                        i24 = 0;
                    }
                    if (gVar.Z0 == null) {
                        gVar.Z0 = new int[2];
                    }
                    boolean z10 = (i23 == 0 && i51 == 1) || (i24 == 0 && i51 == 0);
                    while (!z10) {
                        if (i51 == 0) {
                            i23 = (int) Math.ceil(i50 / i24);
                        } else {
                            i24 = (int) Math.ceil(i50 / i23);
                        }
                        d[] dVarArr6 = gVar.Y0;
                        if (dVarArr6 == null || dVarArr6.length < i24) {
                            obj = null;
                            gVar.Y0 = new d[i24];
                        } else {
                            obj = null;
                            Arrays.fill(dVarArr6, (Object) null);
                        }
                        d[] dVarArr7 = gVar.X0;
                        if (dVarArr7 == null || dVarArr7.length < i23) {
                            gVar.X0 = new d[i23];
                        } else {
                            Arrays.fill(dVarArr7, obj);
                        }
                        for (int i58 = 0; i58 < i24; i58++) {
                            for (int i59 = 0; i59 < i23; i59++) {
                                int i60 = (i59 * i24) + i58;
                                if (i51 == 1) {
                                    i60 = (i58 * i23) + i59;
                                }
                                if (i60 < dVarArr5.length && (dVar = dVarArr5[i60]) != null) {
                                    int U2 = gVar.U(dVar, i39);
                                    d dVar7 = gVar.Y0[i58];
                                    if (dVar7 == null || dVar7.q() < U2) {
                                        gVar.Y0[i58] = dVar;
                                    }
                                    int T2 = gVar.T(dVar, i39);
                                    d dVar8 = gVar.X0[i59];
                                    if (dVar8 == null || dVar8.k() < T2) {
                                        gVar.X0[i59] = dVar;
                                    }
                                }
                            }
                        }
                        int i61 = 0;
                        for (int i62 = 0; i62 < i24; i62++) {
                            d dVar9 = gVar.Y0[i62];
                            if (dVar9 != null) {
                                if (i62 > 0) {
                                    i61 += gVar.P0;
                                }
                                i61 = gVar.U(dVar9, i39) + i61;
                            }
                        }
                        int i63 = 0;
                        for (int i64 = 0; i64 < i23; i64++) {
                            d dVar10 = gVar.X0[i64];
                            if (dVar10 != null) {
                                if (i64 > 0) {
                                    i63 += gVar.Q0;
                                }
                                i63 = gVar.T(dVar10, i39) + i63;
                            }
                        }
                        iArr[0] = i61;
                        iArr[1] = i63;
                        if (i51 == 0) {
                            if (i61 > i39 && i24 > 1) {
                                i24--;
                            }
                            z10 = true;
                        } else {
                            if (i63 > i39 && i23 > 1) {
                                i23--;
                            }
                            z10 = true;
                        }
                    }
                    z5 = true;
                    int[] iArr4 = gVar.Z0;
                    iArr4[0] = i24;
                    iArr4[1] = i23;
                } else if (i44 != 3) {
                    i15 = i36;
                    iArr = iArr3;
                    i16 = size2;
                    i17 = i33;
                    i18 = i11;
                    i19 = i13;
                } else {
                    int i65 = i14;
                    int i66 = gVar.V0;
                    if (i65 == 0) {
                        i15 = i36;
                        iArr = iArr3;
                        i16 = size2;
                        i17 = i33;
                        i18 = i11;
                        i19 = i13;
                        z7 = true;
                    } else {
                        arrayList3.clear();
                        d[] dVarArr8 = dVarArr;
                        i17 = i33;
                        i15 = i36;
                        i18 = i11;
                        i19 = i13;
                        iArr = iArr3;
                        z7 = true;
                        f fVar3 = new f(gVar, i66, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                        arrayList3.add(fVar3);
                        if (i66 == 0) {
                            int i67 = 0;
                            int i68 = 0;
                            i25 = 0;
                            int i69 = 0;
                            while (i67 < i65) {
                                i68++;
                                d dVar11 = dVarArr8[i67];
                                int U3 = gVar.U(dVar11, i39);
                                int i70 = i66;
                                int i71 = i67;
                                if (dVar11.f25320p0[0] == 3) {
                                    i25++;
                                }
                                int i72 = i25;
                                boolean z11 = (i69 == i39 || (gVar.P0 + i69) + U3 > i39) && fVar3.f25339b != null;
                                if (!z11 && i71 > 0 && (i29 = gVar.U0) > 0 && i68 > i29) {
                                    z11 = true;
                                }
                                if (z11) {
                                    i27 = size2;
                                    i66 = i70;
                                    i28 = i71;
                                    fVar3 = new f(gVar, i66, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                                    fVar3.f25350n = i28;
                                    arrayList3.add(fVar3);
                                    i68 = 1;
                                } else {
                                    i27 = size2;
                                    i66 = i70;
                                    i28 = i71;
                                    if (i28 > 0) {
                                        i69 = gVar.P0 + U3 + i69;
                                        fVar3.a(dVar11);
                                        i67 = i28 + 1;
                                        i25 = i72;
                                        size2 = i27;
                                    }
                                }
                                i69 = U3;
                                fVar3.a(dVar11);
                                i67 = i28 + 1;
                                i25 = i72;
                                size2 = i27;
                            }
                            i16 = size2;
                        } else {
                            i16 = size2;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            while (i73 < i65) {
                                i74++;
                                d dVar12 = dVarArr8[i73];
                                int T3 = gVar.T(dVar12, i39);
                                int i77 = i66;
                                if (dVar12.f25320p0[1] == 3) {
                                    i75++;
                                }
                                int i78 = i75;
                                boolean z12 = (i76 == i39 || (gVar.Q0 + i76) + T3 > i39) && fVar3.f25339b != null;
                                if (!z12 && i73 > 0 && (i26 = gVar.U0) > 0 && i74 > i26) {
                                    z12 = true;
                                }
                                if (z12) {
                                    i66 = i77;
                                    fVar3 = new f(gVar, i66, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                                    fVar3.f25350n = i73;
                                    arrayList3.add(fVar3);
                                    i74 = 1;
                                } else {
                                    i66 = i77;
                                    if (i73 > 0) {
                                        i76 = gVar.Q0 + T3 + i76;
                                        fVar3.a(dVar12);
                                        i73++;
                                        i75 = i78;
                                    }
                                }
                                i76 = T3;
                                fVar3.a(dVar12);
                                i73++;
                                i75 = i78;
                            }
                            i25 = i75;
                        }
                        int size3 = arrayList3.size();
                        int i79 = gVar.f25360w0;
                        int i80 = gVar.f25356s0;
                        int i81 = gVar.x0;
                        int i82 = gVar.f25357t0;
                        boolean z13 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i25 > 0 && z13) {
                            for (int i83 = 0; i83 < size3; i83++) {
                                f fVar4 = (f) arrayList3.get(i83);
                                if (i66 == 0) {
                                    fVar4.e(i39 - fVar4.d());
                                } else {
                                    fVar4.e(i39 - fVar4.c());
                                }
                            }
                        }
                        int i84 = i79;
                        int i85 = i80;
                        int i86 = i81;
                        int i87 = i82;
                        c cVar11 = cVar8;
                        c cVar12 = cVar9;
                        c cVar13 = cVar10;
                        c cVar14 = cVar4;
                        int i88 = 0;
                        int i89 = 0;
                        for (int i90 = 0; i90 < size3; i90++) {
                            f fVar5 = (f) arrayList3.get(i90);
                            if (i66 == 0) {
                                if (i90 < size3 - 1) {
                                    cVar13 = ((f) arrayList3.get(i90 + 1)).f25339b.J;
                                    i87 = 0;
                                } else {
                                    i87 = gVar.f25357t0;
                                    cVar13 = cVar10;
                                }
                                c cVar15 = fVar5.f25339b.L;
                                fVar5.f(i66, cVar11, cVar14, cVar12, cVar13, i84, i85, i86, i87, i39);
                                i88 = Math.max(i88, fVar5.d());
                                int c8 = fVar5.c() + i89;
                                if (i90 > 0) {
                                    c8 += gVar.Q0;
                                }
                                i89 = c8;
                                cVar14 = cVar15;
                                i85 = 0;
                            } else {
                                if (i90 < size3 - 1) {
                                    cVar12 = ((f) arrayList3.get(i90 + 1)).f25339b.I;
                                    i86 = 0;
                                } else {
                                    i86 = gVar.x0;
                                    cVar12 = cVar9;
                                }
                                c cVar16 = fVar5.f25339b.K;
                                fVar5.f(i66, cVar11, cVar14, cVar12, cVar13, i84, i85, i86, i87, i39);
                                int d10 = fVar5.d() + i88;
                                int max = Math.max(i89, fVar5.c());
                                if (i90 > 0) {
                                    d10 += gVar.P0;
                                }
                                i89 = max;
                                i88 = d10;
                                cVar11 = cVar16;
                                i84 = 0;
                            }
                        }
                        iArr[0] = i88;
                        iArr[1] = i89;
                    }
                    z5 = z7;
                }
                c2 = 0;
                r12 = z5;
                int i482 = iArr[c2] + i17 + i18;
                int i492 = iArr[r12] + i19 + i15;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i482, size) : mode == 0 ? i482 : 0;
                }
                int min = mode2 == 1073741824 ? i16 : mode2 == Integer.MIN_VALUE ? Math.min(i492, i16) : mode2 == 0 ? i492 : 0;
                gVar.z0 = size;
                gVar.A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f25361y0 = gVar.f25369r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.z0, gVar.A0);
            }
            i15 = i36;
            iArr = iArr3;
            i16 = size2;
            i17 = i33;
            i18 = i11;
            i19 = i13;
            int i91 = i14;
            d[] dVarArr9 = dVarArr;
            int i92 = gVar.V0;
            if (i91 != 0) {
                arrayList3.clear();
                f fVar6 = new f(gVar, i92, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                arrayList3.add(fVar6);
                if (i92 == 0) {
                    int i93 = 0;
                    i20 = 0;
                    int i94 = 0;
                    while (i93 < i91) {
                        d dVar13 = dVarArr9[i93];
                        int U4 = gVar.U(dVar13, i39);
                        if (dVar13.f25320p0[0] == 3) {
                            i20++;
                        }
                        int i95 = i20;
                        boolean z14 = (i94 == i39 || (gVar.P0 + i94) + U4 > i39) && fVar6.f25339b != null;
                        if (!z14 && i93 > 0 && (i22 = gVar.U0) > 0 && i93 % i22 == 0) {
                            z14 = true;
                        }
                        if (z14) {
                            fVar6 = new f(gVar, i92, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                            fVar6.f25350n = i93;
                            arrayList3.add(fVar6);
                        } else if (i93 > 0) {
                            i94 = gVar.P0 + U4 + i94;
                            fVar6.a(dVar13);
                            i93++;
                            i20 = i95;
                        }
                        i94 = U4;
                        fVar6.a(dVar13);
                        i93++;
                        i20 = i95;
                    }
                } else {
                    int i96 = 0;
                    i20 = 0;
                    int i97 = 0;
                    while (i96 < i91) {
                        d dVar14 = dVarArr9[i96];
                        int T4 = gVar.T(dVar14, i39);
                        if (dVar14.f25320p0[1] == 3) {
                            i20++;
                        }
                        int i98 = i20;
                        boolean z15 = (i97 == i39 || (gVar.Q0 + i97) + T4 > i39) && fVar6.f25339b != null;
                        if (!z15 && i96 > 0 && (i21 = gVar.U0) > 0 && i96 % i21 == 0) {
                            z15 = true;
                        }
                        if (z15) {
                            fVar6 = new f(gVar, i92, gVar.I, gVar.J, gVar.K, gVar.L, i39);
                            fVar6.f25350n = i96;
                            arrayList3.add(fVar6);
                        } else if (i96 > 0) {
                            i97 = gVar.Q0 + T4 + i97;
                            fVar6.a(dVar14);
                            i96++;
                            i20 = i98;
                        }
                        i97 = T4;
                        fVar6.a(dVar14);
                        i96++;
                        i20 = i98;
                    }
                }
                int size4 = arrayList3.size();
                int i99 = gVar.f25360w0;
                int i100 = gVar.f25356s0;
                int i101 = gVar.x0;
                int i102 = gVar.f25357t0;
                boolean z16 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i20 > 0 && z16) {
                    for (int i103 = 0; i103 < size4; i103++) {
                        f fVar7 = (f) arrayList3.get(i103);
                        if (i92 == 0) {
                            fVar7.e(i39 - fVar7.d());
                        } else {
                            fVar7.e(i39 - fVar7.c());
                        }
                    }
                }
                int i104 = i99;
                int i105 = i100;
                int i106 = i101;
                int i107 = i102;
                c cVar17 = cVar8;
                c cVar18 = cVar9;
                c cVar19 = cVar10;
                c cVar20 = cVar4;
                int i108 = 0;
                int i109 = 0;
                for (int i110 = 0; i110 < size4; i110++) {
                    f fVar8 = (f) arrayList3.get(i110);
                    if (i92 == 0) {
                        if (i110 < size4 - 1) {
                            cVar19 = ((f) arrayList3.get(i110 + 1)).f25339b.J;
                            i107 = 0;
                        } else {
                            i107 = gVar.f25357t0;
                            cVar19 = cVar10;
                        }
                        c cVar21 = fVar8.f25339b.L;
                        fVar8.f(i92, cVar17, cVar20, cVar18, cVar19, i104, i105, i106, i107, i39);
                        i108 = Math.max(i108, fVar8.d());
                        int c10 = fVar8.c() + i109;
                        if (i110 > 0) {
                            c10 += gVar.Q0;
                        }
                        i109 = c10;
                        cVar20 = cVar21;
                        i105 = 0;
                    } else {
                        if (i110 < size4 - 1) {
                            cVar18 = ((f) arrayList3.get(i110 + 1)).f25339b.I;
                            i106 = 0;
                        } else {
                            i106 = gVar.x0;
                            cVar18 = cVar9;
                        }
                        c cVar22 = fVar8.f25339b.K;
                        fVar8.f(i92, cVar17, cVar20, cVar18, cVar19, i104, i105, i106, i107, i39);
                        int d11 = fVar8.d() + i108;
                        int max2 = Math.max(i109, fVar8.c());
                        if (i110 > 0) {
                            d11 += gVar.P0;
                        }
                        i109 = max2;
                        i108 = d11;
                        cVar17 = cVar22;
                        i104 = 0;
                    }
                }
                iArr[0] = i108;
                iArr[1] = i109;
            }
        }
        z5 = true;
        c2 = 0;
        r12 = z5;
        int i4822 = iArr[c2] + i17 + i18;
        int i4922 = iArr[r12] + i19 + i15;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        gVar.z0 = size;
        gVar.A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f25361y0 = gVar.f25369r0 > 0 ? r12 : false;
        setMeasuredDimension(gVar.z0, gVar.A0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public final void onMeasure(int i5, int i10) {
        j(this.j, i5, i10);
    }

    public void setFirstHorizontalBias(float f6) {
        this.j.L0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i5) {
        this.j.F0 = i5;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.j.M0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i5) {
        this.j.G0 = i5;
        requestLayout();
    }

    public void setHorizontalAlign(int i5) {
        this.j.R0 = i5;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.j.J0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i5) {
        this.j.P0 = i5;
        requestLayout();
    }

    public void setHorizontalStyle(int i5) {
        this.j.D0 = i5;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.j.N0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i5) {
        this.j.H0 = i5;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.j.O0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i5) {
        this.j.I0 = i5;
        requestLayout();
    }

    public void setMaxElementsWrap(int i5) {
        this.j.U0 = i5;
        requestLayout();
    }

    public void setOrientation(int i5) {
        this.j.V0 = i5;
        requestLayout();
    }

    public void setPadding(int i5) {
        g gVar = this.j;
        gVar.f25356s0 = i5;
        gVar.f25357t0 = i5;
        gVar.f25358u0 = i5;
        gVar.f25359v0 = i5;
        requestLayout();
    }

    public void setPaddingBottom(int i5) {
        this.j.f25357t0 = i5;
        requestLayout();
    }

    public void setPaddingLeft(int i5) {
        this.j.f25360w0 = i5;
        requestLayout();
    }

    public void setPaddingRight(int i5) {
        this.j.x0 = i5;
        requestLayout();
    }

    public void setPaddingTop(int i5) {
        this.j.f25356s0 = i5;
        requestLayout();
    }

    public void setVerticalAlign(int i5) {
        this.j.S0 = i5;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.j.K0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i5) {
        this.j.Q0 = i5;
        requestLayout();
    }

    public void setVerticalStyle(int i5) {
        this.j.E0 = i5;
        requestLayout();
    }

    public void setWrapMode(int i5) {
        this.j.T0 = i5;
        requestLayout();
    }
}
