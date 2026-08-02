package com.vk.clips.design.view.component.play;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import defpackage.k;
import kotlin.LazyThreadSafetyMode;
import xsna.f4m;
import xsna.msy;

/* compiled from: ClipPlayPauseView.kt */
/* loaded from: classes16.dex */
public final class ClipPlayPauseView extends AppCompatImageView {
    public static final /* synthetic */ int c = 0;
    public final Object b;

    public ClipPlayPauseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new k(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AnimatorSet getPlayPauseAnimator() {
        return (AnimatorSet) this.b.getValue();
    }

    public final void U(boolean z) {
        getPlayPauseAnimator().cancel();
        if (z) {
            setImageResource(R.drawable.vk_icon_pause_button_64);
        } else {
            setImageResource(R.drawable.vk_icon_play_button_64);
        }
        getPlayPauseAnimator().start();
    }

    public final void V() {
        getPlayPauseAnimator().cancel();
    }

    /* compiled from: Animator.kt */
    public final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f4m.j(ClipPlayPauseView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ClipPlayPauseView.this.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
