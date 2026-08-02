package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16800a;

    /* renamed from: b, reason: collision with root package name */
    public View f16801b;

    /* renamed from: c, reason: collision with root package name */
    public View f16802c;

    /* renamed from: d, reason: collision with root package name */
    public View f16803d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f16804e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f16805f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f16806g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16807h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16808i;

    /* renamed from: j, reason: collision with root package name */
    public int f16809j;

    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2047b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.j.ActionBar);
        this.f16804e = obtainStyledAttributes.getDrawable(l.j.f55270a);
        this.f16805f = obtainStyledAttributes.getDrawable(l.j.f55280c);
        this.f16809j = obtainStyledAttributes.getDimensionPixelSize(l.j.f55310i, -1);
        boolean z10 = true;
        if (getId() == l.f.f55087I) {
            this.f16807h = true;
            this.f16806g = obtainStyledAttributes.getDrawable(l.j.f55275b);
        }
        obtainStyledAttributes.recycle();
        if (!this.f16807h ? this.f16804e != null || this.f16805f != null : this.f16806g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16804e;
        if (drawable != null && drawable.isStateful()) {
            this.f16804e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f16805f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f16805f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f16806g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f16806g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f16801b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16804e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f16805f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f16806g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f16802c = findViewById(l.f.f55096a);
        this.f16803d = findViewById(l.f.f55102g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f16800a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f16801b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f16807h) {
            Drawable drawable2 = this.f16806g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f16804e != null) {
                if (this.f16802c.getVisibility() == 0) {
                    this.f16804e.setBounds(this.f16802c.getLeft(), this.f16802c.getTop(), this.f16802c.getRight(), this.f16802c.getBottom());
                } else {
                    View view2 = this.f16803d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f16804e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f16804e.setBounds(this.f16803d.getLeft(), this.f16803d.getTop(), this.f16803d.getRight(), this.f16803d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f16808i = z13;
            if (z13 && (drawable = this.f16805f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f16802c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f16809j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f16802c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f16801b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f16802c) ? a(this.f16802c) : !b(this.f16803d) ? a(this.f16803d) : 0) + a(this.f16801b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f16804e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f16804e);
        }
        this.f16804e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f16802c;
            if (view != null) {
                this.f16804e.setBounds(view.getLeft(), this.f16802c.getTop(), this.f16802c.getRight(), this.f16802c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f16807h ? !(this.f16804e != null || this.f16805f != null) : this.f16806g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f16806g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f16806g);
        }
        this.f16806g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f16807h && (drawable2 = this.f16806g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f16807h ? !(this.f16804e != null || this.f16805f != null) : this.f16806g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f16805f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f16805f);
        }
        this.f16805f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f16808i && (drawable2 = this.f16805f) != null) {
                drawable2.setBounds(this.f16801b.getLeft(), this.f16801b.getTop(), this.f16801b.getRight(), this.f16801b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f16807h ? !(this.f16804e != null || this.f16805f != null) : this.f16806g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(T t10) {
        View view = this.f16801b;
        if (view != null) {
            removeView(view);
        }
        this.f16801b = t10;
    }

    public void setTransitioning(boolean z10) {
        this.f16800a = z10;
        setDescendantFocusability(z10 ? 393216 : PKIFailureInfo.transactionIdInUse);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f16804e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f16805f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f16806g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f16804e && !this.f16807h) {
            return true;
        }
        if (drawable == this.f16805f && this.f16808i) {
            return true;
        }
        return (drawable == this.f16806g && this.f16807h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
