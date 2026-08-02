package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vj5 implements yae, k41, cja {
    public final String b;
    public final gmb c;
    public final y19 d;
    public final o41 e;
    public final yu2 f;
    public boolean h;
    public final Path a = new Path();
    public final xl1 g = new xl1(1);

    public vj5(gmb gmbVar, p41 p41Var, yu2 yu2Var) {
        this.b = yu2Var.a;
        this.c = gmbVar;
        o41 g = yu2Var.c.g();
        this.d = (y19) g;
        o41 g2 = yu2Var.b.g();
        this.e = g2;
        this.f = yu2Var;
        p41Var.f(g);
        p41Var.f(g2);
        g.a(this);
        g2.a(this);
    }

    @Override // defpackage.k41
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.b.add(k1kVar);
                    k1kVar.c(this);
                }
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
        if (obj == nmb.f) {
            this.d.j(wj9Var);
        } else if (obj == nmb.i) {
            this.e.j(wj9Var);
        }
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.yae
    public final Path n() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        yu2 yu2Var = this.f;
        if (yu2Var.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (yu2Var.d) {
            float f5 = -f2;
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f7 = -f;
            float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path.cubicTo(f6, f5, f7, f8, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f9 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f7, f9, f6, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            float f10 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f10, f2, f, f9, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(f, f8, f10, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
        } else {
            float f11 = -f2;
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
            float f12 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path.cubicTo(f12, f11, f, f13, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f14 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f, f14, f12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(f16, f13, f15, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.b(path);
        this.h = true;
        return path;
    }
}
