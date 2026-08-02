package androidx.transition;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f2727a;

    public m(Runnable runnable) {
        this.f2727a = runnable;
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        this.f2727a.run();
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var) {
        throw null;
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var, boolean z5) {
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var, boolean z5) {
        onTransitionEnd(a0Var);
    }

    @Override // androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public final void onTransitionPause(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public final void onTransitionResume(a0 a0Var) {
    }
}
