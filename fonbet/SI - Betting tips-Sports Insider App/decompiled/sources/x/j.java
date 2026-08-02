package x;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f25370a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
    
        if (r7.f25287d == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.f25287d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, v.c cVar, ArrayList arrayList, int i5) {
        int i10;
        b[] bVarArr;
        int i11;
        int i12;
        c[] cVarArr;
        boolean z5;
        d dVar;
        float f6;
        boolean z7;
        boolean z10;
        int i13;
        d dVar2;
        v.c cVar2;
        d dVar3;
        v.g gVar;
        c cVar3;
        v.g gVar2;
        d dVar4;
        int i14;
        c cVar4;
        v.g gVar3;
        d dVar5;
        c[] cVarArr2;
        d dVar6;
        int i15;
        c cVar5;
        c[] cVarArr3;
        int i16;
        c cVar6;
        v.g gVar4;
        v.g gVar5;
        int size;
        ArrayList arrayList2;
        int i17;
        d dVar7;
        int i18;
        float f10;
        int i19;
        float f11;
        d dVar8;
        int i20;
        boolean z11;
        int i21;
        int i22;
        d dVar9;
        c cVar7;
        d dVar10;
        e eVar2 = eVar;
        v.c cVar8 = cVar;
        ArrayList arrayList3 = arrayList;
        if (i5 == 0) {
            i10 = eVar2.z0;
            bVarArr = eVar2.C0;
            i11 = 0;
        } else {
            i10 = eVar2.A0;
            bVarArr = eVar2.B0;
            i11 = 2;
        }
        int i23 = i10;
        b[] bVarArr2 = bVarArr;
        int i24 = 0;
        while (i24 < i23) {
            b bVar = bVarArr2[i24];
            boolean z12 = bVar.q;
            d dVar11 = bVar.f25269a;
            c[] cVarArr4 = dVar11.Q;
            int i25 = 3;
            int i26 = 8;
            float f12 = 0.0f;
            if (z12) {
                i12 = i24;
            } else {
                int i27 = bVar.f25279l;
                int i28 = i27 * 2;
                d dVar12 = dVar11;
                d dVar13 = dVar12;
                boolean z13 = false;
                while (!z13) {
                    bVar.f25277i++;
                    d[] dVarArr = dVar12.f25314m0;
                    c[] cVarArr5 = dVar12.Q;
                    dVarArr[i27] = null;
                    dVar12.f25312l0[i27] = null;
                    if (dVar12.f25305g0 != i26) {
                        dVar12.j(i27);
                        cVarArr5[i28].e();
                        int i29 = i28 + 1;
                        cVarArr5[i29].e();
                        cVarArr5[i28].e();
                        cVarArr5[i29].e();
                        if (bVar.f25270b == null) {
                            bVar.f25270b = dVar12;
                        }
                        bVar.f25272d = dVar12;
                        int i30 = dVar12.f25320p0[i27];
                        if (i30 == i25) {
                            int i31 = dVar12.f25323t[i27];
                            if (i31 == 0 || i31 == i25 || i31 == 2) {
                                bVar.j++;
                                float f13 = dVar12.k0[i27];
                                if (f13 > 0.0f) {
                                    i21 = i24;
                                    bVar.f25278k += f13;
                                } else {
                                    i21 = i24;
                                }
                                i22 = i27;
                                if (dVar12.f25305g0 != 8 && i30 == 3 && (i31 == 0 || i31 == 3)) {
                                    if (f13 < 0.0f) {
                                        bVar.f25281n = true;
                                    } else {
                                        bVar.f25282o = true;
                                    }
                                    if (bVar.f25276h == null) {
                                        bVar.f25276h = new ArrayList();
                                    }
                                    bVar.f25276h.add(dVar12);
                                }
                                if (bVar.f25274f == null) {
                                    bVar.f25274f = dVar12;
                                }
                                d dVar14 = bVar.f25275g;
                                if (dVar14 != null) {
                                    dVar14.f25312l0[i22] = dVar12;
                                }
                                bVar.f25275g = dVar12;
                            } else {
                                i21 = i24;
                                i22 = i27;
                            }
                            if (i22 == 0) {
                                if (dVar12.f25321r == 0 && dVar12.f25324u == 0) {
                                    int i32 = dVar12.f25325v;
                                }
                            } else if (dVar12.f25322s == 0 && dVar12.f25327x == 0) {
                                int i33 = dVar12.f25328y;
                            }
                            dVar9 = dVar13;
                            if (dVar9 != dVar12) {
                                dVar9.f25314m0[i22] = dVar12;
                            }
                            cVar7 = cVarArr5[i28 + 1].f25289f;
                            if (cVar7 != null) {
                                dVar10 = cVar7.f25287d;
                                c cVar9 = dVar10.Q[i28].f25289f;
                                if (cVar9 != null) {
                                }
                            }
                            dVar10 = null;
                            if (dVar10 != null) {
                                dVar10 = dVar12;
                                z13 = true;
                            }
                            dVar13 = dVar12;
                            i27 = i22;
                            i25 = 3;
                            i26 = 8;
                            dVar12 = dVar10;
                            i24 = i21;
                        }
                    }
                    i21 = i24;
                    i22 = i27;
                    dVar9 = dVar13;
                    if (dVar9 != dVar12) {
                    }
                    cVar7 = cVarArr5[i28 + 1].f25289f;
                    if (cVar7 != null) {
                    }
                    dVar10 = null;
                    if (dVar10 != null) {
                    }
                    dVar13 = dVar12;
                    i27 = i22;
                    i25 = 3;
                    i26 = 8;
                    dVar12 = dVar10;
                    i24 = i21;
                }
                i12 = i24;
                int i34 = i27;
                d dVar15 = bVar.f25270b;
                if (dVar15 != null) {
                    dVar15.Q[i28].e();
                }
                d dVar16 = bVar.f25272d;
                if (dVar16 != null) {
                    dVar16.Q[i28 + 1].e();
                }
                bVar.f25271c = dVar12;
                if (i34 == 0 && bVar.f25280m) {
                    bVar.f25273e = dVar12;
                } else {
                    bVar.f25273e = dVar11;
                }
                bVar.f25283p = bVar.f25282o && bVar.f25281n;
            }
            bVar.q = true;
            if (arrayList3 == null || arrayList3.contains(dVar11)) {
                d dVar17 = bVar.f25271c;
                d dVar18 = bVar.f25270b;
                d dVar19 = bVar.f25272d;
                d dVar20 = bVar.f25273e;
                float f14 = bVar.f25278k;
                int[] iArr = eVar2.f25320p0;
                c[] cVarArr6 = eVar2.Q;
                boolean z14 = iArr[i5] == 2;
                if (i5 == 0) {
                    int i35 = dVar20.f25309i0;
                    boolean z15 = i35 == 0;
                    cVarArr = cVarArr4;
                    boolean z16 = i35 == 1;
                    z5 = i35 == 2;
                    dVar = dVar11;
                    f6 = f14;
                    z10 = z16;
                    z7 = z15;
                } else {
                    cVarArr = cVarArr4;
                    int i36 = dVar20.j0;
                    boolean z17 = i36 == 0;
                    boolean z18 = i36 == 1;
                    z5 = i36 == 2;
                    dVar = dVar11;
                    f6 = f14;
                    z7 = z17;
                    z10 = z18;
                }
                boolean z19 = false;
                while (!z19) {
                    c[] cVarArr7 = dVar.Q;
                    int[] iArr2 = dVar.f25320p0;
                    c cVar10 = cVarArr7[i11];
                    int i37 = z5 ? 1 : 4;
                    int e7 = cVar10.e();
                    boolean z20 = z14;
                    boolean z21 = z5;
                    boolean z22 = iArr2[i5] == 3 && dVar.f25323t[i5] == 0;
                    c cVar11 = cVar10.f25289f;
                    if (cVar11 != null && dVar != dVar11) {
                        e7 = cVar11.e() + e7;
                    }
                    int i38 = e7;
                    if (z21 && dVar != dVar11 && dVar != dVar18) {
                        i37 = 8;
                    }
                    d dVar21 = dVar11;
                    c cVar12 = cVar10.f25289f;
                    if (cVar12 != null) {
                        if (dVar == dVar18) {
                            z11 = z22;
                            cVar8.f(cVar10.f25292i, cVar12.f25292i, i38, 6);
                        } else {
                            z11 = z22;
                            cVar8.f(cVar10.f25292i, cVar12.f25292i, i38, 8);
                        }
                        if (z11 && !z21) {
                            i37 = 5;
                        }
                        cVar8.e(cVar10.f25292i, cVar10.f25289f.f25292i, i38, (dVar == dVar18 && z21 && dVar.S[i5]) ? 5 : i37);
                    }
                    if (z20) {
                        if (dVar.f25305g0 == 8 || iArr2[i5] != 3) {
                            i20 = 0;
                        } else {
                            i20 = 0;
                            cVar8.f(cVarArr7[i11 + 1].f25292i, cVarArr7[i11].f25292i, 0, 5);
                        }
                        cVar8.f(cVarArr7[i11].f25292i, cVarArr6[i11].f25292i, i20, 8);
                    }
                    c cVar13 = cVarArr7[i11 + 1].f25289f;
                    if (cVar13 != null) {
                        dVar8 = cVar13.f25287d;
                        c cVar14 = dVar8.Q[i11].f25289f;
                        if (cVar14 != null) {
                        }
                    }
                    dVar8 = null;
                    if (dVar8 != null) {
                        dVar = dVar8;
                    } else {
                        z19 = true;
                    }
                    dVar11 = dVar21;
                    z14 = z20;
                    z5 = z21;
                }
                boolean z23 = z14;
                boolean z24 = z5;
                if (dVar19 != null) {
                    int i39 = i11 + 1;
                    if (dVar17.Q[i39].f25289f != null) {
                        c cVar15 = dVar19.Q[i39];
                        if (dVar19.f25320p0[i5] == 3 && dVar19.f25323t[i5] == 0 && !z24) {
                            c cVar16 = cVar15.f25289f;
                            if (cVar16.f25287d == eVar2) {
                                cVar8.e(cVar15.f25292i, cVar16.f25292i, -cVar15.e(), 5);
                                cVar8.g(cVar15.f25292i, dVar17.Q[i39].f25289f.f25292i, -cVar15.e(), 6);
                            }
                        }
                        if (z24) {
                            c cVar17 = cVar15.f25289f;
                            if (cVar17.f25287d == eVar2) {
                                cVar8.e(cVar15.f25292i, cVar17.f25292i, -cVar15.e(), 4);
                            }
                        }
                        cVar8.g(cVar15.f25292i, dVar17.Q[i39].f25289f.f25292i, -cVar15.e(), 6);
                    }
                }
                if (z23) {
                    int i40 = i11 + 1;
                    v.g gVar6 = cVarArr6[i40].f25292i;
                    c cVar18 = dVar17.Q[i40];
                    cVar8.f(gVar6, cVar18.f25292i, cVar18.e(), 8);
                }
                ArrayList arrayList4 = bVar.f25276h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (bVar.f25281n && !bVar.f25283p) {
                        f6 = bVar.j;
                    }
                    d dVar22 = null;
                    float f15 = 0.0f;
                    int i41 = 0;
                    while (i41 < size) {
                        d dVar23 = (d) arrayList4.get(i41);
                        float[] fArr = dVar23.k0;
                        c[] cVarArr8 = dVar23.Q;
                        float f16 = fArr[i5];
                        if (f16 < f12) {
                            if (bVar.f25283p) {
                                arrayList2 = arrayList4;
                                i17 = size;
                                cVar8.e(cVarArr8[i11 + 1].f25292i, cVarArr8[i11].f25292i, 0, 4);
                                f11 = f15;
                                i18 = i41;
                                f10 = f12;
                                f15 = f11;
                                i19 = i23;
                                i41 = i18 + 1;
                                i23 = i19;
                                arrayList4 = arrayList2;
                                size = i17;
                                f12 = f10;
                            } else {
                                f16 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i17 = size;
                        if (f16 == f12) {
                            f11 = f15;
                            cVar8.e(cVarArr8[i11 + 1].f25292i, cVarArr8[i11].f25292i, 0, 8);
                            i18 = i41;
                            f10 = f12;
                            f15 = f11;
                            i19 = i23;
                            i41 = i18 + 1;
                            i23 = i19;
                            arrayList4 = arrayList2;
                            size = i17;
                            f12 = f10;
                        } else {
                            float f17 = f15;
                            if (dVar22 != null) {
                                c[] cVarArr9 = dVar22.Q;
                                v.g gVar7 = cVarArr9[i11].f25292i;
                                int i42 = i11 + 1;
                                v.g gVar8 = cVarArr9[i42].f25292i;
                                v.g gVar9 = cVarArr8[i11].f25292i;
                                v.g gVar10 = cVarArr8[i42].f25292i;
                                v.b l6 = cVar8.l();
                                dVar7 = dVar23;
                                float f18 = f12;
                                l6.f24344b = f18;
                                f10 = f18;
                                if (f6 == f18 || f17 == f16) {
                                    i18 = i41;
                                    i19 = i23;
                                    l6.f24346d.g(gVar7, 1.0f);
                                    l6.f24346d.g(gVar8, -1.0f);
                                    l6.f24346d.g(gVar10, 1.0f);
                                    l6.f24346d.g(gVar9, -1.0f);
                                } else {
                                    if (f17 == f10) {
                                        l6.f24346d.g(gVar7, 1.0f);
                                        l6.f24346d.g(gVar8, -1.0f);
                                    } else if (f16 == f12) {
                                        l6.f24346d.g(gVar9, 1.0f);
                                        l6.f24346d.g(gVar10, -1.0f);
                                    } else {
                                        i18 = i41;
                                        float f19 = (f17 / f6) / (f16 / f6);
                                        i19 = i23;
                                        l6.f24346d.g(gVar7, 1.0f);
                                        l6.f24346d.g(gVar8, -1.0f);
                                        l6.f24346d.g(gVar10, f19);
                                        l6.f24346d.g(gVar9, -f19);
                                    }
                                    i18 = i41;
                                    i19 = i23;
                                }
                                cVar8.c(l6);
                            } else {
                                dVar7 = dVar23;
                                i18 = i41;
                                f10 = f12;
                                i19 = i23;
                            }
                            f15 = f16;
                            dVar22 = dVar7;
                            i41 = i18 + 1;
                            i23 = i19;
                            arrayList4 = arrayList2;
                            size = i17;
                            f12 = f10;
                        }
                    }
                }
                i13 = i23;
                if (dVar18 == null || !(dVar18 == dVar19 || z24)) {
                    dVar2 = dVar19;
                    if (!z7 || dVar18 == null) {
                        c[] cVarArr10 = cVarArr;
                        int i43 = 8;
                        if (z10 && dVar18 != null) {
                            int i44 = bVar.j;
                            boolean z25 = i44 > 0 && bVar.f25277i == i44;
                            d dVar24 = dVar18;
                            d dVar25 = dVar24;
                            while (dVar25 != null) {
                                c[] cVarArr11 = dVar25.Q;
                                d dVar26 = dVar25.f25314m0[i5];
                                while (dVar26 != null && dVar26.f25305g0 == i43) {
                                    dVar26 = dVar26.f25314m0[i5];
                                }
                                if (dVar25 == dVar18 || dVar25 == dVar2 || dVar26 == null) {
                                    dVar3 = dVar24;
                                } else {
                                    if (dVar26 == dVar2) {
                                        dVar26 = null;
                                    }
                                    c cVar19 = cVarArr11[i11];
                                    v.g gVar11 = cVar19.f25292i;
                                    int i45 = i11 + 1;
                                    v.g gVar12 = dVar24.Q[i45].f25292i;
                                    int e9 = cVar19.e();
                                    int e10 = cVarArr11[i45].e();
                                    if (dVar26 != null) {
                                        cVar3 = dVar26.Q[i11];
                                        gVar2 = cVar3.f25292i;
                                        c cVar20 = cVar3.f25289f;
                                        gVar = cVar20 != null ? cVar20.f25292i : null;
                                    } else {
                                        c cVar21 = dVar2.Q[i11];
                                        v.g gVar13 = cVar21 != null ? cVar21.f25292i : null;
                                        gVar = cVarArr11[i45].f25292i;
                                        cVar3 = cVar21;
                                        gVar2 = gVar13;
                                    }
                                    if (cVar3 != null) {
                                        e10 += cVar3.e();
                                    }
                                    int e11 = e9 + dVar24.Q[i45].e();
                                    d dVar27 = dVar26;
                                    v.g gVar14 = gVar2;
                                    int i46 = z25 ? 8 : 4;
                                    if (gVar11 == null || gVar12 == null || gVar14 == null || gVar == null) {
                                        dVar3 = dVar24;
                                        dVar4 = dVar27;
                                    } else {
                                        dVar4 = dVar27;
                                        v.g gVar15 = gVar;
                                        dVar3 = dVar24;
                                        cVar.b(gVar11, gVar12, e11, 0.5f, gVar14, gVar15, e10, i46);
                                    }
                                    dVar26 = dVar4;
                                }
                                if (dVar25.f25305g0 != 8) {
                                    dVar3 = dVar25;
                                }
                                dVar25 = dVar26;
                                dVar24 = dVar3;
                                i43 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar18.Q[i11];
                            c cVar23 = cVarArr10[i11].f25289f;
                            int i47 = i11 + 1;
                            c cVar24 = dVar2.Q[i47];
                            c cVar25 = dVar17.Q[i47].f25289f;
                            if (cVar23 != null) {
                                if (dVar18 != dVar2) {
                                    cVar2.e(cVar22.f25292i, cVar23.f25292i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.f25292i, cVar23.f25292i, cVar22.e(), 0.5f, cVar24.f25292i, cVar25.f25292i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar18 != dVar2) {
                                cVar2.e(cVar24.f25292i, cVar25.f25292i, -cVar24.e(), 5);
                            }
                            if ((!z7 || z10) && dVar18 != null && dVar18 != dVar2) {
                                c[] cVarArr12 = dVar18.Q;
                                cVar5 = cVarArr12[i11];
                                if (dVar2 == null) {
                                    dVar2 = dVar18;
                                }
                                cVarArr3 = dVar2.Q;
                                i16 = i11 + 1;
                                cVar6 = cVarArr3[i16];
                                c cVar26 = cVar5.f25289f;
                                gVar4 = cVar26 == null ? cVar26.f25292i : null;
                                c cVar27 = cVar6.f25289f;
                                gVar5 = cVar27 == null ? cVar27.f25292i : null;
                                if (dVar17 != dVar2) {
                                    c cVar28 = dVar17.Q[i16].f25289f;
                                    gVar5 = cVar28 != null ? cVar28.f25292i : null;
                                }
                                if (dVar18 == dVar2) {
                                    cVar6 = cVarArr12[i16];
                                }
                                if (gVar4 != null && gVar5 != null) {
                                    cVar2.b(cVar5.f25292i, gVar4, cVar5.e(), 0.5f, gVar5, cVar6.f25292i, cVarArr3[i16].e(), 5);
                                }
                            }
                        }
                    } else {
                        int i48 = bVar.j;
                        boolean z26 = i48 > 0 && bVar.f25277i == i48;
                        d dVar28 = dVar18;
                        d dVar29 = dVar28;
                        while (dVar28 != null) {
                            c[] cVarArr13 = dVar28.Q;
                            d dVar30 = dVar28.f25314m0[i5];
                            while (true) {
                                if (dVar30 == null) {
                                    i14 = 8;
                                    break;
                                }
                                i14 = 8;
                                if (dVar30.f25305g0 != 8) {
                                    break;
                                } else {
                                    dVar30 = dVar30.f25314m0[i5];
                                }
                            }
                            if (dVar30 != null || dVar28 == dVar2) {
                                c cVar29 = cVarArr13[i11];
                                v.g gVar16 = cVar29.f25292i;
                                c cVar30 = cVar29.f25289f;
                                v.g gVar17 = cVar30 != null ? cVar30.f25292i : null;
                                if (dVar29 != dVar28) {
                                    gVar17 = dVar29.Q[i11 + 1].f25292i;
                                } else if (dVar28 == dVar18) {
                                    c cVar31 = cVarArr[i11].f25289f;
                                    gVar17 = cVar31 != null ? cVar31.f25292i : null;
                                }
                                int e12 = cVar29.e();
                                int i49 = i11 + 1;
                                int e13 = cVarArr13[i49].e();
                                if (dVar30 != null) {
                                    cVar4 = dVar30.Q[i11];
                                    gVar3 = cVar4.f25292i;
                                } else {
                                    cVar4 = dVar17.Q[i49].f25289f;
                                    gVar3 = cVar4 != null ? cVar4.f25292i : null;
                                }
                                v.g gVar18 = cVarArr13[i49].f25292i;
                                if (cVar4 != null) {
                                    e13 += cVar4.e();
                                }
                                int e14 = dVar29.Q[i49].e() + e12;
                                if (gVar16 == null || gVar17 == null || gVar3 == null || gVar18 == null) {
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i15 = 8;
                                } else {
                                    if (dVar28 == dVar18) {
                                        e14 = dVar18.Q[i11].e();
                                    }
                                    if (dVar28 == dVar2) {
                                        e13 = dVar2.Q[i49].e();
                                    }
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i15 = 8;
                                    cVar.b(gVar16, gVar17, e14, 0.5f, gVar3, gVar18, e13, z26 ? 8 : 5);
                                }
                            } else {
                                dVar5 = dVar30;
                                cVarArr2 = cVarArr;
                                dVar6 = dVar29;
                                i15 = i14;
                            }
                            if (dVar28.f25305g0 != i15) {
                                dVar6 = dVar28;
                            }
                            dVar28 = dVar5;
                            dVar29 = dVar6;
                            cVarArr = cVarArr2;
                        }
                    }
                } else {
                    c cVar32 = cVarArr[i11];
                    int i50 = i11 + 1;
                    c cVar33 = dVar17.Q[i50];
                    c cVar34 = cVar32.f25289f;
                    v.g gVar19 = cVar34 != null ? cVar34.f25292i : null;
                    c cVar35 = cVar33.f25289f;
                    v.g gVar20 = cVar35 != null ? cVar35.f25292i : null;
                    c cVar36 = dVar18.Q[i11];
                    if (dVar19 != null) {
                        cVar33 = dVar19.Q[i50];
                    }
                    if (gVar19 == null || gVar20 == null) {
                        dVar2 = dVar19;
                    } else {
                        float f20 = i5 == 0 ? dVar20.f25300d0 : dVar20.e0;
                        int e15 = cVar36.e();
                        int e16 = cVar33.e();
                        v.g gVar21 = cVar36.f25292i;
                        v.g gVar22 = cVar33.f25292i;
                        v.g gVar23 = gVar19;
                        dVar2 = dVar19;
                        cVar8.b(gVar21, gVar23, e15, f20, gVar20, gVar22, e16, 7);
                    }
                }
                cVar2 = cVar;
                if (!z7) {
                }
                c[] cVarArr122 = dVar18.Q;
                cVar5 = cVarArr122[i11];
                if (dVar2 == null) {
                }
                cVarArr3 = dVar2.Q;
                i16 = i11 + 1;
                cVar6 = cVarArr3[i16];
                c cVar262 = cVar5.f25289f;
                if (cVar262 == null) {
                }
                c cVar272 = cVar6.f25289f;
                if (cVar272 == null) {
                }
                if (dVar17 != dVar2) {
                }
                if (dVar18 == dVar2) {
                }
                if (gVar4 != null) {
                    cVar2.b(cVar5.f25292i, gVar4, cVar5.e(), 0.5f, gVar5, cVar6.f25292i, cVarArr3[i16].e(), 5);
                }
            } else {
                i13 = i23;
            }
            i24 = i12 + 1;
            eVar2 = eVar;
            cVar8 = cVar;
            arrayList3 = arrayList;
            i23 = i13;
        }
    }

    public static void b(e eVar, v.c cVar, d dVar) {
        dVar.f25317o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f25320p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f25319p = -1;
        int[] iArr2 = eVar.f25320p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i5 = cVar6.f25290g;
            int q = eVar.q() - cVar5.f25290g;
            cVar6.f25292i = cVar.k(cVar6);
            cVar5.f25292i = cVar.k(cVar5);
            cVar.d(cVar6.f25292i, i5);
            cVar.d(cVar5.f25292i, q);
            dVar.f25317o = 2;
            dVar.Y = i5;
            int i10 = q - i5;
            dVar.U = i10;
            int i11 = dVar.f25296b0;
            if (i10 < i11) {
                dVar.U = i11;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i12 = cVar4.f25290g;
        int k6 = eVar.k() - cVar3.f25290g;
        cVar4.f25292i = cVar.k(cVar4);
        cVar3.f25292i = cVar.k(cVar3);
        cVar.d(cVar4.f25292i, i12);
        cVar.d(cVar3.f25292i, k6);
        if (dVar.f25294a0 > 0 || dVar.f25305g0 == 8) {
            v.g k9 = cVar.k(cVar2);
            cVar2.f25292i = k9;
            cVar.d(k9, dVar.f25294a0 + i12);
        }
        dVar.f25319p = 2;
        dVar.Z = i12;
        int i13 = k6 - i12;
        dVar.V = i13;
        int i14 = dVar.f25298c0;
        if (i13 < i14) {
            dVar.V = i14;
        }
    }

    public static final boolean c(int i5, int i10) {
        return (i5 & i10) == i10;
    }
}
