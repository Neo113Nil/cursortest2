package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;
import z.C6907h;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: p, reason: collision with root package name */
    public final String f28598p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f28599q;

    /* renamed from: r, reason: collision with root package name */
    public final C6907h f28600r;

    /* renamed from: s, reason: collision with root package name */
    public final C6907h f28601s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f28602t;

    /* renamed from: u, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.g f28603u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28604v;

    /* renamed from: w, reason: collision with root package name */
    public final B3.a f28605w;

    /* renamed from: x, reason: collision with root package name */
    public final B3.a f28606x;

    /* renamed from: y, reason: collision with root package name */
    public final B3.a f28607y;

    /* renamed from: z, reason: collision with root package name */
    public B3.t f28608z;

    public i(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(k10, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f28600r = new C6907h();
        this.f28601s = new C6907h();
        this.f28602t = new RectF();
        this.f28598p = fVar.j();
        this.f28603u = fVar.f();
        this.f28599q = fVar.n();
        this.f28604v = (int) (k10.J().d() / 32.0f);
        B3.a a10 = fVar.e().a();
        this.f28605w = a10;
        a10.a(this);
        bVar.j(a10);
        B3.a a11 = fVar.l().a();
        this.f28606x = a11;
        a11.a(this);
        bVar.j(a11);
        B3.a a12 = fVar.d().a();
        this.f28607y = a12;
        a12.a(this);
        bVar.j(a12);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        if (this.f28599q) {
            return;
        }
        f(this.f28602t, matrix, false);
        this.f28535h.setShader(this.f28603u == com.airbnb.lottie.model.content.g.LINEAR ? n() : o());
        super.d(canvas, matrix, i10, dVar);
    }

    @Override // com.airbnb.lottie.animation.content.a, E3.f
    public void e(Object obj, G3.c cVar) {
        super.e(obj, cVar);
        if (obj == S.GRADIENT_COLOR) {
            B3.t tVar = this.f28608z;
            if (tVar != null) {
                this.f28533f.I(tVar);
            }
            if (cVar == null) {
                this.f28608z = null;
                return;
            }
            B3.t tVar2 = new B3.t(cVar);
            this.f28608z = tVar2;
            tVar2.a(this);
            this.f28533f.j(this.f28608z);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28598p;
    }

    public final int[] k(int[] iArr) {
        B3.t tVar = this.f28608z;
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

    public final int m() {
        int round = Math.round(this.f28606x.f() * this.f28604v);
        int round2 = Math.round(this.f28607y.f() * this.f28604v);
        int round3 = Math.round(this.f28605w.f() * this.f28604v);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    public final LinearGradient n() {
        long m10 = m();
        LinearGradient linearGradient = (LinearGradient) this.f28600r.d(m10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f28606x.h();
        PointF pointF2 = (PointF) this.f28607y.h();
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) this.f28605w.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, k(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f28600r.g(m10, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient o() {
        long m10 = m();
        RadialGradient radialGradient = (RadialGradient) this.f28601s.d(m10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f28606x.h();
        PointF pointF2 = (PointF) this.f28607y.h();
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) this.f28605w.h();
        int[] k10 = k(dVar.d());
        float[] e10 = dVar.e();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), k10, e10, Shader.TileMode.CLAMP);
        this.f28601s.g(m10, radialGradient2);
        return radialGradient2;
    }
}
