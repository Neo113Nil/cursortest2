package com.vk.music.design.view.text;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import xsna.fg10;
import xsna.iah0;

/* compiled from: MarqueeTextView.kt */
/* loaded from: classes3.dex */
public final class MarqueeTextView extends VkText {
    public static final /* synthetic */ int o = 0;
    public final LinearGradient b;
    public final LinearGradient c;
    public final ComposeShader d;
    public final Matrix e;
    public final Matrix f;
    public float g;
    public final int h;
    public final float i;
    public int j;
    public boolean k;
    public boolean l;
    public final TextView m;
    public final ValueAnimator n;

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float b = iah0.b(12.0f);
        float height = getHeight();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, height, -1, 0, tileMode);
        this.b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(12.0f), getHeight(), -1, 0, tileMode);
        this.c = linearGradient2;
        this.d = new ComposeShader(linearGradient, linearGradient2, PorterDuff.Mode.SRC_OUT);
        this.e = new Matrix();
        this.f = new Matrix();
        this.h = iah0.a(20);
        this.i = iah0.b(12.0f);
        TextView textView = new TextView(context, attributeSet, 0);
        this.m = textView;
        fg10 fg10Var = new fg10(this, 0);
        a aVar = new a();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
        ofFloat.setDuration(6500L);
        ofFloat.setStartDelay(0L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(fg10Var);
        ofFloat.addListener(aVar);
        this.n = ofFloat;
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        textView.setSingleLine(true);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.k;
        TextView textView = this.m;
        if (!z) {
            if (this.j > (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) {
                ValueAnimator valueAnimator = this.n;
                float floatValue = valueAnimator.isRunning() ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 0.0f;
                int i = this.j;
                int i2 = this.h;
                this.g = (i + i2) * floatValue;
                float f = 3;
                float max = Math.max(((float) Math.sin(floatValue * 3.141592653589793d)) * f * (valueAnimator.getDuration() / 6500), -1.0f) + 1;
                int i3 = this.j + i2;
                int width = (getWidth() - getPaddingEnd()) - getPaddingStart();
                int i4 = (width / i3) + 1;
                float f2 = (-max) * 12.0f * f;
                float f3 = (textView.getMeasuredWidth() - getWidth() > 0 || i4 > 1) ? 0.0f : max * 12.0f * f;
                Matrix matrix = this.e;
                matrix.reset();
                matrix.postTranslate((-this.g) + f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.b.setLocalMatrix(matrix);
                Matrix matrix2 = this.f;
                matrix2.reset();
                float f4 = width;
                float f5 = (-this.g) + f4;
                float f6 = this.i;
                matrix2.postTranslate((f5 - f6) + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                LinearGradient linearGradient = this.c;
                linearGradient.setLocalMatrix(matrix2);
                int save = canvas.save();
                try {
                    canvas.translate(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textView.getPaint().setShader(this.d);
                    textView.draw(canvas);
                    canvas.restoreToCount(save);
                    float f7 = this.g;
                    int i5 = this.j;
                    if ((i5 - width) + f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return;
                    }
                    float f8 = i5 + f7 + i2;
                    save = canvas.save();
                    try {
                        canvas.translate(f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        int i6 = 0;
                        for (int i7 = 0; i7 < i4; i7++) {
                            matrix2.reset();
                            matrix2.postTranslate(((((-f8) - i6) + f4) - f6) + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            linearGradient.setLocalMatrix(matrix2);
                            textView.getPaint().setShader(linearGradient);
                            textView.draw(canvas);
                            canvas.translate(i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            i6 += i3;
                        }
                        return;
                    } finally {
                    }
                } finally {
                }
            }
        }
        textView.getPaint().setShader(null);
        textView.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.m;
        textView.layout(i, i2, textView.getMeasuredWidth() + i, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView textView = this.m;
        textView.measure(0, i2);
        this.j = (int) textView.getPaint().measureText(getText().toString());
        long min = (long) ((Math.min(textView.getMeasuredWidth(), this.j) / iah0.a(200)) * 6500);
        ValueAnimator valueAnimator = this.n;
        if (min != valueAnimator.getDuration()) {
            valueAnimator.setDuration(min);
        }
    }

    public final void setDisabled(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z) {
                this.n.cancel();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(charSequence);
            requestLayout();
        }
    }

    /* compiled from: MarqueeTextView.kt */
    public final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            MarqueeTextView marqueeTextView = MarqueeTextView.this;
            ValueAnimator valueAnimator = marqueeTextView.n;
            if (marqueeTextView.l) {
                valueAnimator.setStartDelay(1000L);
                valueAnimator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
