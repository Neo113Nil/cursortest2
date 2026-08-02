package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements y {

    /* renamed from: a, reason: collision with root package name */
    public final View f2701a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2702b = false;

    public g(View view) {
        this.f2701a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        p0.f2736a.z(this.f2701a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f2701a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f2702b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        throw null;
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var, boolean z5) {
    }

    @Override // androidx.transition.y
    public final void onTransitionPause(a0 a0Var) {
        View view = this.f2701a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? p0.f2736a.s(view) : 0.0f));
    }

    @Override // androidx.transition.y
    public final void onTransitionResume(a0 a0Var) {
        this.f2701a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var) {
        throw null;
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var, boolean z5) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        boolean z7 = this.f2702b;
        View view = this.f2701a;
        if (z7) {
            view.setLayerType(0, null);
        }
        if (z5) {
            return;
        }
        u0 u0Var = p0.f2736a;
        u0Var.z(view, 1.0f);
        u0Var.getClass();
    }

    @Override // androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
    }
}
