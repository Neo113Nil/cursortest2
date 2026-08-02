package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d.a;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.jv8;
import xsna.uvb0;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class c {
    public static boolean q = false;
    public final d d;
    public final jv8 m;
    public b p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public SolverVariable[] n = new SolverVariable[1000];
    public int o = 0;
    public b[] g = new b[32];

    /* compiled from: LinearSystem.java */
    public interface a {
        SolverVariable a(boolean[] zArr);
    }

    public c() {
        s();
        jv8 jv8Var = new jv8();
        jv8Var.a = new uvb0();
        jv8Var.b = new uvb0();
        jv8Var.c = new SolverVariable[32];
        this.m = jv8Var;
        d dVar = new d(jv8Var);
        dVar.f = new SolverVariable[128];
        dVar.g = 0;
        dVar.h = dVar.new a();
        this.d = dVar;
        this.p = new b(jv8Var);
    }

    public static int n(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).i;
        if (solverVariable != null) {
            return (int) (solverVariable.f + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final SolverVariable a(SolverVariable.Type type) {
        uvb0 uvb0Var = this.m.b;
        int i = uvb0Var.b;
        SolverVariable solverVariable = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = uvb0Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            uvb0Var.b = i2;
            solverVariable = r4;
        }
        SolverVariable solverVariable2 = solverVariable;
        if (solverVariable2 == null) {
            solverVariable2 = new SolverVariable(type);
            solverVariable2.j = type;
        } else {
            solverVariable2.c();
            solverVariable2.j = type;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (SolverVariable[]) Arrays.copyOf(this.n, i5);
        }
        SolverVariable[] solverVariableArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        solverVariableArr[i6] = solverVariable2;
        return solverVariable2;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        b l = l();
        if (solverVariable2 == solverVariable3) {
            l.d.b(solverVariable, 1.0f);
            l.d.b(solverVariable4, 1.0f);
            l.d.b(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            l.d.b(solverVariable, 1.0f);
            l.d.b(solverVariable2, -1.0f);
            l.d.b(solverVariable3, -1.0f);
            l.d.b(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                l.b = (-i) + i2;
            }
        } else if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            l.d.b(solverVariable, -1.0f);
            l.d.b(solverVariable2, 1.0f);
            l.b = i;
        } else if (f >= 1.0f) {
            l.d.b(solverVariable4, -1.0f);
            l.d.b(solverVariable3, 1.0f);
            l.b = -i2;
        } else {
            float f2 = 1.0f - f;
            l.d.b(solverVariable, f2 * 1.0f);
            l.d.b(solverVariable2, f2 * (-1.0f));
            l.d.b(solverVariable3, (-1.0f) * f);
            l.d.b(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                l.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            l.b(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        if (r4.m <= 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cb, code lost:
    
        if (r4.m <= 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e0, code lost:
    
        if (r4.m <= 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e3, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        if (r4.m <= 1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z;
        boolean z2;
        SolverVariable solverVariable;
        SolverVariable f;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (bVar.e) {
            z = false;
        } else {
            ArrayList<SolverVariable> arrayList = bVar.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int j = bVar.d.j();
                    for (int i = 0; i < j; i++) {
                        SolverVariable f2 = bVar.d.f(i);
                        if (f2.d != -1 || f2.g) {
                            arrayList.add(f2);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            SolverVariable solverVariable2 = arrayList.get(i2);
                            if (solverVariable2.g) {
                                bVar.h(this, solverVariable2, true);
                            } else {
                                bVar.i(this, this.g[solverVariable2.d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (bVar.a != null && bVar.d.j() == 0) {
                    bVar.e = true;
                    this.b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f3 = bVar.b;
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                bVar.b = f3 * (-1.0f);
                bVar.d.d();
            }
            int j2 = bVar.d.j();
            float f5 = 0.0f;
            float f6 = 0.0f;
            SolverVariable solverVariable3 = null;
            SolverVariable solverVariable4 = null;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (i3 < j2) {
                float e = bVar.d.e(i3);
                SolverVariable f7 = bVar.d.f(i3);
                float f8 = f4;
                if (f7.j == SolverVariable.Type.UNRESTRICTED) {
                    if (solverVariable3 != null) {
                        if (f5 <= e) {
                            if (!z5) {
                                if (f7.m > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    solverVariable3 = f7;
                    f5 = e;
                } else if (solverVariable3 == null && e < f8) {
                    if (solverVariable4 != null) {
                        if (f6 <= e) {
                            if (!z6) {
                                if (f7.m > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    solverVariable4 = f7;
                    f6 = e;
                }
                i3++;
                f4 = f8;
            }
            float f9 = f4;
            if (solverVariable3 == null) {
                solverVariable3 = solverVariable4;
            }
            if (solverVariable3 == null) {
                z2 = true;
            } else {
                bVar.g(solverVariable3);
                z2 = false;
            }
            if (bVar.d.j() == 0) {
                bVar.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                SolverVariable a2 = a(SolverVariable.Type.SLACK);
                int i4 = this.c + 1;
                this.c = i4;
                this.j++;
                a2.c = i4;
                jv8 jv8Var = this.m;
                jv8Var.c[i4] = a2;
                bVar.a = a2;
                int i5 = this.k;
                h(bVar);
                if (this.k == i5 + 1) {
                    b bVar2 = this.p;
                    bVar2.getClass();
                    bVar2.a = null;
                    bVar2.d.clear();
                    for (int i6 = 0; i6 < bVar.d.j(); i6++) {
                        bVar2.d.h(bVar.d.f(i6), bVar.d.e(i6), true);
                    }
                    r(this.p);
                    if (a2.d == -1) {
                        if (bVar.a == a2 && (f = bVar.f(null, a2)) != null) {
                            bVar.g(f);
                        }
                        if (!bVar.e) {
                            bVar.a.e(this, bVar);
                        }
                        jv8Var.a.a(bVar);
                        this.k--;
                    }
                    solverVariable = bVar.a;
                    if (solverVariable != null) {
                        return;
                    }
                    if (solverVariable.j != SolverVariable.Type.UNRESTRICTED && bVar.b < f9) {
                        return;
                    } else {
                        z = z3;
                    }
                }
            }
            z3 = false;
            solverVariable = bVar.a;
            if (solverVariable != null) {
            }
        }
        if (z) {
            return;
        }
        h(bVar);
    }

    public final void d(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.d;
        if (i2 == -1) {
            solverVariable.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                SolverVariable solverVariable2 = this.m.c[i3];
            }
            return;
        }
        if (i2 == -1) {
            b l = l();
            l.a = solverVariable;
            float f = i;
            solverVariable.f = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        b bVar = this.g[i2];
        if (bVar.e) {
            bVar.b = i;
            return;
        }
        if (bVar.d.j() == 0) {
            bVar.e = true;
            bVar.b = i;
            return;
        }
        b l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.b(solverVariable, 1.0f);
        } else {
            l2.b = i;
            l2.d.b(solverVariable, -1.0f);
        }
        c(l2);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.g && solverVariable.d == -1) {
            solverVariable.d(this, solverVariable2.f + i);
            return;
        }
        b l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        if (z) {
            l.d.b(solverVariable, 1.0f);
            l.d.b(solverVariable2, -1.0f);
        } else {
            l.d.b(solverVariable, -1.0f);
            l.d.b(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            l.b(this, i2);
        }
        c(l);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        b l = l();
        SolverVariable m = m();
        m.e = 0;
        l.c(solverVariable, solverVariable2, m, i);
        if (i2 != 8) {
            l.d.b(j(i2), (int) (l.d.g(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        b l = l();
        SolverVariable m = m();
        m.e = 0;
        l.d(solverVariable, solverVariable2, m, i);
        if (i2 != 8) {
            l.d.b(j(i2), (int) (l.d.g(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.e) {
            bVar.a.d(this, bVar.b);
        } else {
            b[] bVarArr = this.g;
            int i2 = this.k;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.a;
            solverVariable.d = i2;
            this.k = i2 + 1;
            solverVariable.e(this, bVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.g[i3];
                if (bVar2 != null && bVar2.e) {
                    bVar2.a.d(this, bVar2.b);
                    this.m.a.a(bVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.g;
                        int i6 = i4 - 1;
                        b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.a;
                        if (solverVariable2.d == i4) {
                            solverVariable2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            b bVar = this.g[i];
            bVar.a.f = bVar.b;
        }
    }

    public final SolverVariable j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        SolverVariable a2 = a(SolverVariable.Type.ERROR);
        float[] fArr = a2.i;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a2.c = i2;
        a2.e = i;
        this.m.c[i2] = a2;
        d dVar = this.d;
        dVar.h.a = a2;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[a2.e] = 1.0f;
        dVar.j(a2);
        return a2;
    }

    public final SolverVariable k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof ConstraintAnchor)) {
            return null;
        }
        ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
        SolverVariable solverVariable = constraintAnchor.i;
        if (solverVariable == null) {
            constraintAnchor.k();
            solverVariable = constraintAnchor.i;
        }
        int i = solverVariable.c;
        jv8 jv8Var = this.m;
        if (i != -1 && i <= this.c && jv8Var.c[i] != null) {
            return solverVariable;
        }
        if (i != -1) {
            solverVariable.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        solverVariable.c = i2;
        solverVariable.j = SolverVariable.Type.UNRESTRICTED;
        jv8Var.c[i2] = solverVariable;
        return solverVariable;
    }

    public final b l() {
        Object obj;
        jv8 jv8Var = this.m;
        uvb0 uvb0Var = jv8Var.a;
        int i = uvb0Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = uvb0Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            uvb0Var.b = i2;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(jv8Var);
        }
        bVar.a = null;
        bVar.d.clear();
        bVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.e = false;
        return bVar;
    }

    public final SolverVariable m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a2.c = i;
        this.m.c[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (b[]) Arrays.copyOf(this.g, i);
        jv8 jv8Var = this.m;
        jv8Var.c = (SolverVariable[]) Arrays.copyOf(jv8Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() throws Exception {
        d dVar = this.d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) throws Exception {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            b bVar = this.g[i];
            if (bVar.a.j != SolverVariable.Type.UNRESTRICTED) {
                float f = bVar.b;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.k) {
                            b bVar2 = this.g[i5];
                            if (bVar2.a.j != SolverVariable.Type.UNRESTRICTED && !bVar2.e && bVar2.b < f2) {
                                int j = bVar2.d.j();
                                int i7 = 0;
                                while (i7 < j) {
                                    SolverVariable f4 = bVar2.d.f(i7);
                                    float g = bVar2.d.g(f4);
                                    if (g > f2) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f5 = f4.h[i8] / g;
                                            if ((f5 < f3 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = f4.c;
                                                i3 = i5;
                                                f3 = f5;
                                            }
                                        }
                                    }
                                    i7++;
                                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                            }
                            i5++;
                            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        if (i3 != -1) {
                            b bVar3 = this.g[i3];
                            bVar3.a.d = -1;
                            bVar3.g(this.m.c[i4]);
                            SolverVariable solverVariable = bVar3.a;
                            solverVariable.d = i3;
                            solverVariable.e(this, bVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                }
            }
            i++;
        }
        r(dVar);
        i();
    }

    public final void r(a aVar) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.j * 2) {
                return;
            }
            SolverVariable solverVariable = ((b) aVar).a;
            if (solverVariable != null) {
                this.i[solverVariable.c] = true;
            }
            SolverVariable a2 = aVar.a(this.i);
            if (a2 != null) {
                boolean[] zArr = this.i;
                int i3 = a2.c;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (a2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    b bVar = this.g[i5];
                    if (bVar.a.j != SolverVariable.Type.UNRESTRICTED && !bVar.e && bVar.d.a(a2)) {
                        float g = bVar.d.g(a2);
                        if (g < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f2 = (-bVar.b) / g;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar2 = this.g[i4];
                    bVar2.a.d = -1;
                    bVar2.g(a2);
                    SolverVariable solverVariable2 = bVar2.a;
                    solverVariable2.d = i4;
                    solverVariable2.e(this, bVar2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            b bVar = this.g[i];
            if (bVar != null) {
                this.m.a.a(bVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        jv8 jv8Var;
        int i = 0;
        while (true) {
            jv8Var = this.m;
            SolverVariable[] solverVariableArr = jv8Var.c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i++;
        }
        uvb0 uvb0Var = jv8Var.b;
        SolverVariable[] solverVariableArr2 = this.n;
        int i2 = this.o;
        uvb0Var.getClass();
        if (i2 > solverVariableArr2.length) {
            i2 = solverVariableArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable solverVariable2 = solverVariableArr2[i3];
            int i4 = uvb0Var.b;
            Object[] objArr = uvb0Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = solverVariable2;
                uvb0Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill(jv8Var.c, (Object) null);
        this.c = 0;
        d dVar = this.d;
        dVar.g = 0;
        dVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            b bVar = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new b(jv8Var);
    }
}
