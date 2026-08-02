package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends FrameLayout {
    private boolean gm;
    private int kj;
    private View oo;
    private Context ork;
    private AnimatorSet pcc;
    private ImageView qf;
    private ObjectAnimator sf;
    private View vj;
    private int vy;
    private View wh;

    public sf(Context context, int i, int i2) {
        super(context);
        this.gm = false;
        this.pcc = new AnimatorSet();
        this.kj = i;
        this.vy = i2;
        this.ork = context;
        gm();
        oo();
    }

    private void gm() {
        View view = new View(this.ork);
        this.oo = view;
        view.setBackground(pcc("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.kj * 0.45d), (int) (this.vy * 0.45d));
        layoutParams.gravity = 17;
        this.oo.setLayoutParams(layoutParams);
        addView(this.oo);
        View view2 = new View(this.ork);
        this.vj = view2;
        view2.setBackground(pcc("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.kj * 0.25d), (int) (this.vy * 0.25d));
        layoutParams2.gravity = 17;
        this.vj.setLayoutParams(layoutParams2);
        addView(this.vj);
        View view3 = new View(this.ork);
        this.wh = view3;
        view3.setBackground(pcc("#807BBEFF", "#FF7BBEFF"));
        int i = this.kj;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i * 0.25d), (int) (i * 0.25d));
        layoutParams3.gravity = 17;
        this.wh.setLayoutParams(layoutParams3);
        addView(this.wh);
        ImageView imageView = new ImageView(this.ork);
        this.qf = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_blue_hand"));
        this.qf.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.kj * 0.62d), (int) (this.vy * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.qf.setLayoutParams(layoutParams4);
        addView(this.qf);
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.oo, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.oo, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.vj, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.vj, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.wh, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.wh, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.qf, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.sf = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.pcc.setDuration(1500L);
        this.pcc.setInterpolator(new AccelerateDecelerateInterpolator());
        this.pcc.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.pcc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.wh.sf.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                sf.this.gm = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (sf.this.gm) {
                    return;
                }
                sf.this.sf.start();
                sf.this.pcc.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private GradientDrawable pcc(String str, String str2) {
        GradientDrawable b = w1l.b(1);
        b.setColor(Color.parseColor(str));
        b.setStroke(1, Color.parseColor(str2));
        return b;
    }

    public void sf() {
        this.gm = true;
        ObjectAnimator objectAnimator = this.sf;
        if (objectAnimator == null || this.pcc == null) {
            return;
        }
        objectAnimator.cancel();
        this.pcc.cancel();
    }

    public void pcc() {
        this.gm = false;
        ObjectAnimator objectAnimator = this.sf;
        if (objectAnimator == null || this.pcc == null) {
            return;
        }
        objectAnimator.start();
        this.pcc.start();
    }
}
