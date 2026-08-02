package defpackage;

import android.animation.ValueAnimator;
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
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class k51 extends ProgressBar {
    public final l51 a;
    public int b;
    public final boolean c;
    public final int d;
    public long e;
    public l80 f;
    public boolean g;
    public int h;
    public boolean i;
    public final h51 j;
    public final i51 k;
    public final i51 l;
    public final j51 m;
    public final j51 n;

    public k51(Context context, AttributeSet attributeSet, int i, int i2) {
        super(oyn.U(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = -1L;
        this.g = false;
        this.h = 4;
        this.j = new h51(this, 0);
        this.k = new i51(this, 0);
        this.l = new i51(this, 1);
        this.m = new j51(0, this);
        this.n = new j51(1, this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        m6k.v(context2, attributeSet, i, i2);
        int[] iArr = pjf.d;
        m6k.w(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        obtainStyledAttributes.getInt(7, -1);
        this.d = Math.min(obtainStyledAttributes.getInt(5, -1), 1000);
        obtainStyledAttributes.recycle();
        this.f = new l80();
        this.c = true;
    }

    @Nullable
    private mb5 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().n;
    }

    public abstract l51 a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().o.z(this.m);
    }

    public void c(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.g = true;
            if (getIndeterminateDrawable().isVisible()) {
                l80 l80Var = this.f;
                ContentResolver contentResolver = getContext().getContentResolver();
                l80Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    getIndeterminateDrawable().o.A();
                    return;
                }
            }
            this.m.a(getIndeterminateDrawable());
        }
    }

    public final boolean d() {
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
        return this.a.h;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public v0a getIndeterminateDrawable() {
        return (v0a) super.getIndeterminateDrawable();
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.a.e;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public my4 getProgressDrawable() {
        return (my4) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.g;
    }

    public int getTrackColor() {
        return this.a.f;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.a.c;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public int getWaveAmplitude() {
        return this.a.l;
    }

    public int getWaveSpeed() {
        return this.a.m;
    }

    public int getWavelengthDeterminate() {
        return this.a.j;
    }

    public int getWavelengthIndeterminate() {
        return this.a.k;
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
        b();
        my4 progressDrawable = getProgressDrawable();
        j51 j51Var = this.n;
        if (progressDrawable != null) {
            my4 progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.g;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.g = arrayList;
            }
            if (!arrayList.contains(j51Var)) {
                progressDrawable2.g.add(j51Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            v0a indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.g;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.g = arrayList2;
            }
            if (!arrayList2.contains(j51Var)) {
                indeterminateDrawable.g.add(j51Var);
            }
        }
        if (d()) {
            if (this.d > 0) {
                this.e = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.l);
        removeCallbacks(this.k);
        ((hb5) getCurrentDrawable()).d(false, false, false);
        v0a indeterminateDrawable = getIndeterminateDrawable();
        j51 j51Var = this.n;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(j51Var);
            getIndeterminateDrawable().o.D();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(j51Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
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

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            mb5 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((hb5) getCurrentDrawable()).d(d(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((hb5) getCurrentDrawable()).d(d(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(@NonNull l80 l80Var) {
        this.f = l80Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = l80Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = l80Var;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        h51 h51Var = this.j;
        if (z) {
            ArrayList arrayList = getProgressDrawable().o.k;
            if (arrayList.contains(h51Var)) {
                return;
            }
            arrayList.add(h51Var);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().o.k;
        int indexOf = arrayList2.indexOf(h51Var);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            hb5 hb5Var = (hb5) getCurrentDrawable();
            if (hb5Var != null) {
                hb5Var.d(false, false, false);
            }
            super.setIndeterminate(z);
            hb5 hb5Var2 = (hb5) getCurrentDrawable();
            if (hb5Var2 != null) {
                hb5Var2.d(d(), false, false);
            }
            if ((hb5Var2 instanceof v0a) && d()) {
                ((v0a) hb5Var2).o.C();
            }
            this.g = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        l51 l51Var = this.a;
        if (l51Var.n != f) {
            l51Var.n = f;
            getIndeterminateDrawable().o.r();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof v0a) {
            ((hb5) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.i) {
            a70.p("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            Integer v = o3a.v(R.attr.colorPrimary, getContext());
            iArr = new int[]{v != null ? v.intValue() : -1};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.e = iArr;
        getIndeterminateDrawable().o.r();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        l51 l51Var = this.a;
        if (l51Var.i != i) {
            l51Var.i = i;
            l51Var.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        c(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof my4) {
            my4 my4Var = (my4) drawable;
            my4Var.d(false, false, false);
            super.setProgressDrawable(my4Var);
            my4Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.i) {
            a70.p("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        l51 l51Var = this.a;
        if (l51Var.f != i) {
            l51Var.f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        l51 l51Var = this.a;
        if (l51Var.b != i) {
            l51Var.b = Math.min(i, l51Var.a / 2);
            l51Var.d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        l51 l51Var = this.a;
        if (l51Var.c != f) {
            l51Var.c = Math.min(f, 0.5f);
            l51Var.d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        l51 l51Var = this.a;
        if (l51Var.a != i) {
            l51Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.h = i;
        } else {
            a70.p("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        l51 l51Var = this.a;
        if (l51Var.l != i) {
            l51Var.l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        my4 progressDrawable = getProgressDrawable();
        progressDrawable.b.p = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        my4 progressDrawable = getProgressDrawable();
        progressDrawable.b.o = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        l51 l51Var = this.a;
        l51Var.m = i;
        my4 progressDrawable = getProgressDrawable();
        boolean z = l51Var.m != 0;
        ValueAnimator valueAnimator = progressDrawable.s;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        l51 l51Var = this.a;
        if (l51Var.j != i) {
            l51Var.j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        l51 l51Var = this.a;
        if (l51Var.k != i) {
            l51Var.k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
