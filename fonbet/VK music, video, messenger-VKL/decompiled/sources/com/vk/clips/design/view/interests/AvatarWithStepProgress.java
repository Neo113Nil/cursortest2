package com.vk.clips.design.view.interests;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.vk.clips.interests.impl.ui.FlyAnimationConsumer;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.pkn0;
import xsna.ys5;

/* compiled from: AvatarWithStepProgress.kt */
/* loaded from: classes16.dex */
public final class AvatarWithStepProgress extends FrameLayout implements FlyAnimationConsumer {
    public static final /* synthetic */ int j = 0;
    public final VKImageView b;
    public final CircularProgressIndicator c;
    public final LottieAnimationView d;
    public ValueAnimator e;
    public AnimatorSet f;
    public pkn0 g;
    public final AnimatorSet h;
    public final AnimatorSet i;

    /* compiled from: AvatarWithStepProgress.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlyAnimationConsumer.FlyCandidatesAmount.values().length];
            try {
                iArr[FlyAnimationConsumer.FlyCandidatesAmount.FEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlyAnimationConsumer.FlyCandidatesAmount.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AvatarWithStepProgress.kt */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.removeListener(this);
            int i = AvatarWithStepProgress.j;
            AvatarWithStepProgress avatarWithStepProgress = AvatarWithStepProgress.this;
            LottieAnimationView lottieAnimationView = avatarWithStepProgress.d;
            lottieAnimationView.W();
            lottieAnimationView.clearAnimation();
            bwt0.p0(lottieAnimationView, false);
            pkn0 pkn0Var = avatarWithStepProgress.g;
            if (pkn0Var != null) {
                pkn0Var.c();
            }
        }
    }

    /* compiled from: AvatarWithStepProgress.kt */
    public static final class c extends AnimatorListenerAdapter {
        public final /* synthetic */ int c;

        public c(int i) {
            this.c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            AvatarWithStepProgress.this.c.setProgress(this.c);
        }
    }

    public AvatarWithStepProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.clips_interests_avatar_with_step_progress, this);
        VKImageView vKImageView = (VKImageView) findViewById(R.id.photo);
        this.b = vKImageView;
        this.c = (CircularProgressIndicator) findViewById(R.id.progress);
        this.d = (LottieAnimationView) findViewById(R.id.conf_animation);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vKImageView, (Property<VKImageView, Float>) property, 1.0f, 0.9f);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(vKImageView, (Property<VKImageView, Float>) property2, 1.0f, 0.9f));
        this.h = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(100L);
        animatorSet2.playTogether(ObjectAnimator.ofFloat(vKImageView, (Property<VKImageView, Float>) property, 0.9f, 1.0f), ObjectAnimator.ofFloat(vKImageView, (Property<VKImageView, Float>) property2, 0.9f, 1.0f));
        this.i = animatorSet2;
    }

    @Override // com.vk.clips.interests.impl.ui.FlyAnimationConsumer
    public final void a() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet == null || animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new b());
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView = this.d;
        lottieAnimationView.W();
        lottieAnimationView.clearAnimation();
        bwt0.p0(lottieAnimationView, false);
        pkn0 pkn0Var = this.g;
        if (pkn0Var != null) {
            pkn0Var.c();
        }
    }

    @Override // com.vk.clips.interests.impl.ui.FlyAnimationConsumer
    public final void b(pkn0 pkn0Var, FlyAnimationConsumer.FlyCandidatesAmount flyCandidatesAmount) {
        this.g = pkn0Var;
        pkn0Var.b();
        int i = a.$EnumSwitchMapping$0[flyCandidatesAmount.ordinal()];
        LottieAnimationView lottieAnimationView = this.d;
        if (i == 1) {
            lottieAnimationView.setAnimation(R.raw.clips_interests_conf_in_short);
            lottieAnimationView.m0();
            bwt0.p0(lottieAnimationView, true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lottieAnimationView.setAnimation(R.raw.clips_interests_conf_in_long);
            lottieAnimationView.m0();
            bwt0.p0(lottieAnimationView, true);
        }
    }

    @Override // com.vk.clips.interests.impl.ui.FlyAnimationConsumer
    public final void c() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(this.h, this.i);
        animatorSet2.start();
        this.f = animatorSet2;
    }

    public final void setImage(String str) {
        VKImageView vKImageView = this.b;
        vKImageView.load(str);
        vKImageView.getHierarchy().u(RoundingParams.a());
    }

    public final void setProgress(int i) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.c.getProgress(), i);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ys5(this, 0));
        ofInt.addListener(new c(i));
        ofInt.start();
        this.e = ofInt;
    }
}
