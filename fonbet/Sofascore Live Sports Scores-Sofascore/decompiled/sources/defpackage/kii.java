package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kii extends a71 {
    public final p41 q;
    public final String r;
    public final boolean s;
    public final x13 t;
    public gkk u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kii(gmb gmbVar, p41 p41Var, vbh vbhVar) {
        super(gmbVar, p41Var, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, vbhVar.i, vbhVar.e, vbhVar.f, vbhVar.c, vbhVar.b);
        int C = wt3.C(vbhVar.g);
        Paint.Cap cap = C != 0 ? C != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int C2 = wt3.C(vbhVar.h);
        this.q = p41Var;
        this.r = vbhVar.a;
        this.s = vbhVar.j;
        o41 g = vbhVar.d.g();
        this.t = (x13) g;
        g.a(this);
        p41Var.f(g);
    }

    @Override // defpackage.a71, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        PointF pointF = nmb.a;
        x13 x13Var = this.t;
        if (obj == 2) {
            x13Var.j(wj9Var);
            return;
        }
        if (obj == nmb.I) {
            gkk gkkVar = this.u;
            p41 p41Var = this.q;
            if (gkkVar != null) {
                p41Var.o(gkkVar);
            }
            if (wj9Var == null) {
                this.u = null;
                return;
            }
            gkk gkkVar2 = new gkk(wj9Var, null);
            this.u = gkkVar2;
            gkkVar2.a(this);
            p41Var.f(x13Var);
        }
    }

    @Override // defpackage.a71, defpackage.jb5
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        if (this.s) {
            return;
        }
        x13 x13Var = this.t;
        int l = x13Var.l(x13Var.c.i(), x13Var.c());
        ska skaVar = this.i;
        skaVar.setColor(l);
        gkk gkkVar = this.u;
        if (gkkVar != null) {
            skaVar.setColorFilter((ColorFilter) gkkVar.e());
        }
        super.g(canvas, matrix, i, uc5Var);
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.r;
    }
}
