package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f2479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f2484f;

    public n(r rVar, d2 d2Var, int i5, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2484f = rVar;
        this.f2479a = d2Var;
        this.f2480b = i5;
        this.f2481c = view;
        this.f2482d = i10;
        this.f2483e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i5 = this.f2480b;
        View view = this.f2481c;
        if (i5 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2482d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2483e.setListener(null);
        r rVar = this.f2484f;
        d2 d2Var = this.f2479a;
        rVar.c(d2Var);
        rVar.f2532p.remove(d2Var);
        rVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2484f.getClass();
    }
}
