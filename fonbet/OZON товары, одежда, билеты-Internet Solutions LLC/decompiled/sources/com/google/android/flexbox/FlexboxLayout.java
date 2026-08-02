package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.flexbox.d;
import e7.C6313a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class FlexboxLayout extends ViewGroup implements com.google.android.flexbox.a {
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<c> mFlexLines;
    private d.a mFlexLinesResult;
    private int mFlexWrap;
    private d mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean allFlexLinesAreDummyBefore(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.mFlexLines.get(i12).b() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i11, int i12) {
        for (int i13 = 1; i13 <= i12; i13++) {
            View reorderedChildAt = getReorderedChildAt(i11 - i13);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z11, boolean z12) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.mFlexLines.get(i11);
            for (int i12 = 0; i12 < cVar.f57843h; i12++) {
                int i13 = cVar.f57850o + i12;
                View reorderedChildAt = getReorderedChildAt(i13);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    a aVar = (a) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i13, i12)) {
                        drawVerticalDivider(canvas, z11 ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.mDividerVerticalWidth, cVar.f57837b, cVar.f57842g);
                    }
                    if (i12 == cVar.f57843h - 1 && (this.mShowDividerVertical & 4) > 0) {
                        drawVerticalDivider(canvas, z11 ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, cVar.f57837b, cVar.f57842g);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i11)) {
                drawHorizontalDivider(canvas, paddingLeft, z12 ? cVar.f57839d : cVar.f57837b - this.mDividerHorizontalHeight, max);
            }
            if (hasEndDividerAfterFlexLine(i11) && (this.mShowDividerHorizontal & 4) > 0) {
                drawHorizontalDivider(canvas, paddingLeft, z12 ? cVar.f57837b - this.mDividerHorizontalHeight : cVar.f57839d, max);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z11, boolean z12) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.mFlexLines.get(i11);
            for (int i12 = 0; i12 < cVar.f57843h; i12++) {
                int i13 = cVar.f57850o + i12;
                View reorderedChildAt = getReorderedChildAt(i13);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    a aVar = (a) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i13, i12)) {
                        drawHorizontalDivider(canvas, cVar.f57836a, z12 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.mDividerHorizontalHeight, cVar.f57842g);
                    }
                    if (i12 == cVar.f57843h - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        drawHorizontalDivider(canvas, cVar.f57836a, z12 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, cVar.f57842g);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i11)) {
                drawVerticalDivider(canvas, z11 ? cVar.f57838c : cVar.f57836a - this.mDividerVerticalWidth, paddingTop, max);
            }
            if (hasEndDividerAfterFlexLine(i11) && (this.mShowDividerVertical & 4) > 0) {
                drawVerticalDivider(canvas, z11 ? cVar.f57836a - this.mDividerVerticalWidth : cVar.f57838c, paddingTop, max);
            }
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, i13 + i11, this.mDividerHorizontalHeight + i12);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, this.mDividerVerticalWidth + i11, i13 + i12);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i11, int i12) {
        return allViewsAreGoneBefore(i11, i12) ? isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 1) != 0 : (this.mShowDividerHorizontal & 1) != 0 : isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 2) != 0 : (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean hasDividerBeforeFlexLine(int i11) {
        if (i11 >= 0 && i11 < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i11)) {
                return isMainAxisDirectionHorizontal() ? (this.mShowDividerHorizontal & 1) != 0 : (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasEndDividerAfterFlexLine(int i11) {
        if (i11 >= 0 && i11 < this.mFlexLines.size()) {
            for (int i12 = i11 + 1; i12 < this.mFlexLines.size(); i12++) {
                if (this.mFlexLines.get(i12).b() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void layoutHorizontal(boolean z11, int i11, int i12, int i13, int i14) {
        float f7;
        float f11;
        float f12;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        c cVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = i13 - i11;
        int paddingBottom = (i14 - i12) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i22 = 0; i22 < size; i22++) {
            c cVar2 = this.mFlexLines.get(i22);
            if (hasDividerBeforeFlexLine(i22)) {
                int i23 = this.mDividerHorizontalHeight;
                paddingBottom -= i23;
                paddingTop += i23;
            }
            int i24 = paddingBottom;
            int i25 = this.mJustifyContent;
            char c11 = 4;
            int i26 = 2;
            boolean z13 = true;
            if (i25 == 0) {
                f7 = paddingLeft;
                f11 = i21 - paddingRight;
            } else if (i25 == 1) {
                int i27 = cVar2.f57840e;
                f11 = i27 - paddingLeft;
                f7 = (i21 - i27) + paddingRight;
            } else if (i25 != 2) {
                if (i25 == 3) {
                    f7 = paddingLeft;
                    f12 = (i21 - cVar2.f57840e) / (cVar2.b() != 1 ? r7 - 1 : 1.0f);
                    f11 = i21 - paddingRight;
                } else if (i25 == 4) {
                    int b11 = cVar2.b();
                    float f13 = b11 != 0 ? (i21 - cVar2.f57840e) / b11 : 0.0f;
                    float f14 = f13 / 2.0f;
                    f7 = paddingLeft + f14;
                    float f15 = (i21 - paddingRight) - f14;
                    f12 = f13;
                    f11 = f15;
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f12 = cVar2.b() != 0 ? (i21 - cVar2.f57840e) / (r3 + 1) : 0.0f;
                    f7 = paddingLeft + f12;
                    f11 = (i21 - paddingRight) - f12;
                }
                float max = Math.max(f12, 0.0f);
                i15 = 0;
                while (i15 < cVar2.f57843h) {
                    int i28 = cVar2.f57850o + i15;
                    View reorderedChildAt = getReorderedChildAt(i28);
                    char c12 = c11;
                    if (reorderedChildAt != null) {
                        boolean z14 = z13;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z12 = z14;
                        } else {
                            a aVar = (a) reorderedChildAt.getLayoutParams();
                            float f16 = f7 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                            float f17 = f11 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i28, i15)) {
                                int i29 = this.mDividerVerticalWidth;
                                float f18 = i29;
                                f16 += f18;
                                f17 -= f18;
                                i19 = i29;
                            } else {
                                i19 = 0;
                            }
                            float f19 = f17;
                            int i31 = (i15 != cVar2.f57843h + (-1) || (this.mShowDividerVertical & 4) <= 0) ? 0 : this.mDividerVerticalWidth;
                            if (this.mFlexWrap == i26) {
                                if (z11) {
                                    i18 = i26;
                                    i17 = i15;
                                    view = reorderedChildAt;
                                    z12 = z14;
                                    this.mFlexboxHelper.r(view, cVar2, Math.round(f19) - reorderedChildAt.getMeasuredWidth(), i24 - reorderedChildAt.getMeasuredHeight(), Math.round(f19), i24);
                                } else {
                                    i18 = i26;
                                    i17 = i15;
                                    view = reorderedChildAt;
                                    z12 = z14;
                                    this.mFlexboxHelper.r(view, cVar2, Math.round(f16), i24 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f16), i24);
                                }
                                i16 = i24;
                            } else {
                                i18 = i26;
                                i17 = i15;
                                i16 = i24;
                                view = reorderedChildAt;
                                z12 = z14;
                                if (z11) {
                                    this.mFlexboxHelper.r(view, cVar2, Math.round(f19) - view.getMeasuredWidth(), paddingTop, Math.round(f19), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i32 = paddingTop;
                                    this.mFlexboxHelper.r(view, cVar2, Math.round(f16), i32, view.getMeasuredWidth() + Math.round(f16), view.getMeasuredHeight() + i32);
                                    paddingTop = i32;
                                }
                            }
                            f7 = f16 + view.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                            float measuredWidth = f19 - ((view.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin);
                            if (z11) {
                                cVar = cVar2;
                                cVar.c(view, i31, 0, i19, 0);
                            } else {
                                cVar = cVar2;
                                cVar.c(view, i19, 0, i31, 0);
                            }
                            cVar2 = cVar;
                            f11 = measuredWidth;
                            i15 = i17 + 1;
                            c11 = c12;
                            z13 = z12;
                            i26 = i18;
                            i24 = i16;
                        }
                    } else {
                        z12 = z13;
                    }
                    i18 = i26;
                    i17 = i15;
                    i16 = i24;
                    i15 = i17 + 1;
                    c11 = c12;
                    z13 = z12;
                    i26 = i18;
                    i24 = i16;
                }
                int i33 = cVar2.f57842g;
                paddingTop += i33;
                paddingBottom = i24 - i33;
            } else {
                int i34 = cVar2.f57840e;
                f7 = paddingLeft + ((i21 - i34) / 2.0f);
                f11 = (i21 - paddingRight) - ((i21 - i34) / 2.0f);
            }
            f12 = 0.0f;
            float max2 = Math.max(f12, 0.0f);
            i15 = 0;
            while (i15 < cVar2.f57843h) {
            }
            int i332 = cVar2.f57842g;
            paddingTop += i332;
            paddingBottom = i24 - i332;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void layoutVertical(boolean z11, boolean z12, int i11, int i12, int i13, int i14) {
        float f7;
        float f11;
        float f12;
        int i15;
        char c11;
        int i16;
        int i17;
        int i18;
        int i19;
        c cVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i21 = i14 - i12;
        int i22 = (i13 - i11) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i23 = 0; i23 < size; i23++) {
            c cVar2 = this.mFlexLines.get(i23);
            if (hasDividerBeforeFlexLine(i23)) {
                int i24 = this.mDividerVerticalWidth;
                paddingLeft += i24;
                i22 -= i24;
            }
            int i25 = i22;
            int i26 = this.mJustifyContent;
            char c12 = 4;
            int i27 = 1;
            if (i26 == 0) {
                f7 = paddingTop;
                f11 = i21 - paddingBottom;
            } else if (i26 == 1) {
                int i28 = cVar2.f57840e;
                f11 = i28 - paddingTop;
                f7 = (i21 - i28) + paddingBottom;
            } else if (i26 != 2) {
                if (i26 == 3) {
                    f7 = paddingTop;
                    f12 = (i21 - cVar2.f57840e) / (cVar2.b() != 1 ? r13 - 1 : 1.0f);
                    f11 = i21 - paddingBottom;
                } else if (i26 == 4) {
                    int b11 = cVar2.b();
                    f12 = b11 != 0 ? (i21 - cVar2.f57840e) / b11 : 0.0f;
                    float f13 = f12 / 2.0f;
                    f7 = paddingTop + f13;
                    f11 = (i21 - paddingBottom) - f13;
                } else {
                    if (i26 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f12 = cVar2.b() != 0 ? (i21 - cVar2.f57840e) / (r5 + 1) : 0.0f;
                    f7 = paddingTop + f12;
                    f11 = (i21 - paddingBottom) - f12;
                }
                float max = Math.max(f12, 0.0f);
                i15 = 0;
                while (i15 < cVar2.f57843h) {
                    int i29 = cVar2.f57850o + i15;
                    int i31 = i27;
                    View reorderedChildAt = getReorderedChildAt(i29);
                    if (reorderedChildAt != null) {
                        c11 = c12;
                        if (reorderedChildAt.getVisibility() != 8) {
                            a aVar = (a) reorderedChildAt.getLayoutParams();
                            float f14 = f7 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                            float f15 = f11 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i29, i15)) {
                                i19 = this.mDividerHorizontalHeight;
                                float f16 = i19;
                                f14 += f16;
                                f15 -= f16;
                            } else {
                                i19 = 0;
                            }
                            float f17 = f15;
                            int i32 = (i15 != cVar2.f57843h - i31 || (this.mShowDividerHorizontal & 4) <= 0) ? 0 : this.mDividerHorizontalHeight;
                            if (z11) {
                                if (z12) {
                                    i18 = i31;
                                    i17 = i15;
                                    this.mFlexboxHelper.s(reorderedChildAt, cVar2, true, i25 - reorderedChildAt.getMeasuredWidth(), Math.round(f17) - reorderedChildAt.getMeasuredHeight(), i25, Math.round(f17));
                                } else {
                                    i17 = i15;
                                    i18 = i31;
                                    this.mFlexboxHelper.s(reorderedChildAt, cVar2, true, i25 - reorderedChildAt.getMeasuredWidth(), Math.round(f14), i25, reorderedChildAt.getMeasuredHeight() + Math.round(f14));
                                }
                                i16 = i25;
                            } else {
                                i17 = i15;
                                i18 = i31;
                                i16 = i25;
                                if (z12) {
                                    this.mFlexboxHelper.s(reorderedChildAt, cVar2, false, paddingLeft, Math.round(f17) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f17));
                                } else {
                                    int i33 = paddingLeft;
                                    this.mFlexboxHelper.s(reorderedChildAt, cVar2, false, i33, Math.round(f14), reorderedChildAt.getMeasuredWidth() + i33, reorderedChildAt.getMeasuredHeight() + Math.round(f14));
                                    paddingLeft = i33;
                                }
                            }
                            f7 = f14 + reorderedChildAt.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            float measuredHeight = f17 - ((reorderedChildAt.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) aVar).topMargin);
                            if (z12) {
                                cVar = cVar2;
                                cVar.c(reorderedChildAt, 0, i32, 0, i19);
                            } else {
                                cVar = cVar2;
                                cVar.c(reorderedChildAt, 0, i19, 0, i32);
                            }
                            cVar2 = cVar;
                            f11 = measuredHeight;
                            i15 = i17 + 1;
                            c12 = c11;
                            i27 = i18;
                            i25 = i16;
                        }
                    } else {
                        c11 = c12;
                    }
                    i17 = i15;
                    i18 = i31;
                    i16 = i25;
                    i15 = i17 + 1;
                    c12 = c11;
                    i27 = i18;
                    i25 = i16;
                }
                int i34 = cVar2.f57842g;
                paddingLeft += i34;
                i22 = i25 - i34;
            } else {
                int i35 = cVar2.f57840e;
                f7 = paddingTop + ((i21 - i35) / 2.0f);
                f11 = (i21 - paddingBottom) - ((i21 - i35) / 2.0f);
            }
            f12 = 0.0f;
            float max2 = Math.max(f12, 0.0f);
            i15 = 0;
            while (i15 < cVar2.f57843h) {
            }
            int i342 = cVar2.f57842g;
            paddingLeft += i342;
            i22 = i25 - i342;
        }
    }

    private void measureHorizontal(int i11, int i12) {
        this.mFlexLines.clear();
        d.a aVar = this.mFlexLinesResult;
        aVar.f57859a = null;
        aVar.f57860b = 0;
        this.mFlexboxHelper.b(aVar, i11, i12, Integer.MAX_VALUE, 0, -1, null);
        this.mFlexLines = this.mFlexLinesResult.f57859a;
        this.mFlexboxHelper.j(i11, i12, 0);
        if (this.mAlignItems == 3) {
            for (c cVar : this.mFlexLines) {
                int i13 = LinearLayoutManager.INVALID_OFFSET;
                for (int i14 = 0; i14 < cVar.f57843h; i14++) {
                    View reorderedChildAt = getReorderedChildAt(cVar.f57850o + i14);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        a aVar2 = (a) reorderedChildAt.getLayoutParams();
                        i13 = this.mFlexWrap != 2 ? Math.max(i13, reorderedChildAt.getMeasuredHeight() + Math.max(cVar.f57847l - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar2).topMargin) + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin) : Math.max(i13, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + Math.max(reorderedChildAt.getBaseline() + (cVar.f57847l - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin));
                    }
                }
                cVar.f57842g = i13;
            }
        }
        this.mFlexboxHelper.i(i11, i12, getPaddingBottom() + getPaddingTop());
        this.mFlexboxHelper.x(0);
        setMeasuredDimensionForFlex(this.mFlexDirection, i11, i12, this.mFlexLinesResult.f57860b);
    }

    private void measureVertical(int i11, int i12) {
        this.mFlexLines.clear();
        d.a aVar = this.mFlexLinesResult;
        aVar.f57859a = null;
        aVar.f57860b = 0;
        this.mFlexboxHelper.b(aVar, i12, i11, Integer.MAX_VALUE, 0, -1, null);
        this.mFlexLines = this.mFlexLinesResult.f57859a;
        this.mFlexboxHelper.j(i11, i12, 0);
        this.mFlexboxHelper.i(i11, i12, getPaddingRight() + getPaddingLeft());
        this.mFlexboxHelper.x(0);
        setMeasuredDimensionForFlex(this.mFlexDirection, i11, i12, this.mFlexLinesResult.f57860b);
    }

    private void setMeasuredDimensionForFlex(int i11, int i12, int i13, int i14) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (i11 == 0 || i11 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i14 = View.combineMeasuredStates(i14, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i12, i14);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(Ej.b.a(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i14 = View.combineMeasuredStates(i14, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i14 = View.combineMeasuredStates(i14, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i13, i14);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(Ej.b.a(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i14 = View.combineMeasuredStates(i14, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.h(view, i11, layoutParams, this.mOrderCache);
        super.addView(view, i11, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.a
    public int getChildHeightMeasureSpec(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.a
    public int getChildWidthMeasureSpec(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthMainAxis(View view, int i11, int i12) {
        int i13;
        int i14;
        if (isMainAxisDirectionHorizontal()) {
            i13 = hasDividerBeforeChildAtAlongMainAxis(i11, i12) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i13;
            }
            i14 = this.mDividerVerticalWidth;
        } else {
            i13 = hasDividerBeforeChildAtAlongMainAxis(i11, i12) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i13;
            }
            i14 = this.mDividerHorizontalHeight;
        }
        return i13 + i14;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.a
    public View getFlexItemAt(int i11) {
        return getChildAt(i11);
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.a
    public List<c> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator<c> it = this.mFlexLines.iterator();
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        while (it.hasNext()) {
            i11 = Math.max(i11, it.next().f57840e);
        }
        return i11;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i11) {
        if (i11 < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i11 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i11]);
    }

    @Override // com.google.android.flexbox.a
    public View getReorderedFlexItemAt(int i11) {
        return getReorderedChildAt(i11);
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.mFlexLines.get(i12);
            if (hasDividerBeforeFlexLine(i12)) {
                i11 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i12)) {
                i11 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i11 += cVar.f57842g;
        }
        return i11;
    }

    @Override // com.google.android.flexbox.a
    public boolean isMainAxisDirectionHorizontal() {
        int i11 = this.mFlexDirection;
        return i11 == 0 || i11 == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        int i11 = Y.f42258g;
        int layoutDirection = getLayoutDirection();
        int i12 = this.mFlexDirection;
        if (i12 == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i12 == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i12 == 2) {
            boolean z11 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z11 = !z11;
            }
            drawDividersVertical(canvas, z11, false);
            return;
        }
        if (i12 != 3) {
            return;
        }
        boolean z12 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z12 = !z12;
        }
        drawDividersVertical(canvas, z12, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        FlexboxLayout flexboxLayout;
        int i15;
        int i16;
        int i17;
        int i18;
        FlexboxLayout flexboxLayout2;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z12;
        boolean z13 = true;
        int i24 = Y.f42258g;
        int layoutDirection = getLayoutDirection();
        int i25 = this.mFlexDirection;
        if (i25 == 0) {
            if (layoutDirection == 1) {
                flexboxLayout = this;
                i15 = i11;
                i16 = i12;
                i18 = i13;
                i17 = i14;
            } else {
                z13 = false;
                flexboxLayout = this;
                i15 = i11;
                i16 = i12;
                i17 = i14;
                i18 = i13;
            }
            flexboxLayout.layoutHorizontal(z13, i15, i16, i18, i17);
            return;
        }
        if (i25 == 1) {
            if (layoutDirection != 1) {
                flexboxLayout2 = this;
                i19 = i11;
                i21 = i12;
                i23 = i13;
                i22 = i14;
            } else {
                z13 = false;
                flexboxLayout2 = this;
                i19 = i11;
                i21 = i12;
                i22 = i14;
                i23 = i13;
            }
            flexboxLayout2.layoutHorizontal(z13, i19, i21, i23, i22);
            return;
        }
        if (i25 == 2) {
            z12 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z12 = !z12;
            }
            layoutVertical(z12, false, i11, i12, i13, i14);
            return;
        }
        if (i25 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
        }
        z12 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z12 = !z12;
        }
        layoutVertical(z12, true, i11, i12, i13, i14);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.q(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.g(this.mOrderCache);
        }
        int i13 = this.mFlexDirection;
        if (i13 == 0 || i13 == 1) {
            measureHorizontal(i11, i12);
        } else if (i13 == 2 || i13 == 3) {
            measureVertical(i11, i12);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
        }
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexItemAdded(View view, int i11, int i12, c cVar) {
        if (hasDividerBeforeChildAtAlongMainAxis(i11, i12)) {
            if (isMainAxisDirectionHorizontal()) {
                int i13 = cVar.f57840e;
                int i14 = this.mDividerVerticalWidth;
                cVar.f57840e = i13 + i14;
                cVar.f57841f += i14;
                return;
            }
            int i15 = cVar.f57840e;
            int i16 = this.mDividerHorizontalHeight;
            cVar.f57840e = i15 + i16;
            cVar.f57841f += i16;
        }
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexLineAdded(c cVar) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i11 = cVar.f57840e;
                int i12 = this.mDividerVerticalWidth;
                cVar.f57840e = i11 + i12;
                cVar.f57841f += i12;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i13 = cVar.f57840e;
            int i14 = this.mDividerHorizontalHeight;
            cVar.f57840e = i13 + i14;
            cVar.f57841f += i14;
        }
    }

    public void setAlignItems(int i11) {
        if (this.mAlignItems != i11) {
            this.mAlignItems = i11;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setFlexDirection(int i11) {
        if (this.mFlexDirection != i11) {
            this.mFlexDirection = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<c> list) {
        this.mFlexLines = list;
    }

    public void setFlexWrap(int i11) {
        if (this.mFlexWrap != i11) {
            this.mFlexWrap = i11;
            requestLayout();
        }
    }

    public void setJustifyContent(int i11) {
        if (this.mJustifyContent != i11) {
            this.mJustifyContent = i11;
            requestLayout();
        }
    }

    public void setMaxLine(int i11) {
        if (this.mMaxLine != i11) {
            this.mMaxLine = i11;
            requestLayout();
        }
    }

    public void setShowDivider(int i11) {
        setShowDividerVertical(i11);
        setShowDividerHorizontal(i11);
    }

    public void setShowDividerHorizontal(int i11) {
        if (i11 != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i11;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i11) {
        if (i11 != this.mShowDividerVertical) {
            this.mShowDividerVertical = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void updateViewCache(int i11, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new d(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new d.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6313a.f62027a, i11, 0);
        this.mFlexDirection = obtainStyledAttributes.getInt(5, 0);
        this.mFlexWrap = obtainStyledAttributes.getInt(6, 0);
        this.mJustifyContent = obtainStyledAttributes.getInt(7, 0);
        this.mAlignItems = obtainStyledAttributes.getInt(1, 0);
        this.mAlignContent = obtainStyledAttributes.getInt(0, 0);
        this.mMaxLine = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i12 = obtainStyledAttributes.getInt(9, 0);
        if (i12 != 0) {
            this.mShowDividerVertical = i12;
            this.mShowDividerHorizontal = i12;
        }
        int i13 = obtainStyledAttributes.getInt(11, 0);
        if (i13 != 0) {
            this.mShowDividerVertical = i13;
        }
        int i14 = obtainStyledAttributes.getInt(10, 0);
        if (i14 != 0) {
            this.mShowDividerHorizontal = i14;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C0877a();

        /* renamed from: a, reason: collision with root package name */
        private int f57798a;

        /* renamed from: b, reason: collision with root package name */
        private float f57799b;

        /* renamed from: c, reason: collision with root package name */
        private float f57800c;

        /* renamed from: d, reason: collision with root package name */
        private int f57801d;

        /* renamed from: e, reason: collision with root package name */
        private float f57802e;

        /* renamed from: f, reason: collision with root package name */
        private int f57803f;

        /* renamed from: g, reason: collision with root package name */
        private int f57804g;

        /* renamed from: h, reason: collision with root package name */
        private int f57805h;

        /* renamed from: i, reason: collision with root package name */
        private int f57806i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f57807j;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a, reason: collision with other inner class name */
        static class C0877a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f57798a = 1;
            this.f57799b = 0.0f;
            this.f57800c = 1.0f;
            this.f57801d = -1;
            this.f57802e = -1.0f;
            this.f57803f = -1;
            this.f57804g = -1;
            this.f57805h = 16777215;
            this.f57806i = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6313a.f62028b);
            this.f57798a = obtainStyledAttributes.getInt(8, 1);
            this.f57799b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f57800c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f57801d = obtainStyledAttributes.getInt(0, -1);
            this.f57802e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f57803f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f57804g = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.f57805h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f57806i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f57807j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.b
        public final void J1(int i11) {
            this.f57803f = i11;
        }

        @Override // com.google.android.flexbox.b
        public final int M1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public final int O() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public final int T0() {
            return this.f57801d;
        }

        @Override // com.google.android.flexbox.b
        public final int V1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public final float W0() {
            return this.f57800c;
        }

        @Override // com.google.android.flexbox.b
        public final int X1() {
            return this.f57806i;
        }

        public final void a() {
            this.f57799b = 1.0f;
        }

        public final void b() {
            this.f57800c = 0.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public final int getMinHeight() {
            return this.f57804g;
        }

        @Override // com.google.android.flexbox.b
        public final int getMinWidth() {
            return this.f57803f;
        }

        @Override // com.google.android.flexbox.b
        public final int getOrder() {
            return this.f57798a;
        }

        @Override // com.google.android.flexbox.b
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public final void j1(int i11) {
            this.f57804g = i11;
        }

        @Override // com.google.android.flexbox.b
        public final float k1() {
            return this.f57799b;
        }

        @Override // com.google.android.flexbox.b
        public final float l1() {
            return this.f57802e;
        }

        @Override // com.google.android.flexbox.b
        public final boolean n1() {
            return this.f57807j;
        }

        @Override // com.google.android.flexbox.b
        public final int o0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.b
        public final int t1() {
            return this.f57805h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f57798a);
            parcel.writeFloat(this.f57799b);
            parcel.writeFloat(this.f57800c);
            parcel.writeInt(this.f57801d);
            parcel.writeFloat(this.f57802e);
            parcel.writeInt(this.f57803f);
            parcel.writeInt(this.f57804g);
            parcel.writeInt(this.f57805h);
            parcel.writeInt(this.f57806i);
            parcel.writeByte(this.f57807j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f57798a = 1;
            this.f57799b = 0.0f;
            this.f57800c = 1.0f;
            this.f57801d = -1;
            this.f57802e = -1.0f;
            this.f57803f = -1;
            this.f57804g = -1;
            this.f57805h = 16777215;
            this.f57806i = 16777215;
            this.f57798a = aVar.f57798a;
            this.f57799b = aVar.f57799b;
            this.f57800c = aVar.f57800c;
            this.f57801d = aVar.f57801d;
            this.f57802e = aVar.f57802e;
            this.f57803f = aVar.f57803f;
            this.f57804g = aVar.f57804g;
            this.f57805h = aVar.f57805h;
            this.f57806i = aVar.f57806i;
            this.f57807j = aVar.f57807j;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f57798a = 1;
            this.f57799b = 0.0f;
            this.f57800c = 1.0f;
            this.f57801d = -1;
            this.f57802e = -1.0f;
            this.f57803f = -1;
            this.f57804g = -1;
            this.f57805h = 16777215;
            this.f57806i = 16777215;
        }

        public a(int i11, int i12) {
            super(new ViewGroup.LayoutParams(i11, i12));
            this.f57798a = 1;
            this.f57799b = 0.0f;
            this.f57800c = 1.0f;
            this.f57801d = -1;
            this.f57802e = -1.0f;
            this.f57803f = -1;
            this.f57804g = -1;
            this.f57805h = 16777215;
            this.f57806i = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f57798a = 1;
            this.f57799b = 0.0f;
            this.f57800c = 1.0f;
            this.f57801d = -1;
            this.f57802e = -1.0f;
            this.f57803f = -1;
            this.f57804g = -1;
            this.f57805h = 16777215;
            this.f57806i = 16777215;
        }

        protected a(Parcel parcel) {
            super(0, 0);
            this.f57798a = 1;
            this.f57799b = 0.0f;
            this.f57800c = 1.0f;
            this.f57801d = -1;
            this.f57802e = -1.0f;
            this.f57803f = -1;
            this.f57804g = -1;
            this.f57805h = 16777215;
            this.f57806i = 16777215;
            this.f57798a = parcel.readInt();
            this.f57799b = parcel.readFloat();
            this.f57800c = parcel.readFloat();
            this.f57801d = parcel.readInt();
            this.f57802e = parcel.readFloat();
            this.f57803f = parcel.readInt();
            this.f57804g = parcel.readInt();
            this.f57805h = parcel.readInt();
            this.f57806i = parcel.readInt();
            this.f57807j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
