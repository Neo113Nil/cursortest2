package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.ironsource.Ua;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    protected final int gm;
    private AnimatorSet kj;
    com.bytedance.sdk.openadsdk.core.widget.kj oo;
    protected final of pcc;
    private com.bytedance.sdk.openadsdk.core.widget.qf qf;
    protected final Activity sf;
    protected com.bytedance.sdk.openadsdk.core.gm.vj vj;
    protected final String wh;

    public pcc(Activity activity, of ofVar, int i, String str) {
        this.sf = activity;
        this.pcc = ofVar;
        this.gm = i;
        this.wh = str;
    }

    public void gm() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(2000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.pcc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.kj kjVar = pcc.this.oo;
                if (kjVar != null) {
                    kjVar.setProgress(intValue);
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(Ua.C);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.pcc.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.kj kjVar = pcc.this.oo;
                if (kjVar != null) {
                    kjVar.setProgress(intValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.kj = animatorSet;
        animatorSet.play(ofInt).before(ofInt2);
        this.kj.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.pcc.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        this.kj.start();
    }

    public void oo() {
        AnimatorSet animatorSet = this.kj;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void pcc() {
        try {
            if (atb.gm(this.pcc)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.qf qfVar = new com.bytedance.sdk.openadsdk.core.widget.qf(this.sf);
            this.qf = qfVar;
            this.oo = qfVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.wh.kj downloadButton = this.qf.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.vj);
            }
            this.qf.pcc(this.pcc, this.gm);
            this.qf.pcc(this.pcc, this.sf, this.wh);
        } catch (Throwable unused) {
        }
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.core.widget.qf qfVar = this.qf;
        if (qfVar != null) {
            qfVar.bringToFront();
        }
    }

    public void vj() {
        com.bytedance.sdk.openadsdk.core.widget.qf qfVar = this.qf;
        if (qfVar != null) {
            qfVar.setVisibility(8);
        }
    }

    public View wh() {
        return this.qf;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        this.vj = vjVar;
    }
}
