package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 implements androidx.lifecycle.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f1896a;

    public e0(Fragment fragment) {
        this.f1896a = fragment;
    }

    @Override // androidx.lifecycle.c0
    public final void c(androidx.lifecycle.e0 e0Var, androidx.lifecycle.w wVar) {
        View view;
        if (wVar != androidx.lifecycle.w.ON_STOP || (view = this.f1896a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
