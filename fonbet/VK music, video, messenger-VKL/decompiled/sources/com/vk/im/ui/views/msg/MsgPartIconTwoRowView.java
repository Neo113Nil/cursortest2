package com.vk.im.ui.views.msg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressView;
import com.vk.superapp.ui.FixTextView;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.f4m;
import xsna.hp10;
import xsna.hux0;
import xsna.iah0;
import xsna.qcy;
import xsna.x9;

/* compiled from: MsgPartIconTwoRowView.kt */
/* loaded from: classes2.dex */
public final class MsgPartIconTwoRowView extends ViewGroup implements hux0 {
    public static final /* synthetic */ int m = 0;
    public final ImageView b;
    public final ProgressView c;
    public final FixTextView d;
    public final FixTextView e;
    public final TimeAndStatusView f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    /* compiled from: MsgPartIconTwoRowView.kt */
    public static final class a {
        public static int a(Context context, String str, String str2) {
            int i = MsgPartIconTwoRowView.m;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.VkIm_MsgPart_IconTwoRow_Default, R$styleable.r);
            float dimension = obtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float dimension2 = obtainStyledAttributes.getDimension(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int resourceId = obtainStyledAttributes.getResourceId(14, R.style.VkIm_MsgPart_IconTwoRow_Title);
            int resourceId2 = obtainStyledAttributes.getResourceId(8, R.style.VkIm_MsgPart_IconTwoRow_Subtitle);
            obtainStyledAttributes.recycle();
            TextPaint textPaint = new TextPaint();
            int[] iArr = androidx.appcompat.R$styleable.w;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            float dimension3 = obtainStyledAttributes2.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes2.recycle();
            FontFamily.Companion.getClass();
            FontFamily a = FontFamily.a.a(resourceId, context);
            Float valueOf = Float.valueOf(dimension3);
            TextSizeUnit textSizeUnit = TextSizeUnit.PX;
            b.c(textPaint, context, a, valueOf, textSizeUnit);
            TextPaint textPaint2 = new TextPaint();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, iArr);
            float dimension4 = obtainStyledAttributes3.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes3.recycle();
            b.c(textPaint2, context, FontFamily.a.a(resourceId2, context), Float.valueOf(dimension4), textSizeUnit);
            return (int) (Math.max(textPaint.measureText(str), textPaint2.measureText(str2)) + dimension2 + dimension);
        }
    }

    public MsgPartIconTwoRowView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        setMaximumWidth(typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setIcon(typedArray.getDrawable(2));
        float f = 40;
        setIconWidth(typedArray.getDimensionPixelSize(5, iah0.a(f)));
        setIconHeight(typedArray.getDimensionPixelSize(3, iah0.a(f)));
        String string = typedArray.getString(13);
        if (string == null) {
            string = "";
        }
        setTitleText(string);
        setTitleTextAppearance(typedArray.getResourceId(14, 0));
        String string2 = typedArray.getString(7);
        setSubtitleText(string2 != null ? string2 : "");
        setSubtitleTextAppearance(typedArray.getResourceId(8, 0));
        setTimeTextAppearance(typedArray.getResourceId(11, 0));
        setTimeTranslationY(typedArray.getDimensionPixelSize(12, 0));
        setTimeSpaceX(typedArray.getDimensionPixelSize(9, 0));
        setSpaceIconInfo(typedArray.getDimensionPixelSize(6, 0));
        if (typedArray.hasValue(4)) {
            setIconTintColor(typedArray.getColor(4, -1));
        }
    }

    public final Drawable getIcon() {
        return this.b.getDrawable();
    }

    public final int getIconHeight() {
        return this.j;
    }

    public final ImageView getIconView() {
        return this.b;
    }

    public final int getIconWidth() {
        return this.i;
    }

    public final int getMaximumHeight() {
        return this.h;
    }

    public final int getMaximumWidth() {
        return this.g;
    }

    public final ProgressView getProgressView() {
        return this.c;
    }

    public final CharSequence getSubtitleText() {
        return this.e.getText();
    }

    @Override // xsna.hux0
    public TimeAndStatusView getTimeAndStatusView() {
        return this.f;
    }

    public final CharSequence getTitleText() {
        return this.d.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int b = x9.b(measuredHeight, paddingTop, 2, paddingTop);
        ImageView imageView = this.b;
        imageView.layout(paddingLeft, paddingTop, imageView.getMeasuredWidth() + paddingLeft, imageView.getMeasuredHeight() + paddingTop);
        ProgressView progressView = this.c;
        if (!f4m.f(progressView)) {
            progressView.layout(paddingLeft, paddingTop, progressView.getMeasuredWidth() + paddingLeft, progressView.getMeasuredHeight() + paddingTop);
        }
        int right = imageView.getRight() + this.k;
        FixTextView fixTextView = this.d;
        int measuredHeight2 = b - fixTextView.getMeasuredHeight();
        fixTextView.layout(right, measuredHeight2, fixTextView.getMeasuredWidth() + right, fixTextView.getMeasuredHeight() + measuredHeight2);
        int right2 = imageView.getRight() + this.k;
        FixTextView fixTextView2 = this.e;
        fixTextView2.layout(right2, b, fixTextView2.getMeasuredWidth() + right2, fixTextView2.getMeasuredHeight() + b);
        if (f4m.f(getTimeAndStatusView())) {
            return;
        }
        int measuredWidth2 = measuredWidth - getTimeAndStatusView().getMeasuredWidth();
        int measuredHeight3 = measuredHeight - getTimeAndStatusView().getMeasuredHeight();
        getTimeAndStatusView().layout(measuredWidth2, measuredHeight3, getTimeAndStatusView().getMeasuredWidth() + measuredWidth2, getTimeAndStatusView().getMeasuredHeight() + measuredHeight3);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int i6 = this.g;
        int i7 = this.h;
        int a2 = hp10.a(i, suggestedMinimumWidth, i6, paddingRight);
        int d = hp10.d(this.i);
        int d2 = hp10.d(this.j);
        ImageView imageView = this.b;
        imageView.measure(d, d2);
        this.c.measure(hp10.d(this.i), hp10.d(this.j));
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        int max = Math.max(0, (a2 - measuredWidth) - this.k);
        int c = hp10.c(max);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        FixTextView fixTextView = this.d;
        fixTextView.measure(c, makeMeasureSpec);
        int measuredWidth2 = fixTextView.getMeasuredWidth();
        int measuredHeight2 = fixTextView.getMeasuredHeight();
        if (getTimeAndStatusView().getVisibility() != 8) {
            i3 = paddingRight;
            getTimeAndStatusView().measure(hp10.c(max), View.MeasureSpec.makeMeasureSpec(0, 0));
            i4 = getTimeAndStatusView().getMeasuredWidth();
            i5 = getTimeAndStatusView().getMeasuredHeight();
        } else {
            i3 = paddingRight;
            i4 = 0;
            i5 = 0;
        }
        if (i4 > 0) {
            max = (max - this.l) - i4;
        }
        int c2 = hp10.c(max);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        FixTextView fixTextView2 = this.e;
        fixTextView2.measure(c2, makeMeasureSpec2);
        int measuredWidth3 = fixTextView2.getMeasuredWidth();
        int measuredHeight3 = fixTextView2.getMeasuredHeight();
        if (i4 > 0) {
            measuredWidth3 = measuredWidth3 + this.l + i4;
        }
        setMeasuredDimension(hp10.b(i, suggestedMinimumWidth, i6, i3 + measuredWidth + this.k + Math.max(measuredWidth2, measuredWidth3)), hp10.b(i2, suggestedMinimumHeight, i7, Math.max(measuredHeight, Math.max(measuredHeight3, i5) + measuredHeight2) + paddingBottom));
    }

    public final void setIcon(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final void setIconHeight(int i) {
        this.j = i;
        requestLayout();
        invalidate();
    }

    public final void setIconTintColor(int i) {
        this.b.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setIconWidth(int i) {
        this.i = i;
        requestLayout();
        invalidate();
    }

    public final void setMaximumHeight(int i) {
        this.h = i;
        requestLayout();
        invalidate();
    }

    public final void setMaximumWidth(int i) {
        this.g = i;
        requestLayout();
        invalidate();
    }

    public final void setSpaceIconInfo(int i) {
        this.k = i;
        requestLayout();
    }

    public final void setSubtitleText(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public final void setSubtitleTextAppearance(int i) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        this.e.setTextAppearance(i);
    }

    public final void setSubtitleTextColor(int i) {
        this.e.setTextColor(i);
    }

    public final void setTimeSpaceX(int i) {
        this.l = i;
        requestLayout();
    }

    public final void setTimeTextAppearance(int i) {
        getTimeAndStatusView().setTimeTextAppearance(i);
    }

    public final void setTimeTextColor(int i) {
        getTimeAndStatusView().setTimeTextColor(i);
    }

    public final void setTimeTranslationY(int i) {
        getTimeAndStatusView().setTranslationY(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void setTitleTextAppearance(int i) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        this.d.setTextAppearance(i);
    }

    public final void setTitleTextColor(int i) {
        this.d.setTextColor(i);
    }

    public MsgPartIconTwoRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public final void setIcon(int i) {
        this.b.setImageResource(i);
    }

    public final void setSubtitleText(int i) {
        this.e.setText(i);
    }

    public final void setTitleText(int i) {
        this.d.setText(i);
    }

    public MsgPartIconTwoRowView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MsgPartIconTwoRowView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MsgPartIconTwoRowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        FixTextView fixTextView = new FixTextView(context, null, 6, 0);
        this.d = fixTextView;
        FixTextView fixTextView2 = new FixTextView(context, null, 6, 0);
        this.e = fixTextView2;
        this.f = new TimeAndStatusView(context, null, 0, 14, 0);
        ProgressView progressView = new ProgressView(context);
        f4m.j(progressView);
        this.c = progressView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.r, i, i2);
        setupAttrsStyle(obtainStyledAttributes);
        progressView.setMaximumWidth(this.i);
        progressView.setMaximumHeight(this.j);
        progressView.setProgressMin(3);
        progressView.setProgressMax(1000);
        progressView.setProgressValue(3);
        progressView.setLineDownScaleThreshold(iah0.a(32));
        progressView.setCancelIconSize(this.i / 2.0f);
        progressView.setCancelIconVisible(true);
        if (obtainStyledAttributes.hasValue(20)) {
            progressView.setLineWidth(obtainStyledAttributes.getDimensionPixelSize(20, iah0.a(3)));
        }
        if (obtainStyledAttributes.hasValue(19)) {
            progressView.setLinePadding(obtainStyledAttributes.getDimensionPixelSize(19, iah0.a(2)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            progressView.setLayerColor(obtainStyledAttributes.getColor(17, 0));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            progressView.setLineColor(obtainStyledAttributes.getColor(18, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            progressView.setCancelIconDrawable(obtainStyledAttributes.getDrawable(15));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            progressView.setCancelIconTintColor(obtainStyledAttributes.getColor(16, -1));
        }
        obtainStyledAttributes.recycle();
        imageView.setImportantForAccessibility(4);
        fixTextView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fixTextView.setEllipsize(truncateAt);
        fixTextView2.setLines(1);
        fixTextView2.setEllipsize(truncateAt);
        getTimeAndStatusView().setImportantForAccessibility(4);
        addView(imageView);
        addView(fixTextView);
        addView(fixTextView2);
        addView(getTimeAndStatusView());
        addView(progressView);
    }

    @Override // xsna.hux0
    public final void X3() {
    }
}
