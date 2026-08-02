package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f562a;

    /* renamed from: b, reason: collision with root package name */
    public View f563b;

    /* renamed from: c, reason: collision with root package name */
    public View f564c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f565d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f566e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f567f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f568g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f569h;

    /* renamed from: i, reason: collision with root package name */
    public final int f570i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(0, this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f10830a);
        boolean z5 = false;
        this.f565d = obtainStyledAttributes.getDrawable(0);
        this.f566e = obtainStyledAttributes.getDrawable(2);
        this.f570i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f568g = true;
            this.f567f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f568g ? !(this.f565d != null || this.f566e != null) : this.f567f == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f565d;
        if (drawable != null && drawable.isStateful()) {
            this.f565d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f566e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f566e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f567f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f567f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f565d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f566e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f567f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f563b = findViewById(R.id.action_bar);
        this.f564c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f562a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        boolean z7 = true;
        if (this.f568g) {
            Drawable drawable = this.f567f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f565d == null) {
                z7 = false;
            } else if (this.f563b.getVisibility() == 0) {
                this.f565d.setBounds(this.f563b.getLeft(), this.f563b.getTop(), this.f563b.getRight(), this.f563b.getBottom());
            } else {
                View view = this.f564c;
                if (view == null || view.getVisibility() != 0) {
                    this.f565d.setBounds(0, 0, 0, 0);
                } else {
                    this.f565d.setBounds(this.f564c.getLeft(), this.f564c.getTop(), this.f564c.getRight(), this.f564c.getBottom());
                }
            }
            this.f569h = false;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        if (this.f563b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f570i) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i5, i10);
        if (this.f563b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f565d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f565d);
        }
        this.f565d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f563b;
            if (view != null) {
                this.f565d.setBounds(view.getLeft(), this.f563b.getTop(), this.f563b.getRight(), this.f563b.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f568g ? !(this.f565d != null || this.f566e != null) : this.f567f == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f567f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f567f);
        }
        this.f567f = drawable;
        boolean z5 = this.f568g;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f567f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f565d != null || this.f566e != null) : this.f567f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f566e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f566e);
        }
        this.f566e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f569h && this.f566e != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f568g ? !(this.f565d != null || this.f566e != null) : this.f567f == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z5) {
        this.f562a = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.f565d;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f566e;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f567f;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f565d;
        boolean z5 = this.f568g;
        if (drawable == drawable2 && !z5) {
            return true;
        }
        if (drawable == this.f566e && this.f569h) {
            return true;
        }
        return (drawable == this.f567f && z5) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return super.startActionModeForChild(view, callback, i5);
        }
        return null;
    }

    public void setTabContainer(d3 d3Var) {
    }
}
