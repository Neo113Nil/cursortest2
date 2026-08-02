package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0035, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0047, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r4v44, types: [androidx.constraintlayout.core.widgets.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(f fVar, androidx.constraintlayout.core.d dVar, int i10, int i11, c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ArrayList arrayList;
        e eVar;
        d dVar2;
        d dVar3;
        androidx.constraintlayout.core.d dVar4;
        d dVar5;
        androidx.constraintlayout.core.i iVar;
        androidx.constraintlayout.core.i iVar2;
        e eVar2;
        int i12;
        d dVar6;
        androidx.constraintlayout.core.i iVar3;
        e eVar3;
        int i13;
        androidx.constraintlayout.core.i iVar4;
        int size;
        int i14;
        float f11;
        ArrayList arrayList2;
        boolean z13;
        boolean z14;
        int i15;
        int i16 = i10;
        e eVar4 = cVar.f17880a;
        e eVar5 = cVar.f17882c;
        e eVar6 = cVar.f17881b;
        e eVar7 = cVar.f17883d;
        e eVar8 = cVar.f17884e;
        float f12 = cVar.f17890k;
        boolean z15 = fVar.mListDimensionBehaviors[i16] == e.b.WRAP_CONTENT;
        if (i16 == 0) {
            int i17 = eVar8.f17984s0;
            z10 = i17 == 0;
            z11 = i17 == 1;
        } else {
            int i18 = eVar8.f17986t0;
            z10 = i18 == 0;
            z11 = i18 == 1;
        }
        ?? r14 = eVar4;
        boolean z16 = false;
        while (true) {
            f10 = f12;
            if (z16) {
                break;
            }
            d dVar7 = r14.mListAnchors[i11];
            int i19 = z12 ? 1 : 4;
            int f13 = dVar7.f();
            e.b bVar = r14.mListDimensionBehaviors[i16];
            boolean z17 = z15;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z18 = bVar == bVar2 && r14.mResolvedMatchConstraintDefault[i16] == 0;
            boolean z19 = z12;
            d dVar8 = dVar7.f17907f;
            if (dVar8 != null && r14 != eVar4) {
                f13 += dVar8.f();
            }
            int i20 = f13;
            if (z19 && r14 != eVar4 && r14 != eVar6) {
                i19 = 8;
            }
            boolean z20 = z18;
            d dVar9 = dVar7.f17907f;
            if (dVar9 != null) {
                if (r14 == eVar6) {
                    z13 = z16;
                    z14 = z10;
                    dVar.h(dVar7.f17910i, dVar9.f17910i, i20, 6);
                } else {
                    z13 = z16;
                    z14 = z10;
                    dVar.h(dVar7.f17910i, dVar9.f17910i, i20, 8);
                }
                if (z20 && !z19) {
                    i19 = 5;
                }
                dVar.e(dVar7.f17910i, dVar7.f17907f.f17910i, i20, (r14 == eVar6 && z19 && r14.h0(i16)) ? 5 : i19);
            } else {
                z13 = z16;
                z14 = z10;
            }
            if (z17) {
                if (r14.V() == 8 || r14.mListDimensionBehaviors[i16] != bVar2) {
                    i15 = 0;
                } else {
                    d[] dVarArr = r14.mListAnchors;
                    i15 = 0;
                    dVar.h(dVarArr[i11 + 1].f17910i, dVarArr[i11].f17910i, 0, 5);
                }
                dVar.h(r14.mListAnchors[i11].f17910i, fVar.mListAnchors[i11].f17910i, i15, 8);
            }
            d dVar10 = r14.mListAnchors[i11 + 1].f17907f;
            if (dVar10 != null) {
                ?? r42 = dVar10.f17905d;
                d dVar11 = r42.mListAnchors[i11].f17907f;
                if (dVar11 != null && dVar11.f17905d == r14) {
                    r22 = r42;
                }
            }
            if (r22 != null) {
                r14 = r22;
                z16 = z13;
            } else {
                z16 = true;
            }
            f12 = f10;
            z15 = z17;
            z12 = z19;
            z10 = z14;
            r14 = r14;
        }
        boolean z21 = z15;
        boolean z22 = z12;
        boolean z23 = z10;
        if (eVar7 != null) {
            int i21 = i11 + 1;
            if (eVar5.mListAnchors[i21].f17907f != null) {
                d dVar12 = eVar7.mListAnchors[i21];
                if (eVar7.mListDimensionBehaviors[i16] == e.b.MATCH_CONSTRAINT && eVar7.mResolvedMatchConstraintDefault[i16] == 0 && !z22) {
                    d dVar13 = dVar12.f17907f;
                    if (dVar13.f17905d == fVar) {
                        dVar.e(dVar12.f17910i, dVar13.f17910i, -dVar12.f(), 5);
                        dVar.j(dVar12.f17910i, eVar5.mListAnchors[i21].f17907f.f17910i, -dVar12.f(), 6);
                        if (z21) {
                            int i22 = i11 + 1;
                            androidx.constraintlayout.core.i iVar5 = fVar.mListAnchors[i22].f17910i;
                            d dVar14 = eVar5.mListAnchors[i22];
                            dVar.h(iVar5, dVar14.f17910i, dVar14.f(), 8);
                        }
                        arrayList = cVar.f17887h;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f14 = (cVar.f17897r || cVar.f17899t) ? f10 : cVar.f17889j;
                            float f15 = 0.0f;
                            float f16 = 0.0f;
                            e eVar9 = null;
                            i14 = 0;
                            while (i14 < size) {
                                e eVar10 = (e) arrayList.get(i14);
                                float f17 = eVar10.mWeight[i16];
                                if (f17 >= f15) {
                                    f11 = f15;
                                } else if (cVar.f17899t) {
                                    d[] dVarArr2 = eVar10.mListAnchors;
                                    f11 = f15;
                                    dVar.e(dVarArr2[i11 + 1].f17910i, dVarArr2[i11].f17910i, 0, 4);
                                    arrayList2 = arrayList;
                                    i14++;
                                    f15 = f11;
                                    arrayList = arrayList2;
                                } else {
                                    f11 = f15;
                                    f17 = 1.0f;
                                }
                                float f18 = f17;
                                if (f18 == f11) {
                                    d[] dVarArr3 = eVar10.mListAnchors;
                                    dVar.e(dVarArr3[i11 + 1].f17910i, dVarArr3[i11].f17910i, 0, 8);
                                    arrayList2 = arrayList;
                                    i14++;
                                    f15 = f11;
                                    arrayList = arrayList2;
                                } else {
                                    if (eVar9 != null) {
                                        d[] dVarArr4 = eVar9.mListAnchors;
                                        androidx.constraintlayout.core.i iVar6 = dVarArr4[i11].f17910i;
                                        int i23 = i11 + 1;
                                        androidx.constraintlayout.core.i iVar7 = dVarArr4[i23].f17910i;
                                        d[] dVarArr5 = eVar10.mListAnchors;
                                        arrayList2 = arrayList;
                                        androidx.constraintlayout.core.i iVar8 = dVarArr5[i11].f17910i;
                                        androidx.constraintlayout.core.i iVar9 = dVarArr5[i23].f17910i;
                                        androidx.constraintlayout.core.b r10 = dVar.r();
                                        r10.l(f16, f14, f18, iVar6, iVar7, iVar8, iVar9);
                                        dVar.d(r10);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    eVar9 = eVar10;
                                    f16 = f18;
                                    i14++;
                                    f15 = f11;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        if (eVar6 == null && (eVar6 == eVar7 || z22)) {
                            d dVar15 = eVar4.mListAnchors[i11];
                            int i24 = i11 + 1;
                            d dVar16 = eVar5.mListAnchors[i24];
                            d dVar17 = dVar15.f17907f;
                            androidx.constraintlayout.core.i iVar10 = dVar17 != null ? dVar17.f17910i : null;
                            d dVar18 = dVar16.f17907f;
                            androidx.constraintlayout.core.i iVar11 = dVar18 != null ? dVar18.f17910i : null;
                            d dVar19 = eVar6.mListAnchors[i11];
                            if (eVar7 != null) {
                                dVar16 = eVar7.mListAnchors[i24];
                            }
                            if (iVar10 != null && iVar11 != null) {
                                dVar.c(dVar19.f17910i, iVar10, dVar19.f(), i16 == 0 ? eVar8.f17962h0 : eVar8.f17964i0, iVar11, dVar16.f17910i, dVar16.f(), 7);
                            }
                        } else if (!z23 && eVar6 != null) {
                            int i25 = cVar.f17889j;
                            boolean z24 = i25 > 0 && cVar.f17888i == i25;
                            e eVar11 = eVar6;
                            e eVar12 = eVar11;
                            while (eVar11 != null) {
                                e eVar13 = eVar11.mNextChainWidget[i16];
                                while (true) {
                                    if (eVar13 == null) {
                                        i12 = 8;
                                        break;
                                    }
                                    i12 = 8;
                                    if (eVar13.V() != 8) {
                                        break;
                                    } else {
                                        eVar13 = eVar13.mNextChainWidget[i16];
                                    }
                                }
                                if (eVar13 != null || eVar11 == eVar7) {
                                    d dVar20 = eVar11.mListAnchors[i11];
                                    androidx.constraintlayout.core.i iVar12 = dVar20.f17910i;
                                    d dVar21 = dVar20.f17907f;
                                    androidx.constraintlayout.core.i iVar13 = dVar21 != null ? dVar21.f17910i : null;
                                    if (eVar12 != eVar11) {
                                        iVar13 = eVar12.mListAnchors[i11 + 1].f17910i;
                                    } else if (eVar11 == eVar6) {
                                        d dVar22 = eVar4.mListAnchors[i11].f17907f;
                                        iVar13 = dVar22 != null ? dVar22.f17910i : null;
                                    }
                                    int f19 = dVar20.f();
                                    int i26 = i11 + 1;
                                    int f20 = eVar11.mListAnchors[i26].f();
                                    if (eVar13 != null) {
                                        dVar6 = eVar13.mListAnchors[i11];
                                        iVar3 = dVar6.f17910i;
                                    } else {
                                        dVar6 = eVar5.mListAnchors[i26].f17907f;
                                        iVar3 = dVar6 != null ? dVar6.f17910i : null;
                                    }
                                    androidx.constraintlayout.core.i iVar14 = eVar11.mListAnchors[i26].f17910i;
                                    if (dVar6 != null) {
                                        f20 += dVar6.f();
                                    }
                                    int f21 = f19 + eVar12.mListAnchors[i26].f();
                                    if (iVar12 == null || iVar13 == null || iVar3 == null || iVar14 == null) {
                                        eVar3 = eVar13;
                                        i13 = 8;
                                    } else {
                                        if (eVar11 == eVar6) {
                                            f21 = eVar6.mListAnchors[i11].f();
                                        }
                                        if (eVar11 == eVar7) {
                                            f20 = eVar7.mListAnchors[i26].f();
                                        }
                                        eVar3 = eVar13;
                                        i13 = 8;
                                        dVar.c(iVar12, iVar13, f21, 0.5f, iVar3, iVar14, f20, z24 ? 8 : 5);
                                        if (eVar11.V() == i13) {
                                            eVar12 = eVar11;
                                        }
                                        i16 = i10;
                                        eVar11 = eVar3;
                                    }
                                } else {
                                    eVar3 = eVar13;
                                    i13 = i12;
                                }
                                if (eVar11.V() == i13) {
                                }
                                i16 = i10;
                                eVar11 = eVar3;
                            }
                        } else if (z11 && eVar6 != null) {
                            int i27 = cVar.f17889j;
                            boolean z25 = i27 <= 0 && cVar.f17888i == i27;
                            eVar = eVar6;
                            e eVar14 = eVar;
                            while (eVar != null) {
                                e eVar15 = eVar.mNextChainWidget[i10];
                                while (eVar15 != null && eVar15.V() == 8) {
                                    eVar15 = eVar15.mNextChainWidget[i10];
                                }
                                if (eVar != eVar6 && eVar != eVar7 && eVar15 != null) {
                                    if (eVar15 == eVar7) {
                                        eVar15 = null;
                                    }
                                    d dVar23 = eVar.mListAnchors[i11];
                                    androidx.constraintlayout.core.i iVar15 = dVar23.f17910i;
                                    d dVar24 = dVar23.f17907f;
                                    if (dVar24 != null) {
                                        androidx.constraintlayout.core.i iVar16 = dVar24.f17910i;
                                    }
                                    int i28 = i11 + 1;
                                    androidx.constraintlayout.core.i iVar17 = eVar14.mListAnchors[i28].f17910i;
                                    int f22 = dVar23.f();
                                    int f23 = eVar.mListAnchors[i28].f();
                                    if (eVar15 != null) {
                                        dVar5 = eVar15.mListAnchors[i11];
                                        iVar = dVar5.f17910i;
                                        d dVar25 = dVar5.f17907f;
                                        iVar2 = dVar25 != null ? dVar25.f17910i : null;
                                    } else {
                                        dVar5 = eVar7.mListAnchors[i11];
                                        iVar = dVar5 != null ? dVar5.f17910i : null;
                                        iVar2 = eVar.mListAnchors[i28].f17910i;
                                    }
                                    if (dVar5 != null) {
                                        f23 += dVar5.f();
                                    }
                                    int f24 = f22 + eVar14.mListAnchors[i28].f();
                                    int i29 = z25 ? 8 : 4;
                                    if (iVar15 == null || iVar17 == null || iVar == null || iVar2 == null) {
                                        eVar2 = eVar15;
                                    } else {
                                        eVar2 = eVar15;
                                        dVar.c(iVar15, iVar17, f24, 0.5f, iVar, iVar2, f23, i29);
                                    }
                                    eVar15 = eVar2;
                                }
                                if (eVar.V() != 8) {
                                    eVar14 = eVar;
                                }
                                eVar = eVar15;
                            }
                            d dVar26 = eVar6.mListAnchors[i11];
                            dVar2 = eVar4.mListAnchors[i11].f17907f;
                            int i30 = i11 + 1;
                            d dVar27 = eVar7.mListAnchors[i30];
                            dVar3 = eVar5.mListAnchors[i30].f17907f;
                            if (dVar2 != null) {
                                if (eVar6 != eVar7) {
                                    dVar.e(dVar26.f17910i, dVar2.f17910i, dVar26.f(), 5);
                                } else if (dVar3 != null) {
                                    dVar4 = dVar;
                                    dVar4.c(dVar26.f17910i, dVar2.f17910i, dVar26.f(), 0.5f, dVar27.f17910i, dVar3.f17910i, dVar27.f(), 5);
                                    if (dVar3 != null && eVar6 != eVar7) {
                                        dVar4.e(dVar27.f17910i, dVar3.f17910i, -dVar27.f(), 5);
                                    }
                                    if ((z23 && !z11) || eVar6 == null || eVar6 == eVar7) {
                                        return;
                                    }
                                    d[] dVarArr6 = eVar6.mListAnchors;
                                    d dVar28 = dVarArr6[i11];
                                    if (eVar7 == null) {
                                        eVar7 = eVar6;
                                    }
                                    int i31 = i11 + 1;
                                    d dVar29 = eVar7.mListAnchors[i31];
                                    d dVar30 = dVar28.f17907f;
                                    iVar4 = dVar30 == null ? dVar30.f17910i : null;
                                    d dVar31 = dVar29.f17907f;
                                    androidx.constraintlayout.core.i iVar18 = dVar31 == null ? dVar31.f17910i : null;
                                    if (eVar5 != eVar7) {
                                        d dVar32 = eVar5.mListAnchors[i31].f17907f;
                                        iVar18 = dVar32 != null ? dVar32.f17910i : null;
                                    }
                                    if (eVar6 == eVar7) {
                                        dVar29 = dVarArr6[i31];
                                    }
                                    if (iVar4 != null || iVar18 == null) {
                                        return;
                                    }
                                    dVar4.c(dVar28.f17910i, iVar4, dVar28.f(), 0.5f, iVar18, dVar29.f17910i, eVar7.mListAnchors[i31].f(), 5);
                                    return;
                                }
                            }
                            dVar4 = dVar;
                            if (dVar3 != null) {
                                dVar4.e(dVar27.f17910i, dVar3.f17910i, -dVar27.f(), 5);
                            }
                            if (z23) {
                            }
                            d[] dVarArr62 = eVar6.mListAnchors;
                            d dVar282 = dVarArr62[i11];
                            if (eVar7 == null) {
                            }
                            int i312 = i11 + 1;
                            d dVar292 = eVar7.mListAnchors[i312];
                            d dVar302 = dVar282.f17907f;
                            if (dVar302 == null) {
                            }
                            d dVar312 = dVar292.f17907f;
                            if (dVar312 == null) {
                            }
                            if (eVar5 != eVar7) {
                            }
                            if (eVar6 == eVar7) {
                            }
                            if (iVar4 != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        dVar4 = dVar;
                        if (z23) {
                        }
                        d[] dVarArr622 = eVar6.mListAnchors;
                        d dVar2822 = dVarArr622[i11];
                        if (eVar7 == null) {
                        }
                        int i3122 = i11 + 1;
                        d dVar2922 = eVar7.mListAnchors[i3122];
                        d dVar3022 = dVar2822.f17907f;
                        if (dVar3022 == null) {
                        }
                        d dVar3122 = dVar2922.f17907f;
                        if (dVar3122 == null) {
                        }
                        if (eVar5 != eVar7) {
                        }
                        if (eVar6 == eVar7) {
                        }
                        if (iVar4 != null) {
                        }
                    }
                }
                if (z22) {
                    d dVar33 = dVar12.f17907f;
                    if (dVar33.f17905d == fVar) {
                        dVar.e(dVar12.f17910i, dVar33.f17910i, -dVar12.f(), 4);
                    }
                }
                dVar.j(dVar12.f17910i, eVar5.mListAnchors[i21].f17907f.f17910i, -dVar12.f(), 6);
                if (z21) {
                }
                arrayList = cVar.f17887h;
                if (arrayList != null) {
                    if (cVar.f17897r) {
                    }
                    float f152 = 0.0f;
                    float f162 = 0.0f;
                    e eVar92 = null;
                    i14 = 0;
                    while (i14 < size) {
                    }
                }
                if (eVar6 == null) {
                }
                if (!z23) {
                }
                if (z11) {
                    int i272 = cVar.f17889j;
                    if (i272 <= 0) {
                    }
                    eVar = eVar6;
                    e eVar142 = eVar;
                    while (eVar != null) {
                    }
                    d dVar262 = eVar6.mListAnchors[i11];
                    dVar2 = eVar4.mListAnchors[i11].f17907f;
                    int i302 = i11 + 1;
                    d dVar272 = eVar7.mListAnchors[i302];
                    dVar3 = eVar5.mListAnchors[i302].f17907f;
                    if (dVar2 != null) {
                    }
                    dVar4 = dVar;
                    if (dVar3 != null) {
                    }
                    if (z23) {
                    }
                    d[] dVarArr6222 = eVar6.mListAnchors;
                    d dVar28222 = dVarArr6222[i11];
                    if (eVar7 == null) {
                    }
                    int i31222 = i11 + 1;
                    d dVar29222 = eVar7.mListAnchors[i31222];
                    d dVar30222 = dVar28222.f17907f;
                    if (dVar30222 == null) {
                    }
                    d dVar31222 = dVar29222.f17907f;
                    if (dVar31222 == null) {
                    }
                    if (eVar5 != eVar7) {
                    }
                    if (eVar6 == eVar7) {
                    }
                    if (iVar4 != null) {
                    }
                }
                dVar4 = dVar;
                if (z23) {
                }
                d[] dVarArr62222 = eVar6.mListAnchors;
                d dVar282222 = dVarArr62222[i11];
                if (eVar7 == null) {
                }
                int i312222 = i11 + 1;
                d dVar292222 = eVar7.mListAnchors[i312222];
                d dVar302222 = dVar282222.f17907f;
                if (dVar302222 == null) {
                }
                d dVar312222 = dVar292222.f17907f;
                if (dVar312222 == null) {
                }
                if (eVar5 != eVar7) {
                }
                if (eVar6 == eVar7) {
                }
                if (iVar4 != null) {
                }
            }
        }
        if (z21) {
        }
        arrayList = cVar.f17887h;
        if (arrayList != null) {
        }
        if (eVar6 == null) {
        }
        if (!z23) {
        }
        if (z11) {
        }
        dVar4 = dVar;
        if (z23) {
        }
        d[] dVarArr622222 = eVar6.mListAnchors;
        d dVar2822222 = dVarArr622222[i11];
        if (eVar7 == null) {
        }
        int i3122222 = i11 + 1;
        d dVar2922222 = eVar7.mListAnchors[i3122222];
        d dVar3022222 = dVar2822222.f17907f;
        if (dVar3022222 == null) {
        }
        d dVar3122222 = dVar2922222.f17907f;
        if (dVar3122222 == null) {
        }
        if (eVar5 != eVar7) {
        }
        if (eVar6 == eVar7) {
        }
        if (iVar4 != null) {
        }
    }

    public static void b(f fVar, androidx.constraintlayout.core.d dVar, ArrayList arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i11 = fVar.f18013M0;
            cVarArr = fVar.mHorizontalChainsArray;
            i12 = 0;
        } else {
            i11 = fVar.f18014N0;
            cVarArr = fVar.mVerticalChainsArray;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f17880a)) {
                a(fVar, dVar, i10, i12, cVar);
            }
        }
    }
}
