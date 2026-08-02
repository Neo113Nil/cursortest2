package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a29 implements jb5, k41, cja {
    public final String a;
    public final boolean b;
    public final p41 c;
    public final nkb d = new nkb((Object) null);
    public final nkb e = new nkb((Object) null);
    public final Path f;
    public final ska g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final y19 k;
    public final x13 l;
    public final y19 m;
    public final y19 n;
    public gkk o;
    public gkk p;
    public final gmb q;
    public final int r;
    public o41 s;
    public float t;

    public a29(gmb gmbVar, plb plbVar, p41 p41Var, z19 z19Var) {
        Path path = new Path();
        this.f = path;
        this.g = new ska(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = p41Var;
        this.a = z19Var.g;
        this.b = z19Var.h;
        this.q = gmbVar;
        this.j = z19Var.a;
        path.setFillType(z19Var.b);
        this.r = (int) (plbVar.b() / 32.0f);
        o41 g = z19Var.c.g();
        this.k = (y19) g;
        g.a(this);
        p41Var.f(g);
        o41 g2 = z19Var.d.g();
        this.l = (x13) g2;
        g2.a(this);
        p41Var.f(g2);
        o41 g3 = z19Var.e.g();
        this.m = (y19) g3;
        g3.a(this);
        p41Var.f(g3);
        o41 g4 = z19Var.f.g();
        this.n = (y19) g4;
        g4.a(this);
        p41Var.f(g4);
        if (p41Var.k() != null) {
            z78 g5 = ((s50) p41Var.k().a).g();
            this.s = g5;
            g5.a(this);
            p41Var.f(this.s);
        }
    }

    @Override // defpackage.k41
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            fo3 fo3Var = (fo3) list2.get(i);
            if (fo3Var instanceof yae) {
                this.i.add((yae) fo3Var);
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
        if (obj == 4) {
            this.l.j(wj9Var);
            return;
        }
        ColorFilter colorFilter = nmb.I;
        p41 p41Var = this.c;
        if (obj == colorFilter) {
            gkk gkkVar = this.o;
            if (gkkVar != null) {
                p41Var.o(gkkVar);
            }
            if (wj9Var == null) {
                this.o = null;
                return;
            }
            gkk gkkVar2 = new gkk(wj9Var, null);
            this.o = gkkVar2;
            gkkVar2.a(this);
            p41Var.f(this.o);
            return;
        }
        if (obj != nmb.J) {
            if (obj == nmb.e) {
                o41 o41Var = this.s;
                if (o41Var != null) {
                    o41Var.j(wj9Var);
                    return;
                }
                gkk gkkVar3 = new gkk(wj9Var, null);
                this.s = gkkVar3;
                gkkVar3.a(this);
                p41Var.f(this.s);
                return;
            }
            return;
        }
        gkk gkkVar4 = this.p;
        if (gkkVar4 != null) {
            p41Var.o(gkkVar4);
        }
        if (wj9Var == null) {
            this.p = null;
            return;
        }
        this.d.a();
        this.e.a();
        gkk gkkVar5 = new gkk(wj9Var, null);
        this.p = gkkVar5;
        gkkVar5.a(this);
        p41Var.f(this.p);
    }

    @Override // defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
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

    public final int[] f(int[] iArr) {
        gkk gkkVar = this.p;
        if (gkkVar != null) {
            Integer[] numArr = (Integer[]) gkkVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.jb5
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((yae) arrayList.get(i2)).n(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        y19 y19Var = this.k;
        y19 y19Var2 = this.n;
        y19 y19Var3 = this.m;
        if (i3 == 1) {
            long h = h();
            nkb nkbVar = this.d;
            shader = (LinearGradient) nkbVar.c(h);
            if (shader == null) {
                PointF pointF = (PointF) y19Var3.e();
                PointF pointF2 = (PointF) y19Var2.e();
                x19 x19Var = (x19) y19Var.e();
                int[] f = f(x19Var.b);
                float[] fArr2 = x19Var.a;
                if (f.length < 2) {
                    int[] iArr3 = {f[0], f[0]};
                    fArr2 = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                    iArr2 = iArr3;
                } else {
                    iArr2 = f;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                nkbVar.g(shader, h);
            }
        } else {
            long h2 = h();
            nkb nkbVar2 = this.e;
            RadialGradient radialGradient = (RadialGradient) nkbVar2.c(h2);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) y19Var3.e();
                PointF pointF4 = (PointF) y19Var2.e();
                x19 x19Var2 = (x19) y19Var.e();
                int[] f2 = f(x19Var2.b);
                float[] fArr3 = x19Var2.a;
                if (f2.length < 2) {
                    iArr = new int[]{f2[0], f2[0]};
                    fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = f2;
                }
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f3, pointF4.y - f4);
                if (hypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f3, f4, hypot, iArr, fArr, Shader.TileMode.CLAMP);
                nkbVar2.g(radialGradient2, h2);
                shader = radialGradient2;
            }
        }
        shader.setLocalMatrix(matrix);
        ska skaVar = this.g;
        skaVar.setShader(shader);
        gkk gkkVar = this.o;
        if (gkkVar != null) {
            skaVar.setColorFilter((ColorFilter) gkkVar.e());
        }
        o41 o41Var = this.s;
        if (o41Var != null) {
            float floatValue = ((Float) o41Var.e()).floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                skaVar.setMaskFilter(null);
            } else if (floatValue != this.t) {
                skaVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        float intValue = ((Integer) this.l.e()).intValue() / 100.0f;
        skaVar.setAlpha(pkc.c((int) (i * intValue)));
        if (uc5Var != null) {
            uc5Var.a((int) (intValue * 255.0f), skaVar);
        }
        canvas.drawPath(path, skaVar);
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.a;
    }

    public final int h() {
        float f = this.m.d;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.d * f2);
        int round3 = Math.round(this.k.d * f2);
        int i = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
