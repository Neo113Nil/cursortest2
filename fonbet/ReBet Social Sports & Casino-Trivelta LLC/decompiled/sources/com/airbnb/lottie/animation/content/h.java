package com.airbnb.lottie.animation.content;

import B3.a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import java.util.ArrayList;
import java.util.List;
import z.C6907h;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f28578a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28579b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f28580c;

    /* renamed from: d, reason: collision with root package name */
    public final C6907h f28581d = new C6907h();

    /* renamed from: e, reason: collision with root package name */
    public final C6907h f28582e = new C6907h();

    /* renamed from: f, reason: collision with root package name */
    public final Path f28583f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f28584g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f28585h;

    /* renamed from: i, reason: collision with root package name */
    public final List f28586i;

    /* renamed from: j, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.g f28587j;

    /* renamed from: k, reason: collision with root package name */
    public final B3.a f28588k;

    /* renamed from: l, reason: collision with root package name */
    public final B3.a f28589l;

    /* renamed from: m, reason: collision with root package name */
    public final B3.a f28590m;

    /* renamed from: n, reason: collision with root package name */
    public final B3.a f28591n;

    /* renamed from: o, reason: collision with root package name */
    public B3.a f28592o;

    /* renamed from: p, reason: collision with root package name */
    public B3.t f28593p;

    /* renamed from: q, reason: collision with root package name */
    public final K f28594q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28595r;

    /* renamed from: s, reason: collision with root package name */
    public B3.a f28596s;

    /* renamed from: t, reason: collision with root package name */
    public float f28597t;

    public h(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f28583f = path;
        this.f28584g = new A3.a(1);
        this.f28585h = new RectF();
        this.f28586i = new ArrayList();
        this.f28597t = 0.0f;
        this.f28580c = bVar;
        this.f28578a = eVar.f();
        this.f28579b = eVar.i();
        this.f28594q = k10;
        this.f28587j = eVar.e();
        path.setFillType(eVar.c());
        this.f28595r = (int) (c2940j.d() / 32.0f);
        B3.a a10 = eVar.d().a();
        this.f28588k = a10;
        a10.a(this);
        bVar.j(a10);
        B3.a a11 = eVar.g().a();
        this.f28589l = a11;
        a11.a(this);
        bVar.j(a11);
        B3.a a12 = eVar.h().a();
        this.f28590m = a12;
        a12.a(this);
        bVar.j(a12);
        B3.a a13 = eVar.b().a();
        this.f28591n = a13;
        a13.a(this);
        bVar.j(a13);
        if (bVar.y() != null) {
            B3.d a14 = bVar.y().a().a();
            this.f28596s = a14;
            a14.a(this);
            bVar.j(this.f28596s);
        }
    }

    private int[] g(int[] iArr) {
        B3.t tVar = this.f28593p;
        if (tVar != null) {
            Integer[] numArr = (Integer[]) tVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int round = Math.round(this.f28590m.f() * this.f28595r);
        int round2 = Math.round(this.f28591n.f() * this.f28595r);
        int round3 = Math.round(this.f28588k.f() * this.f28595r);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        LinearGradient linearGradient = (LinearGradient) this.f28581d.d(j10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f28590m.h();
        PointF pointF2 = (PointF) this.f28591n.h();
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) this.f28588k.h();
        int[] g10 = g(dVar.d());
        float[] e10 = dVar.e();
        if (g10.length < 2) {
            iArr = new int[]{g10[0], g10[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = e10;
            iArr = g10;
        }
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f28581d.g(j10, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient m() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient radialGradient = (RadialGradient) this.f28582e.d(j10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f28590m.h();
        PointF pointF2 = (PointF) this.f28591n.h();
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) this.f28588k.h();
        int[] g10 = g(dVar.d());
        float[] e10 = dVar.e();
        if (g10.length < 2) {
            iArr = new int[]{g10[0], g10[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = e10;
            iArr = g10;
        }
        float f10 = pointF.x;
        float f11 = pointF.y;
        float hypot = (float) Math.hypot(pointF2.x - f10, pointF2.y - f11);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, hypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f28582e.g(j10, radialGradient2);
        return radialGradient2;
    }

    @Override // B3.a.b
    public void a() {
        this.f28594q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof m) {
                this.f28586i.add((m) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        if (this.f28579b) {
            return;
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("GradientFillContent#draw");
        }
        this.f28583f.reset();
        for (int i11 = 0; i11 < this.f28586i.size(); i11++) {
            this.f28583f.addPath(((m) this.f28586i.get(i11)).l(), matrix);
        }
        this.f28583f.computeBounds(this.f28585h, false);
        Shader k10 = this.f28587j == com.airbnb.lottie.model.content.g.LINEAR ? k() : m();
        k10.setLocalMatrix(matrix);
        this.f28584g.setShader(k10);
        B3.a aVar = this.f28592o;
        if (aVar != null) {
            this.f28584g.setColorFilter((ColorFilter) aVar.h());
        }
        B3.a aVar2 = this.f28596s;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.h()).floatValue();
            if (floatValue == 0.0f) {
                this.f28584g.setMaskFilter(null);
            } else if (floatValue != this.f28597t) {
                this.f28584g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f28597t = floatValue;
        }
        float intValue = ((Integer) this.f28589l.h()).intValue() / 100.0f;
        this.f28584g.setAlpha(com.airbnb.lottie.utils.l.c((int) (i10 * intValue), 0, 255));
        if (dVar != null) {
            dVar.c((int) (intValue * 255.0f), this.f28584g);
        }
        canvas.drawPath(this.f28583f, this.f28584g);
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("GradientFillContent#draw");
        }
    }

    @Override // E3.f
    public void e(Object obj, G3.c cVar) {
        if (obj == S.f28461d) {
            this.f28589l.o(cVar);
            return;
        }
        if (obj == S.f28453N) {
            B3.a aVar = this.f28592o;
            if (aVar != null) {
                this.f28580c.I(aVar);
            }
            if (cVar == null) {
                this.f28592o = null;
                return;
            }
            B3.t tVar = new B3.t(cVar);
            this.f28592o = tVar;
            tVar.a(this);
            this.f28580c.j(this.f28592o);
            return;
        }
        if (obj != S.GRADIENT_COLOR) {
            if (obj == S.f28467j) {
                B3.a aVar2 = this.f28596s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                B3.t tVar2 = new B3.t(cVar);
                this.f28596s = tVar2;
                tVar2.a(this);
                this.f28580c.j(this.f28596s);
                return;
            }
            return;
        }
        B3.t tVar3 = this.f28593p;
        if (tVar3 != null) {
            this.f28580c.I(tVar3);
        }
        if (cVar == null) {
            this.f28593p = null;
            return;
        }
        this.f28581d.a();
        this.f28582e.a();
        B3.t tVar4 = new B3.t(cVar);
        this.f28593p = tVar4;
        tVar4.a(this);
        this.f28580c.j(this.f28593p);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f28583f.reset();
        for (int i10 = 0; i10 < this.f28586i.size(); i10++) {
            this.f28583f.addPath(((m) this.f28586i.get(i10)).l(), matrix);
        }
        this.f28583f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28578a;
    }

    @Override // E3.f
    public void i(E3.e eVar, int i10, List list, E3.e eVar2) {
        com.airbnb.lottie.utils.l.k(eVar, i10, list, eVar2, this);
    }
}
