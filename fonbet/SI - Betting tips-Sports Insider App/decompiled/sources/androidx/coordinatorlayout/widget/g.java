package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1245a;

    public g(CoordinatorLayout coordinatorLayout) {
        this.f1245a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f1245a.onChildViewsChanged(0);
        return true;
    }
}
