package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f28 implements jb5, k41, cja {
    public final Path a;
    public final ska b;
    public final p41 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final x13 g;
    public final x13 h;
    public gkk i;
    public final gmb j;
    public o41 k;
    public float l;

    public f28(gmb gmbVar, p41 p41Var, dbh dbhVar) {
        Path path = new Path();
        this.a = path;
        this.b = new ska(1, 0);
        this.f = new ArrayList();
        this.c = p41Var;
        String str = dbhVar.c;
        r50 r50Var = dbhVar.e;
        r50 r50Var2 = dbhVar.d;
        this.d = str;
        this.e = dbhVar.f;
        this.j = gmbVar;
        if (p41Var.k() != null) {
            z78 g = ((s50) p41Var.k().a).g();
            this.k = g;
            g.a(this);
            p41Var.f(this.k);
        }
        if (r50Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(dbhVar.b);
        o41 g2 = r50Var2.g();
        this.g = (x13) g2;
        g2.a(this);
        p41Var.f(g2);
        o41 g3 = r50Var.g();
        this.h = (x13) g3;
        g3.a(this);
        p41Var.f(g3);
    }

    @Override // defpackage.k41
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            fo3 fo3Var = (fo3) list2.get(i);
            if (fo3Var instanceof yae) {
                this.f.add((yae) fo3Var);
            }
        }
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        pkc.g(ajaVar, i, arrayList, ajaVar2, this);
    }

    @Override // defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        PointF pointF = nmb.a;
        if (obj == 1) {
            this.g.j(wj9Var);
            return;
        }
        if (obj == 4) {
            this.h.j(wj9Var);
            return;
        }
        ColorFilter colorFilter = nmb.I;
        p41 p41Var = this.c;
        if (obj == colorFilter) {
            gkk gkkVar = this.i;
            if (gkkVar != null) {
                p41Var.o(gkkVar);
            }
            if (wj9Var == null) {
                this.i = null;
                return;
            }
            gkk gkkVar2 = new gkk(wj9Var, null);
            this.i = gkkVar2;
            gkkVar2.a(this);
            p41Var.f(this.i);
            return;
        }
        if (obj == nmb.e) {
            o41 o41Var = this.k;
            if (o41Var != null) {
                o41Var.j(wj9Var);
                return;
            }
            gkk gkkVar3 = new gkk(wj9Var, null);
            this.k = gkkVar3;
            gkkVar3.a(this);
            p41Var.f(this.k);
        }
    }

    @Override // defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((yae) arrayList.get(i)).n(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.jb5
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        x13 x13Var = this.g;
        float intValue = ((Integer) this.h.e()).intValue() / 100.0f;
        int c = (pkc.c((int) (i * intValue)) << 24) | (x13Var.l(x13Var.c.i(), x13Var.c()) & 16777215);
        ska skaVar = this.b;
        skaVar.setColor(c);
        gkk gkkVar = this.i;
        if (gkkVar != null) {
            skaVar.setColorFilter((ColorFilter) gkkVar.e());
        }
        o41 o41Var = this.k;
        if (o41Var != null) {
            float floatValue = ((Float) o41Var.e()).floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                skaVar.setMaskFilter(null);
            } else if (floatValue != this.l) {
                p41 p41Var = this.c;
                if (p41Var.A == floatValue) {
                    blurMaskFilter = p41Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    p41Var.B = blurMaskFilter2;
                    p41Var.A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                skaVar.setMaskFilter(blurMaskFilter);
            }
            this.l = floatValue;
        }
        if (uc5Var != null) {
            uc5Var.a((int) (intValue * 255.0f), skaVar);
        } else {
            skaVar.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, skaVar);
                return;
            } else {
                path.addPath(((yae) arrayList.get(i2)).n(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.d;
    }
}
