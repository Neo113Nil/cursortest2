package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t7b extends mb5 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // defpackage.mb5
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float e = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (rect.height() - e) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        e8b e8bVar = (e8b) this.a;
        if (e8bVar.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = e / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        this.g = e8bVar.a * f;
        this.h = Math.min(r0 / 2, e8bVar.a()) * f;
        this.j = e8bVar.l * f;
        this.i = Math.min(e8bVar.a / 2.0f, e8bVar.e()) * f;
        if (z || z2) {
            if ((z && e8bVar.g == 2) || (z2 && e8bVar.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && e8bVar.h != 3)) {
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((1.0f - f) * e8bVar.a) / 2.0f);
            }
        }
        if (z2 && e8bVar.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // defpackage.mb5
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
        int q = o3a.q(i, i2);
        this.m = false;
        e8b e8bVar = (e8b) this.a;
        int min = Math.min(e8bVar.t, e8bVar.a);
        if (min <= 0 || q == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(q);
        Integer num = e8bVar.u;
        float f = min;
        j(canvas, paint, new lb5(new float[]{(this.f / 2.0f) - (num != null ? (e8bVar.t / 2.0f) + num.floatValue() : this.g / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}), f, f, (this.h * f) / this.g, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    @Override // defpackage.mb5
    public final void c(Canvas canvas, Paint paint, kb5 kb5Var, int i) {
        int q = o3a.q(kb5Var.c, i);
        this.m = kb5Var.h;
        float f = kb5Var.a;
        float f2 = kb5Var.b;
        int i2 = kb5Var.d;
        i(canvas, paint, f, f2, q, i2, i2, kb5Var.e, kb5Var.f, true);
    }

    @Override // defpackage.mb5
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int q = o3a.q(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, q, i3, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    @Override // defpackage.mb5
    public final int e() {
        l51 l51Var = this.a;
        return (((e8b) l51Var).l * 2) + ((e8b) l51Var).a;
    }

    @Override // defpackage.mb5
    public final int f() {
        return -1;
    }

    @Override // defpackage.mb5
    public final void g() {
        Path path = this.b;
        path.rewind();
        e8b e8bVar = (e8b) this.a;
        if (e8bVar.b(this.m)) {
            int i = this.m ? e8bVar.j : e8bVar.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        e8b e8bVar;
        float f7;
        Canvas canvas2;
        Pair pair = this.o;
        float s = s6a.s(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float s2 = s6a.s(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float F = o6a.F(1.0f - this.n, 1.0f, s);
        float F2 = o6a.F(1.0f - this.n, 1.0f, s2);
        int s3 = (int) ((s6a.s(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f) * i2) / 0.01f);
        int s4 = (int) (((1.0f - s6a.s(F2, 0.99f, 1.0f)) * i3) / 0.01f);
        float f8 = this.f;
        int i4 = (int) ((F * f8) + s3);
        int i5 = (int) ((F2 * f8) - s4);
        float f9 = this.h;
        float f10 = this.i;
        if (f9 != f10) {
            float max = Math.max(f9, f10);
            float f11 = this.f;
            float f12 = max / f11;
            f5 = o6a.F(this.h, this.i, s6a.s(i4 / f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12) / f12);
            float f13 = this.h;
            float f14 = this.i;
            float f15 = this.f;
            f6 = o6a.F(f13, f14, s6a.s((f15 - i5) / f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12) / f12);
        } else {
            f5 = f9;
            f6 = f5;
        }
        float f16 = (-this.f) / 2.0f;
        e8b e8bVar2 = (e8b) this.a;
        boolean z2 = e8bVar2.b(this.m) && z && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i4 <= i5) {
            float f17 = i4 + f5;
            float f18 = i5 - f6;
            float f19 = f5 * 2.0f;
            float f20 = f6 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((lb5) pair.first).b();
            ((lb5) pair.second).b();
            ((lb5) pair.first).e(f17 + f16);
            ((lb5) pair.second).e(f18 + f16);
            if (i4 == 0 && f18 + f6 < f17 + f5) {
                lb5 lb5Var = (lb5) pair.first;
                float f21 = this.g;
                j(canvas, paint, lb5Var, f19, f21, f5, (lb5) pair.second, f20, f21, f6, true);
                return;
            }
            if (f17 - f5 > f18 - f6) {
                lb5 lb5Var2 = (lb5) pair.second;
                float f22 = this.g;
                j(canvas, paint, lb5Var2, f20, f22, f6, (lb5) pair.first, f19, f22, f5, false);
                return;
            }
            float f23 = f6;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(e8bVar2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f24 = this.f;
                float f25 = f17 / f24;
                float f26 = f18 / f24;
                e8bVar = e8bVar2;
                int i6 = this.m ? e8bVar.j : e8bVar.k;
                if (i6 != this.l) {
                    this.l = i6;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f27 = (-this.f) / 2.0f;
                boolean b = e8bVar.b(this.m);
                if (b) {
                    float f28 = this.f;
                    f7 = 1.0f;
                    float f29 = this.k;
                    float f30 = f28 / f29;
                    float f31 = f4 / f30;
                    float f32 = f30 / (f30 + 1.0f);
                    f25 = (f25 + f31) * f32;
                    f26 = (f26 + f31) * f32;
                    f27 -= f29 * f4;
                } else {
                    f7 = 1.0f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f25;
                float length2 = pathMeasure.getLength() * f26;
                pathMeasure.getSegment(length, length2, path, true);
                lb5 lb5Var3 = (lb5) pair.first;
                lb5Var3.b();
                pathMeasure.getPosTan(length, lb5Var3.a, lb5Var3.b);
                lb5 lb5Var4 = (lb5) pair.second;
                lb5Var4.b();
                pathMeasure.getPosTan(length2, lb5Var4.a, lb5Var4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f27, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                lb5Var3.e(f27);
                lb5Var4.e(f27);
                if (b) {
                    float f33 = this.j * f3;
                    matrix.postScale(f7, f33);
                    lb5Var3.d(f33);
                    lb5Var4.d(f33);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((lb5) pair.first).a;
                float f34 = fArr[0];
                float f35 = fArr[1];
                float[] fArr2 = ((lb5) pair.second).a;
                canvas.drawLine(f34, f35, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                e8bVar = e8bVar2;
            }
            if (e8bVar.c()) {
                return;
            }
            if (f17 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                j(canvas2, paint, (lb5) pair.first, f19, this.g, f5, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            }
            if (f18 >= this.f || f23 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            j(canvas, paint, (lb5) pair.second, f20, this.g, f23, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, lb5 lb5Var, float f, float f2, float f3, lb5 lb5Var2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float min = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-min) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = min / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (lb5Var2 != null) {
            float[] fArr = lb5Var2.b;
            float[] fArr2 = lb5Var2.a;
            float min2 = Math.min(f5, this.g);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - min3) - (lb5Var.a[0] - f3);
                if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    lb5Var2.e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + min3) - (lb5Var.a[0] + f3);
                if (f14 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    lb5Var2.e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(mb5.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-mb5.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = lb5Var.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(mb5.h(lb5Var.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = lb5Var.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(mb5.h(lb5Var.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
