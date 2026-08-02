package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f1887a;

    public d0(Fragment fragment) {
        this.f1887a = fragment;
    }

    @Override // androidx.fragment.app.s0
    public final View e(int i5) {
        Fragment fragment = this.f1887a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i5);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.s0
    public final boolean k() {
        return this.f1887a.mView != null;
    }
}
