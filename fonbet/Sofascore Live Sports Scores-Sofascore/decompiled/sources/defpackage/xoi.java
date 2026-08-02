package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xoi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ zoi e;

    public xoi(zoi zoiVar, float f, float f2, float f3, float f4) {
        this.e = zoiVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = (valueAnimator.getAnimatedFraction() * this.b) + this.a;
        float animatedFraction2 = (valueAnimator.getAnimatedFraction() * this.d) + this.c;
        zoi zoiVar = this.e;
        zoiVar.c(animatedFraction);
        zoiVar.e.setAlpha(animatedFraction2);
    }
}
