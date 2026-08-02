package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.im.engine.models.c;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.a1w;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.q1w;
import xsna.too0;
import xsna.zl10;

/* compiled from: ScrollToBottomView.kt */
/* loaded from: classes2.dex */
public final class ScrollToBottomView extends ViewGroup implements too0 {
    public static final int e = cn70.b(42);
    public final AppCompatImageView b;
    public final zl10 c;
    public final AnimatedCounterView d;

    public ScrollToBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.A);
        try {
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            appCompatImageView.setImageDrawable(obtainStyledAttributes.getDrawable(4));
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
            abg0 abg0Var = dhr0.t;
            bwt0.o0(appCompatImageView, abg0Var.c(R.attr.vk_legacy_icon_outline_secondary));
            this.b = appCompatImageView;
            zl10 zl10Var = new zl10(context);
            zl10Var.setCardBackgroundColor(abg0Var.c(R.attr.vk_legacy_modal_card_background));
            zl10Var.setRadius(cn70.c(22));
            zl10Var.setElevation(cn70.c(6));
            zl10Var.setStrokeColor(abg0Var.c(R.attr.vk_legacy_snippet_border));
            zl10Var.setStrokeWidth((int) Math.ceil(cn70.a() * 0.5f));
            zl10Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            zl10Var.addView(appCompatImageView);
            addView(zl10Var);
            this.c = zl10Var;
            AnimatedCounterView b = b(obtainStyledAttributes);
            addView(b);
            this.d = b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final c getExperiments() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        a1wVar.getClass();
        return a1wVar.r().h;
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_legacy_modal_card_background);
        zl10 zl10Var = this.c;
        zl10Var.setCardBackgroundColor(c);
        zl10Var.setStrokeColor(abg0Var.c(R.attr.vk_legacy_snippet_border));
        bwt0.o0(this.b, abg0Var.c(R.attr.vk_legacy_icon_outline_secondary));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        AnimatedCounterView animatedCounterView = this.d;
        if (animatedCounterView != 0) {
            animatedCounterView.setBackgroundTintList(ColorStateList.valueOf(i));
            animatedCounterView.getTextPaint().setColor(-1);
        } else {
            AppCompatTextView appCompatTextView = (AppCompatTextView) animatedCounterView;
            appCompatTextView.setBackgroundTintList(ColorStateList.valueOf(i));
            appCompatTextView.setTextColor(-1);
        }
    }

    public final AnimatedCounterView b(TypedArray typedArray) {
        AnimatedCounterView animatedCounterView = new AnimatedCounterView(getContext(), null);
        String string = typedArray.getString(1);
        if (string == null) {
            string = "";
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(3, cn70.b(12));
        animatedCounterView.setElevation(cn70.c(6));
        animatedCounterView.setBackground(typedArray.getDrawable(0));
        TextPaint textPaint = animatedCounterView.getTextPaint();
        b.d(textPaint, a.C1933a.b(animatedCounterView.getContext(), string, dimensionPixelSize, TextSizeUnit.PX), 0);
        textPaint.setColor(typedArray.getColor(2, -1));
        return animatedCounterView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        zl10 zl10Var = this.c;
        zl10Var.layout(paddingLeft, paddingTop, zl10Var.getMeasuredWidth() + paddingLeft, zl10Var.getMeasuredHeight() + paddingTop);
        int paddingLeft2 = getPaddingLeft() + e;
        AnimatedCounterView animatedCounterView = this.d;
        int measuredWidth = paddingLeft2 - (animatedCounterView.getMeasuredWidth() / 2);
        int paddingTop2 = getPaddingTop();
        animatedCounterView.layout(measuredWidth, paddingTop2, animatedCounterView.getMeasuredWidth() + measuredWidth, animatedCounterView.getMeasuredHeight() + paddingTop2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        zl10 zl10Var = this.c;
        measureChild(zl10Var, i, i2);
        AnimatedCounterView animatedCounterView = this.d;
        measureChild(animatedCounterView, i, i2);
        int max = Math.max(zl10Var.getMeasuredWidth(), (animatedCounterView.getMeasuredWidth() / 2) + e);
        int max2 = Math.max(zl10Var.getMeasuredHeight(), animatedCounterView.getMeasuredHeight());
        setMeasuredDimension(Math.max(getPaddingRight() + getPaddingLeft() + max, getSuggestedMinimumWidth()), Math.max(getPaddingBottom() + getPaddingTop() + max2, getSuggestedMinimumHeight()));
    }

    public final void setCounter(int i) {
        AnimatedCounterView animatedCounterView = this.d;
        if (i <= 0) {
            animatedCounterView.setVisibility(8);
        } else {
            animatedCounterView.setVisibility(0);
            AnimatedCounterView.c(animatedCounterView, i);
        }
    }

    public final void setIconDrawable(int i) {
        this.b.setImageResource(i);
    }
}
