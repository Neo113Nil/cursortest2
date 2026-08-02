package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import xsna.fii0;
import xsna.nic;
import xsna.qor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                p.b((u) this.c, valueAnimator);
                break;
            case 1:
                nic nicVar = (nic) this.c;
                nicVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = nicVar.d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                break;
            case 2:
                qor qorVar = (qor) this.c;
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                qorVar.requestLayout();
                break;
            default:
                ((fii0) this.c).b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
