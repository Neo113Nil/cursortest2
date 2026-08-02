package com.vk.core.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Vector;
import xsna.iah0;

/* loaded from: classes17.dex */
public class FlowLayout extends ViewGroup {
    public final Vector<Integer> b;
    public final int c;
    public boolean d;

    public FlowLayout(Context context) {
        super(context);
        this.b = new Vector<>();
        this.c = iah0.a(5.0f);
        this.d = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(iah0.a(2.0f), iah0.a(2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int measuredHeight = this.d ? getMeasuredHeight() - getPaddingBottom() : getPaddingTop();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int i8 = aVar.c;
                if (i8 <= 0) {
                    i8 = childAt.getMeasuredWidth();
                }
                int i9 = aVar.d;
                if (i9 <= 0) {
                    i9 = childAt.getMeasuredHeight();
                }
                int i10 = paddingLeft + i8;
                int i11 = this.c + i5;
                Vector<Integer> vector = this.b;
                if (i10 > i11) {
                    paddingLeft = getPaddingLeft();
                    measuredHeight = this.d ? measuredHeight - vector.elementAt(i6).intValue() : vector.elementAt(i6).intValue() + measuredHeight;
                    i6++;
                }
                if (i7 == 0 && this.d && i6 < vector.size()) {
                    measuredHeight -= vector.elementAt(i6).intValue();
                }
                childAt.layout(paddingLeft, measuredHeight, paddingLeft + i8, i9 + measuredHeight);
                paddingLeft = i8 + aVar.a + paddingLeft;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0) {
            throw new AssertionError();
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i3 = 0;
        int makeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        Vector<Integer> vector = this.b;
        vector.clear();
        int max = Math.max(childCount, 0);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < max) {
            View childAt = getChildAt(i4);
            if ((childAt != null && childAt.getVisibility() != 8) || childAt == null) {
                childAt.getClass();
                a aVar = (a) childAt.getLayoutParams();
                if (childAt != null && aVar.c == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), makeMeasureSpec);
                } else if (childAt != null) {
                    int i7 = aVar.c;
                    childAt.measure(i7 <= 0 ? View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i7, 1073741824), makeMeasureSpec);
                }
                int i8 = aVar.c;
                if (i8 <= 0) {
                    i8 = childAt != null ? childAt.getMeasuredWidth() : size;
                }
                int i9 = aVar.d;
                if (i9 <= 0) {
                    i9 = childAt != null ? childAt.getMeasuredHeight() : 0;
                }
                if (paddingLeft + i8 > this.c + size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += Math.max(i5, 0);
                    vector.add(Integer.valueOf(Math.max(i5, 0)));
                    i5 = 0;
                }
                i5 = Math.max(i5, i9 + aVar.b);
                int i10 = aVar.a;
                int i11 = i8 + i10 + paddingLeft;
                i6 = Math.max(i6, i11 - i10);
                paddingLeft = i11;
            }
            i4++;
            i3 = 0;
        }
        int i12 = i3;
        vector.add(Integer.valueOf(Math.max(i5, i12)));
        if (View.MeasureSpec.getMode(i2) != 0) {
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && paddingTop + i5 < size2) {
                Iterator<Integer> it = vector.iterator();
                while (it.hasNext()) {
                    i12 += it.next().intValue();
                }
            }
            int max2 = Math.max(getPaddingBottom() + getPaddingTop() + size2, getSuggestedMinimumHeight());
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                setMeasuredDimension(Math.max(getPaddingRight() + getPaddingLeft() + size, getSuggestedMinimumWidth()), max2);
                return;
            } else {
                setMeasuredDimension(Math.max(getPaddingRight() + i6, getSuggestedMinimumWidth()), max2);
                return;
            }
        }
        Iterator<Integer> it2 = vector.iterator();
        while (it2.hasNext()) {
            i12 += it2.next().intValue();
        }
        size2 = i12;
        int max22 = Math.max(getPaddingBottom() + getPaddingTop() + size2, getSuggestedMinimumHeight());
        if (View.MeasureSpec.getMode(i) != 1073741824) {
        }
    }

    public void setRowsStartFromBottom(boolean z) {
        if (this.d != z) {
            this.d = z;
            requestLayout();
        }
    }

    public static class a extends ViewGroup.LayoutParams {
        public final int a;
        public final int b;
        public int c;
        public int d;

        public a(int i, int i2) {
            super(0, 0);
            this.a = i;
            this.b = i2;
        }

        public a() {
            super(0, 0);
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Vector<>();
        this.c = iah0.a(5.0f);
        this.d = false;
    }
}
