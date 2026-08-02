package com.vk.attachpicker;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.frb;
import xsna.hl7;
import xsna.n8g;
import xsna.q01;
import xsna.sda0;
import xsna.sly;
import xsna.v16;
import xsna.w16;

/* compiled from: PhotoVideoAttachAnimationController.kt */
/* loaded from: classes15.dex */
public final class a implements sly {
    public final b a;
    public final v16 b;
    public final w16 c;
    public final Window d;
    public final int e;
    public boolean f;
    public final AccelerateDecelerateInterpolator g = new AccelerateDecelerateInterpolator();
    public final AccelerateDecelerateInterpolator h = new AccelerateDecelerateInterpolator();
    public final LinearInterpolator i = new LinearInterpolator();
    public final ArrayList j = new ArrayList();
    public float k;

    /* compiled from: PhotoVideoAttachAnimationController.kt */
    public static final class b {
        public final View a;
        public final View b;
        public final View c;
        public final VkButton d;
        public final ViewGroup e;
        public final ViewGroup f;

        public b(View view, View view2, View view3, VkButton vkButton, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.a = view;
            this.b = view2;
            this.c = view3;
            this.d = vkButton;
            this.e = viewGroup;
            this.f = viewGroup2;
        }
    }

    public a(b bVar, v16 v16Var, w16 w16Var, Window window, int i) {
        this.a = bVar;
        this.b = v16Var;
        this.c = w16Var;
        this.d = window;
        this.e = i;
    }

    public final void a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(0L);
        int i = 1;
        int i2 = 0;
        float[] fArr = z ? new float[]{this.k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{this.k, 1.0f};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(this.g);
        ofFloat.addUpdateListener(new sda0(this, i2));
        ofFloat.addListener(new C0379a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        ofFloat2.setDuration(400L);
        ofFloat2.setInterpolator(this.h);
        ofFloat2.addUpdateListener(new hl7(this, 2));
        ofFloat2.addListener(new C0379a());
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        ofFloat3.setDuration(800L);
        ofFloat3.setInterpolator(this.i);
        ofFloat3.addUpdateListener(new frb(this, i));
        ofFloat3.addListener(new C0379a());
        animatorSet.playTogether(ofFloat3, ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void b(float f) {
        float f2 = f * 0.4f;
        b bVar = this.a;
        bVar.b.setAlpha(f2);
        bVar.a.setAlpha(f2);
        this.d.setStatusBarColor(n8g.d(f2, this.e, -16777216));
    }

    public final void c(boolean z) {
        b bVar = this.a;
        VkButton vkButton = bVar.d;
        View view = bVar.c;
        View view2 = bVar.b;
        View view3 = bVar.a;
        boolean z2 = this.f;
        boolean z3 = !z2 && z;
        boolean z4 = z2 && !z;
        this.f = z;
        q01 q01Var = new q01(this, 10);
        v16 v16Var = this.b;
        view3.setOnClickListener(z ? v16Var : null);
        if (!z) {
            v16Var = null;
        }
        view2.setOnClickListener(v16Var);
        if (!z) {
            q01Var = null;
        }
        view.setOnClickListener(q01Var);
        vkButton.setOnClickListener(z ? this.c : null);
        view2.setClickable(z);
        view3.setClickable(z);
        view.setClickable(z);
        vkButton.setClickable(z);
        if (z3) {
            a(false);
        }
        if (z4) {
            a(true);
        }
    }

    /* compiled from: PhotoVideoAttachAnimationController.kt */
    /* renamed from: com.vk.attachpicker.a$a, reason: collision with other inner class name */
    public static final class C0379a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.removeAllListeners();
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
