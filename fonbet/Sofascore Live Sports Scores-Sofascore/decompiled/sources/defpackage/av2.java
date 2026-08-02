package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class av2 extends mb5 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public float o;
    public final RectF p;
    public final Pair q;

    public av2(ov2 ov2Var) {
        super(ov2Var);
        this.p = new RectF();
        this.q = new Pair(new lb5(), new lb5());
    }

    @Override // defpackage.mb5
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float width = rect.width() / k();
        float height = rect.height() / k();
        ov2 ov2Var = (ov2) this.a;
        float f2 = (ov2Var.r / 2.0f) + ov2Var.s;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (ov2Var.t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f = ov2Var.a * f;
        this.g = Math.min(r9 / 2, ov2Var.a()) * f;
        this.h = ov2Var.l * f;
        int i = ov2Var.r;
        int i2 = ov2Var.a;
        float f4 = (i - i2) / 2.0f;
        this.i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && ov2Var.g == 2) || (z2 && ov2Var.h == 1)) {
                this.i = f4 + f5;
            } else if ((z && ov2Var.g == 1) || (z2 && ov2Var.h == 2)) {
                this.i = f4 - f5;
            }
        }
        if (z2 && ov2Var.h == 3) {
            this.o = f;
        } else {
            this.o = 1.0f;
        }
    }

    @Override // defpackage.mb5
    public final void c(Canvas canvas, Paint paint, kb5 kb5Var, int i) {
        int q = o3a.q(kb5Var.c, i);
        canvas.save();
        canvas.rotate(kb5Var.g);
        this.n = kb5Var.h;
        float f = kb5Var.a;
        float f2 = kb5Var.b;
        int i2 = kb5Var.d;
        i(canvas, paint, f, f2, q, i2, i2, kb5Var.e, kb5Var.f, true);
        canvas.restore();
    }

    @Override // defpackage.mb5
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int q = o3a.q(i, i2);
        this.n = false;
        i(canvas, paint, f, f2, q, i3, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    @Override // defpackage.mb5
    public final int e() {
        return k();
    }

    @Override // defpackage.mb5
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb5
    public final void g() {
        int i;
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i3++;
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        boolean b = ((ov2) this.a).b(this.n);
        PathMeasure pathMeasure = this.d;
        if (b) {
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int max = Math.max(3, (int) ((length / (this.n ? r2.j : r2.k)) / 2.0f)) * 2;
            this.j = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < max; i4++) {
                lb5 lb5Var = new lb5();
                float f4 = i4;
                pathMeasure.getPosTan(this.j * f4, lb5Var.a, lb5Var.b);
                lb5 lb5Var2 = new lb5();
                float f5 = this.j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), lb5Var2.a, lb5Var2.b);
                arrayList.add(lb5Var);
                lb5Var2.a(f2 * 2.0f);
                arrayList.add(lb5Var2);
            }
            arrayList.add((lb5) arrayList.get(0));
            lb5 lb5Var3 = (lb5) arrayList.get(0);
            float[] fArr = lb5Var3.a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                lb5 lb5Var4 = (lb5) arrayList.get(i5);
                float f6 = (this.j / f3) * 0.48f;
                float[] fArr2 = lb5Var3.a;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i2, fArr3, i2, i);
                System.arraycopy(lb5Var3.b, i2, new float[i], i2, i);
                new Matrix();
                float[] fArr4 = lb5Var4.a;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i2, fArr5, i2, i);
                System.arraycopy(lb5Var4.b, i2, new float[i], i2, i);
                new Matrix();
                char c2 = c;
                float atan2 = (float) Math.atan2(r6[c], r6[i2]);
                double d = fArr3[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = atan2;
                fArr3[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + fArr3[c2]);
                double d4 = -f6;
                double atan22 = (float) Math.atan2(r11[c2], r11[i6]);
                fArr5[i6] = (float) ((Math.cos(atan22) * d4) + fArr5[i6]);
                float sin = (float) ((Math.sin(atan22) * d4) + fArr5[c2]);
                fArr5[c2] = sin;
                float f7 = fArr3[i6];
                float f8 = fArr3[c2];
                float f9 = fArr5[i6];
                float[] fArr6 = lb5Var4.a;
                path.cubicTo(f7, f8, f9, sin, fArr6[i6], fArr6[c2]);
                i5++;
                lb5Var3 = lb5Var4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f8 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                i(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                i(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f10 = f7 - 0.99f;
        if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float F = o6a.F(1.0f - this.o, 1.0f, f8);
        float F2 = o6a.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.o, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((F2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f12 = (F * 360.0f) + degrees2;
        if (degrees3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        ov2 ov2Var = (ov2) this.a;
        boolean z2 = ov2Var.b(this.n) && z && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f13 = this.g * 2.0f;
        float f14 = degrees * 2.0f;
        PathMeasure pathMeasure = this.d;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = (degrees * f15) + f12;
            lb5 lb5Var = new lb5();
            if (z2) {
                float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                float f17 = this.h * f3;
                float f18 = this.i;
                if (f18 != this.m || f17 != this.k) {
                    this.k = f17;
                    this.m = f18;
                    g();
                }
                pathMeasure.getPosTan(length, lb5Var.a, lb5Var.b);
            } else {
                lb5Var.c(f16 + 90.0f);
                lb5Var.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, lb5Var, f13, this.f, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(ov2Var.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        Pair pair = this.q;
        ((lb5) pair.first).b();
        ((lb5) pair.second).b();
        if (z2) {
            float f21 = f19 / 360.0f;
            float f22 = f20 / 360.0f;
            float f23 = this.h * f3;
            int i4 = this.n ? ov2Var.j : ov2Var.k;
            float f24 = this.i;
            if (f24 != this.m || f23 != this.k || i4 != this.l) {
                this.k = f23;
                this.l = i4;
                this.m = f24;
                g();
            }
            Path path = this.c;
            path.rewind();
            float s = s6a.s(f22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            if (ov2Var.b(this.n)) {
                f5 = 1.0f;
                float f25 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f21 += f25;
                f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - (f25 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f26 = f21 % f5;
            float length2 = (pathMeasure.getLength() * f26) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f26 + s)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            lb5 lb5Var2 = (lb5) pair.first;
            lb5Var2.b();
            pathMeasure.getPosTan(length2, lb5Var2.a, lb5Var2.b);
            lb5 lb5Var3 = (lb5) pair.second;
            lb5Var3.b();
            pathMeasure.getPosTan(length3, lb5Var3.a, lb5Var3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f6);
            lb5Var2.c(f6);
            lb5Var3.c(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((lb5) pair.first).c(f19 + 90.0f);
            ((lb5) pair.first).a(-this.i);
            ((lb5) pair.second).c(f19 + f20 + 90.0f);
            ((lb5) pair.second).a(-this.i);
            float f27 = this.i;
            float f28 = -f27;
            RectF rectF = this.p;
            rectF.set(f28, f28, f27, f27);
            canvas.drawArc(rectF, f19, f20, false, paint);
            canvas2 = canvas;
        }
        if (ov2Var.c() || this.g <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (lb5) pair.first, f13, this.f, 1.0f);
        j(canvas, paint, (lb5) pair.second, f13, this.f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, lb5 lb5Var, float f, float f2, float f3) {
        float min = Math.min(f2, this.f);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.g * min) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = lb5Var.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(mb5.h(lb5Var.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int k() {
        l51 l51Var = this.a;
        return (((ov2) l51Var).s * 2) + ((ov2) l51Var).r;
    }

    @Override // defpackage.mb5
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
    }
}
