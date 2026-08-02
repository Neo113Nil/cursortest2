package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.fo8;
import xsna.fw3;
import xsna.jv8;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements c.a {
    public final a d;
    public SolverVariable a = null;
    public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final ArrayList<SolverVariable> c = new ArrayList<>();
    public boolean e = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        boolean a(SolverVariable solverVariable);

        void b(SolverVariable solverVariable, float f);

        void c(float f);

        void clear();

        void d();

        float e(int i);

        SolverVariable f(int i);

        float g(SolverVariable solverVariable);

        void h(SolverVariable solverVariable, float f, boolean z);

        float i(SolverVariable solverVariable, boolean z);

        int j();

        float k(b bVar, boolean z);
    }

    public b() {
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i) {
        this.d.b(cVar.j(i), 1.0f);
        this.d.b(cVar.j(i), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.b(solverVariable, 1.0f);
            this.d.b(solverVariable2, -1.0f);
            this.d.b(solverVariable3, -1.0f);
        } else {
            this.d.b(solverVariable, -1.0f);
            this.d.b(solverVariable2, 1.0f);
            this.d.b(solverVariable3, 1.0f);
        }
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.b(solverVariable, 1.0f);
            this.d.b(solverVariable2, -1.0f);
            this.d.b(solverVariable3, 1.0f);
        } else {
            this.d.b(solverVariable, -1.0f);
            this.d.b(solverVariable2, 1.0f);
            this.d.b(solverVariable3, -1.0f);
        }
    }

    public boolean e() {
        return this.a == null && this.b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d.j() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int j = this.d.j();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < j; i++) {
            float e = this.d.e(i);
            if (e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                SolverVariable f2 = this.d.f(i);
                if ((zArr == null || !zArr[f2.c]) && f2 != solverVariable && (((type = f2.j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && e < f)) {
                    f = e;
                    solverVariable2 = f2;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.d.b(solverVariable2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float i = this.d.i(solverVariable, true) * (-1.0f);
        this.a = solverVariable;
        if (i == 1.0f) {
            return;
        }
        this.b /= i;
        this.d.c(i);
    }

    public final void h(c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.g) {
            float g = this.d.g(solverVariable);
            this.b = (solverVariable.f * g) + this.b;
            this.d.i(solverVariable, z);
            if (z) {
                solverVariable.b(this);
            }
            if (this.d.j() == 0) {
                this.e = true;
                cVar.b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z) {
        float k = this.d.k(bVar, z);
        this.b = (bVar.b * k) + this.b;
        if (z) {
            bVar.a.b(this);
        }
        if (this.a == null || this.d.j() != 0) {
            return;
        }
        this.e = true;
        cVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String a2 = fo8.a(this.a == null ? "0" : "" + this.a, " = ");
        if (this.b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            StringBuilder e = fw3.e(a2);
            e.append(this.b);
            a2 = e.toString();
            z = true;
        } else {
            z = false;
        }
        int j = this.d.j();
        for (int i = 0; i < j; i++) {
            SolverVariable f = this.d.f(i);
            if (f != null) {
                float e2 = this.d.e(i);
                if (e2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    String solverVariable = f.toString();
                    if (!z) {
                        if (e2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            a2 = fo8.a(a2, "- ");
                            e2 *= -1.0f;
                        }
                        a2 = e2 == 1.0f ? fo8.a(a2, solverVariable) : a2 + e2 + " " + solverVariable;
                        z = true;
                    } else if (e2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        a2 = fo8.a(a2, " + ");
                        if (e2 == 1.0f) {
                        }
                        z = true;
                    } else {
                        a2 = fo8.a(a2, " - ");
                        e2 *= -1.0f;
                        if (e2 == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? fo8.a(a2, "0.0") : a2;
    }

    public b(jv8 jv8Var) {
        this.d = new androidx.constraintlayout.core.a(this, jv8Var);
    }
}
