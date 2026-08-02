package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.e f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f2741b;

    public s(a0 a0Var, s.e eVar) {
        this.f2741b = a0Var;
        this.f2740a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2740a.remove(animator);
        this.f2741b.mCurrentAnimators.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2741b.mCurrentAnimators.add(animator);
    }
}
