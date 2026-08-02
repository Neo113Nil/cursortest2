package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.utils.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {
    private final float[] dashPatternValues;

    /* renamed from: e, reason: collision with root package name */
    public final K f28532e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f28533f;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f28535h;

    /* renamed from: i, reason: collision with root package name */
    public final B3.a f28536i;

    /* renamed from: j, reason: collision with root package name */
    public final B3.a f28537j;

    /* renamed from: k, reason: collision with root package name */
    public final List f28538k;

    /* renamed from: l, reason: collision with root package name */
    public final B3.a f28539l;

    /* renamed from: m, reason: collision with root package name */
    public B3.a f28540m;

    /* renamed from: n, reason: collision with root package name */
    public B3.a f28541n;

    /* renamed from: o, reason: collision with root package name */
    public float f28542o;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f28528a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f28529b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f28530c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f28531d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final List f28534g = new ArrayList();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f28543a;

        /* renamed from: b, reason: collision with root package name */
        public final u f28544b;

        public b(u uVar) {
            this.f28543a = new ArrayList();
            this.f28544b = uVar;
        }
    }

    public a(K k10, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f10, F3.d dVar, F3.b bVar2, List list, F3.b bVar3) {
        A3.a aVar = new A3.a(1);
        this.f28535h = aVar;
        this.f28542o = 0.0f;
        this.f28532e = k10;
        this.f28533f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f28537j = dVar.a();
        this.f28536i = bVar2.a();
        if (bVar3 == null) {
            this.f28539l = null;
        } else {
            this.f28539l = bVar3.a();
        }
        this.f28538k = new ArrayList(list.size());
        this.dashPatternValues = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f28538k.add(((F3.b) list.get(i10)).a());
        }
        bVar.j(this.f28537j);
        bVar.j(this.f28536i);
        for (int i11 = 0; i11 < this.f28538k.size(); i11++) {
            bVar.j((B3.a) this.f28538k.get(i11));
        }
        B3.a aVar2 = this.f28539l;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f28537j.a(this);
        this.f28536i.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((B3.a) this.f28538k.get(i12)).a(this);
        }
        B3.a aVar3 = this.f28539l;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.y() != null) {
            B3.d a10 = bVar.y().a().a();
            this.f28541n = a10;
            a10.a(this);
            bVar.j(this.f28541n);
        }
    }

    @Override // B3.a.b
    public void a() {
        this.f28532e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.k() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.e(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.k() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f28534g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.e(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f28543a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f28534g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("StrokeContent#draw");
        }
        if (z.h(matrix)) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float intValue = ((Integer) this.f28537j.h()).intValue() / 100.0f;
        this.f28535h.setAlpha(com.airbnb.lottie.utils.l.c((int) (i10 * intValue), 0, 255));
        this.f28535h.setStrokeWidth(((B3.d) this.f28536i).r());
        if (this.f28535h.getStrokeWidth() <= 0.0f) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        g();
        B3.a aVar = this.f28540m;
        if (aVar != null) {
            this.f28535h.setColorFilter((ColorFilter) aVar.h());
        }
        B3.a aVar2 = this.f28541n;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.f28535h.setMaskFilter(null);
            } else if (floatValue != this.f28542o) {
                this.f28535h.setMaskFilter(this.f28533f.z(floatValue));
            }
            this.f28542o = floatValue;
        }
        if (dVar != null) {
            dVar.c((int) (intValue * 255.0f), this.f28535h);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f28534g.size(); i11++) {
            b bVar = (b) this.f28534g.get(i11);
            if (bVar.f28544b != null) {
                j(canvas, bVar);
            } else {
                if (AbstractC2935e.h()) {
                    AbstractC2935e.b("StrokeContent#buildPath");
                }
                this.f28529b.reset();
                for (int size = bVar.f28543a.size() - 1; size >= 0; size--) {
                    this.f28529b.addPath(((m) bVar.f28543a.get(size)).l());
                }
                if (AbstractC2935e.h()) {
                    AbstractC2935e.c("StrokeContent#buildPath");
                    AbstractC2935e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f28529b, this.f28535h);
                if (AbstractC2935e.h()) {
                    AbstractC2935e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("StrokeContent#draw");
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (obj == S.f28461d) {
            this.f28537j.o(cVar);
            return;
        }
        if (obj == S.f28479v) {
            this.f28536i.o(cVar);
            return;
        }
        if (obj == S.f28453N) {
            B3.a aVar = this.f28540m;
            if (aVar != null) {
                this.f28533f.I(aVar);
            }
            if (cVar == null) {
                this.f28540m = null;
                return;
            }
            B3.t tVar = new B3.t(cVar);
            this.f28540m = tVar;
            tVar.a(this);
            this.f28533f.j(this.f28540m);
            return;
        }
        if (obj == S.f28467j) {
            B3.a aVar2 = this.f28541n;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            B3.t tVar2 = new B3.t(cVar);
            this.f28541n = tVar2;
            tVar2.a(this);
            this.f28533f.j(this.f28541n);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("StrokeContent#getBounds");
        }
        this.f28529b.reset();
        for (int i10 = 0; i10 < this.f28534g.size(); i10++) {
            b bVar = (b) this.f28534g.get(i10);
            for (int i11 = 0; i11 < bVar.f28543a.size(); i11++) {
                this.f28529b.addPath(((m) bVar.f28543a.get(i11)).l(), matrix);
            }
        }
        this.f28529b.computeBounds(this.f28531d, false);
        float r10 = ((B3.d) this.f28536i).r();
        RectF rectF2 = this.f28531d;
        float f10 = r10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f28531d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("StrokeContent#getBounds");
        }
    }

    public final void g() {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("StrokeContent#applyDashPattern");
        }
        if (this.f28538k.isEmpty()) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f28538k.size(); i10++) {
            this.dashPatternValues[i10] = ((Float) ((B3.a) this.f28538k.get(i10)).h()).floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.dashPatternValues;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.dashPatternValues;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        B3.a aVar = this.f28539l;
        this.f28535h.setPathEffect(new DashPathEffect(this.dashPatternValues, aVar == null ? 0.0f : ((Float) aVar.h()).floatValue()));
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("StrokeContent#applyDashPattern");
        }
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }

    public final void j(Canvas canvas, b bVar) {
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.f28544b == null) {
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f28529b.reset();
        for (int size = bVar.f28543a.size() - 1; size >= 0; size--) {
            this.f28529b.addPath(((m) bVar.f28543a.get(size)).l());
        }
        float floatValue = ((Float) bVar.f28544b.j().h()).floatValue() / 100.0f;
        float floatValue2 = ((Float) bVar.f28544b.g().h()).floatValue() / 100.0f;
        float floatValue3 = ((Float) bVar.f28544b.i().h()).floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f28529b, this.f28535h);
            if (AbstractC2935e.h()) {
                AbstractC2935e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f28528a.setPath(this.f28529b, false);
        float length = this.f28528a.getLength();
        while (this.f28528a.nextContour()) {
            length += this.f28528a.getLength();
        }
        float f10 = floatValue3 * length;
        float f11 = (floatValue * length) + f10;
        float min = Math.min((floatValue2 * length) + f10, (f11 + length) - 1.0f);
        float f12 = 0.0f;
        for (int size2 = bVar.f28543a.size() - 1; size2 >= 0; size2--) {
            this.f28530c.set(((m) bVar.f28543a.get(size2)).l());
            this.f28528a.setPath(this.f28530c, false);
            float length2 = this.f28528a.getLength();
            if (min > length) {
                float f13 = min - length;
                if (f13 < f12 + length2 && f12 < f13) {
                    z.a(this.f28530c, f11 > length ? (f11 - length) / length2 : 0.0f, Math.min(f13 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f28530c, this.f28535h);
                    f12 += length2;
                }
            }
            float f14 = f12 + length2;
            if (f14 >= f11 && f12 <= min) {
                if (f14 > min || f11 >= f12) {
                    z.a(this.f28530c, f11 < f12 ? 0.0f : (f11 - f12) / length2, min > f14 ? 1.0f : (min - f12) / length2, 0.0f);
                    canvas.drawPath(this.f28530c, this.f28535h);
                } else {
                    canvas.drawPath(this.f28530c, this.f28535h);
                }
            }
            f12 += length2;
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("StrokeContent#applyTrimPath");
        }
    }
}
