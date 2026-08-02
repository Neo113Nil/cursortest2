package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code restructure failed: missing block: B:160:0x029d, code lost:
    
        if (r8.d == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        if (r4.d == r7) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x044d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06fa A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x059b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        c[] cVarArr;
        int i3;
        int i4;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        boolean z4;
        int i5;
        c[] cVarArr2;
        ArrayList<ConstraintWidget> arrayList2;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        androidx.constraintlayout.core.c cVar2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget4;
        int i6;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        int i7;
        ConstraintAnchor constraintAnchor6;
        ConstraintAnchor[] constraintAnchorArr;
        int i8;
        ConstraintAnchor constraintAnchor7;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int size;
        int i9;
        ArrayList<ConstraintWidget> arrayList3;
        int i10;
        int i11;
        ConstraintWidget constraintWidget7;
        float f3;
        float f4;
        int i12;
        c[] cVarArr3;
        ConstraintWidget constraintWidget8;
        int i13;
        int i14;
        int i15;
        int i16;
        ConstraintAnchor constraintAnchor8;
        ConstraintWidget constraintWidget9;
        float f5;
        d dVar2 = dVar;
        androidx.constraintlayout.core.c cVar3 = cVar;
        ArrayList<ConstraintWidget> arrayList4 = arrayList;
        if (i == 0) {
            i2 = dVar2.E0;
            cVarArr = dVar2.H0;
            i3 = 0;
        } else {
            i2 = dVar2.F0;
            cVarArr = dVar2.G0;
            i3 = 2;
        }
        int i17 = i2;
        c[] cVarArr4 = cVarArr;
        int i18 = 0;
        while (i18 < i17) {
            c cVar4 = cVarArr4[i18];
            boolean z5 = cVar4.q;
            ConstraintWidget constraintWidget10 = cVar4.a;
            int i19 = 8;
            if (z5) {
                i4 = i18;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                int i20 = cVar4.l;
                int i21 = i20 * 2;
                ConstraintWidget constraintWidget11 = constraintWidget10;
                ConstraintWidget constraintWidget12 = constraintWidget11;
                boolean z6 = false;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (!z6) {
                    cVar4.i++;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget11.q0;
                    ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.S;
                    constraintWidgetArr[i20] = null;
                    constraintWidget11.p0[i20] = null;
                    if (constraintWidget11.j0 != i19) {
                        constraintWidget11.o(i20);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        constraintAnchorArr2[i21].e();
                        int i22 = i21 + 1;
                        constraintAnchorArr2[i22].e();
                        constraintAnchorArr2[i21].e();
                        constraintAnchorArr2[i22].e();
                        if (cVar4.b == null) {
                            cVar4.b = constraintWidget11;
                        }
                        cVar4.d = constraintWidget11;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget11.V[i20];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            i14 = i18;
                            int i23 = constraintWidget11.u[i20];
                            i15 = i20;
                            if (i23 == 0 || i23 == 3 || i23 == 2) {
                                cVar4.j++;
                                float f6 = constraintWidget11.o0[i15];
                                if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f5 = f6;
                                    cVar4.k += f5;
                                } else {
                                    f5 = f6;
                                }
                                i16 = i21;
                                if (constraintWidget11.j0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i23 == 0 || i23 == 3)) {
                                    if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        cVar4.n = true;
                                    } else {
                                        cVar4.o = true;
                                    }
                                    if (cVar4.h == null) {
                                        cVar4.h = new ArrayList<>();
                                    }
                                    cVar4.h.add(constraintWidget11);
                                }
                                if (cVar4.f == null) {
                                    cVar4.f = constraintWidget11;
                                }
                                ConstraintWidget constraintWidget13 = cVar4.g;
                                if (constraintWidget13 != null) {
                                    constraintWidget13.p0[i15] = constraintWidget11;
                                }
                                cVar4.g = constraintWidget11;
                            } else {
                                i16 = i21;
                            }
                            if (i15 == 0) {
                                if (constraintWidget11.s == 0 && constraintWidget11.v == 0) {
                                    int i24 = constraintWidget11.w;
                                }
                            } else if (constraintWidget11.t == 0 && constraintWidget11.y == 0) {
                                int i25 = constraintWidget11.z;
                            }
                            if (constraintWidget12 != constraintWidget11) {
                                constraintWidget12.q0[i15] = constraintWidget11;
                            }
                            constraintAnchor8 = constraintAnchorArr2[i16 + 1].f;
                            if (constraintAnchor8 != null) {
                                constraintWidget9 = constraintAnchor8.d;
                                ConstraintAnchor constraintAnchor9 = constraintWidget9.S[i16].f;
                                if (constraintAnchor9 != null) {
                                }
                            }
                            constraintWidget9 = null;
                            if (constraintWidget9 != null) {
                                constraintWidget9 = constraintWidget11;
                                z6 = true;
                            }
                            constraintWidget12 = constraintWidget11;
                            i20 = i15;
                            i21 = i16;
                            i19 = 8;
                            constraintWidget11 = constraintWidget9;
                            i18 = i14;
                        }
                    }
                    i14 = i18;
                    i15 = i20;
                    i16 = i21;
                    if (constraintWidget12 != constraintWidget11) {
                    }
                    constraintAnchor8 = constraintAnchorArr2[i16 + 1].f;
                    if (constraintAnchor8 != null) {
                    }
                    constraintWidget9 = null;
                    if (constraintWidget9 != null) {
                    }
                    constraintWidget12 = constraintWidget11;
                    i20 = i15;
                    i21 = i16;
                    i19 = 8;
                    constraintWidget11 = constraintWidget9;
                    i18 = i14;
                }
                i4 = i18;
                int i26 = i20;
                int i27 = i21;
                ConstraintWidget constraintWidget14 = cVar4.b;
                if (constraintWidget14 != null) {
                    constraintWidget14.S[i27].e();
                }
                ConstraintWidget constraintWidget15 = cVar4.d;
                if (constraintWidget15 != null) {
                    constraintWidget15.S[i27 + 1].e();
                }
                cVar4.c = constraintWidget11;
                if (i26 == 0 && cVar4.m) {
                    cVar4.e = constraintWidget11;
                } else {
                    cVar4.e = constraintWidget10;
                }
                cVar4.p = cVar4.o && cVar4.n;
            }
            cVar4.q = true;
            if (arrayList4 == null || arrayList4.contains(constraintWidget10)) {
                ConstraintWidget constraintWidget16 = cVar4.c;
                ConstraintWidget constraintWidget17 = cVar4.b;
                ConstraintWidget constraintWidget18 = cVar4.d;
                ConstraintWidget constraintWidget19 = cVar4.e;
                float f7 = cVar4.k;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar2.V;
                ConstraintAnchor[] constraintAnchorArr3 = dVar2.S;
                boolean z7 = dimensionBehaviourArr[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i28 = constraintWidget19.m0;
                    boolean z8 = i28 == 0;
                    f2 = f7;
                    z2 = i28 == 1;
                    z3 = i28 == 2;
                    constraintWidget = constraintWidget10;
                    z4 = z7;
                    z = z8;
                } else {
                    f2 = f7;
                    int i29 = constraintWidget19.n0;
                    z = i29 == 0;
                    z2 = i29 == 1;
                    z3 = i29 == 2;
                    constraintWidget = constraintWidget10;
                    z4 = z7;
                }
                boolean z9 = z2;
                boolean z10 = false;
                while (!z10) {
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget.S;
                    ConstraintAnchor constraintAnchor10 = constraintAnchorArr4[i3];
                    int i30 = z3 ? 1 : 4;
                    int e = constraintAnchor10.e();
                    ConstraintAnchor[] constraintAnchorArr5 = constraintAnchorArr3;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget.V[i];
                    boolean z11 = z3;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z12 = dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget.u[i] == 0;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor10.f;
                    if (constraintAnchor11 != null && constraintWidget != constraintWidget10) {
                        e = constraintAnchor11.e() + e;
                    }
                    int i31 = e;
                    if (z11 && constraintWidget != constraintWidget10 && constraintWidget != constraintWidget17) {
                        i30 = 8;
                    }
                    ConstraintAnchor constraintAnchor12 = constraintAnchor10.f;
                    if (constraintAnchor12 != null) {
                        if (constraintWidget == constraintWidget17) {
                            i12 = i17;
                            cVarArr3 = cVarArr4;
                            cVar3.f(constraintAnchor10.i, constraintAnchor12.i, i31, 6);
                        } else {
                            i12 = i17;
                            cVarArr3 = cVarArr4;
                            cVar3.f(constraintAnchor10.i, constraintAnchor12.i, i31, 8);
                        }
                        if (z12 && !z11) {
                            i30 = 5;
                        }
                        cVar3.e(constraintAnchor10.i, constraintAnchor10.f.i, i31, (constraintWidget == constraintWidget17 && z11 && constraintWidget.U[i]) ? 5 : i30);
                    } else {
                        i12 = i17;
                        cVarArr3 = cVarArr4;
                    }
                    if (z4) {
                        if (constraintWidget.j0 == 8 || constraintWidget.V[i] != dimensionBehaviour4) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            cVar3.f(constraintAnchorArr4[i3 + 1].i, constraintAnchorArr4[i3].i, 0, 5);
                        }
                        cVar3.f(constraintAnchorArr4[i3].i, constraintAnchorArr5[i3].i, i13, 8);
                    }
                    ConstraintAnchor constraintAnchor13 = constraintAnchorArr4[i3 + 1].f;
                    if (constraintAnchor13 != null) {
                        constraintWidget8 = constraintAnchor13.d;
                        ConstraintAnchor constraintAnchor14 = constraintWidget8.S[i3].f;
                        if (constraintAnchor14 != null) {
                        }
                    }
                    constraintWidget8 = null;
                    if (constraintWidget8 != null) {
                        constraintWidget = constraintWidget8;
                    } else {
                        z10 = true;
                    }
                    i17 = i12;
                    constraintAnchorArr3 = constraintAnchorArr5;
                    z3 = z11;
                    cVarArr4 = cVarArr3;
                }
                ConstraintAnchor[] constraintAnchorArr6 = constraintAnchorArr3;
                boolean z13 = z3;
                i5 = i17;
                cVarArr2 = cVarArr4;
                if (constraintWidget18 != null) {
                    int i32 = i3 + 1;
                    if (constraintWidget16.S[i32].f != null) {
                        ConstraintAnchor constraintAnchor15 = constraintWidget18.S[i32];
                        if (constraintWidget18.V[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget18.u[i] == 0 && !z13) {
                            ConstraintAnchor constraintAnchor16 = constraintAnchor15.f;
                            if (constraintAnchor16.d == dVar2) {
                                cVar3.e(constraintAnchor15.i, constraintAnchor16.i, -constraintAnchor15.e(), 5);
                                cVar3.g(constraintAnchor15.i, constraintWidget16.S[i32].f.i, -constraintAnchor15.e(), 6);
                                if (z4) {
                                    int i33 = i3 + 1;
                                    SolverVariable solverVariable6 = constraintAnchorArr6[i33].i;
                                    ConstraintAnchor constraintAnchor17 = constraintWidget16.S[i33];
                                    cVar3.f(solverVariable6, constraintAnchor17.i, constraintAnchor17.e(), 8);
                                }
                                arrayList2 = cVar4.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    if (cVar4.n && !cVar4.p) {
                                        f2 = cVar4.j;
                                    }
                                    ConstraintWidget constraintWidget20 = null;
                                    float f8 = f;
                                    i9 = 0;
                                    while (i9 < size) {
                                        ConstraintWidget constraintWidget21 = arrayList2.get(i9);
                                        float[] fArr = constraintWidget21.o0;
                                        ConstraintAnchor[] constraintAnchorArr7 = constraintWidget21.S;
                                        float f9 = fArr[i];
                                        if (f9 < f) {
                                            if (cVar4.p) {
                                                arrayList3 = arrayList2;
                                                cVar3.e(constraintAnchorArr7[i3 + 1].i, constraintAnchorArr7[i3].i, 0, 4);
                                                i10 = i9;
                                                i11 = size;
                                                f3 = f;
                                                i9 = i10 + 1;
                                                arrayList2 = arrayList3;
                                                size = i11;
                                                f = f3;
                                            } else {
                                                f9 = 1.0f;
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                        if (f9 == f) {
                                            i10 = i9;
                                            cVar3.e(constraintAnchorArr7[i3 + 1].i, constraintAnchorArr7[i3].i, 0, 8);
                                            i11 = size;
                                            f3 = f;
                                            i9 = i10 + 1;
                                            arrayList2 = arrayList3;
                                            size = i11;
                                            f = f3;
                                        } else {
                                            i10 = i9;
                                            if (constraintWidget20 != null) {
                                                ConstraintAnchor[] constraintAnchorArr8 = constraintWidget20.S;
                                                SolverVariable solverVariable7 = constraintAnchorArr8[i3].i;
                                                int i34 = i3 + 1;
                                                SolverVariable solverVariable8 = constraintAnchorArr8[i34].i;
                                                SolverVariable solverVariable9 = constraintAnchorArr7[i3].i;
                                                SolverVariable solverVariable10 = constraintAnchorArr7[i34].i;
                                                i11 = size;
                                                androidx.constraintlayout.core.b l = cVar3.l();
                                                constraintWidget7 = constraintWidget21;
                                                float f10 = f;
                                                l.b = f10;
                                                f3 = f10;
                                                if (f2 == f10 || f8 == f9) {
                                                    f4 = f9;
                                                    l.d.b(solverVariable7, 1.0f);
                                                    l.d.b(solverVariable8, -1.0f);
                                                    l.d.b(solverVariable10, 1.0f);
                                                    l.d.b(solverVariable9, -1.0f);
                                                } else {
                                                    if (f8 == f3) {
                                                        l.d.b(solverVariable7, 1.0f);
                                                        l.d.b(solverVariable8, -1.0f);
                                                    } else if (f9 == f) {
                                                        l.d.b(solverVariable9, 1.0f);
                                                        l.d.b(solverVariable10, -1.0f);
                                                    } else {
                                                        float f11 = (f8 / f2) / (f9 / f2);
                                                        f4 = f9;
                                                        l.d.b(solverVariable7, 1.0f);
                                                        l.d.b(solverVariable8, -1.0f);
                                                        l.d.b(solverVariable10, f11);
                                                        l.d.b(solverVariable9, -f11);
                                                    }
                                                    f4 = f9;
                                                }
                                                cVar3.c(l);
                                            } else {
                                                i11 = size;
                                                constraintWidget7 = constraintWidget21;
                                                f3 = f;
                                                f4 = f9;
                                            }
                                            f8 = f4;
                                            constraintWidget20 = constraintWidget7;
                                            i9 = i10 + 1;
                                            arrayList2 = arrayList3;
                                            size = i11;
                                            f = f3;
                                        }
                                    }
                                }
                                if (constraintWidget17 == null && (constraintWidget17 == constraintWidget18 || z13)) {
                                    ConstraintAnchor constraintAnchor18 = constraintWidget10.S[i3];
                                    int i35 = i3 + 1;
                                    ConstraintAnchor constraintAnchor19 = constraintWidget16.S[i35];
                                    ConstraintAnchor constraintAnchor20 = constraintAnchor18.f;
                                    SolverVariable solverVariable11 = constraintAnchor20 != null ? constraintAnchor20.i : null;
                                    ConstraintAnchor constraintAnchor21 = constraintAnchor19.f;
                                    SolverVariable solverVariable12 = constraintAnchor21 != null ? constraintAnchor21.i : null;
                                    ConstraintAnchor constraintAnchor22 = constraintWidget17.S[i3];
                                    if (constraintWidget18 != null) {
                                        constraintAnchor19 = constraintWidget18.S[i35];
                                    }
                                    if (solverVariable11 == null || solverVariable12 == null) {
                                        constraintWidget2 = constraintWidget18;
                                    } else {
                                        float f12 = i == 0 ? constraintWidget19.g0 : constraintWidget19.h0;
                                        int e2 = constraintAnchor22.e();
                                        int e3 = constraintAnchor19.e();
                                        SolverVariable solverVariable13 = constraintAnchor22.i;
                                        SolverVariable solverVariable14 = constraintAnchor19.i;
                                        SolverVariable solverVariable15 = solverVariable11;
                                        constraintWidget2 = constraintWidget18;
                                        cVar3.b(solverVariable13, solverVariable15, e2, f12, solverVariable12, solverVariable14, e3, 7);
                                    }
                                } else {
                                    constraintWidget2 = constraintWidget18;
                                    if (!z && constraintWidget17 != null) {
                                        int i36 = cVar4.j;
                                        boolean z14 = i36 > 0 && cVar4.i == i36;
                                        ConstraintWidget constraintWidget22 = constraintWidget17;
                                        ConstraintWidget constraintWidget23 = constraintWidget22;
                                        while (constraintWidget22 != null) {
                                            ConstraintAnchor[] constraintAnchorArr9 = constraintWidget22.S;
                                            ConstraintWidget constraintWidget24 = constraintWidget22.q0[i];
                                            while (true) {
                                                if (constraintWidget24 == null) {
                                                    i6 = 8;
                                                    break;
                                                }
                                                i6 = 8;
                                                if (constraintWidget24.j0 != 8) {
                                                    break;
                                                } else {
                                                    constraintWidget24 = constraintWidget24.q0[i];
                                                }
                                            }
                                            if (constraintWidget24 != null || constraintWidget22 == constraintWidget2) {
                                                ConstraintAnchor constraintAnchor23 = constraintAnchorArr9[i3];
                                                SolverVariable solverVariable16 = constraintAnchor23.i;
                                                ConstraintAnchor constraintAnchor24 = constraintAnchor23.f;
                                                SolverVariable solverVariable17 = constraintAnchor24 != null ? constraintAnchor24.i : null;
                                                if (constraintWidget23 != constraintWidget22) {
                                                    solverVariable17 = constraintWidget23.S[i3 + 1].i;
                                                } else if (constraintWidget22 == constraintWidget17) {
                                                    ConstraintAnchor constraintAnchor25 = constraintWidget10.S[i3].f;
                                                    solverVariable17 = constraintAnchor25 != null ? constraintAnchor25.i : null;
                                                }
                                                int e4 = constraintAnchor23.e();
                                                int i37 = i3 + 1;
                                                int e5 = constraintAnchorArr9[i37].e();
                                                if (constraintWidget24 != null) {
                                                    constraintAnchor5 = constraintWidget24.S[i3];
                                                    solverVariable3 = constraintAnchor5.i;
                                                } else {
                                                    constraintAnchor5 = constraintWidget16.S[i37].f;
                                                    solverVariable3 = constraintAnchor5 != null ? constraintAnchor5.i : null;
                                                }
                                                SolverVariable solverVariable18 = constraintAnchorArr9[i37].i;
                                                if (constraintAnchor5 != null) {
                                                    e5 += constraintAnchor5.e();
                                                }
                                                int e6 = constraintWidget23.S[i37].e() + e4;
                                                if (solverVariable16 == null || solverVariable17 == null || solverVariable3 == null || solverVariable18 == null) {
                                                    constraintWidget5 = constraintWidget10;
                                                    constraintWidget6 = constraintWidget23;
                                                    i7 = 8;
                                                } else {
                                                    if (constraintWidget22 == constraintWidget17) {
                                                        e6 = constraintWidget17.S[i3].e();
                                                    }
                                                    if (constraintWidget22 == constraintWidget2) {
                                                        e5 = constraintWidget2.S[i37].e();
                                                    }
                                                    constraintWidget5 = constraintWidget10;
                                                    constraintWidget6 = constraintWidget23;
                                                    i7 = 8;
                                                    cVar.b(solverVariable16, solverVariable17, e6, 0.5f, solverVariable3, solverVariable18, e5, z14 ? 8 : 5);
                                                }
                                            } else {
                                                constraintWidget5 = constraintWidget10;
                                                constraintWidget6 = constraintWidget23;
                                                i7 = i6;
                                            }
                                            if (constraintWidget22.j0 != i7) {
                                                constraintWidget6 = constraintWidget22;
                                            }
                                            constraintWidget22 = constraintWidget24;
                                            constraintWidget23 = constraintWidget6;
                                            constraintWidget10 = constraintWidget5;
                                        }
                                    } else if (z9 && constraintWidget17 != null) {
                                        int i38 = cVar4.j;
                                        boolean z15 = i38 <= 0 && cVar4.i == i38;
                                        constraintWidget3 = constraintWidget17;
                                        ConstraintWidget constraintWidget25 = constraintWidget3;
                                        while (constraintWidget3 != null) {
                                            ConstraintAnchor[] constraintAnchorArr10 = constraintWidget3.S;
                                            ConstraintWidget constraintWidget26 = constraintWidget3.q0[i];
                                            while (constraintWidget26 != null && constraintWidget26.j0 == 8) {
                                                constraintWidget26 = constraintWidget26.q0[i];
                                            }
                                            if (constraintWidget3 != constraintWidget17 && constraintWidget3 != constraintWidget2 && constraintWidget26 != null) {
                                                if (constraintWidget26 == constraintWidget2) {
                                                    constraintWidget26 = null;
                                                }
                                                ConstraintAnchor constraintAnchor26 = constraintAnchorArr10[i3];
                                                SolverVariable solverVariable19 = constraintAnchor26.i;
                                                int i39 = i3 + 1;
                                                SolverVariable solverVariable20 = constraintWidget25.S[i39].i;
                                                int e7 = constraintAnchor26.e();
                                                int e8 = constraintAnchorArr10[i39].e();
                                                if (constraintWidget26 != null) {
                                                    constraintAnchor4 = constraintWidget26.S[i3];
                                                    solverVariable2 = constraintAnchor4.i;
                                                    ConstraintAnchor constraintAnchor27 = constraintAnchor4.f;
                                                    solverVariable = constraintAnchor27 != null ? constraintAnchor27.i : null;
                                                } else {
                                                    ConstraintAnchor constraintAnchor28 = constraintWidget2.S[i3];
                                                    SolverVariable solverVariable21 = constraintAnchor28 != null ? constraintAnchor28.i : null;
                                                    solverVariable = constraintAnchorArr10[i39].i;
                                                    constraintAnchor4 = constraintAnchor28;
                                                    solverVariable2 = solverVariable21;
                                                }
                                                if (constraintAnchor4 != null) {
                                                    e8 += constraintAnchor4.e();
                                                }
                                                int e9 = constraintWidget25.S[i39].e() + e7;
                                                int i40 = z15 ? 8 : 4;
                                                if (solverVariable19 == null || solverVariable20 == null || solverVariable2 == null || solverVariable == null) {
                                                    constraintWidget4 = constraintWidget26;
                                                } else {
                                                    constraintWidget4 = constraintWidget26;
                                                    cVar.b(solverVariable19, solverVariable20, e9, 0.5f, solverVariable2, solverVariable, e8, i40);
                                                }
                                                constraintWidget26 = constraintWidget4;
                                            }
                                            if (constraintWidget3.j0 != 8) {
                                                constraintWidget25 = constraintWidget3;
                                            }
                                            constraintWidget3 = constraintWidget26;
                                        }
                                        cVar2 = cVar;
                                        ConstraintAnchor constraintAnchor29 = constraintWidget17.S[i3];
                                        constraintAnchor = constraintWidget10.S[i3].f;
                                        int i41 = i3 + 1;
                                        constraintAnchor2 = constraintWidget2.S[i41];
                                        constraintAnchor3 = constraintWidget16.S[i41].f;
                                        if (constraintAnchor != null) {
                                            if (constraintWidget17 != constraintWidget2) {
                                                cVar2.e(constraintAnchor29.i, constraintAnchor.i, constraintAnchor29.e(), 5);
                                            } else if (constraintAnchor3 != null) {
                                                cVar2.b(constraintAnchor29.i, constraintAnchor.i, constraintAnchor29.e(), 0.5f, constraintAnchor2.i, constraintAnchor3.i, constraintAnchor2.e(), 5);
                                            }
                                        }
                                        if (constraintAnchor3 != null && constraintWidget17 != constraintWidget2) {
                                            cVar2.e(constraintAnchor2.i, constraintAnchor3.i, -constraintAnchor2.e(), 5);
                                        }
                                        if ((!z || z9) && constraintWidget17 != null && constraintWidget17 != constraintWidget2) {
                                            ConstraintAnchor[] constraintAnchorArr11 = constraintWidget17.S;
                                            constraintAnchor6 = constraintAnchorArr11[i3];
                                            if (constraintWidget2 == null) {
                                                constraintWidget2 = constraintWidget17;
                                            }
                                            constraintAnchorArr = constraintWidget2.S;
                                            i8 = i3 + 1;
                                            constraintAnchor7 = constraintAnchorArr[i8];
                                            ConstraintAnchor constraintAnchor30 = constraintAnchor6.f;
                                            solverVariable4 = constraintAnchor30 != null ? constraintAnchor30.i : null;
                                            ConstraintAnchor constraintAnchor31 = constraintAnchor7.f;
                                            solverVariable5 = constraintAnchor31 != null ? constraintAnchor31.i : null;
                                            if (constraintWidget16 != constraintWidget2) {
                                                ConstraintAnchor constraintAnchor32 = constraintWidget16.S[i8].f;
                                                solverVariable5 = constraintAnchor32 != null ? constraintAnchor32.i : null;
                                            }
                                            if (constraintWidget17 == constraintWidget2) {
                                                constraintAnchor7 = constraintAnchorArr11[i8];
                                            }
                                            if (solverVariable4 == null && solverVariable5 != null) {
                                                cVar2.b(constraintAnchor6.i, solverVariable4, constraintAnchor6.e(), 0.5f, solverVariable5, constraintAnchor7.i, constraintAnchorArr[i8].e(), 5);
                                            }
                                        }
                                    }
                                }
                                cVar2 = cVar;
                                if (!z) {
                                }
                                ConstraintAnchor[] constraintAnchorArr112 = constraintWidget17.S;
                                constraintAnchor6 = constraintAnchorArr112[i3];
                                if (constraintWidget2 == null) {
                                }
                                constraintAnchorArr = constraintWidget2.S;
                                i8 = i3 + 1;
                                constraintAnchor7 = constraintAnchorArr[i8];
                                ConstraintAnchor constraintAnchor302 = constraintAnchor6.f;
                                if (constraintAnchor302 != null) {
                                }
                                ConstraintAnchor constraintAnchor312 = constraintAnchor7.f;
                                if (constraintAnchor312 != null) {
                                }
                                if (constraintWidget16 != constraintWidget2) {
                                }
                                if (constraintWidget17 == constraintWidget2) {
                                }
                                if (solverVariable4 == null) {
                                    cVar2.b(constraintAnchor6.i, solverVariable4, constraintAnchor6.e(), 0.5f, solverVariable5, constraintAnchor7.i, constraintAnchorArr[i8].e(), 5);
                                }
                            }
                        }
                        if (z13) {
                            ConstraintAnchor constraintAnchor33 = constraintAnchor15.f;
                            if (constraintAnchor33.d == dVar2) {
                                cVar3.e(constraintAnchor15.i, constraintAnchor33.i, -constraintAnchor15.e(), 4);
                            }
                        }
                        cVar3.g(constraintAnchor15.i, constraintWidget16.S[i32].f.i, -constraintAnchor15.e(), 6);
                        if (z4) {
                        }
                        arrayList2 = cVar4.h;
                        if (arrayList2 != null) {
                            if (cVar4.n) {
                                f2 = cVar4.j;
                            }
                            ConstraintWidget constraintWidget202 = null;
                            float f82 = f;
                            i9 = 0;
                            while (i9 < size) {
                            }
                        }
                        if (constraintWidget17 == null) {
                        }
                        constraintWidget2 = constraintWidget18;
                        if (!z) {
                        }
                        if (z9) {
                            int i382 = cVar4.j;
                            if (i382 <= 0) {
                            }
                            constraintWidget3 = constraintWidget17;
                            ConstraintWidget constraintWidget252 = constraintWidget3;
                            while (constraintWidget3 != null) {
                            }
                            cVar2 = cVar;
                            ConstraintAnchor constraintAnchor292 = constraintWidget17.S[i3];
                            constraintAnchor = constraintWidget10.S[i3].f;
                            int i412 = i3 + 1;
                            constraintAnchor2 = constraintWidget2.S[i412];
                            constraintAnchor3 = constraintWidget16.S[i412].f;
                            if (constraintAnchor != null) {
                            }
                            if (constraintAnchor3 != null) {
                                cVar2.e(constraintAnchor2.i, constraintAnchor3.i, -constraintAnchor2.e(), 5);
                            }
                            if (!z) {
                            }
                            ConstraintAnchor[] constraintAnchorArr1122 = constraintWidget17.S;
                            constraintAnchor6 = constraintAnchorArr1122[i3];
                            if (constraintWidget2 == null) {
                            }
                            constraintAnchorArr = constraintWidget2.S;
                            i8 = i3 + 1;
                            constraintAnchor7 = constraintAnchorArr[i8];
                            ConstraintAnchor constraintAnchor3022 = constraintAnchor6.f;
                            if (constraintAnchor3022 != null) {
                            }
                            ConstraintAnchor constraintAnchor3122 = constraintAnchor7.f;
                            if (constraintAnchor3122 != null) {
                            }
                            if (constraintWidget16 != constraintWidget2) {
                            }
                            if (constraintWidget17 == constraintWidget2) {
                            }
                            if (solverVariable4 == null) {
                            }
                        }
                        cVar2 = cVar;
                        if (!z) {
                        }
                        ConstraintAnchor[] constraintAnchorArr11222 = constraintWidget17.S;
                        constraintAnchor6 = constraintAnchorArr11222[i3];
                        if (constraintWidget2 == null) {
                        }
                        constraintAnchorArr = constraintWidget2.S;
                        i8 = i3 + 1;
                        constraintAnchor7 = constraintAnchorArr[i8];
                        ConstraintAnchor constraintAnchor30222 = constraintAnchor6.f;
                        if (constraintAnchor30222 != null) {
                        }
                        ConstraintAnchor constraintAnchor31222 = constraintAnchor7.f;
                        if (constraintAnchor31222 != null) {
                        }
                        if (constraintWidget16 != constraintWidget2) {
                        }
                        if (constraintWidget17 == constraintWidget2) {
                        }
                        if (solverVariable4 == null) {
                        }
                    }
                }
                if (z4) {
                }
                arrayList2 = cVar4.h;
                if (arrayList2 != null) {
                }
                if (constraintWidget17 == null) {
                }
                constraintWidget2 = constraintWidget18;
                if (!z) {
                }
                if (z9) {
                }
                cVar2 = cVar;
                if (!z) {
                }
                ConstraintAnchor[] constraintAnchorArr112222 = constraintWidget17.S;
                constraintAnchor6 = constraintAnchorArr112222[i3];
                if (constraintWidget2 == null) {
                }
                constraintAnchorArr = constraintWidget2.S;
                i8 = i3 + 1;
                constraintAnchor7 = constraintAnchorArr[i8];
                ConstraintAnchor constraintAnchor302222 = constraintAnchor6.f;
                if (constraintAnchor302222 != null) {
                }
                ConstraintAnchor constraintAnchor312222 = constraintAnchor7.f;
                if (constraintAnchor312222 != null) {
                }
                if (constraintWidget16 != constraintWidget2) {
                }
                if (constraintWidget17 == constraintWidget2) {
                }
                if (solverVariable4 == null) {
                }
            } else {
                i5 = i17;
                cVarArr2 = cVarArr4;
            }
            i18 = i4 + 1;
            dVar2 = dVar;
            cVar3 = cVar;
            arrayList4 = arrayList;
            i17 = i5;
            cVarArr4 = cVarArr2;
        }
    }
}
