package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.drawable.Drawable;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.polls.Poll;
import com.vk.stories.design.view.polls.VoteProgressButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.awt0;
import xsna.mxt0;
import xsna.qq2;
import xsna.rqb0;
import xsna.tqb0;

/* compiled from: InteractivePollStickerView.kt */
/* loaded from: classes6.dex */
public final class d {
    public final /* synthetic */ InteractivePollStickerView a;

    public d(InteractivePollStickerView interactivePollStickerView) {
        this.a = interactivePollStickerView;
    }

    public final void a() {
        this.a.c.b.a.play();
    }

    public final void b() {
        this.a.c.b.a.pause();
    }

    public final void c() {
        this.a.c(R.string.err_internal);
    }

    public final void d(Poll poll, boolean z) {
        InteractivePollStickerView interactivePollStickerView = this.a;
        interactivePollStickerView.a(poll, z);
        if (z) {
            interactivePollStickerView.c.a.e.b = poll;
        }
    }

    public final void e(boolean z) {
        InteractivePollStickerView interactivePollStickerView = this.a;
        LinearLayout linearLayout = interactivePollStickerView.h;
        if (!z) {
            AnimatorSet animatorSet = interactivePollStickerView.k;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            TransitionSet duration = new AutoTransition().setInterpolator((TimeInterpolator) qq2.f).setDuration(200L);
            for (View view : awt0.d(linearLayout)) {
                tqb0 tqb0Var = (tqb0) view;
                duration.excludeTarget((View) tqb0Var.c, true).excludeTarget((View) tqb0Var.b, true);
            }
            TransitionManager.beginDelayedTransition(interactivePollStickerView, duration);
            return;
        }
        AnimatorSet animatorSet2 = interactivePollStickerView.k;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        TransitionSet duration2 = new AutoTransition().setInterpolator((TimeInterpolator) qq2.f).setDuration(200L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (View view2 : awt0.d(linearLayout)) {
            tqb0 tqb0Var2 = (tqb0) view2;
            Drawable background = tqb0Var2.getBackground();
            if (background instanceof rqb0) {
                ((rqb0) background).a(0, false);
            }
            if (tqb0Var2.getVisibility() == 0) {
                TextView textView = tqb0Var2.c;
                Transition excludeTarget = duration2.excludeTarget((View) textView, true);
                CheckBox checkBox = tqb0Var2.d;
                excludeTarget.excludeTarget((View) checkBox, true).excludeTarget((View) tqb0Var2.b, true);
                checkBox.setVisibility(4);
                textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                textView.setTranslationX(tqb0.g);
                AnimatorSet animatorSet4 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                qq2.g(ofFloat, 2.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f);
                ofFloat2.setInterpolator(qq2.f);
                animatorSet4.playTogether(ofFloat, ofFloat2);
                animatorSet4.setDuration(600L);
                arrayList.add(animatorSet4);
            }
        }
        animatorSet3.playTogether(arrayList);
        animatorSet3.start();
        interactivePollStickerView.k = animatorSet3;
        TransitionManager.beginDelayedTransition(interactivePollStickerView, duration2);
    }

    public final void f(boolean z) {
        VoteProgressButton voteProgressButton = this.a.j;
        if (z) {
            voteProgressButton.u.setVisibility(0);
        } else {
            voteProgressButton.u.setVisibility(8);
        }
    }

    public final void g(int i, boolean z) {
        View a = mxt0.a(i, this.a.h);
        tqb0 tqb0Var = a instanceof tqb0 ? (tqb0) a : null;
        if (tqb0Var == null) {
            return;
        }
        TextView textView = tqb0Var.c;
        ProgressBar progressBar = tqb0Var.e;
        if (z) {
            progressBar.setVisibility(tqb0Var.getVisibility());
            textView.setVisibility(4);
        } else {
            progressBar.setVisibility(8);
            textView.setVisibility(0);
        }
    }
}
