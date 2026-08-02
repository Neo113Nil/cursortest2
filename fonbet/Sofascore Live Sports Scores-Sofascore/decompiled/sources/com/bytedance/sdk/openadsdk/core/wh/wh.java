package com.bytedance.sdk.openadsdk.core.wh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends FrameLayout {
    private Drawable gm;
    private boolean kj;
    private Drawable oo;
    private int pcc;
    private ValueAnimator qf;
    private int sf;
    private Drawable vj;
    private boolean wh;

    public wh(Context context) {
        super(context);
        this.pcc = 100;
    }

    private void pcc() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.qf = ofInt;
        ofInt.setDuration(2000L);
        this.qf.setRepeatCount(-1);
        this.qf.setInterpolator(new LinearInterpolator());
        this.qf.setRepeatMode(1);
        this.qf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.wh.wh.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wh.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.qf.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.wh = true;
        if (this.vj != null) {
            pcc();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.wh = false;
        ValueAnimator valueAnimator = this.qf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.qf.removeAllUpdateListeners();
            this.qf = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ValueAnimator valueAnimator = this.qf;
            if (valueAnimator == null || this.kj) {
                return;
            }
            this.kj = true;
            valueAnimator.pause();
            return;
        }
        if (this.kj) {
            this.kj = false;
            ValueAnimator valueAnimator2 = this.qf;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                pcc();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.vj = drawable;
        setProgressDrawable(drawable);
        if (this.wh && this.qf == null) {
            pcc();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(vy.pcc(this, layoutParams));
    }

    public void setMax(int i) {
        this.pcc = i;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setProgress(int i) {
        this.sf = i;
        Drawable drawable = this.gm;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.pcc));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.oo = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.oo;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.oo).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.gm = drawable3;
                }
            }
        }
        Drawable drawable4 = this.oo;
        if (drawable4 instanceof RotateDrawable) {
            this.gm = drawable4;
        }
    }

    public wh(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pcc = 100;
    }
}
