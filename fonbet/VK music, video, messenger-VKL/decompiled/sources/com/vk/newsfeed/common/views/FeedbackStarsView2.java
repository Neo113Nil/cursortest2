package com.vk.newsfeed.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.cn70;
import xsna.gp10;
import xsna.iut0;
import xsna.lr;

/* compiled from: FeedbackStarsView2.kt */
/* loaded from: classes4.dex */
public final class FeedbackStarsView2 extends ViewGroup {
    public final DynamicRatingView b;
    public final TextView c;
    public final TextView d;
    public final int e;
    public final int f;
    public final int g;

    public FeedbackStarsView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = cn70.b(12);
        this.f = cn70.b(36);
        this.g = cn70.b(19);
        LayoutInflater.from(context).inflate(R.layout.stars_feedback_layout_v2, (ViewGroup) this, true);
        this.b = (DynamicRatingView) findViewById(R.id.rating);
        this.c = (TextView) findViewById(R.id.not_interesting);
        this.d = (TextView) findViewById(R.id.interesting);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = getLayoutDirection();
        TextView textView = this.d;
        TextView textView2 = this.c;
        DynamicRatingView dynamicRatingView = this.b;
        if (layoutDirection == 0) {
            dynamicRatingView.layout(getPaddingStart(), getPaddingTop(), dynamicRatingView.getMeasuredWidth() + getPaddingStart(), dynamicRatingView.getMeasuredHeight() + getPaddingTop());
            int paddingStart = getPaddingStart();
            int measuredHeight = dynamicRatingView.getMeasuredHeight() + getPaddingTop();
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = measuredHeight + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
            int measuredWidth = textView2.getMeasuredWidth() + getPaddingStart();
            int measuredHeight2 = dynamicRatingView.getMeasuredHeight() + textView2.getMeasuredHeight() + getPaddingTop();
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            textView2.layout(paddingStart, i5, measuredWidth, measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0));
            int measuredWidth2 = (getMeasuredWidth() - getPaddingEnd()) - textView.getMeasuredWidth();
            int measuredHeight3 = dynamicRatingView.getMeasuredHeight() + getPaddingTop();
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i6 = measuredHeight3 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0);
            int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
            int measuredHeight4 = dynamicRatingView.getMeasuredHeight() + textView.getMeasuredHeight() + getPaddingTop();
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            textView.layout(measuredWidth2, i6, measuredWidth3, measuredHeight4 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
            return;
        }
        dynamicRatingView.layout(getPaddingStart(), getPaddingTop(), dynamicRatingView.getMeasuredWidth() + getPaddingStart(), dynamicRatingView.getMeasuredHeight() + getPaddingTop());
        int paddingStart2 = getPaddingStart();
        int measuredHeight5 = dynamicRatingView.getMeasuredHeight() + getPaddingTop();
        ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        int i7 = measuredHeight5 + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
        int measuredWidth4 = textView2.getMeasuredWidth() + getPaddingStart();
        int measuredHeight6 = dynamicRatingView.getMeasuredHeight() + textView2.getMeasuredHeight() + getPaddingTop();
        ViewGroup.LayoutParams layoutParams6 = textView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        textView.layout(paddingStart2, i7, measuredWidth4, measuredHeight6 + (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0));
        int measuredWidth5 = (getMeasuredWidth() - getPaddingEnd()) - textView.getMeasuredWidth();
        int measuredHeight7 = dynamicRatingView.getMeasuredHeight() + getPaddingTop();
        ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        int i8 = measuredHeight7 + (marginLayoutParams7 != null ? marginLayoutParams7.topMargin : 0);
        int measuredWidth6 = getMeasuredWidth() - getPaddingEnd();
        int measuredHeight8 = dynamicRatingView.getMeasuredHeight() + textView.getMeasuredHeight() + getPaddingTop();
        ViewGroup.LayoutParams layoutParams8 = textView2.getLayoutParams();
        marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
        textView2.layout(measuredWidth5, i8, measuredWidth6, measuredHeight8 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int a = gp10.a(i, getSuggestedMinimumWidth(), View.MeasureSpec.getSize(i), paddingRight);
        int i3 = this.e;
        int i4 = (a - i3) / 2;
        if (i4 < 0) {
            i4 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        measureChildWithMargins(this.c, makeMeasureSpec, 0, i2, 0);
        measureChildWithMargins(this.d, makeMeasureSpec, 0, i2, 0);
        DynamicRatingView dynamicRatingView = this.b;
        int ratingCount = dynamicRatingView.getRatingCount();
        int i5 = this.f;
        int i6 = ratingCount * i5;
        int ratingCount2 = dynamicRatingView.getRatingCount() - 1;
        if (ratingCount2 < 0) {
            ratingCount2 = 0;
        }
        int i7 = this.g;
        int i8 = (ratingCount2 * i7) + i6;
        TextView textView = this.d;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.c;
        int measuredWidth2 = i3 + textView2.getMeasuredWidth() + measuredWidth;
        if (measuredWidth2 > i8) {
            int i9 = measuredWidth2 - i8;
            int ratingCount3 = dynamicRatingView.getRatingCount();
            dynamicRatingView.setPaddingBetween((i9 / (ratingCount3 >= 1 ? ratingCount3 : 1)) + i7);
        } else {
            dynamicRatingView.setPaddingBetween(i7);
        }
        measureChildWithMargins(this.b, View.MeasureSpec.makeMeasureSpec(0, 0), 0, i2, 0);
        int max = Integer.max(measuredWidth2, i8);
        int max2 = Integer.max(textView.getMeasuredHeight(), textView2.getMeasuredHeight());
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        setMeasuredDimension(max, lr.a(max2, marginLayoutParams != null ? marginLayoutParams.topMargin : 0, i5, paddingBottom));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
