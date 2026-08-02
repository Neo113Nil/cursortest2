package com.vk.feed.tool.view.newsfeed.music;

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
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import xsna.cn70;
import xsna.qq2;

/* compiled from: RunningLineTextView.kt */
/* loaded from: classes18.dex */
public final class RunningLineTextView extends VkText {
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
    public final VkText m;
    public final ValueAnimator n;

    public RunningLineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void b() {
        if (this.k) {
            return;
        }
        e(0L);
    }

    public final void e(long j) {
        this.l = true;
        ValueAnimator valueAnimator = this.n;
        valueAnimator.setStartDelay(j);
        valueAnimator.start();
    }

    public final void f() {
        this.l = false;
        this.n.cancel();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.k;
        VkText vkText = this.m;
        if (z) {
            vkText.getPaint().setShader(null);
            vkText.draw(canvas);
            return;
        }
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
        float f3 = (vkText.getMeasuredWidth() - getWidth() > 0 || i4 > 1) ? 0.0f : max * 12.0f * f;
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
            vkText.getPaint().setShader(this.d);
            vkText.draw(canvas);
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
                    vkText.getPaint().setShader(linearGradient);
                    vkText.draw(canvas);
                    canvas.translate(i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i6 += i3;
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        VkText vkText = this.m;
        vkText.layout(i, i2, vkText.getMeasuredWidth() + i, i4);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        VkText vkText = this.m;
        vkText.measure(0, i2);
        this.j = (int) vkText.getPaint().measureText(getText().toString());
        long min = (long) ((Math.min(vkText.getMeasuredWidth(), this.j) / cn70.b(200)) * 6500);
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
        VkText vkText = this.m;
        if (vkText != null) {
            vkText.setText(charSequence);
            requestLayout();
        }
    }

    @Override // com.vk.core.view.components.text.VkText, android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        this.m.setTextAppearance(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunningLineTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, r3, 0);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        float a2 = cn70.a() * 12.0f;
        float height = getHeight();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a2, height, -1, 0, tileMode);
        this.b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 12.0f, getHeight(), -1, 0, tileMode);
        this.c = linearGradient2;
        this.d = new ComposeShader(linearGradient, linearGradient2, PorterDuff.Mode.SRC_OUT);
        this.e = new Matrix();
        this.f = new Matrix();
        this.h = cn70.b(12);
        this.i = cn70.a() * 12.0f;
        VkText vkText = new VkText(context, attributeSet2, 0);
        this.m = vkText;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.csg0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = RunningLineTextView.o;
                RunningLineTextView.this.invalidate();
            }
        };
        a aVar = new a(context);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
        ofFloat.setDuration(6500L);
        ofFloat.setStartDelay(0L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.addListener(aVar);
        this.n = ofFloat;
        vkText.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        vkText.setSingleLine(true);
    }

    /* compiled from: RunningLineTextView.kt */
    public final class a implements Animator.AnimatorListener {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            RunningLineTextView runningLineTextView = RunningLineTextView.this;
            ValueAnimator valueAnimator = runningLineTextView.n;
            if (!runningLineTextView.l || qq2.d(this.c)) {
                return;
            }
            valueAnimator.setStartDelay(1000L);
            valueAnimator.start();
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
