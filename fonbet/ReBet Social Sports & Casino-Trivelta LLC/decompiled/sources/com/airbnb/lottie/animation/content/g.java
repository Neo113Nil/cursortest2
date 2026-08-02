package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f28566a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f28567b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f28568c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28569d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28570e;

    /* renamed from: f, reason: collision with root package name */
    public final List f28571f;

    /* renamed from: g, reason: collision with root package name */
    public final B3.a f28572g;

    /* renamed from: h, reason: collision with root package name */
    public final B3.a f28573h;

    /* renamed from: i, reason: collision with root package name */
    public B3.a f28574i;

    /* renamed from: j, reason: collision with root package name */
    public final K f28575j;

    /* renamed from: k, reason: collision with root package name */
    public B3.a f28576k;

    /* renamed from: l, reason: collision with root package name */
    public float f28577l;

    public g(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.p pVar) {
        Path path = new Path();
        this.f28566a = path;
        this.f28567b = new A3.a(1);
        this.f28571f = new ArrayList();
        this.f28568c = bVar;
        this.f28569d = pVar.d();
        this.f28570e = pVar.f();
        this.f28575j = k10;
        if (bVar.y() != null) {
            B3.d a10 = bVar.y().a().a();
            this.f28576k = a10;
            a10.a(this);
            bVar.j(this.f28576k);
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f28572g = null;
            this.f28573h = null;
            return;
        }
        path.setFillType(pVar.c());
        B3.a a11 = pVar.b().a();
        this.f28572g = a11;
        a11.a(this);
        bVar.j(a11);
        B3.a a12 = pVar.e().a();
        this.f28573h = a12;
        a12.a(this);
        bVar.j(a12);
    }

    @Override // B3.a.b
    public void a() {
        this.f28575j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof m) {
                this.f28571f.add((m) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        if (this.f28570e) {
            return;
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("FillContent#draw");
        }
        float intValue = ((Integer) this.f28573h.h()).intValue() / 100.0f;
        this.f28567b.setColor((com.airbnb.lottie.utils.l.c((int) (i10 * intValue), 0, 255) << 24) | (((B3.b) this.f28572g).r() & 16777215));
        B3.a aVar = this.f28574i;
        if (aVar != null) {
            this.f28567b.setColorFilter((ColorFilter) aVar.h());
        }
        B3.a aVar2 = this.f28576k;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.f28567b.setMaskFilter(null);
            } else if (floatValue != this.f28577l) {
                this.f28567b.setMaskFilter(this.f28568c.z(floatValue));
            }
            this.f28577l = floatValue;
        }
        if (dVar != null) {
            dVar.c((int) (intValue * 255.0f), this.f28567b);
        } else {
            this.f28567b.clearShadowLayer();
        }
        this.f28566a.reset();
        for (int i11 = 0; i11 < this.f28571f.size(); i11++) {
            this.f28566a.addPath(((m) this.f28571f.get(i11)).l(), matrix);
        }
        canvas.drawPath(this.f28566a, this.f28567b);
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("FillContent#draw");
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (obj == S.f28458a) {
            this.f28572g.o(cVar);
            return;
        }
        if (obj == S.f28461d) {
            this.f28573h.o(cVar);
            return;
        }
        if (obj == S.f28453N) {
            B3.a aVar = this.f28574i;
            if (aVar != null) {
                this.f28568c.I(aVar);
            }
            if (cVar == null) {
                this.f28574i = null;
                return;
            }
            B3.t tVar = new B3.t(cVar);
            this.f28574i = tVar;
            tVar.a(this);
            this.f28568c.j(this.f28574i);
            return;
        }
        if (obj == S.f28467j) {
            B3.a aVar2 = this.f28576k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            B3.t tVar2 = new B3.t(cVar);
            this.f28576k = tVar2;
            tVar2.a(this);
            this.f28568c.j(this.f28576k);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f28566a.reset();
        for (int i10 = 0; i10 < this.f28571f.size(); i10++) {
            this.f28566a.addPath(((m) this.f28571f.get(i10)).l(), matrix);
        }
        this.f28566a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28569d;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }
}
