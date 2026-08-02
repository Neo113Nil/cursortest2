package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f2093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f2094b;

    public u0(v0 v0Var, p1 p1Var) {
        this.f2094b = v0Var;
        this.f2093a = p1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p1 p1Var = this.f2093a;
        Fragment fragment = p1Var.f2041c;
        p1Var.k();
        k2.j((ViewGroup) fragment.mView.getParent(), this.f2094b.f2098a).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
