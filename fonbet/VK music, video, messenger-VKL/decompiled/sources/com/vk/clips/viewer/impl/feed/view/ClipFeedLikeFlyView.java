package com.vk.clips.viewer.impl.feed.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.view.ClipFeedLikeFlyView;
import kotlin.Pair;
import xsna.avr;
import xsna.izs;

/* compiled from: ClipFeedLikeFlyView.kt */
/* loaded from: classes17.dex */
public final class ClipFeedLikeFlyView extends avr {
    public static final /* synthetic */ int l = 0;
    public final OvershootInterpolator k;

    public ClipFeedLikeFlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.k = new OvershootInterpolator(2.0f);
    }

    @Override // xsna.avr
    public final void c(final ImageView imageView) {
        int i = getMRandom().nextBoolean() ? -1 : 1;
        int nextInt = getMRandom().nextInt(35);
        final int mImageSizePx = (getMImageSizePx() / 2) * i;
        final int i2 = (-getMImageSizePx()) / 2;
        izs<View, ObjectAnimator> customAnimationWhileFlyingProvider = getCustomAnimationWhileFlyingProvider();
        ObjectAnimator invoke = customAnimationWhileFlyingProvider != null ? customAnimationWhileFlyingProvider.invoke(imageView) : null;
        ViewPropertyAnimator animate = imageView.animate();
        getAnimationMap().put(imageView, new Pair<>(animate, invoke));
        imageView.setAlpha(1.0f);
        imageView.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView.setRotation(nextInt * i);
        animate.scaleX(1.0f).scaleY(1.0f).setDuration(350L).setInterpolator(this.k).withEndAction(new Runnable() { // from class: xsna.xwc
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = ClipFeedLikeFlyView.l;
                imageView.animate().translationXBy(mImageSizePx).translationYBy(i2).scaleX(1.3f).scaleY(1.3f).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setInterpolator(this.getInterpolator()).setStartDelay(150L).start();
            }
        }).start();
    }
}
