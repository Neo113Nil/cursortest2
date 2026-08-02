package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends AnimatorListenerAdapter implements y {

    /* renamed from: a, reason: collision with root package name */
    public final View f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2755c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2757e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2758f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2756d = true;

    public w0(int i5, View view) {
        this.f2753a = view;
        this.f2754b = i5;
        this.f2755c = (ViewGroup) view.getParent();
        a(true);
    }

    public final void a(boolean z5) {
        ViewGroup viewGroup;
        if (!this.f2756d || this.f2757e == z5 || (viewGroup = this.f2755c) == null) {
            return;
        }
        this.f2757e = z5;
        y4.a.D(viewGroup, z5);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2758f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2758f) {
            p0.b(this.f2753a, this.f2754b);
            ViewGroup viewGroup = this.f2755c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        a0Var.removeListener(this);
    }

    @Override // androidx.transition.y
    public final void onTransitionPause(a0 a0Var) {
        a(false);
        if (this.f2758f) {
            return;
        }
        p0.b(this.f2753a, this.f2754b);
    }

    @Override // androidx.transition.y
    public final void onTransitionResume(a0 a0Var) {
        a(true);
        if (this.f2758f) {
            return;
        }
        p0.b(this.f2753a, 0);
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var) {
        throw null;
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var, boolean z5) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            p0.b(this.f2753a, 0);
            ViewGroup viewGroup = this.f2755c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var, boolean z5) {
        a0Var.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        if (!this.f2758f) {
            p0.b(this.f2753a, this.f2754b);
            ViewGroup viewGroup = this.f2755c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
    }
}
