package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f2493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2496e;

    public /* synthetic */ o(r rVar, p pVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i5) {
        this.f2492a = i5;
        this.f2496e = rVar;
        this.f2493b = pVar;
        this.f2494c = viewPropertyAnimator;
        this.f2495d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2492a) {
            case 0:
                this.f2494c.setListener(null);
                View view = this.f2495d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                p pVar = this.f2493b;
                d2 d2Var = pVar.f2502a;
                r rVar = this.f2496e;
                rVar.c(d2Var);
                rVar.f2533r.remove(pVar.f2502a);
                rVar.i();
                break;
            default:
                this.f2494c.setListener(null);
                View view2 = this.f2495d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                p pVar2 = this.f2493b;
                d2 d2Var2 = pVar2.f2503b;
                r rVar2 = this.f2496e;
                rVar2.c(d2Var2);
                rVar2.f2533r.remove(pVar2.f2503b);
                rVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2492a) {
            case 0:
                d2 d2Var = this.f2493b.f2502a;
                this.f2496e.getClass();
                break;
            default:
                d2 d2Var2 = this.f2493b.f2503b;
                this.f2496e.getClass();
                break;
        }
    }
}
