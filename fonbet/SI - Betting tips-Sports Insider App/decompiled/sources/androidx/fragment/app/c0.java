package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f1880a;

    public c0(Fragment fragment) {
        this.f1880a = fragment;
    }

    @Override // androidx.fragment.app.j0
    public final void a() {
        Fragment fragment = this.f1880a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.d1.e(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
