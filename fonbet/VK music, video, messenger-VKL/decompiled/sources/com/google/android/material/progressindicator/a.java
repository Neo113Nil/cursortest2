package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.br2;
import xsna.dm10;
import xsna.fpo0;
import xsna.h5m;
import xsna.iut0;
import xsna.lf2;
import xsna.ptw;
import xsna.qlo;
import xsna.tl6;
import xsna.xko;
import xsna.zm10;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes13.dex */
public abstract class a<S extends tl6> extends ProgressBar {
    public static final int n = R$style.Widget_MaterialComponents_ProgressIndicator;
    public final S b;
    public int c;
    public boolean d;
    public final boolean e;
    public final int f;
    public br2 g;
    public boolean h;
    public int i;
    public final RunnableC0122a j;
    public final b k;
    public final c l;
    public final d m;

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    public class RunnableC0122a implements Runnable {
        public RunnableC0122a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f > 0) {
                SystemClock.uptimeMillis();
            }
            aVar.setVisibility(0);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            ((xko) aVar.getCurrentDrawable()).c(false, false, true);
            if ((aVar.getProgressDrawable() == null || !aVar.getProgressDrawable().isVisible()) && (aVar.getIndeterminateDrawable() == null || !aVar.getIndeterminateDrawable().isVisible())) {
                aVar.setVisibility(4);
            }
            aVar.getClass();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class c extends lf2 {
        public c() {
        }

        @Override // xsna.lf2
        public final void a(Drawable drawable) {
            a aVar = a.this;
            aVar.setIndeterminate(false);
            aVar.b(aVar.c, aVar.d);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    public class d extends lf2 {
        public d() {
        }

        @Override // xsna.lf2
        public final void a(Drawable drawable) {
            a aVar = a.this;
            if (aVar.h) {
                return;
            }
            aVar.setVisibility(aVar.i);
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(zm10.a(context, attributeSet, i, n), attributeSet, i);
        this.h = false;
        this.i = 4;
        this.j = new RunnableC0122a();
        this.k = new b();
        this.l = new c();
        this.m = new d();
        Context context2 = getContext();
        this.b = a(context2, attributeSet);
        int[] iArr = R$styleable.BaseProgressIndicator;
        fpo0.a(context2, attributeSet, i, i2);
        fpo0.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        obtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_showDelay, -1);
        this.f = Math.min(obtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        obtainStyledAttributes.recycle();
        this.g = new br2();
        this.e = true;
    }

    @Nullable
    private qlo<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m;
    }

    public abstract S a(@NonNull Context context, @NonNull AttributeSet attributeSet);

    public void b(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.c = i;
            this.d = z;
            this.h = true;
            if (getIndeterminateDrawable().isVisible()) {
                br2 br2Var = this.g;
                ContentResolver contentResolver = getContext().getContentResolver();
                br2Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    getIndeterminateDrawable().n.e();
                    return;
                }
            }
            this.l.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
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

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.b.f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.b.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.b.g;
    }

    public int getShowAnimationBehavior() {
        return this.b.e;
    }

    public int getTrackColor() {
        return this.b.d;
    }

    public int getTrackCornerRadius() {
        return this.b.b;
    }

    public int getTrackThickness() {
        return this.b.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().n.d(this.l);
        }
        h5m<S> progressDrawable = getProgressDrawable();
        d dVar = this.m;
        if (progressDrawable != null) {
            h5m<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.g == null) {
                progressDrawable2.g = new ArrayList();
            }
            if (!progressDrawable2.g.contains(dVar)) {
                progressDrawable2.g.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            ptw<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.g == null) {
                indeterminateDrawable.g = new ArrayList();
            }
            if (!indeterminateDrawable.g.contains(dVar)) {
                indeterminateDrawable.g.add(dVar);
            }
        }
        if (c()) {
            if (this.f > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k);
        removeCallbacks(this.j);
        ((xko) getCurrentDrawable()).c(false, false, false);
        ptw<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.m;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(dVar);
            getIndeterminateDrawable().n.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(@NonNull Canvas canvas) {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            qlo<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.e) {
            ((xko) getCurrentDrawable()).c(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.e) {
            ((xko) getCurrentDrawable()).c(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull br2 br2Var) {
        this.g = br2Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().d = br2Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().d = br2Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.b.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            xko xkoVar = (xko) getCurrentDrawable();
            if (xkoVar != null) {
                xkoVar.c(false, false, false);
            }
            super.setIndeterminate(z);
            xko xkoVar2 = (xko) getCurrentDrawable();
            if (xkoVar2 != null) {
                xkoVar2.c(c(), false, false);
            }
            if ((xkoVar2 instanceof ptw) && c()) {
                ((ptw) xkoVar2).n.f();
            }
            this.h = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof ptw)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((xko) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{dm10.b(R$attr.colorPrimary, -1, getContext())};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.b.c = iArr;
        getIndeterminateDrawable().n.c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        S s = this.b;
        if (s.g != i) {
            s.g = i;
            s.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof h5m)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            h5m h5mVar = (h5m) drawable;
            h5mVar.c(false, false, false);
            super.setProgressDrawable(h5mVar);
            h5mVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.b.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.b;
        if (s.d != i) {
            s.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.b;
        if (s.b != i) {
            s.b = Math.min(i, s.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        S s = this.b;
        if (s.a != i) {
            s.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.i = i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ptw<S> getIndeterminateDrawable() {
        return (ptw) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public h5m<S> getProgressDrawable() {
        return (h5m) super.getProgressDrawable();
    }
}
