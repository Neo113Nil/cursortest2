package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes12.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ g.d b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ g e;

    public k(g gVar, g.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = gVar;
        this.b = dVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        View view = this.d;
        view.setAlpha(1.0f);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        g.d dVar = this.b;
        RecyclerView.e0 e0Var = dVar.a;
        g gVar = this.e;
        gVar.h(e0Var);
        gVar.r.remove(dVar.a);
        gVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.e0 e0Var = this.b.a;
        this.e.getClass();
    }
}
