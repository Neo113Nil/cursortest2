package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.internal.cast.zzgy;
import com.unity3d.services.UnityAdsConstants;
import xsna.e3l0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class b implements View.OnLayoutChangeListener {
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        c cVar = this.b;
        if (cVar.g == null) {
            throw new IllegalStateException("Target view must be set before animation");
        }
        cVar.setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(cVar.n.asView(), "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(350L);
        duration.setInterpolator(zzgy.zza());
        Rect rect = cVar.c;
        OuterHighlightDrawable outerHighlightDrawable = cVar.e;
        float exactCenterX = rect.exactCenterX() - outerHighlightDrawable.i;
        float exactCenterY = rect.exactCenterY() - outerHighlightDrawable.j;
        InnerZoneDrawable innerZoneDrawable = cVar.f;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(outerHighlightDrawable, PropertyValuesHolder.ofFloat("scale", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), PropertyValuesHolder.ofFloat("translationX", exactCenterX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofFloat("translationY", exactCenterY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofInt("alpha", 0, outerHighlightDrawable.m));
        ofPropertyValuesHolder.setInterpolator(zzgy.zza());
        Animator duration2 = ofPropertyValuesHolder.setDuration(350L);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("scale", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), PropertyValuesHolder.ofInt("alpha", 0, 255));
        ofPropertyValuesHolder2.setInterpolator(zzgy.zza());
        Animator duration3 = ofPropertyValuesHolder2.setDuration(350L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        animatorSet.addListener(new e3l0(cVar));
        AnimatorSet animatorSet2 = cVar.h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        cVar.h = animatorSet;
        animatorSet.start();
        cVar.removeOnLayoutChangeListener(this);
    }
}
