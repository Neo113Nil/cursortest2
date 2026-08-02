package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import java.util.Arrays;
import l.AbstractC5335a;
import sa.AbstractC6344a;

/* loaded from: classes3.dex */
public abstract class b extends ProgressBar {

    /* renamed from: p, reason: collision with root package name */
    public static final int f35582p = ia.l.f48556H;

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.material.progressindicator.c f35583a;

    /* renamed from: b, reason: collision with root package name */
    public int f35584b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35585c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35586d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35587e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35588f;

    /* renamed from: g, reason: collision with root package name */
    public long f35589g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.progressindicator.a f35590h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35591i;

    /* renamed from: j, reason: collision with root package name */
    public int f35592j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35593k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f35594l;

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f35595m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.vectordrawable.graphics.drawable.b f35596n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.vectordrawable.graphics.drawable.b f35597o;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    public class RunnableC0502b implements Runnable {
        public RunnableC0502b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
            b.this.f35589g = -1L;
        }
    }

    public class c extends androidx.vectordrawable.graphics.drawable.b {
        public c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            b.this.setIndeterminate(false);
            b bVar = b.this;
            bVar.q(bVar.f35584b, b.this.f35585c);
        }
    }

    public class d extends androidx.vectordrawable.graphics.drawable.b {
        public d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (b.this.f35591i) {
                return;
            }
            b bVar = b.this;
            bVar.setVisibility(bVar.f35592j);
        }
    }

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(La.a.d(context, attributeSet, i10, f35582p), attributeSet, i10);
        this.f35589g = -1L;
        this.f35591i = false;
        this.f35592j = 4;
        this.f35594l = new a();
        this.f35595m = new RunnableC0502b();
        this.f35596n = new c();
        this.f35597o = new d();
        Context context2 = getContext();
        this.f35583a = i(context2, attributeSet);
        TypedArray i12 = xa.l.i(context2, attributeSet, ia.m.BaseProgressIndicator, i10, i11, new int[0]);
        this.f35587e = i12.getInt(ia.m.f48786U, -1);
        this.f35588f = Math.min(i12.getInt(ia.m.f48768S, -1), 1000);
        i12.recycle();
        this.f35590h = new com.google.android.material.progressindicator.a();
        this.f35586d = true;
    }

    private l getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().y();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().D();
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f35583a.f35608g;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f35583a.indicatorColors;
    }

    public int getIndicatorTrackGapSize() {
        return this.f35583a.f35609h;
    }

    public int getShowAnimationBehavior() {
        return this.f35583a.f35607f;
    }

    public int getTrackColor() {
        return this.f35583a.f35606e;
    }

    public int getTrackCornerRadius() {
        return this.f35583a.f35603b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f35583a.f35604c;
    }

    public int getTrackThickness() {
        return this.f35583a.f35602a;
    }

    public int getWaveAmplitude() {
        return this.f35583a.f35612k;
    }

    public int getWaveSpeed() {
        return this.f35583a.f35613l;
    }

    public int getWavelengthDeterminate() {
        return this.f35583a.f35610i;
    }

    public int getWavelengthIndeterminate() {
        return this.f35583a.f35611j;
    }

    public void h(boolean z10) {
        if (this.f35586d) {
            ((k) getCurrentDrawable()).s(t(), false, z10);
        }
    }

    public abstract com.google.android.material.progressindicator.c i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f35594l);
            return;
        }
        removeCallbacks(this.f35595m);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f35589g;
        int i10 = this.f35588f;
        if (uptimeMillis >= i10) {
            this.f35595m.run();
        } else {
            postDelayed(this.f35595m, i10 - uptimeMillis);
        }
    }

    public final void k() {
        ((k) getCurrentDrawable()).s(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    public final void l() {
        if (this.f35588f > 0) {
            this.f35589g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public final boolean n() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    public final void o() {
        p();
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.f35597o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.f35597o);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (t()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f35595m);
        removeCallbacks(this.f35594l);
        ((k) getCurrentDrawable()).j();
        s();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            l currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    public void p() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().x().d(this.f35596n);
    }

    public void q(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f35584b = i10;
            this.f35585c = z10;
            this.f35591i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f35590h.a(getContext().getContentResolver()) == 0.0f) {
                this.f35596n.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().x().f();
            }
        }
    }

    public void r() {
        if (this.f35587e <= 0) {
            this.f35594l.run();
        } else {
            removeCallbacks(this.f35594l);
            postDelayed(this.f35594l, this.f35587e);
        }
    }

    public final void s() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u(this.f35597o);
            getIndeterminateDrawable().x().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().u(this.f35597o);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull com.google.android.material.progressindicator.a aVar) {
        this.f35590h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f35675c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f35675c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f35583a.f35608g = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            k kVar = (k) getCurrentDrawable();
            if (kVar != null) {
                kVar.j();
            }
            super.setIndeterminate(z10);
            k kVar2 = (k) getCurrentDrawable();
            if (kVar2 != null) {
                kVar2.s(t(), false, false);
            }
            if ((kVar2 instanceof n) && t()) {
                ((n) kVar2).x().g();
            }
            this.f35591i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35614m != f10) {
            cVar.f35614m = f10;
            getIndeterminateDrawable().x().c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof n) {
            ((k) drawable).j();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f35593k) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC6344a.b(getContext(), AbstractC5335a.f55008w, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f35583a.indicatorColors = iArr;
        getIndeterminateDrawable().x().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35609h != i10) {
            cVar.f35609h = i10;
            cVar.h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        q(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof j)) {
            if (this.f35593k) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            j jVar = (j) drawable;
            jVar.j();
            super.setProgressDrawable(jVar);
            jVar.L(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f35583a.f35607f = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35606e != i10) {
            cVar.f35606e = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35603b != i10) {
            cVar.f35603b = Math.min(i10, cVar.f35602a / 2);
            this.f35583a.f35605d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35604c != f10) {
            cVar.f35604c = Math.min(f10, 0.5f);
            this.f35583a.f35605d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35602a != i10) {
            cVar.f35602a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f35592j = i10;
    }

    public void setWaveAmplitude(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35612k != i10) {
            cVar.f35612k = Math.abs(i10);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i10) {
        this.f35583a.f35613l = i10;
        getProgressDrawable().J(this.f35583a.f35613l != 0);
    }

    public void setWavelength(int i10) {
        setWavelengthDeterminate(i10);
        setWavelengthIndeterminate(i10);
    }

    public void setWavelengthDeterminate(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35610i != i10) {
            cVar.f35610i = Math.abs(i10);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i10) {
        com.google.android.material.progressindicator.c cVar = this.f35583a;
        if (cVar.f35611j != i10) {
            cVar.f35611j = Math.abs(i10);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public boolean t() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && m();
    }

    @Override // android.widget.ProgressBar
    public n getIndeterminateDrawable() {
        return (n) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public j getProgressDrawable() {
        return (j) super.getProgressDrawable();
    }
}
