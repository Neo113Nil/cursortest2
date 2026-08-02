package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i5, int i10, int i11) {
        return i10 != Integer.MIN_VALUE ? i10 != 1073741824 ? i11 : i5 : Math.min(i11, i5);
    }

    private void loadFromAttributes(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_horizontalItemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean z7;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        boolean z10 = true;
        this.rowCount = 1;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = 0;
        int i16 = paddingRight;
        int i17 = paddingTop;
        while (i15 < getChildCount()) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z7 = z10;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.getMarginStart();
                    i13 = marginLayoutParams.getMarginEnd();
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i14;
                int i18 = i11 - i5;
                int i19 = i18 - paddingLeft;
                z7 = z10;
                if (!this.singleLine && measuredWidth > i19) {
                    measuredWidth = childAt.getMeasuredWidth() + paddingRight + i14;
                    i17 = paddingTop + this.lineSpacing;
                    this.rowCount++;
                    i16 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z11) {
                    childAt.layout(i18 - measuredWidth, i17, (i18 - i16) - i14, measuredHeight);
                } else {
                    childAt.layout(i16 + i14, i17, measuredWidth, measuredHeight);
                }
                i16 += childAt.getMeasuredWidth() + i14 + i13 + this.itemSpacing;
                paddingTop = measuredHeight;
            }
            i15++;
            z10 = z7;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i18 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i11 <= paddingRight || isSingleLine()) {
                    i13 = i18;
                } else {
                    i13 = getPaddingLeft();
                    i15 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i13 + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i11 + i12 + this.itemSpacing + i13;
                if (i17 == getChildCount() - 1) {
                    i16 += i12;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, getPaddingRight() + i16), getMeasuredDimension(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public void setItemSpacing(int i5) {
        this.itemSpacing = i5;
    }

    public void setLineSpacing(int i5) {
        this.lineSpacing = i5;
    }

    public void setSingleLine(boolean z5) {
        this.singleLine = z5;
    }

    public FlowLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    public FlowLayout(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
