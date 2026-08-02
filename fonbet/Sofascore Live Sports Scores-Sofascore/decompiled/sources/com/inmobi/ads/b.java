package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C3898y1;
import com.inmobi.media.C3924z1;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f, float f2) {
        animationType.getClass();
        int i = a.a[animationType.ordinal()];
        if (i == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i == 2) {
            C3898y1 c3898y1 = new C3898y1(f / 2.0f, f2 / 2.0f);
            c3898y1.setDuration(500L);
            c3898y1.setFillAfter(false);
            c3898y1.setInterpolator(new AccelerateInterpolator());
            return c3898y1;
        }
        if (i != 3) {
            return null;
        }
        C3924z1 c3924z1 = new C3924z1(f / 2.0f, f2 / 2.0f);
        c3924z1.setDuration(500L);
        c3924z1.setFillAfter(false);
        c3924z1.setInterpolator(new AccelerateInterpolator());
        return c3924z1;
    }
}
