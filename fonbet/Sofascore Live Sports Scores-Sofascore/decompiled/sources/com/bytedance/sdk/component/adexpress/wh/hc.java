package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc extends FrameLayout {
    private oo gm;
    private AnimatorSet oo;
    private Context pcc;
    private ImageView sf;
    private boolean vj;
    private TextView wh;

    public hc(@NonNull Context context) {
        super(context);
        this.vj = true;
        this.pcc = context;
        this.oo = new AnimatorSet();
        gm();
        oo();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.hc.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hc.this.sf.getLayoutParams();
                layoutParams.topMargin = ((int) ((hc.this.gm.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(hc.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(hc.this.pcc, 20.0f));
                layoutParams.leftMargin = ((int) ((hc.this.gm.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(hc.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(hc.this.pcc, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.oo.qf.pcc(hc.this.getContext(), 5.0f) + ((-hc.this.gm.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.oo.qf.pcc(hc.this.getContext(), 5.0f) + ((-hc.this.gm.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                hc.this.sf.setLayoutParams(layoutParams);
            }
        });
    }

    private void gm() {
        this.gm = new oo(this.pcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 80.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 20.0f);
        int pcc = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 20.0f);
        layoutParams.leftMargin = pcc;
        layoutParams.setMarginStart(pcc);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.gm, layoutParams);
        this.gm.pcc();
        this.sf = new ImageView(this.pcc);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 80.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 80.0f));
        this.sf.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_splash_hand"));
        addView(this.sf, layoutParams2);
        TextView textView = new TextView(this.pcc);
        this.wh = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 10.0f);
        addView(this.wh, layoutParams3);
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sf, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.wh.hc.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                boolean z = hc.this.vj;
                hc hcVar = hc.this;
                if (z) {
                    hcVar.gm.pcc();
                    hc.this.gm.setAlpha(1.0f);
                } else {
                    hcVar.gm.sf();
                    hc.this.gm.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                hc.this.vj = !r1.vj;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hc.this.sf, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                hc.this.sf.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.sf, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.oo.playTogether(ofFloat, ofFloat2);
    }

    public void pcc() {
        this.oo.start();
    }

    public void setGuideText(String str) {
        this.wh.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.wh.setTextColor(i);
    }

    public void sf() {
        AnimatorSet animatorSet = this.oo;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.sf();
        }
    }
}
