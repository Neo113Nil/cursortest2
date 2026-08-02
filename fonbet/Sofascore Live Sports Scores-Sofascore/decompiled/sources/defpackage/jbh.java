package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jbh extends p41 {
    public final so3 D;
    public final tg3 E;
    public final xc5 F;

    public jbh(gmb gmbVar, mla mlaVar, tg3 tg3Var, plb plbVar) {
        super(gmbVar, mlaVar);
        this.E = tg3Var;
        so3 so3Var = new so3(gmbVar, this, new fbh("__container", mlaVar.a, false), plbVar);
        this.D = so3Var;
        List list = Collections.EMPTY_LIST;
        so3Var.b(list, list);
        p03 p03Var = this.p.x;
        if (p03Var != null) {
            this.F = new xc5(this, this, p03Var);
        }
    }

    @Override // defpackage.p41, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        PointF pointF = nmb.a;
        xc5 xc5Var = this.F;
        if (obj == 5 && xc5Var != null) {
            xc5Var.c.j(wj9Var);
            return;
        }
        if (obj == nmb.E && xc5Var != null) {
            xc5Var.c(wj9Var);
            return;
        }
        if (obj == nmb.F && xc5Var != null) {
            xc5Var.e.j(wj9Var);
            return;
        }
        if (obj == nmb.G && xc5Var != null) {
            xc5Var.f.j(wj9Var);
        } else {
            if (obj != nmb.H || xc5Var == null) {
                return;
            }
            xc5Var.g.j(wj9Var);
        }
    }

    @Override // defpackage.p41, defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.D.e(rectF, this.n, z);
    }

    @Override // defpackage.p41
    public final void j(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        xc5 xc5Var = this.F;
        if (xc5Var != null) {
            uc5Var = xc5Var.b(matrix, i);
        }
        this.D.g(canvas, matrix, i, uc5Var);
    }

    @Override // defpackage.p41
    public final hpo k() {
        hpo hpoVar = this.p.w;
        return hpoVar != null ? hpoVar : this.E.p.w;
    }

    @Override // defpackage.p41
    public final void p(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        this.D.c(ajaVar, i, arrayList, ajaVar2);
    }
}
