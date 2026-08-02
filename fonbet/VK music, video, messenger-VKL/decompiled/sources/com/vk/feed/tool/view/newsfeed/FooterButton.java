package com.vk.feed.tool.view.newsfeed;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.design.R$styleable;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.gp10;
import xsna.iut0;
import xsna.tr;

/* compiled from: FooterButton.kt */
/* loaded from: classes18.dex */
public final class FooterButton extends ViewGroup {
    public int b;

    /* compiled from: FooterButton.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
        public int a;
        public int b;
        public boolean c;
    }

    public FooterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int a(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a aVar = layoutParams instanceof a ? (a) layoutParams : null;
        return (aVar == null || (i = aVar.a) < 0) ? view.getMeasuredWidth() : i;
    }

    public static boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a aVar = layoutParams instanceof a ? (a) layoutParams : null;
        if (aVar != null) {
            return aVar.a >= 0 || aVar.b >= 0;
        }
        return false;
    }

    public static boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a aVar = layoutParams instanceof a ? (a) layoutParams : null;
        return aVar != null && aVar.c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-2, -2);
        aVar.a = -2;
        aVar.b = -2;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar.a = -2;
            aVar.b = -2;
            return aVar;
        }
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        a aVar2 = new a(layoutParams);
        aVar2.a = -2;
        aVar2.b = -2;
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        int marginStart;
        int marginEnd;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int i7 = ((measuredWidth - paddingLeft) - this.b) / 2;
        int i8 = measuredWidth - i7;
        int i9 = paddingLeft + i7;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int i10 = i9;
        int i11 = i8;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i13 = measuredHeight - paddingTop;
                if (b(childAt)) {
                    int measuredHeight3 = ((i4 - i2) - childAt.getMeasuredHeight()) / 2;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    i5 = measuredHeight3 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams != null) {
                        i6 = marginLayoutParams.bottomMargin;
                        int i14 = i5 - i6;
                        if (b(childAt)) {
                            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                            marginStart = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0;
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                            marginStart = (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() : 0) - ((childAt.getMeasuredWidth() - a(childAt)) / 2);
                        }
                        if (b(childAt)) {
                            ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                            marginEnd = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd() : 0;
                        } else {
                            ViewGroup.LayoutParams layoutParams6 = childAt.getLayoutParams();
                            marginEnd = ((childAt.getMeasuredWidth() - a(childAt)) / 2) + (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd() : 0);
                        }
                        int a2 = a(childAt) + marginStart + marginEnd;
                        if (!z2 && c(childAt)) {
                            int i15 = i8 - marginStart;
                            childAt.layout(i15 - childAt.getMeasuredWidth(), i14, i15, measuredHeight2 + i14);
                            i11 = Math.min(i11, i8 - a2);
                        } else if (!z2) {
                            int i16 = i11 - marginStart;
                            childAt.layout(i16 - childAt.getMeasuredWidth(), i14, i16, measuredHeight2 + i14);
                            i11 -= a2;
                        } else if (c(childAt)) {
                            int i17 = marginStart + i9;
                            childAt.layout(i17, i14, childAt.getMeasuredWidth() + i17, measuredHeight2 + i14);
                            i10 = Math.max(i10, a2 + i9);
                        } else {
                            int i18 = marginStart + i10;
                            childAt.layout(i18, i14, childAt.getMeasuredWidth() + i18, measuredHeight2 + i14);
                            i10 += a2;
                        }
                    }
                    i6 = 0;
                    int i142 = i5 - i6;
                    if (b(childAt)) {
                    }
                    if (b(childAt)) {
                    }
                    int a22 = a(childAt) + marginStart + marginEnd;
                    if (!z2) {
                    }
                    if (!z2) {
                    }
                } else {
                    int measuredHeight4 = ((i13 - childAt.getMeasuredHeight()) / 2) + paddingTop;
                    ViewGroup.LayoutParams layoutParams7 = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    i5 = measuredHeight4 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                    ViewGroup.LayoutParams layoutParams8 = childAt.getLayoutParams();
                    marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    if (marginLayoutParams != null) {
                        i6 = marginLayoutParams.bottomMargin;
                        int i1422 = i5 - i6;
                        if (b(childAt)) {
                        }
                        if (b(childAt)) {
                        }
                        int a222 = a(childAt) + marginStart + marginEnd;
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                    }
                    i6 = 0;
                    int i14222 = i5 - i6;
                    if (b(childAt)) {
                    }
                    if (b(childAt)) {
                    }
                    int a2222 = a(childAt) + marginStart + marginEnd;
                    if (!z2) {
                    }
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int measuredHeight;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int a2 = gp10.a(i, getSuggestedMinimumWidth(), Integer.MAX_VALUE, paddingRight);
        int a3 = gp10.a(i2, getSuggestedMinimumHeight(), Integer.MAX_VALUE, paddingBottom);
        this.b = 0;
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i5 = layoutParams.width;
                if (i5 >= 0) {
                    makeMeasureSpec = tr.a(i5, 1073741823, 0, 1073741824);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    a aVar = layoutParams2 instanceof a ? (a) layoutParams2 : null;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(a2 - (aVar == null ? 0 : aVar.getMarginEnd() + aVar.getMarginStart()), 1073741823)), Integer.MIN_VALUE);
                }
                int i6 = layoutParams.height;
                childAt.measure(makeMeasureSpec, i6 >= 0 ? tr.a(i6, 1073741823, 0, 1073741824) : tr.a(a3, 1073741823, 0, Integer.MIN_VALUE));
                int a4 = a(childAt);
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                a aVar2 = layoutParams3 instanceof a ? (a) layoutParams3 : null;
                int marginEnd = (aVar2 == null ? 0 : aVar2.getMarginEnd() + aVar2.getMarginStart()) + a4;
                if (c(childAt)) {
                    a2 = Math.max(a2, marginEnd);
                    this.b = Math.max(this.b, marginEnd);
                } else {
                    a2 -= marginEnd;
                    this.b += marginEnd;
                }
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                a aVar3 = layoutParams4 instanceof a ? (a) layoutParams4 : null;
                if (aVar3 == null || (measuredHeight = aVar3.b) < 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                }
                ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                a aVar4 = layoutParams5 instanceof a ? (a) layoutParams5 : null;
                i3 = Math.max(i3, measuredHeight + (aVar4 == null ? 0 : ((ViewGroup.MarginLayoutParams) aVar4).topMargin + ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin));
            }
        }
        setMeasuredDimension(Math.max(View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : this.b + paddingRight, getSuggestedMinimumWidth()), Math.max(i3 + paddingBottom, getSuggestedMinimumHeight()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.a = -2;
        aVar.b = -2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d);
        aVar.a = obtainStyledAttributes.getDimensionPixelSize(1, -2);
        aVar.b = obtainStyledAttributes.getDimensionPixelSize(0, -2);
        obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
        return aVar;
    }
}
