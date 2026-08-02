package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends AnimatorListenerAdapter implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2766a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2767b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2768c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2769d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f2770e;

    public x0(z0 z0Var, ViewGroup viewGroup, View view, View view2) {
        this.f2770e = z0Var;
        this.f2766a = viewGroup;
        this.f2767b = view;
        this.f2768c = view2;
    }

    public final void a() {
        this.f2768c.setTag(R.id.save_overlay_view, null);
        this.f2766a.getOverlay().remove(this.f2767b);
        this.f2769d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f2766a.getOverlay().remove(this.f2767b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2767b;
        if (view.getParent() == null) {
            this.f2766a.getOverlay().add(view);
        } else {
            this.f2770e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            View view = this.f2768c;
            View view2 = this.f2767b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f2766a.getOverlay().add(view2);
            this.f2769d = true;
        }
    }

    @Override // androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
        if (this.f2769d) {
            a();
        }
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        a0Var.removeListener(this);
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
        if (z5) {
            return;
        }
        a();
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var, boolean z5) {
        a0Var.removeListener(this);
    }

    @Override // androidx.transition.y
    public final void onTransitionPause(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public final void onTransitionResume(a0 a0Var) {
    }
}
