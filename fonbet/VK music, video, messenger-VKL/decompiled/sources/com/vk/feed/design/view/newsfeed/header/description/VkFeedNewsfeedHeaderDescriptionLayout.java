package com.vk.feed.design.view.newsfeed.header.description;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.design.R$styleable;
import xsna.ruu0;
import xsna.x5f0;
import xsna.x9;

/* compiled from: VkFeedNewsfeedHeaderDescriptionLayout.kt */
/* loaded from: classes18.dex */
public final class VkFeedNewsfeedHeaderDescriptionLayout extends ViewGroup {
    public int b;
    public final ValueAnimator c;
    public int d;
    public int e;

    /* compiled from: VkFeedNewsfeedHeaderDescriptionLayout.kt */
    public static final class a extends BaseInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (f < 0.5f) {
                return 4.0f * f * f * f;
            }
            float f2 = (f * (-2.0f)) + 2.0f;
            return 1.0f - (((f2 * f2) * f2) / 2.0f);
        }
    }

    public VkFeedNewsfeedHeaderDescriptionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.c = ofFloat;
        this.e = -1;
        int i = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f, 0, 0);
            try {
                long j = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getInt(0, 0) : 1200L;
                long j2 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getInt(1, 0) : 600L;
                obtainStyledAttributes.recycle();
                ofFloat.setStartDelay(j);
                ofFloat.setDuration(j2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        ofFloat.setInterpolator(new a());
        ofFloat.addUpdateListener(new x5f0(this, i));
        ofFloat.addListener(new ruu0(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        this.d = 0;
        this.e = -1;
        this.b = 0;
        setAlpha(1.0f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (childAt.getVisibility() != 8) {
                    childAt.layout(paddingLeft, x9.b(measuredHeight, measuredHeight2, 2, paddingTop), childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                    paddingTop += measuredHeight;
                }
            }
        }
        if (this.d > 1) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        this.b = 0;
        this.d = 0;
        this.e = -1;
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                childAt.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                measureChild(childAt, i, i2);
                i3 = Math.max(i3, childAt.getMeasuredHeight());
                this.d++;
                if (this.e == -1) {
                    this.e = i4;
                }
            }
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, i3);
    }
}
