package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes12.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.e0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ g e;

    public i(View view, ViewPropertyAnimator viewPropertyAnimator, g gVar, RecyclerView.e0 e0Var) {
        this.e = gVar;
        this.b = e0Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        g gVar = this.e;
        RecyclerView.e0 e0Var = this.b;
        gVar.h(e0Var);
        gVar.o.remove(e0Var);
        gVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e.getClass();
    }
}
