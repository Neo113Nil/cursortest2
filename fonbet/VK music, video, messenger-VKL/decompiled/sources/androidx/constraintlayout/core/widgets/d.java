package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import xsna.a2v;
import xsna.dzm;
import xsna.era;
import xsna.fpr0;
import xsna.kt6;
import xsna.lzl;
import xsna.omx0;
import xsna.oou;
import xsna.pnx0;
import xsna.wru;
import xsna.yfv;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public final class d extends omx0 {
    public int C0;
    public int D0;
    public int y0;
    public kt6 w0 = new kt6(this);
    public lzl x0 = new lzl(this);
    public kt6.b z0 = null;
    public boolean A0 = false;
    public androidx.constraintlayout.core.c B0 = new androidx.constraintlayout.core.c();
    public int E0 = 0;
    public int F0 = 0;
    public c[] G0 = new c[4];
    public c[] H0 = new c[4];
    public int I0 = 257;
    public boolean J0 = false;
    public boolean K0 = false;
    public WeakReference<ConstraintAnchor> L0 = null;
    public WeakReference<ConstraintAnchor> M0 = null;
    public WeakReference<ConstraintAnchor> N0 = null;
    public WeakReference<ConstraintAnchor> O0 = null;
    public HashSet<ConstraintWidget> P0 = new HashSet<>();
    public kt6.a Q0 = new kt6.a();

    public static void e0(ConstraintWidget constraintWidget, kt6.b bVar, kt6.a aVar) {
        int i;
        int i2;
        if (bVar == null) {
            return;
        }
        int i3 = constraintWidget.j0;
        int[] iArr = constraintWidget.u;
        if (i3 == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        aVar.a = dimensionBehaviourArr[0];
        aVar.b = dimensionBehaviourArr[1];
        aVar.c = constraintWidget.v();
        aVar.d = constraintWidget.p();
        aVar.i = false;
        aVar.j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z && constraintWidget.y(0) && constraintWidget.s == 0 && !z3) {
            aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.t == 0) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.y(1) && constraintWidget.t == 0 && !z4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.s == 0) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.F()) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.G()) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i2 = aVar.d;
                } else {
                    aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.a(constraintWidget, aVar);
                    i2 = aVar.f;
                }
                aVar.a = dimensionBehaviour4;
                aVar.c = (int) (constraintWidget.Z * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i = aVar.c;
                } else {
                    aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.a(constraintWidget, aVar);
                    i = aVar.e;
                }
                aVar.b = dimensionBehaviour6;
                if (constraintWidget.a0 == -1) {
                    aVar.d = (int) (i / constraintWidget.Z);
                } else {
                    aVar.d = (int) (constraintWidget.Z * i);
                }
            }
        }
        bVar.a(constraintWidget, aVar);
        constraintWidget.W(aVar.e);
        constraintWidget.R(aVar.f);
        constraintWidget.F = aVar.h;
        constraintWidget.N(aVar.g);
        aVar.j = 0;
    }

    @Override // xsna.omx0, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void H() {
        this.B0.t();
        this.C0 = 0;
        this.D0 = 0;
        super.H();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void X(boolean z, boolean z2) {
        super.X(z, z2);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            this.v0.get(i).X(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x046a A[LOOP:13: B:288:0x0468->B:289:0x046a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0443  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // xsna.omx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        Object obj;
        int i;
        int i2;
        boolean z;
        char c;
        boolean z2;
        ConstraintAnchor constraintAnchor;
        boolean[] zArr;
        int max;
        int max2;
        ?? r9;
        int i3;
        int i4;
        int max3;
        int max4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i5;
        ConstraintAnchor constraintAnchor2;
        androidx.constraintlayout.core.c cVar = this.B0;
        this.b0 = 0;
        this.c0 = 0;
        this.J0 = false;
        this.K0 = false;
        int size = this.v0.size();
        int max5 = Math.max(0, v());
        int max6 = Math.max(0, p());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
        int i6 = this.y0;
        ConstraintAnchor constraintAnchor3 = this.L;
        ConstraintAnchor constraintAnchor4 = this.K;
        if (i6 == 0 && g.b(this.I0, 1)) {
            kt6.b bVar = this.z0;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[1];
            J();
            ArrayList<ConstraintWidget> arrayList = this.v0;
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList.get(i7).J();
            }
            boolean z3 = this.A0;
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED) {
                P(0, v());
            } else {
                constraintAnchor4.l(0);
                this.b0 = 0;
            }
            boolean z4 = false;
            int i8 = 0;
            boolean z5 = false;
            while (i8 < size2) {
                boolean z6 = z4;
                ConstraintWidget constraintWidget = arrayList.get(i8);
                int i9 = i8;
                if (constraintWidget instanceof f) {
                    f fVar = (f) constraintWidget;
                    constraintAnchor2 = constraintAnchor4;
                    if (fVar.z0 == 1) {
                        int i10 = fVar.w0;
                        if (i10 != -1) {
                            fVar.Z(i10);
                        } else if (fVar.x0 != -1 && F()) {
                            fVar.Z(v() - fVar.x0);
                        } else if (F()) {
                            fVar.Z((int) ((fVar.v0 * v()) + 0.5f));
                        }
                        z6 = true;
                    }
                } else {
                    constraintAnchor2 = constraintAnchor4;
                    if ((constraintWidget instanceof a) && ((a) constraintWidget).b0() == 0) {
                        z4 = z6;
                        z5 = true;
                        i8 = i9 + 1;
                        constraintAnchor4 = constraintAnchor2;
                    }
                }
                z4 = z6;
                i8 = i9 + 1;
                constraintAnchor4 = constraintAnchor2;
            }
            obj = constraintAnchor4;
            if (z4) {
                for (int i11 = 0; i11 < size2; i11 = i5 + 1) {
                    ConstraintWidget constraintWidget2 = arrayList.get(i11);
                    if (constraintWidget2 instanceof f) {
                        f fVar2 = (f) constraintWidget2;
                        i5 = i11;
                        if (fVar2.z0 == 1) {
                            dzm.b(0, fVar2, bVar, z3);
                        }
                    } else {
                        i5 = i11;
                    }
                }
            }
            dzm.b(0, this, bVar, z3);
            if (z5) {
                for (int i12 = 0; i12 < size2; i12++) {
                    ConstraintWidget constraintWidget3 = arrayList.get(i12);
                    if (constraintWidget3 instanceof a) {
                        a aVar = (a) constraintWidget3;
                        if (aVar.b0() == 0 && aVar.a0()) {
                            dzm.b(1, aVar, bVar, z3);
                        }
                    }
                }
            }
            if (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED) {
                Q(0, p());
            } else {
                constraintAnchor3.l(0);
                this.c0 = 0;
            }
            int i13 = 0;
            boolean z7 = false;
            boolean z8 = false;
            while (i13 < size2) {
                ConstraintWidget constraintWidget4 = arrayList.get(i13);
                int i14 = i13;
                if (constraintWidget4 instanceof f) {
                    f fVar3 = (f) constraintWidget4;
                    if (fVar3.z0 == 0) {
                        int i15 = fVar3.w0;
                        if (i15 != -1) {
                            fVar3.Z(i15);
                        } else if (fVar3.x0 != -1 && G()) {
                            fVar3.Z(p() - fVar3.x0);
                        } else if (G()) {
                            fVar3.Z((int) ((fVar3.v0 * p()) + 0.5f));
                        }
                        z7 = true;
                    }
                } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).b0() == 1) {
                    z8 = true;
                }
                i13 = i14 + 1;
            }
            if (z7) {
                for (int i16 = 0; i16 < size2; i16++) {
                    ConstraintWidget constraintWidget5 = arrayList.get(i16);
                    if (constraintWidget5 instanceof f) {
                        f fVar4 = (f) constraintWidget5;
                        if (fVar4.z0 == 0) {
                            dzm.g(1, fVar4, bVar);
                        }
                    }
                }
            }
            dzm.g(0, this, bVar);
            if (z8) {
                for (int i17 = 0; i17 < size2; i17++) {
                    ConstraintWidget constraintWidget6 = arrayList.get(i17);
                    if (constraintWidget6 instanceof a) {
                        a aVar2 = (a) constraintWidget6;
                        if (aVar2.b0() == 1 && aVar2.a0()) {
                            dzm.g(1, aVar2, bVar);
                        }
                    }
                }
            }
            for (int i18 = 0; i18 < size2; i18++) {
                ConstraintWidget constraintWidget7 = arrayList.get(i18);
                if (constraintWidget7.E() && dzm.a(constraintWidget7)) {
                    e0(constraintWidget7, bVar, dzm.a);
                    if (!(constraintWidget7 instanceof f)) {
                        dzm.b(0, constraintWidget7, bVar, z3);
                        dzm.g(0, constraintWidget7, bVar);
                    } else if (((f) constraintWidget7).z0 == 0) {
                        dzm.g(0, constraintWidget7, bVar);
                    } else {
                        dzm.b(0, constraintWidget7, bVar, z3);
                    }
                }
            }
            for (int i19 = 0; i19 < size; i19++) {
                ConstraintWidget constraintWidget8 = this.v0.get(i19);
                if (constraintWidget8.E() && !(constraintWidget8 instanceof f) && !(constraintWidget8 instanceof a) && !(constraintWidget8 instanceof i) && !constraintWidget8.H) {
                    ConstraintWidget.DimensionBehaviour o = constraintWidget8.o(0);
                    ConstraintWidget.DimensionBehaviour o2 = constraintWidget8.o(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (o != dimensionBehaviour7 || constraintWidget8.s == 1 || o2 != dimensionBehaviour7 || constraintWidget8.t == 1) {
                        e0(constraintWidget8, this.z0, new kt6.a());
                    }
                }
            }
        } else {
            obj = constraintAnchor4;
        }
        if (size <= 2 || !((dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour2) && g.b(this.I0, 1024) && oou.b(this, this.z0))) {
            i = max6;
            i2 = max5;
            z = false;
        } else {
            if (dimensionBehaviour4 == dimensionBehaviour2) {
                if (max5 >= v() || max5 <= 0) {
                    max5 = v();
                } else {
                    W(max5);
                    this.J0 = true;
                }
            }
            if (dimensionBehaviour3 == dimensionBehaviour2) {
                if (max6 >= p() || max6 <= 0) {
                    max6 = p();
                } else {
                    R(max6);
                    this.K0 = true;
                }
            }
            i = max6;
            i2 = max5;
            z = true;
        }
        boolean z9 = f0(64) || f0(128);
        cVar.getClass();
        cVar.h = false;
        if (this.I0 == 0 || !z9) {
            c = 1;
        } else {
            c = 1;
            cVar.h = true;
        }
        ArrayList<ConstraintWidget> arrayList2 = this.v0;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr3[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z10 = dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviourArr3[c] == dimensionBehaviour9;
        this.E0 = 0;
        this.F0 = 0;
        for (int i20 = 0; i20 < size; i20++) {
            ConstraintWidget constraintWidget9 = this.v0.get(i20);
            if (constraintWidget9 instanceof omx0) {
                ((omx0) constraintWidget9).Z();
            }
        }
        boolean f0 = f0(64);
        boolean z11 = z;
        int i21 = 0;
        boolean z12 = true;
        while (z12) {
            int i22 = i21 + 1;
            try {
                cVar.t();
                this.E0 = 0;
                this.F0 = 0;
                l(cVar);
                for (int i23 = 0; i23 < size; i23++) {
                    this.v0.get(i23).l(cVar);
                }
                b0(cVar);
                try {
                    WeakReference<ConstraintAnchor> weakReference = this.L0;
                    if (weakReference == null || weakReference.get() == null) {
                        z2 = z10;
                        constraintAnchor = constraintAnchor3;
                    } else {
                        ConstraintAnchor constraintAnchor5 = this.L0.get();
                        SolverVariable k = cVar.k(constraintAnchor3);
                        androidx.constraintlayout.core.c cVar2 = this.B0;
                        z2 = z10;
                        constraintAnchor = constraintAnchor3;
                        try {
                            cVar2.f(cVar2.k(constraintAnchor5), k, 0, 5);
                            this.L0 = null;
                        } catch (Exception e) {
                            e = e;
                            z12 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            boolean[] zArr2 = g.a;
                            if (z12) {
                            }
                            if (z2) {
                                int i24 = 0;
                                int i25 = 0;
                                while (i4 < size) {
                                }
                                max3 = Math.max(this.e0, i25);
                                max4 = Math.max(this.f0, i24);
                                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour4 == dimensionBehaviour) {
                                    W(max3);
                                    this.V[0] = dimensionBehaviour;
                                    z11 = true;
                                    z12 = true;
                                }
                                if (dimensionBehaviour3 == dimensionBehaviour) {
                                    R(max4);
                                    this.V[1] = dimensionBehaviour;
                                    z11 = true;
                                    z12 = true;
                                }
                            }
                            max = Math.max(this.e0, v());
                            if (max > v()) {
                            }
                            max2 = Math.max(this.f0, p());
                            if (max2 > p()) {
                            }
                            if (!z11) {
                            }
                            i3 = 8;
                            if (i22 <= i3) {
                            }
                            i21 = i22;
                            z10 = z2;
                            constraintAnchor3 = constraintAnchor;
                        }
                    }
                    WeakReference<ConstraintAnchor> weakReference2 = this.N0;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ConstraintAnchor constraintAnchor6 = this.N0.get();
                        SolverVariable k2 = cVar.k(this.N);
                        androidx.constraintlayout.core.c cVar3 = this.B0;
                        cVar3.f(k2, cVar3.k(constraintAnchor6), 0, 5);
                        this.N0 = null;
                    }
                    WeakReference<ConstraintAnchor> weakReference3 = this.M0;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        ConstraintAnchor constraintAnchor7 = this.M0.get();
                        Object obj2 = obj;
                        try {
                            SolverVariable k3 = cVar.k(obj2);
                            androidx.constraintlayout.core.c cVar4 = this.B0;
                            obj = obj2;
                            cVar4.f(cVar4.k(constraintAnchor7), k3, 0, 5);
                            this.M0 = null;
                        } catch (Exception e2) {
                            e = e2;
                            obj = obj2;
                            z12 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            boolean[] zArr22 = g.a;
                            if (z12) {
                            }
                            if (z2) {
                            }
                            max = Math.max(this.e0, v());
                            if (max > v()) {
                            }
                            max2 = Math.max(this.f0, p());
                            if (max2 > p()) {
                            }
                            if (!z11) {
                            }
                            i3 = 8;
                            if (i22 <= i3) {
                            }
                            i21 = i22;
                            z10 = z2;
                            constraintAnchor3 = constraintAnchor;
                        }
                    }
                    WeakReference<ConstraintAnchor> weakReference4 = this.O0;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        ConstraintAnchor constraintAnchor8 = this.O0.get();
                        SolverVariable k4 = cVar.k(this.M);
                        androidx.constraintlayout.core.c cVar5 = this.B0;
                        cVar5.f(k4, cVar5.k(constraintAnchor8), 0, 5);
                        this.O0 = null;
                    }
                    cVar.p();
                    z12 = true;
                } catch (Exception e3) {
                    e = e3;
                    z2 = z10;
                    constraintAnchor = constraintAnchor3;
                }
            } catch (Exception e4) {
                e = e4;
                z2 = z10;
                constraintAnchor = constraintAnchor3;
            }
            boolean[] zArr222 = g.a;
            if (z12) {
                zArr222[2] = false;
                boolean f02 = f0(64);
                Y(cVar, f02);
                int size3 = this.v0.size();
                int i26 = 0;
                z12 = false;
                while (i26 < size3) {
                    boolean[] zArr3 = zArr222;
                    ConstraintWidget constraintWidget10 = this.v0.get(i26);
                    constraintWidget10.Y(cVar, f02);
                    int i27 = i26;
                    boolean z13 = f02;
                    if (constraintWidget10.h != -1 || constraintWidget10.i != -1) {
                        z12 = true;
                    }
                    i26 = i27 + 1;
                    zArr222 = zArr3;
                    f02 = z13;
                }
                zArr = zArr222;
            } else {
                zArr = zArr222;
                Y(cVar, f0);
                for (int i28 = 0; i28 < size; i28++) {
                    this.v0.get(i28).Y(cVar, f0);
                }
                z12 = false;
            }
            if (z2 && i22 < 8 && zArr[2]) {
                int i242 = 0;
                int i252 = 0;
                for (i4 = 0; i4 < size; i4++) {
                    ConstraintWidget constraintWidget11 = this.v0.get(i4);
                    i252 = Math.max(i252, constraintWidget11.v() + constraintWidget11.b0);
                    i242 = Math.max(i242, constraintWidget11.p() + constraintWidget11.c0);
                }
                max3 = Math.max(this.e0, i252);
                max4 = Math.max(this.f0, i242);
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour4 == dimensionBehaviour && v() < max3) {
                    W(max3);
                    this.V[0] = dimensionBehaviour;
                    z11 = true;
                    z12 = true;
                }
                if (dimensionBehaviour3 == dimensionBehaviour && p() < max4) {
                    R(max4);
                    this.V[1] = dimensionBehaviour;
                    z11 = true;
                    z12 = true;
                }
            }
            max = Math.max(this.e0, v());
            if (max > v()) {
                W(max);
                this.V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z11 = true;
                z12 = true;
            }
            max2 = Math.max(this.f0, p());
            if (max2 > p()) {
                R(max2);
                r9 = 1;
                this.V[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                z11 = true;
                z12 = true;
            } else {
                r9 = 1;
            }
            if (!z11) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = this.V[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour10 == dimensionBehaviour11 && i2 > 0 && v() > i2) {
                    this.J0 = r9;
                    this.V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    W(i2);
                    z11 = r9;
                    z12 = z11;
                }
                if (this.V[r9] == dimensionBehaviour11 && i > 0 && p() > i) {
                    this.K0 = r9;
                    this.V[r9] = ConstraintWidget.DimensionBehaviour.FIXED;
                    R(i);
                    i3 = 8;
                    z11 = true;
                    z12 = true;
                    if (i22 <= i3) {
                        z12 = false;
                    }
                    i21 = i22;
                    z10 = z2;
                    constraintAnchor3 = constraintAnchor;
                }
            }
            i3 = 8;
            if (i22 <= i3) {
            }
            i21 = i22;
            z10 = z2;
            constraintAnchor3 = constraintAnchor;
        }
        this.v0 = arrayList2;
        if (z11) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = this.V;
            dimensionBehaviourArr4[0] = dimensionBehaviour4;
            dimensionBehaviourArr4[1] = dimensionBehaviour3;
        }
        K(cVar.m);
    }

    public final void a0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.E0 + 1;
            c[] cVarArr = this.H0;
            if (i2 >= cVarArr.length) {
                this.H0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.H0;
            int i3 = this.E0;
            cVarArr2[i3] = new c(constraintWidget, 0, this.A0);
            this.E0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.F0 + 1;
            c[] cVarArr3 = this.G0;
            if (i4 >= cVarArr3.length) {
                this.G0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.G0;
            int i5 = this.F0;
            cVarArr4[i5] = new c(constraintWidget, 1, this.A0);
            this.F0 = i5 + 1;
        }
    }

    public final void b0(androidx.constraintlayout.core.c cVar) {
        d dVar;
        androidx.constraintlayout.core.c cVar2;
        HashSet<ConstraintWidget> hashSet = this.P0;
        boolean f0 = f0(64);
        f(cVar, f0);
        int size = this.v0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.v0.get(i);
            boolean[] zArr = constraintWidget.U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.v0.get(i2);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i3 = 0; i3 < aVar.w0; i3++) {
                        ConstraintWidget constraintWidget3 = aVar.v0[i3];
                        if (aVar.y0 || constraintWidget3.g()) {
                            int i4 = aVar.x0;
                            if (i4 == 0 || i4 == 1) {
                                constraintWidget3.U[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                constraintWidget3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = this.v0.get(i5);
            constraintWidget4.getClass();
            boolean z2 = constraintWidget4 instanceof i;
            if (z2 || (constraintWidget4 instanceof f)) {
                if (z2) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.f(cVar, f0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) it.next();
                for (int i6 = 0; i6 < iVar.w0; i6++) {
                    if (hashSet.contains(iVar.v0[i6])) {
                        iVar.f(cVar, f0);
                        hashSet.remove(iVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().f(cVar, f0);
                }
                hashSet.clear();
            }
        }
        if (androidx.constraintlayout.core.c.q) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget5 = this.v0.get(i7);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof i) && !(constraintWidget5 instanceof f)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            dVar = this;
            cVar2 = cVar;
            dVar.e(this, cVar2, hashSet2, this.V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                g.a(this, cVar2, next);
                next.f(cVar2, f0);
            }
        } else {
            dVar = this;
            cVar2 = cVar;
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget6 = dVar.v0.get(i8);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.S(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.U(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.f(cVar2, f0);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.S(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.U(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, cVar2, constraintWidget6);
                    if (!(constraintWidget6 instanceof i) && !(constraintWidget6 instanceof f)) {
                        constraintWidget6.f(cVar2, f0);
                    }
                }
            }
        }
        if (dVar.E0 > 0) {
            b.a(this, cVar2, null, 0);
        }
        if (dVar.F0 > 0) {
            b.a(this, cVar2, null, 1);
        }
    }

    public final boolean c0(int i, boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        lzl lzlVar = this.x0;
        ArrayList<pnx0> arrayList = lzlVar.e;
        d dVar = lzlVar.a;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour o = dVar.o(0);
        ConstraintWidget.DimensionBehaviour o2 = dVar.o(1);
        int w = dVar.w();
        int x = dVar.x();
        if (z && (o == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || o2 == dimensionBehaviour)) {
            Iterator<pnx0> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pnx0 next = it.next();
                if (next.f == i && !next.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && o == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    dVar.S(ConstraintWidget.DimensionBehaviour.FIXED);
                    dVar.W(lzlVar.d(dVar, 0));
                    dVar.d.e.d(dVar.v());
                }
            } else if (z && o2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                dVar.U(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.R(lzlVar.d(dVar, 1));
                dVar.e.e.d(dVar.p());
            }
        }
        if (i == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar.V[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int v = dVar.v() + w;
                dVar.d.i.d(v);
                dVar.d.e.d(v - w);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar.V[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int p = dVar.p() + x;
                dVar.e.i.d(p);
                dVar.e.e.d(p - x);
                z2 = true;
            }
            z2 = false;
        }
        lzlVar.g();
        Iterator<pnx0> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            pnx0 next2 = it2.next();
            if (next2.f == i && (next2.b != dVar || next2.g)) {
                next2.e();
            }
        }
        Iterator<pnx0> it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            pnx0 next3 = it3.next();
            if (next3.f == i && (z2 || next3.b != dVar)) {
                if (!next3.h.j) {
                    break;
                }
                if (!next3.i.j) {
                    break;
                }
                if (!(next3 instanceof era) && !next3.e.j) {
                    break;
                }
            }
        }
        dVar.S(o);
        dVar.U(o2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        kt6.b bVar;
        int i13;
        boolean z;
        int i14;
        int i15;
        ArrayList<ConstraintWidget> arrayList;
        int i16;
        kt6.b bVar2;
        int i17;
        int i18;
        kt6.b bVar3;
        boolean z2;
        int i19;
        yfv yfvVar;
        fpr0 fpr0Var;
        boolean z3;
        int i20;
        int i21;
        int i22;
        boolean z4;
        boolean z5;
        boolean z6;
        this.C0 = i6;
        this.D0 = i7;
        kt6 kt6Var = this.w0;
        d dVar = kt6Var.c;
        ArrayList<ConstraintWidget> arrayList2 = kt6Var.a;
        kt6.b bVar4 = this.z0;
        lzl lzlVar = this.x0;
        int size = this.v0.size();
        int v = v();
        int p = p();
        boolean b = g.b(i, 128);
        int i23 = (b || g.b(i, 64)) ? 1 : 0;
        if (i23 != 0) {
            int i24 = 0;
            while (i24 < size) {
                i9 = 0;
                ConstraintWidget constraintWidget = this.v0.get(i24);
                i10 = 1;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                int i25 = i23;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                i8 = size;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z7 = (dimensionBehaviour == dimensionBehaviour2) && (dimensionBehaviourArr[1] == dimensionBehaviour2) && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if ((constraintWidget.C() && z7) || ((constraintWidget.D() && z7) || (constraintWidget instanceof i) || constraintWidget.C() || constraintWidget.D())) {
                    i11 = 0;
                    break;
                } else {
                    i24++;
                    i23 = i25;
                    size = i8;
                }
            }
        }
        i8 = size;
        i9 = 0;
        i10 = 1;
        i11 = i23;
        int i26 = i11 & (((i2 == 1073741824 && i4 == 1073741824) || b) ? i10 : i9);
        if (i26 != 0) {
            int min = Math.min(this.D[i9], i3);
            int min2 = Math.min(this.D[i10], i5);
            if (i2 != 1073741824 || v() == min) {
                z3 = i10;
            } else {
                W(min);
                boolean z8 = i10;
                this.x0.b = z8;
                z3 = z8;
            }
            if (i4 == 1073741824 && p() != min2) {
                R(min2);
                this.x0.b = z3;
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                ArrayList<pnx0> arrayList3 = lzlVar.e;
                d dVar2 = lzlVar.a;
                if (lzlVar.b || lzlVar.c) {
                    Iterator<ConstraintWidget> it = dVar2.v0.iterator();
                    while (it.hasNext()) {
                        ConstraintWidget next = it.next();
                        next.m();
                        next.a = i9;
                        next.d.n();
                        next.e.m();
                        i26 = i26;
                        i9 = 0;
                    }
                    i12 = i26;
                    dVar2.m();
                    i22 = 0;
                    dVar2.a = false;
                    dVar2.d.n();
                    dVar2.e.m();
                    lzlVar.c = false;
                } else {
                    i12 = i26;
                    i22 = i9;
                }
                lzlVar.b(lzlVar.d);
                dVar2.b0 = i22;
                dVar2.c0 = i22;
                ConstraintWidget.DimensionBehaviour o = dVar2.o(i22);
                ConstraintWidget.DimensionBehaviour o2 = dVar2.o(1);
                if (lzlVar.b) {
                    lzlVar.c();
                }
                int w = dVar2.w();
                int x = dVar2.x();
                bVar = bVar4;
                dVar2.d.h.d(w);
                dVar2.e.h.d(x);
                lzlVar.g();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (o == dimensionBehaviour3 || o2 == dimensionBehaviour3) {
                    if (b) {
                        Iterator<pnx0> it2 = arrayList3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!it2.next().k()) {
                                    b = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (b && o == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        dVar2.S(ConstraintWidget.DimensionBehaviour.FIXED);
                        z4 = b;
                        dVar2.W(lzlVar.d(dVar2, 0));
                        dVar2.d.e.d(dVar2.v());
                    } else {
                        z4 = b;
                    }
                    if (z4 && o2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        dVar2.U(ConstraintWidget.DimensionBehaviour.FIXED);
                        dVar2.R(lzlVar.d(dVar2, 1));
                        dVar2.e.e.d(dVar2.p());
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar2.V[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    int v2 = dVar2.v() + w;
                    dVar2.d.i.d(v2);
                    dVar2.d.e.d(v2 - w);
                    lzlVar.g();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dVar2.V[1];
                    if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        int p2 = dVar2.p() + x;
                        dVar2.e.i.d(p2);
                        dVar2.e.e.d(p2 - x);
                    }
                    lzlVar.g();
                    z5 = true;
                } else {
                    z5 = false;
                }
                Iterator<pnx0> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    pnx0 next2 = it3.next();
                    if (next2.b != dVar2 || next2.g) {
                        next2.e();
                    }
                }
                Iterator<pnx0> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    pnx0 next3 = it4.next();
                    if (z5 || next3.b != dVar2) {
                        if (!next3.h.j || ((!next3.i.j && !(next3 instanceof wru)) || (!next3.e.j && !(next3 instanceof era) && !(next3 instanceof wru)))) {
                            z6 = false;
                            break;
                        }
                    }
                }
                z6 = true;
                dVar2.S(o);
                dVar2.U(o2);
                z = z6;
                i21 = 1073741824;
                i13 = 2;
            } else {
                i12 = i26;
                bVar = bVar4;
                d dVar3 = lzlVar.a;
                if (lzlVar.b) {
                    Iterator<ConstraintWidget> it5 = dVar3.v0.iterator();
                    while (it5.hasNext()) {
                        ConstraintWidget next4 = it5.next();
                        next4.m();
                        next4.a = false;
                        yfv yfvVar2 = next4.d;
                        yfvVar2.e.j = false;
                        yfvVar2.g = false;
                        yfvVar2.n();
                        fpr0 fpr0Var2 = next4.e;
                        fpr0Var2.e.j = false;
                        fpr0Var2.g = false;
                        fpr0Var2.m();
                    }
                    i20 = 0;
                    dVar3.m();
                    dVar3.a = false;
                    yfv yfvVar3 = dVar3.d;
                    yfvVar3.e.j = false;
                    yfvVar3.g = false;
                    yfvVar3.n();
                    fpr0 fpr0Var3 = dVar3.e;
                    fpr0Var3.e.j = false;
                    fpr0Var3.g = false;
                    fpr0Var3.m();
                    lzlVar.c();
                } else {
                    i20 = 0;
                }
                lzlVar.b(lzlVar.d);
                dVar3.b0 = i20;
                dVar3.c0 = i20;
                dVar3.d.h.d(i20);
                dVar3.e.h.d(i20);
                i21 = 1073741824;
                if (i2 == 1073741824) {
                    z = c0(i20, b);
                    i13 = 1;
                } else {
                    i13 = 0;
                    z = true;
                }
                if (i4 == 1073741824) {
                    z &= c0(1, b);
                    i13++;
                }
            }
            if (z) {
                X(i2 == i21, i4 == i21);
            }
        } else {
            i12 = i26;
            bVar = bVar4;
            i13 = 0;
            z = false;
        }
        if (z && i13 == 2) {
            return;
        }
        int i27 = this.I0;
        if (i8 > 0) {
            boolean f0 = f0(64);
            kt6.b bVar5 = this.z0;
            int i28 = 0;
            for (int size2 = this.v0.size(); i28 < size2; size2 = i19) {
                ConstraintWidget constraintWidget2 = this.v0.get(i28);
                if ((constraintWidget2 instanceof f) || (constraintWidget2 instanceof a) || constraintWidget2.H || (f0 && (yfvVar = constraintWidget2.d) != null && (fpr0Var = constraintWidget2.e) != null && yfvVar.e.j && fpr0Var.e.j)) {
                    i19 = size2;
                } else {
                    ConstraintWidget.DimensionBehaviour o3 = constraintWidget2.o(0);
                    ConstraintWidget.DimensionBehaviour o4 = constraintWidget2.o(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    i19 = size2;
                    boolean z9 = o3 == dimensionBehaviour7 && constraintWidget2.s != 1 && o4 == dimensionBehaviour7 && constraintWidget2.t != 1;
                    if (!z9 && f0(1) && !(constraintWidget2 instanceof i)) {
                        if (o3 == dimensionBehaviour7 && constraintWidget2.s == 0 && o4 != dimensionBehaviour7 && !constraintWidget2.C()) {
                            z9 = true;
                        }
                        if (o4 == dimensionBehaviour7 && constraintWidget2.t == 0 && o3 != dimensionBehaviour7 && !constraintWidget2.C()) {
                            z9 = true;
                        }
                        if ((o3 == dimensionBehaviour7 || o4 == dimensionBehaviour7) && constraintWidget2.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            z9 = true;
                        }
                    }
                    if (!z9) {
                        kt6Var.a(0, constraintWidget2, bVar5);
                        i28++;
                    }
                }
                i28++;
            }
            i14 = 0;
            bVar5.b();
        } else {
            i14 = 0;
        }
        kt6Var.c(this);
        int size3 = arrayList2.size();
        if (i8 > 0) {
            kt6Var.b(this, i14, v, p);
        }
        if (size3 > 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[i14];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int i29 = dimensionBehaviour8 == dimensionBehaviour9 ? 1 : i14;
            int i30 = dimensionBehaviourArr2[1] == dimensionBehaviour9 ? 1 : i14;
            int max = Math.max(v(), dVar.e0);
            int max2 = Math.max(p(), dVar.f0);
            int i31 = max;
            int i32 = i14;
            boolean z10 = i32;
            while (i32 < size3) {
                ConstraintWidget constraintWidget3 = arrayList2.get(i32);
                if (constraintWidget3 instanceof i) {
                    int v3 = constraintWidget3.v();
                    int p3 = constraintWidget3.p();
                    i17 = i30;
                    i18 = i32;
                    bVar3 = bVar;
                    boolean a = z10 | kt6Var.a(1, constraintWidget3, bVar3);
                    int v4 = constraintWidget3.v();
                    int p4 = constraintWidget3.p();
                    if (v4 != v3) {
                        constraintWidget3.W(v4);
                        if (i29 != 0 && constraintWidget3.w() + constraintWidget3.X > i31) {
                            i31 = Math.max(i31, constraintWidget3.n(ConstraintAnchor.Type.RIGHT).e() + constraintWidget3.w() + constraintWidget3.X);
                        }
                        z2 = true;
                    } else {
                        z2 = a;
                    }
                    if (p4 != p3) {
                        constraintWidget3.R(p4);
                        if (i17 != 0 && constraintWidget3.x() + constraintWidget3.Y > max2) {
                            max2 = Math.max(max2, constraintWidget3.n(ConstraintAnchor.Type.BOTTOM).e() + constraintWidget3.x() + constraintWidget3.Y);
                        }
                        z2 = true;
                    }
                    z10 = ((i) constraintWidget3).D0 | z2;
                } else {
                    i17 = i30;
                    i18 = i32;
                    bVar3 = bVar;
                }
                i32 = i18 + 1;
                bVar = bVar3;
                i30 = i17;
            }
            int i33 = i30;
            int i34 = 0;
            while (true) {
                kt6.b bVar6 = bVar;
                if (i34 >= 2) {
                    break;
                }
                boolean z11 = z10;
                int i35 = 0;
                while (i35 < size3) {
                    ConstraintWidget constraintWidget4 = arrayList2.get(i35);
                    if ((!(constraintWidget4 instanceof a2v) || (constraintWidget4 instanceof i)) && !(constraintWidget4 instanceof f)) {
                        i15 = size3;
                        if (constraintWidget4.j0 != 8 && ((i12 == 0 || !constraintWidget4.d.e.j || !constraintWidget4.e.e.j) && !(constraintWidget4 instanceof i))) {
                            int v5 = constraintWidget4.v();
                            int p5 = constraintWidget4.p();
                            arrayList = arrayList2;
                            int i36 = constraintWidget4.d0;
                            i16 = i35;
                            boolean a2 = kt6Var.a(i34 == 1 ? 2 : 1, constraintWidget4, bVar6) | z11;
                            int v6 = constraintWidget4.v();
                            bVar2 = bVar6;
                            int p6 = constraintWidget4.p();
                            if (v6 != v5) {
                                constraintWidget4.W(v6);
                                if (i29 != 0 && constraintWidget4.w() + constraintWidget4.X > i31) {
                                    i31 = Math.max(i31, constraintWidget4.n(ConstraintAnchor.Type.RIGHT).e() + constraintWidget4.w() + constraintWidget4.X);
                                }
                                a2 = true;
                            }
                            if (p6 != p5) {
                                constraintWidget4.R(p6);
                                if (i33 != 0 && constraintWidget4.x() + constraintWidget4.Y > max2) {
                                    max2 = Math.max(max2, constraintWidget4.n(ConstraintAnchor.Type.BOTTOM).e() + constraintWidget4.x() + constraintWidget4.Y);
                                }
                                a2 = true;
                            }
                            z11 = (!constraintWidget4.F || i36 == constraintWidget4.d0) ? a2 : true;
                            i35 = i16 + 1;
                            size3 = i15;
                            arrayList2 = arrayList;
                            bVar6 = bVar2;
                        }
                    } else {
                        i15 = size3;
                    }
                    bVar2 = bVar6;
                    arrayList = arrayList2;
                    i16 = i35;
                    i35 = i16 + 1;
                    size3 = i15;
                    arrayList2 = arrayList;
                    bVar6 = bVar2;
                }
                int i37 = size3;
                bVar = bVar6;
                ArrayList<ConstraintWidget> arrayList4 = arrayList2;
                if (!z11) {
                    break;
                }
                i34++;
                kt6Var.b(this, i34, v, p);
                size3 = i37;
                arrayList2 = arrayList4;
                z10 = false;
            }
        }
        this.I0 = i27;
        androidx.constraintlayout.core.c.q = f0(512);
    }

    public final boolean f0(int i) {
        return (this.I0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void s(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.v0.iterator();
        while (it.hasNext()) {
            it.next().s(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
