package com.vk.stories.design.view.polls;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.polls.Poll;
import com.vk.log.L;
import com.vk.movika.tools.controls.seekbar.i;
import com.vk.polls.entities.exceptions.UserAlreadyVotedException;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import xsna.enj;
import xsna.gtb0;
import xsna.h03;
import xsna.hg1;
import xsna.pg;
import xsna.qg;
import xsna.qq2;
import xsna.trj0;
import xsna.ukl;
import xsna.vvr0;
import xsna.vx2;

/* compiled from: SimplePollView.kt */
/* loaded from: classes6.dex */
public final class SimplePollView extends AbstractPollView implements ukl.a {
    public ukl j0;
    public gtb0 k0;

    public SimplePollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ukl uklVar = new ukl();
        this.j0 = uklVar;
        this.k0 = uklVar;
        addOnAttachStateChangeListener(new trj0(this));
    }

    @Override // xsna.ukl.a
    public final void a() {
        Animator animator = this.D;
        if (animator != null) {
            animator.cancel();
        }
        Transition duration = new AutoTransition().excludeTarget((View) this.r, true).excludeChildren((View) this.y, true).setInterpolator(qq2.f).setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        l(new qg(0, arrayList, duration));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.D = animatorSet;
        TransitionManager.beginDelayedTransition(this, duration);
        vvr0.c();
    }

    @Override // xsna.ukl.a
    public final q b(i0 i0Var) {
        return hg1.m(i0Var, getContext(), 0L, false, 62);
    }

    @Override // xsna.ukl.a
    public final void c(Poll poll) {
        f(poll, true);
    }

    @Override // xsna.ukl.a
    public final void d(Throwable th, Poll poll) {
        L.i(th);
        Integer valueOf = th instanceof UserAlreadyVotedException ? Integer.valueOf(R.string.poll_user_already_voted) : th instanceof UserDidntVoteException ? Integer.valueOf(R.string.poll_user_didnt_vote) : null;
        if (valueOf != null) {
            enj.q(valueOf.intValue(), 0, vx2.d.getContext());
        } else {
            h03.b(th);
        }
        if (getPoll().Ib()) {
            int i = 4;
            this.B.setVisibility(4);
            TextView textView = this.x;
            if (getPoll().Bb() && !getPoll().x.isEmpty()) {
                i = 0;
            }
            textView.setVisibility(i);
        }
        l(new pg(this, 0));
        if (poll != null) {
            f(getPoll(), false);
        }
    }

    @Override // xsna.ukl.a
    public final void e() {
        Animator animator = this.D;
        if (animator != null) {
            animator.cancel();
        }
        Transition excludeChildren = new AutoTransition().setInterpolator((TimeInterpolator) qq2.f).setDuration(200L).excludeTarget((View) this.z, true).excludeChildren((View) this.y, true);
        l(new i(excludeChildren, 2));
        TransitionManager.beginDelayedTransition(this, excludeChildren);
    }

    @Override // xsna.ukl.a
    public Poll getCurrentPoll() {
        return getPoll();
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView
    public gtb0 getPollVoteController() {
        return this.k0;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView
    public void setPollVoteController(gtb0 gtb0Var) {
        this.k0 = gtb0Var;
    }
}
