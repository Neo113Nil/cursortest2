package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lo extends FrameLayout {
    private ImageView gm;
    private AnimatorSet kj;
    private ImageView oo;
    private Context pcc;
    private AnimatorSet qf;
    private ImageView sf;
    private TextView vj;
    private AnimatorSet vy;
    private AnimatorSet wh;

    public lo(@NonNull Context context) {
        super(context);
        this.wh = new AnimatorSet();
        this.qf = new AnimatorSet();
        this.kj = new AnimatorSet();
        this.vy = new AnimatorSet();
        this.pcc = context;
        gm();
    }

    private void gm() {
        ImageView imageView = new ImageView(this.pcc);
        this.oo = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 30.0f);
        addView(this.oo, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.pcc);
        this.gm = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 50.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 30.0f);
        addView(this.gm, layoutParams2);
        ImageView imageView3 = new ImageView(this.pcc);
        this.sf = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 80.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 30.0f);
        addView(this.sf, layoutParams3);
        TextView textView = new TextView(this.pcc);
        this.vj = textView;
        textView.setTextColor(-1);
        this.vj.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.vj, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.lo.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) lo.this.sf.getLayoutParams();
                layoutParams5.topMargin = (int) ((lo.this.gm.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(lo.this.getContext(), 7.0f));
                int pcc = (-lo.this.gm.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(lo.this.pcc, 30.0f));
                layoutParams5.leftMargin = pcc;
                layoutParams5.setMarginStart(pcc);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                lo.this.sf.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) lo.this.oo.getLayoutParams();
                layoutParams6.topMargin = (int) ((lo.this.gm.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(lo.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((lo.this.gm.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(lo.this.pcc, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                lo.this.oo.setLayoutParams(layoutParams6);
            }
        });
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sf, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.gm, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.gm, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.oo, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.kj.setDuration(300L);
        this.kj.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.sf, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.lo.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lo.this.oo.getLayoutParams();
                layoutParams.width = num.intValue();
                lo.this.oo.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.gm, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.vy.setDuration(1500L);
        this.vy.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.sf, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.oo, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.gm, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.qf.setDuration(50L);
        this.qf.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.wh.playSequentially(this.kj, this.vy, this.qf);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void pcc() {
        oo();
        this.wh.start();
        this.wh.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.wh.lo.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                lo.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.lo.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lo.this.wh.start();
                    }
                }, 200L);
            }
        });
    }

    public void setGuideText(String str) {
        this.vj.setText(str);
    }

    public void sf() {
        try {
            AnimatorSet animatorSet = this.wh;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.kj;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.vy;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.qf;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }
}
