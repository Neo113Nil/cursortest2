package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rqf implements k41, cja, yae {
    public final String c;
    public final boolean d;
    public final gmb e;
    public final o41 f;
    public final o41 g;
    public final z78 h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final xl1 i = new xl1(1);
    public o41 j = null;

    public rqf(gmb gmbVar, p41 p41Var, sqf sqfVar) {
        this.c = sqfVar.b;
        this.d = sqfVar.d;
        this.e = gmbVar;
        o41 g = sqfVar.e.g();
        this.f = g;
        o41 g2 = ((z50) sqfVar.f).g();
        this.g = g2;
        z78 g3 = sqfVar.c.g();
        this.h = g3;
        p41Var.f(g);
        p41Var.f(g2);
        p41Var.f(g3);
        g.a(this);
        g2.a(this);
        g3.a(this);
    }

    @Override // defpackage.k41
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            fo3 fo3Var = (fo3) arrayList.get(i);
            if (fo3Var instanceof k1k) {
                k1k k1kVar = (k1k) fo3Var;
                if (k1kVar.c == 1) {
                    this.i.b.add(k1kVar);
                    k1kVar.c(this);
                    i++;
                }
            }
            if (fo3Var instanceof r7g) {
                this.j = ((r7g) fo3Var).b;
            }
            i++;
        }
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        pkc.g(ajaVar, i, arrayList, ajaVar2, this);
    }

    @Override // defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        if (obj == nmb.g) {
            this.g.j(wj9Var);
        } else if (obj == nmb.i) {
            this.f.j(wj9Var);
        } else if (obj == nmb.h) {
            this.h.j(wj9Var);
        }
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.yae
    public final Path n() {
        float f;
        o41 o41Var;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        z78 z78Var = this.h;
        float l = z78Var == null ? 0.0f : z78Var.l();
        if (l == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (o41Var = this.j) != null) {
            l = Math.min(((Float) o41Var.e()).floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (l > min) {
            l = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + l);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - l);
        RectF rectF = this.b;
        if (l > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f4 = pointF2.x + f2;
            float f5 = l * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + l, pointF2.y + f3);
        if (l > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = l * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + l);
        if (l > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = l * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - l, pointF2.y - f3);
        if (l > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f13 = pointF2.x + f2;
            float f14 = l * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.b(path);
        this.k = true;
        return path;
    }
}
