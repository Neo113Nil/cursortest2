package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.material.progressindicator.l;
import s0.AbstractC6307a;
import sa.AbstractC6344a;
import ya.AbstractC6866a;

/* loaded from: classes3.dex */
public final class o extends l {

    /* renamed from: f, reason: collision with root package name */
    public float f35711f;

    /* renamed from: g, reason: collision with root package name */
    public float f35712g;

    /* renamed from: h, reason: collision with root package name */
    public float f35713h;

    /* renamed from: i, reason: collision with root package name */
    public float f35714i;

    /* renamed from: j, reason: collision with root package name */
    public float f35715j;

    /* renamed from: k, reason: collision with root package name */
    public float f35716k;

    /* renamed from: l, reason: collision with root package name */
    public int f35717l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35718m;

    /* renamed from: n, reason: collision with root package name */
    public float f35719n;

    /* renamed from: o, reason: collision with root package name */
    public Pair f35720o;

    public o(r rVar) {
        super(rVar);
        this.f35711f = 300.0f;
        this.f35720o = new Pair(new l.b(), new l.b());
    }

    private void j(PathMeasure pathMeasure, Path path, Pair pair, float f10, float f11, float f12, float f13) {
        int i10 = this.f35718m ? ((r) this.f35691a).f35610i : ((r) this.f35691a).f35611j;
        if (pathMeasure == this.f35694d && i10 != this.f35717l) {
            this.f35717l = i10;
            g();
        }
        path.rewind();
        float f14 = (-this.f35711f) / 2.0f;
        boolean b10 = ((r) this.f35691a).b(this.f35718m);
        if (b10) {
            float f15 = this.f35711f;
            float f16 = this.f35716k;
            float f17 = f15 / f16;
            float f18 = f13 / f17;
            float f19 = f17 / (f17 + 1.0f);
            f10 = (f10 + f18) * f19;
            f11 = (f11 + f18) * f19;
            f14 -= f13 * f16;
        }
        float length = f10 * pathMeasure.getLength();
        float length2 = f11 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        l.b bVar = (l.b) pair.first;
        bVar.c();
        pathMeasure.getPosTan(length, bVar.posVec, bVar.tanVec);
        l.b bVar2 = (l.b) pair.second;
        bVar2.c();
        pathMeasure.getPosTan(length2, bVar2.posVec, bVar2.tanVec);
        this.f35695e.reset();
        this.f35695e.setTranslate(f14, 0.0f);
        bVar.f(f14, 0.0f);
        bVar2.f(f14, 0.0f);
        if (b10) {
            float f20 = this.f35715j * f12;
            this.f35695e.postScale(1.0f, f20);
            bVar.e(1.0f, f20);
            bVar2.e(1.0f, f20);
        }
        path.transform(this.f35695e);
    }

    private void l(Canvas canvas, Paint paint, l.b bVar, float f10, float f11, float f12) {
        m(canvas, paint, bVar, f10, f11, f12, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.l
    public void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        if (this.f35711f != rect.width()) {
            this.f35711f = rect.width();
            g();
        }
        float e10 = e();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - e10) / 2.0f));
        if (((r) this.f35691a).f35741p) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.f35711f / 2.0f;
        float f12 = e10 / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        c cVar = this.f35691a;
        this.f35712g = ((r) cVar).f35602a * f10;
        this.f35713h = Math.min(((r) cVar).f35602a / 2, ((r) cVar).a()) * f10;
        c cVar2 = this.f35691a;
        this.f35715j = ((r) cVar2).f35612k * f10;
        this.f35714i = Math.min(((r) cVar2).f35602a / 2.0f, ((r) cVar2).i()) * f10;
        if (z10 || z11) {
            if ((z10 && ((r) this.f35691a).f35607f == 2) || (z11 && ((r) this.f35691a).f35608g == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((r) this.f35691a).f35608g != 3)) {
                canvas.translate(0.0f, (((r) this.f35691a).f35602a * (1.0f - f10)) / 2.0f);
            }
        }
        if (z11 && ((r) this.f35691a).f35608g == 3) {
            this.f35719n = f10;
        } else {
            this.f35719n = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.l
    public void b(Canvas canvas, Paint paint, int i10, int i11) {
        int a10 = AbstractC6344a.a(i10, i11);
        this.f35718m = false;
        if (((r) this.f35691a).f35742q <= 0 || a10 == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a10);
        c cVar = this.f35691a;
        l.b bVar = new l.b(new float[]{(this.f35711f / 2.0f) - (((r) cVar).f35743r != null ? ((r) cVar).f35743r.floatValue() + (((r) this.f35691a).f35742q / 2.0f) : this.f35712g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        c cVar2 = this.f35691a;
        l(canvas, paint, bVar, ((r) cVar2).f35742q, ((r) cVar2).f35742q, (this.f35713h * ((r) cVar2).f35742q) / this.f35712g);
    }

    @Override // com.google.android.material.progressindicator.l
    public void c(Canvas canvas, Paint paint, l.a aVar, int i10) {
        int a10 = AbstractC6344a.a(aVar.f35698c, i10);
        this.f35718m = aVar.f35703h;
        float f10 = aVar.f35696a;
        float f11 = aVar.f35697b;
        int i11 = aVar.f35699d;
        k(canvas, paint, f10, f11, a10, i11, i11, aVar.f35700e, aVar.f35701f, true);
    }

    @Override // com.google.android.material.progressindicator.l
    public void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        int a10 = AbstractC6344a.a(i10, i11);
        this.f35718m = false;
        k(canvas, paint, f10, f11, a10, i12, i12, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.l
    public int e() {
        c cVar = this.f35691a;
        return ((r) cVar).f35602a + (((r) cVar).f35612k * 2);
    }

    @Override // com.google.android.material.progressindicator.l
    public int f() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.l
    public void g() {
        this.f35692b.rewind();
        if (((r) this.f35691a).b(this.f35718m)) {
            int i10 = this.f35718m ? ((r) this.f35691a).f35610i : ((r) this.f35691a).f35611j;
            float f10 = this.f35711f;
            int i11 = (int) (f10 / i10);
            this.f35716k = f10 / i11;
            for (int i12 = 0; i12 <= i11; i12++) {
                int i13 = i12 * 2;
                float f11 = i13 + 1;
                this.f35692b.cubicTo(i13 + 0.48f, 0.0f, f11 - 0.48f, 1.0f, f11, 1.0f);
                float f12 = i13 + 2;
                this.f35692b.cubicTo(f11 + 0.48f, 1.0f, f12 - 0.48f, 0.0f, f12, 0.0f);
            }
            this.f35695e.reset();
            this.f35695e.setScale(this.f35716k / 2.0f, -2.0f);
            this.f35695e.postTranslate(0.0f, 1.0f);
            this.f35692b.transform(this.f35695e);
        } else {
            this.f35692b.lineTo(this.f35711f, 0.0f);
        }
        this.f35694d.setPath(this.f35692b, false);
    }

    public final void k(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        Paint paint2;
        Canvas canvas2;
        float a10 = AbstractC6307a.a(f10, 0.0f, 1.0f);
        float a11 = AbstractC6307a.a(f11, 0.0f, 1.0f);
        float c10 = AbstractC6866a.c(1.0f - this.f35719n, 1.0f, a10);
        float c11 = AbstractC6866a.c(1.0f - this.f35719n, 1.0f, a11);
        int a12 = (int) ((i11 * AbstractC6307a.a(c10, 0.0f, 0.01f)) / 0.01f);
        int a13 = (int) ((i12 * (1.0f - AbstractC6307a.a(c11, 0.99f, 1.0f))) / 0.01f);
        float f16 = this.f35711f;
        int i13 = (int) ((c10 * f16) + a12);
        int i14 = (int) ((c11 * f16) - a13);
        float f17 = this.f35713h;
        float f18 = this.f35714i;
        if (f17 != f18) {
            float max = Math.max(f17, f18);
            float f19 = this.f35711f;
            float f20 = max / f19;
            float c12 = AbstractC6866a.c(this.f35713h, this.f35714i, AbstractC6307a.a(i13 / f19, 0.0f, f20) / f20);
            float f21 = this.f35713h;
            float f22 = this.f35714i;
            float f23 = this.f35711f;
            f15 = AbstractC6866a.c(f21, f22, AbstractC6307a.a((f23 - i14) / f23, 0.0f, f20) / f20);
            f14 = c12;
        } else {
            f14 = f17;
            f15 = f14;
        }
        float f24 = (-this.f35711f) / 2.0f;
        boolean z11 = ((r) this.f35691a).b(this.f35718m) && z10 && f12 > 0.0f;
        if (i13 <= i14) {
            float f25 = i13 + f14;
            float f26 = i14 - f15;
            float f27 = f14 * 2.0f;
            float f28 = 2.0f * f15;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f35712g);
            ((l.b) this.f35720o.first).c();
            ((l.b) this.f35720o.second).c();
            ((l.b) this.f35720o.first).f(f25 + f24, 0.0f);
            ((l.b) this.f35720o.second).f(f24 + f26, 0.0f);
            if (i13 == 0 && f26 + f15 < f25 + f14) {
                Pair pair = this.f35720o;
                l.b bVar = (l.b) pair.first;
                float f29 = this.f35712g;
                m(canvas, paint, bVar, f27, f29, f14, (l.b) pair.second, f28, f29, f15, true);
                return;
            }
            if (f25 - f14 > f26 - f15) {
                Pair pair2 = this.f35720o;
                l.b bVar2 = (l.b) pair2.second;
                float f30 = this.f35712g;
                m(canvas, paint, bVar2, f28, f30, f15, (l.b) pair2.first, f27, f30, f14, false);
                return;
            }
            float f31 = f15;
            float f32 = f14;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((r) this.f35691a).g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z11) {
                paint2 = paint;
                PathMeasure pathMeasure = this.f35694d;
                Path path = this.f35693c;
                Pair pair3 = this.f35720o;
                float f33 = this.f35711f;
                j(pathMeasure, path, pair3, f25 / f33, f26 / f33, f12, f13);
                canvas2 = canvas;
                canvas2.drawPath(this.f35693c, paint2);
            } else {
                Pair pair4 = this.f35720o;
                Object obj = pair4.first;
                float f34 = ((l.b) obj).posVec[0];
                float f35 = ((l.b) obj).posVec[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f34, f35, ((l.b) obj2).posVec[0], ((l.b) obj2).posVec[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((r) this.f35691a).g()) {
                return;
            }
            if (f25 > 0.0f && f32 > 0.0f) {
                l(canvas2, paint2, (l.b) this.f35720o.first, f27, this.f35712g, f32);
            }
            if (f26 >= this.f35711f || f31 <= 0.0f) {
                return;
            }
            l(canvas, paint, (l.b) this.f35720o.second, f28, this.f35712g, f31);
        }
    }

    public final void m(Canvas canvas, Paint paint, l.b bVar, float f10, float f11, float f12, l.b bVar2, float f13, float f14, float f15, boolean z10) {
        char c10;
        float f16;
        float f17;
        float min = Math.min(f11, this.f35712g);
        float f18 = (-f10) / 2.0f;
        float f19 = (-min) / 2.0f;
        float f20 = f10 / 2.0f;
        float f21 = min / 2.0f;
        RectF rectF = new RectF(f18, f19, f20, f21);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (bVar2 != null) {
            float min2 = Math.min(f14, this.f35712g);
            float min3 = Math.min(f13 / 2.0f, (f15 * min2) / this.f35712g);
            RectF rectF2 = new RectF();
            if (z10) {
                c10 = 0;
                float f22 = (bVar2.posVec[0] - min3) - (bVar.posVec[0] - f12);
                if (f22 > 0.0f) {
                    bVar2.f((-f22) / 2.0f, 0.0f);
                    f17 = f13 + f22;
                } else {
                    f17 = f13;
                }
                rectF2.set(0.0f, f19, f20, f21);
            } else {
                c10 = 0;
                float f23 = (bVar2.posVec[0] + min3) - (bVar.posVec[0] + f12);
                if (f23 < 0.0f) {
                    bVar2.f((-f23) / 2.0f, 0.0f);
                    f16 = f13 - f23;
                } else {
                    f16 = f13;
                }
                rectF2.set(f18, f19, 0.0f, f21);
                f17 = f16;
            }
            RectF rectF3 = new RectF((-f17) / 2.0f, (-min2) / 2.0f, f17 / 2.0f, min2 / 2.0f);
            float[] fArr = bVar2.posVec;
            canvas.translate(fArr[c10], fArr[1]);
            canvas.rotate(i(bVar2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i(bVar2.tanVec));
            float[] fArr2 = bVar2.posVec;
            canvas.translate(-fArr2[c10], -fArr2[1]);
            float[] fArr3 = bVar.posVec;
            canvas.translate(fArr3[c10], fArr3[1]);
            canvas.rotate(i(bVar.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f12, f12, paint);
        } else {
            float[] fArr4 = bVar.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i(bVar.tanVec));
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        canvas.restore();
    }
}
