package com.vk.newsfeed.impl.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.newsfeed.impl.R$styleable;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.baf0;
import xsna.bwt0;
import xsna.cn70;
import xsna.krv0;
import xsna.lhg;
import xsna.m33;
import xsna.omw;
import xsna.x9;
import xsna.xpg0;

/* compiled from: ImageTextButtonView.kt */
/* loaded from: classes4.dex */
public final class ImageTextButtonView extends ViewGroup {
    public static final int k = (int) TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics());
    public int b;
    public int c;
    public Integer d;
    public CharSequence e;
    public int f;
    public float g;
    public FontFamily h;
    public final AppCompatImageView i;
    public final AppCompatTextView j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageTextButtonView(Context context) {
        this(context, r0, 6, r0);
        AttributeSet attributeSet = null;
    }

    public static int a(int i, int i2, int i3) {
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

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final int getDrawableStart() {
        return this.b;
    }

    public final int getDrawableTint() {
        return this.c;
    }

    public final Integer getDrawableTintColor() {
        return this.d;
    }

    public final FontFamily getFontFamily() {
        return this.h;
    }

    public final CharSequence getText() {
        return this.e;
    }

    public final int getTextColor() {
        return this.f;
    }

    public final float getTextSize() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getMeasuredWidth();
        getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = xpg0.b() ? getChildAt(i5) : getChildAt((childCount - 1) - i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8) {
                int marginStart = xpg0.b() ? marginLayoutParams.getMarginStart() : marginLayoutParams.getMarginEnd();
                int marginEnd = xpg0.b() ? marginLayoutParams.getMarginEnd() : marginLayoutParams.getMarginStart();
                int i6 = paddingLeft + marginStart;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                int measuredWidth = childAt.getMeasuredWidth() + i6;
                int i8 = (measuredHeight - marginLayoutParams.bottomMargin) - i7;
                int measuredHeight2 = childAt.getMeasuredHeight();
                int b = x9.b(i8, measuredHeight2, 2, i7) - marginLayoutParams.bottomMargin;
                childAt.layout(i6, b, measuredWidth, measuredHeight2 + b);
                paddingLeft = marginEnd + measuredWidth;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        AppCompatTextView appCompatTextView = this.j;
        int i3 = 0;
        int i4 = 0;
        if (appCompatTextView.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams();
            measureChildWithMargins(appCompatTextView, i, 0, i2, 0);
            i3 = marginLayoutParams.rightMargin + appCompatTextView.getMeasuredWidth() + marginLayoutParams.leftMargin;
            i4 = Math.max(0, appCompatTextView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        }
        int i5 = i4;
        int i6 = i3;
        AppCompatImageView appCompatImageView = this.i;
        if (appCompatImageView.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) appCompatImageView.getLayoutParams();
            measureChildWithMargins(appCompatImageView, i, 0, i2, 0);
            i6 += appCompatImageView.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            i5 = Math.max(i5, appCompatImageView.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
        }
        setMeasuredDimension(a(i, suggestedMinimumWidth, paddingRight + i6), a(i2, suggestedMinimumHeight, paddingBottom + i5));
    }

    public final void setDrawableStart(int i) {
        this.b = i;
        omw.d(this.i, i, this.c);
        requestLayout();
    }

    public final void setDrawableTint(int i) {
        this.c = i;
        omw.d(this.i, this.b, i);
        requestLayout();
    }

    public final void setDrawableTintColor(Integer num) {
        this.d = num;
        AppCompatImageView appCompatImageView = this.i;
        if (num != null) {
            appCompatImageView.setImageDrawable(new baf0(m33.a(this.b, getContext()), num.intValue()));
        } else {
            omw.d(appCompatImageView, this.b, this.c);
        }
        requestLayout();
    }

    public final void setFontFamily(FontFamily fontFamily) {
        this.h = fontFamily;
        com.vk.typography.b.k(this.j, fontFamily, Float.valueOf(this.g), 4);
        requestLayout();
    }

    public final void setText(CharSequence charSequence) {
        this.e = charSequence;
        AppCompatTextView appCompatTextView = this.j;
        if (charSequence == null || charSequence.length() == 0) {
            bwt0.p0(appCompatTextView, false);
        } else {
            appCompatTextView.setText(this.e);
            bwt0.p0(appCompatTextView, true);
        }
        requestLayout();
    }

    public final void setTextColor(int i) {
        this.f = i;
    }

    public final void setTextSize(float f) {
        this.g = f;
        com.vk.typography.b.k(this.j, this.h, Float.valueOf(f), 4);
        requestLayout();
    }

    public ImageTextButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (Object) null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public ImageTextButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = R.drawable.vk_icon_comment_outline_24;
        this.c = R.attr.vk_ui_icon_secondary;
        this.f = R.attr.vk_ui_text_secondary;
        this.g = 14.0f;
        this.h = FontFamily.MEDIUM;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.i = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.j = appCompatTextView;
        omw.d(appCompatImageView, this.b, this.c);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        int i2 = k;
        appCompatImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(i2, i2));
        addView(appCompatImageView);
        appCompatTextView.setDuplicateParentStateEnabled(true);
        TypedValue typedValue = krv0.a;
        krv0.q(appCompatTextView, this.f);
        com.vk.typography.b.k(appCompatTextView, this.h, Float.valueOf(this.g), 4);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(cn70.b(4));
        appCompatTextView.setLayoutParams(marginLayoutParams);
        addView(appCompatTextView);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
        if (obtainStyledAttributes.hasValue(4)) {
            setDrawableStart(obtainStyledAttributes.getResourceId(4, R.drawable.vk_icon_comment_outline_24));
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ ImageTextButtonView(Context context, AttributeSet attributeSet, int i, Object obj) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @TargetApi(21)
    public ImageTextButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = R.drawable.vk_icon_comment_outline_24;
        this.c = R.attr.vk_ui_icon_secondary;
        this.f = R.attr.vk_ui_text_secondary;
        this.g = 14.0f;
        this.h = FontFamily.MEDIUM;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.i = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.j = appCompatTextView;
        omw.d(appCompatImageView, this.b, this.c);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        int i3 = k;
        appCompatImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(i3, i3));
        addView(appCompatImageView);
        appCompatTextView.setDuplicateParentStateEnabled(true);
        TypedValue typedValue = krv0.a;
        krv0.q(appCompatTextView, this.f);
        com.vk.typography.b.k(appCompatTextView, this.h, Float.valueOf(this.g), 4);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(cn70.b(4));
        appCompatTextView.setLayoutParams(marginLayoutParams);
        addView(appCompatTextView);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
        if (obtainStyledAttributes.hasValue(4)) {
            setDrawableStart(obtainStyledAttributes.getResourceId(4, R.drawable.vk_icon_comment_outline_24));
        }
        obtainStyledAttributes.recycle();
    }
}
