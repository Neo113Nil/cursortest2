package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.progressindicator.l;
import java.util.ArrayList;
import s0.AbstractC6307a;
import sa.AbstractC6344a;
import ya.AbstractC6866a;

/* loaded from: classes3.dex */
public final class d extends l {

    /* renamed from: f, reason: collision with root package name */
    public float f35615f;

    /* renamed from: g, reason: collision with root package name */
    public float f35616g;

    /* renamed from: h, reason: collision with root package name */
    public float f35617h;

    /* renamed from: i, reason: collision with root package name */
    public float f35618i;

    /* renamed from: j, reason: collision with root package name */
    public float f35619j;

    /* renamed from: k, reason: collision with root package name */
    public float f35620k;

    /* renamed from: l, reason: collision with root package name */
    public int f35621l;

    /* renamed from: m, reason: collision with root package name */
    public float f35622m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35623n;

    /* renamed from: o, reason: collision with root package name */
    public float f35624o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f35625p;

    /* renamed from: q, reason: collision with root package name */
    public final Pair f35626q;

    public d(g gVar) {
        super(gVar);
        this.f35625p = new RectF();
        this.f35626q = new Pair(new l.b(), new l.b());
    }

    @Override // com.google.android.material.progressindicator.l
    public void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        float width = rect.width() / f();
        float height = rect.height() / e();
        c cVar = this.f35691a;
        float f11 = (((g) cVar).f35653o / 2.0f) + ((g) cVar).f35654p;
        canvas.translate((f11 * width) + rect.left, (f11 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((g) this.f35691a).f35655q != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        c cVar2 = this.f35691a;
        this.f35615f = ((g) cVar2).f35602a * f10;
        this.f35616g = Math.min(((g) cVar2).f35602a / 2, ((g) cVar2).a()) * f10;
        c cVar3 = this.f35691a;
        this.f35617h = ((g) cVar3).f35612k * f10;
        float f13 = (((g) cVar3).f35653o - ((g) cVar3).f35602a) / 2.0f;
        this.f35618i = f13;
        if (z10 || z11) {
            float f14 = ((1.0f - f10) * ((g) cVar3).f35602a) / 2.0f;
            if ((z10 && ((g) cVar3).f35607f == 2) || (z11 && ((g) cVar3).f35608g == 1)) {
                this.f35618i = f13 + f14;
            } else if ((z10 && ((g) cVar3).f35607f == 1) || (z11 && ((g) cVar3).f35608g == 2)) {
                this.f35618i = f13 - f14;
            }
        }
        if (z11 && ((g) cVar3).f35608g == 3) {
            this.f35624o = f10;
        } else {
            this.f35624o = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.l
    public void b(Canvas canvas, Paint paint, int i10, int i11) {
    }

    @Override // com.google.android.material.progressindicator.l
    public void c(Canvas canvas, Paint paint, l.a aVar, int i10) {
        int a10 = AbstractC6344a.a(aVar.f35698c, i10);
        canvas.save();
        canvas.rotate(aVar.f35702g);
        this.f35623n = aVar.f35703h;
        float f10 = aVar.f35696a;
        float f11 = aVar.f35697b;
        int i11 = aVar.f35699d;
        m(canvas, paint, f10, f11, a10, i11, i11, aVar.f35700e, aVar.f35701f, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.l
    public void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        int a10 = AbstractC6344a.a(i10, i11);
        this.f35623n = false;
        m(canvas, paint, f10, f11, a10, i12, i12, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.l
    public int e() {
        return p();
    }

    @Override // com.google.android.material.progressindicator.l
    public int f() {
        return p();
    }

    @Override // com.google.android.material.progressindicator.l
    public void g() {
        this.f35692b.rewind();
        this.f35692b.moveTo(1.0f, 0.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f35692b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.f35692b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.f35692b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.f35692b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.f35695e.reset();
        Matrix matrix = this.f35695e;
        float f10 = this.f35618i;
        matrix.setScale(f10, f10);
        this.f35692b.transform(this.f35695e);
        if (((g) this.f35691a).b(this.f35623n)) {
            this.f35694d.setPath(this.f35692b, false);
            l(this.f35694d, this.f35692b, this.f35620k);
        }
        this.f35694d.setPath(this.f35692b, false);
    }

    public final void j(Path path, l.b bVar, l.b bVar2) {
        float f10 = (this.f35619j / 2.0f) * 0.48f;
        l.b bVar3 = new l.b(this, bVar);
        l.b bVar4 = new l.b(this, bVar2);
        bVar3.b(f10);
        bVar4.b(-f10);
        float[] fArr = bVar3.posVec;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float[] fArr2 = bVar4.posVec;
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float[] fArr3 = bVar2.posVec;
        path.cubicTo(f11, f12, f13, f14, fArr3[0], fArr3[1]);
    }

    public final void k(PathMeasure pathMeasure, Path path, Pair pair, float f10, float f11, float f12, float f13) {
        float f14 = this.f35617h * f12;
        int i10 = this.f35623n ? ((g) this.f35691a).f35610i : ((g) this.f35691a).f35611j;
        float f15 = this.f35618i;
        if (f15 != this.f35622m || (pathMeasure == this.f35694d && (f14 != this.f35620k || i10 != this.f35621l))) {
            this.f35620k = f14;
            this.f35621l = i10;
            this.f35622m = f15;
            g();
        }
        path.rewind();
        float f16 = 0.0f;
        float a10 = AbstractC6307a.a(f11, 0.0f, 1.0f);
        if (((g) this.f35691a).b(this.f35623n)) {
            float f17 = f13 / ((float) ((this.f35618i * 6.283185307179586d) / this.f35619j));
            f10 += f17;
            f16 = 0.0f - (f17 * 360.0f);
        }
        float f18 = f10 % 1.0f;
        float length = (pathMeasure.getLength() * f18) / 2.0f;
        float length2 = ((f18 + a10) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        l.b bVar = (l.b) pair.first;
        bVar.c();
        pathMeasure.getPosTan(length, bVar.posVec, bVar.tanVec);
        l.b bVar2 = (l.b) pair.second;
        bVar2.c();
        pathMeasure.getPosTan(length2, bVar2.posVec, bVar2.tanVec);
        this.f35695e.reset();
        this.f35695e.setRotate(f16);
        bVar.d(f16);
        bVar2.d(f16);
        path.transform(this.f35695e);
    }

    public final void l(PathMeasure pathMeasure, Path path, float f10) {
        path.rewind();
        float length = pathMeasure.getLength();
        int max = Math.max(3, (int) ((length / (this.f35623n ? ((g) this.f35691a).f35610i : ((g) this.f35691a).f35611j)) / 2.0f)) * 2;
        this.f35619j = length / max;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < max; i10++) {
            l.b bVar = new l.b();
            float f11 = i10;
            pathMeasure.getPosTan(this.f35619j * f11, bVar.posVec, bVar.tanVec);
            l.b bVar2 = new l.b();
            float f12 = this.f35619j;
            pathMeasure.getPosTan((f11 * f12) + (f12 / 2.0f), bVar2.posVec, bVar2.tanVec);
            arrayList.add(bVar);
            bVar2.a(f10 * 2.0f);
            arrayList.add(bVar2);
        }
        arrayList.add((l.b) arrayList.get(0));
        l.b bVar3 = (l.b) arrayList.get(0);
        float[] fArr = bVar3.posVec;
        int i11 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i11 < arrayList.size()) {
            l.b bVar4 = (l.b) arrayList.get(i11);
            j(path, bVar3, bVar4);
            i11++;
            bVar3 = bVar4;
        }
    }

    public final void m(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12, float f12, float f13, boolean z10) {
        float f14 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f15 = f10 % 1.0f;
        if (f15 < 0.0f) {
            f15 += 1.0f;
        }
        if (this.f35624o < 1.0f) {
            float f16 = f15 + f14;
            if (f16 > 1.0f) {
                m(canvas, paint, f15, 1.0f, i10, i11, 0, f12, f13, z10);
                m(canvas, paint, 1.0f, f16, i10, 0, i12, f12, f13, z10);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f35616g / this.f35618i);
        float f17 = f14 - 0.99f;
        if (f17 >= 0.0f) {
            float f18 = ((f17 * degrees) / 180.0f) / 0.01f;
            f14 += f18;
            if (!z10) {
                f15 -= f18 / 2.0f;
            }
        }
        float c10 = AbstractC6866a.c(1.0f - this.f35624o, 1.0f, f15);
        float c11 = AbstractC6866a.c(0.0f, this.f35624o, f14);
        float degrees2 = (float) Math.toDegrees(i11 / this.f35618i);
        float degrees3 = ((c11 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f35618i));
        float f19 = (c10 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z11 = ((g) this.f35691a).b(this.f35623n) && z10 && f12 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f35615f);
        float f20 = this.f35616g * 2.0f;
        float f21 = degrees * 2.0f;
        if (degrees3 < f21) {
            float f22 = degrees3 / f21;
            float f23 = f19 + (degrees * f22);
            l.b bVar = new l.b();
            if (z11) {
                float length = ((f23 / 360.0f) * this.f35694d.getLength()) / 2.0f;
                float f24 = this.f35617h * f12;
                float f25 = this.f35618i;
                if (f25 != this.f35622m || f24 != this.f35620k) {
                    this.f35620k = f24;
                    this.f35622m = f25;
                    g();
                }
                this.f35694d.getPosTan(length, bVar.posVec, bVar.tanVec);
            } else {
                bVar.d(f23 + 90.0f);
                bVar.a(-this.f35618i);
            }
            paint.setStyle(Paint.Style.FILL);
            o(canvas, paint, bVar, f20, this.f35615f, f22);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((g) this.f35691a).g() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f26 = f19 + degrees;
        float f27 = degrees3 - f21;
        ((l.b) this.f35626q.first).c();
        ((l.b) this.f35626q.second).c();
        if (z11) {
            k(this.f35694d, this.f35693c, this.f35626q, f26 / 360.0f, f27 / 360.0f, f12, f13);
            canvas.drawPath(this.f35693c, paint);
        } else {
            ((l.b) this.f35626q.first).d(f26 + 90.0f);
            ((l.b) this.f35626q.first).a(-this.f35618i);
            ((l.b) this.f35626q.second).d(f26 + f27 + 90.0f);
            ((l.b) this.f35626q.second).a(-this.f35618i);
            RectF rectF = this.f35625p;
            float f28 = this.f35618i;
            rectF.set(-f28, -f28, f28, f28);
            canvas.drawArc(this.f35625p, f26, f27, false, paint);
        }
        if (((g) this.f35691a).g() || this.f35616g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        n(canvas, paint, (l.b) this.f35626q.first, f20, this.f35615f);
        n(canvas, paint, (l.b) this.f35626q.second, f20, this.f35615f);
    }

    public final void n(Canvas canvas, Paint paint, l.b bVar, float f10, float f11) {
        o(canvas, paint, bVar, f10, f11, 1.0f);
    }

    public final void o(Canvas canvas, Paint paint, l.b bVar, float f10, float f11, float f12) {
        float min = Math.min(f11, this.f35615f);
        float f13 = f10 / 2.0f;
        float min2 = Math.min(f13, (this.f35616g * min) / this.f35615f);
        RectF rectF = new RectF((-f10) / 2.0f, (-min) / 2.0f, f13, min / 2.0f);
        canvas.save();
        float[] fArr = bVar.posVec;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i(bVar.tanVec));
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int p() {
        c cVar = this.f35691a;
        return ((g) cVar).f35653o + (((g) cVar).f35654p * 2);
    }
}
