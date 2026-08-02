package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a71 implements k41, cja, jb5 {
    public final gmb e;
    public final p41 f;
    public final float[] h;
    public final ska i;
    public final z78 j;
    public final x13 k;
    public final ArrayList l;
    public final z78 m;
    public gkk n;
    public o41 o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public a71(gmb gmbVar, p41 p41Var, Paint.Cap cap, Paint.Join join, float f, r50 r50Var, s50 s50Var, ArrayList arrayList, s50 s50Var2) {
        ska skaVar = new ska(1, 0);
        this.i = skaVar;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = gmbVar;
        this.f = p41Var;
        skaVar.setStyle(Paint.Style.STROKE);
        skaVar.setStrokeCap(cap);
        skaVar.setStrokeJoin(join);
        skaVar.setStrokeMiter(f);
        this.k = (x13) r50Var.g();
        this.j = s50Var.g();
        if (s50Var2 == null) {
            this.m = null;
        } else {
            this.m = s50Var2.g();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((s50) arrayList.get(i)).g());
        }
        p41Var.f(this.k);
        p41Var.f(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            p41Var.f((o41) this.l.get(i2));
        }
        z78 z78Var = this.m;
        if (z78Var != null) {
            p41Var.f(z78Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((o41) this.l.get(i3)).a(this);
        }
        z78 z78Var2 = this.m;
        if (z78Var2 != null) {
            z78Var2.a(this);
        }
        if (p41Var.k() != null) {
            z78 g = ((s50) p41Var.k().a).g();
            this.o = g;
            g.a(this);
            p41Var.f(this.o);
        }
    }

    @Override // defpackage.k41
    public final void a() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        z61 z61Var = null;
        k1k k1kVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            fo3 fo3Var = (fo3) arrayList2.get(size);
            if (fo3Var instanceof k1k) {
                k1k k1kVar2 = (k1k) fo3Var;
                if (k1kVar2.c == 2) {
                    k1kVar = k1kVar2;
                }
            }
        }
        if (k1kVar != null) {
            k1kVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            fo3 fo3Var2 = (fo3) list2.get(size2);
            if (fo3Var2 instanceof k1k) {
                k1k k1kVar3 = (k1k) fo3Var2;
                if (k1kVar3.c == 2) {
                    if (z61Var != null) {
                        arrayList.add(z61Var);
                    }
                    z61 z61Var2 = new z61(k1kVar3);
                    k1kVar3.c(this);
                    z61Var = z61Var2;
                }
            }
            if (fo3Var2 instanceof yae) {
                if (z61Var == null) {
                    z61Var = new z61(k1kVar);
                }
                z61Var.a.add((yae) fo3Var2);
            }
        }
        if (z61Var != null) {
            arrayList.add(z61Var);
        }
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        pkc.g(ajaVar, i, arrayList, ajaVar2, this);
    }

    @Override // defpackage.bja
    public void d(wj9 wj9Var, Object obj) {
        PointF pointF = nmb.a;
        if (obj == 4) {
            this.k.j(wj9Var);
            return;
        }
        if (obj == nmb.q) {
            this.j.j(wj9Var);
            return;
        }
        ColorFilter colorFilter = nmb.I;
        p41 p41Var = this.f;
        if (obj == colorFilter) {
            gkk gkkVar = this.n;
            if (gkkVar != null) {
                p41Var.o(gkkVar);
            }
            if (wj9Var == null) {
                this.n = null;
                return;
            }
            gkk gkkVar2 = new gkk(wj9Var, null);
            this.n = gkkVar2;
            gkkVar2.a(this);
            p41Var.f(this.n);
            return;
        }
        if (obj == nmb.e) {
            o41 o41Var = this.o;
            if (o41Var != null) {
                o41Var.j(wj9Var);
                return;
            }
            gkk gkkVar3 = new gkk(wj9Var, null);
            this.o = gkkVar3;
            gkkVar3.a(this);
            p41Var.f(this.o);
        }
    }

    @Override // defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float l = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - l, rectF2.top - l, rectF2.right + l, rectF2.bottom + l);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            z61 z61Var = (z61) arrayList.get(i);
            for (int i2 = 0; i2 < z61Var.a.size(); i2++) {
                path.addPath(((yae) z61Var.a.get(i2)).n(), matrix);
            }
            i++;
        }
    }

    @Override // defpackage.jb5
    public void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        int i2;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        a71 a71Var = this;
        float[] fArr2 = (float[]) vik.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f = 100.0f;
        float intValue = ((Integer) a71Var.k.e()).intValue() / 100.0f;
        int c = pkc.c((int) (i * intValue));
        ska skaVar = a71Var.i;
        skaVar.setAlpha(c);
        skaVar.setStrokeWidth(a71Var.j.l());
        if (skaVar.getStrokeWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        ArrayList arrayList = a71Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = a71Var.h;
                if (i4 >= size) {
                    break;
                }
                float floatValue = ((Float) ((o41) arrayList.get(i4)).e()).floatValue();
                fArr[i4] = floatValue;
                if (i4 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            z78 z78Var = a71Var.m;
            skaVar.setPathEffect(new DashPathEffect(fArr, z78Var == null ? 0.0f : ((Float) z78Var.e()).floatValue()));
        }
        gkk gkkVar = a71Var.n;
        if (gkkVar != null) {
            skaVar.setColorFilter((ColorFilter) gkkVar.e());
        }
        o41 o41Var = a71Var.o;
        if (o41Var != null) {
            float floatValue2 = ((Float) o41Var.e()).floatValue();
            if (floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                skaVar.setMaskFilter(null);
            } else if (floatValue2 != a71Var.p) {
                p41 p41Var = a71Var.f;
                if (p41Var.A == floatValue2) {
                    blurMaskFilter = p41Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    p41Var.B = blurMaskFilter2;
                    p41Var.A = floatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                skaVar.setMaskFilter(blurMaskFilter);
            }
            a71Var.p = floatValue2;
        }
        if (uc5Var != null) {
            uc5Var.a((int) (intValue * 255.0f), skaVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = a71Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            z61 z61Var = (z61) arrayList2.get(i5);
            k1k k1kVar = z61Var.b;
            ArrayList arrayList3 = z61Var.a;
            Path path = a71Var.b;
            if (k1kVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((yae) arrayList3.get(size2)).n());
                }
                float floatValue3 = ((Float) k1kVar.d.e()).floatValue() / f;
                float floatValue4 = ((Float) k1kVar.e.e()).floatValue() / f;
                float floatValue5 = ((Float) k1kVar.f.e()).floatValue() / 360.0f;
                if (floatValue3 >= 0.01f || floatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = a71Var.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f2 = floatValue5 * length;
                    float f3 = (floatValue3 * length) + f2;
                    float min = Math.min((floatValue4 * length) + f2, (f3 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f4 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path n = ((yae) arrayList3.get(size3)).n();
                        Path path2 = a71Var.c;
                        path2.set(n);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (min > length) {
                            float f5 = min - length;
                            if (f5 < f4 + length2 && f4 < f5) {
                                vik.a(path2, f3 > length ? (f3 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                canvas.drawPath(path2, skaVar);
                                f4 += length2;
                                size3--;
                                a71Var = this;
                                i3 = i6;
                                z = false;
                            }
                        }
                        float f6 = f4 + length2;
                        if (f6 >= f3 && f4 <= min) {
                            if (f6 > min || f3 >= f4) {
                                vik.a(path2, f3 < f4 ? 0.0f : (f3 - f4) / length2, min > f6 ? 1.0f : (min - f4) / length2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                canvas.drawPath(path2, skaVar);
                            } else {
                                canvas.drawPath(path2, skaVar);
                            }
                        }
                        f4 += length2;
                        size3--;
                        a71Var = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, skaVar);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((yae) arrayList3.get(size4)).n());
                }
                canvas.drawPath(path, skaVar);
            }
            i5++;
            a71Var = this;
            i3 = i2;
            z = false;
            f = 100.0f;
        }
    }
}
