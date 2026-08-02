package com.airbnb.lottie.model.layer;

import B3.t;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.K;
import com.airbnb.lottie.N;
import com.airbnb.lottie.S;
import com.airbnb.lottie.utils.x;
import com.airbnb.lottie.utils.z;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: E, reason: collision with root package name */
    public final Paint f28894E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f28895F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f28896G;

    /* renamed from: H, reason: collision with root package name */
    public final RectF f28897H;

    /* renamed from: I, reason: collision with root package name */
    public final N f28898I;

    /* renamed from: J, reason: collision with root package name */
    public B3.a f28899J;

    /* renamed from: K, reason: collision with root package name */
    public B3.a f28900K;

    /* renamed from: L, reason: collision with root package name */
    public B3.c f28901L;

    /* renamed from: M, reason: collision with root package name */
    public x f28902M;

    /* renamed from: N, reason: collision with root package name */
    public x.b f28903N;

    public d(K k10, e eVar) {
        super(k10, eVar);
        this.f28894E = new A3.a(3);
        this.f28895F = new Rect();
        this.f28896G = new Rect();
        this.f28897H = new RectF();
        this.f28898I = k10.P(eVar.n());
        if (A() != null) {
            this.f28901L = new B3.c(this, this, A());
        }
    }

    public final Bitmap Q() {
        Bitmap bitmap;
        B3.a aVar = this.f28900K;
        if (aVar != null && (bitmap = (Bitmap) aVar.h()) != null) {
            return bitmap;
        }
        Bitmap G10 = this.f28873p.G(this.f28874q.n());
        if (G10 != null) {
            return G10;
        }
        N n10 = this.f28898I;
        if (n10 != null) {
            return n10.b();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.b, E3.f
    public void e(Object obj, G3.c cVar) {
        B3.c cVar2;
        B3.c cVar3;
        B3.c cVar4;
        B3.c cVar5;
        B3.c cVar6;
        super.e(obj, cVar);
        if (obj == S.f28453N) {
            if (cVar == null) {
                this.f28899J = null;
                return;
            } else {
                this.f28899J = new t(cVar);
                return;
            }
        }
        if (obj == S.f28455P) {
            if (cVar == null) {
                this.f28900K = null;
                return;
            } else {
                this.f28900K = new t(cVar);
                return;
            }
        }
        if (obj == S.f28462e && (cVar6 = this.f28901L) != null) {
            cVar6.c(cVar);
            return;
        }
        if (obj == S.f28449J && (cVar5 = this.f28901L) != null) {
            cVar5.f(cVar);
            return;
        }
        if (obj == S.f28450K && (cVar4 = this.f28901L) != null) {
            cVar4.d(cVar);
            return;
        }
        if (obj == S.f28451L && (cVar3 = this.f28901L) != null) {
            cVar3.e(cVar);
        } else {
            if (obj != S.f28452M || (cVar2 = this.f28901L) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        if (this.f28898I != null) {
            float e10 = z.e();
            if (this.f28873p.Q()) {
                rectF.set(0.0f, 0.0f, this.f28898I.f() * e10, this.f28898I.d() * e10);
            } else {
                if (Q() != null) {
                    rectF.set(0.0f, 0.0f, r5.getWidth() * e10, r5.getHeight() * e10);
                } else {
                    rectF.set(0.0f, 0.0f, this.f28898I.f() * e10, this.f28898I.d() * e10);
                }
            }
            this.f28872o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void v(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        Bitmap Q10 = Q();
        if (Q10 == null || Q10.isRecycled() || this.f28898I == null) {
            return;
        }
        float e10 = z.e();
        this.f28894E.setAlpha(i10);
        B3.a aVar = this.f28899J;
        if (aVar != null) {
            this.f28894E.setColorFilter((ColorFilter) aVar.h());
        }
        B3.c cVar = this.f28901L;
        if (cVar != null) {
            dVar = cVar.b(matrix, i10);
        }
        this.f28895F.set(0, 0, Q10.getWidth(), Q10.getHeight());
        if (this.f28873p.Q()) {
            this.f28896G.set(0, 0, (int) (this.f28898I.f() * e10), (int) (this.f28898I.d() * e10));
        } else {
            this.f28896G.set(0, 0, (int) (Q10.getWidth() * e10), (int) (Q10.getHeight() * e10));
        }
        boolean z10 = dVar != null;
        if (z10) {
            if (this.f28902M == null) {
                this.f28902M = new x();
            }
            if (this.f28903N == null) {
                this.f28903N = new x.b();
            }
            this.f28903N.f();
            dVar.d(i10, this.f28903N);
            RectF rectF = this.f28897H;
            Rect rect = this.f28896G;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.f28897H);
            canvas = this.f28902M.j(canvas, this.f28897H, this.f28903N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(Q10, this.f28895F, this.f28896G, this.f28894E);
        if (z10) {
            this.f28902M.e();
            if (this.f28902M.f()) {
                return;
            }
        }
        canvas.restore();
    }
}
