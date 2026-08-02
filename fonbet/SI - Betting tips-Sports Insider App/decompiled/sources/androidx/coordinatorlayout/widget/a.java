package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.view.k2;
import androidx.core.view.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1227a;

    public a(CoordinatorLayout coordinatorLayout) {
        this.f1227a = coordinatorLayout;
    }

    @Override // androidx.core.view.x
    public final k2 onApplyWindowInsets(View view, k2 k2Var) {
        return this.f1227a.setWindowInsets(k2Var);
    }
}
