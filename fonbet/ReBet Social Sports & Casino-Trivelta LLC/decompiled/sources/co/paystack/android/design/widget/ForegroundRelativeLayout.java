package co.paystack.android.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
class ForegroundRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f27901a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f27902b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27903c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27904d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f27905e;

    /* renamed from: f, reason: collision with root package name */
    public int f27906f;

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f27905e;
        if (drawable != null) {
            if (this.f27904d) {
                this.f27904d = false;
                Rect rect = this.f27901a;
                Rect rect2 = this.f27902b;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f27903c) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f27906f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f27905e;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f27905e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f27905e.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f27905e;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f27906f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f27905e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f27904d = true;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f27904d = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f27905e;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f27905e);
            }
            this.f27905e = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f27906f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f27906f != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f27906f = i10;
            if (i10 == 119 && this.f27905e != null) {
                this.f27905e.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27905e;
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27901a = new Rect();
        this.f27902b = new Rect();
        this.f27903c = true;
        this.f27904d = false;
        this.f27906f = 119;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.ForegroundView, i10, 0);
        this.f27906f = obtainStyledAttributes.getInt(f.f27994b, this.f27906f);
        Drawable drawable = obtainStyledAttributes.getDrawable(f.f27993a);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f27903c = obtainStyledAttributes.getBoolean(f.f27995c, true);
        obtainStyledAttributes.recycle();
    }
}
