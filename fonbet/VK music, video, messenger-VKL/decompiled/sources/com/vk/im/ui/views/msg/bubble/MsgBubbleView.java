package com.vk.im.ui.views.msg.bubble;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.aj30;
import xsna.bwt0;
import xsna.dgn;
import xsna.hp10;
import xsna.hux0;
import xsna.lhg;
import xsna.mh30;
import xsna.oh30;
import xsna.sho;

/* loaded from: classes2.dex */
public class MsgBubbleView extends ViewGroup implements sho {
    public mh30 b;
    public oh30 c;
    public MsgBubblePart d;
    public Rect e;
    public aj30 f;
    public Rect g;
    public boolean h;
    public Rect i;
    public Rect j;
    public int k;
    public int l;
    public WeakReference<sho.a> m;

    public MsgBubbleView(Context context) {
        super(context);
        this.c = oh30.F;
        a(context, null, 0, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        mh30 mh30Var = new mh30(context);
        this.b = mh30Var;
        mh30Var.setCallback(this);
        this.e = new Rect();
        aj30 aj30Var = new aj30();
        this.f = aj30Var;
        aj30Var.setCallback(this);
        this.g = new Rect();
        this.h = false;
        this.i = new Rect();
        this.j = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.o, i, i2);
        setMaximumWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setFwdPaddingLeft(obtainStyledAttributes.getDimensionPixelSize(12, 0));
        setFwdPaddingTop(obtainStyledAttributes.getDimensionPixelSize(14, 0));
        setFwdPaddingRight(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        setFwdPaddingBottom(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        setFwdNestLevel(obtainStyledAttributes.getInteger(7, 0));
        setFwdNestLineWidth(obtainStyledAttributes.getDimensionPixelSize(10, 4));
        setFwdNestLineSpace(obtainStyledAttributes.getDimensionPixelSize(9, 4));
        setFwdNestLineColor(obtainStyledAttributes.getColor(8, 4));
        setContentFitAllWidth(obtainStyledAttributes.getBoolean(2, false));
        setContentPaddingLeft(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        setContentPaddingTop(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        setContentPaddingRight(obtainStyledAttributes.getDimensionPixelSize(5, 0));
        setContentPaddingBottom(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public final void b(oh30 oh30Var, MsgBubblePart msgBubblePart, int i, boolean z) {
        this.c = oh30Var;
        this.d = msgBubblePart;
        bwt0.Q(this, R.id.autotests_linked_bubble, Boolean.valueOf(oh30Var.j));
        this.b.a(oh30Var, msgBubblePart, i);
        TimeAndStatusView timeAndStatusView = (TimeAndStatusView) findViewById(R.id.timeAndStatus);
        if (timeAndStatusView != null) {
            timeAndStatusView.setGradientBubble(z);
        } else if (getChildCount() == 1 && (getChildAt(0) instanceof hux0)) {
            ((hux0) getChildAt(0)).getTimeAndStatusView().setGradientBubble(z);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c.g) {
            this.b.draw(canvas);
        }
    }

    public Rect getBubbleDrawableExtraPadding() {
        oh30 oh30Var = this.c;
        return oh30Var.c.i(this.d);
    }

    public Rect getBubbleDrawablePadding() {
        oh30 oh30Var = this.c;
        return oh30Var.c.e(this.d);
    }

    public oh30 getBubbleStyle() {
        return this.c;
    }

    public int getMaximumHeight() {
        return this.l;
    }

    public int getMaximumWidth() {
        return this.k;
    }

    public Rect getStylePadding() {
        oh30 oh30Var = this.c;
        return oh30Var.c.j(this.d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        sho.a aVar;
        super.onDraw(canvas);
        if (!this.c.g) {
            this.b.draw(canvas);
        }
        this.f.draw(canvas);
        WeakReference<sho.a> weakReference = this.m;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.draw(canvas);
        }
        this.m = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        Rect rect = this.e;
        int i5 = rect.left + paddingLeft;
        int i6 = rect.top + paddingTop;
        int i7 = rect.right;
        int i8 = measuredHeight - rect.bottom;
        Rect bubbleDrawableExtraPadding = getBubbleDrawableExtraPadding();
        int i9 = paddingLeft + bubbleDrawableExtraPadding.left;
        Rect rect2 = this.j;
        this.b.setBounds(i9 + rect2.left, paddingTop + bubbleDrawableExtraPadding.top + rect2.top, measuredWidth + bubbleDrawableExtraPadding.right + rect2.right, measuredHeight + bubbleDrawableExtraPadding.bottom + rect2.bottom);
        Rect rect3 = this.g;
        int i10 = i5 + rect3.left;
        this.f.setBounds(i10, rect3.top + i6, this.f.getIntrinsicWidth() + i10, i8 - this.g.bottom);
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int i11 = this.f.getBounds().right + this.g.right;
        Rect rect4 = this.i;
        int i12 = i11 + rect4.left;
        int i13 = i6 + rect4.top;
        dgn.b(childAt, i13, i12, i13, childAt.getMeasuredWidth() + i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int d;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int maximumWidth = getMaximumWidth();
        int maximumHeight = getMaximumHeight();
        int a = hp10.a(i, suggestedMinimumWidth, maximumWidth, paddingRight);
        int a2 = hp10.a(i2, suggestedMinimumHeight, maximumHeight, paddingBottom);
        this.b.getPadding(this.e);
        Rect rect = this.e;
        int i9 = rect.left + rect.right;
        int i10 = rect.top + rect.bottom;
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt == null || childAt.getVisibility() == 8) {
            i3 = i9;
            i4 = 0;
            i5 = 0;
        } else {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i11 = a - i9;
            Rect rect2 = this.g;
            int intrinsicWidth = ((i11 - rect2.left) - rect2.right) - this.f.getIntrinsicWidth();
            Rect rect3 = this.i;
            int max = Math.max(0, (intrinsicWidth - rect3.left) - rect3.right);
            Rect rect4 = this.i;
            i3 = i9;
            int max2 = Math.max(0, ((a2 - i10) - rect4.top) - rect4.bottom);
            if (layoutParams != null && (i8 = layoutParams.width) >= 0) {
                i6 = hp10.d(i8);
            } else if (layoutParams != null && layoutParams.width == -1) {
                i6 = hp10.d(Math.min(Math.min(size, maximumWidth), max));
            } else if (mode == 1073741824) {
                i6 = hp10.d(max);
            } else {
                if (mode == Integer.MIN_VALUE) {
                    int min = Math.min(Math.min(size, maximumWidth), max);
                    d = this.h ? hp10.d(min) : hp10.c(min);
                } else {
                    int min2 = Math.min(maximumWidth, max);
                    d = this.h ? hp10.d(min2) : hp10.c(min2);
                }
                i6 = d;
            }
            childAt.measure(i6, (layoutParams == null || (i7 = layoutParams.height) < 0) ? (layoutParams == null || layoutParams.height != -1) ? mode2 == 1073741824 ? hp10.d(max2) : mode2 == Integer.MIN_VALUE ? hp10.c(Math.min(Math.min(size2, maximumHeight), max2)) : hp10.c(Math.min(maximumHeight, max2)) : hp10.c(Math.min(Math.min(size2, maximumHeight), max2)) : hp10.d(i7));
            int measuredWidth = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
            i5 = measuredWidth;
        }
        Rect rect5 = this.g;
        int intrinsicWidth2 = this.f.getIntrinsicWidth() + paddingRight + i3 + rect5.left + rect5.right;
        Rect rect6 = this.i;
        setMeasuredDimension(hp10.b(i, suggestedMinimumWidth, maximumWidth, intrinsicWidth2 + rect6.left + rect6.right + i5), hp10.b(i2, suggestedMinimumHeight, maximumHeight, paddingBottom + i10 + rect6.top + rect6.bottom + i4));
    }

    public void setBackgroundMargin(Rect rect) {
        this.j = rect;
        requestLayout();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        throw new IllegalStateException();
    }

    public void setContentFitAllWidth(boolean z) {
        this.h = z;
        requestLayout();
        invalidate();
    }

    public void setContentPadding(Rect rect) {
        this.i.set(rect);
        requestLayout();
        invalidate();
    }

    public void setContentPaddingBottom(int i) {
        this.i.bottom = i;
        requestLayout();
        invalidate();
    }

    public void setContentPaddingLeft(int i) {
        this.i.left = i;
        requestLayout();
        invalidate();
    }

    public void setContentPaddingRight(int i) {
        this.i.right = i;
        requestLayout();
        invalidate();
    }

    public void setContentPaddingTop(int i) {
        this.i.top = i;
        requestLayout();
        invalidate();
    }

    public void setContentView(View view) {
        removeAllViews();
        if (view != null) {
            addView(view);
        }
    }

    public void setFwdNestLevel(int i) {
        aj30 aj30Var = this.f;
        if (i < 0) {
            aj30Var.getClass();
            throw new IllegalArgumentException(lhg.a(i, "level must be >= 0. Given: "));
        }
        if (aj30Var.c != i) {
            aj30Var.c = i;
            aj30Var.invalidateSelf();
        }
        requestLayout();
        invalidate();
    }

    public void setFwdNestLineColor(int i) {
        aj30 aj30Var = this.f;
        Paint paint = aj30Var.a;
        paint.setColor(i);
        paint.setAlpha(102);
        aj30Var.invalidateSelf();
        invalidate();
    }

    public void setFwdNestLineSpace(int i) {
        aj30 aj30Var = this.f;
        aj30Var.e = i;
        aj30Var.invalidateSelf();
        requestLayout();
        invalidate();
    }

    public void setFwdNestLineWidth(int i) {
        aj30 aj30Var = this.f;
        aj30Var.d = i;
        aj30Var.invalidateSelf();
        requestLayout();
        invalidate();
    }

    public void setFwdPadding(Rect rect) {
        this.g.set(rect);
        requestLayout();
        invalidate();
    }

    public void setFwdPaddingBottom(int i) {
        this.g.bottom = i;
        requestLayout();
        invalidate();
    }

    public void setFwdPaddingLeft(int i) {
        this.g.left = i;
        requestLayout();
        invalidate();
    }

    public void setFwdPaddingRight(int i) {
        this.g.right = i;
        requestLayout();
        invalidate();
    }

    public void setFwdPaddingTop(int i) {
        this.g.top = i;
        requestLayout();
        invalidate();
    }

    public void setMaximumHeight(int i) {
        this.l = i;
        requestLayout();
        invalidate();
    }

    public void setMaximumWidth(int i) {
        this.k = i;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return this.b == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public MsgBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = oh30.F;
        a(context, attributeSet, 0, 0);
    }

    public MsgBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = oh30.F;
        a(context, attributeSet, i, 0);
    }

    public MsgBubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = oh30.F;
        a(context, attributeSet, i, i2);
    }
}
