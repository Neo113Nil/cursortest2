package androidx.transition;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2681a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2682b;

    public d(ViewGroup viewGroup) {
        this.f2682b = viewGroup;
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
        y4.a.D(this.f2682b, false);
        this.f2681a = true;
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        if (!this.f2681a) {
            y4.a.D(this.f2682b, false);
        }
        a0Var.removeListener(this);
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionPause(a0 a0Var) {
        y4.a.D(this.f2682b, false);
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public final void onTransitionResume(a0 a0Var) {
        y4.a.D(this.f2682b, true);
    }
}
