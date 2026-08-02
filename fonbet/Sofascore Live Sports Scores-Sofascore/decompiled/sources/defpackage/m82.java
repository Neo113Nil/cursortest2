package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m82 implements krk {
    public final CoordinatorLayout a;
    public final RecyclerView b;
    public final SwipeRefreshLayout c;
    public final z3f d;

    public m82(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, z3f z3fVar) {
        this.a = coordinatorLayout;
        this.b = recyclerView;
        this.c = swipeRefreshLayout;
        this.d = z3fVar;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
