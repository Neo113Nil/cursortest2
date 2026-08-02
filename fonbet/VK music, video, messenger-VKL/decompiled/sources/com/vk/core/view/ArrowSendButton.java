package com.vk.core.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.m33;
import xsna.ozl;
import xsna.xo2;

/* compiled from: ArrowSendButton.kt */
@ozl
/* loaded from: classes17.dex */
public final class ArrowSendButton extends ViewGroup {
    public final int b;
    public final float c;
    public final String d;
    public final int e;
    public final AccelerateDecelerateInterpolator f;
    public final OvershootInterpolator g;
    public ViewPropertyAnimator h;
    public int i;
    public final ImageView j;
    public final AppCompatTextView k;

    public ArrowSendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int a = iah0.a(56);
        this.b = a;
        int a2 = iah0.a(20);
        int a3 = iah0.a(1);
        this.c = a2 / a;
        this.d = "999+";
        this.e = 999;
        this.f = new AccelerateDecelerateInterpolator();
        this.g = new OvershootInterpolator();
        ImageView imageView = new ImageView(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        e3m.a aVar = e3m.a;
        shapeDrawable.setTint(context.getColor(R.color.vk_blue_300));
        imageView.setBackground(shapeDrawable);
        imageView.setImageDrawable(m33.a(R.drawable.vk_icon_send_28, context));
        imageView.setColorFilter(-1);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        imageView.setContentDescription(context.getString(R.string.accessibility_send));
        this.j = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setBackground(m33.a(R.drawable.bg_white_circle_with_border, context));
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(context.getColor(R.color.vk_azure_350));
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, null, 6);
        appCompatTextView.setPadding(a3, a3, a3, a3);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(6, 12, 1, 1);
        appCompatTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        bwt0.p0(appCompatTextView, false);
        this.k = appCompatTextView;
        addView(imageView);
        addView(appCompatTextView);
    }

    public static void a(ArrowSendButton arrowSendButton, int i) {
        AppCompatTextView appCompatTextView = arrowSendButton.k;
        if (arrowSendButton.i == i) {
            return;
        }
        arrowSendButton.i = i;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = arrowSendButton.f;
        ViewPropertyAnimator viewPropertyAnimator = null;
        if (i == 0) {
            ViewPropertyAnimator e = xo2.e(appCompatTextView, 200L, null, 13);
            if (e != null) {
                viewPropertyAnimator = e.setInterpolator(accelerateDecelerateInterpolator);
            }
        } else if (f4m.g(appCompatTextView)) {
            appCompatTextView.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            appCompatTextView.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ViewPropertyAnimator d = xo2.d(29, 200L, appCompatTextView);
            if (d != null) {
                viewPropertyAnimator = d.setInterpolator(accelerateDecelerateInterpolator);
            }
        } else {
            appCompatTextView.setScaleX(0.8f);
            appCompatTextView.setScaleY(0.8f);
            viewPropertyAnimator = appCompatTextView.animate().setInterpolator(arrowSendButton.g).scaleX(1.0f).scaleY(1.0f).setDuration(200L);
        }
        arrowSendButton.h = viewPropertyAnimator;
        int i2 = arrowSendButton.i;
        if (i2 != 0) {
            appCompatTextView.setText(i2 <= arrowSendButton.e ? String.valueOf(i2) : arrowSendButton.d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.h;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.h = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingEnd = (i3 - i) - getPaddingEnd();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        this.j.layout(paddingStart, paddingTop, paddingEnd, paddingBottom);
        AppCompatTextView appCompatTextView = this.k;
        if (appCompatTextView.getVisibility() != 8) {
            appCompatTextView.layout(paddingEnd - appCompatTextView.getMeasuredWidth(), paddingBottom - appCompatTextView.getMeasuredHeight(), paddingEnd, paddingBottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b;
        if (mode != 1073741824 && size > i3) {
            size = i3;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824 || size2 <= i3) {
            i3 = size2;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        ImageView imageView = this.j;
        measureChildWithMargins(imageView, makeMeasureSpec, 0, makeMeasureSpec, 0);
        AppCompatTextView appCompatTextView = this.k;
        if (appCompatTextView.getVisibility() != 8) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (imageView.getMeasuredWidth() * this.c), 1073741824);
            appCompatTextView.measure(makeMeasureSpec2, makeMeasureSpec2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        setMeasuredDimension(View.resolveSizeAndState(marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd() + imageView.getMeasuredWidth(), i, imageView.getMeasuredState()), View.resolveSizeAndState(imageView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, i2, imageView.getMeasuredState()));
    }

    public final void setColor(int i) {
        this.j.getBackground().setTint(i);
        this.k.setTextColor(i);
    }
}
