package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u39 extends ujk {
    public float[] b;
    public b20 h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = r13.i;
    public List f = jmk.a;
    public boolean g = true;
    public final oo j = new oo(this, 22);
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // defpackage.ujk
    public final void a(ha5 ha5Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = xzb.a();
                this.b = fArr;
            } else {
                xzb.d(fArr);
            }
            xzb.g(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = fArr[1];
                float f7 = fArr[5];
                float f8 = (sin * f7) + (cos * f6);
                float f9 = fArr[2];
                float f10 = fArr[6];
                float f11 = (sin * f10) + (cos * f9);
                float f12 = fArr[3];
                float f13 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f8;
                fArr[2] = f11;
                fArr[3] = (sin * f13) + (cos * f12);
                fArr[4] = (f3 * cos) + (f2 * f5);
                fArr[5] = (f7 * cos) + (f6 * f5);
                fArr[6] = (f10 * cos) + (f9 * f5);
                fArr[7] = (cos * f13) + (f5 * f12);
            }
            xzb.e(fArr, this.o, this.p);
            xzb.g(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                b20 b20Var = this.h;
                if (b20Var == null) {
                    b20Var = e20.a();
                    this.h = b20Var;
                }
                wca.J(this.f, b20Var);
            }
            this.g = false;
        }
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            hpo hpoVar = (hpo) L0.a;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                ((sx2) hpoVar.a).t().q(fArr2);
            }
            b20 b20Var2 = this.h;
            if (!this.f.isEmpty() && b20Var2 != null) {
                hpoVar.p(b20Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ujk) arrayList.get(i)).a(ha5Var);
            }
            mz1.v(L0, D);
        } catch (Throwable th) {
            mz1.v(L0, D);
            throw th;
        }
    }

    @Override // defpackage.ujk
    public final Function1 b() {
        return this.i;
    }

    @Override // defpackage.ujk
    public final void d(oo ooVar) {
        this.i = ooVar;
    }

    public final void e(int i, ujk ujkVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, ujkVar);
        } else {
            arrayList.add(ujkVar);
        }
        g(ujkVar);
        ujkVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            km5 km5Var = jmk.a;
            if (r13.h(j2) == r13.h(j) && r13.g(j2) == r13.g(j) && r13.e(j2) == r13.e(j)) {
                return;
            }
            this.d = false;
            this.e = r13.i;
        }
    }

    public final void g(ujk ujkVar) {
        if (!(ujkVar instanceof xae)) {
            if (ujkVar instanceof u39) {
                u39 u39Var = (u39) ujkVar;
                if (u39Var.d && this.d) {
                    f(u39Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = r13.i;
                    return;
                }
            }
            return;
        }
        xae xaeVar = (xae) ujkVar;
        n52 n52Var = xaeVar.b;
        if (this.d && n52Var != null) {
            if (n52Var instanceof pvh) {
                f(((pvh) n52Var).a);
            } else {
                this.d = false;
                this.e = r13.i;
            }
        }
        n52 n52Var2 = xaeVar.g;
        if (this.d && n52Var2 != null) {
            if (n52Var2 instanceof pvh) {
                f(((pvh) n52Var2).a);
            } else {
                this.d = false;
                this.e = r13.i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ujk ujkVar = (ujk) arrayList.get(i);
            sb.append("\t");
            sb.append(ujkVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
