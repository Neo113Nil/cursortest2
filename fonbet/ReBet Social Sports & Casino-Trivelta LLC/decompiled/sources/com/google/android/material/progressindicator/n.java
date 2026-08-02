package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.l;
import java.util.List;

/* loaded from: classes3.dex */
public final class n extends k {

    /* renamed from: r, reason: collision with root package name */
    public l f35708r;

    /* renamed from: s, reason: collision with root package name */
    public m f35709s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f35710t;

    public n(Context context, c cVar, l lVar, m mVar) {
        super(context, cVar);
        B(lVar);
        A(mVar);
    }

    public static n v(Context context, g gVar, d dVar) {
        n nVar = new n(context, gVar, dVar, gVar.f35652n == 1 ? new f(context, gVar) : new e(gVar));
        nVar.C(androidx.vectordrawable.graphics.drawable.g.b(context.getResources(), ia.f.f48383b, null));
        return nVar;
    }

    public static n w(Context context, r rVar, o oVar) {
        return new n(context, rVar, oVar, rVar.f35739n == 0 ? new p(rVar) : new q(context, rVar));
    }

    public void A(m mVar) {
        this.f35709s = mVar;
        mVar.e(this);
    }

    public void B(l lVar) {
        this.f35708r = lVar;
    }

    public void C(Drawable drawable) {
        this.f35710t = drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f35688p)) {
            int i11 = 0;
            if (z() && (drawable = this.f35710t) != null) {
                drawable.setBounds(getBounds());
                this.f35710t.setTint(this.f35674b.indicatorColors[0]);
                this.f35710t.draw(canvas);
                return;
            }
            canvas.save();
            this.f35708r.h(canvas, getBounds(), h(), m(), l());
            int i12 = this.f35674b.f35609h;
            int alpha = getAlpha();
            c cVar = this.f35674b;
            boolean z10 = (cVar instanceof r) || ((cVar instanceof g) && ((g) cVar).f35656r);
            boolean z11 = z10 && i12 == 0 && !cVar.b(false);
            if (z11) {
                canvas2 = canvas;
                this.f35708r.d(canvas2, this.f35686n, 0.0f, 1.0f, this.f35674b.f35606e, alpha, 0);
            } else {
                if (z10) {
                    l.a aVar = (l.a) this.f35709s.f35707b.get(0);
                    List list = this.f35709s.f35707b;
                    l.a aVar2 = (l.a) list.get(list.size() - 1);
                    l lVar = this.f35708r;
                    if (lVar instanceof o) {
                        i10 = i12;
                        lVar.d(canvas, this.f35686n, 0.0f, aVar.f35696a, this.f35674b.f35606e, alpha, i10);
                        canvas2 = canvas;
                        this.f35708r.d(canvas2, this.f35686n, aVar2.f35697b, 1.0f, this.f35674b.f35606e, alpha, i10);
                    } else {
                        canvas2 = canvas;
                        i10 = i12;
                        canvas.save();
                        canvas.rotate(aVar2.f35702g);
                        this.f35708r.d(canvas2, this.f35686n, aVar2.f35697b, aVar.f35696a + 1.0f, this.f35674b.f35606e, alpha, i10);
                        canvas.restore();
                    }
                    while (i11 < this.f35709s.f35707b.size()) {
                        l.a aVar3 = (l.a) this.f35709s.f35707b.get(i11);
                        aVar3.f35701f = i();
                        this.f35708r.c(canvas, this.f35686n, aVar3, getAlpha());
                        if (i11 > 0 && !z11 && z10) {
                            this.f35708r.d(canvas2, this.f35686n, ((l.a) this.f35709s.f35707b.get(i11 - 1)).f35697b, aVar3.f35696a, this.f35674b.f35606e, alpha, i10);
                        }
                        i11++;
                        canvas2 = canvas;
                    }
                    canvas.restore();
                }
                canvas2 = canvas;
            }
            i10 = i12;
            while (i11 < this.f35709s.f35707b.size()) {
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f35708r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f35708r.f();
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ void o(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.o(bVar);
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean s(boolean z10, boolean z11, boolean z12) {
        return super.s(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.k
    public boolean t(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean t10 = super.t(z10, z11, z12);
        if (z() && (drawable = this.f35710t) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f35709s.a();
        }
        if (z10) {
            if (!z12) {
                return t10;
            }
            this.f35709s.g();
        }
        return t10;
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean u(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.u(bVar);
    }

    public m x() {
        return this.f35709s;
    }

    public l y() {
        return this.f35708r;
    }

    public final boolean z() {
        a aVar = this.f35675c;
        return aVar != null && aVar.a(this.f35673a.getContentResolver()) == 0.0f;
    }
}
