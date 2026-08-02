package m2;

import f2.C6402b;
import f2.C6404d;
import java.util.ArrayList;
import m2.e;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8044b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0528 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0542 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v46, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4, types: [m2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(f fVar, C6404d c6404d, ArrayList<e> arrayList, int i11) {
        int i12;
        C8045c[] c8045cArr;
        int i13;
        int i14;
        float f7;
        boolean z11;
        boolean z12;
        e eVar;
        boolean z13;
        d[] dVarArr;
        int i15;
        C8045c[] c8045cArr2;
        ArrayList<e> arrayList2;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        d dVar;
        d dVar2;
        C6404d c6404d2;
        e eVar6;
        f2.h hVar;
        d dVar3;
        f2.h hVar2;
        int i16;
        d dVar4;
        f2.h hVar3;
        e eVar7;
        int i17;
        d dVar5;
        e eVar8;
        int i18;
        d[] dVarArr2;
        d dVar6;
        f2.h hVar4;
        f2.h hVar5;
        int size;
        int i19;
        boolean z14;
        int i21;
        C8045c[] c8045cArr3;
        int i22;
        f fVar2 = fVar;
        C6404d c6404d3 = c6404d;
        ArrayList<e> arrayList3 = arrayList;
        int i23 = i11;
        if (i23 == 0) {
            i12 = fVar2.f74172E0;
            c8045cArr = fVar2.f74175H0;
            i13 = 0;
        } else {
            i12 = fVar2.f74173F0;
            c8045cArr = fVar2.f74174G0;
            i13 = 2;
        }
        int i24 = i12;
        C8045c[] c8045cArr4 = c8045cArr;
        int i25 = 0;
        while (i25 < i24) {
            C8045c c8045c = c8045cArr4[i25];
            c8045c.a();
            e eVar9 = c8045c.f74068a;
            if (arrayList3 == null || arrayList3.contains(eVar9)) {
                e eVar10 = c8045c.f74070c;
                e eVar11 = c8045c.f74069b;
                e eVar12 = c8045c.f74071d;
                e eVar13 = c8045c.f74072e;
                float f11 = c8045c.f74078k;
                i14 = i25;
                boolean z15 = fVar2.f74115V[i23] == e.b.WRAP_CONTENT;
                if (i23 == 0) {
                    int i26 = eVar13.f74145m0;
                    boolean z16 = i26 == 0;
                    boolean z17 = i26 == 1;
                    f7 = f11;
                    z12 = i26 == 2;
                    eVar = eVar9;
                    z13 = z16;
                    z11 = z17;
                } else {
                    f7 = f11;
                    int i27 = eVar13.f74147n0;
                    boolean z18 = i27 == 0;
                    z11 = i27 == 1;
                    z12 = i27 == 2;
                    eVar = eVar9;
                    z13 = z18;
                }
                boolean z19 = false;
                ?? r92 = eVar;
                while (true) {
                    dVarArr = fVar2.f74112S;
                    if (z19) {
                        break;
                    }
                    d dVar7 = r92.f74112S[i13];
                    int i28 = z12 ? 1 : 4;
                    int f12 = dVar7.f();
                    e.b bVar = r92.f74115V[i23];
                    boolean z21 = z15;
                    e.b bVar2 = e.b.MATCH_CONSTRAINT;
                    boolean z22 = bVar == bVar2 && r92.f74160u[i23] == 0;
                    d dVar8 = dVar7.f74090f;
                    if (dVar8 != null && r92 != eVar9) {
                        f12 = dVar8.f() + f12;
                    }
                    int i29 = f12;
                    if (z12 && r92 != eVar9 && r92 != eVar11) {
                        i28 = 8;
                    }
                    boolean z23 = z12;
                    d dVar9 = dVar7.f74090f;
                    if (dVar9 != null) {
                        if (r92 == eVar11) {
                            i21 = i24;
                            c8045cArr3 = c8045cArr4;
                            c6404d3.f(dVar7.f74093i, dVar9.f74093i, i29, 6);
                        } else {
                            i21 = i24;
                            c8045cArr3 = c8045cArr4;
                            c6404d3.f(dVar7.f74093i, dVar9.f74093i, i29, 8);
                        }
                        if (z22 && !z23) {
                            i28 = 5;
                        }
                        c6404d3.e(dVar7.f74093i, dVar7.f74090f.f74093i, i29, (r92 == eVar11 && z23 && r92.X(i23)) ? 5 : i28);
                    } else {
                        i21 = i24;
                        c8045cArr3 = c8045cArr4;
                    }
                    d[] dVarArr3 = r92.f74112S;
                    if (z21) {
                        if (r92.M() == 8 || r92.f74115V[i23] != bVar2) {
                            i22 = 0;
                        } else {
                            i22 = 0;
                            c6404d3.f(dVarArr3[i13 + 1].f74093i, dVarArr3[i13].f74093i, 0, 5);
                        }
                        c6404d3.f(dVarArr3[i13].f74093i, dVarArr[i13].f74093i, i22, 8);
                    }
                    d dVar10 = dVarArr3[i13 + 1].f74090f;
                    if (dVar10 != null) {
                        ?? r22 = dVar10.f74088d;
                        d dVar11 = r22.f74112S[i13].f74090f;
                        if (dVar11 != null && dVar11.f74088d == r92) {
                            r27 = r22;
                        }
                    }
                    if (r27 != null) {
                        r92 = r27;
                    } else {
                        z19 = true;
                    }
                    z12 = z23;
                    z15 = z21;
                    i24 = i21;
                    c8045cArr4 = c8045cArr3;
                    r92 = r92;
                }
                boolean z24 = z15;
                boolean z25 = z12;
                i15 = i24;
                c8045cArr2 = c8045cArr4;
                if (eVar12 != null) {
                    int i31 = i13 + 1;
                    if (eVar10.f74112S[i31].f74090f != null) {
                        d dVar12 = eVar12.f74112S[i31];
                        if (eVar12.f74115V[i23] == e.b.MATCH_CONSTRAINT && eVar12.f74160u[i23] == 0 && !z25) {
                            d dVar13 = dVar12.f74090f;
                            if (dVar13.f74088d == fVar2) {
                                c6404d3.e(dVar12.f74093i, dVar13.f74093i, -dVar12.f(), 5);
                                c6404d3.g(dVar12.f74093i, eVar10.f74112S[i31].f74090f.f74093i, -dVar12.f(), 6);
                                if (z24) {
                                    int i32 = i13 + 1;
                                    f2.h hVar6 = dVarArr[i32].f74093i;
                                    d dVar14 = eVar10.f74112S[i32];
                                    c6404d3.f(hVar6, dVar14.f74093i, dVar14.f(), 8);
                                }
                                arrayList2 = c8045c.f74075h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f13 = (c8045c.f74081n || c8045c.f74083p) ? f7 : c8045c.f74077j;
                                    e eVar14 = null;
                                    float f14 = 0.0f;
                                    for (i19 = 0; i19 < size; i19++) {
                                        e eVar15 = arrayList2.get(i19);
                                        float f15 = eVar15.f74149o0[i23];
                                        d[] dVarArr4 = eVar15.f74112S;
                                        if (f15 < 0.0f) {
                                            if (c8045c.f74083p) {
                                                f2.h hVar7 = dVarArr4[i13 + 1].f74093i;
                                                f2.h hVar8 = dVarArr4[i13].f74093i;
                                                z14 = false;
                                                c6404d3.e(hVar7, hVar8, 0, 4);
                                            } else {
                                                f15 = 1.0f;
                                            }
                                        }
                                        float f16 = f15;
                                        if (f16 == 0.0f) {
                                            f2.h hVar9 = dVarArr4[i13 + 1].f74093i;
                                            f2.h hVar10 = dVarArr4[i13].f74093i;
                                            z14 = false;
                                            c6404d3.e(hVar9, hVar10, 0, 8);
                                        } else {
                                            if (eVar14 != null) {
                                                d[] dVarArr5 = eVar14.f74112S;
                                                f2.h hVar11 = dVarArr5[i13].f74093i;
                                                int i33 = i13 + 1;
                                                f2.h hVar12 = dVarArr5[i33].f74093i;
                                                f2.h hVar13 = dVarArr4[i13].f74093i;
                                                f2.h hVar14 = dVarArr4[i33].f74093i;
                                                C6402b l11 = c6404d3.l();
                                                l11.c(f14, f13, f16, hVar11, hVar12, hVar13, hVar14);
                                                c6404d3.c(l11);
                                            }
                                            eVar14 = eVar15;
                                            f14 = f16;
                                        }
                                    }
                                }
                                if (eVar11 == null && (eVar11 == eVar12 || z25)) {
                                    d dVar15 = eVar9.f74112S[i13];
                                    int i34 = i13 + 1;
                                    d dVar16 = eVar10.f74112S[i34];
                                    d dVar17 = dVar15.f74090f;
                                    f2.h hVar15 = dVar17 != null ? dVar17.f74093i : null;
                                    d dVar18 = dVar16.f74090f;
                                    f2.h hVar16 = dVar18 != null ? dVar18.f74093i : null;
                                    d dVar19 = eVar11.f74112S[i13];
                                    if (eVar12 != null) {
                                        dVar16 = eVar12.f74112S[i34];
                                    }
                                    if (hVar15 == null || hVar16 == null) {
                                        eVar2 = eVar10;
                                        eVar3 = eVar11;
                                        eVar4 = eVar12;
                                    } else {
                                        eVar3 = eVar11;
                                        eVar4 = eVar12;
                                        f2.h hVar17 = hVar15;
                                        eVar2 = eVar10;
                                        c6404d3.b(dVar19.f74093i, hVar17, dVar19.f(), i23 == 0 ? eVar13.f74133g0 : eVar13.f74135h0, hVar16, dVar16.f74093i, dVar16.f(), 7);
                                    }
                                } else {
                                    eVar2 = eVar10;
                                    eVar3 = eVar11;
                                    eVar4 = eVar12;
                                    if (!z13 && eVar3 != null) {
                                        int i35 = c8045c.f74077j;
                                        boolean z26 = i35 > 0 && c8045c.f74076i == i35;
                                        e eVar16 = eVar3;
                                        e eVar17 = eVar16;
                                        while (eVar16 != null) {
                                            e eVar18 = eVar16.f74153q0[i23];
                                            while (true) {
                                                if (eVar18 == null) {
                                                    i16 = 8;
                                                    break;
                                                }
                                                i16 = 8;
                                                if (eVar18.M() != 8) {
                                                    break;
                                                } else {
                                                    eVar18 = eVar18.f74153q0[i23];
                                                }
                                            }
                                            if (eVar18 != null || eVar16 == eVar4) {
                                                d[] dVarArr6 = eVar16.f74112S;
                                                d dVar20 = dVarArr6[i13];
                                                int i36 = i16;
                                                f2.h hVar18 = dVar20.f74093i;
                                                d dVar21 = dVar20.f74090f;
                                                f2.h hVar19 = dVar21 != null ? dVar21.f74093i : null;
                                                if (eVar17 != eVar16) {
                                                    hVar19 = eVar17.f74112S[i13 + 1].f74093i;
                                                } else if (eVar16 == eVar3) {
                                                    d dVar22 = eVar9.f74112S[i13].f74090f;
                                                    hVar19 = dVar22 != null ? dVar22.f74093i : null;
                                                }
                                                int f17 = dVar20.f();
                                                int i37 = i13 + 1;
                                                int f18 = dVarArr6[i37].f();
                                                if (eVar18 != null) {
                                                    dVar4 = eVar18.f74112S[i13];
                                                    hVar3 = dVar4.f74093i;
                                                } else {
                                                    dVar4 = eVar2.f74112S[i37].f74090f;
                                                    hVar3 = dVar4 != null ? dVar4.f74093i : null;
                                                }
                                                f2.h hVar20 = dVarArr6[i37].f74093i;
                                                if (dVar4 != null) {
                                                    f18 += dVar4.f();
                                                }
                                                int f19 = eVar17.f74112S[i37].f() + f17;
                                                if (hVar18 == null || hVar19 == null || hVar3 == null || hVar20 == null) {
                                                    eVar7 = eVar9;
                                                    i17 = i36;
                                                } else {
                                                    if (eVar16 == eVar3) {
                                                        f19 = eVar3.f74112S[i13].f();
                                                    }
                                                    if (eVar16 == eVar4) {
                                                        f18 = eVar4.f74112S[i37].f();
                                                    }
                                                    eVar7 = eVar9;
                                                    i17 = i36;
                                                    c6404d.b(hVar18, hVar19, f19, 0.5f, hVar3, hVar20, f18, z26 ? i36 : 5);
                                                    if (eVar16.M() == i17) {
                                                        eVar17 = eVar16;
                                                    }
                                                    i23 = i11;
                                                    eVar16 = eVar18;
                                                    eVar9 = eVar7;
                                                }
                                            } else {
                                                i17 = i16;
                                                eVar7 = eVar9;
                                            }
                                            if (eVar16.M() == i17) {
                                            }
                                            i23 = i11;
                                            eVar16 = eVar18;
                                            eVar9 = eVar7;
                                        }
                                    } else if (z11 && eVar3 != null) {
                                        int i38 = c8045c.f74077j;
                                        boolean z27 = i38 <= 0 && c8045c.f74076i == i38;
                                        eVar5 = eVar3;
                                        e eVar19 = eVar5;
                                        while (eVar5 != null) {
                                            e eVar20 = eVar5.f74153q0[i11];
                                            while (eVar20 != null && eVar20.M() == 8) {
                                                eVar20 = eVar20.f74153q0[i11];
                                            }
                                            if (eVar5 == eVar3 || eVar5 == eVar4 || eVar20 == null) {
                                                eVar6 = eVar20;
                                            } else {
                                                e eVar21 = eVar20 == eVar4 ? null : eVar20;
                                                d[] dVarArr7 = eVar5.f74112S;
                                                d dVar23 = dVarArr7[i13];
                                                f2.h hVar21 = dVar23.f74093i;
                                                int i39 = i13 + 1;
                                                f2.h hVar22 = eVar19.f74112S[i39].f74093i;
                                                int f21 = dVar23.f();
                                                int f22 = dVarArr7[i39].f();
                                                if (eVar21 != null) {
                                                    dVar3 = eVar21.f74112S[i13];
                                                    hVar2 = dVar3.f74093i;
                                                    d dVar24 = dVar3.f74090f;
                                                    hVar = dVar24 != null ? dVar24.f74093i : null;
                                                } else {
                                                    d dVar25 = eVar4.f74112S[i13];
                                                    f2.h hVar23 = dVar25 != null ? dVar25.f74093i : null;
                                                    hVar = dVarArr7[i39].f74093i;
                                                    dVar3 = dVar25;
                                                    hVar2 = hVar23;
                                                }
                                                if (dVar3 != null) {
                                                    f22 += dVar3.f();
                                                }
                                                int f23 = eVar19.f74112S[i39].f() + f21;
                                                int i41 = z27 ? 8 : 4;
                                                if (hVar21 != null && hVar22 != null && hVar2 != null && hVar != null) {
                                                    c6404d.b(hVar21, hVar22, f23, 0.5f, hVar2, hVar, f22, i41);
                                                }
                                                eVar6 = eVar21;
                                            }
                                            if (eVar5.M() != 8) {
                                                eVar19 = eVar5;
                                            }
                                            eVar5 = eVar6;
                                        }
                                        d dVar26 = eVar3.f74112S[i13];
                                        dVar = eVar9.f74112S[i13].f74090f;
                                        int i42 = i13 + 1;
                                        d dVar27 = eVar4.f74112S[i42];
                                        dVar2 = eVar2.f74112S[i42].f74090f;
                                        if (dVar != null) {
                                            if (eVar3 != eVar4) {
                                                c6404d.e(dVar26.f74093i, dVar.f74093i, dVar26.f(), 5);
                                            } else if (dVar2 != null) {
                                                c6404d2 = c6404d;
                                                c6404d2.b(dVar26.f74093i, dVar.f74093i, dVar26.f(), 0.5f, dVar27.f74093i, dVar2.f74093i, dVar27.f(), 5);
                                                if (dVar2 != null && eVar3 != eVar4) {
                                                    c6404d2.e(dVar27.f74093i, dVar2.f74093i, -dVar27.f(), 5);
                                                }
                                                if ((!z13 || z11) && eVar3 != null && eVar3 != eVar4) {
                                                    d[] dVarArr8 = eVar3.f74112S;
                                                    dVar5 = dVarArr8[i13];
                                                    eVar8 = eVar4 != null ? eVar3 : eVar4;
                                                    i18 = i13 + 1;
                                                    dVarArr2 = eVar8.f74112S;
                                                    dVar6 = dVarArr2[i18];
                                                    d dVar28 = dVar5.f74090f;
                                                    hVar4 = dVar28 == null ? dVar28.f74093i : null;
                                                    d dVar29 = dVar6.f74090f;
                                                    hVar5 = dVar29 == null ? dVar29.f74093i : null;
                                                    if (eVar2 != eVar8) {
                                                        d dVar30 = eVar2.f74112S[i18].f74090f;
                                                        hVar5 = dVar30 != null ? dVar30.f74093i : null;
                                                    }
                                                    if (eVar3 == eVar8) {
                                                        dVar6 = dVarArr8[i18];
                                                    }
                                                    if (hVar4 != null && hVar5 != null) {
                                                        c6404d2.b(dVar5.f74093i, hVar4, dVar5.f(), 0.5f, hVar5, dVar6.f74093i, dVarArr2[i18].f(), 5);
                                                    }
                                                }
                                            }
                                        }
                                        c6404d2 = c6404d;
                                        if (dVar2 != null) {
                                            c6404d2.e(dVar27.f74093i, dVar2.f74093i, -dVar27.f(), 5);
                                        }
                                        if (!z13) {
                                        }
                                        d[] dVarArr82 = eVar3.f74112S;
                                        dVar5 = dVarArr82[i13];
                                        if (eVar4 != null) {
                                        }
                                        i18 = i13 + 1;
                                        dVarArr2 = eVar8.f74112S;
                                        dVar6 = dVarArr2[i18];
                                        d dVar282 = dVar5.f74090f;
                                        if (dVar282 == null) {
                                        }
                                        d dVar292 = dVar6.f74090f;
                                        if (dVar292 == null) {
                                        }
                                        if (eVar2 != eVar8) {
                                        }
                                        if (eVar3 == eVar8) {
                                        }
                                        if (hVar4 != null) {
                                            c6404d2.b(dVar5.f74093i, hVar4, dVar5.f(), 0.5f, hVar5, dVar6.f74093i, dVarArr2[i18].f(), 5);
                                        }
                                    }
                                }
                                c6404d2 = c6404d;
                                if (!z13) {
                                }
                                d[] dVarArr822 = eVar3.f74112S;
                                dVar5 = dVarArr822[i13];
                                if (eVar4 != null) {
                                }
                                i18 = i13 + 1;
                                dVarArr2 = eVar8.f74112S;
                                dVar6 = dVarArr2[i18];
                                d dVar2822 = dVar5.f74090f;
                                if (dVar2822 == null) {
                                }
                                d dVar2922 = dVar6.f74090f;
                                if (dVar2922 == null) {
                                }
                                if (eVar2 != eVar8) {
                                }
                                if (eVar3 == eVar8) {
                                }
                                if (hVar4 != null) {
                                }
                            }
                        }
                        if (z25) {
                            d dVar31 = dVar12.f74090f;
                            if (dVar31.f74088d == fVar2) {
                                c6404d3.e(dVar12.f74093i, dVar31.f74093i, -dVar12.f(), 4);
                            }
                        }
                        c6404d3.g(dVar12.f74093i, eVar10.f74112S[i31].f74090f.f74093i, -dVar12.f(), 6);
                        if (z24) {
                        }
                        arrayList2 = c8045c.f74075h;
                        if (arrayList2 != null) {
                            if (c8045c.f74081n) {
                            }
                            e eVar142 = null;
                            float f142 = 0.0f;
                            while (i19 < size) {
                            }
                        }
                        if (eVar11 == null) {
                        }
                        eVar2 = eVar10;
                        eVar3 = eVar11;
                        eVar4 = eVar12;
                        if (!z13) {
                        }
                        if (z11) {
                            int i382 = c8045c.f74077j;
                            if (i382 <= 0) {
                            }
                            eVar5 = eVar3;
                            e eVar192 = eVar5;
                            while (eVar5 != null) {
                            }
                            d dVar262 = eVar3.f74112S[i13];
                            dVar = eVar9.f74112S[i13].f74090f;
                            int i422 = i13 + 1;
                            d dVar272 = eVar4.f74112S[i422];
                            dVar2 = eVar2.f74112S[i422].f74090f;
                            if (dVar != null) {
                            }
                            c6404d2 = c6404d;
                            if (dVar2 != null) {
                            }
                            if (!z13) {
                            }
                            d[] dVarArr8222 = eVar3.f74112S;
                            dVar5 = dVarArr8222[i13];
                            if (eVar4 != null) {
                            }
                            i18 = i13 + 1;
                            dVarArr2 = eVar8.f74112S;
                            dVar6 = dVarArr2[i18];
                            d dVar28222 = dVar5.f74090f;
                            if (dVar28222 == null) {
                            }
                            d dVar29222 = dVar6.f74090f;
                            if (dVar29222 == null) {
                            }
                            if (eVar2 != eVar8) {
                            }
                            if (eVar3 == eVar8) {
                            }
                            if (hVar4 != null) {
                            }
                        }
                        c6404d2 = c6404d;
                        if (!z13) {
                        }
                        d[] dVarArr82222 = eVar3.f74112S;
                        dVar5 = dVarArr82222[i13];
                        if (eVar4 != null) {
                        }
                        i18 = i13 + 1;
                        dVarArr2 = eVar8.f74112S;
                        dVar6 = dVarArr2[i18];
                        d dVar282222 = dVar5.f74090f;
                        if (dVar282222 == null) {
                        }
                        d dVar292222 = dVar6.f74090f;
                        if (dVar292222 == null) {
                        }
                        if (eVar2 != eVar8) {
                        }
                        if (eVar3 == eVar8) {
                        }
                        if (hVar4 != null) {
                        }
                    }
                }
                if (z24) {
                }
                arrayList2 = c8045c.f74075h;
                if (arrayList2 != null) {
                }
                if (eVar11 == null) {
                }
                eVar2 = eVar10;
                eVar3 = eVar11;
                eVar4 = eVar12;
                if (!z13) {
                }
                if (z11) {
                }
                c6404d2 = c6404d;
                if (!z13) {
                }
                d[] dVarArr822222 = eVar3.f74112S;
                dVar5 = dVarArr822222[i13];
                if (eVar4 != null) {
                }
                i18 = i13 + 1;
                dVarArr2 = eVar8.f74112S;
                dVar6 = dVarArr2[i18];
                d dVar2822222 = dVar5.f74090f;
                if (dVar2822222 == null) {
                }
                d dVar2922222 = dVar6.f74090f;
                if (dVar2922222 == null) {
                }
                if (eVar2 != eVar8) {
                }
                if (eVar3 == eVar8) {
                }
                if (hVar4 != null) {
                }
            } else {
                i14 = i25;
                i15 = i24;
                c8045cArr2 = c8045cArr4;
            }
            i25 = i14 + 1;
            fVar2 = fVar;
            c6404d3 = c6404d;
            arrayList3 = arrayList;
            i23 = i11;
            i24 = i15;
            c8045cArr4 = c8045cArr2;
        }
    }
}
