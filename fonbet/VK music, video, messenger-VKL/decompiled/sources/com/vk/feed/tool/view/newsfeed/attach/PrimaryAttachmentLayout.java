package com.vk.feed.tool.view.newsfeed.attach;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.j0;
import xsna.x9;

/* compiled from: PrimaryAttachmentLayout.kt */
/* loaded from: classes18.dex */
public final class PrimaryAttachmentLayout extends FrameLayout {
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public PrimaryAttachmentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final int getContentMaxWidth() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a;
        int i5;
        int i6;
        int a2;
        int i7;
        int i8;
        int i9;
        int i10;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int i11 = i3 - i;
        int i12 = this.c;
        int b = x9.b(i11, i12, 2, paddingLeft);
        int i13 = i12 + b;
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = layoutParams.gravity;
                if (i15 == -1) {
                    i15 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection());
                int i16 = i15 & 112;
                int i17 = absoluteGravity & 7;
                if (i17 != 1) {
                    if (i17 == 3) {
                        i10 = layoutParams.leftMargin;
                    } else if (i17 != 5) {
                        i10 = layoutParams.leftMargin;
                    } else {
                        a = i13 - measuredWidth;
                        i5 = layoutParams.rightMargin;
                    }
                    i6 = i10 + b;
                    if (i16 == 16) {
                        if (i16 == 48) {
                            i9 = layoutParams.topMargin;
                        } else if (i16 != 80) {
                            i9 = layoutParams.topMargin;
                        } else {
                            a2 = paddingBottom - measuredHeight;
                            i7 = layoutParams.bottomMargin;
                        }
                        i8 = i9 + paddingTop;
                        childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                    } else {
                        a2 = j0.a(paddingBottom, paddingTop, measuredHeight, 2, paddingTop) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    }
                    i8 = a2 - i7;
                    childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
                } else {
                    a = j0.a(i13, b, measuredWidth, 2, b) + layoutParams.leftMargin;
                    i5 = layoutParams.rightMargin;
                }
                i6 = a - i5;
                if (i16 == 16) {
                }
                i8 = a2 - i7;
                childAt.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int i3 = this.b;
        if (size <= i3) {
            i3 = size;
        }
        this.c = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int size2 = this.d ? -2 : this.e ? -1 : mode == 1073741824 ? View.MeasureSpec.getSize(i2) : getLayoutParams().height;
        super.onMeasure(makeMeasureSpec, size2 != -2 ? size2 != -1 ? size2 != 0 ? View.MeasureSpec.makeMeasureSpec(size2, 1073741824) : makeMeasureSpec : View.MeasureSpec.makeMeasureSpec(this.c, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(size, getMeasuredHeight());
    }

    public final void setContentMaxWidth(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public final void setHeightAtMostWidth(boolean z) {
        if (z != this.e) {
            this.e = z;
            requestLayout();
        }
    }

    public final void setHeightMatchContent(boolean z) {
        if (z != this.d) {
            this.d = z;
            requestLayout();
        }
    }
}
