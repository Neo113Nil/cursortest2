package com.vk.core.tool.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.vk.core.view.components.extra.R$styleable;
import xsna.efz;
import xsna.lhg;
import xsna.lr;
import xsna.x9;

/* loaded from: classes17.dex */
public class FluidHorizontalLayout extends ViewGroup {
    public int b;
    public int c;
    public int d;
    public int e;

    @Nullable
    public View f;

    public static class a extends ViewGroup.MarginLayoutParams {
        public boolean a;
        public boolean b;
        public final boolean c;
        public int d;
        public boolean e;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            if (attributeSet == null) {
                this.a = false;
                this.b = false;
                this.d = 0;
                this.e = false;
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
            this.a = obtainStyledAttributes.getBoolean(3, false);
            this.b = obtainStyledAttributes.getBoolean(2, false);
            this.c = obtainStyledAttributes.getBoolean(4, false);
            this.d = obtainStyledAttributes.getInt(0, 0);
            this.e = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public FluidHorizontalLayout(Context context) {
        super(context);
        this.d = 0;
        this.e = 0;
        this.f = null;
        f(context, null, 0, 0);
    }

    public static int e(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (size < i2 || size < i3) ? size : Math.max(i2, Math.min(i3, Integer.MAX_VALUE));
        }
        if (mode != 0) {
            if (mode == 1073741824) {
                return size;
            }
            throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
        }
        if (i3 < i2) {
            return i2;
        }
        if (i3 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static void g(View view, a aVar, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int measuredHeight = view.getMeasuredHeight();
        int i6 = aVar.d & 112;
        if (i6 == 16 || i6 == 17) {
            int b = x9.b(i5, measuredHeight, 2, i2) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            view.layout(i, b, i3, measuredHeight + b);
        } else if (i6 != 80) {
            view.layout(i, i2, i3, measuredHeight + i2);
        } else {
            view.layout(i, i4 - measuredHeight, i3, i4);
        }
    }

    public final void a() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (((a) getChildAt(i2).getLayoutParams()).a) {
                i++;
            }
        }
        if (i > 1) {
            throw new IllegalStateException(lhg.a(i, "This layout supports only one fluid layout. Found: "));
        }
    }

    public int b() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                i = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i;
            }
        }
        return i;
    }

    public final View c() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (((a) childAt.getLayoutParams()).a) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final View d(int i, int i2) {
        int childCount = getChildCount();
        if (childCount != 0) {
            return i2 == 0 ? getChildAt(i) : getChildAt((getChildCount() - 1) - i);
        }
        throw new IllegalArgumentException(efz.a(i, childCount, "view position ", " is out of bound. Size: "));
    }

    public final void f(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, i, i2);
        setGravity(obtainStyledAttributes.getInt(0, 0));
        setOrder(obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int paddingLeft;
        int b;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int paddingLeft2 = this.c == 0 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        if (this.c == 0) {
            measuredWidth = getMeasuredWidth();
            paddingLeft = getPaddingRight();
        } else {
            measuredWidth = getMeasuredWidth();
            paddingLeft = getPaddingLeft();
        }
        int i12 = measuredWidth - paddingLeft;
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int childCount = getChildCount();
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(this.b, layoutDirection);
        if (absoluteGravity != 1) {
            if (absoluteGravity == 5) {
                b = i12 - b();
            } else if (absoluteGravity != 17) {
                b = paddingLeft2;
            }
            i5 = i12 - paddingLeft2;
            i6 = this.d + this.e;
            if (i5 < i6) {
                i12 += i6 - i5;
            }
            for (i7 = 0; i7 < childCount; i7++) {
                View d = d(i7, this.c);
                a aVar = (a) d.getLayoutParams();
                if (d.getVisibility() != 8) {
                    int marginStart = this.c == 0 ? aVar.getMarginStart() : aVar.getMarginEnd();
                    int marginEnd = this.c == 0 ? aVar.getMarginEnd() : aVar.getMarginStart();
                    if ((Gravity.getAbsoluteGravity(aVar.d, layoutDirection) & 7) == 5) {
                        int i13 = i12 - marginEnd;
                        i9 = i13 - d.getMeasuredWidth();
                        i8 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                        i10 = measuredHeight - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        i11 = i13;
                        i12 = i9 - marginStart;
                    } else {
                        int i14 = b + marginStart;
                        i8 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        int measuredWidth2 = d.getMeasuredWidth() + i14;
                        int i15 = marginEnd + measuredWidth2;
                        i9 = i14;
                        b = i15;
                        i10 = measuredHeight - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        i11 = measuredWidth2;
                    }
                    if (aVar.e) {
                        View view = this.f;
                        if (view != null) {
                            int measuredHeight2 = d.getMeasuredHeight();
                            int bottom = view.getBottom() - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            d.layout(i9, bottom - measuredHeight2, i11, bottom);
                        } else {
                            g(d, aVar, i9, i8, i11, i10);
                        }
                    } else {
                        g(d, aVar, i9, i8, i11, i10);
                    }
                }
            }
        }
        b = ((i12 - paddingLeft2) / 2) - (b() / 2);
        i5 = i12 - paddingLeft2;
        i6 = this.d + this.e;
        if (i5 < i6) {
        }
        while (i7 < childCount) {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int max;
        a();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int childCount = getChildCount();
        this.f = null;
        this.d = 0;
        this.e = 0;
        int layoutDirection = getLayoutDirection();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < childCount) {
            int i15 = i10;
            View childAt = getChildAt(i12);
            if (childAt != null) {
                a aVar = (a) childAt.getLayoutParams();
                if (childAt.getVisibility() != 8) {
                    if (aVar.a) {
                        i6 = i15;
                        i7 = paddingBottom;
                        i8 = childCount;
                        i9 = i11;
                        this.f = childAt;
                        i10 = i6;
                        i11 = i9;
                        i12++;
                        paddingBottom = i7;
                        childCount = i8;
                    } else {
                        i7 = paddingBottom;
                        i8 = childCount;
                        i9 = i11;
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                        if (aVar.b) {
                            i14 += childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            i9 = Math.max(i9, childAt.getMeasuredHeight());
                            max = i15;
                        } else {
                            i13 += childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            max = Math.max(i15, childAt.getMeasuredHeight());
                        }
                        if ((Gravity.getAbsoluteGravity(aVar.d, layoutDirection) & 7) == 5) {
                            this.e = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + this.e;
                        } else {
                            this.d = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + this.d;
                        }
                        i10 = max;
                        i11 = i9;
                        i12++;
                        paddingBottom = i7;
                        childCount = i8;
                    }
                }
            }
            i6 = i15;
            i7 = paddingBottom;
            i8 = childCount;
            i9 = i11;
            i10 = i6;
            i11 = i9;
            i12++;
            paddingBottom = i7;
            childCount = i8;
        }
        int i16 = i10;
        int i17 = paddingBottom;
        int i18 = i11;
        View view = this.f;
        if (view != null) {
            a aVar2 = (a) view.getLayoutParams();
            i3 = i13;
            measureChildWithMargins(this.f, i, i3, i2, 0);
            i4 = this.f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
            i5 = this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
        } else {
            i3 = i13;
            i4 = 0;
            i5 = 0;
        }
        setMeasuredDimension(e(i, suggestedMinimumWidth, lr.a(paddingRight, i3, i4, i14)), e(i2, suggestedMinimumHeight, Math.max(Math.max(i16, i5), i18) + i17));
    }

    public void setGravity(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
            invalidate();
        }
    }

    public void setOrder(int i) {
        boolean z = getResources().getConfiguration().getLayoutDirection() == 0;
        if (i != 0 || !z) {
            i = 1;
        }
        if (this.c != i) {
            this.c = i;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public FluidHorizontalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = 0;
        this.e = 0;
        this.f = null;
        f(context, attributeSet, 0, 0);
    }

    public FluidHorizontalLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = 0;
        this.f = null;
        f(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public FluidHorizontalLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = 0;
        this.e = 0;
        this.f = null;
        f(context, attributeSet, i, i2);
    }
}
