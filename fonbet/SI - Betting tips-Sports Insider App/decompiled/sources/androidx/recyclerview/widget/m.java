package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2474a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f2475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2478e;

    public m(r rVar, d2 d2Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2478e = rVar;
        this.f2475b = d2Var;
        this.f2477d = viewPropertyAnimator;
        this.f2476c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2474a) {
            case 1:
                this.f2476c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2474a) {
            case 0:
                this.f2477d.setListener(null);
                this.f2476c.setAlpha(1.0f);
                r rVar = this.f2478e;
                d2 d2Var = this.f2475b;
                rVar.c(d2Var);
                rVar.q.remove(d2Var);
                rVar.i();
                break;
            default:
                this.f2477d.setListener(null);
                r rVar2 = this.f2478e;
                d2 d2Var2 = this.f2475b;
                rVar2.c(d2Var2);
                rVar2.f2531o.remove(d2Var2);
                rVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2474a) {
            case 0:
                this.f2478e.getClass();
                break;
            default:
                this.f2478e.getClass();
                break;
        }
    }

    public m(r rVar, d2 d2Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2478e = rVar;
        this.f2475b = d2Var;
        this.f2476c = view;
        this.f2477d = viewPropertyAnimator;
    }
}
