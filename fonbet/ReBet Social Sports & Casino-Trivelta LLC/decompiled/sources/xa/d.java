package xa;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes3.dex */
public abstract class d extends LinearLayoutCompat {

    /* renamed from: n, reason: collision with root package name */
    public Drawable f68052n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f68053o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f68054p;

    /* renamed from: q, reason: collision with root package name */
    public int f68055q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f68056r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f68057s;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68053o = new Rect();
        this.f68054p = new Rect();
        this.f68055q = 119;
        this.f68056r = true;
        this.f68057s = false;
        TypedArray i11 = l.i(context, attributeSet, ia.m.ForegroundLinearLayout, i10, 0, new int[0]);
        this.f68055q = i11.getInt(ia.m.f48631E2, this.f68055q);
        Drawable drawable = i11.getDrawable(ia.m.f48621D2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f68056r = i11.getBoolean(ia.m.f48641F2, true);
        i11.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f68052n;
        if (drawable != null) {
            if (this.f68057s) {
                this.f68057s = false;
                Rect rect = this.f68053o;
                Rect rect2 = this.f68054p;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f68056r) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f68055q, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f68052n;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f68052n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f68052n.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f68052n;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f68055q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f68052n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f68057s = z10 | this.f68057s;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f68057s = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f68052n;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f68052n);
            }
            this.f68052n = drawable;
            this.f68057s = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f68055q == 119) {
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
        if (this.f68055q != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f68055q = i10;
            if (i10 == 119 && this.f68052n != null) {
                this.f68052n.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f68052n;
    }
}
