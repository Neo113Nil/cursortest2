package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends FrameLayout {
    private tz gm;
    private AnimatorSet oo;
    private Context pcc;
    private ImageView sf;
    private boolean vj;

    public gbb(@NonNull Context context) {
        super(context);
        this.vj = true;
        this.pcc = context;
        this.oo = new AnimatorSet();
        gm();
        oo();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.gbb.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gbb.this.sf.getLayoutParams();
                layoutParams.topMargin = (int) ((gbb.this.gm.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(gbb.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((gbb.this.gm.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(gbb.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.oo.qf.pcc(gbb.this.getContext(), 5.0f) + ((-gbb.this.gm.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.oo.qf.pcc(gbb.this.getContext(), 5.0f) + ((-gbb.this.gm.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                gbb.this.sf.setLayoutParams(layoutParams);
            }
        });
    }

    private void gm() {
        this.gm = new tz(this.pcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 40.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.gm, layoutParams);
        this.sf = new ImageView(this.pcc);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 62.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 62.0f));
        layoutParams2.gravity = 16;
        this.sf.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_splash_hand"));
        addView(this.sf, layoutParams2);
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sf, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.wh.gbb.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (gbb.this.vj) {
                    gbb.this.gm.pcc();
                }
                gbb.this.vj = !r0.vj;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gbb.this.sf, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                gbb.this.sf.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.sf, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.oo.playTogether(ofFloat, ofFloat2);
    }

    public void pcc() {
        this.oo.start();
    }

    public void sf() {
        AnimatorSet animatorSet = this.oo;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tz tzVar = this.gm;
        if (tzVar != null) {
            tzVar.sf();
        }
        ImageView imageView = this.sf;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
