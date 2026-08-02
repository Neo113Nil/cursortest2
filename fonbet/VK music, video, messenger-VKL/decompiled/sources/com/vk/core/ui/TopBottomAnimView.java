package com.vk.core.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import xsna.e8p0;
import xsna.iah0;
import xsna.o1;

/* compiled from: TopBottomAnimView.kt */
/* loaded from: classes17.dex */
public final class TopBottomAnimView extends View {
    public ObjectAnimator b;
    public float c;

    public TopBottomAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVisibility$lambda$1$lambda$0(TopBottomAnimView topBottomAnimView) {
        if (topBottomAnimView.getHeight() != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(topBottomAnimView, (Property<TopBottomAnimView, Float>) View.TRANSLATION_Y, topBottomAnimView.getHeight() + iah0.u(), topBottomAnimView.getHeight() * (-1));
            ofFloat.setDuration(2500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new e8p0(topBottomAnimView));
            topBottomAnimView.b = ofFloat;
        }
        ObjectAnimator objectAnimator = topBottomAnimView.b;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused() || !objectAnimator.isStarted()) {
                objectAnimator.start();
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        objectAnimator.pause();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        ObjectAnimator objectAnimator;
        super.setVisibility(i);
        if (i != 0) {
            if (i == 8 && (objectAnimator = this.b) != null && objectAnimator.isRunning()) {
                objectAnimator.pause();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimator2 = this.b;
        if (objectAnimator2 != null && (objectAnimator2.isPaused() || !objectAnimator2.isStarted())) {
            objectAnimator2.start();
        }
        if (this.b == null) {
            postDelayed(new o1(this, 16), 100L);
        }
    }
}
