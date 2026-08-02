package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class IAsmoothProgressBar extends ProgressBar {
    public static final AccelerateDecelerateInterpolator c = new AccelerateDecelerateInterpolator();
    public ValueAnimator a;
    public ValueAnimator b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        try {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.a;
            if (valueAnimator2 == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
                this.a = ofInt;
                ofInt.setInterpolator(c);
                this.a.addUpdateListener(new g(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i);
            }
            this.a.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        try {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.b;
            if (valueAnimator2 == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
                this.b = ofInt;
                ofInt.setInterpolator(c);
                this.b.addUpdateListener(new h(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i);
            }
            this.b.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
