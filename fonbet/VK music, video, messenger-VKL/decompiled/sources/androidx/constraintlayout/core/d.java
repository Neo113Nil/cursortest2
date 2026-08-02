package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.fw3;
import xsna.ho8;
import xsna.shy;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class d extends b {
    public SolverVariable[] f;
    public int g;
    public a h;

    /* compiled from: PriorityGoalRow.java */
    public class a {
        public SolverVariable a;

        public a() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    str = shy.c(this.a.i[i], " ", fw3.e(str));
                }
            }
            StringBuilder b = ho8.b(str, "] ");
            b.append(this.a);
            return b.toString();
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public final SolverVariable a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.g; i2++) {
            SolverVariable[] solverVariableArr = this.f;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.c]) {
                a aVar = this.h;
                aVar.a = solverVariable;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = aVar.a.i[i3];
                        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = solverVariable2.i[i3];
                            float f3 = aVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        return this.g == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(c cVar, b bVar, boolean z) {
        SolverVariable solverVariable = bVar.a;
        if (solverVariable == null) {
            return;
        }
        float[] fArr = solverVariable.i;
        b.a aVar = bVar.d;
        int j = aVar.j();
        for (int i = 0; i < j; i++) {
            SolverVariable f = aVar.f(i);
            float e = aVar.e(i);
            a aVar2 = this.h;
            aVar2.a = f;
            if (f.b) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = aVar2.a.i;
                    float f2 = (fArr[i2] * e) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        aVar2.a.i[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    d.this.k(aVar2.a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f4 = f3 * e;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        aVar2.a.i[i3] = f4;
                    } else {
                        aVar2.a.i[i3] = 0.0f;
                    }
                }
                j(f);
            }
            this.b = (bVar.b * e) + this.b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i = this.g + 1;
        SolverVariable[] solverVariableArr = this.f;
        if (i > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f = solverVariableArr2;
        }
        SolverVariable[] solverVariableArr3 = this.f;
        int i2 = this.g;
        solverVariableArr3[i2] = solverVariable;
        int i3 = i2 + 1;
        this.g = i3;
        if (i3 > 1) {
            int i4 = solverVariable.c;
        }
        solverVariable.b = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.g) {
            if (this.f[i] == solverVariable) {
                while (true) {
                    int i2 = this.g;
                    if (i >= i2 - 1) {
                        this.g = i2 - 1;
                        solverVariable.b = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        a aVar = this.h;
        String c = shy.c(this.b, ") : ", new StringBuilder(" goal -> ("));
        for (int i = 0; i < this.g; i++) {
            aVar.a = this.f[i];
            c = c + aVar + " ";
        }
        return c;
    }
}
