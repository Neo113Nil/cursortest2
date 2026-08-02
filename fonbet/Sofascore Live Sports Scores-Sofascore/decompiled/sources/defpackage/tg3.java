package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tg3 extends p41 {
    public o41 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final cnd I;
    public final yz1 J;
    public float K;
    public boolean L;
    public final xc5 M;

    public tg3(gmb gmbVar, mla mlaVar, List list, plb plbVar) {
        super(gmbVar, mlaVar);
        p41 p41Var;
        p41 tg3Var;
        String str;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new cnd();
        this.J = new yz1(8);
        this.L = true;
        s50 s50Var = mlaVar.s;
        if (s50Var != null) {
            z78 g = s50Var.g();
            this.D = g;
            f(g);
            this.D.a(this);
        } else {
            this.D = null;
        }
        nkb nkbVar = new nkb(plbVar.j.size());
        int size = list.size() - 1;
        p41 p41Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < nkbVar.i(); i++) {
                    p41 p41Var3 = (p41) nkbVar.c(nkbVar.f(i));
                    if (p41Var3 != null && (p41Var = (p41) nkbVar.c(p41Var3.p.f)) != null) {
                        p41Var3.t = p41Var;
                    }
                }
                p03 p03Var = this.p.x;
                if (p03Var != null) {
                    this.M = new xc5(this, this, p03Var);
                    return;
                }
                return;
            }
            mla mlaVar2 = (mla) list.get(size);
            int C = wt3.C(mlaVar2.e);
            if (C == 0) {
                tg3Var = new tg3(gmbVar, mlaVar2, (List) plbVar.c.get(mlaVar2.g), plbVar);
            } else if (C == 1) {
                tg3Var = new qvh(gmbVar, mlaVar2);
            } else if (C == 2) {
                tg3Var = new ts9(gmbVar, mlaVar2);
            } else if (C == 3) {
                tg3Var = new mid(gmbVar, mlaVar2);
            } else if (C == 4) {
                tg3Var = new jbh(gmbVar, mlaVar2, this, plbVar);
            } else if (C != 5) {
                switch (mlaVar2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                ajb.b("Unknown layer type ".concat(str));
                tg3Var = null;
            } else {
                tg3Var = new xdj(gmbVar, mlaVar2);
            }
            if (tg3Var != null) {
                nkbVar.g(tg3Var, tg3Var.p.d);
                if (p41Var2 != null) {
                    p41Var2.s = tg3Var;
                    p41Var2 = null;
                } else {
                    this.E.add(0, tg3Var);
                    int C2 = wt3.C(mlaVar2.u);
                    if (C2 == 1 || C2 == 2) {
                        p41Var2 = tg3Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.p41, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        if (obj == nmb.C) {
            if (wj9Var == null) {
                o41 o41Var = this.D;
                if (o41Var != null) {
                    o41Var.j(null);
                    return;
                }
                return;
            }
            gkk gkkVar = new gkk(wj9Var, null);
            this.D = gkkVar;
            gkkVar.a(this);
            f(this.D);
            return;
        }
        xc5 xc5Var = this.M;
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
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((p41) arrayList.get(size)).e(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.p41
    public final void j(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        Canvas canvas2;
        boolean z = false;
        xc5 xc5Var = this.M;
        boolean z2 = (uc5Var == null && xc5Var == null) ? false : true;
        gmb gmbVar = this.o;
        boolean z3 = gmbVar.s;
        ArrayList arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && gmbVar.t)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (xc5Var != null) {
            uc5Var = xc5Var.b(matrix, i2);
        }
        boolean z4 = this.L;
        mla mlaVar = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(mlaVar.c)) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mlaVar.o, mlaVar.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p41 p41Var = (p41) it.next();
                RectF rectF2 = this.H;
                p41Var.e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        cnd cndVar = this.I;
        if (z) {
            yz1 yz1Var = this.J;
            yz1Var.c = null;
            yz1Var.b = i;
            if (uc5Var != null) {
                if (Color.alpha(uc5Var.d) > 0) {
                    yz1Var.c = uc5Var;
                } else {
                    yz1Var.c = null;
                }
                uc5Var = null;
            }
            canvas2 = cndVar.e(canvas, rectF, yz1Var);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p41) arrayList.get(size)).g(canvas2, matrix, i2, uc5Var);
            }
        }
        if (z) {
            cndVar.c();
        }
        canvas.restore();
    }

    @Override // defpackage.p41
    public final void p(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((p41) arrayList2.get(i2)).c(ajaVar, i, arrayList, ajaVar2);
            i2++;
        }
    }

    @Override // defpackage.p41
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((p41) it.next()).q(z);
        }
    }

    @Override // defpackage.p41
    public final void r(float f) {
        this.K = f;
        super.r(f);
        o41 o41Var = this.D;
        mla mlaVar = this.p;
        if (o41Var != null) {
            plb plbVar = this.o.a;
            f = ((((Float) o41Var.e()).floatValue() * mlaVar.b.n) - mlaVar.b.l) / ((plbVar.m - plbVar.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = mlaVar.n;
            plb plbVar2 = mlaVar.b;
            f -= f2 / (plbVar2.m - plbVar2.l);
        }
        if (mlaVar.m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !"__container".equals(mlaVar.c)) {
            f /= mlaVar.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((p41) arrayList.get(size)).r(f);
        }
    }
}
