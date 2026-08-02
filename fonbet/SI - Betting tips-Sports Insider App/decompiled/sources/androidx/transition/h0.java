package androidx.transition;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2703a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f2704b;

    public /* synthetic */ h0() {
        this.f2703a = 1;
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public void onTransitionCancel(a0 a0Var) {
        switch (this.f2703a) {
            case 0:
                i0 i0Var = (i0) this.f2704b;
                i0Var.f2709a.remove(a0Var);
                if (!i0Var.hasAnimators()) {
                    i0Var.notifyListeners(z.O, false);
                    i0Var.mEnded = true;
                    i0Var.notifyListeners(z.N, false);
                    break;
                }
                break;
        }
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public void onTransitionEnd(a0 a0Var) {
        switch (this.f2703a) {
            case 1:
                i0 i0Var = (i0) this.f2704b;
                int i5 = i0Var.f2711c - 1;
                i0Var.f2711c = i5;
                if (i5 == 0) {
                    i0Var.f2712d = false;
                    i0Var.end();
                }
                a0Var.removeListener(this);
                break;
            case 2:
                this.f2704b.runAnimators();
                a0Var.removeListener(this);
                break;
        }
    }

    @Override // androidx.transition.b0, androidx.transition.y
    public void onTransitionStart(a0 a0Var) {
        switch (this.f2703a) {
            case 1:
                i0 i0Var = (i0) this.f2704b;
                if (!i0Var.f2712d) {
                    i0Var.start();
                    i0Var.f2712d = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h0(a0 a0Var, int i5) {
        this.f2703a = i5;
        this.f2704b = a0Var;
    }
}
