package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import com.vk.movika.sdk.android.defaultplayer.control.s;
import xsna.f5f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                s.b bVar = (s.b) this.c;
                s sVar = (s) this.d;
                bVar.b = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.13f) + 0.87f;
                double floatValue = (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5f) + 0.5f;
                bVar.c.setAlpha((int) (40.800000000000004d * floatValue));
                bVar.d.setAlpha((int) (floatValue * 142.8d));
                sVar.invalidate();
                break;
            default:
                Paint paint = (Paint) this.c;
                f5f f5fVar = (f5f) this.d;
                paint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                f5fVar.a.invalidate();
                break;
        }
    }
}
