package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes12.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.e0 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ g e;

    public h(View view, ViewPropertyAnimator viewPropertyAnimator, g gVar, RecyclerView.e0 e0Var) {
        this.e = gVar;
        this.b = e0Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.setAlpha(1.0f);
        g gVar = this.e;
        RecyclerView.e0 e0Var = this.b;
        gVar.A(e0Var);
        gVar.q.remove(e0Var);
        gVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e.getClass();
    }
}
