package com.google.android.flexbox;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes9.dex */
public final class e extends RecyclerView.n {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f57863c = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f57864a;

    /* renamed from: b, reason: collision with root package name */
    private int f57865b;

    public e(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f57863c);
        this.f57864a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f57865b = 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        int i11 = this.f57865b;
        if (!((i11 & 1) > 0) && (i11 & 2) <= 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<c> flexLines = flexboxLayoutManager.getFlexLines();
        int flexDirection = flexboxLayoutManager.getFlexDirection();
        int positionToFlexLineIndex = flexboxLayoutManager.getPositionToFlexLineIndex(childAdapterPosition);
        if ((positionToFlexLineIndex == -1 || positionToFlexLineIndex >= flexboxLayoutManager.getFlexLinesInternal().size() || flexboxLayoutManager.getFlexLinesInternal().get(positionToFlexLineIndex).f57850o != childAdapterPosition) && childAdapterPosition != 0 && (flexLines.size() == 0 || flexLines.get(flexLines.size() - 1).f57851p != childAdapterPosition - 1)) {
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                if ((this.f57865b & 2) <= 0) {
                    rect.left = 0;
                    rect.right = 0;
                } else if (flexboxLayoutManager.isLayoutRtl()) {
                    rect.right = this.f57864a.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.f57864a.getIntrinsicWidth();
                    rect.right = 0;
                }
            } else if ((this.f57865b & 1) <= 0) {
                rect.top = 0;
                rect.bottom = 0;
            } else if (flexDirection == 3) {
                rect.bottom = this.f57864a.getIntrinsicHeight();
                rect.top = 0;
            } else {
                rect.top = this.f57864a.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
        if (flexLines.size() == 0 || flexboxLayoutManager.getPositionToFlexLineIndex(childAdapterPosition) == 0) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if ((this.f57865b & 1) > 0) {
                rect.top = this.f57864a.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            } else {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
        }
        if ((this.f57865b & 2) > 0) {
            if (flexboxLayoutManager.isLayoutRtl()) {
                rect.right = this.f57864a.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.f57864a.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a11) {
        int left;
        int intrinsicWidth;
        int max;
        int bottom;
        int i11;
        int i12;
        int top;
        int intrinsicHeight;
        int left2;
        int right;
        int i13;
        int i14;
        int i15;
        if ((this.f57865b & 1) > 0) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight() + recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = recyclerView.getChildAt(i16);
                RecyclerView.p pVar = (RecyclerView.p) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
                    top = this.f57864a.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) pVar).topMargin;
                    intrinsicHeight = top - this.f57864a.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    left2 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
                    right = childAt.getRight();
                    i13 = ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
                } else if (flexboxLayoutManager.isLayoutRtl()) {
                    i15 = Math.min(this.f57864a.getIntrinsicWidth() + childAt.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, paddingRight);
                    i14 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
                    this.f57864a.setBounds(i14, intrinsicHeight, i15, top);
                    this.f57864a.draw(canvas);
                } else {
                    left2 = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) pVar).leftMargin) - this.f57864a.getIntrinsicWidth(), left3);
                    right = childAt.getRight();
                    i13 = ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
                }
                int i17 = right + i13;
                i14 = left2;
                i15 = i17;
                this.f57864a.setBounds(i14, intrinsicHeight, i15, top);
                this.f57864a.draw(canvas);
            }
        }
        if ((this.f57865b & 2) > 0) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom() + recyclerView.getBottom();
            int childCount2 = recyclerView.getChildCount();
            int flexDirection2 = flexboxLayoutManager2.getFlexDirection();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = recyclerView.getChildAt(i18);
                RecyclerView.p pVar2 = (RecyclerView.p) childAt2.getLayoutParams();
                if (flexboxLayoutManager2.isLayoutRtl()) {
                    intrinsicWidth = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) pVar2).rightMargin;
                    left = this.f57864a.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt2.getLeft() - ((ViewGroup.MarginLayoutParams) pVar2).leftMargin;
                    intrinsicWidth = left - this.f57864a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager2.isMainAxisDirectionHorizontal()) {
                    max = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) pVar2).topMargin;
                    bottom = childAt2.getBottom();
                    i11 = ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin;
                } else if (flexDirection2 == 3) {
                    int min = Math.min(this.f57864a.getIntrinsicHeight() + childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin, paddingBottom);
                    max = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) pVar2).topMargin;
                    i12 = min;
                    this.f57864a.setBounds(intrinsicWidth, max, left, i12);
                    this.f57864a.draw(canvas);
                } else {
                    max = Math.max((childAt2.getTop() - ((ViewGroup.MarginLayoutParams) pVar2).topMargin) - this.f57864a.getIntrinsicHeight(), top2);
                    bottom = childAt2.getBottom();
                    i11 = ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin;
                }
                i12 = bottom + i11;
                this.f57864a.setBounds(intrinsicWidth, max, left, i12);
                this.f57864a.draw(canvas);
            }
        }
    }

    public final void setDrawable(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f57864a = drawable;
    }

    public final void setOrientation(int i11) {
        this.f57865b = 1;
    }
}
